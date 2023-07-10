package org.chbc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ViamId {

    @JsonProperty("email")
    private String email;

    @JsonProperty("given_name")
    private String firstName;

    @JsonProperty("family_name")
    private String lastName;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("phone_number_country")
    private String phoneNumberCountry;

    @JsonProperty("authenticationMethods")
    private List<AuthenticationMethods> authenticationMethods;

    @JsonProperty("serviceToken")
    private ServiceToken serviceToken;

    public ViamId() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumberCountry() {
        return phoneNumberCountry;
    }

    public void setPhoneNumberCountry(String phoneNumberCountry) {
        this.phoneNumberCountry = phoneNumberCountry;
    }

    public List<AuthenticationMethods> getAuthenticationMethods() {
        return authenticationMethods;
    }

    public void setAuthenticationMethods(List<AuthenticationMethods> authenticationMethods) {
        this.authenticationMethods = authenticationMethods;
    }

    public ServiceToken getServiceToken() {
        return serviceToken;
    }

    public void setServiceToken(ServiceToken serviceToken) {
        this.serviceToken = serviceToken;
    }
}