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


// MessageAirnotifierAPIService MessageAirnotifierAPI service
type MessageAirnotifierAPIService service

type ApiMessageAirnotifierAreNotificationPreferencesConfiguredRequest struct {
	ctx context.Context
	ApiService *MessageAirnotifierAPIService
	messageAirnotifierAreNotificationPreferencesConfiguredRequest *MessageAirnotifierAreNotificationPreferencesConfiguredRequest
}

func (r ApiMessageAirnotifierAreNotificationPreferencesConfiguredRequest) MessageAirnotifierAreNotificationPreferencesConfiguredRequest(messageAirnotifierAreNotificationPreferencesConfiguredRequest MessageAirnotifierAreNotificationPreferencesConfiguredRequest) ApiMessageAirnotifierAreNotificationPreferencesConfiguredRequest {
	r.messageAirnotifierAreNotificationPreferencesConfiguredRequest = &messageAirnotifierAreNotificationPreferencesConfiguredRequest
	return r
}

func (r ApiMessageAirnotifierAreNotificationPreferencesConfiguredRequest) Execute() (*MessageAirnotifierAreNotificationPreferencesConfigured200Response, *http.Response, error) {
	return r.ApiService.MessageAirnotifierAreNotificationPreferencesConfiguredExecute(r)
}

