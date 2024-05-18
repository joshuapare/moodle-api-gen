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
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ToolIomadpolicyGetIomadpolicyVersion200Response;
import org.openapitools.client.model.ToolIomadpolicyGetIomadpolicyVersionRequest;
import org.openapitools.client.model.ToolIomadpolicySubmitAcceptOnBehalfRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ToolIomadpolicyApi
 */
@Disabled
public class ToolIomadpolicyApiTest {

    private final ToolIomadpolicyApi api = new ToolIomadpolicyApi();

    /**
     * Fetch the details of a iomadpolicy version
     *
     * Fetch the details of a iomadpolicy version
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolIomadpolicyGetIomadpolicyVersionTest() throws ApiException {
        ToolIomadpolicyGetIomadpolicyVersionRequest toolIomadpolicyGetIomadpolicyVersionRequest = null;
        ToolIomadpolicyGetIomadpolicyVersion200Response response = api.toolIomadpolicyGetIomadpolicyVersion(toolIomadpolicyGetIomadpolicyVersionRequest);
        // TODO: test validations
    }

    /**
     * Accept policies on behalf of other users
     *
     * Accept policies on behalf of other users
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolIomadpolicySubmitAcceptOnBehalfTest() throws ApiException {
        ToolIomadpolicySubmitAcceptOnBehalfRequest toolIomadpolicySubmitAcceptOnBehalfRequest = null;
        Object response = api.toolIomadpolicySubmitAcceptOnBehalf(toolIomadpolicySubmitAcceptOnBehalfRequest);
        // TODO: test validations
    }

}
