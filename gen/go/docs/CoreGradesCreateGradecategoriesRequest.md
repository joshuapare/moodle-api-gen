# CoreGradesCreateGradecategoriesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categories** | [**[]CoreGradesCreateGradecategoriesRequestCategoriesInner**](CoreGradesCreateGradecategoriesRequestCategoriesInner.md) |  | 
**Courseid** | **int32** | id of course | [default to null]

## Methods

### NewCoreGradesCreateGradecategoriesRequest

`func NewCoreGradesCreateGradecategoriesRequest(categories []CoreGradesCreateGradecategoriesRequestCategoriesInner, courseid int32, ) *CoreGradesCreateGradecategoriesRequest`

NewCoreGradesCreateGradecategoriesRequest instantiates a new CoreGradesCreateGradecategoriesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesCreateGradecategoriesRequestWithDefaults

`func NewCoreGradesCreateGradecategoriesRequestWithDefaults() *CoreGradesCreateGradecategoriesRequest`

NewCoreGradesCreateGradecategoriesRequestWithDefaults instantiates a new CoreGradesCreateGradecategoriesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategories

`func (o *CoreGradesCreateGradecategoriesRequest) GetCategories() []CoreGradesCreateGradecategoriesRequestCategoriesInner`

GetCategories returns the Categories field if non-nil, zero value otherwise.

### GetCategoriesOk

`func (o *CoreGradesCreateGradecategoriesRequest) GetCategoriesOk() (*[]CoreGradesCreateGradecategoriesRequestCategoriesInner, bool)`

GetCategoriesOk returns a tuple with the Categories field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategories

`func (o *CoreGradesCreateGradecategoriesRequest) SetCategories(v []CoreGradesCreateGradecategoriesRequestCategoriesInner)`

SetCategories sets Categories field to given value.


### GetCourseid

`func (o *CoreGradesCreateGradecategoriesRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreGradesCreateGradecategoriesRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreGradesCreateGradecategoriesRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


