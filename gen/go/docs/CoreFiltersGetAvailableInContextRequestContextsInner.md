# CoreFiltersGetAvailableInContextRequestContextsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contextlevel** | Pointer to **string** | The context level where the filters are:                                 (coursecat, course, module) | [optional] [default to "null"]
**Instanceid** | Pointer to **int32** | The instance id of item associated with the context. | [optional] [default to null]

## Methods

### NewCoreFiltersGetAvailableInContextRequestContextsInner

`func NewCoreFiltersGetAvailableInContextRequestContextsInner() *CoreFiltersGetAvailableInContextRequestContextsInner`

NewCoreFiltersGetAvailableInContextRequestContextsInner instantiates a new CoreFiltersGetAvailableInContextRequestContextsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreFiltersGetAvailableInContextRequestContextsInnerWithDefaults

`func NewCoreFiltersGetAvailableInContextRequestContextsInnerWithDefaults() *CoreFiltersGetAvailableInContextRequestContextsInner`

NewCoreFiltersGetAvailableInContextRequestContextsInnerWithDefaults instantiates a new CoreFiltersGetAvailableInContextRequestContextsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContextlevel

`func (o *CoreFiltersGetAvailableInContextRequestContextsInner) GetContextlevel() string`

GetContextlevel returns the Contextlevel field if non-nil, zero value otherwise.

### GetContextlevelOk

`func (o *CoreFiltersGetAvailableInContextRequestContextsInner) GetContextlevelOk() (*string, bool)`

GetContextlevelOk returns a tuple with the Contextlevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextlevel

`func (o *CoreFiltersGetAvailableInContextRequestContextsInner) SetContextlevel(v string)`

SetContextlevel sets Contextlevel field to given value.

### HasContextlevel

`func (o *CoreFiltersGetAvailableInContextRequestContextsInner) HasContextlevel() bool`

HasContextlevel returns a boolean if a field has been set.

### GetInstanceid

`func (o *CoreFiltersGetAvailableInContextRequestContextsInner) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *CoreFiltersGetAvailableInContextRequestContextsInner) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *CoreFiltersGetAvailableInContextRequestContextsInner) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.

### HasInstanceid

`func (o *CoreFiltersGetAvailableInContextRequestContextsInner) HasInstanceid() bool`

HasInstanceid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


