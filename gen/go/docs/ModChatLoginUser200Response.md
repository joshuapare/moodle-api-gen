# ModChatLoginUser200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Chatsid** | **string** | unique chat session id | [default to "null"]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModChatLoginUser200Response

`func NewModChatLoginUser200Response(chatsid string, ) *ModChatLoginUser200Response`

NewModChatLoginUser200Response instantiates a new ModChatLoginUser200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatLoginUser200ResponseWithDefaults

`func NewModChatLoginUser200ResponseWithDefaults() *ModChatLoginUser200Response`

NewModChatLoginUser200ResponseWithDefaults instantiates a new ModChatLoginUser200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChatsid

`func (o *ModChatLoginUser200Response) GetChatsid() string`

GetChatsid returns the Chatsid field if non-nil, zero value otherwise.

### GetChatsidOk

`func (o *ModChatLoginUser200Response) GetChatsidOk() (*string, bool)`

GetChatsidOk returns a tuple with the Chatsid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChatsid

`func (o *ModChatLoginUser200Response) SetChatsid(v string)`

SetChatsid sets Chatsid field to given value.


### GetWarnings

`func (o *ModChatLoginUser200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModChatLoginUser200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModChatLoginUser200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModChatLoginUser200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


