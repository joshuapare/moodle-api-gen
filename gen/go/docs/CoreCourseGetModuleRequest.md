# CoreCourseGetModuleRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | course module id | 
**Sectionreturn** | Pointer to **int32** | section to return to | [optional] 

## Methods

### NewCoreCourseGetModuleRequest

`func NewCoreCourseGetModuleRequest(id int32, ) *CoreCourseGetModuleRequest`

NewCoreCourseGetModuleRequest instantiates a new CoreCourseGetModuleRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetModuleRequestWithDefaults

`func NewCoreCourseGetModuleRequestWithDefaults() *CoreCourseGetModuleRequest`

NewCoreCourseGetModuleRequestWithDefaults instantiates a new CoreCourseGetModuleRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CoreCourseGetModuleRequest) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCourseGetModuleRequest) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCourseGetModuleRequest) SetId(v int32)`

SetId sets Id field to given value.


### GetSectionreturn

`func (o *CoreCourseGetModuleRequest) GetSectionreturn() int32`

GetSectionreturn returns the Sectionreturn field if non-nil, zero value otherwise.

### GetSectionreturnOk

`func (o *CoreCourseGetModuleRequest) GetSectionreturnOk() (*int32, bool)`

GetSectionreturnOk returns a tuple with the Sectionreturn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSectionreturn

`func (o *CoreCourseGetModuleRequest) SetSectionreturn(v int32)`

SetSectionreturn sets Sectionreturn field to given value.

### HasSectionreturn

`func (o *CoreCourseGetModuleRequest) HasSectionreturn() bool`

HasSectionreturn returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


