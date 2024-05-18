# CoreSearchGetTopResultsRequestFilters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Areaids** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Cat** | Pointer to **string** | category to filter areas | [optional] [default to ""]
**Contextids** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Courseids** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Groupids** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Mycoursesonly** | Pointer to **bool** | only results from my courses | [optional] [default to false]
**Order** | Pointer to **string** | how to order | [optional] [default to ""]
**Timeend** | Pointer to **int32** | docs modified before this date | [optional] [default to 0]
**Timestart** | Pointer to **int32** | docs modified after this date | [optional] [default to 0]
**Title** | Pointer to **string** | result title | [optional] 
**Userids** | Pointer to **[]map[string]interface{}** |  | [optional] 

## Methods

### NewCoreSearchGetTopResultsRequestFilters

`func NewCoreSearchGetTopResultsRequestFilters() *CoreSearchGetTopResultsRequestFilters`

NewCoreSearchGetTopResultsRequestFilters instantiates a new CoreSearchGetTopResultsRequestFilters object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreSearchGetTopResultsRequestFiltersWithDefaults

`func NewCoreSearchGetTopResultsRequestFiltersWithDefaults() *CoreSearchGetTopResultsRequestFilters`

NewCoreSearchGetTopResultsRequestFiltersWithDefaults instantiates a new CoreSearchGetTopResultsRequestFilters object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAreaids

`func (o *CoreSearchGetTopResultsRequestFilters) GetAreaids() []map[string]interface{}`

GetAreaids returns the Areaids field if non-nil, zero value otherwise.

### GetAreaidsOk

`func (o *CoreSearchGetTopResultsRequestFilters) GetAreaidsOk() (*[]map[string]interface{}, bool)`

GetAreaidsOk returns a tuple with the Areaids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAreaids

`func (o *CoreSearchGetTopResultsRequestFilters) SetAreaids(v []map[string]interface{})`

SetAreaids sets Areaids field to given value.

### HasAreaids

`func (o *CoreSearchGetTopResultsRequestFilters) HasAreaids() bool`

HasAreaids returns a boolean if a field has been set.

### GetCat

`func (o *CoreSearchGetTopResultsRequestFilters) GetCat() string`

GetCat returns the Cat field if non-nil, zero value otherwise.

### GetCatOk

`func (o *CoreSearchGetTopResultsRequestFilters) GetCatOk() (*string, bool)`

GetCatOk returns a tuple with the Cat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCat

`func (o *CoreSearchGetTopResultsRequestFilters) SetCat(v string)`

SetCat sets Cat field to given value.

### HasCat

`func (o *CoreSearchGetTopResultsRequestFilters) HasCat() bool`

HasCat returns a boolean if a field has been set.

### GetContextids

`func (o *CoreSearchGetTopResultsRequestFilters) GetContextids() []map[string]interface{}`

GetContextids returns the Contextids field if non-nil, zero value otherwise.

### GetContextidsOk

`func (o *CoreSearchGetTopResultsRequestFilters) GetContextidsOk() (*[]map[string]interface{}, bool)`

GetContextidsOk returns a tuple with the Contextids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextids

`func (o *CoreSearchGetTopResultsRequestFilters) SetContextids(v []map[string]interface{})`

SetContextids sets Contextids field to given value.

### HasContextids

`func (o *CoreSearchGetTopResultsRequestFilters) HasContextids() bool`

HasContextids returns a boolean if a field has been set.

### GetCourseids

`func (o *CoreSearchGetTopResultsRequestFilters) GetCourseids() []map[string]interface{}`

GetCourseids returns the Courseids field if non-nil, zero value otherwise.

### GetCourseidsOk

`func (o *CoreSearchGetTopResultsRequestFilters) GetCourseidsOk() (*[]map[string]interface{}, bool)`

GetCourseidsOk returns a tuple with the Courseids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseids

`func (o *CoreSearchGetTopResultsRequestFilters) SetCourseids(v []map[string]interface{})`

SetCourseids sets Courseids field to given value.

