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
import org.openapitools.client.model.CoreCalendarDeleteSubscription200Response;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest;
import org.openapitools.client.model.ModH5pactivityGetAttempts200Response;
import org.openapitools.client.model.ModH5pactivityGetAttemptsRequest;
import org.openapitools.client.model.ModH5pactivityGetH5pactivitiesByCourses200Response;
import org.openapitools.client.model.ModH5pactivityGetH5pactivityAccessInformation200Response;
import org.openapitools.client.model.ModH5pactivityGetH5pactivityAccessInformationRequest;
import org.openapitools.client.model.ModH5pactivityGetResults200Response;
import org.openapitools.client.model.ModH5pactivityGetResultsRequest;
import org.openapitools.client.model.ModH5pactivityGetUserAttempts200Response;
import org.openapitools.client.model.ModH5pactivityGetUserAttemptsRequest;
import org.openapitools.client.model.ModH5pactivityLogReportViewedRequest;
import org.openapitools.client.model.ModH5pactivityViewH5pactivityRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModH5pactivityApi
 */
@Disabled
public class ModH5pactivityApiTest {

    private final ModH5pactivityApi api = new ModH5pactivityApi();

    /**
     * Return the information needed to list a user attempts.
     *
     * Return the information needed to list a user attempts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modH5pactivityGetAttemptsTest() throws ApiException {
        ModH5pactivityGetAttemptsRequest modH5pactivityGetAttemptsRequest = null;
        ModH5pactivityGetAttempts200Response response = api.modH5pactivityGetAttempts(modH5pactivityGetAttemptsRequest);
        // TODO: test validations
    }

    /**
     * Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.
     *
     * Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modH5pactivityGetH5pactivitiesByCoursesTest() throws ApiException {
        ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = null;
        ModH5pactivityGetH5pactivitiesByCourses200Response response = api.modH5pactivityGetH5pactivitiesByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
        // TODO: test validations
    }

    /**
     * Return access information for a given h5p activity.
     *
     * Return access information for a given h5p activity.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modH5pactivityGetH5pactivityAccessInformationTest() throws ApiException {
        ModH5pactivityGetH5pactivityAccessInformationRequest modH5pactivityGetH5pactivityAccessInformationRequest = null;
        ModH5pactivityGetH5pactivityAccessInformation200Response response = api.modH5pactivityGetH5pactivityAccessInformation(modH5pactivityGetH5pactivityAccessInformationRequest);
        // TODO: test validations
    }

    /**
     * Return the information needed to list a user attempt results.
     *
     * Return the information needed to list a user attempt results.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modH5pactivityGetResultsTest() throws ApiException {
        ModH5pactivityGetResultsRequest modH5pactivityGetResultsRequest = null;
        ModH5pactivityGetResults200Response response = api.modH5pactivityGetResults(modH5pactivityGetResultsRequest);
        // TODO: test validations
    }

    /**
     * Return the information needed to list all enrolled user attempts.
     *
     * Return the information needed to list all enrolled user attempts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modH5pactivityGetUserAttemptsTest() throws ApiException {
        ModH5pactivityGetUserAttemptsRequest modH5pactivityGetUserAttemptsRequest = null;
        ModH5pactivityGetUserAttempts200Response response = api.modH5pactivityGetUserAttempts(modH5pactivityGetUserAttemptsRequest);
        // TODO: test validations
    }

    /**
     * Log that the h5pactivity was viewed.
     *
     * Log that the h5pactivity was viewed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modH5pactivityLogReportViewedTest() throws ApiException {
        ModH5pactivityLogReportViewedRequest modH5pactivityLogReportViewedRequest = null;
        CoreCalendarDeleteSubscription200Response response = api.modH5pactivityLogReportViewed(modH5pactivityLogReportViewedRequest);
        // TODO: test validations
    }

    /**
     * Trigger the course module viewed event and update the module completion status.
     *
     * Trigger the course module viewed event and update the module completion status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modH5pactivityViewH5pactivityTest() throws ApiException {
        ModH5pactivityViewH5pactivityRequest modH5pactivityViewH5pactivityRequest = null;
        CoreCalendarDeleteSubscription200Response response = api.modH5pactivityViewH5pactivity(modH5pactivityViewH5pactivityRequest);
        // TODO: test validations
    }

}
