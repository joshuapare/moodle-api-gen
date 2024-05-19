# CoreEnrolUnenrolUserEnrolment200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | [**[]CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner**](CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner.md) |  | 
**Result** | **bool** | True if the user&#39;s enrolment was successfully updated | 

## Methods

### NewCoreEnrolUnenrolUserEnrolment200Response

`func NewCoreEnrolUnenrolUserEnrolment200Response(errors []CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner, result bool, ) *CoreEnrolUnenrolUserEnrolment200Response`

NewCoreEnrolUnenrolUserEnrolment200Response instantiates a new CoreEnrolUnenrolUserEnrolment200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreEnrolUnenrolUserEnrolment200ResponseWithDefaults

`func NewCoreEnrolUnenrolUserEnrolment200ResponseWithDefaults() *CoreEnrolUnenrolUserEnrolment200Response`

NewCoreEnrolUnenrolUserEnrolment200ResponseWithDefaults instantiates a new CoreEnrolUnenrolUserEnrolment200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrors

`func (o *CoreEnrolUnenrolUserEnrolment200Response) GetErrors() []CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *CoreEnrolUnenrolUserEnrolment200Response) GetErrorsOk() (*[]CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *CoreEnrolUnenrolUserEnrolment200Response) SetErrors(v []CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner)`

SetErrors sets Errors field to given value.


### GetResult

`func (o *CoreEnrolUnenrolUserEnrolment200Response) GetResult() bool`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *CoreEnrolUnenrolUserEnrolment200Response) GetResultOk() (*bool, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *CoreEnrolUnenrolUserEnrolment200Response) SetResult(v bool)`

SetResult sets Result field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


