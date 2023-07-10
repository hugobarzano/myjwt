package org.chbc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceToken {
    @JsonProperty("active")
    private boolean active;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("sub")
    private String sub;
    @JsonProperty("exp")
    private int exp;
    @JsonProperty("iat")
    private int iat;
    @JsonProperty("nbf")
    private int nbf;
    @JsonProperty("aud")
    private String[] aud;
    @JsonProperty("iss")
    private String iss;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("token_use")
    private String tokenUse;

    public ServiceToken() {
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getIat() {
        return iat;
    }

    public void setIat(int iat) {
        this.iat = iat;
    }

    public int getNbf() {
        return nbf;
    }

    public void setNbf(int nbf) {
        this.nbf = nbf;
    }

    public String[] getAud() {
        return aud;
    }

    public void setAud(String[] aud) {
        this.aud = aud;
    }

    public String getIss() {
        return iss;
    }

    public void setIss(String iss) {
        this.iss = iss;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getTokenUse() {
        return tokenUse;
    }

    public void setTokenUse(String tokenUse) {
        this.tokenUse = tokenUse;
    }
}

