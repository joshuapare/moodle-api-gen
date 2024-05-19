# CoreGetStringRequestStringparamsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | param name                             - if the string expect only one $a parameter then don&#39;t send this field, just send the value. | [optional] [default to "null"]
**Value** | Pointer to **string** | param value | [optional] 

## Methods

### NewCoreGetStringRequestStringparamsInner

`func NewCoreGetStringRequestStringparamsInner() *CoreGetStringRequestStringparamsInner`

NewCoreGetStringRequestStringparamsInner instantiates a new CoreGetStringRequestStringparamsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGetStringRequestStringparamsInnerWithDefaults

`func NewCoreGetStringRequestStringparamsInnerWithDefaults() *CoreGetStringRequestStringparamsInner`

NewCoreGetStringRequestStringparamsInnerWithDefaults instantiates a new CoreGetStringRequestStringparamsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *CoreGetStringRequestStringparamsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreGetStringRequestStringparamsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreGetStringRequestStringparamsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreGetStringRequestStringparamsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetValue

`func (o *CoreGetStringRequestStringparamsInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *CoreGetStringRequestStringparamsInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *CoreGetStringRequestStringparamsInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *CoreGetStringRequestStringparamsInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


