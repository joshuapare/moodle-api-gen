# CoreCourseSearchCoursesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Criterianame** | **string** | criteria name                                                         (search, modulelist (only admins), blocklist (only admins), tagid) | [default to "null"]
**Criteriavalue** | **string** | criteria value | [default to "null"]
**Limittoenrolled** | Pointer to **bool** | limit to enrolled courses | [optional] [default to 0]
**Onlywithcompletion** | Pointer to **bool** | limit to courses where completion is enabled | [optional] [default to 0]
**Page** | Pointer to **int32** | page number (0 based) | [optional] [default to 0]
**Perpage** | Pointer to **int32** | items per page | [optional] [default to 0]
**Requiredcapabilities** | Pointer to **[]map[string]interface{}** |  | [optional] 

## Methods

### NewCoreCourseSearchCoursesRequest

`func NewCoreCourseSearchCoursesRequest(criterianame string, criteriavalue string, ) *CoreCourseSearchCoursesRequest`

NewCoreCourseSearchCoursesRequest instantiates a new CoreCourseSearchCoursesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseSearchCoursesRequestWithDefaults

`func NewCoreCourseSearchCoursesRequestWithDefaults() *CoreCourseSearchCoursesRequest`

NewCoreCourseSearchCoursesRequestWithDefaults instantiates a new CoreCourseSearchCoursesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCriterianame

`func (o *CoreCourseSearchCoursesRequest) GetCriterianame() string`

GetCriterianame returns the Criterianame field if non-nil, zero value otherwise.

### GetCriterianameOk

`func (o *CoreCourseSearchCoursesRequest) GetCriterianameOk() (*string, bool)`

GetCriterianameOk returns a tuple with the Criterianame field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCriterianame

`func (o *CoreCourseSearchCoursesRequest) SetCriterianame(v string)`

SetCriterianame sets Criterianame field to given value.


### GetCriteriavalue

`func (o *CoreCourseSearchCoursesRequest) GetCriteriavalue() string`

GetCriteriavalue returns the Criteriavalue field if non-nil, zero value otherwise.

### GetCriteriavalueOk

`func (o *CoreCourseSearchCoursesRequest) GetCriteriavalueOk() (*string, bool)`

GetCriteriavalueOk returns a tuple with the Criteriavalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCriteriavalue

`func (o *CoreCourseSearchCoursesRequest) SetCriteriavalue(v string)`

SetCriteriavalue sets Criteriavalue field to given value.


### GetLimittoenrolled

`func (o *CoreCourseSearchCoursesRequest) GetLimittoenrolled() bool`

GetLimittoenrolled returns the Limittoenrolled field if non-nil, zero value otherwise.

### GetLimittoenrolledOk

`func (o *CoreCourseSearchCoursesRequest) GetLimittoenrolledOk() (*bool, bool)`

GetLimittoenrolledOk returns a tuple with the Limittoenrolled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimittoenrolled

`func (o *CoreCourseSearchCoursesRequest) SetLimittoenrolled(v bool)`

SetLimittoenrolled sets Limittoenrolled field to given value.

### HasLimittoenrolled

`func (o *CoreCourseSearchCoursesRequest) HasLimittoenrolled() bool`

HasLimittoenrolled returns a boolean if a field has been set.

### GetOnlywithcompletion

`func (o *CoreCourseSearchCoursesRequest) GetOnlywithcompletion() bool`

GetOnlywithcompletion returns the Onlywithcompletion field if non-nil, zero value otherwise.

### GetOnlywithcompletionOk

`func (o *CoreCourseSearchCoursesRequest) GetOnlywithcompletionOk() (*bool, bool)`

GetOnlywithcompletionOk returns a tuple with the Onlywithcompletion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOnlywithcompletion

`func (o *CoreCourseSearchCoursesRequest) SetOnlywithcompletion(v bool)`

SetOnlywithcompletion sets Onlywithcompletion field to given value.

### HasOnlywithcompletion

`func (o *CoreCourseSearchCoursesRequest) HasOnlywithcompletion() bool`

HasOnlywithcompletion returns a boolean if a field has been set.

### GetPage

`func (o *CoreCourseSearchCoursesRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *CoreCourseSearchCoursesRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *CoreCourseSearchCoursesRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *CoreCourseSearchCoursesRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetPerpage

`func (o *CoreCourseSearchCoursesRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *CoreCourseSearchCoursesRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *CoreCourseSearchCoursesRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.

### HasPerpage

`func (o *CoreCourseSearchCoursesRequest) HasPerpage() bool`

HasPerpage returns a boolean if a field has been set.

### GetRequiredcapabilities

`func (o *CoreCourseSearchCoursesRequest) GetRequiredcapabilities() []map[string]interface{}`

GetRequiredcapabilities returns the Requiredcapabilities field if non-nil, zero value otherwise.

### GetRequiredcapabilitiesOk

`func (o *CoreCourseSearchCoursesRequest) GetRequiredcapabilitiesOk() (*[]map[string]interface{}, bool)`

GetRequiredcapabilitiesOk returns a tuple with the Requiredcapabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequiredcapabilities

`func (o *CoreCourseSearchCoursesRequest) SetRequiredcapabilities(v []map[string]interface{})`

SetRequiredcapabilities sets Requiredcapabilities field to given value.

### HasRequiredcapabilities

`func (o *CoreCourseSearchCoursesRequest) HasRequiredcapabilities() bool`

HasRequiredcapabilities returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


