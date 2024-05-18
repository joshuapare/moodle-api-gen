# CoreCourseImportCourseRequestOptionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | The backup option name:                                             \&quot;activities\&quot; (int) Include course activites (default to 1 that is equal to yes),                                             \&quot;blocks\&quot; (int) Include course blocks (default to 1 that is equal to yes),                                             \&quot;filters\&quot; (int) Include course filters  (default to 1 that is equal to yes) | [optional] [default to "null"]
**Value** | Pointer to **string** | the value for the option 1 (yes) or 0 (no) | [optional] 

## Methods

### NewCoreCourseImportCourseRequestOptionsInner

`func NewCoreCourseImportCourseRequestOptionsInner() *CoreCourseImportCourseRequestOptionsInner`

NewCoreCourseImportCourseRequestOptionsInner instantiates a new CoreCourseImportCourseRequestOptionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseImportCourseRequestOptionsInnerWithDefaults

`func NewCoreCourseImportCourseRequestOptionsInnerWithDefaults() *CoreCourseImportCourseRequestOptionsInner`

NewCoreCourseImportCourseRequestOptionsInnerWithDefaults instantiates a new CoreCourseImportCourseRequestOptionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *CoreCourseImportCourseRequestOptionsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCourseImportCourseRequestOptionsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCourseImportCourseRequestOptionsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreCourseImportCourseRequestOptionsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetValue

`func (o *CoreCourseImportCourseRequestOptionsInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *CoreCourseImportCourseRequestOptionsInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *CoreCourseImportCourseRequestOptionsInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *CoreCourseImportCourseRequestOptionsInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


