# CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Classification** | **string** | future, inprogress, or past | 
**Customfieldname** | Pointer to **string** | Used when classification &#x3D; customfield | [optional] 
**Customfieldvalue** | Pointer to **string** | Used when classification &#x3D; customfield | [optional] 
**Eventsfrom** | Pointer to **int32** | Optional starting timestamp for action events | [optional] [default to null]
**Eventsto** | Pointer to **int32** | Optional ending timestamp for action events | [optional] [default to null]
**Limit** | Pointer to **int32** | Result set limit | [optional] [default to 0]
**Offset** | Pointer to **int32** | Result set offset | [optional] [default to 0]
**Searchvalue** | Pointer to **string** | The value a user wishes to search against | [optional] 
**Sort** | Pointer to **string** | Sort string | [optional] 

## Methods

### NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest

`func NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest(classification string, ) *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest`

NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest instantiates a new CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequestWithDefaults

`func NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequestWithDefaults() *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest`

NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequestWithDefaults instantiates a new CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClassification

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetClassification() string`

GetClassification returns the Classification field if non-nil, zero value otherwise.

### GetClassificationOk

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetClassificationOk() (*string, bool)`

GetClassificationOk returns a tuple with the Classification field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClassification

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetClassification(v string)`

SetClassification sets Classification field to given value.


### GetCustomfieldname

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetCustomfieldname() string`

GetCustomfieldname returns the Customfieldname field if non-nil, zero value otherwise.

### GetCustomfieldnameOk

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetCustomfieldnameOk() (*string, bool)`

GetCustomfieldnameOk returns a tuple with the Customfieldname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfieldname

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetCustomfieldname(v string)`

SetCustomfieldname sets Customfieldname field to given value.

### HasCustomfieldname

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) HasCustomfieldname() bool`

HasCustomfieldname returns a boolean if a field has been set.

### GetCustomfieldvalue

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetCustomfieldvalue() string`

GetCustomfieldvalue returns the Customfieldvalue field if non-nil, zero value otherwise.

### GetCustomfieldvalueOk

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetCustomfieldvalueOk() (*string, bool)`

GetCustomfieldvalueOk returns a tuple with the Customfieldvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfieldvalue

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetCustomfieldvalue(v string)`

SetCustomfieldvalue sets Customfieldvalue field to given value.

### HasCustomfieldvalue

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) HasCustomfieldvalue() bool`

HasCustomfieldvalue returns a boolean if a field has been set.

### GetEventsfrom

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetEventsfrom() int32`

GetEventsfrom returns the Eventsfrom field if non-nil, zero value otherwise.

### GetEventsfromOk

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetEventsfromOk() (*int32, bool)`

GetEventsfromOk returns a tuple with the Eventsfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventsfrom

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetEventsfrom(v int32)`

SetEventsfrom sets Eventsfrom field to given value.

### HasEventsfrom

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) HasEventsfrom() bool`

HasEventsfrom returns a boolean if a field has been set.

### GetEventsto

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetEventsto() int32`

GetEventsto returns the Eventsto field if non-nil, zero value otherwise.

### GetEventstoOk

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetEventstoOk() (*int32, bool)`

GetEventstoOk returns a tuple with the Eventsto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventsto

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetEventsto(v int32)`

SetEventsto sets Eventsto field to given value.

### HasEventsto

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) HasEventsto() bool`

HasEventsto returns a boolean if a field has been set.

### GetLimit

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOffset

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetOffset(v int32)`

SetOffset sets Offset field to given value.

### HasOffset

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) HasOffset() bool`

HasOffset returns a boolean if a field has been set.

### GetSearchvalue

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetSearchvalue() string`

GetSearchvalue returns the Searchvalue field if non-nil, zero value otherwise.

### GetSearchvalueOk

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetSearchvalueOk() (*string, bool)`

GetSearchvalueOk returns a tuple with the Searchvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearchvalue

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetSearchvalue(v string)`

SetSearchvalue sets Searchvalue field to given value.

### HasSearchvalue

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) HasSearchvalue() bool`

HasSearchvalue returns a boolean if a field has been set.

### GetSort

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetSort() string`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetSortOk() (*string, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetSort(v string)`

SetSort sets Sort field to given value.

### HasSort

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) HasSort() bool`

HasSort returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


