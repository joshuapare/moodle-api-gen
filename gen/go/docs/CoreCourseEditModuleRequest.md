# CoreCourseEditModuleRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | **string** | action: hide, show, stealth, duplicate, delete, moveleft, moveright, group... | [default to "null"]
**Id** | **int32** | course module id | 
**Sectionreturn** | Pointer to **int32** | section to return to | [optional] [default to null]

## Methods

### NewCoreCourseEditModuleRequest

`func NewCoreCourseEditModuleRequest(action string, id int32, ) *CoreCourseEditModuleRequest`

NewCoreCourseEditModuleRequest instantiates a new CoreCourseEditModuleRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseEditModuleRequestWithDefaults

`func NewCoreCourseEditModuleRequestWithDefaults() *CoreCourseEditModuleRequest`

NewCoreCourseEditModuleRequestWithDefaults instantiates a new CoreCourseEditModuleRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAction

`func (o *CoreCourseEditModuleRequest) GetAction() string`

GetAction returns the Action field if non-nil, zero value otherwise.

### GetActionOk

`func (o *CoreCourseEditModuleRequest) GetActionOk() (*string, bool)`

GetActionOk returns a tuple with the Action field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAction

`func (o *CoreCourseEditModuleRequest) SetAction(v string)`

SetAction sets Action field to given value.


### GetId

`func (o *CoreCourseEditModuleRequest) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCourseEditModuleRequest) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCourseEditModuleRequest) SetId(v int32)`

SetId sets Id field to given value.


### GetSectionreturn

`func (o *CoreCourseEditModuleRequest) GetSectionreturn() int32`

GetSectionreturn returns the Sectionreturn field if non-nil, zero value otherwise.

### GetSectionreturnOk

`func (o *CoreCourseEditModuleRequest) GetSectionreturnOk() (*int32, bool)`

GetSectionreturnOk returns a tuple with the Sectionreturn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSectionreturn

`func (o *CoreCourseEditModuleRequest) SetSectionreturn(v int32)`

SetSectionreturn sets Sectionreturn field to given value.

### HasSectionreturn

`func (o *CoreCourseEditModuleRequest) HasSectionreturn() bool`

HasSectionreturn returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


