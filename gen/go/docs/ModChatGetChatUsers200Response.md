# ModChatGetChatUsers200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Users** | [**[]ModChatGetChatUsers200ResponseUsersInner**](ModChatGetChatUsers200ResponseUsersInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModChatGetChatUsers200Response

`func NewModChatGetChatUsers200Response(users []ModChatGetChatUsers200ResponseUsersInner, ) *ModChatGetChatUsers200Response`

NewModChatGetChatUsers200Response instantiates a new ModChatGetChatUsers200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatGetChatUsers200ResponseWithDefaults

`func NewModChatGetChatUsers200ResponseWithDefaults() *ModChatGetChatUsers200Response`

NewModChatGetChatUsers200ResponseWithDefaults instantiates a new ModChatGetChatUsers200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUsers

`func (o *ModChatGetChatUsers200Response) GetUsers() []ModChatGetChatUsers200ResponseUsersInner`

GetUsers returns the Users field if non-nil, zero value otherwise.

### GetUsersOk

`func (o *ModChatGetChatUsers200Response) GetUsersOk() (*[]ModChatGetChatUsers200ResponseUsersInner, bool)`

GetUsersOk returns a tuple with the Users field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsers

`func (o *ModChatGetChatUsers200Response) SetUsers(v []ModChatGetChatUsers200ResponseUsersInner)`

SetUsers sets Users field to given value.


### GetWarnings

`func (o *ModChatGetChatUsers200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModChatGetChatUsers200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModChatGetChatUsers200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModChatGetChatUsers200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


