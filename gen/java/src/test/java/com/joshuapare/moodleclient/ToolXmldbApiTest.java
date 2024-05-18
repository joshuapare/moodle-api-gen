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
import org.openapitools.client.model.ToolXmldbInvokeMoveActionRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ToolXmldbApi
 */
@Disabled
public class ToolXmldbApiTest {

    private final ToolXmldbApi api = new ToolXmldbApi();

    /**
     * moves element up/down
     *
     * moves element up/down
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolXmldbInvokeMoveActionTest() throws ApiException {
        ToolXmldbInvokeMoveActionRequest toolXmldbInvokeMoveActionRequest = null;
        Object response = api.toolXmldbInvokeMoveAction(toolXmldbInvokeMoveActionRequest);
        // TODO: test validations
    }

}
