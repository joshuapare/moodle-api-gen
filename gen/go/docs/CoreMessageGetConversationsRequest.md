# CoreMessageGetConversationsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Favourites** | Pointer to **bool** | Whether to restrict the results to contain NO favourite                 conversations (false), ONLY favourite conversation (true), or ignore any restriction altogether (null) | [optional] [default to null]
**Limitfrom** | Pointer to **int32** | The offset to start at | [optional] [default to 0]
**Limitnum** | Pointer to **int32** | Limit number of conversations to this | [optional] [default to 0]
**Mergeself** | Pointer to **bool** | Whether to include self-conversations (true) or ONLY private                     conversations (false) when private conversations are requested. | [optional] [default to false]
**Type** | Pointer to **int32** | Filter by type | [optional] [default to null]
**Userid** | **int32** | The id of the user who we are viewing conversations for | 

## Methods

### NewCoreMessageGetConversationsRequest

`func NewCoreMessageGetConversationsRequest(userid int32, ) *CoreMessageGetConversationsRequest`

NewCoreMessageGetConversationsRequest instantiates a new CoreMessageGetConversationsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetConversationsRequestWithDefaults

`func NewCoreMessageGetConversationsRequestWithDefaults() *CoreMessageGetConversationsRequest`

NewCoreMessageGetConversationsRequestWithDefaults instantiates a new CoreMessageGetConversationsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFavourites

`func (o *CoreMessageGetConversationsRequest) GetFavourites() bool`

GetFavourites returns the Favourites field if non-nil, zero value otherwise.

### GetFavouritesOk

`func (o *CoreMessageGetConversationsRequest) GetFavouritesOk() (*bool, bool)`

GetFavouritesOk returns a tuple with the Favourites field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFavourites

`func (o *CoreMessageGetConversationsRequest) SetFavourites(v bool)`

SetFavourites sets Favourites field to given value.

### HasFavourites

`func (o *CoreMessageGetConversationsRequest) HasFavourites() bool`

HasFavourites returns a boolean if a field has been set.

### GetLimitfrom

`func (o *CoreMessageGetConversationsRequest) GetLimitfrom() int32`

GetLimitfrom returns the Limitfrom field if non-nil, zero value otherwise.

### GetLimitfromOk

`func (o *CoreMessageGetConversationsRequest) GetLimitfromOk() (*int32, bool)`

GetLimitfromOk returns a tuple with the Limitfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitfrom

`func (o *CoreMessageGetConversationsRequest) SetLimitfrom(v int32)`

SetLimitfrom sets Limitfrom field to given value.

### HasLimitfrom

`func (o *CoreMessageGetConversationsRequest) HasLimitfrom() bool`

HasLimitfrom returns a boolean if a field has been set.

### GetLimitnum

`func (o *CoreMessageGetConversationsRequest) GetLimitnum() int32`

GetLimitnum returns the Limitnum field if non-nil, zero value otherwise.

### GetLimitnumOk

`func (o *CoreMessageGetConversationsRequest) GetLimitnumOk() (*int32, bool)`

GetLimitnumOk returns a tuple with the Limitnum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitnum

`func (o *CoreMessageGetConversationsRequest) SetLimitnum(v int32)`

SetLimitnum sets Limitnum field to given value.

### HasLimitnum

`func (o *CoreMessageGetConversationsRequest) HasLimitnum() bool`

HasLimitnum returns a boolean if a field has been set.

### GetMergeself

`func (o *CoreMessageGetConversationsRequest) GetMergeself() bool`

GetMergeself returns the Mergeself field if non-nil, zero value otherwise.

### GetMergeselfOk

`func (o *CoreMessageGetConversationsRequest) GetMergeselfOk() (*bool, bool)`

GetMergeselfOk returns a tuple with the Mergeself field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMergeself

`func (o *CoreMessageGetConversationsRequest) SetMergeself(v bool)`

SetMergeself sets Mergeself field to given value.

### HasMergeself

`func (o *CoreMessageGetConversationsRequest) HasMergeself() bool`

HasMergeself returns a boolean if a field has been set.

### GetType

`func (o *CoreMessageGetConversationsRequest) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CoreMessageGetConversationsRequest) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CoreMessageGetConversationsRequest) SetType(v int32)`

SetType sets Type field to given value.

### HasType

`func (o *CoreMessageGetConversationsRequest) HasType() bool`

HasType returns a boolean if a field has been set.

### GetUserid

`func (o *CoreMessageGetConversationsRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageGetConversationsRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageGetConversationsRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


