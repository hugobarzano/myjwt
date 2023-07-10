package org.chbc;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.security.core.context.SecurityContext;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Base64;

public class PrincipalFilter extends OncePerRequestFilter {
    String VONAGE_ACCESS_TOKEN_HEADER = "X-Vonage-Access-Token";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authorizationHeader = request.getHeader(VONAGE_ACCESS_TOKEN_HEADER);
        String accessToken = getAccessToken(authorizationHeader);
        if (accessToken != null) {
            DecodedJWT jwt =  JWT.decode(accessToken);
            TokenExtClaims extClaims =  new ObjectMapper().readValue(decodeSegment(jwt.getPayload()), TokenExtClaims.class);
            request.setAttribute("NEW_NEXMO",extClaims);
        }
        filterChain.doFilter(request, response);
    }

    private  String getAccessToken(String header){
        if ( header == null) return null;
        String[] parts = header.split("Bearer ");
        if (parts.length != 2) return null;
        return parts[1];
    }

    public static String decodeSegment(String segment) {
        byte[] decodedBytes = Base64.getUrlDecoder().decode(segment);
        return new String(decodedBytes);
    }
}