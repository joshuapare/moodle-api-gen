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
import org.openapitools.client.model.ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest;
import org.openapitools.client.model.ModLabelGetLabelsByCourses200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModLabelApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ModLabelApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ModLabelApi(ApiClient apiClient) {
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
     * Build call for modLabelGetLabelsByCourses
     * @param modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest  (required)
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
    public okhttp3.Call modLabelGetLabelsByCoursesCall(ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest;

        // create path and map variables
        String localVarPath = "/mod_label_get_labels_by_courses";

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
    private okhttp3.Call modLabelGetLabelsByCoursesValidateBeforeCall(ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest' is set
        if (modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest == null) {
            throw new ApiException("Missing the required parameter 'modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest' when calling modLabelGetLabelsByCourses(Async)");
        }

        return modLabelGetLabelsByCoursesCall(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, _callback);

    }

    /**
     * Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.
     * Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.
     * @param modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest  (required)
     * @return ModLabelGetLabelsByCourses200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ModLabelGetLabelsByCourses200Response modLabelGetLabelsByCourses(ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest) throws ApiException {
        ApiResponse<ModLabelGetLabelsByCourses200Response> localVarResp = modLabelGetLabelsByCoursesWithHttpInfo(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
        return localVarResp.getData();
    }

    /**
     * Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.
     * Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.
     * @param modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest  (required)
     * @return ApiResponse&lt;ModLabelGetLabelsByCourses200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ModLabelGetLabelsByCourses200Response> modLabelGetLabelsByCoursesWithHttpInfo(ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest) throws ApiException {
        okhttp3.Call localVarCall = modLabelGetLabelsByCoursesValidateBeforeCall(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, null);
        Type localVarReturnType = new TypeToken<ModLabelGetLabelsByCourses200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned. (asynchronously)
     * Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.
     * @param modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest  (required)
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
    public okhttp3.Call modLabelGetLabelsByCoursesAsync(ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, final ApiCallback<ModLabelGetLabelsByCourses200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = modLabelGetLabelsByCoursesValidateBeforeCall(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, _callback);
        Type localVarReturnType = new TypeToken<ModLabelGetLabelsByCourses200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
