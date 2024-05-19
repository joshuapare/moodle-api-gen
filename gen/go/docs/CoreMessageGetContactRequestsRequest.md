# CoreMessageGetContactRequestsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Limitfrom** | Pointer to **int32** | Limit from | [optional] [default to 0]
**Limitnum** | Pointer to **int32** | Limit number | [optional] [default to 0]
**Userid** | **int32** | The id of the user we want the requests for | [default to null]

## Methods

### NewCoreMessageGetContactRequestsRequest

`func NewCoreMessageGetContactRequestsRequest(userid int32, ) *CoreMessageGetContactRequestsRequest`

NewCoreMessageGetContactRequestsRequest instantiates a new CoreMessageGetContactRequestsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetContactRequestsRequestWithDefaults

`func NewCoreMessageGetContactRequestsRequestWithDefaults() *CoreMessageGetContactRequestsRequest`

NewCoreMessageGetContactRequestsRequestWithDefaults instantiates a new CoreMessageGetContactRequestsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLimitfrom

`func (o *CoreMessageGetContactRequestsRequest) GetLimitfrom() int32`

GetLimitfrom returns the Limitfrom field if non-nil, zero value otherwise.

### GetLimitfromOk

`func (o *CoreMessageGetContactRequestsRequest) GetLimitfromOk() (*int32, bool)`

GetLimitfromOk returns a tuple with the Limitfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitfrom

`func (o *CoreMessageGetContactRequestsRequest) SetLimitfrom(v int32)`

SetLimitfrom sets Limitfrom field to given value.

### HasLimitfrom

`func (o *CoreMessageGetContactRequestsRequest) HasLimitfrom() bool`

HasLimitfrom returns a boolean if a field has been set.

### GetLimitnum

`func (o *CoreMessageGetContactRequestsRequest) GetLimitnum() int32`

GetLimitnum returns the Limitnum field if non-nil, zero value otherwise.

### GetLimitnumOk

`func (o *CoreMessageGetContactRequestsRequest) GetLimitnumOk() (*int32, bool)`

GetLimitnumOk returns a tuple with the Limitnum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitnum

`func (o *CoreMessageGetContactRequestsRequest) SetLimitnum(v int32)`

SetLimitnum sets Limitnum field to given value.

### HasLimitnum

`func (o *CoreMessageGetContactRequestsRequest) HasLimitnum() bool`

HasLimitnum returns a boolean if a field has been set.

### GetUserid

`func (o *CoreMessageGetContactRequestsRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageGetContactRequestsRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageGetContactRequestsRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


