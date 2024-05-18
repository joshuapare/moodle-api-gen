# ToolMobileGetContentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Args** | Pointer to [**[]ToolMobileGetContentRequestArgsInner**](ToolMobileGetContentRequestArgsInner.md) |  | [optional] 
**Component** | **string** | Component where the class is e.g. mod_assign. | [default to "null"]
**Method** | **string** | Method to execute in class \\$component\\output\\mobile. | [default to "null"]

## Methods

### NewToolMobileGetContentRequest

`func NewToolMobileGetContentRequest(component string, method string, ) *ToolMobileGetContentRequest`

NewToolMobileGetContentRequest instantiates a new ToolMobileGetContentRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolMobileGetContentRequestWithDefaults

`func NewToolMobileGetContentRequestWithDefaults() *ToolMobileGetContentRequest`

NewToolMobileGetContentRequestWithDefaults instantiates a new ToolMobileGetContentRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetArgs

`func (o *ToolMobileGetContentRequest) GetArgs() []ToolMobileGetContentRequestArgsInner`

GetArgs returns the Args field if non-nil, zero value otherwise.

### GetArgsOk

`func (o *ToolMobileGetContentRequest) GetArgsOk() (*[]ToolMobileGetContentRequestArgsInner, bool)`

GetArgsOk returns a tuple with the Args field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArgs

`func (o *ToolMobileGetContentRequest) SetArgs(v []ToolMobileGetContentRequestArgsInner)`

SetArgs sets Args field to given value.

### HasArgs

`func (o *ToolMobileGetContentRequest) HasArgs() bool`

HasArgs returns a boolean if a field has been set.

### GetComponent

`func (o *ToolMobileGetContentRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *ToolMobileGetContentRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *ToolMobileGetContentRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetMethod

`func (o *ToolMobileGetContentRequest) GetMethod() string`

GetMethod returns the Method field if non-nil, zero value otherwise.

### GetMethodOk

`func (o *ToolMobileGetContentRequest) GetMethodOk() (*string, bool)`

GetMethodOk returns a tuple with the Method field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMethod

`func (o *ToolMobileGetContentRequest) SetMethod(v string)`

SetMethod sets Method field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


