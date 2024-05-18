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
import org.openapitools.client.model.EnrolLicenseEnrolUser200Response;
import org.openapitools.client.model.EnrolLicenseEnrolUserRequest;
import org.openapitools.client.model.EnrolLicenseGetInstanceInfo200Response;
import org.openapitools.client.model.EnrolLicenseGetInstanceInfoRequest;
import org.openapitools.client.model.ErrorResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnrolLicenseApi
 */
@Disabled
public class EnrolLicenseApiTest {

    private final EnrolLicenseApi api = new EnrolLicenseApi();

    /**
     * License enrol the current user in the given course.
     *
     * License enrol the current user in the given course.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enrolLicenseEnrolUserTest() throws ApiException {
        EnrolLicenseEnrolUserRequest enrolLicenseEnrolUserRequest = null;
        EnrolLicenseEnrolUser200Response response = api.enrolLicenseEnrolUser(enrolLicenseEnrolUserRequest);
        // TODO: test validations
    }

    /**
     * License enrolment instance information.
     *
     * License enrolment instance information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enrolLicenseGetInstanceInfoTest() throws ApiException {
        EnrolLicenseGetInstanceInfoRequest enrolLicenseGetInstanceInfoRequest = null;
        EnrolLicenseGetInstanceInfo200Response response = api.enrolLicenseGetInstanceInfo(enrolLicenseGetInstanceInfoRequest);
        // TODO: test validations
    }

}