# ModChatGetSessions200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Sessions** | [**[]ModChatGetSessions200ResponseSessionsInner**](ModChatGetSessions200ResponseSessionsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModChatGetSessions200Response

`func NewModChatGetSessions200Response(sessions []ModChatGetSessions200ResponseSessionsInner, ) *ModChatGetSessions200Response`

NewModChatGetSessions200Response instantiates a new ModChatGetSessions200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatGetSessions200ResponseWithDefaults

`func NewModChatGetSessions200ResponseWithDefaults() *ModChatGetSessions200Response`

NewModChatGetSessions200ResponseWithDefaults instantiates a new ModChatGetSessions200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSessions

`func (o *ModChatGetSessions200Response) GetSessions() []ModChatGetSessions200ResponseSessionsInner`

GetSessions returns the Sessions field if non-nil, zero value otherwise.

### GetSessionsOk

`func (o *ModChatGetSessions200Response) GetSessionsOk() (*[]ModChatGetSessions200ResponseSessionsInner, bool)`

GetSessionsOk returns a tuple with the Sessions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSessions

`func (o *ModChatGetSessions200Response) SetSessions(v []ModChatGetSessions200ResponseSessionsInner)`

SetSessions sets Sessions field to given value.


### GetWarnings

`func (o *ModChatGetSessions200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModChatGetSessions200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModChatGetSessions200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModChatGetSessions200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


