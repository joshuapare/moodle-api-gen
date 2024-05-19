# CoreCalendarGetCalendarUpcomingView200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryid** | Pointer to **int32** | categoryid | [optional] [default to 0]
**Courseid** | **int32** | courseid | 
**Date** | [**CoreCalendarGetCalendarDayView200ResponseNextperiod**](CoreCalendarGetCalendarDayView200ResponseNextperiod.md) |  | 
**Defaulteventcontext** | **int32** | defaulteventcontext | [default to 0]
**Events** | [**[]CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner**](CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner.md) |  | 
**FilterSelector** | **string** | filter_selector | 
**Isloggedin** | **bool** | isloggedin | [default to null]

## Methods

### NewCoreCalendarGetCalendarUpcomingView200Response

`func NewCoreCalendarGetCalendarUpcomingView200Response(courseid int32, date CoreCalendarGetCalendarDayView200ResponseNextperiod, defaulteventcontext int32, events []CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner, filterSelector string, isloggedin bool, ) *CoreCalendarGetCalendarUpcomingView200Response`

NewCoreCalendarGetCalendarUpcomingView200Response instantiates a new CoreCalendarGetCalendarUpcomingView200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarUpcomingView200ResponseWithDefaults

`func NewCoreCalendarGetCalendarUpcomingView200ResponseWithDefaults() *CoreCalendarGetCalendarUpcomingView200Response`

NewCoreCalendarGetCalendarUpcomingView200ResponseWithDefaults instantiates a new CoreCalendarGetCalendarUpcomingView200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryid

`func (o *CoreCalendarGetCalendarUpcomingView200Response) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCalendarGetCalendarUpcomingView200Response) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCalendarGetCalendarUpcomingView200Response) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *CoreCalendarGetCalendarUpcomingView200Response) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetCourseid

`func (o *CoreCalendarGetCalendarUpcomingView200Response) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCalendarGetCalendarUpcomingView200Response) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCalendarGetCalendarUpcomingView200Response) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetDate

`func (o *CoreCalendarGetCalendarUpcomingView200Response) GetDate() CoreCalendarGetCalendarDayView200ResponseNextperiod`

GetDate returns the Date field if non-nil, zero value otherwise.

### GetDateOk

`func (o *CoreCalendarGetCalendarUpcomingView200Response) GetDateOk() (*CoreCalendarGetCalendarDayView200ResponseNextperiod, bool)`

GetDateOk returns a tuple with the Date field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDate

`func (o *CoreCalendarGetCalendarUpcomingView200Response) SetDate(v CoreCalendarGetCalendarDayView200ResponseNextperiod)`

SetDate sets Date field to given value.


### GetDefaulteventcontext

`func (o *CoreCalendarGetCalendarUpcomingView200Response) GetDefaulteventcontext() int32`

GetDefaulteventcontext returns the Defaulteventcontext field if non-nil, zero value otherwise.

### GetDefaulteventcontextOk

`func (o *CoreCalendarGetCalendarUpcomingView200Response) GetDefaulteventcontextOk() (*int32, bool)`

GetDefaulteventcontextOk returns a tuple with the Defaulteventcontext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaulteventcontext

`func (o *CoreCalendarGetCalendarUpcomingView200Response) SetDefaulteventcontext(v int32)`

SetDefaulteventcontext sets Defaulteventcontext field to given value.


### GetEvents

`func (o *CoreCalendarGetCalendarUpcomingView200Response) GetEvents() []CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner`

GetEvents returns the Events field if non-nil, zero value otherwise.

### GetEventsOk

`func (o *CoreCalendarGetCalendarUpcomingView200Response) GetEventsOk() (*[]CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner, bool)`

GetEventsOk returns a tuple with the Events field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvents

`func (o *CoreCalendarGetCalendarUpcomingView200Response) SetEvents(v []CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner)`

SetEvents sets Events field to given value.


### GetFilterSelector

`func (o *CoreCalendarGetCalendarUpcomingView200Response) GetFilterSelector() string`

GetFilterSelector returns the FilterSelector field if non-nil, zero value otherwise.

### GetFilterSelectorOk

`func (o *CoreCalendarGetCalendarUpcomingView200Response) GetFilterSelectorOk() (*string, bool)`

GetFilterSelectorOk returns a tuple with the FilterSelector field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterSelector

`func (o *CoreCalendarGetCalendarUpcomingView200Response) SetFilterSelector(v string)`

SetFilterSelector sets FilterSelector field to given value.


### GetIsloggedin

`func (o *CoreCalendarGetCalendarUpcomingView200Response) GetIsloggedin() bool`

GetIsloggedin returns the Isloggedin field if non-nil, zero value otherwise.

### GetIsloggedinOk

`func (o *CoreCalendarGetCalendarUpcomingView200Response) GetIsloggedinOk() (*bool, bool)`

GetIsloggedinOk returns a tuple with the Isloggedin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsloggedin

`func (o *CoreCalendarGetCalendarUpcomingView200Response) SetIsloggedin(v bool)`

SetIsloggedin sets Isloggedin field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


