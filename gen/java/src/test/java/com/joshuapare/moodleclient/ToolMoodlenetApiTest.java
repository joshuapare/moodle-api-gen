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
import org.openapitools.client.model.ToolMoodlenetSearchCourses200Response;
import org.openapitools.client.model.ToolMoodlenetSearchCoursesRequest;
import org.openapitools.client.model.ToolMoodlenetVerifyWebfinger200Response;
import org.openapitools.client.model.ToolMoodlenetVerifyWebfingerRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ToolMoodlenetApi
 */
@Disabled
public class ToolMoodlenetApiTest {

    private final ToolMoodlenetApi api = new ToolMoodlenetApi();

    /**
     * For some given input search for a course that matches
     *
     * For some given input search for a course that matches
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolMoodlenetSearchCoursesTest() throws ApiException {
        ToolMoodlenetSearchCoursesRequest toolMoodlenetSearchCoursesRequest = null;
        ToolMoodlenetSearchCourses200Response response = api.toolMoodlenetSearchCourses(toolMoodlenetSearchCoursesRequest);
        // TODO: test validations
    }

    /**
     * Verify if the passed information resolves into a WebFinger profile URL
     *
     * Verify if the passed information resolves into a WebFinger profile URL
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolMoodlenetVerifyWebfingerTest() throws ApiException {
        ToolMoodlenetVerifyWebfingerRequest toolMoodlenetVerifyWebfingerRequest = null;
        ToolMoodlenetVerifyWebfinger200Response response = api.toolMoodlenetVerifyWebfinger(toolMoodlenetVerifyWebfingerRequest);
        // TODO: test validations
    }

}
