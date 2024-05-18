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


import org.openapitools.client.model.EnrolSelfEnrolUser200Response;
import org.openapitools.client.model.EnrolSelfEnrolUserRequest;
import org.openapitools.client.model.EnrolSelfGetInstanceInfo200Response;
import org.openapitools.client.model.EnrolSelfGetInstanceInfoRequest;
import org.openapitools.client.model.ErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnrolSelfApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EnrolSelfApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EnrolSelfApi(ApiClient apiClient) {
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
     * Build call for enrolSelfEnrolUser
     * @param enrolSelfEnrolUserRequest  (required)
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
    public okhttp3.Call enrolSelfEnrolUserCall(EnrolSelfEnrolUserRequest enrolSelfEnrolUserRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = enrolSelfEnrolUserRequest;

        // create path and map variables
        String localVarPath = "/enrol_self_enrol_user";

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
    private okhttp3.Call enrolSelfEnrolUserValidateBeforeCall(EnrolSelfEnrolUserRequest enrolSelfEnrolUserRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'enrolSelfEnrolUserRequest' is set
        if (enrolSelfEnrolUserRequest == null) {
            throw new ApiException("Missing the required parameter 'enrolSelfEnrolUserRequest' when calling enrolSelfEnrolUser(Async)");
        }

        return enrolSelfEnrolUserCall(enrolSelfEnrolUserRequest, _callback);

    }

    /**
     * Self enrol the current user in the given course.
     * Self enrol the current user in the given course.
     * @param enrolSelfEnrolUserRequest  (required)
     * @return EnrolSelfEnrolUser200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public EnrolSelfEnrolUser200Response enrolSelfEnrolUser(EnrolSelfEnrolUserRequest enrolSelfEnrolUserRequest) throws ApiException {
        ApiResponse<EnrolSelfEnrolUser200Response> localVarResp = enrolSelfEnrolUserWithHttpInfo(enrolSelfEnrolUserRequest);
        return localVarResp.getData();
    }

    /**
     * Self enrol the current user in the given course.
     * Self enrol the current user in the given course.
     * @param enrolSelfEnrolUserRequest  (required)
     * @return ApiResponse&lt;EnrolSelfEnrolUser200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EnrolSelfEnrolUser200Response> enrolSelfEnrolUserWithHttpInfo(EnrolSelfEnrolUserRequest enrolSelfEnrolUserRequest) throws ApiException {
        okhttp3.Call localVarCall = enrolSelfEnrolUserValidateBeforeCall(enrolSelfEnrolUserRequest, null);
        Type localVarReturnType = new TypeToken<EnrolSelfEnrolUser200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Self enrol the current user in the given course. (asynchronously)
     * Self enrol the current user in the given course.
     * @param enrolSelfEnrolUserRequest  (required)
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
    public okhttp3.Call enrolSelfEnrolUserAsync(EnrolSelfEnrolUserRequest enrolSelfEnrolUserRequest, final ApiCallback<EnrolSelfEnrolUser200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = enrolSelfEnrolUserValidateBeforeCall(enrolSelfEnrolUserRequest, _callback);
        Type localVarReturnType = new TypeToken<EnrolSelfEnrolUser200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for enrolSelfGetInstanceInfo
     * @param enrolSelfGetInstanceInfoRequest  (required)
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
    public okhttp3.Call enrolSelfGetInstanceInfoCall(EnrolSelfGetInstanceInfoRequest enrolSelfGetInstanceInfoRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = enrolSelfGetInstanceInfoRequest;

        // create path and map variables
        String localVarPath = "/enrol_self_get_instance_info";

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
    private okhttp3.Call enrolSelfGetInstanceInfoValidateBeforeCall(EnrolSelfGetInstanceInfoRequest enrolSelfGetInstanceInfoRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'enrolSelfGetInstanceInfoRequest' is set
        if (enrolSelfGetInstanceInfoRequest == null) {
            throw new ApiException("Missing the required parameter 'enrolSelfGetInstanceInfoRequest' when calling enrolSelfGetInstanceInfo(Async)");
        }

        return enrolSelfGetInstanceInfoCall(enrolSelfGetInstanceInfoRequest, _callback);

    }

    /**
     * self enrolment instance information.
     * self enrolment instance information.
     * @param enrolSelfGetInstanceInfoRequest  (required)
     * @return EnrolSelfGetInstanceInfo200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public EnrolSelfGetInstanceInfo200Response enrolSelfGetInstanceInfo(EnrolSelfGetInstanceInfoRequest enrolSelfGetInstanceInfoRequest) throws ApiException {
        ApiResponse<EnrolSelfGetInstanceInfo200Response> localVarResp = enrolSelfGetInstanceInfoWithHttpInfo(enrolSelfGetInstanceInfoRequest);
        return localVarResp.getData();
    }

    /**
     * self enrolment instance information.
     * self enrolment instance information.
     * @param enrolSelfGetInstanceInfoRequest  (required)
     * @return ApiResponse&lt;EnrolSelfGetInstanceInfo200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EnrolSelfGetInstanceInfo200Response> enrolSelfGetInstanceInfoWithHttpInfo(EnrolSelfGetInstanceInfoRequest enrolSelfGetInstanceInfoRequest) throws ApiException {
        okhttp3.Call localVarCall = enrolSelfGetInstanceInfoValidateBeforeCall(enrolSelfGetInstanceInfoRequest, null);
        Type localVarReturnType = new TypeToken<EnrolSelfGetInstanceInfo200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * self enrolment instance information. (asynchronously)
     * self enrolment instance information.
     * @param enrolSelfGetInstanceInfoRequest  (required)
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
    public okhttp3.Call enrolSelfGetInstanceInfoAsync(EnrolSelfGetInstanceInfoRequest enrolSelfGetInstanceInfoRequest, final ApiCallback<EnrolSelfGetInstanceInfo200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = enrolSelfGetInstanceInfoValidateBeforeCall(enrolSelfGetInstanceInfoRequest, _callback);
        Type localVarReturnType = new TypeToken<EnrolSelfGetInstanceInfo200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}