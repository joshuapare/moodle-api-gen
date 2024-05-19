# CoreCalendarGetCalendarMonthlyView200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Calendarinstanceid** | **int32** | calendarinstanceid | [default to 0]
**Categoryid** | Pointer to **int32** | categoryid | [optional] [default to 0]
**Courseid** | **int32** | courseid | 
**Date** | [**CoreCalendarGetCalendarDayView200ResponseNextperiod**](CoreCalendarGetCalendarDayView200ResponseNextperiod.md) |  | 
**Daynames** | [**[]CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner**](CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner.md) |  | 
**Defaulteventcontext** | **int32** | defaulteventcontext | [default to 0]
**FilterSelector** | Pointer to **string** | filter_selector | [optional] 
**Includenavigation** | **bool** | includenavigation | [default to true]
**Initialeventsloaded** | **bool** | initialeventsloaded | [default to true]
**Larrow** | **string** | larrow | 
**Nextperiod** | [**CoreCalendarGetCalendarDayView200ResponseNextperiod**](CoreCalendarGetCalendarDayView200ResponseNextperiod.md) |  | 
**Nextperiodlink** | **string** | nextperiodlink | 
**Nextperiodname** | **string** | nextperiodname | 
**Periodname** | **string** | periodname | 
**Previousperiod** | [**CoreCalendarGetCalendarDayView200ResponseNextperiod**](CoreCalendarGetCalendarDayView200ResponseNextperiod.md) |  | 
**Previousperiodlink** | **string** | previousperiodlink | 
**Previousperiodname** | **string** | previousperiodname | 
**Rarrow** | **string** | rarrow | 
**Showviewselector** | **bool** | showviewselector | [default to true]
**Url** | **string** | url | 
**View** | **string** | view | [default to "null"]
**Viewinginblock** | **bool** | viewinginblock | [default to false]
**Viewingmonth** | **bool** | viewingmonth | [default to true]
**Weeks** | [**[]CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner**](CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner.md) |  | 

## Methods

### NewCoreCalendarGetCalendarMonthlyView200Response

`func NewCoreCalendarGetCalendarMonthlyView200Response(calendarinstanceid int32, courseid int32, date CoreCalendarGetCalendarDayView200ResponseNextperiod, daynames []CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner, defaulteventcontext int32, includenavigation bool, initialeventsloaded bool, larrow string, nextperiod CoreCalendarGetCalendarDayView200ResponseNextperiod, nextperiodlink string, nextperiodname string, periodname string, previousperiod CoreCalendarGetCalendarDayView200ResponseNextperiod, previousperiodlink string, previousperiodname string, rarrow string, showviewselector bool, url string, view string, viewinginblock bool, viewingmonth bool, weeks []CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner, ) *CoreCalendarGetCalendarMonthlyView200Response`

NewCoreCalendarGetCalendarMonthlyView200Response instantiates a new CoreCalendarGetCalendarMonthlyView200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarMonthlyView200ResponseWithDefaults

`func NewCoreCalendarGetCalendarMonthlyView200ResponseWithDefaults() *CoreCalendarGetCalendarMonthlyView200Response`

NewCoreCalendarGetCalendarMonthlyView200ResponseWithDefaults instantiates a new CoreCalendarGetCalendarMonthlyView200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCalendarinstanceid

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetCalendarinstanceid() int32`

GetCalendarinstanceid returns the Calendarinstanceid field if non-nil, zero value otherwise.

### GetCalendarinstanceidOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetCalendarinstanceidOk() (*int32, bool)`

GetCalendarinstanceidOk returns a tuple with the Calendarinstanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCalendarinstanceid

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetCalendarinstanceid(v int32)`

SetCalendarinstanceid sets Calendarinstanceid field to given value.


### GetCategoryid

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *CoreCalendarGetCalendarMonthlyView200Response) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetCourseid

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetDate

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetDate() CoreCalendarGetCalendarDayView200ResponseNextperiod`

GetDate returns the Date field if non-nil, zero value otherwise.

### GetDateOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetDateOk() (*CoreCalendarGetCalendarDayView200ResponseNextperiod, bool)`

