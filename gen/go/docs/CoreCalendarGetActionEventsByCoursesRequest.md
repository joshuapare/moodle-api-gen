# CoreCalendarGetActionEventsByCoursesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseids** | **[]map[string]interface{}** |  | 
**Limitnum** | Pointer to **int32** | Limit number | [optional] [default to 10]
**Searchvalue** | Pointer to **string** | The value a user wishes to search against | [optional] 
**Timesortfrom** | Pointer to **int32** | Time sort from | [optional] 
**Timesortto** | Pointer to **int32** | Time sort to | [optional] 

## Methods

### NewCoreCalendarGetActionEventsByCoursesRequest

`func NewCoreCalendarGetActionEventsByCoursesRequest(courseids []map[string]interface{}, ) *CoreCalendarGetActionEventsByCoursesRequest`

NewCoreCalendarGetActionEventsByCoursesRequest instantiates a new CoreCalendarGetActionEventsByCoursesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetActionEventsByCoursesRequestWithDefaults

`func NewCoreCalendarGetActionEventsByCoursesRequestWithDefaults() *CoreCalendarGetActionEventsByCoursesRequest`

NewCoreCalendarGetActionEventsByCoursesRequestWithDefaults instantiates a new CoreCalendarGetActionEventsByCoursesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseids

`func (o *CoreCalendarGetActionEventsByCoursesRequest) GetCourseids() []map[string]interface{}`

GetCourseids returns the Courseids field if non-nil, zero value otherwise.

### GetCourseidsOk

`func (o *CoreCalendarGetActionEventsByCoursesRequest) GetCourseidsOk() (*[]map[string]interface{}, bool)`

GetCourseidsOk returns a tuple with the Courseids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseids

`func (o *CoreCalendarGetActionEventsByCoursesRequest) SetCourseids(v []map[string]interface{})`

SetCourseids sets Courseids field to given value.


### GetLimitnum

`func (o *CoreCalendarGetActionEventsByCoursesRequest) GetLimitnum() int32`

GetLimitnum returns the Limitnum field if non-nil, zero value otherwise.

### GetLimitnumOk

`func (o *CoreCalendarGetActionEventsByCoursesRequest) GetLimitnumOk() (*int32, bool)`

GetLimitnumOk returns a tuple with the Limitnum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitnum

`func (o *CoreCalendarGetActionEventsByCoursesRequest) SetLimitnum(v int32)`

SetLimitnum sets Limitnum field to given value.

### HasLimitnum

`func (o *CoreCalendarGetActionEventsByCoursesRequest) HasLimitnum() bool`

HasLimitnum returns a boolean if a field has been set.

### GetSearchvalue

`func (o *CoreCalendarGetActionEventsByCoursesRequest) GetSearchvalue() string`

GetSearchvalue returns the Searchvalue field if non-nil, zero value otherwise.

### GetSearchvalueOk

`func (o *CoreCalendarGetActionEventsByCoursesRequest) GetSearchvalueOk() (*string, bool)`

GetSearchvalueOk returns a tuple with the Searchvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearchvalue

`func (o *CoreCalendarGetActionEventsByCoursesRequest) SetSearchvalue(v string)`

SetSearchvalue sets Searchvalue field to given value.

### HasSearchvalue

`func (o *CoreCalendarGetActionEventsByCoursesRequest) HasSearchvalue() bool`

HasSearchvalue returns a boolean if a field has been set.

### GetTimesortfrom

`func (o *CoreCalendarGetActionEventsByCoursesRequest) GetTimesortfrom() int32`

GetTimesortfrom returns the Timesortfrom field if non-nil, zero value otherwise.

### GetTimesortfromOk

`func (o *CoreCalendarGetActionEventsByCoursesRequest) GetTimesortfromOk() (*int32, bool)`

GetTimesortfromOk returns a tuple with the Timesortfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimesortfrom

`func (o *CoreCalendarGetActionEventsByCoursesRequest) SetTimesortfrom(v int32)`

SetTimesortfrom sets Timesortfrom field to given value.

### HasTimesortfrom

`func (o *CoreCalendarGetActionEventsByCoursesRequest) HasTimesortfrom() bool`

HasTimesortfrom returns a boolean if a field has been set.

### GetTimesortto

`func (o *CoreCalendarGetActionEventsByCoursesRequest) GetTimesortto() int32`

GetTimesortto returns the Timesortto field if non-nil, zero value otherwise.

### GetTimesorttoOk

`func (o *CoreCalendarGetActionEventsByCoursesRequest) GetTimesorttoOk() (*int32, bool)`

GetTimesorttoOk returns a tuple with the Timesortto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimesortto

`func (o *CoreCalendarGetActionEventsByCoursesRequest) SetTimesortto(v int32)`

SetTimesortto sets Timesortto field to given value.

### HasTimesortto

`func (o *CoreCalendarGetActionEventsByCoursesRequest) HasTimesortto() bool`

HasTimesortto returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


