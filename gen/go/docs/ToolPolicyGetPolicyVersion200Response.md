# ToolPolicyGetPolicyVersion200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**ToolPolicyGetPolicyVersion200ResponseResult**](ToolPolicyGetPolicyVersion200ResponseResult.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewToolPolicyGetPolicyVersion200Response

`func NewToolPolicyGetPolicyVersion200Response(result ToolPolicyGetPolicyVersion200ResponseResult, ) *ToolPolicyGetPolicyVersion200Response`

NewToolPolicyGetPolicyVersion200Response instantiates a new ToolPolicyGetPolicyVersion200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolPolicyGetPolicyVersion200ResponseWithDefaults

`func NewToolPolicyGetPolicyVersion200ResponseWithDefaults() *ToolPolicyGetPolicyVersion200Response`

NewToolPolicyGetPolicyVersion200ResponseWithDefaults instantiates a new ToolPolicyGetPolicyVersion200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResult

`func (o *ToolPolicyGetPolicyVersion200Response) GetResult() ToolPolicyGetPolicyVersion200ResponseResult`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *ToolPolicyGetPolicyVersion200Response) GetResultOk() (*ToolPolicyGetPolicyVersion200ResponseResult, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *ToolPolicyGetPolicyVersion200Response) SetResult(v ToolPolicyGetPolicyVersion200ResponseResult)`

SetResult sets Result field to given value.


### GetWarnings

`func (o *ToolPolicyGetPolicyVersion200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ToolPolicyGetPolicyVersion200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ToolPolicyGetPolicyVersion200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ToolPolicyGetPolicyVersion200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


