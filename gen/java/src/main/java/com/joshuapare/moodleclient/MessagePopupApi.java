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


import org.openapitools.client.model.CoreMessageGetUnreadConversationsCountRequest;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.MessagePopupGetPopupNotifications200Response;
import org.openapitools.client.model.MessagePopupGetPopupNotificationsRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagePopupApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MessagePopupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MessagePopupApi(ApiClient apiClient) {
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
     * Build call for messagePopupGetPopupNotifications
     * @param messagePopupGetPopupNotificationsRequest  (required)
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
    public okhttp3.Call messagePopupGetPopupNotificationsCall(MessagePopupGetPopupNotificationsRequest messagePopupGetPopupNotificationsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = messagePopupGetPopupNotificationsRequest;

        // create path and map variables
        String localVarPath = "/message_popup_get_popup_notifications";

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
    private okhttp3.Call messagePopupGetPopupNotificationsValidateBeforeCall(MessagePopupGetPopupNotificationsRequest messagePopupGetPopupNotificationsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'messagePopupGetPopupNotificationsRequest' is set
        if (messagePopupGetPopupNotificationsRequest == null) {
            throw new ApiException("Missing the required parameter 'messagePopupGetPopupNotificationsRequest' when calling messagePopupGetPopupNotifications(Async)");
        }

        return messagePopupGetPopupNotificationsCall(messagePopupGetPopupNotificationsRequest, _callback);

    }

    /**
     * Retrieve a list of popup notifications for a user
     * Retrieve a list of popup notifications for a user
     * @param messagePopupGetPopupNotificationsRequest  (required)
     * @return MessagePopupGetPopupNotifications200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public MessagePopupGetPopupNotifications200Response messagePopupGetPopupNotifications(MessagePopupGetPopupNotificationsRequest messagePopupGetPopupNotificationsRequest) throws ApiException {
        ApiResponse<MessagePopupGetPopupNotifications200Response> localVarResp = messagePopupGetPopupNotificationsWithHttpInfo(messagePopupGetPopupNotificationsRequest);
        return localVarResp.getData();
    }

    /**
     * Retrieve a list of popup notifications for a user
     * Retrieve a list of popup notifications for a user
     * @param messagePopupGetPopupNotificationsRequest  (required)
     * @return ApiResponse&lt;MessagePopupGetPopupNotifications200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MessagePopupGetPopupNotifications200Response> messagePopupGetPopupNotificationsWithHttpInfo(MessagePopupGetPopupNotificationsRequest messagePopupGetPopupNotificationsRequest) throws ApiException {
        okhttp3.Call localVarCall = messagePopupGetPopupNotificationsValidateBeforeCall(messagePopupGetPopupNotificationsRequest, null);
        Type localVarReturnType = new TypeToken<MessagePopupGetPopupNotifications200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a list of popup notifications for a user (asynchronously)
     * Retrieve a list of popup notifications for a user
     * @param messagePopupGetPopupNotificationsRequest  (required)
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
    public okhttp3.Call messagePopupGetPopupNotificationsAsync(MessagePopupGetPopupNotificationsRequest messagePopupGetPopupNotificationsRequest, final ApiCallback<MessagePopupGetPopupNotifications200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = messagePopupGetPopupNotificationsValidateBeforeCall(messagePopupGetPopupNotificationsRequest, _callback);
        Type localVarReturnType = new TypeToken<MessagePopupGetPopupNotifications200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for messagePopupGetUnreadPopupNotificationCount
     * @param coreMessageGetUnreadConversationsCountRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The count of unread popup notifications </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call messagePopupGetUnreadPopupNotificationCountCall(CoreMessageGetUnreadConversationsCountRequest coreMessageGetUnreadConversationsCountRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = coreMessageGetUnreadConversationsCountRequest;

        // create path and map variables
        String localVarPath = "/message_popup_get_unread_popup_notification_count";

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
    private okhttp3.Call messagePopupGetUnreadPopupNotificationCountValidateBeforeCall(CoreMessageGetUnreadConversationsCountRequest coreMessageGetUnreadConversationsCountRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'coreMessageGetUnreadConversationsCountRequest' is set
        if (coreMessageGetUnreadConversationsCountRequest == null) {
            throw new ApiException("Missing the required parameter 'coreMessageGetUnreadConversationsCountRequest' when calling messagePopupGetUnreadPopupNotificationCount(Async)");
        }

        return messagePopupGetUnreadPopupNotificationCountCall(coreMessageGetUnreadConversationsCountRequest, _callback);

    }

    /**
     * Retrieve the count of unread popup notifications for a given user
     * Retrieve the count of unread popup notifications for a given user
     * @param coreMessageGetUnreadConversationsCountRequest  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The count of unread popup notifications </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public Object messagePopupGetUnreadPopupNotificationCount(CoreMessageGetUnreadConversationsCountRequest coreMessageGetUnreadConversationsCountRequest) throws ApiException {
        ApiResponse<Object> localVarResp = messagePopupGetUnreadPopupNotificationCountWithHttpInfo(coreMessageGetUnreadConversationsCountRequest);
        return localVarResp.getData();
    }

    /**
     * Retrieve the count of unread popup notifications for a given user
     * Retrieve the count of unread popup notifications for a given user
     * @param coreMessageGetUnreadConversationsCountRequest  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The count of unread popup notifications </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> messagePopupGetUnreadPopupNotificationCountWithHttpInfo(CoreMessageGetUnreadConversationsCountRequest coreMessageGetUnreadConversationsCountRequest) throws ApiException {
        okhttp3.Call localVarCall = messagePopupGetUnreadPopupNotificationCountValidateBeforeCall(coreMessageGetUnreadConversationsCountRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve the count of unread popup notifications for a given user (asynchronously)
     * Retrieve the count of unread popup notifications for a given user
     * @param coreMessageGetUnreadConversationsCountRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The count of unread popup notifications </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call messagePopupGetUnreadPopupNotificationCountAsync(CoreMessageGetUnreadConversationsCountRequest coreMessageGetUnreadConversationsCountRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = messagePopupGetUnreadPopupNotificationCountValidateBeforeCall(coreMessageGetUnreadConversationsCountRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}