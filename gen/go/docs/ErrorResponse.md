# ErrorResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Debuginfo** | Pointer to **string** | Debug information | [optional] 
**Errorcode** | Pointer to **string** | Error code | [optional] 
**Exception** | Pointer to **string** | Type of the exception | [optional] 
**Message** | Pointer to **string** | Error message | [optional] 

## Methods

### NewErrorResponse

`func NewErrorResponse() *ErrorResponse`

NewErrorResponse instantiates a new ErrorResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewErrorResponseWithDefaults

`func NewErrorResponseWithDefaults() *ErrorResponse`

NewErrorResponseWithDefaults instantiates a new ErrorResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDebuginfo

`func (o *ErrorResponse) GetDebuginfo() string`

GetDebuginfo returns the Debuginfo field if non-nil, zero value otherwise.

### GetDebuginfoOk

`func (o *ErrorResponse) GetDebuginfoOk() (*string, bool)`

GetDebuginfoOk returns a tuple with the Debuginfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebuginfo

`func (o *ErrorResponse) SetDebuginfo(v string)`

SetDebuginfo sets Debuginfo field to given value.

### HasDebuginfo

`func (o *ErrorResponse) HasDebuginfo() bool`

HasDebuginfo returns a boolean if a field has been set.

### GetErrorcode

`func (o *ErrorResponse) GetErrorcode() string`

GetErrorcode returns the Errorcode field if non-nil, zero value otherwise.

### GetErrorcodeOk

`func (o *ErrorResponse) GetErrorcodeOk() (*string, bool)`

GetErrorcodeOk returns a tuple with the Errorcode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrorcode

`func (o *ErrorResponse) SetErrorcode(v string)`

SetErrorcode sets Errorcode field to given value.

### HasErrorcode

`func (o *ErrorResponse) HasErrorcode() bool`

HasErrorcode returns a boolean if a field has been set.

### GetException

`func (o *ErrorResponse) GetException() string`

GetException returns the Exception field if non-nil, zero value otherwise.

### GetExceptionOk

`func (o *ErrorResponse) GetExceptionOk() (*string, bool)`

GetExceptionOk returns a tuple with the Exception field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetException

`func (o *ErrorResponse) SetException(v string)`

SetException sets Exception field to given value.

### HasException

`func (o *ErrorResponse) HasException() bool`

HasException returns a boolean if a field has been set.

### GetMessage

`func (o *ErrorResponse) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ErrorResponse) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ErrorResponse) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *ErrorResponse) HasMessage() bool`

HasMessage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


