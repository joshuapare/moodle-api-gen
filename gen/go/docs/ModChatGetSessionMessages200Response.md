# ModChatGetSessionMessages200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messages** | [**[]ModChatGetSessionMessages200ResponseMessagesInner**](ModChatGetSessionMessages200ResponseMessagesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModChatGetSessionMessages200Response

`func NewModChatGetSessionMessages200Response(messages []ModChatGetSessionMessages200ResponseMessagesInner, ) *ModChatGetSessionMessages200Response`

NewModChatGetSessionMessages200Response instantiates a new ModChatGetSessionMessages200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatGetSessionMessages200ResponseWithDefaults

`func NewModChatGetSessionMessages200ResponseWithDefaults() *ModChatGetSessionMessages200Response`

NewModChatGetSessionMessages200ResponseWithDefaults instantiates a new ModChatGetSessionMessages200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessages

`func (o *ModChatGetSessionMessages200Response) GetMessages() []ModChatGetSessionMessages200ResponseMessagesInner`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *ModChatGetSessionMessages200Response) GetMessagesOk() (*[]ModChatGetSessionMessages200ResponseMessagesInner, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *ModChatGetSessionMessages200Response) SetMessages(v []ModChatGetSessionMessages200ResponseMessagesInner)`

SetMessages sets Messages field to given value.


### GetWarnings

`func (o *ModChatGetSessionMessages200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModChatGetSessionMessages200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModChatGetSessionMessages200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModChatGetSessionMessages200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


