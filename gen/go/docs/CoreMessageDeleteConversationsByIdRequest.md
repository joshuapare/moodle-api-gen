# CoreMessageDeleteConversationsByIdRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Conversationids** | **[]map[string]interface{}** |  | 
**Userid** | **int32** | The user id of who we want to delete the conversation for | [default to null]

## Methods

### NewCoreMessageDeleteConversationsByIdRequest

`func NewCoreMessageDeleteConversationsByIdRequest(conversationids []map[string]interface{}, userid int32, ) *CoreMessageDeleteConversationsByIdRequest`

NewCoreMessageDeleteConversationsByIdRequest instantiates a new CoreMessageDeleteConversationsByIdRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageDeleteConversationsByIdRequestWithDefaults

`func NewCoreMessageDeleteConversationsByIdRequestWithDefaults() *CoreMessageDeleteConversationsByIdRequest`

NewCoreMessageDeleteConversationsByIdRequestWithDefaults instantiates a new CoreMessageDeleteConversationsByIdRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetConversationids

`func (o *CoreMessageDeleteConversationsByIdRequest) GetConversationids() []map[string]interface{}`

GetConversationids returns the Conversationids field if non-nil, zero value otherwise.

### GetConversationidsOk

`func (o *CoreMessageDeleteConversationsByIdRequest) GetConversationidsOk() (*[]map[string]interface{}, bool)`

GetConversationidsOk returns a tuple with the Conversationids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversationids

`func (o *CoreMessageDeleteConversationsByIdRequest) SetConversationids(v []map[string]interface{})`

SetConversationids sets Conversationids field to given value.


### GetUserid

`func (o *CoreMessageDeleteConversationsByIdRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageDeleteConversationsByIdRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageDeleteConversationsByIdRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


