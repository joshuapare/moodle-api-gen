# CoreGroupGetActivityAllowedGroupsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cmid** | **int32** | course module id | 
**Userid** | Pointer to **int32** | id of user, empty for current user | [optional] [default to 0]

## Methods

### NewCoreGroupGetActivityAllowedGroupsRequest

`func NewCoreGroupGetActivityAllowedGroupsRequest(cmid int32, ) *CoreGroupGetActivityAllowedGroupsRequest`

NewCoreGroupGetActivityAllowedGroupsRequest instantiates a new CoreGroupGetActivityAllowedGroupsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGroupGetActivityAllowedGroupsRequestWithDefaults

`func NewCoreGroupGetActivityAllowedGroupsRequestWithDefaults() *CoreGroupGetActivityAllowedGroupsRequest`

NewCoreGroupGetActivityAllowedGroupsRequestWithDefaults instantiates a new CoreGroupGetActivityAllowedGroupsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCmid

`func (o *CoreGroupGetActivityAllowedGroupsRequest) GetCmid() int32`

GetCmid returns the Cmid field if non-nil, zero value otherwise.

### GetCmidOk

`func (o *CoreGroupGetActivityAllowedGroupsRequest) GetCmidOk() (*int32, bool)`

GetCmidOk returns a tuple with the Cmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmid

`func (o *CoreGroupGetActivityAllowedGroupsRequest) SetCmid(v int32)`

SetCmid sets Cmid field to given value.


### GetUserid

`func (o *CoreGroupGetActivityAllowedGroupsRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreGroupGetActivityAllowedGroupsRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreGroupGetActivityAllowedGroupsRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreGroupGetActivityAllowedGroupsRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


