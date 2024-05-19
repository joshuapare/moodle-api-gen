# CoreMessageMessageSearchUsers200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contacts** | [**[]CoreMessageGetConversationBetweenUsers200ResponseMembersInner**](CoreMessageGetConversationBetweenUsers200ResponseMembersInner.md) |  | 
**Noncontacts** | [**[]CoreMessageGetConversationBetweenUsers200ResponseMembersInner**](CoreMessageGetConversationBetweenUsers200ResponseMembersInner.md) |  | 

## Methods

### NewCoreMessageMessageSearchUsers200Response

`func NewCoreMessageMessageSearchUsers200Response(contacts []CoreMessageGetConversationBetweenUsers200ResponseMembersInner, noncontacts []CoreMessageGetConversationBetweenUsers200ResponseMembersInner, ) *CoreMessageMessageSearchUsers200Response`

NewCoreMessageMessageSearchUsers200Response instantiates a new CoreMessageMessageSearchUsers200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageMessageSearchUsers200ResponseWithDefaults

`func NewCoreMessageMessageSearchUsers200ResponseWithDefaults() *CoreMessageMessageSearchUsers200Response`

NewCoreMessageMessageSearchUsers200ResponseWithDefaults instantiates a new CoreMessageMessageSearchUsers200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContacts

`func (o *CoreMessageMessageSearchUsers200Response) GetContacts() []CoreMessageGetConversationBetweenUsers200ResponseMembersInner`

GetContacts returns the Contacts field if non-nil, zero value otherwise.

### GetContactsOk

`func (o *CoreMessageMessageSearchUsers200Response) GetContactsOk() (*[]CoreMessageGetConversationBetweenUsers200ResponseMembersInner, bool)`

GetContactsOk returns a tuple with the Contacts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContacts

`func (o *CoreMessageMessageSearchUsers200Response) SetContacts(v []CoreMessageGetConversationBetweenUsers200ResponseMembersInner)`

SetContacts sets Contacts field to given value.


### GetNoncontacts

`func (o *CoreMessageMessageSearchUsers200Response) GetNoncontacts() []CoreMessageGetConversationBetweenUsers200ResponseMembersInner`

GetNoncontacts returns the Noncontacts field if non-nil, zero value otherwise.

### GetNoncontactsOk

`func (o *CoreMessageMessageSearchUsers200Response) GetNoncontactsOk() (*[]CoreMessageGetConversationBetweenUsers200ResponseMembersInner, bool)`

GetNoncontactsOk returns a tuple with the Noncontacts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNoncontacts

`func (o *CoreMessageMessageSearchUsers200Response) SetNoncontacts(v []CoreMessageGetConversationBetweenUsers200ResponseMembersInner)`

SetNoncontacts sets Noncontacts field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


