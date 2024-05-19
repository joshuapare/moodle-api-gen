# ModChatGetChatsByCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Chats** | [**[]ModChatGetChatsByCourses200ResponseChatsInner**](ModChatGetChatsByCourses200ResponseChatsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModChatGetChatsByCourses200Response

`func NewModChatGetChatsByCourses200Response(chats []ModChatGetChatsByCourses200ResponseChatsInner, ) *ModChatGetChatsByCourses200Response`

NewModChatGetChatsByCourses200Response instantiates a new ModChatGetChatsByCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatGetChatsByCourses200ResponseWithDefaults

`func NewModChatGetChatsByCourses200ResponseWithDefaults() *ModChatGetChatsByCourses200Response`

NewModChatGetChatsByCourses200ResponseWithDefaults instantiates a new ModChatGetChatsByCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChats

`func (o *ModChatGetChatsByCourses200Response) GetChats() []ModChatGetChatsByCourses200ResponseChatsInner`

GetChats returns the Chats field if non-nil, zero value otherwise.

### GetChatsOk

`func (o *ModChatGetChatsByCourses200Response) GetChatsOk() (*[]ModChatGetChatsByCourses200ResponseChatsInner, bool)`

GetChatsOk returns a tuple with the Chats field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChats

`func (o *ModChatGetChatsByCourses200Response) SetChats(v []ModChatGetChatsByCourses200ResponseChatsInner)`

SetChats sets Chats field to given value.


### GetWarnings

`func (o *ModChatGetChatsByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModChatGetChatsByCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModChatGetChatsByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModChatGetChatsByCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


