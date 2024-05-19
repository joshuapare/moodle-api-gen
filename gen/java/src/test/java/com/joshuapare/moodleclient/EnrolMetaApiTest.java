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
import org.openapitools.client.model.EnrolMetaAddInstancesRequest;
import org.openapitools.client.model.EnrolMetaDeleteInstancesRequest;
import org.openapitools.client.model.ErrorResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnrolMetaApi
 */
@Disabled
public class EnrolMetaApiTest {

    private final EnrolMetaApi api = new EnrolMetaApi();

    /**
     * Add meta enrolment instances
     *
     * Add meta enrolment instances
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enrolMetaAddInstancesTest() throws ApiException {
        EnrolMetaAddInstancesRequest enrolMetaAddInstancesRequest = null;
        Object response = api.enrolMetaAddInstances(enrolMetaAddInstancesRequest);
        // TODO: test validations
    }

    /**
     * Delete meta enrolment instances
     *
     * Delete meta enrolment instances
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enrolMetaDeleteInstancesTest() throws ApiException {
        EnrolMetaDeleteInstancesRequest enrolMetaDeleteInstancesRequest = null;
        Object response = api.enrolMetaDeleteInstances(enrolMetaDeleteInstancesRequest);
        // TODO: test validations
    }

}