GetDateOk returns a tuple with the Date field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDate

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetDate(v CoreCalendarGetCalendarDayView200ResponseNextperiod)`

SetDate sets Date field to given value.


### GetDaynames

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetDaynames() []CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner`

GetDaynames returns the Daynames field if non-nil, zero value otherwise.

### GetDaynamesOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetDaynamesOk() (*[]CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner, bool)`

GetDaynamesOk returns a tuple with the Daynames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDaynames

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetDaynames(v []CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner)`

SetDaynames sets Daynames field to given value.


### GetDefaulteventcontext

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetDefaulteventcontext() int32`

GetDefaulteventcontext returns the Defaulteventcontext field if non-nil, zero value otherwise.

### GetDefaulteventcontextOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetDefaulteventcontextOk() (*int32, bool)`

GetDefaulteventcontextOk returns a tuple with the Defaulteventcontext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaulteventcontext

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetDefaulteventcontext(v int32)`

SetDefaulteventcontext sets Defaulteventcontext field to given value.


### GetFilterSelector

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetFilterSelector() string`

GetFilterSelector returns the FilterSelector field if non-nil, zero value otherwise.

### GetFilterSelectorOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetFilterSelectorOk() (*string, bool)`

GetFilterSelectorOk returns a tuple with the FilterSelector field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterSelector

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetFilterSelector(v string)`

SetFilterSelector sets FilterSelector field to given value.

### HasFilterSelector

`func (o *CoreCalendarGetCalendarMonthlyView200Response) HasFilterSelector() bool`

HasFilterSelector returns a boolean if a field has been set.

### GetIncludenavigation

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetIncludenavigation() bool`

GetIncludenavigation returns the Includenavigation field if non-nil, zero value otherwise.

### GetIncludenavigationOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetIncludenavigationOk() (*bool, bool)`

GetIncludenavigationOk returns a tuple with the Includenavigation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludenavigation

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetIncludenavigation(v bool)`

SetIncludenavigation sets Includenavigation field to given value.


### GetInitialeventsloaded

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetInitialeventsloaded() bool`

GetInitialeventsloaded returns the Initialeventsloaded field if non-nil, zero value otherwise.

### GetInitialeventsloadedOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetInitialeventsloadedOk() (*bool, bool)`

GetInitialeventsloadedOk returns a tuple with the Initialeventsloaded field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInitialeventsloaded

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetInitialeventsloaded(v bool)`

SetInitialeventsloaded sets Initialeventsloaded field to given value.


### GetLarrow

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetLarrow() string`

GetLarrow returns the Larrow field if non-nil, zero value otherwise.

### GetLarrowOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetLarrowOk() (*string, bool)`

GetLarrowOk returns a tuple with the Larrow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLarrow

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetLarrow(v string)`

SetLarrow sets Larrow field to given value.


### GetNextperiod

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetNextperiod() CoreCalendarGetCalendarDayView200ResponseNextperiod`

GetNextperiod returns the Nextperiod field if non-nil, zero value otherwise.

### GetNextperiodOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetNextperiodOk() (*CoreCalendarGetCalendarDayView200ResponseNextperiod, bool)`

GetNextperiodOk returns a tuple with the Nextperiod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextperiod

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetNextperiod(v CoreCalendarGetCalendarDayView200ResponseNextperiod)`

SetNextperiod sets Nextperiod field to given value.


### GetNextperiodlink

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetNextperiodlink() string`

GetNextperiodlink returns the Nextperiodlink field if non-nil, zero value otherwise.

### GetNextperiodlinkOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetNextperiodlinkOk() (*string, bool)`

GetNextperiodlinkOk returns a tuple with the Nextperiodlink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextperiodlink

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetNextperiodlink(v string)`

SetNextperiodlink sets Nextperiodlink field to given value.


### GetNextperiodname

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetNextperiodname() string`

GetNextperiodname returns the Nextperiodname field if non-nil, zero value otherwise.

### GetNextperiodnameOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetNextperiodnameOk() (*string, bool)`

GetNextperiodnameOk returns a tuple with the Nextperiodname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextperiodname

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetNextperiodname(v string)`

SetNextperiodname sets Nextperiodname field to given value.


### GetPeriodname

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetPeriodname() string`

