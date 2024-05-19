# CoreCalendarGetCalendarMonthlyViewRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryid** | Pointer to **int32** | Category being viewed | [optional] 
**Courseid** | Pointer to **int32** | Course being viewed | [optional] [default to 1]
**Day** | Pointer to **int32** | Day to be viewed | [optional] [default to 1]
**Includenavigation** | Pointer to **bool** | Whether to show course navigation | [optional] [default to true]
**Mini** | Pointer to **bool** | Whether to return the mini month view or not | [optional] [default to false]
**Month** | **int32** | Month to be viewed | 
**View** | Pointer to **string** | The view mode of the calendar | [optional] [default to "month"]
**Year** | **int32** | Year to be viewed | 

## Methods

### NewCoreCalendarGetCalendarMonthlyViewRequest

`func NewCoreCalendarGetCalendarMonthlyViewRequest(month int32, year int32, ) *CoreCalendarGetCalendarMonthlyViewRequest`

NewCoreCalendarGetCalendarMonthlyViewRequest instantiates a new CoreCalendarGetCalendarMonthlyViewRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarMonthlyViewRequestWithDefaults

`func NewCoreCalendarGetCalendarMonthlyViewRequestWithDefaults() *CoreCalendarGetCalendarMonthlyViewRequest`

NewCoreCalendarGetCalendarMonthlyViewRequestWithDefaults instantiates a new CoreCalendarGetCalendarMonthlyViewRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryid

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetCourseid

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetDay

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) GetDay() int32`

GetDay returns the Day field if non-nil, zero value otherwise.

### GetDayOk

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) GetDayOk() (*int32, bool)`

GetDayOk returns a tuple with the Day field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDay

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) SetDay(v int32)`

SetDay sets Day field to given value.

### HasDay

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) HasDay() bool`

HasDay returns a boolean if a field has been set.

### GetIncludenavigation

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) GetIncludenavigation() bool`

GetIncludenavigation returns the Includenavigation field if non-nil, zero value otherwise.

### GetIncludenavigationOk

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) GetIncludenavigationOk() (*bool, bool)`

GetIncludenavigationOk returns a tuple with the Includenavigation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludenavigation

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) SetIncludenavigation(v bool)`

SetIncludenavigation sets Includenavigation field to given value.

### HasIncludenavigation

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) HasIncludenavigation() bool`

HasIncludenavigation returns a boolean if a field has been set.

### GetMini

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) GetMini() bool`

GetMini returns the Mini field if non-nil, zero value otherwise.

### GetMiniOk

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) GetMiniOk() (*bool, bool)`

GetMiniOk returns a tuple with the Mini field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMini

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) SetMini(v bool)`

SetMini sets Mini field to given value.

### HasMini

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) HasMini() bool`

HasMini returns a boolean if a field has been set.

### GetMonth

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) GetMonth() int32`

GetMonth returns the Month field if non-nil, zero value otherwise.

### GetMonthOk

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) GetMonthOk() (*int32, bool)`

GetMonthOk returns a tuple with the Month field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMonth

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) SetMonth(v int32)`

SetMonth sets Month field to given value.


### GetView

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) GetView() string`

GetView returns the View field if non-nil, zero value otherwise.

### GetViewOk

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) GetViewOk() (*string, bool)`

GetViewOk returns a tuple with the View field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetView

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) SetView(v string)`

SetView sets View field to given value.

### HasView

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) HasView() bool`

HasView returns a boolean if a field has been set.

### GetYear

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) GetYear() int32`

GetYear returns the Year field if non-nil, zero value otherwise.

### GetYearOk

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) GetYearOk() (*int32, bool)`

GetYearOk returns a tuple with the Year field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYear

`func (o *CoreCalendarGetCalendarMonthlyViewRequest) SetYear(v int32)`

SetYear sets Year field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


