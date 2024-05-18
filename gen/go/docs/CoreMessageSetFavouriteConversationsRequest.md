# CoreMessageSetFavouriteConversationsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Conversations** | **[]map[string]interface{}** |  | 
**Userid** | Pointer to **int32** | id of the user, 0 for current user | [optional] [default to 0]

## Methods

### NewCoreMessageSetFavouriteConversationsRequest

`func NewCoreMessageSetFavouriteConversationsRequest(conversations []map[string]interface{}, ) *CoreMessageSetFavouriteConversationsRequest`

NewCoreMessageSetFavouriteConversationsRequest instantiates a new CoreMessageSetFavouriteConversationsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageSetFavouriteConversationsRequestWithDefaults

`func NewCoreMessageSetFavouriteConversationsRequestWithDefaults() *CoreMessageSetFavouriteConversationsRequest`

NewCoreMessageSetFavouriteConversationsRequestWithDefaults instantiates a new CoreMessageSetFavouriteConversationsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetConversations

`func (o *CoreMessageSetFavouriteConversationsRequest) GetConversations() []map[string]interface{}`

GetConversations returns the Conversations field if non-nil, zero value otherwise.

### GetConversationsOk

`func (o *CoreMessageSetFavouriteConversationsRequest) GetConversationsOk() (*[]map[string]interface{}, bool)`

GetConversationsOk returns a tuple with the Conversations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversations

`func (o *CoreMessageSetFavouriteConversationsRequest) SetConversations(v []map[string]interface{})`

SetConversations sets Conversations field to given value.


### GetUserid

`func (o *CoreMessageSetFavouriteConversationsRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageSetFavouriteConversationsRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageSetFavouriteConversationsRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreMessageSetFavouriteConversationsRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


