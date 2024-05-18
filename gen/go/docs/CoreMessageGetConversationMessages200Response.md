# CoreMessageGetConversationMessages200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The conversation id | 
**Members** | [**[]CoreMessageGetConversationBetweenUsers200ResponseMembersInner**](CoreMessageGetConversationBetweenUsers200ResponseMembersInner.md) |  | 
**Messages** | [**[]CoreMessageGetConversationBetweenUsers200ResponseMessagesInner**](CoreMessageGetConversationBetweenUsers200ResponseMessagesInner.md) |  | 

## Methods

### NewCoreMessageGetConversationMessages200Response

`func NewCoreMessageGetConversationMessages200Response(id int32, members []CoreMessageGetConversationBetweenUsers200ResponseMembersInner, messages []CoreMessageGetConversationBetweenUsers200ResponseMessagesInner, ) *CoreMessageGetConversationMessages200Response`

NewCoreMessageGetConversationMessages200Response instantiates a new CoreMessageGetConversationMessages200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetConversationMessages200ResponseWithDefaults

`func NewCoreMessageGetConversationMessages200ResponseWithDefaults() *CoreMessageGetConversationMessages200Response`

NewCoreMessageGetConversationMessages200ResponseWithDefaults instantiates a new CoreMessageGetConversationMessages200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CoreMessageGetConversationMessages200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreMessageGetConversationMessages200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreMessageGetConversationMessages200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetMembers

`func (o *CoreMessageGetConversationMessages200Response) GetMembers() []CoreMessageGetConversationBetweenUsers200ResponseMembersInner`

GetMembers returns the Members field if non-nil, zero value otherwise.

### GetMembersOk

`func (o *CoreMessageGetConversationMessages200Response) GetMembersOk() (*[]CoreMessageGetConversationBetweenUsers200ResponseMembersInner, bool)`

GetMembersOk returns a tuple with the Members field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMembers

`func (o *CoreMessageGetConversationMessages200Response) SetMembers(v []CoreMessageGetConversationBetweenUsers200ResponseMembersInner)`

SetMembers sets Members field to given value.


### GetMessages

`func (o *CoreMessageGetConversationMessages200Response) GetMessages() []CoreMessageGetConversationBetweenUsers200ResponseMessagesInner`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *CoreMessageGetConversationMessages200Response) GetMessagesOk() (*[]CoreMessageGetConversationBetweenUsers200ResponseMessagesInner, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *CoreMessageGetConversationMessages200Response) SetMessages(v []CoreMessageGetConversationBetweenUsers200ResponseMessagesInner)`

SetMessages sets Messages field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


