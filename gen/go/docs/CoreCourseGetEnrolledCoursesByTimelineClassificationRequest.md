# CoreCourseGetEnrolledCoursesByTimelineClassificationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Classification** | **string** | future, inprogress, or past | [default to "null"]
**Customfieldname** | Pointer to **string** | Used when classification &#x3D; customfield | [optional] [default to "null"]
**Customfieldvalue** | Pointer to **string** | Used when classification &#x3D; customfield | [optional] 
**Limit** | Pointer to **int32** | Result set limit | [optional] [default to 0]
**Offset** | Pointer to **int32** | Result set offset | [optional] [default to 0]
**Searchvalue** | Pointer to **string** | The value a user wishes to search against | [optional] 
**Sort** | Pointer to **string** | Sort string | [optional] [default to "null"]

## Methods

### NewCoreCourseGetEnrolledCoursesByTimelineClassificationRequest

`func NewCoreCourseGetEnrolledCoursesByTimelineClassificationRequest(classification string, ) *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest`

NewCoreCourseGetEnrolledCoursesByTimelineClassificationRequest instantiates a new CoreCourseGetEnrolledCoursesByTimelineClassificationRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetEnrolledCoursesByTimelineClassificationRequestWithDefaults

`func NewCoreCourseGetEnrolledCoursesByTimelineClassificationRequestWithDefaults() *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest`

NewCoreCourseGetEnrolledCoursesByTimelineClassificationRequestWithDefaults instantiates a new CoreCourseGetEnrolledCoursesByTimelineClassificationRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClassification

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) GetClassification() string`

GetClassification returns the Classification field if non-nil, zero value otherwise.

### GetClassificationOk

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) GetClassificationOk() (*string, bool)`

GetClassificationOk returns a tuple with the Classification field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClassification

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) SetClassification(v string)`

SetClassification sets Classification field to given value.


### GetCustomfieldname

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) GetCustomfieldname() string`

GetCustomfieldname returns the Customfieldname field if non-nil, zero value otherwise.

### GetCustomfieldnameOk

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) GetCustomfieldnameOk() (*string, bool)`

GetCustomfieldnameOk returns a tuple with the Customfieldname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfieldname

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) SetCustomfieldname(v string)`

SetCustomfieldname sets Customfieldname field to given value.

### HasCustomfieldname

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) HasCustomfieldname() bool`

HasCustomfieldname returns a boolean if a field has been set.

### GetCustomfieldvalue

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) GetCustomfieldvalue() string`

GetCustomfieldvalue returns the Customfieldvalue field if non-nil, zero value otherwise.

### GetCustomfieldvalueOk

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) GetCustomfieldvalueOk() (*string, bool)`

GetCustomfieldvalueOk returns a tuple with the Customfieldvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfieldvalue

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) SetCustomfieldvalue(v string)`

SetCustomfieldvalue sets Customfieldvalue field to given value.

### HasCustomfieldvalue

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) HasCustomfieldvalue() bool`

HasCustomfieldvalue returns a boolean if a field has been set.

### GetLimit

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOffset

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) SetOffset(v int32)`

SetOffset sets Offset field to given value.

### HasOffset

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) HasOffset() bool`

HasOffset returns a boolean if a field has been set.

### GetSearchvalue

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) GetSearchvalue() string`

GetSearchvalue returns the Searchvalue field if non-nil, zero value otherwise.

### GetSearchvalueOk

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) GetSearchvalueOk() (*string, bool)`

GetSearchvalueOk returns a tuple with the Searchvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearchvalue

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) SetSearchvalue(v string)`

SetSearchvalue sets Searchvalue field to given value.

### HasSearchvalue

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) HasSearchvalue() bool`

HasSearchvalue returns a boolean if a field has been set.

### GetSort

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) GetSort() string`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) GetSortOk() (*string, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) SetSort(v string)`

SetSort sets Sort field to given value.

### HasSort

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassificationRequest) HasSort() bool`

HasSort returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