/*
MessageAirnotifierAreNotificationPreferencesConfigured Check if the users have notification preferences configured yet

Check if the users have notification preferences configured yet

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiMessageAirnotifierAreNotificationPreferencesConfiguredRequest
*/
func (a *MessageAirnotifierAPIService) MessageAirnotifierAreNotificationPreferencesConfigured(ctx context.Context) ApiMessageAirnotifierAreNotificationPreferencesConfiguredRequest {
	return ApiMessageAirnotifierAreNotificationPreferencesConfiguredRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return MessageAirnotifierAreNotificationPreferencesConfigured200Response
func (a *MessageAirnotifierAPIService) MessageAirnotifierAreNotificationPreferencesConfiguredExecute(r ApiMessageAirnotifierAreNotificationPreferencesConfiguredRequest) (*MessageAirnotifierAreNotificationPreferencesConfigured200Response, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *MessageAirnotifierAreNotificationPreferencesConfigured200Response
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "MessageAirnotifierAPIService.MessageAirnotifierAreNotificationPreferencesConfigured")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/message_airnotifier_are_notification_preferences_configured"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.messageAirnotifierAreNotificationPreferencesConfiguredRequest == nil {
		return localVarReturnValue, nil, reportError("messageAirnotifierAreNotificationPreferencesConfiguredRequest is required and must be specified")
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
	localVarPostBody = r.messageAirnotifierAreNotificationPreferencesConfiguredRequest
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

type ApiMessageAirnotifierEnableDeviceRequest struct {
	ctx context.Context
	ApiService *MessageAirnotifierAPIService
	messageAirnotifierEnableDeviceRequest *MessageAirnotifierEnableDeviceRequest
}

func (r ApiMessageAirnotifierEnableDeviceRequest) MessageAirnotifierEnableDeviceRequest(messageAirnotifierEnableDeviceRequest MessageAirnotifierEnableDeviceRequest) ApiMessageAirnotifierEnableDeviceRequest {
	r.messageAirnotifierEnableDeviceRequest = &messageAirnotifierEnableDeviceRequest
	return r
}

func (r ApiMessageAirnotifierEnableDeviceRequest) Execute() (*MessageAirnotifierEnableDevice200Response, *http.Response, error) {
	return r.ApiService.MessageAirnotifierEnableDeviceExecute(r)
}

/*
MessageAirnotifierEnableDevice Enables or disables a registered user device so it can receive Push notifications

Enables or disables a registered user device so it can receive Push notifications

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiMessageAirnotifierEnableDeviceRequest
*/
func (a *MessageAirnotifierAPIService) MessageAirnotifierEnableDevice(ctx context.Context) ApiMessageAirnotifierEnableDeviceRequest {
	return ApiMessageAirnotifierEnableDeviceRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return MessageAirnotifierEnableDevice200Response
func (a *MessageAirnotifierAPIService) MessageAirnotifierEnableDeviceExecute(r ApiMessageAirnotifierEnableDeviceRequest) (*MessageAirnotifierEnableDevice200Response, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *MessageAirnotifierEnableDevice200Response
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "MessageAirnotifierAPIService.MessageAirnotifierEnableDevice")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/message_airnotifier_enable_device"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.messageAirnotifierEnableDeviceRequest == nil {
		return localVarReturnValue, nil, reportError("messageAirnotifierEnableDeviceRequest is required and must be specified")
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
	localVarPostBody = r.messageAirnotifierEnableDeviceRequest
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

type ApiMessageAirnotifierGetUserDevicesRequest struct {
	ctx context.Context
	ApiService *MessageAirnotifierAPIService
	messageAirnotifierGetUserDevicesRequest *MessageAirnotifierGetUserDevicesRequest
}

func (r ApiMessageAirnotifierGetUserDevicesRequest) MessageAirnotifierGetUserDevicesRequest(messageAirnotifierGetUserDevicesRequest MessageAirnotifierGetUserDevicesRequest) ApiMessageAirnotifierGetUserDevicesRequest {
	r.messageAirnotifierGetUserDevicesRequest = &messageAirnotifierGetUserDevicesRequest
	return r
}

func (r ApiMessageAirnotifierGetUserDevicesRequest) Execute() (*MessageAirnotifierGetUserDevices200Response, *http.Response, error) {
	return r.ApiService.MessageAirnotifierGetUserDevicesExecute(r)
}

/*
MessageAirnotifierGetUserDevices Return the list of mobile devices that are registered in Moodle for the given user

Return the list of mobile devices that are registered in Moodle for the given user

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiMessageAirnotifierGetUserDevicesRequest
*/
func (a *MessageAirnotifierAPIService) MessageAirnotifierGetUserDevices(ctx context.Context) ApiMessageAirnotifierGetUserDevicesRequest {
	return ApiMessageAirnotifierGetUserDevicesRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return MessageAirnotifierGetUserDevices200Response
func (a *MessageAirnotifierAPIService) MessageAirnotifierGetUserDevicesExecute(r ApiMessageAirnotifierGetUserDevicesRequest) (*MessageAirnotifierGetUserDevices200Response, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *MessageAirnotifierGetUserDevices200Response
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "MessageAirnotifierAPIService.MessageAirnotifierGetUserDevices")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/message_airnotifier_get_user_devices"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.messageAirnotifierGetUserDevicesRequest == nil {
		return localVarReturnValue, nil, reportError("messageAirnotifierGetUserDevicesRequest is required and must be specified")
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
	localVarPostBody = r.messageAirnotifierGetUserDevicesRequest
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

type ApiMessageAirnotifierIsSystemConfiguredRequest struct {
	ctx context.Context
	ApiService *MessageAirnotifierAPIService
}

func (r ApiMessageAirnotifierIsSystemConfiguredRequest) Execute() (map[string]interface{}, *http.Response, error) {
	return r.ApiService.MessageAirnotifierIsSystemConfiguredExecute(r)
}

/*
MessageAirnotifierIsSystemConfigured Check whether the airnotifier settings have been configured

Check whether the airnotifier settings have been configured

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiMessageAirnotifierIsSystemConfiguredRequest
*/
func (a *MessageAirnotifierAPIService) MessageAirnotifierIsSystemConfigured(ctx context.Context) ApiMessageAirnotifierIsSystemConfiguredRequest {
	return ApiMessageAirnotifierIsSystemConfiguredRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return map[string]interface{}
func (a *MessageAirnotifierAPIService) MessageAirnotifierIsSystemConfiguredExecute(r ApiMessageAirnotifierIsSystemConfiguredRequest) (map[string]interface{}, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  map[string]interface{}
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "MessageAirnotifierAPIService.MessageAirnotifierIsSystemConfigured")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/message_airnotifier_is_system_configured"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

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
