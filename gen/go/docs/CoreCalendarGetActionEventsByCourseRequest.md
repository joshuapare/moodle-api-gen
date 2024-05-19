# CoreCalendarGetActionEventsByCourseRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Aftereventid** | Pointer to **int32** | The last seen event id | [optional] [default to 0]
**Courseid** | **int32** | Course id | 
**Limitnum** | Pointer to **int32** | Limit number | [optional] [default to 20]
**Searchvalue** | Pointer to **string** | The value a user wishes to search against | [optional] [default to "null"]
**Timesortfrom** | Pointer to **int32** | Time sort from | [optional] [default to null]
**Timesortto** | Pointer to **int32** | Time sort to | [optional] [default to null]

## Methods

### NewCoreCalendarGetActionEventsByCourseRequest

`func NewCoreCalendarGetActionEventsByCourseRequest(courseid int32, ) *CoreCalendarGetActionEventsByCourseRequest`

NewCoreCalendarGetActionEventsByCourseRequest instantiates a new CoreCalendarGetActionEventsByCourseRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetActionEventsByCourseRequestWithDefaults

`func NewCoreCalendarGetActionEventsByCourseRequestWithDefaults() *CoreCalendarGetActionEventsByCourseRequest`

NewCoreCalendarGetActionEventsByCourseRequestWithDefaults instantiates a new CoreCalendarGetActionEventsByCourseRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAftereventid

`func (o *CoreCalendarGetActionEventsByCourseRequest) GetAftereventid() int32`

GetAftereventid returns the Aftereventid field if non-nil, zero value otherwise.

### GetAftereventidOk

`func (o *CoreCalendarGetActionEventsByCourseRequest) GetAftereventidOk() (*int32, bool)`

GetAftereventidOk returns a tuple with the Aftereventid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAftereventid

`func (o *CoreCalendarGetActionEventsByCourseRequest) SetAftereventid(v int32)`

SetAftereventid sets Aftereventid field to given value.

### HasAftereventid

`func (o *CoreCalendarGetActionEventsByCourseRequest) HasAftereventid() bool`

HasAftereventid returns a boolean if a field has been set.

### GetCourseid

`func (o *CoreCalendarGetActionEventsByCourseRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCalendarGetActionEventsByCourseRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCalendarGetActionEventsByCourseRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetLimitnum

`func (o *CoreCalendarGetActionEventsByCourseRequest) GetLimitnum() int32`

GetLimitnum returns the Limitnum field if non-nil, zero value otherwise.

### GetLimitnumOk

`func (o *CoreCalendarGetActionEventsByCourseRequest) GetLimitnumOk() (*int32, bool)`

GetLimitnumOk returns a tuple with the Limitnum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitnum

`func (o *CoreCalendarGetActionEventsByCourseRequest) SetLimitnum(v int32)`

SetLimitnum sets Limitnum field to given value.

### HasLimitnum

`func (o *CoreCalendarGetActionEventsByCourseRequest) HasLimitnum() bool`

HasLimitnum returns a boolean if a field has been set.

### GetSearchvalue

`func (o *CoreCalendarGetActionEventsByCourseRequest) GetSearchvalue() string`

GetSearchvalue returns the Searchvalue field if non-nil, zero value otherwise.

### GetSearchvalueOk

`func (o *CoreCalendarGetActionEventsByCourseRequest) GetSearchvalueOk() (*string, bool)`

GetSearchvalueOk returns a tuple with the Searchvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearchvalue

`func (o *CoreCalendarGetActionEventsByCourseRequest) SetSearchvalue(v string)`

SetSearchvalue sets Searchvalue field to given value.

### HasSearchvalue

`func (o *CoreCalendarGetActionEventsByCourseRequest) HasSearchvalue() bool`

HasSearchvalue returns a boolean if a field has been set.

### GetTimesortfrom

`func (o *CoreCalendarGetActionEventsByCourseRequest) GetTimesortfrom() int32`

GetTimesortfrom returns the Timesortfrom field if non-nil, zero value otherwise.

### GetTimesortfromOk

`func (o *CoreCalendarGetActionEventsByCourseRequest) GetTimesortfromOk() (*int32, bool)`

GetTimesortfromOk returns a tuple with the Timesortfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimesortfrom

`func (o *CoreCalendarGetActionEventsByCourseRequest) SetTimesortfrom(v int32)`

SetTimesortfrom sets Timesortfrom field to given value.

### HasTimesortfrom

`func (o *CoreCalendarGetActionEventsByCourseRequest) HasTimesortfrom() bool`

HasTimesortfrom returns a boolean if a field has been set.

### GetTimesortto

`func (o *CoreCalendarGetActionEventsByCourseRequest) GetTimesortto() int32`

GetTimesortto returns the Timesortto field if non-nil, zero value otherwise.

### GetTimesorttoOk

`func (o *CoreCalendarGetActionEventsByCourseRequest) GetTimesorttoOk() (*int32, bool)`

GetTimesorttoOk returns a tuple with the Timesortto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimesortto

`func (o *CoreCalendarGetActionEventsByCourseRequest) SetTimesortto(v int32)`

SetTimesortto sets Timesortto field to given value.

### HasTimesortto

`func (o *CoreCalendarGetActionEventsByCourseRequest) HasTimesortto() bool`

HasTimesortto returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


