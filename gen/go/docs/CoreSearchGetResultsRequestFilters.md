# CoreSearchGetResultsRequestFilters

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
**Title** | Pointer to **string** | result title | [optional] [default to "null"]
**Userids** | Pointer to **[]map[string]interface{}** |  | [optional] 

## Methods

### NewCoreSearchGetResultsRequestFilters

`func NewCoreSearchGetResultsRequestFilters() *CoreSearchGetResultsRequestFilters`

NewCoreSearchGetResultsRequestFilters instantiates a new CoreSearchGetResultsRequestFilters object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreSearchGetResultsRequestFiltersWithDefaults

`func NewCoreSearchGetResultsRequestFiltersWithDefaults() *CoreSearchGetResultsRequestFilters`

NewCoreSearchGetResultsRequestFiltersWithDefaults instantiates a new CoreSearchGetResultsRequestFilters object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAreaids

`func (o *CoreSearchGetResultsRequestFilters) GetAreaids() []map[string]interface{}`

GetAreaids returns the Areaids field if non-nil, zero value otherwise.

### GetAreaidsOk

`func (o *CoreSearchGetResultsRequestFilters) GetAreaidsOk() (*[]map[string]interface{}, bool)`

GetAreaidsOk returns a tuple with the Areaids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAreaids

`func (o *CoreSearchGetResultsRequestFilters) SetAreaids(v []map[string]interface{})`

SetAreaids sets Areaids field to given value.

### HasAreaids

`func (o *CoreSearchGetResultsRequestFilters) HasAreaids() bool`

HasAreaids returns a boolean if a field has been set.

### GetCat

`func (o *CoreSearchGetResultsRequestFilters) GetCat() string`

GetCat returns the Cat field if non-nil, zero value otherwise.

### GetCatOk

`func (o *CoreSearchGetResultsRequestFilters) GetCatOk() (*string, bool)`

GetCatOk returns a tuple with the Cat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCat

`func (o *CoreSearchGetResultsRequestFilters) SetCat(v string)`

SetCat sets Cat field to given value.

### HasCat

`func (o *CoreSearchGetResultsRequestFilters) HasCat() bool`

HasCat returns a boolean if a field has been set.

### GetContextids

`func (o *CoreSearchGetResultsRequestFilters) GetContextids() []map[string]interface{}`

GetContextids returns the Contextids field if non-nil, zero value otherwise.

### GetContextidsOk

`func (o *CoreSearchGetResultsRequestFilters) GetContextidsOk() (*[]map[string]interface{}, bool)`

GetContextidsOk returns a tuple with the Contextids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextids

`func (o *CoreSearchGetResultsRequestFilters) SetContextids(v []map[string]interface{})`

SetContextids sets Contextids field to given value.

### HasContextids

`func (o *CoreSearchGetResultsRequestFilters) HasContextids() bool`

HasContextids returns a boolean if a field has been set.

### GetCourseids

`func (o *CoreSearchGetResultsRequestFilters) GetCourseids() []map[string]interface{}`

GetCourseids returns the Courseids field if non-nil, zero value otherwise.

### GetCourseidsOk

`func (o *CoreSearchGetResultsRequestFilters) GetCourseidsOk() (*[]map[string]interface{}, bool)`

GetCourseidsOk returns a tuple with the Courseids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseids

`func (o *CoreSearchGetResultsRequestFilters) SetCourseids(v []map[string]interface{})`

SetCourseids sets Courseids field to given value.

### HasCourseids

`func (o *CoreSearchGetResultsRequestFilters) HasCourseids() bool`

HasCourseids returns a boolean if a field has been set.

### GetGroupids

`func (o *CoreSearchGetResultsRequestFilters) GetGroupids() []map[string]interface{}`

GetGroupids returns the Groupids field if non-nil, zero value otherwise.

### GetGroupidsOk

`func (o *CoreSearchGetResultsRequestFilters) GetGroupidsOk() (*[]map[string]interface{}, bool)`

GetGroupidsOk returns a tuple with the Groupids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupids

`func (o *CoreSearchGetResultsRequestFilters) SetGroupids(v []map[string]interface{})`

SetGroupids sets Groupids field to given value.

### HasGroupids

`func (o *CoreSearchGetResultsRequestFilters) HasGroupids() bool`

HasGroupids returns a boolean if a field has been set.

### GetMycoursesonly

`func (o *CoreSearchGetResultsRequestFilters) GetMycoursesonly() bool`

GetMycoursesonly returns the Mycoursesonly field if non-nil, zero value otherwise.

### GetMycoursesonlyOk

`func (o *CoreSearchGetResultsRequestFilters) GetMycoursesonlyOk() (*bool, bool)`

GetMycoursesonlyOk returns a tuple with the Mycoursesonly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMycoursesonly

`func (o *CoreSearchGetResultsRequestFilters) SetMycoursesonly(v bool)`

SetMycoursesonly sets Mycoursesonly field to given value.

### HasMycoursesonly

`func (o *CoreSearchGetResultsRequestFilters) HasMycoursesonly() bool`

HasMycoursesonly returns a boolean if a field has been set.

### GetOrder

`func (o *CoreSearchGetResultsRequestFilters) GetOrder() string`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *CoreSearchGetResultsRequestFilters) GetOrderOk() (*string, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *CoreSearchGetResultsRequestFilters) SetOrder(v string)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *CoreSearchGetResultsRequestFilters) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### GetTimeend

`func (o *CoreSearchGetResultsRequestFilters) GetTimeend() int32`

GetTimeend returns the Timeend field if non-nil, zero value otherwise.

### GetTimeendOk

`func (o *CoreSearchGetResultsRequestFilters) GetTimeendOk() (*int32, bool)`

GetTimeendOk returns a tuple with the Timeend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeend

`func (o *CoreSearchGetResultsRequestFilters) SetTimeend(v int32)`

SetTimeend sets Timeend field to given value.

### HasTimeend

`func (o *CoreSearchGetResultsRequestFilters) HasTimeend() bool`

HasTimeend returns a boolean if a field has been set.

### GetTimestart

`func (o *CoreSearchGetResultsRequestFilters) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *CoreSearchGetResultsRequestFilters) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *CoreSearchGetResultsRequestFilters) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.

### HasTimestart

`func (o *CoreSearchGetResultsRequestFilters) HasTimestart() bool`

HasTimestart returns a boolean if a field has been set.

### GetTitle

`func (o *CoreSearchGetResultsRequestFilters) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *CoreSearchGetResultsRequestFilters) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *CoreSearchGetResultsRequestFilters) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *CoreSearchGetResultsRequestFilters) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetUserids

`func (o *CoreSearchGetResultsRequestFilters) GetUserids() []map[string]interface{}`

GetUserids returns the Userids field if non-nil, zero value otherwise.

### GetUseridsOk

`func (o *CoreSearchGetResultsRequestFilters) GetUseridsOk() (*[]map[string]interface{}, bool)`

GetUseridsOk returns a tuple with the Userids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserids

`func (o *CoreSearchGetResultsRequestFilters) SetUserids(v []map[string]interface{})`

SetUserids sets Userids field to given value.

### HasUserids

`func (o *CoreSearchGetResultsRequestFilters) HasUserids() bool`

HasUserids returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


