# CoreMessageGetMessages200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messages** | [**[]CoreMessageGetMessages200ResponseMessagesInner**](CoreMessageGetMessages200ResponseMessagesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreMessageGetMessages200Response

`func NewCoreMessageGetMessages200Response(messages []CoreMessageGetMessages200ResponseMessagesInner, ) *CoreMessageGetMessages200Response`

NewCoreMessageGetMessages200Response instantiates a new CoreMessageGetMessages200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetMessages200ResponseWithDefaults

`func NewCoreMessageGetMessages200ResponseWithDefaults() *CoreMessageGetMessages200Response`

NewCoreMessageGetMessages200ResponseWithDefaults instantiates a new CoreMessageGetMessages200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessages

`func (o *CoreMessageGetMessages200Response) GetMessages() []CoreMessageGetMessages200ResponseMessagesInner`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *CoreMessageGetMessages200Response) GetMessagesOk() (*[]CoreMessageGetMessages200ResponseMessagesInner, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *CoreMessageGetMessages200Response) SetMessages(v []CoreMessageGetMessages200ResponseMessagesInner)`

SetMessages sets Messages field to given value.


### GetWarnings

`func (o *CoreMessageGetMessages200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreMessageGetMessages200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreMessageGetMessages200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreMessageGetMessages200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


