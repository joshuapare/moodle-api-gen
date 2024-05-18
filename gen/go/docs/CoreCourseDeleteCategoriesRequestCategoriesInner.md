# CoreCourseDeleteCategoriesRequestCategoriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** | category id to delete | [optional] [default to null]
**Newparent** | Pointer to **int32** | the parent category to move the contents to, if specified | [optional] [default to null]
**Recursive** | Pointer to **bool** | 1: recursively delete all contents inside this                                 category, 0 (default): move contents to newparent or current parent category (except if parent is root) | [optional] [default to 0]

## Methods

### NewCoreCourseDeleteCategoriesRequestCategoriesInner

`func NewCoreCourseDeleteCategoriesRequestCategoriesInner() *CoreCourseDeleteCategoriesRequestCategoriesInner`

NewCoreCourseDeleteCategoriesRequestCategoriesInner instantiates a new CoreCourseDeleteCategoriesRequestCategoriesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseDeleteCategoriesRequestCategoriesInnerWithDefaults

`func NewCoreCourseDeleteCategoriesRequestCategoriesInnerWithDefaults() *CoreCourseDeleteCategoriesRequestCategoriesInner`

NewCoreCourseDeleteCategoriesRequestCategoriesInnerWithDefaults instantiates a new CoreCourseDeleteCategoriesRequestCategoriesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CoreCourseDeleteCategoriesRequestCategoriesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCourseDeleteCategoriesRequestCategoriesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCourseDeleteCategoriesRequestCategoriesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreCourseDeleteCategoriesRequestCategoriesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetNewparent

`func (o *CoreCourseDeleteCategoriesRequestCategoriesInner) GetNewparent() int32`

GetNewparent returns the Newparent field if non-nil, zero value otherwise.

### GetNewparentOk

`func (o *CoreCourseDeleteCategoriesRequestCategoriesInner) GetNewparentOk() (*int32, bool)`

GetNewparentOk returns a tuple with the Newparent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewparent

`func (o *CoreCourseDeleteCategoriesRequestCategoriesInner) SetNewparent(v int32)`

SetNewparent sets Newparent field to given value.

### HasNewparent

`func (o *CoreCourseDeleteCategoriesRequestCategoriesInner) HasNewparent() bool`

HasNewparent returns a boolean if a field has been set.

### GetRecursive

`func (o *CoreCourseDeleteCategoriesRequestCategoriesInner) GetRecursive() bool`

GetRecursive returns the Recursive field if non-nil, zero value otherwise.

### GetRecursiveOk

`func (o *CoreCourseDeleteCategoriesRequestCategoriesInner) GetRecursiveOk() (*bool, bool)`

GetRecursiveOk returns a tuple with the Recursive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecursive

`func (o *CoreCourseDeleteCategoriesRequestCategoriesInner) SetRecursive(v bool)`

SetRecursive sets Recursive field to given value.

### HasRecursive

`func (o *CoreCourseDeleteCategoriesRequestCategoriesInner) HasRecursive() bool`

HasRecursive returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


