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
import org.openapitools.client.model.QbankColumnsortorderSetColumnSizeRequest;
import org.openapitools.client.model.QbankColumnsortorderSetColumnbankOrderRequest;
import org.openapitools.client.model.QbankColumnsortorderSetHiddenColumnsRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QbankColumnsortorderApi
 */
@Disabled
public class QbankColumnsortorderApiTest {

    private final QbankColumnsortorderApi api = new QbankColumnsortorderApi();

    /**
     * Column size
     *
     * Column size
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qbankColumnsortorderSetColumnSizeTest() throws ApiException {
        QbankColumnsortorderSetColumnSizeRequest qbankColumnsortorderSetColumnSizeRequest = null;
        Object response = api.qbankColumnsortorderSetColumnSize(qbankColumnsortorderSetColumnSizeRequest);
        // TODO: test validations
    }

    /**
     * Sets question columns order in database
     *
     * Sets question columns order in database
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qbankColumnsortorderSetColumnbankOrderTest() throws ApiException {
        QbankColumnsortorderSetColumnbankOrderRequest qbankColumnsortorderSetColumnbankOrderRequest = null;
        Object response = api.qbankColumnsortorderSetColumnbankOrder(qbankColumnsortorderSetColumnbankOrderRequest);
        // TODO: test validations
    }

    /**
     * Hidden Columns
     *
     * Hidden Columns
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qbankColumnsortorderSetHiddenColumnsTest() throws ApiException {
        QbankColumnsortorderSetHiddenColumnsRequest qbankColumnsortorderSetHiddenColumnsRequest = null;
        Object response = api.qbankColumnsortorderSetHiddenColumns(qbankColumnsortorderSetHiddenColumnsRequest);
        // TODO: test validations
    }

}