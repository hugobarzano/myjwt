package org.chbc;

import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.filter.AbstractRequestLoggingFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestLoggingFilter extends OncePerRequestFilter {

    private final AbstractRequestLoggingFilter loggingFilter;

    public RequestLoggingFilter() {
        this.loggingFilter = new AbstractRequestLoggingFilter() {
            @Override
            protected void beforeRequest(HttpServletRequest request, String message) {
                logger.debug(message);
            }

            @Override
            protected void afterRequest(HttpServletRequest request, String message) {
                logger.debug(message);
            }
        };
        loggingFilter.setIncludeQueryString(true);
        loggingFilter.setIncludePayload(true);
        loggingFilter.setMaxPayloadLength(10000);
        loggingFilter.setIncludeHeaders(false);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
       System.out.println(request.getMethod());
        System.out.println(request.getHeaderNames());
        loggingFilter.doFilter(request, response, filterChain);
    }
}
