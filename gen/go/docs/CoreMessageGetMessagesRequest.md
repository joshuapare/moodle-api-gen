# CoreMessageGetMessagesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Limitfrom** | Pointer to **int32** | limit from | [optional] [default to 0]
**Limitnum** | Pointer to **int32** | limit number | [optional] [default to 0]
**Newestfirst** | Pointer to **bool** | true for ordering by newest first, false for oldest first | [optional] [default to true]
**Read** | Pointer to **int32** | 1 for getting read messages, 0 for unread, 2 for both | [optional] [default to 1]
**Type** | Pointer to **string** | type of message to return, expected values are: notifications, conversations and both | [optional] [default to "both"]
**Useridfrom** | Pointer to **int32** | the user id who send the message, 0 for any user. -10 or -20 for no-reply or support user | [optional] [default to 0]
**Useridto** | **int32** | the user id who received the message, 0 for any user | [default to null]

## Methods

### NewCoreMessageGetMessagesRequest

`func NewCoreMessageGetMessagesRequest(useridto int32, ) *CoreMessageGetMessagesRequest`

NewCoreMessageGetMessagesRequest instantiates a new CoreMessageGetMessagesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetMessagesRequestWithDefaults

`func NewCoreMessageGetMessagesRequestWithDefaults() *CoreMessageGetMessagesRequest`

NewCoreMessageGetMessagesRequestWithDefaults instantiates a new CoreMessageGetMessagesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLimitfrom

`func (o *CoreMessageGetMessagesRequest) GetLimitfrom() int32`

GetLimitfrom returns the Limitfrom field if non-nil, zero value otherwise.

### GetLimitfromOk

`func (o *CoreMessageGetMessagesRequest) GetLimitfromOk() (*int32, bool)`

GetLimitfromOk returns a tuple with the Limitfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitfrom

`func (o *CoreMessageGetMessagesRequest) SetLimitfrom(v int32)`

SetLimitfrom sets Limitfrom field to given value.

### HasLimitfrom

`func (o *CoreMessageGetMessagesRequest) HasLimitfrom() bool`

HasLimitfrom returns a boolean if a field has been set.

### GetLimitnum

`func (o *CoreMessageGetMessagesRequest) GetLimitnum() int32`

GetLimitnum returns the Limitnum field if non-nil, zero value otherwise.

### GetLimitnumOk

`func (o *CoreMessageGetMessagesRequest) GetLimitnumOk() (*int32, bool)`

GetLimitnumOk returns a tuple with the Limitnum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitnum

`func (o *CoreMessageGetMessagesRequest) SetLimitnum(v int32)`

SetLimitnum sets Limitnum field to given value.

### HasLimitnum

`func (o *CoreMessageGetMessagesRequest) HasLimitnum() bool`

HasLimitnum returns a boolean if a field has been set.

### GetNewestfirst

`func (o *CoreMessageGetMessagesRequest) GetNewestfirst() bool`

GetNewestfirst returns the Newestfirst field if non-nil, zero value otherwise.

### GetNewestfirstOk

`func (o *CoreMessageGetMessagesRequest) GetNewestfirstOk() (*bool, bool)`

GetNewestfirstOk returns a tuple with the Newestfirst field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewestfirst

`func (o *CoreMessageGetMessagesRequest) SetNewestfirst(v bool)`

SetNewestfirst sets Newestfirst field to given value.

### HasNewestfirst

`func (o *CoreMessageGetMessagesRequest) HasNewestfirst() bool`

HasNewestfirst returns a boolean if a field has been set.

### GetRead

`func (o *CoreMessageGetMessagesRequest) GetRead() int32`

GetRead returns the Read field if non-nil, zero value otherwise.

### GetReadOk

`func (o *CoreMessageGetMessagesRequest) GetReadOk() (*int32, bool)`

GetReadOk returns a tuple with the Read field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRead

`func (o *CoreMessageGetMessagesRequest) SetRead(v int32)`

SetRead sets Read field to given value.

### HasRead

`func (o *CoreMessageGetMessagesRequest) HasRead() bool`

HasRead returns a boolean if a field has been set.

### GetType

`func (o *CoreMessageGetMessagesRequest) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CoreMessageGetMessagesRequest) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CoreMessageGetMessagesRequest) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *CoreMessageGetMessagesRequest) HasType() bool`

HasType returns a boolean if a field has been set.

### GetUseridfrom

`func (o *CoreMessageGetMessagesRequest) GetUseridfrom() int32`

GetUseridfrom returns the Useridfrom field if non-nil, zero value otherwise.

### GetUseridfromOk

`func (o *CoreMessageGetMessagesRequest) GetUseridfromOk() (*int32, bool)`

GetUseridfromOk returns a tuple with the Useridfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseridfrom

`func (o *CoreMessageGetMessagesRequest) SetUseridfrom(v int32)`

SetUseridfrom sets Useridfrom field to given value.

### HasUseridfrom

`func (o *CoreMessageGetMessagesRequest) HasUseridfrom() bool`

HasUseridfrom returns a boolean if a field has been set.

### GetUseridto

`func (o *CoreMessageGetMessagesRequest) GetUseridto() int32`

GetUseridto returns the Useridto field if non-nil, zero value otherwise.

### GetUseridtoOk

`func (o *CoreMessageGetMessagesRequest) GetUseridtoOk() (*int32, bool)`

GetUseridtoOk returns a tuple with the Useridto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseridto

`func (o *CoreMessageGetMessagesRequest) SetUseridto(v int32)`

SetUseridto sets Useridto field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


