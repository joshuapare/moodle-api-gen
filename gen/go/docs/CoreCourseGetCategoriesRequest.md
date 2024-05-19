# CoreCourseGetCategoriesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Addsubcategories** | Pointer to **bool** | return the sub categories infos                                           (1 - default) otherwise only the category info (0) | [optional] [default to 1]
**Criteria** | Pointer to [**[]CoreCourseGetCategoriesRequestCriteriaInner**](CoreCourseGetCategoriesRequestCriteriaInner.md) |  | [optional] 

## Methods

### NewCoreCourseGetCategoriesRequest

`func NewCoreCourseGetCategoriesRequest() *CoreCourseGetCategoriesRequest`

NewCoreCourseGetCategoriesRequest instantiates a new CoreCourseGetCategoriesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetCategoriesRequestWithDefaults

`func NewCoreCourseGetCategoriesRequestWithDefaults() *CoreCourseGetCategoriesRequest`

NewCoreCourseGetCategoriesRequestWithDefaults instantiates a new CoreCourseGetCategoriesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddsubcategories

`func (o *CoreCourseGetCategoriesRequest) GetAddsubcategories() bool`

GetAddsubcategories returns the Addsubcategories field if non-nil, zero value otherwise.

### GetAddsubcategoriesOk

`func (o *CoreCourseGetCategoriesRequest) GetAddsubcategoriesOk() (*bool, bool)`

GetAddsubcategoriesOk returns a tuple with the Addsubcategories field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddsubcategories

`func (o *CoreCourseGetCategoriesRequest) SetAddsubcategories(v bool)`

SetAddsubcategories sets Addsubcategories field to given value.

### HasAddsubcategories

`func (o *CoreCourseGetCategoriesRequest) HasAddsubcategories() bool`

HasAddsubcategories returns a boolean if a field has been set.

### GetCriteria

`func (o *CoreCourseGetCategoriesRequest) GetCriteria() []CoreCourseGetCategoriesRequestCriteriaInner`

GetCriteria returns the Criteria field if non-nil, zero value otherwise.

### GetCriteriaOk

`func (o *CoreCourseGetCategoriesRequest) GetCriteriaOk() (*[]CoreCourseGetCategoriesRequestCriteriaInner, bool)`

GetCriteriaOk returns a tuple with the Criteria field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCriteria

`func (o *CoreCourseGetCategoriesRequest) SetCriteria(v []CoreCourseGetCategoriesRequestCriteriaInner)`

SetCriteria sets Criteria field to given value.

### HasCriteria

`func (o *CoreCourseGetCategoriesRequest) HasCriteria() bool`

HasCriteria returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


