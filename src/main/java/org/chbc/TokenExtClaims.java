package org.chbc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.chbc.models.IdentityInfo;

import java.util.ArrayList;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenExtClaims {

    @JsonProperty("principal")
    private IdentityInfo principal;

    @JsonProperty("federatedAssertions")
    private Map<String, ArrayList<IdentityInfo>> federatedAssertions;


    public IdentityInfo getPrincipal() {
        return principal;
    }

    public void setPrincipal(IdentityInfo principal) {
        this.principal = principal;
    }

    public Map<String, ArrayList<IdentityInfo>> getFederatedAssertions() {
        return federatedAssertions;
    }

    public void setFederatedAssertions(Map<String, ArrayList<IdentityInfo>> federatedAssertions) {
        this.federatedAssertions = federatedAssertions;
    }

    public boolean isNull() {
        return (this.principal == null && this.federatedAssertions == null);
    }
    public boolean isAPIAccount() {
        return this.principal.getViamId() == null;
    }

    public boolean isServiceAccount(){
        return this.principal.getViamId().getServiceToken() != null;
    }

    public boolean isCustomerUserAccount(){
        return this.principal.getViamId().getServiceToken() == null;
    }

    public TokenExtClaims() {}
}

