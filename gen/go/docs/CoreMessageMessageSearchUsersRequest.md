# CoreMessageMessageSearchUsersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Limitfrom** | Pointer to **int32** | Limit from | [optional] [default to 0]
**Limitnum** | Pointer to **int32** | Limit number | [optional] [default to 0]
**Search** | **string** | The string being searched | 
**Userid** | **int32** | The id of the user who is performing the search | 

## Methods

### NewCoreMessageMessageSearchUsersRequest

`func NewCoreMessageMessageSearchUsersRequest(search string, userid int32, ) *CoreMessageMessageSearchUsersRequest`

NewCoreMessageMessageSearchUsersRequest instantiates a new CoreMessageMessageSearchUsersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageMessageSearchUsersRequestWithDefaults

`func NewCoreMessageMessageSearchUsersRequestWithDefaults() *CoreMessageMessageSearchUsersRequest`

NewCoreMessageMessageSearchUsersRequestWithDefaults instantiates a new CoreMessageMessageSearchUsersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLimitfrom

`func (o *CoreMessageMessageSearchUsersRequest) GetLimitfrom() int32`

GetLimitfrom returns the Limitfrom field if non-nil, zero value otherwise.

### GetLimitfromOk

`func (o *CoreMessageMessageSearchUsersRequest) GetLimitfromOk() (*int32, bool)`

GetLimitfromOk returns a tuple with the Limitfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitfrom

`func (o *CoreMessageMessageSearchUsersRequest) SetLimitfrom(v int32)`

SetLimitfrom sets Limitfrom field to given value.

### HasLimitfrom

`func (o *CoreMessageMessageSearchUsersRequest) HasLimitfrom() bool`

HasLimitfrom returns a boolean if a field has been set.

### GetLimitnum

`func (o *CoreMessageMessageSearchUsersRequest) GetLimitnum() int32`

GetLimitnum returns the Limitnum field if non-nil, zero value otherwise.

### GetLimitnumOk

`func (o *CoreMessageMessageSearchUsersRequest) GetLimitnumOk() (*int32, bool)`

GetLimitnumOk returns a tuple with the Limitnum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitnum

`func (o *CoreMessageMessageSearchUsersRequest) SetLimitnum(v int32)`

SetLimitnum sets Limitnum field to given value.

### HasLimitnum

`func (o *CoreMessageMessageSearchUsersRequest) HasLimitnum() bool`

HasLimitnum returns a boolean if a field has been set.

### GetSearch

`func (o *CoreMessageMessageSearchUsersRequest) GetSearch() string`

GetSearch returns the Search field if non-nil, zero value otherwise.

### GetSearchOk

`func (o *CoreMessageMessageSearchUsersRequest) GetSearchOk() (*string, bool)`

GetSearchOk returns a tuple with the Search field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearch

`func (o *CoreMessageMessageSearchUsersRequest) SetSearch(v string)`

SetSearch sets Search field to given value.


### GetUserid

`func (o *CoreMessageMessageSearchUsersRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageMessageSearchUsersRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageMessageSearchUsersRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


