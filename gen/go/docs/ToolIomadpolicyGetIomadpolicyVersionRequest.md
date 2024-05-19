# ToolIomadpolicyGetIomadpolicyVersionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Behalfid** | Pointer to **int32** | The id of user on whose behalf the user is viewing the iomadpolicy | [optional] [default to 0]
**Versionid** | **int32** | The iomadpolicy version ID | [default to null]

## Methods

### NewToolIomadpolicyGetIomadpolicyVersionRequest

`func NewToolIomadpolicyGetIomadpolicyVersionRequest(versionid int32, ) *ToolIomadpolicyGetIomadpolicyVersionRequest`

NewToolIomadpolicyGetIomadpolicyVersionRequest instantiates a new ToolIomadpolicyGetIomadpolicyVersionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolIomadpolicyGetIomadpolicyVersionRequestWithDefaults

`func NewToolIomadpolicyGetIomadpolicyVersionRequestWithDefaults() *ToolIomadpolicyGetIomadpolicyVersionRequest`

NewToolIomadpolicyGetIomadpolicyVersionRequestWithDefaults instantiates a new ToolIomadpolicyGetIomadpolicyVersionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBehalfid

`func (o *ToolIomadpolicyGetIomadpolicyVersionRequest) GetBehalfid() int32`

GetBehalfid returns the Behalfid field if non-nil, zero value otherwise.

### GetBehalfidOk

`func (o *ToolIomadpolicyGetIomadpolicyVersionRequest) GetBehalfidOk() (*int32, bool)`

GetBehalfidOk returns a tuple with the Behalfid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBehalfid

`func (o *ToolIomadpolicyGetIomadpolicyVersionRequest) SetBehalfid(v int32)`

SetBehalfid sets Behalfid field to given value.

### HasBehalfid

`func (o *ToolIomadpolicyGetIomadpolicyVersionRequest) HasBehalfid() bool`

HasBehalfid returns a boolean if a field has been set.

### GetVersionid

`func (o *ToolIomadpolicyGetIomadpolicyVersionRequest) GetVersionid() int32`

GetVersionid returns the Versionid field if non-nil, zero value otherwise.

### GetVersionidOk

`func (o *ToolIomadpolicyGetIomadpolicyVersionRequest) GetVersionidOk() (*int32, bool)`

GetVersionidOk returns a tuple with the Versionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionid

`func (o *ToolIomadpolicyGetIomadpolicyVersionRequest) SetVersionid(v int32)`

SetVersionid sets Versionid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


