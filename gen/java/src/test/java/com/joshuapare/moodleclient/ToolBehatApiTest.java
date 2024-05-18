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
import org.openapitools.client.model.ToolBehatGetEntityGenerator200Response;
import org.openapitools.client.model.ToolBehatGetEntityGeneratorRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ToolBehatApi
 */
@Disabled
public class ToolBehatApiTest {

    private final ToolBehatApi api = new ToolBehatApi();

    /**
     * Get the generator details for an entity
     *
     * Get the generator details for an entity
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolBehatGetEntityGeneratorTest() throws ApiException {
        ToolBehatGetEntityGeneratorRequest toolBehatGetEntityGeneratorRequest = null;
        ToolBehatGetEntityGenerator200Response response = api.toolBehatGetEntityGenerator(toolBehatGetEntityGeneratorRequest);
        // TODO: test validations
    }

}