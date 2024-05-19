# CoreFiltersGetAvailableInContext200ResponseFiltersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contextid** | Pointer to **int32** | The context id. | [optional] [default to null]
**Contextlevel** | Pointer to **string** | The context level where the filters are:                                 (coursecat, course, module). | [optional] [default to "null"]
**Filter** | Pointer to **string** | Filter plugin name. | [optional] [default to "null"]
**Inheritedstate** | Pointer to **int32** | 1 or 0 to use when localstate is set to inherit. | [optional] [default to null]
**Instanceid** | Pointer to **int32** | The instance id of item associated with the context. | [optional] 
**Localstate** | Pointer to **int32** | Filter state: 1 for on, -1 for off, 0 if inherit. | [optional] [default to null]

## Methods

### NewCoreFiltersGetAvailableInContext200ResponseFiltersInner

`func NewCoreFiltersGetAvailableInContext200ResponseFiltersInner() *CoreFiltersGetAvailableInContext200ResponseFiltersInner`

NewCoreFiltersGetAvailableInContext200ResponseFiltersInner instantiates a new CoreFiltersGetAvailableInContext200ResponseFiltersInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreFiltersGetAvailableInContext200ResponseFiltersInnerWithDefaults

`func NewCoreFiltersGetAvailableInContext200ResponseFiltersInnerWithDefaults() *CoreFiltersGetAvailableInContext200ResponseFiltersInner`

NewCoreFiltersGetAvailableInContext200ResponseFiltersInnerWithDefaults instantiates a new CoreFiltersGetAvailableInContext200ResponseFiltersInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContextid

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) SetContextid(v int32)`

SetContextid sets Contextid field to given value.

### HasContextid

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) HasContextid() bool`

HasContextid returns a boolean if a field has been set.

### GetContextlevel

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) GetContextlevel() string`

GetContextlevel returns the Contextlevel field if non-nil, zero value otherwise.

### GetContextlevelOk

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) GetContextlevelOk() (*string, bool)`

GetContextlevelOk returns a tuple with the Contextlevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextlevel

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) SetContextlevel(v string)`

SetContextlevel sets Contextlevel field to given value.

### HasContextlevel

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) HasContextlevel() bool`

HasContextlevel returns a boolean if a field has been set.

### GetFilter

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) GetFilter() string`

GetFilter returns the Filter field if non-nil, zero value otherwise.

### GetFilterOk

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) GetFilterOk() (*string, bool)`

GetFilterOk returns a tuple with the Filter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilter

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) SetFilter(v string)`

SetFilter sets Filter field to given value.

### HasFilter

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) HasFilter() bool`

HasFilter returns a boolean if a field has been set.

### GetInheritedstate

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) GetInheritedstate() int32`

GetInheritedstate returns the Inheritedstate field if non-nil, zero value otherwise.

### GetInheritedstateOk

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) GetInheritedstateOk() (*int32, bool)`

GetInheritedstateOk returns a tuple with the Inheritedstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInheritedstate

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) SetInheritedstate(v int32)`

SetInheritedstate sets Inheritedstate field to given value.

### HasInheritedstate

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) HasInheritedstate() bool`

HasInheritedstate returns a boolean if a field has been set.

### GetInstanceid

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.

### HasInstanceid

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) HasInstanceid() bool`

HasInstanceid returns a boolean if a field has been set.

### GetLocalstate

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) GetLocalstate() int32`

GetLocalstate returns the Localstate field if non-nil, zero value otherwise.

### GetLocalstateOk

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) GetLocalstateOk() (*int32, bool)`

GetLocalstateOk returns a tuple with the Localstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocalstate

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) SetLocalstate(v int32)`

SetLocalstate sets Localstate field to given value.

### HasLocalstate

`func (o *CoreFiltersGetAvailableInContext200ResponseFiltersInner) HasLocalstate() bool`

HasLocalstate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


