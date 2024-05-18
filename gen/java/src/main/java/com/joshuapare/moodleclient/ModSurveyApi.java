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


import org.openapitools.client.model.CoreCalendarDeleteSubscription200Response;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ModChatGetChatsByCoursesRequest;
import org.openapitools.client.model.ModSurveyGetQuestions200Response;
import org.openapitools.client.model.ModSurveyGetQuestionsRequest;
import org.openapitools.client.model.ModSurveyGetSurveysByCourses200Response;
import org.openapitools.client.model.ModSurveySubmitAnswersRequest;
import org.openapitools.client.model.ModSurveyViewSurveyRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModSurveyApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ModSurveyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ModSurveyApi(ApiClient apiClient) {
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
     * Build call for modSurveyGetQuestions
     * @param modSurveyGetQuestionsRequest  (required)
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
    public okhttp3.Call modSurveyGetQuestionsCall(ModSurveyGetQuestionsRequest modSurveyGetQuestionsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = modSurveyGetQuestionsRequest;

        // create path and map variables
        String localVarPath = "/mod_survey_get_questions";

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
    private okhttp3.Call modSurveyGetQuestionsValidateBeforeCall(ModSurveyGetQuestionsRequest modSurveyGetQuestionsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'modSurveyGetQuestionsRequest' is set
        if (modSurveyGetQuestionsRequest == null) {
            throw new ApiException("Missing the required parameter 'modSurveyGetQuestionsRequest' when calling modSurveyGetQuestions(Async)");
        }

        return modSurveyGetQuestionsCall(modSurveyGetQuestionsRequest, _callback);

    }

    /**
     * Get the complete list of questions for the survey, including subquestions.
     * Get the complete list of questions for the survey, including subquestions.
     * @param modSurveyGetQuestionsRequest  (required)
     * @return ModSurveyGetQuestions200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ModSurveyGetQuestions200Response modSurveyGetQuestions(ModSurveyGetQuestionsRequest modSurveyGetQuestionsRequest) throws ApiException {
        ApiResponse<ModSurveyGetQuestions200Response> localVarResp = modSurveyGetQuestionsWithHttpInfo(modSurveyGetQuestionsRequest);
        return localVarResp.getData();
    }

    /**
     * Get the complete list of questions for the survey, including subquestions.
     * Get the complete list of questions for the survey, including subquestions.
     * @param modSurveyGetQuestionsRequest  (required)
     * @return ApiResponse&lt;ModSurveyGetQuestions200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ModSurveyGetQuestions200Response> modSurveyGetQuestionsWithHttpInfo(ModSurveyGetQuestionsRequest modSurveyGetQuestionsRequest) throws ApiException {
        okhttp3.Call localVarCall = modSurveyGetQuestionsValidateBeforeCall(modSurveyGetQuestionsRequest, null);
        Type localVarReturnType = new TypeToken<ModSurveyGetQuestions200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the complete list of questions for the survey, including subquestions. (asynchronously)
     * Get the complete list of questions for the survey, including subquestions.
     * @param modSurveyGetQuestionsRequest  (required)
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
    public okhttp3.Call modSurveyGetQuestionsAsync(ModSurveyGetQuestionsRequest modSurveyGetQuestionsRequest, final ApiCallback<ModSurveyGetQuestions200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = modSurveyGetQuestionsValidateBeforeCall(modSurveyGetQuestionsRequest, _callback);
        Type localVarReturnType = new TypeToken<ModSurveyGetQuestions200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modSurveyGetSurveysByCourses
     * @param modChatGetChatsByCoursesRequest  (required)
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
    public okhttp3.Call modSurveyGetSurveysByCoursesCall(ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = modChatGetChatsByCoursesRequest;

        // create path and map variables
        String localVarPath = "/mod_survey_get_surveys_by_courses";

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
    private okhttp3.Call modSurveyGetSurveysByCoursesValidateBeforeCall(ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'modChatGetChatsByCoursesRequest' is set
        if (modChatGetChatsByCoursesRequest == null) {
            throw new ApiException("Missing the required parameter 'modChatGetChatsByCoursesRequest' when calling modSurveyGetSurveysByCourses(Async)");
        }

        return modSurveyGetSurveysByCoursesCall(modChatGetChatsByCoursesRequest, _callback);

    }

    /**
     * Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.
     * Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.
     * @param modChatGetChatsByCoursesRequest  (required)
     * @return ModSurveyGetSurveysByCourses200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ModSurveyGetSurveysByCourses200Response modSurveyGetSurveysByCourses(ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest) throws ApiException {
        ApiResponse<ModSurveyGetSurveysByCourses200Response> localVarResp = modSurveyGetSurveysByCoursesWithHttpInfo(modChatGetChatsByCoursesRequest);
        return localVarResp.getData();
    }

    /**
     * Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.
     * Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.
     * @param modChatGetChatsByCoursesRequest  (required)
     * @return ApiResponse&lt;ModSurveyGetSurveysByCourses200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ModSurveyGetSurveysByCourses200Response> modSurveyGetSurveysByCoursesWithHttpInfo(ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest) throws ApiException {
        okhttp3.Call localVarCall = modSurveyGetSurveysByCoursesValidateBeforeCall(modChatGetChatsByCoursesRequest, null);
        Type localVarReturnType = new TypeToken<ModSurveyGetSurveysByCourses200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned. (asynchronously)
     * Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.
     * @param modChatGetChatsByCoursesRequest  (required)
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
    public okhttp3.Call modSurveyGetSurveysByCoursesAsync(ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest, final ApiCallback<ModSurveyGetSurveysByCourses200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = modSurveyGetSurveysByCoursesValidateBeforeCall(modChatGetChatsByCoursesRequest, _callback);
        Type localVarReturnType = new TypeToken<ModSurveyGetSurveysByCourses200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modSurveySubmitAnswers
     * @param modSurveySubmitAnswersRequest  (required)
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
    public okhttp3.Call modSurveySubmitAnswersCall(ModSurveySubmitAnswersRequest modSurveySubmitAnswersRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = modSurveySubmitAnswersRequest;

        // create path and map variables
        String localVarPath = "/mod_survey_submit_answers";

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
    private okhttp3.Call modSurveySubmitAnswersValidateBeforeCall(ModSurveySubmitAnswersRequest modSurveySubmitAnswersRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'modSurveySubmitAnswersRequest' is set
        if (modSurveySubmitAnswersRequest == null) {
            throw new ApiException("Missing the required parameter 'modSurveySubmitAnswersRequest' when calling modSurveySubmitAnswers(Async)");
        }

        return modSurveySubmitAnswersCall(modSurveySubmitAnswersRequest, _callback);

    }

    /**
     * Submit the answers for a given survey.
     * Submit the answers for a given survey.
     * @param modSurveySubmitAnswersRequest  (required)
     * @return CoreCalendarDeleteSubscription200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public CoreCalendarDeleteSubscription200Response modSurveySubmitAnswers(ModSurveySubmitAnswersRequest modSurveySubmitAnswersRequest) throws ApiException {
        ApiResponse<CoreCalendarDeleteSubscription200Response> localVarResp = modSurveySubmitAnswersWithHttpInfo(modSurveySubmitAnswersRequest);
        return localVarResp.getData();
    }

    /**
     * Submit the answers for a given survey.
     * Submit the answers for a given survey.
     * @param modSurveySubmitAnswersRequest  (required)
     * @return ApiResponse&lt;CoreCalendarDeleteSubscription200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CoreCalendarDeleteSubscription200Response> modSurveySubmitAnswersWithHttpInfo(ModSurveySubmitAnswersRequest modSurveySubmitAnswersRequest) throws ApiException {
        okhttp3.Call localVarCall = modSurveySubmitAnswersValidateBeforeCall(modSurveySubmitAnswersRequest, null);
        Type localVarReturnType = new TypeToken<CoreCalendarDeleteSubscription200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Submit the answers for a given survey. (asynchronously)
     * Submit the answers for a given survey.
     * @param modSurveySubmitAnswersRequest  (required)
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
    public okhttp3.Call modSurveySubmitAnswersAsync(ModSurveySubmitAnswersRequest modSurveySubmitAnswersRequest, final ApiCallback<CoreCalendarDeleteSubscription200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = modSurveySubmitAnswersValidateBeforeCall(modSurveySubmitAnswersRequest, _callback);
        Type localVarReturnType = new TypeToken<CoreCalendarDeleteSubscription200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modSurveyViewSurvey
     * @param modSurveyViewSurveyRequest  (required)
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
    public okhttp3.Call modSurveyViewSurveyCall(ModSurveyViewSurveyRequest modSurveyViewSurveyRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = modSurveyViewSurveyRequest;

        // create path and map variables
        String localVarPath = "/mod_survey_view_survey";

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
    private okhttp3.Call modSurveyViewSurveyValidateBeforeCall(ModSurveyViewSurveyRequest modSurveyViewSurveyRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'modSurveyViewSurveyRequest' is set
        if (modSurveyViewSurveyRequest == null) {
            throw new ApiException("Missing the required parameter 'modSurveyViewSurveyRequest' when calling modSurveyViewSurvey(Async)");
        }

        return modSurveyViewSurveyCall(modSurveyViewSurveyRequest, _callback);

    }

    /**
     * Trigger the course module viewed event and update the module completion status.
     * Trigger the course module viewed event and update the module completion status.
     * @param modSurveyViewSurveyRequest  (required)
     * @return CoreCalendarDeleteSubscription200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public CoreCalendarDeleteSubscription200Response modSurveyViewSurvey(ModSurveyViewSurveyRequest modSurveyViewSurveyRequest) throws ApiException {
        ApiResponse<CoreCalendarDeleteSubscription200Response> localVarResp = modSurveyViewSurveyWithHttpInfo(modSurveyViewSurveyRequest);
        return localVarResp.getData();
    }

    /**
     * Trigger the course module viewed event and update the module completion status.
     * Trigger the course module viewed event and update the module completion status.
     * @param modSurveyViewSurveyRequest  (required)
     * @return ApiResponse&lt;CoreCalendarDeleteSubscription200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid parameter value detected </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CoreCalendarDeleteSubscription200Response> modSurveyViewSurveyWithHttpInfo(ModSurveyViewSurveyRequest modSurveyViewSurveyRequest) throws ApiException {
        okhttp3.Call localVarCall = modSurveyViewSurveyValidateBeforeCall(modSurveyViewSurveyRequest, null);
        Type localVarReturnType = new TypeToken<CoreCalendarDeleteSubscription200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Trigger the course module viewed event and update the module completion status. (asynchronously)
     * Trigger the course module viewed event and update the module completion status.
     * @param modSurveyViewSurveyRequest  (required)
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
    public okhttp3.Call modSurveyViewSurveyAsync(ModSurveyViewSurveyRequest modSurveyViewSurveyRequest, final ApiCallback<CoreCalendarDeleteSubscription200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = modSurveyViewSurveyValidateBeforeCall(modSurveyViewSurveyRequest, _callback);
        Type localVarReturnType = new TypeToken<CoreCalendarDeleteSubscription200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}