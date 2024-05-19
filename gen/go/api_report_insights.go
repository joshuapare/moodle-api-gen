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


// ReportInsightsAPIService ReportInsightsAPI service
type ReportInsightsAPIService service

type ApiReportInsightsActionExecutedRequest struct {
	ctx context.Context
	ApiService *ReportInsightsAPIService
	reportInsightsActionExecutedRequest *ReportInsightsActionExecutedRequest
}

func (r ApiReportInsightsActionExecutedRequest) ReportInsightsActionExecutedRequest(reportInsightsActionExecutedRequest ReportInsightsActionExecutedRequest) ApiReportInsightsActionExecutedRequest {
	r.reportInsightsActionExecutedRequest = &reportInsightsActionExecutedRequest
	return r
}

func (r ApiReportInsightsActionExecutedRequest) Execute() (*CoreCohortAddCohortMembers200Response, *http.Response, error) {
	return r.ApiService.ReportInsightsActionExecutedExecute(r)
}

/*
ReportInsightsActionExecuted Stores an action executed over a group of predictions.

Stores an action executed over a group of predictions.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiReportInsightsActionExecutedRequest
*/
func (a *ReportInsightsAPIService) ReportInsightsActionExecuted(ctx context.Context) ApiReportInsightsActionExecutedRequest {
	return ApiReportInsightsActionExecutedRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return CoreCohortAddCohortMembers200Response
func (a *ReportInsightsAPIService) ReportInsightsActionExecutedExecute(r ApiReportInsightsActionExecutedRequest) (*CoreCohortAddCohortMembers200Response, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *CoreCohortAddCohortMembers200Response
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ReportInsightsAPIService.ReportInsightsActionExecuted")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/report_insights_action_executed"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.reportInsightsActionExecutedRequest == nil {
		return localVarReturnValue, nil, reportError("reportInsightsActionExecutedRequest is required and must be specified")
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
	localVarPostBody = r.reportInsightsActionExecutedRequest
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

type ApiReportInsightsSetFixedPredictionRequest struct {
	ctx context.Context
	ApiService *ReportInsightsAPIService
	reportInsightsSetFixedPredictionRequest *ReportInsightsSetFixedPredictionRequest
}

func (r ApiReportInsightsSetFixedPredictionRequest) ReportInsightsSetFixedPredictionRequest(reportInsightsSetFixedPredictionRequest ReportInsightsSetFixedPredictionRequest) ApiReportInsightsSetFixedPredictionRequest {
	r.reportInsightsSetFixedPredictionRequest = &reportInsightsSetFixedPredictionRequest
	return r
}

func (r ApiReportInsightsSetFixedPredictionRequest) Execute() (*ReportInsightsSetFixedPrediction200Response, *http.Response, error) {
	return r.ApiService.ReportInsightsSetFixedPredictionExecute(r)
}

/*
ReportInsightsSetFixedPrediction Flags a prediction as fixed.

Flags a prediction as fixed.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiReportInsightsSetFixedPredictionRequest
*/
func (a *ReportInsightsAPIService) ReportInsightsSetFixedPrediction(ctx context.Context) ApiReportInsightsSetFixedPredictionRequest {
	return ApiReportInsightsSetFixedPredictionRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return ReportInsightsSetFixedPrediction200Response
func (a *ReportInsightsAPIService) ReportInsightsSetFixedPredictionExecute(r ApiReportInsightsSetFixedPredictionRequest) (*ReportInsightsSetFixedPrediction200Response, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ReportInsightsSetFixedPrediction200Response
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ReportInsightsAPIService.ReportInsightsSetFixedPrediction")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/report_insights_set_fixed_prediction"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.reportInsightsSetFixedPredictionRequest == nil {
		return localVarReturnValue, nil, reportError("reportInsightsSetFixedPredictionRequest is required and must be specified")
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
	localVarPostBody = r.reportInsightsSetFixedPredictionRequest
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

type ApiReportInsightsSetNotusefulPredictionRequest struct {
	ctx context.Context
	ApiService *ReportInsightsAPIService
	reportInsightsSetNotusefulPredictionRequest *ReportInsightsSetNotusefulPredictionRequest
}

func (r ApiReportInsightsSetNotusefulPredictionRequest) ReportInsightsSetNotusefulPredictionRequest(reportInsightsSetNotusefulPredictionRequest ReportInsightsSetNotusefulPredictionRequest) ApiReportInsightsSetNotusefulPredictionRequest {
	r.reportInsightsSetNotusefulPredictionRequest = &reportInsightsSetNotusefulPredictionRequest
	return r
}

func (r ApiReportInsightsSetNotusefulPredictionRequest) Execute() (*ReportInsightsSetNotusefulPrediction200Response, *http.Response, error) {
	return r.ApiService.ReportInsightsSetNotusefulPredictionExecute(r)
}

/*
ReportInsightsSetNotusefulPrediction Flags the prediction as not useful.

Flags the prediction as not useful.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiReportInsightsSetNotusefulPredictionRequest
*/
func (a *ReportInsightsAPIService) ReportInsightsSetNotusefulPrediction(ctx context.Context) ApiReportInsightsSetNotusefulPredictionRequest {
	return ApiReportInsightsSetNotusefulPredictionRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return ReportInsightsSetNotusefulPrediction200Response
func (a *ReportInsightsAPIService) ReportInsightsSetNotusefulPredictionExecute(r ApiReportInsightsSetNotusefulPredictionRequest) (*ReportInsightsSetNotusefulPrediction200Response, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ReportInsightsSetNotusefulPrediction200Response
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ReportInsightsAPIService.ReportInsightsSetNotusefulPrediction")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/report_insights_set_notuseful_prediction"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.reportInsightsSetNotusefulPredictionRequest == nil {
		return localVarReturnValue, nil, reportError("reportInsightsSetNotusefulPredictionRequest is required and must be specified")
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
	localVarPostBody = r.reportInsightsSetNotusefulPredictionRequest
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
