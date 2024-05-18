# ModChatGetChatLatestMessages200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Chatnewlasttime** | **int32** | new last time | [default to null]
**Messages** | [**[]ModChatGetChatLatestMessages200ResponseMessagesInner**](ModChatGetChatLatestMessages200ResponseMessagesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModChatGetChatLatestMessages200Response

`func NewModChatGetChatLatestMessages200Response(chatnewlasttime int32, messages []ModChatGetChatLatestMessages200ResponseMessagesInner, ) *ModChatGetChatLatestMessages200Response`

NewModChatGetChatLatestMessages200Response instantiates a new ModChatGetChatLatestMessages200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatGetChatLatestMessages200ResponseWithDefaults

`func NewModChatGetChatLatestMessages200ResponseWithDefaults() *ModChatGetChatLatestMessages200Response`

NewModChatGetChatLatestMessages200ResponseWithDefaults instantiates a new ModChatGetChatLatestMessages200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChatnewlasttime

`func (o *ModChatGetChatLatestMessages200Response) GetChatnewlasttime() int32`

GetChatnewlasttime returns the Chatnewlasttime field if non-nil, zero value otherwise.

### GetChatnewlasttimeOk

`func (o *ModChatGetChatLatestMessages200Response) GetChatnewlasttimeOk() (*int32, bool)`

GetChatnewlasttimeOk returns a tuple with the Chatnewlasttime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChatnewlasttime

`func (o *ModChatGetChatLatestMessages200Response) SetChatnewlasttime(v int32)`

SetChatnewlasttime sets Chatnewlasttime field to given value.


### GetMessages

`func (o *ModChatGetChatLatestMessages200Response) GetMessages() []ModChatGetChatLatestMessages200ResponseMessagesInner`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *ModChatGetChatLatestMessages200Response) GetMessagesOk() (*[]ModChatGetChatLatestMessages200ResponseMessagesInner, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *ModChatGetChatLatestMessages200Response) SetMessages(v []ModChatGetChatLatestMessages200ResponseMessagesInner)`

SetMessages sets Messages field to given value.


### GetWarnings

`func (o *ModChatGetChatLatestMessages200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModChatGetChatLatestMessages200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModChatGetChatLatestMessages200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModChatGetChatLatestMessages200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


