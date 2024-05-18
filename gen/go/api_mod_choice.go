/*
Moodle Webservice API

Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

API version: 4.3.4
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package moodleclient

import (
	"bytes"
	"context"
	"io"
	"net/http"
	"net/url"
)


// ModChoiceAPIService ModChoiceAPI service
type ModChoiceAPIService service

type ApiModChoiceDeleteChoiceResponsesRequest struct {
	ctx context.Context
	ApiService *ModChoiceAPIService
	modChoiceDeleteChoiceResponsesRequest *ModChoiceDeleteChoiceResponsesRequest
}

func (r ApiModChoiceDeleteChoiceResponsesRequest) ModChoiceDeleteChoiceResponsesRequest(modChoiceDeleteChoiceResponsesRequest ModChoiceDeleteChoiceResponsesRequest) ApiModChoiceDeleteChoiceResponsesRequest {
	r.modChoiceDeleteChoiceResponsesRequest = &modChoiceDeleteChoiceResponsesRequest
	return r
}

func (r ApiModChoiceDeleteChoiceResponsesRequest) Execute() (*ModChoiceDeleteChoiceResponses200Response, *http.Response, error) {
	return r.ApiService.ModChoiceDeleteChoiceResponsesExecute(r)
}

/*
ModChoiceDeleteChoiceResponses Delete the given submitted responses in a choice

Delete the given submitted responses in a choice

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiModChoiceDeleteChoiceResponsesRequest
*/
func (a *ModChoiceAPIService) ModChoiceDeleteChoiceResponses(ctx context.Context) ApiModChoiceDeleteChoiceResponsesRequest {
	return ApiModChoiceDeleteChoiceResponsesRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return ModChoiceDeleteChoiceResponses200Response
func (a *ModChoiceAPIService) ModChoiceDeleteChoiceResponsesExecute(r ApiModChoiceDeleteChoiceResponsesRequest) (*ModChoiceDeleteChoiceResponses200Response, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ModChoiceDeleteChoiceResponses200Response
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ModChoiceAPIService.ModChoiceDeleteChoiceResponses")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/mod_choice_delete_choice_responses"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.modChoiceDeleteChoiceResponsesRequest == nil {
		return localVarReturnValue, nil, reportError("modChoiceDeleteChoiceResponsesRequest is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.modChoiceDeleteChoiceResponsesRequest
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["apiKey"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["Authorization"] = key
			}
		}
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v ErrorResponse
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiModChoiceGetChoiceOptionsRequest struct {
	ctx context.Context
	ApiService *ModChoiceAPIService
	modChoiceGetChoiceOptionsRequest *ModChoiceGetChoiceOptionsRequest
}

func (r ApiModChoiceGetChoiceOptionsRequest) ModChoiceGetChoiceOptionsRequest(modChoiceGetChoiceOptionsRequest ModChoiceGetChoiceOptionsRequest) ApiModChoiceGetChoiceOptionsRequest {
	r.modChoiceGetChoiceOptionsRequest = &modChoiceGetChoiceOptionsRequest
	return r
}

func (r ApiModChoiceGetChoiceOptionsRequest) Execute() (*ModChoiceGetChoiceOptions200Response, *http.Response, error) {
	return r.ApiService.ModChoiceGetChoiceOptionsExecute(r)
}

/*
ModChoiceGetChoiceOptions Retrieve options for a specific choice.

Retrieve options for a specific choice.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiModChoiceGetChoiceOptionsRequest
*/
func (a *ModChoiceAPIService) ModChoiceGetChoiceOptions(ctx context.Context) ApiModChoiceGetChoiceOptionsRequest {
	return ApiModChoiceGetChoiceOptionsRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return ModChoiceGetChoiceOptions200Response
func (a *ModChoiceAPIService) ModChoiceGetChoiceOptionsExecute(r ApiModChoiceGetChoiceOptionsRequest) (*ModChoiceGetChoiceOptions200Response, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ModChoiceGetChoiceOptions200Response
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ModChoiceAPIService.ModChoiceGetChoiceOptions")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/mod_choice_get_choice_options"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.modChoiceGetChoiceOptionsRequest == nil {
		return localVarReturnValue, nil, reportError("modChoiceGetChoiceOptionsRequest is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.modChoiceGetChoiceOptionsRequest
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["apiKey"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["Authorization"] = key
			}
		}
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v ErrorResponse
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiModChoiceGetChoiceResultsRequest struct {
	ctx context.Context
	ApiService *ModChoiceAPIService
	modChoiceGetChoiceOptionsRequest *ModChoiceGetChoiceOptionsRequest
}

func (r ApiModChoiceGetChoiceResultsRequest) ModChoiceGetChoiceOptionsRequest(modChoiceGetChoiceOptionsRequest ModChoiceGetChoiceOptionsRequest) ApiModChoiceGetChoiceResultsRequest {
	r.modChoiceGetChoiceOptionsRequest = &modChoiceGetChoiceOptionsRequest
	return r
}

func (r ApiModChoiceGetChoiceResultsRequest) Execute() (*ModChoiceGetChoiceResults200Response, *http.Response, error) {
	return r.ApiService.ModChoiceGetChoiceResultsExecute(r)
}

/*
ModChoiceGetChoiceResults Retrieve users results for a given choice.

Retrieve users results for a given choice.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiModChoiceGetChoiceResultsRequest
*/
func (a *ModChoiceAPIService) ModChoiceGetChoiceResults(ctx context.Context) ApiModChoiceGetChoiceResultsRequest {
	return ApiModChoiceGetChoiceResultsRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return ModChoiceGetChoiceResults200Response
func (a *ModChoiceAPIService) ModChoiceGetChoiceResultsExecute(r ApiModChoiceGetChoiceResultsRequest) (*ModChoiceGetChoiceResults200Response, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ModChoiceGetChoiceResults200Response
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ModChoiceAPIService.ModChoiceGetChoiceResults")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/mod_choice_get_choice_results"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.modChoiceGetChoiceOptionsRequest == nil {
		return localVarReturnValue, nil, reportError("modChoiceGetChoiceOptionsRequest is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.modChoiceGetChoiceOptionsRequest
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["apiKey"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["Authorization"] = key
			}
		}
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v ErrorResponse
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiModChoiceGetChoicesByCoursesRequest struct {
	ctx context.Context
	ApiService *ModChoiceAPIService
	modChatGetChatsByCoursesRequest *ModChatGetChatsByCoursesRequest
}

func (r ApiModChoiceGetChoicesByCoursesRequest) ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest ModChatGetChatsByCoursesRequest) ApiModChoiceGetChoicesByCoursesRequest {
	r.modChatGetChatsByCoursesRequest = &modChatGetChatsByCoursesRequest
	return r
}

func (r ApiModChoiceGetChoicesByCoursesRequest) Execute() (*ModChoiceGetChoicesByCourses200Response, *http.Response, error) {
	return r.ApiService.ModChoiceGetChoicesByCoursesExecute(r)
}

/*
ModChoiceGetChoicesByCourses Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.

Returns a list of choice instances in a provided set of courses,
                            if no courses are provided then all the choice instances the user has access to will be returned.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiModChoiceGetChoicesByCoursesRequest
*/
func (a *ModChoiceAPIService) ModChoiceGetChoicesByCourses(ctx context.Context) ApiModChoiceGetChoicesByCoursesRequest {
	return ApiModChoiceGetChoicesByCoursesRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return ModChoiceGetChoicesByCourses200Response
func (a *ModChoiceAPIService) ModChoiceGetChoicesByCoursesExecute(r ApiModChoiceGetChoicesByCoursesRequest) (*ModChoiceGetChoicesByCourses200Response, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ModChoiceGetChoicesByCourses200Response
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ModChoiceAPIService.ModChoiceGetChoicesByCourses")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/mod_choice_get_choices_by_courses"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.modChatGetChatsByCoursesRequest == nil {
		return localVarReturnValue, nil, reportError("modChatGetChatsByCoursesRequest is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.modChatGetChatsByCoursesRequest
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["apiKey"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["Authorization"] = key
			}
		}
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v ErrorResponse
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiModChoiceSubmitChoiceResponseRequest struct {
	ctx context.Context
	ApiService *ModChoiceAPIService
	modChoiceSubmitChoiceResponseRequest *ModChoiceSubmitChoiceResponseRequest
}

func (r ApiModChoiceSubmitChoiceResponseRequest) ModChoiceSubmitChoiceResponseRequest(modChoiceSubmitChoiceResponseRequest ModChoiceSubmitChoiceResponseRequest) ApiModChoiceSubmitChoiceResponseRequest {
	r.modChoiceSubmitChoiceResponseRequest = &modChoiceSubmitChoiceResponseRequest
	return r
}

func (r ApiModChoiceSubmitChoiceResponseRequest) Execute() (*ModChoiceSubmitChoiceResponse200Response, *http.Response, error) {
	return r.ApiService.ModChoiceSubmitChoiceResponseExecute(r)
}

/*
ModChoiceSubmitChoiceResponse Submit responses to a specific choice item.

Submit responses to a specific choice item.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiModChoiceSubmitChoiceResponseRequest
*/
func (a *ModChoiceAPIService) ModChoiceSubmitChoiceResponse(ctx context.Context) ApiModChoiceSubmitChoiceResponseRequest {
	return ApiModChoiceSubmitChoiceResponseRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return ModChoiceSubmitChoiceResponse200Response
func (a *ModChoiceAPIService) ModChoiceSubmitChoiceResponseExecute(r ApiModChoiceSubmitChoiceResponseRequest) (*ModChoiceSubmitChoiceResponse200Response, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ModChoiceSubmitChoiceResponse200Response
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ModChoiceAPIService.ModChoiceSubmitChoiceResponse")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/mod_choice_submit_choice_response"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.modChoiceSubmitChoiceResponseRequest == nil {
		return localVarReturnValue, nil, reportError("modChoiceSubmitChoiceResponseRequest is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.modChoiceSubmitChoiceResponseRequest
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["apiKey"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["Authorization"] = key
			}
		}
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v ErrorResponse
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiModChoiceViewChoiceRequest struct {
	ctx context.Context
	ApiService *ModChoiceAPIService
	modChoiceGetChoiceOptionsRequest *ModChoiceGetChoiceOptionsRequest
}

func (r ApiModChoiceViewChoiceRequest) ModChoiceGetChoiceOptionsRequest(modChoiceGetChoiceOptionsRequest ModChoiceGetChoiceOptionsRequest) ApiModChoiceViewChoiceRequest {
	r.modChoiceGetChoiceOptionsRequest = &modChoiceGetChoiceOptionsRequest
	return r
}

func (r ApiModChoiceViewChoiceRequest) Execute() (*CoreCalendarDeleteSubscription200Response, *http.Response, error) {
	return r.ApiService.ModChoiceViewChoiceExecute(r)
}

/*
ModChoiceViewChoice Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiModChoiceViewChoiceRequest
*/
func (a *ModChoiceAPIService) ModChoiceViewChoice(ctx context.Context) ApiModChoiceViewChoiceRequest {
	return ApiModChoiceViewChoiceRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return CoreCalendarDeleteSubscription200Response
func (a *ModChoiceAPIService) ModChoiceViewChoiceExecute(r ApiModChoiceViewChoiceRequest) (*CoreCalendarDeleteSubscription200Response, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *CoreCalendarDeleteSubscription200Response
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ModChoiceAPIService.ModChoiceViewChoice")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/mod_choice_view_choice"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.modChoiceGetChoiceOptionsRequest == nil {
		return localVarReturnValue, nil, reportError("modChoiceGetChoiceOptionsRequest is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.modChoiceGetChoiceOptionsRequest
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["apiKey"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["Authorization"] = key
			}
		}
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v ErrorResponse
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
