package org.chbc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.ArrayList;
import java.util.Map;

@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IdentityInfo {

    private String apiKey;
    private String applicationId;
    private String masterAccountId;
    private ArrayList<String> capabilities;
    private Map<String,Object> extraConfig;

    private ArrayList<String>  servicePath;
    @JsonProperty("viamId")
    private ViamId viamId;

    public IdentityInfo() {
    }

    public IdentityInfo(String apiKey, String applicationId, String masterAccountId) {
        this.apiKey = apiKey;
        this.applicationId = applicationId;
        this.masterAccountId = masterAccountId;;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getMasterAccountId() {
        return masterAccountId;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public void setMasterAccountId(String masterAccountId) {
        this.masterAccountId = masterAccountId;
    }
    public ArrayList<String> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(ArrayList<String> capabilities) {
        this.capabilities = capabilities;
    }

    public Map<String, Object> getExtraConfig() {
        return extraConfig;
    }

    public void setExtraConfig(Map<String, Object> extraConfig) {
        this.extraConfig = extraConfig;
    }

    public ArrayList<String> getServicePath() {
        return servicePath;
    }

    public void setServicePath(ArrayList<String> servicePath) {
        this.servicePath = servicePath;
    }

    public ViamId getViamId() {
        return viamId;
    }

    public void setViamId(ViamId viamId) {
        this.viamId = viamId;
    }

    public String getMasterApiKey() {
        if (getMasterAccountId()!=null) return getMasterAccountId();
        return getApiKey();
    }

    public Map<String, String> getNexmoParams(Map<String, String> params) {
        if (getApplicationId() != null) params.put("application",getApplicationId());
        if (getApiKey() != null) params.put("apikey",getApiKey());
        return params;
    }

}
