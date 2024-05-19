# ToolPolicyGetPolicyVersionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Behalfid** | Pointer to **int32** | The id of user on whose behalf the user is viewing the policy | [optional] [default to 0]
**Versionid** | **int32** | The policy version ID | [default to null]

## Methods

### NewToolPolicyGetPolicyVersionRequest

`func NewToolPolicyGetPolicyVersionRequest(versionid int32, ) *ToolPolicyGetPolicyVersionRequest`

NewToolPolicyGetPolicyVersionRequest instantiates a new ToolPolicyGetPolicyVersionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolPolicyGetPolicyVersionRequestWithDefaults

`func NewToolPolicyGetPolicyVersionRequestWithDefaults() *ToolPolicyGetPolicyVersionRequest`

NewToolPolicyGetPolicyVersionRequestWithDefaults instantiates a new ToolPolicyGetPolicyVersionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBehalfid

`func (o *ToolPolicyGetPolicyVersionRequest) GetBehalfid() int32`

GetBehalfid returns the Behalfid field if non-nil, zero value otherwise.

### GetBehalfidOk

`func (o *ToolPolicyGetPolicyVersionRequest) GetBehalfidOk() (*int32, bool)`

GetBehalfidOk returns a tuple with the Behalfid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBehalfid

`func (o *ToolPolicyGetPolicyVersionRequest) SetBehalfid(v int32)`

SetBehalfid sets Behalfid field to given value.

### HasBehalfid

`func (o *ToolPolicyGetPolicyVersionRequest) HasBehalfid() bool`

HasBehalfid returns a boolean if a field has been set.

### GetVersionid

`func (o *ToolPolicyGetPolicyVersionRequest) GetVersionid() int32`

GetVersionid returns the Versionid field if non-nil, zero value otherwise.

### GetVersionidOk

`func (o *ToolPolicyGetPolicyVersionRequest) GetVersionidOk() (*int32, bool)`

GetVersionidOk returns a tuple with the Versionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionid

`func (o *ToolPolicyGetPolicyVersionRequest) SetVersionid(v int32)`

SetVersionid sets Versionid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


