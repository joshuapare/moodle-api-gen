# CoreSearchViewResultsRequestFilters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Areaids** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Courseids** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Timeend** | Pointer to **int32** | docs modified before this date | [optional] [default to 0]
**Timestart** | Pointer to **int32** | docs modified after this date | [optional] [default to 0]
**Title** | Pointer to **string** | result title | [optional] 

## Methods

### NewCoreSearchViewResultsRequestFilters

`func NewCoreSearchViewResultsRequestFilters() *CoreSearchViewResultsRequestFilters`

NewCoreSearchViewResultsRequestFilters instantiates a new CoreSearchViewResultsRequestFilters object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreSearchViewResultsRequestFiltersWithDefaults

`func NewCoreSearchViewResultsRequestFiltersWithDefaults() *CoreSearchViewResultsRequestFilters`

NewCoreSearchViewResultsRequestFiltersWithDefaults instantiates a new CoreSearchViewResultsRequestFilters object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAreaids

`func (o *CoreSearchViewResultsRequestFilters) GetAreaids() []map[string]interface{}`

GetAreaids returns the Areaids field if non-nil, zero value otherwise.

### GetAreaidsOk

`func (o *CoreSearchViewResultsRequestFilters) GetAreaidsOk() (*[]map[string]interface{}, bool)`

GetAreaidsOk returns a tuple with the Areaids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAreaids

`func (o *CoreSearchViewResultsRequestFilters) SetAreaids(v []map[string]interface{})`

SetAreaids sets Areaids field to given value.

### HasAreaids

`func (o *CoreSearchViewResultsRequestFilters) HasAreaids() bool`

HasAreaids returns a boolean if a field has been set.

### GetCourseids

`func (o *CoreSearchViewResultsRequestFilters) GetCourseids() []map[string]interface{}`

GetCourseids returns the Courseids field if non-nil, zero value otherwise.

### GetCourseidsOk

`func (o *CoreSearchViewResultsRequestFilters) GetCourseidsOk() (*[]map[string]interface{}, bool)`

GetCourseidsOk returns a tuple with the Courseids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseids

`func (o *CoreSearchViewResultsRequestFilters) SetCourseids(v []map[string]interface{})`

SetCourseids sets Courseids field to given value.

### HasCourseids

`func (o *CoreSearchViewResultsRequestFilters) HasCourseids() bool`

HasCourseids returns a boolean if a field has been set.

### GetTimeend

`func (o *CoreSearchViewResultsRequestFilters) GetTimeend() int32`

GetTimeend returns the Timeend field if non-nil, zero value otherwise.

### GetTimeendOk

`func (o *CoreSearchViewResultsRequestFilters) GetTimeendOk() (*int32, bool)`

GetTimeendOk returns a tuple with the Timeend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeend

`func (o *CoreSearchViewResultsRequestFilters) SetTimeend(v int32)`

SetTimeend sets Timeend field to given value.

### HasTimeend

`func (o *CoreSearchViewResultsRequestFilters) HasTimeend() bool`

HasTimeend returns a boolean if a field has been set.

### GetTimestart

`func (o *CoreSearchViewResultsRequestFilters) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *CoreSearchViewResultsRequestFilters) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *CoreSearchViewResultsRequestFilters) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.

### HasTimestart

`func (o *CoreSearchViewResultsRequestFilters) HasTimestart() bool`

HasTimestart returns a boolean if a field has been set.

### GetTitle

`func (o *CoreSearchViewResultsRequestFilters) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *CoreSearchViewResultsRequestFilters) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *CoreSearchViewResultsRequestFilters) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *CoreSearchViewResultsRequestFilters) HasTitle() bool`

HasTitle returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


