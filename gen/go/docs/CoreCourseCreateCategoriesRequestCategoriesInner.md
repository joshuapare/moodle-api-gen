# CoreCourseCreateCategoriesRequestCategoriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **string** | the new category description | [optional] [default to "null"]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Idnumber** | Pointer to **string** | the new category idnumber | [optional] [default to "null"]
**Name** | Pointer to **string** | new category name | [optional] [default to "null"]
**Parent** | Pointer to **int32** | the parent category id inside which the new category will be created                                          - set to 0 for a root category | [optional] [default to 0]
**Theme** | Pointer to **string** | the new category theme. This option must be enabled on moodle | [optional] [default to "null"]

## Methods

### NewCoreCourseCreateCategoriesRequestCategoriesInner

`func NewCoreCourseCreateCategoriesRequestCategoriesInner() *CoreCourseCreateCategoriesRequestCategoriesInner`

NewCoreCourseCreateCategoriesRequestCategoriesInner instantiates a new CoreCourseCreateCategoriesRequestCategoriesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseCreateCategoriesRequestCategoriesInnerWithDefaults

`func NewCoreCourseCreateCategoriesRequestCategoriesInnerWithDefaults() *CoreCourseCreateCategoriesRequestCategoriesInner`

NewCoreCourseCreateCategoriesRequestCategoriesInnerWithDefaults instantiates a new CoreCourseCreateCategoriesRequestCategoriesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetName

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetParent

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) GetParent() int32`

GetParent returns the Parent field if non-nil, zero value otherwise.

### GetParentOk

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) GetParentOk() (*int32, bool)`

GetParentOk returns a tuple with the Parent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParent

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) SetParent(v int32)`

SetParent sets Parent field to given value.

### HasParent

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) HasParent() bool`

HasParent returns a boolean if a field has been set.

### GetTheme

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) GetTheme() string`

GetTheme returns the Theme field if non-nil, zero value otherwise.

### GetThemeOk

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) GetThemeOk() (*string, bool)`

GetThemeOk returns a tuple with the Theme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTheme

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) SetTheme(v string)`

SetTheme sets Theme field to given value.

### HasTheme

`func (o *CoreCourseCreateCategoriesRequestCategoriesInner) HasTheme() bool`

HasTheme returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