GetPeriodname returns the Periodname field if non-nil, zero value otherwise.

### GetPeriodnameOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetPeriodnameOk() (*string, bool)`

GetPeriodnameOk returns a tuple with the Periodname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPeriodname

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetPeriodname(v string)`

SetPeriodname sets Periodname field to given value.


### GetPreviousperiod

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetPreviousperiod() CoreCalendarGetCalendarDayView200ResponseNextperiod`

GetPreviousperiod returns the Previousperiod field if non-nil, zero value otherwise.

### GetPreviousperiodOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetPreviousperiodOk() (*CoreCalendarGetCalendarDayView200ResponseNextperiod, bool)`

GetPreviousperiodOk returns a tuple with the Previousperiod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreviousperiod

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetPreviousperiod(v CoreCalendarGetCalendarDayView200ResponseNextperiod)`

SetPreviousperiod sets Previousperiod field to given value.


### GetPreviousperiodlink

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetPreviousperiodlink() string`

GetPreviousperiodlink returns the Previousperiodlink field if non-nil, zero value otherwise.

### GetPreviousperiodlinkOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetPreviousperiodlinkOk() (*string, bool)`

GetPreviousperiodlinkOk returns a tuple with the Previousperiodlink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreviousperiodlink

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetPreviousperiodlink(v string)`

SetPreviousperiodlink sets Previousperiodlink field to given value.


### GetPreviousperiodname

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetPreviousperiodname() string`

GetPreviousperiodname returns the Previousperiodname field if non-nil, zero value otherwise.

### GetPreviousperiodnameOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetPreviousperiodnameOk() (*string, bool)`

GetPreviousperiodnameOk returns a tuple with the Previousperiodname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreviousperiodname

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetPreviousperiodname(v string)`

SetPreviousperiodname sets Previousperiodname field to given value.


### GetRarrow

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetRarrow() string`

GetRarrow returns the Rarrow field if non-nil, zero value otherwise.

### GetRarrowOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetRarrowOk() (*string, bool)`

GetRarrowOk returns a tuple with the Rarrow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRarrow

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetRarrow(v string)`

SetRarrow sets Rarrow field to given value.


### GetShowviewselector

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetShowviewselector() bool`

GetShowviewselector returns the Showviewselector field if non-nil, zero value otherwise.

### GetShowviewselectorOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetShowviewselectorOk() (*bool, bool)`

GetShowviewselectorOk returns a tuple with the Showviewselector field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowviewselector

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetShowviewselector(v bool)`

SetShowviewselector sets Showviewselector field to given value.


### GetUrl

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetView

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetView() string`

GetView returns the View field if non-nil, zero value otherwise.

### GetViewOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetViewOk() (*string, bool)`

GetViewOk returns a tuple with the View field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetView

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetView(v string)`

SetView sets View field to given value.


### GetViewinginblock

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetViewinginblock() bool`

GetViewinginblock returns the Viewinginblock field if non-nil, zero value otherwise.

### GetViewinginblockOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetViewinginblockOk() (*bool, bool)`

GetViewinginblockOk returns a tuple with the Viewinginblock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewinginblock

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetViewinginblock(v bool)`

SetViewinginblock sets Viewinginblock field to given value.


### GetViewingmonth

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetViewingmonth() bool`

GetViewingmonth returns the Viewingmonth field if non-nil, zero value otherwise.

### GetViewingmonthOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetViewingmonthOk() (*bool, bool)`

GetViewingmonthOk returns a tuple with the Viewingmonth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewingmonth

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetViewingmonth(v bool)`

SetViewingmonth sets Viewingmonth field to given value.


### GetWeeks

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetWeeks() []CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner`

GetWeeks returns the Weeks field if non-nil, zero value otherwise.

### GetWeeksOk

`func (o *CoreCalendarGetCalendarMonthlyView200Response) GetWeeksOk() (*[]CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner, bool)`

GetWeeksOk returns a tuple with the Weeks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeeks

`func (o *CoreCalendarGetCalendarMonthlyView200Response) SetWeeks(v []CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner)`

SetWeeks sets Weeks field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


