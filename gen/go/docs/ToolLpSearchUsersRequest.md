# ToolLpSearchUsersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Capability** | **string** | Required capability | [default to "null"]
**Limitfrom** | Pointer to **int32** | Number of records to skip | [optional] [default to 0]
**Limitnum** | Pointer to **string** | Number of records to fetch | [optional] [default to "100"]
**Query** | **string** | Query string | 

## Methods

### NewToolLpSearchUsersRequest

`func NewToolLpSearchUsersRequest(capability string, query string, ) *ToolLpSearchUsersRequest`

NewToolLpSearchUsersRequest instantiates a new ToolLpSearchUsersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolLpSearchUsersRequestWithDefaults

`func NewToolLpSearchUsersRequestWithDefaults() *ToolLpSearchUsersRequest`

NewToolLpSearchUsersRequestWithDefaults instantiates a new ToolLpSearchUsersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCapability

`func (o *ToolLpSearchUsersRequest) GetCapability() string`

GetCapability returns the Capability field if non-nil, zero value otherwise.

### GetCapabilityOk

`func (o *ToolLpSearchUsersRequest) GetCapabilityOk() (*string, bool)`

GetCapabilityOk returns a tuple with the Capability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCapability

`func (o *ToolLpSearchUsersRequest) SetCapability(v string)`

SetCapability sets Capability field to given value.


### GetLimitfrom

`func (o *ToolLpSearchUsersRequest) GetLimitfrom() int32`

GetLimitfrom returns the Limitfrom field if non-nil, zero value otherwise.

### GetLimitfromOk

`func (o *ToolLpSearchUsersRequest) GetLimitfromOk() (*int32, bool)`

GetLimitfromOk returns a tuple with the Limitfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitfrom

`func (o *ToolLpSearchUsersRequest) SetLimitfrom(v int32)`

SetLimitfrom sets Limitfrom field to given value.

### HasLimitfrom

`func (o *ToolLpSearchUsersRequest) HasLimitfrom() bool`

HasLimitfrom returns a boolean if a field has been set.

### GetLimitnum

`func (o *ToolLpSearchUsersRequest) GetLimitnum() string`

GetLimitnum returns the Limitnum field if non-nil, zero value otherwise.

### GetLimitnumOk

`func (o *ToolLpSearchUsersRequest) GetLimitnumOk() (*string, bool)`

GetLimitnumOk returns a tuple with the Limitnum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitnum

`func (o *ToolLpSearchUsersRequest) SetLimitnum(v string)`

SetLimitnum sets Limitnum field to given value.

### HasLimitnum

`func (o *ToolLpSearchUsersRequest) HasLimitnum() bool`

HasLimitnum returns a boolean if a field has been set.

### GetQuery

`func (o *ToolLpSearchUsersRequest) GetQuery() string`

GetQuery returns the Query field if non-nil, zero value otherwise.

### GetQueryOk

`func (o *ToolLpSearchUsersRequest) GetQueryOk() (*string, bool)`

GetQueryOk returns a tuple with the Query field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuery

`func (o *ToolLpSearchUsersRequest) SetQuery(v string)`

SetQuery sets Query field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


