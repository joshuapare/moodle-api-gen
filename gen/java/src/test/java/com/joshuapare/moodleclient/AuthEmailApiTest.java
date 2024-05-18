/*
 * Moodle Webservice API
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.joshuapare.moodleclient;

import com.joshuapare.ApiException;
import org.openapitools.client.model.AuthEmailGetSignupSettings200Response;
import org.openapitools.client.model.AuthEmailSignupUser200Response;
import org.openapitools.client.model.AuthEmailSignupUserRequest;
import org.openapitools.client.model.ErrorResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthEmailApi
 */
@Disabled
public class AuthEmailApiTest {

    private final AuthEmailApi api = new AuthEmailApi();

    /**
     * Get the signup required settings and profile fields.
     *
     * Get the signup required settings and profile fields.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authEmailGetSignupSettingsTest() throws ApiException {
        AuthEmailGetSignupSettings200Response response = api.authEmailGetSignupSettings();
        // TODO: test validations
    }

    /**
     * Adds a new user (pendingto be confirmed) in the site.
     *
     * Adds a new user (pendingto be confirmed) in the site.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authEmailSignupUserTest() throws ApiException {
        AuthEmailSignupUserRequest authEmailSignupUserRequest = null;
        AuthEmailSignupUser200Response response = api.authEmailSignupUser(authEmailSignupUserRequest);
        // TODO: test validations
    }

}