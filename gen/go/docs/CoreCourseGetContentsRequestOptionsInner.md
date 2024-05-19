# CoreCourseGetContentsRequestOptionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | The expected keys (value format) are:                                                 excludemodules (bool) Do not return modules, return only the sections structure                                                 excludecontents (bool) Do not return module contents (i.e: files inside a resource)                                                 includestealthmodules (bool) Return stealth modules for students in a special                                                     section (with id -1)                                                 sectionid (int) Return only this section                                                 sectionnumber (int) Return only this section with number (order)                                                 cmid (int) Return only this module information (among the whole sections structure)                                                 modname (string) Return only modules with this name \&quot;label, forum, etc...\&quot;                                                 modid (int) Return only the module with this id (to be used with modname | [optional] [default to "null"]
**Value** | Pointer to **string** | the value of the option,                                                                     this param is personaly validated in the external function. | [optional] [default to "null"]

## Methods

### NewCoreCourseGetContentsRequestOptionsInner

`func NewCoreCourseGetContentsRequestOptionsInner() *CoreCourseGetContentsRequestOptionsInner`

NewCoreCourseGetContentsRequestOptionsInner instantiates a new CoreCourseGetContentsRequestOptionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetContentsRequestOptionsInnerWithDefaults

`func NewCoreCourseGetContentsRequestOptionsInnerWithDefaults() *CoreCourseGetContentsRequestOptionsInner`

NewCoreCourseGetContentsRequestOptionsInnerWithDefaults instantiates a new CoreCourseGetContentsRequestOptionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *CoreCourseGetContentsRequestOptionsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCourseGetContentsRequestOptionsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCourseGetContentsRequestOptionsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreCourseGetContentsRequestOptionsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetValue

`func (o *CoreCourseGetContentsRequestOptionsInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *CoreCourseGetContentsRequestOptionsInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *CoreCourseGetContentsRequestOptionsInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *CoreCourseGetContentsRequestOptionsInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


