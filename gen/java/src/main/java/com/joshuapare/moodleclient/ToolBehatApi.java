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
import org.openapitools.client.model.ToolBehatGetEntityGenerator200Response;
import org.openapitools.client.model.ToolBehatGetEntityGeneratorRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolBehatApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolBehatApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolBehatApi(ApiClient apiClient) {
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
     * Build call for toolBehatGetEntityGenerator
     * @param toolBehatGetEntityGeneratorRequest  (required)
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
    public okhttp3.Call toolBehatGetEntityGeneratorCall(ToolBehatGetEntityGeneratorRequest toolBehatGetEntityGeneratorRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = toolBehatGetEntityGeneratorRequest;

        // create path and map variables
        String localVarPath = "/tool_behat_get_entity_generator";

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
    private okhttp3.Call toolBehatGetEntityGeneratorValidateBeforeCall(ToolBehatGetEntityGeneratorRequest toolBehatGetEntityGeneratorRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'toolBehatGetEntityGeneratorRequest' is set
        if (toolBehatGetEntityGeneratorRequest == null) {
            throw new ApiException("Missing the required parameter 'toolBehatGetEntityGeneratorRequest' when calling toolBehatGetEntityGenerator(Async)");
        }

        return toolBehatGetEntityGeneratorCall(toolBehatGetEntityGeneratorRequest, _callback);

    }

    /**
     * Get the generator details for an entity
     * Get the generator details for an entity
     * @param toolBehatGetEntityGeneratorRequest  (required)
     * @return ToolBehatGetEntityGenerator200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ToolBehatGetEntityGenerator200Response toolBehatGetEntityGenerator(ToolBehatGetEntityGeneratorRequest toolBehatGetEntityGeneratorRequest) throws ApiException {
        ApiResponse<ToolBehatGetEntityGenerator200Response> localVarResp = toolBehatGetEntityGeneratorWithHttpInfo(toolBehatGetEntityGeneratorRequest);
        return localVarResp.getData();
    }

    /**
     * Get the generator details for an entity
     * Get the generator details for an entity
     * @param toolBehatGetEntityGeneratorRequest  (required)
     * @return ApiResponse&lt;ToolBehatGetEntityGenerator200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolBehatGetEntityGenerator200Response> toolBehatGetEntityGeneratorWithHttpInfo(ToolBehatGetEntityGeneratorRequest toolBehatGetEntityGeneratorRequest) throws ApiException {
        okhttp3.Call localVarCall = toolBehatGetEntityGeneratorValidateBeforeCall(toolBehatGetEntityGeneratorRequest, null);
        Type localVarReturnType = new TypeToken<ToolBehatGetEntityGenerator200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the generator details for an entity (asynchronously)
     * Get the generator details for an entity
     * @param toolBehatGetEntityGeneratorRequest  (required)
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
    public okhttp3.Call toolBehatGetEntityGeneratorAsync(ToolBehatGetEntityGeneratorRequest toolBehatGetEntityGeneratorRequest, final ApiCallback<ToolBehatGetEntityGenerator200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = toolBehatGetEntityGeneratorValidateBeforeCall(toolBehatGetEntityGeneratorRequest, _callback);
        Type localVarReturnType = new TypeToken<ToolBehatGetEntityGenerator200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}