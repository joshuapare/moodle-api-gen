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

import com.joshuapare.ApiCallback;
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.ApiResponse;
import com.joshuapare.Configuration;
import com.joshuapare.Pair;
import com.joshuapare.ProgressRequestBody;
import com.joshuapare.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.QbankColumnsortorderSetColumnSizeRequest;
import org.openapitools.client.model.QbankColumnsortorderSetColumnbankOrderRequest;
import org.openapitools.client.model.QbankColumnsortorderSetHiddenColumnsRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QbankColumnsortorderApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QbankColumnsortorderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public QbankColumnsortorderApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for qbankColumnsortorderSetColumnSize
     * @param qbankColumnsortorderSetColumnSizeRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call qbankColumnsortorderSetColumnSizeCall(QbankColumnsortorderSetColumnSizeRequest qbankColumnsortorderSetColumnSizeRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = qbankColumnsortorderSetColumnSizeRequest;

        // create path and map variables
        String localVarPath = "/qbank_columnsortorder_set_column_size";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call qbankColumnsortorderSetColumnSizeValidateBeforeCall(QbankColumnsortorderSetColumnSizeRequest qbankColumnsortorderSetColumnSizeRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'qbankColumnsortorderSetColumnSizeRequest' is set
        if (qbankColumnsortorderSetColumnSizeRequest == null) {
            throw new ApiException("Missing the required parameter 'qbankColumnsortorderSetColumnSizeRequest' when calling qbankColumnsortorderSetColumnSize(Async)");
        }

        return qbankColumnsortorderSetColumnSizeCall(qbankColumnsortorderSetColumnSizeRequest, _callback);

    }

    /**
     * Column size
     * Column size
     * @param qbankColumnsortorderSetColumnSizeRequest  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public Object qbankColumnsortorderSetColumnSize(QbankColumnsortorderSetColumnSizeRequest qbankColumnsortorderSetColumnSizeRequest) throws ApiException {
        ApiResponse<Object> localVarResp = qbankColumnsortorderSetColumnSizeWithHttpInfo(qbankColumnsortorderSetColumnSizeRequest);
        return localVarResp.getData();
    }

    /**
     * Column size
     * Column size
     * @param qbankColumnsortorderSetColumnSizeRequest  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> qbankColumnsortorderSetColumnSizeWithHttpInfo(QbankColumnsortorderSetColumnSizeRequest qbankColumnsortorderSetColumnSizeRequest) throws ApiException {
        okhttp3.Call localVarCall = qbankColumnsortorderSetColumnSizeValidateBeforeCall(qbankColumnsortorderSetColumnSizeRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Column size (asynchronously)
     * Column size
     * @param qbankColumnsortorderSetColumnSizeRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call qbankColumnsortorderSetColumnSizeAsync(QbankColumnsortorderSetColumnSizeRequest qbankColumnsortorderSetColumnSizeRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = qbankColumnsortorderSetColumnSizeValidateBeforeCall(qbankColumnsortorderSetColumnSizeRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for qbankColumnsortorderSetColumnbankOrder
     * @param qbankColumnsortorderSetColumnbankOrderRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call qbankColumnsortorderSetColumnbankOrderCall(QbankColumnsortorderSetColumnbankOrderRequest qbankColumnsortorderSetColumnbankOrderRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = qbankColumnsortorderSetColumnbankOrderRequest;

        // create path and map variables
        String localVarPath = "/qbank_columnsortorder_set_columnbank_order";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call qbankColumnsortorderSetColumnbankOrderValidateBeforeCall(QbankColumnsortorderSetColumnbankOrderRequest qbankColumnsortorderSetColumnbankOrderRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'qbankColumnsortorderSetColumnbankOrderRequest' is set
        if (qbankColumnsortorderSetColumnbankOrderRequest == null) {
            throw new ApiException("Missing the required parameter 'qbankColumnsortorderSetColumnbankOrderRequest' when calling qbankColumnsortorderSetColumnbankOrder(Async)");
        }

        return qbankColumnsortorderSetColumnbankOrderCall(qbankColumnsortorderSetColumnbankOrderRequest, _callback);

    }

    /**
     * Sets question columns order in database
     * Sets question columns order in database
     * @param qbankColumnsortorderSetColumnbankOrderRequest  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public Object qbankColumnsortorderSetColumnbankOrder(QbankColumnsortorderSetColumnbankOrderRequest qbankColumnsortorderSetColumnbankOrderRequest) throws ApiException {
        ApiResponse<Object> localVarResp = qbankColumnsortorderSetColumnbankOrderWithHttpInfo(qbankColumnsortorderSetColumnbankOrderRequest);
        return localVarResp.getData();
    }

    /**
     * Sets question columns order in database
     * Sets question columns order in database
     * @param qbankColumnsortorderSetColumnbankOrderRequest  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> qbankColumnsortorderSetColumnbankOrderWithHttpInfo(QbankColumnsortorderSetColumnbankOrderRequest qbankColumnsortorderSetColumnbankOrderRequest) throws ApiException {
        okhttp3.Call localVarCall = qbankColumnsortorderSetColumnbankOrderValidateBeforeCall(qbankColumnsortorderSetColumnbankOrderRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Sets question columns order in database (asynchronously)
     * Sets question columns order in database
     * @param qbankColumnsortorderSetColumnbankOrderRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call qbankColumnsortorderSetColumnbankOrderAsync(QbankColumnsortorderSetColumnbankOrderRequest qbankColumnsortorderSetColumnbankOrderRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = qbankColumnsortorderSetColumnbankOrderValidateBeforeCall(qbankColumnsortorderSetColumnbankOrderRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for qbankColumnsortorderSetHiddenColumns
     * @param qbankColumnsortorderSetHiddenColumnsRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call qbankColumnsortorderSetHiddenColumnsCall(QbankColumnsortorderSetHiddenColumnsRequest qbankColumnsortorderSetHiddenColumnsRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = qbankColumnsortorderSetHiddenColumnsRequest;

        // create path and map variables
        String localVarPath = "/qbank_columnsortorder_set_hidden_columns";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call qbankColumnsortorderSetHiddenColumnsValidateBeforeCall(QbankColumnsortorderSetHiddenColumnsRequest qbankColumnsortorderSetHiddenColumnsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'qbankColumnsortorderSetHiddenColumnsRequest' is set
        if (qbankColumnsortorderSetHiddenColumnsRequest == null) {
            throw new ApiException("Missing the required parameter 'qbankColumnsortorderSetHiddenColumnsRequest' when calling qbankColumnsortorderSetHiddenColumns(Async)");
        }

        return qbankColumnsortorderSetHiddenColumnsCall(qbankColumnsortorderSetHiddenColumnsRequest, _callback);

    }

    /**
     * Hidden Columns
     * Hidden Columns
     * @param qbankColumnsortorderSetHiddenColumnsRequest  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public Object qbankColumnsortorderSetHiddenColumns(QbankColumnsortorderSetHiddenColumnsRequest qbankColumnsortorderSetHiddenColumnsRequest) throws ApiException {
        ApiResponse<Object> localVarResp = qbankColumnsortorderSetHiddenColumnsWithHttpInfo(qbankColumnsortorderSetHiddenColumnsRequest);
        return localVarResp.getData();
    }

    /**
     * Hidden Columns
     * Hidden Columns
     * @param qbankColumnsortorderSetHiddenColumnsRequest  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> qbankColumnsortorderSetHiddenColumnsWithHttpInfo(QbankColumnsortorderSetHiddenColumnsRequest qbankColumnsortorderSetHiddenColumnsRequest) throws ApiException {
        okhttp3.Call localVarCall = qbankColumnsortorderSetHiddenColumnsValidateBeforeCall(qbankColumnsortorderSetHiddenColumnsRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Hidden Columns (asynchronously)
     * Hidden Columns
     * @param qbankColumnsortorderSetHiddenColumnsRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call qbankColumnsortorderSetHiddenColumnsAsync(QbankColumnsortorderSetHiddenColumnsRequest qbankColumnsortorderSetHiddenColumnsRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = qbankColumnsortorderSetHiddenColumnsValidateBeforeCall(qbankColumnsortorderSetHiddenColumnsRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
