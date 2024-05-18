# CoreCalendarGetCalendarDayViewRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryid** | Pointer to **int32** | Category being viewed | [optional] [default to null]
**Courseid** | Pointer to **int32** | Course being viewed | [optional] [default to 1]
**Day** | **int32** | Day to be viewed | [default to null]
**Month** | **int32** | Month to be viewed | [default to null]
**Year** | **int32** | Year to be viewed | [default to null]

## Methods

### NewCoreCalendarGetCalendarDayViewRequest

`func NewCoreCalendarGetCalendarDayViewRequest(day int32, month int32, year int32, ) *CoreCalendarGetCalendarDayViewRequest`

NewCoreCalendarGetCalendarDayViewRequest instantiates a new CoreCalendarGetCalendarDayViewRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarDayViewRequestWithDefaults

`func NewCoreCalendarGetCalendarDayViewRequestWithDefaults() *CoreCalendarGetCalendarDayViewRequest`

NewCoreCalendarGetCalendarDayViewRequestWithDefaults instantiates a new CoreCalendarGetCalendarDayViewRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryid

`func (o *CoreCalendarGetCalendarDayViewRequest) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCalendarGetCalendarDayViewRequest) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCalendarGetCalendarDayViewRequest) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *CoreCalendarGetCalendarDayViewRequest) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetCourseid

`func (o *CoreCalendarGetCalendarDayViewRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCalendarGetCalendarDayViewRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCalendarGetCalendarDayViewRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreCalendarGetCalendarDayViewRequest) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetDay

`func (o *CoreCalendarGetCalendarDayViewRequest) GetDay() int32`

GetDay returns the Day field if non-nil, zero value otherwise.

### GetDayOk

`func (o *CoreCalendarGetCalendarDayViewRequest) GetDayOk() (*int32, bool)`

GetDayOk returns a tuple with the Day field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDay

`func (o *CoreCalendarGetCalendarDayViewRequest) SetDay(v int32)`

SetDay sets Day field to given value.


### GetMonth

`func (o *CoreCalendarGetCalendarDayViewRequest) GetMonth() int32`

GetMonth returns the Month field if non-nil, zero value otherwise.

### GetMonthOk

`func (o *CoreCalendarGetCalendarDayViewRequest) GetMonthOk() (*int32, bool)`

GetMonthOk returns a tuple with the Month field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMonth

`func (o *CoreCalendarGetCalendarDayViewRequest) SetMonth(v int32)`

SetMonth sets Month field to given value.


### GetYear

`func (o *CoreCalendarGetCalendarDayViewRequest) GetYear() int32`

GetYear returns the Year field if non-nil, zero value otherwise.

### GetYearOk

`func (o *CoreCalendarGetCalendarDayViewRequest) GetYearOk() (*int32, bool)`

GetYearOk returns a tuple with the Year field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYear

`func (o *CoreCalendarGetCalendarDayViewRequest) SetYear(v int32)`

SetYear sets Year field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


