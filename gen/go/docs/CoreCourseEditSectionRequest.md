# CoreCourseEditSectionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | **string** | action: hide, show, stealth, setmarker, removemarker | [default to "null"]
**Id** | **int32** | course section id | [default to null]
**Sectionreturn** | Pointer to **int32** | section to return to | [optional] 

## Methods

### NewCoreCourseEditSectionRequest

`func NewCoreCourseEditSectionRequest(action string, id int32, ) *CoreCourseEditSectionRequest`

NewCoreCourseEditSectionRequest instantiates a new CoreCourseEditSectionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseEditSectionRequestWithDefaults

`func NewCoreCourseEditSectionRequestWithDefaults() *CoreCourseEditSectionRequest`

NewCoreCourseEditSectionRequestWithDefaults instantiates a new CoreCourseEditSectionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAction

`func (o *CoreCourseEditSectionRequest) GetAction() string`

GetAction returns the Action field if non-nil, zero value otherwise.

### GetActionOk

`func (o *CoreCourseEditSectionRequest) GetActionOk() (*string, bool)`

GetActionOk returns a tuple with the Action field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAction

`func (o *CoreCourseEditSectionRequest) SetAction(v string)`

SetAction sets Action field to given value.


### GetId

`func (o *CoreCourseEditSectionRequest) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCourseEditSectionRequest) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCourseEditSectionRequest) SetId(v int32)`

SetId sets Id field to given value.


### GetSectionreturn

`func (o *CoreCourseEditSectionRequest) GetSectionreturn() int32`

GetSectionreturn returns the Sectionreturn field if non-nil, zero value otherwise.

### GetSectionreturnOk

`func (o *CoreCourseEditSectionRequest) GetSectionreturnOk() (*int32, bool)`

GetSectionreturnOk returns a tuple with the Sectionreturn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSectionreturn

`func (o *CoreCourseEditSectionRequest) SetSectionreturn(v int32)`

SetSectionreturn sets Sectionreturn field to given value.

### HasSectionreturn

`func (o *CoreCourseEditSectionRequest) HasSectionreturn() bool`

HasSectionreturn returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


