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


import org.openapitools.client.model.AuthEmailGetSignupSettings200Response;
import org.openapitools.client.model.AuthEmailSignupUser200Response;
import org.openapitools.client.model.AuthEmailSignupUserRequest;
import org.openapitools.client.model.ErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthEmailApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthEmailApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthEmailApi(ApiClient apiClient) {
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
     * Build call for authEmailGetSignupSettings
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
    public okhttp3.Call authEmailGetSignupSettingsCall(final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth_email_get_signup_settings";

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call authEmailGetSignupSettingsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return authEmailGetSignupSettingsCall(_callback);

    }

    /**
     * Get the signup required settings and profile fields.
     * Get the signup required settings and profile fields.
     * @return AuthEmailGetSignupSettings200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public AuthEmailGetSignupSettings200Response authEmailGetSignupSettings() throws ApiException {
        ApiResponse<AuthEmailGetSignupSettings200Response> localVarResp = authEmailGetSignupSettingsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get the signup required settings and profile fields.
     * Get the signup required settings and profile fields.
     * @return ApiResponse&lt;AuthEmailGetSignupSettings200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AuthEmailGetSignupSettings200Response> authEmailGetSignupSettingsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = authEmailGetSignupSettingsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<AuthEmailGetSignupSettings200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the signup required settings and profile fields. (asynchronously)
     * Get the signup required settings and profile fields.
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
    public okhttp3.Call authEmailGetSignupSettingsAsync(final ApiCallback<AuthEmailGetSignupSettings200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = authEmailGetSignupSettingsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<AuthEmailGetSignupSettings200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for authEmailSignupUser
     * @param authEmailSignupUserRequest  (required)
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
    public okhttp3.Call authEmailSignupUserCall(AuthEmailSignupUserRequest authEmailSignupUserRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = authEmailSignupUserRequest;

        // create path and map variables
        String localVarPath = "/auth_email_signup_user";

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
    private okhttp3.Call authEmailSignupUserValidateBeforeCall(AuthEmailSignupUserRequest authEmailSignupUserRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'authEmailSignupUserRequest' is set
        if (authEmailSignupUserRequest == null) {
            throw new ApiException("Missing the required parameter 'authEmailSignupUserRequest' when calling authEmailSignupUser(Async)");
        }

        return authEmailSignupUserCall(authEmailSignupUserRequest, _callback);

    }

    /**
     * Adds a new user (pendingto be confirmed) in the site.
     * Adds a new user (pendingto be confirmed) in the site.
     * @param authEmailSignupUserRequest  (required)
     * @return AuthEmailSignupUser200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public AuthEmailSignupUser200Response authEmailSignupUser(AuthEmailSignupUserRequest authEmailSignupUserRequest) throws ApiException {
        ApiResponse<AuthEmailSignupUser200Response> localVarResp = authEmailSignupUserWithHttpInfo(authEmailSignupUserRequest);
        return localVarResp.getData();
    }

    /**
     * Adds a new user (pendingto be confirmed) in the site.
     * Adds a new user (pendingto be confirmed) in the site.
     * @param authEmailSignupUserRequest  (required)
     * @return ApiResponse&lt;AuthEmailSignupUser200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AuthEmailSignupUser200Response> authEmailSignupUserWithHttpInfo(AuthEmailSignupUserRequest authEmailSignupUserRequest) throws ApiException {
        okhttp3.Call localVarCall = authEmailSignupUserValidateBeforeCall(authEmailSignupUserRequest, null);
        Type localVarReturnType = new TypeToken<AuthEmailSignupUser200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Adds a new user (pendingto be confirmed) in the site. (asynchronously)
     * Adds a new user (pendingto be confirmed) in the site.
     * @param authEmailSignupUserRequest  (required)
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
    public okhttp3.Call authEmailSignupUserAsync(AuthEmailSignupUserRequest authEmailSignupUserRequest, final ApiCallback<AuthEmailSignupUser200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = authEmailSignupUserValidateBeforeCall(authEmailSignupUserRequest, _callback);
        Type localVarReturnType = new TypeToken<AuthEmailSignupUser200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}