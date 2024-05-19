# CoreCourseGetCategoriesRequestCriteriaInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | Pointer to **string** | The category column to search, expected keys (value format) are:\&quot;id\&quot; (int) the category id,\&quot;ids\&quot; (string) category ids separated by commas,\&quot;name\&quot; (string) the category name,\&quot;parent\&quot; (int) the parent category id,\&quot;idnumber\&quot; (string) category idnumber - user must have &#39;moodle/category:manage&#39; to search on idnumber,\&quot;visible\&quot; (int) whether the returned categories must be visible or hidden. If the key is not passed,                                              then the function return all categories that the user can see. - user must have &#39;moodle/category:manage&#39; or &#39;moodle/category:viewhiddencategories&#39; to search on visible,\&quot;theme\&quot; (string) only return the categories having this theme - user must have &#39;moodle/category:manage&#39; to search on theme | [optional] [default to "null"]
**Value** | Pointer to **string** | the value to match | [optional] [default to "null"]

## Methods

### NewCoreCourseGetCategoriesRequestCriteriaInner

`func NewCoreCourseGetCategoriesRequestCriteriaInner() *CoreCourseGetCategoriesRequestCriteriaInner`

NewCoreCourseGetCategoriesRequestCriteriaInner instantiates a new CoreCourseGetCategoriesRequestCriteriaInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetCategoriesRequestCriteriaInnerWithDefaults

`func NewCoreCourseGetCategoriesRequestCriteriaInnerWithDefaults() *CoreCourseGetCategoriesRequestCriteriaInner`

NewCoreCourseGetCategoriesRequestCriteriaInnerWithDefaults instantiates a new CoreCourseGetCategoriesRequestCriteriaInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKey

`func (o *CoreCourseGetCategoriesRequestCriteriaInner) GetKey() string`

GetKey returns the Key field if non-nil, zero value otherwise.

### GetKeyOk

`func (o *CoreCourseGetCategoriesRequestCriteriaInner) GetKeyOk() (*string, bool)`

GetKeyOk returns a tuple with the Key field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKey

`func (o *CoreCourseGetCategoriesRequestCriteriaInner) SetKey(v string)`

SetKey sets Key field to given value.

### HasKey

`func (o *CoreCourseGetCategoriesRequestCriteriaInner) HasKey() bool`

HasKey returns a boolean if a field has been set.

### GetValue

`func (o *CoreCourseGetCategoriesRequestCriteriaInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *CoreCourseGetCategoriesRequestCriteriaInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *CoreCourseGetCategoriesRequestCriteriaInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *CoreCourseGetCategoriesRequestCriteriaInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


