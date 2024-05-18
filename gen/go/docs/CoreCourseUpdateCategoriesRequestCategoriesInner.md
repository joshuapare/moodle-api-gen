# CoreCourseUpdateCategoriesRequestCategoriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **string** | category description | [optional] [default to "null"]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Id** | Pointer to **int32** | course id | [optional] 
**Idnumber** | Pointer to **string** | category id number | [optional] [default to "null"]
**Name** | Pointer to **string** | category name | [optional] 
**Parent** | Pointer to **int32** | parent category id | [optional] [default to null]
**Theme** | Pointer to **string** | the category theme. This option must be enabled on moodle | [optional] [default to "null"]

## Methods

### NewCoreCourseUpdateCategoriesRequestCategoriesInner

`func NewCoreCourseUpdateCategoriesRequestCategoriesInner() *CoreCourseUpdateCategoriesRequestCategoriesInner`

NewCoreCourseUpdateCategoriesRequestCategoriesInner instantiates a new CoreCourseUpdateCategoriesRequestCategoriesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseUpdateCategoriesRequestCategoriesInnerWithDefaults

`func NewCoreCourseUpdateCategoriesRequestCategoriesInnerWithDefaults() *CoreCourseUpdateCategoriesRequestCategoriesInner`

NewCoreCourseUpdateCategoriesRequestCategoriesInnerWithDefaults instantiates a new CoreCourseUpdateCategoriesRequestCategoriesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetId

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetName

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetParent

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) GetParent() int32`

GetParent returns the Parent field if non-nil, zero value otherwise.

### GetParentOk

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) GetParentOk() (*int32, bool)`

GetParentOk returns a tuple with the Parent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParent

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) SetParent(v int32)`

SetParent sets Parent field to given value.

### HasParent

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) HasParent() bool`

HasParent returns a boolean if a field has been set.

### GetTheme

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) GetTheme() string`

GetTheme returns the Theme field if non-nil, zero value otherwise.

### GetThemeOk

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) GetThemeOk() (*string, bool)`

GetThemeOk returns a tuple with the Theme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTheme

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) SetTheme(v string)`

SetTheme sets Theme field to given value.

### HasTheme

`func (o *CoreCourseUpdateCategoriesRequestCategoriesInner) HasTheme() bool`

HasTheme returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


