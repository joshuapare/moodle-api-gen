# CoreCompletionUpdateActivityCompletionStatusManually200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **bool** | status, true if success | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreCompletionUpdateActivityCompletionStatusManually200Response

`func NewCoreCompletionUpdateActivityCompletionStatusManually200Response(status bool, ) *CoreCompletionUpdateActivityCompletionStatusManually200Response`

NewCoreCompletionUpdateActivityCompletionStatusManually200Response instantiates a new CoreCompletionUpdateActivityCompletionStatusManually200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompletionUpdateActivityCompletionStatusManually200ResponseWithDefaults

`func NewCoreCompletionUpdateActivityCompletionStatusManually200ResponseWithDefaults() *CoreCompletionUpdateActivityCompletionStatusManually200Response`

NewCoreCompletionUpdateActivityCompletionStatusManually200ResponseWithDefaults instantiates a new CoreCompletionUpdateActivityCompletionStatusManually200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *CoreCompletionUpdateActivityCompletionStatusManually200Response) GetStatus() bool`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CoreCompletionUpdateActivityCompletionStatusManually200Response) GetStatusOk() (*bool, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CoreCompletionUpdateActivityCompletionStatusManually200Response) SetStatus(v bool)`

SetStatus sets Status field to given value.


### GetWarnings

`func (o *CoreCompletionUpdateActivityCompletionStatusManually200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreCompletionUpdateActivityCompletionStatusManually200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreCompletionUpdateActivityCompletionStatusManually200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreCompletionUpdateActivityCompletionStatusManually200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