### HasCourseids

`func (o *CoreSearchGetTopResultsRequestFilters) HasCourseids() bool`

HasCourseids returns a boolean if a field has been set.

### GetGroupids

`func (o *CoreSearchGetTopResultsRequestFilters) GetGroupids() []map[string]interface{}`

GetGroupids returns the Groupids field if non-nil, zero value otherwise.

### GetGroupidsOk

`func (o *CoreSearchGetTopResultsRequestFilters) GetGroupidsOk() (*[]map[string]interface{}, bool)`

GetGroupidsOk returns a tuple with the Groupids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupids

`func (o *CoreSearchGetTopResultsRequestFilters) SetGroupids(v []map[string]interface{})`

SetGroupids sets Groupids field to given value.

### HasGroupids

`func (o *CoreSearchGetTopResultsRequestFilters) HasGroupids() bool`

HasGroupids returns a boolean if a field has been set.

### GetMycoursesonly

`func (o *CoreSearchGetTopResultsRequestFilters) GetMycoursesonly() bool`

GetMycoursesonly returns the Mycoursesonly field if non-nil, zero value otherwise.

### GetMycoursesonlyOk

`func (o *CoreSearchGetTopResultsRequestFilters) GetMycoursesonlyOk() (*bool, bool)`

GetMycoursesonlyOk returns a tuple with the Mycoursesonly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMycoursesonly

`func (o *CoreSearchGetTopResultsRequestFilters) SetMycoursesonly(v bool)`

SetMycoursesonly sets Mycoursesonly field to given value.

### HasMycoursesonly

`func (o *CoreSearchGetTopResultsRequestFilters) HasMycoursesonly() bool`

HasMycoursesonly returns a boolean if a field has been set.

### GetOrder

`func (o *CoreSearchGetTopResultsRequestFilters) GetOrder() string`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *CoreSearchGetTopResultsRequestFilters) GetOrderOk() (*string, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *CoreSearchGetTopResultsRequestFilters) SetOrder(v string)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *CoreSearchGetTopResultsRequestFilters) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### GetTimeend

`func (o *CoreSearchGetTopResultsRequestFilters) GetTimeend() int32`

GetTimeend returns the Timeend field if non-nil, zero value otherwise.

### GetTimeendOk

`func (o *CoreSearchGetTopResultsRequestFilters) GetTimeendOk() (*int32, bool)`

GetTimeendOk returns a tuple with the Timeend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeend

`func (o *CoreSearchGetTopResultsRequestFilters) SetTimeend(v int32)`

SetTimeend sets Timeend field to given value.

### HasTimeend

`func (o *CoreSearchGetTopResultsRequestFilters) HasTimeend() bool`

HasTimeend returns a boolean if a field has been set.

### GetTimestart

`func (o *CoreSearchGetTopResultsRequestFilters) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *CoreSearchGetTopResultsRequestFilters) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *CoreSearchGetTopResultsRequestFilters) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.

### HasTimestart

`func (o *CoreSearchGetTopResultsRequestFilters) HasTimestart() bool`

HasTimestart returns a boolean if a field has been set.

### GetTitle

`func (o *CoreSearchGetTopResultsRequestFilters) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *CoreSearchGetTopResultsRequestFilters) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *CoreSearchGetTopResultsRequestFilters) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *CoreSearchGetTopResultsRequestFilters) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetUserids

`func (o *CoreSearchGetTopResultsRequestFilters) GetUserids() []map[string]interface{}`

GetUserids returns the Userids field if non-nil, zero value otherwise.

### GetUseridsOk

`func (o *CoreSearchGetTopResultsRequestFilters) GetUseridsOk() (*[]map[string]interface{}, bool)`

GetUseridsOk returns a tuple with the Userids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserids

`func (o *CoreSearchGetTopResultsRequestFilters) SetUserids(v []map[string]interface{})`

SetUserids sets Userids field to given value.

### HasUserids

`func (o *CoreSearchGetTopResultsRequestFilters) HasUserids() bool`

HasUserids returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


