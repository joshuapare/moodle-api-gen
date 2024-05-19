# CoreCalendarGetCalendarDayView200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryid** | Pointer to **int32** | categoryid | [optional] [default to 0]
**Courseid** | **int32** | courseid | 
**Date** | [**CoreCalendarGetCalendarDayView200ResponseDate**](CoreCalendarGetCalendarDayView200ResponseDate.md) |  | 
**Defaulteventcontext** | **int32** | defaulteventcontext | [default to 0]
**Events** | [**[]CoreCalendarGetCalendarDayView200ResponseEventsInner**](CoreCalendarGetCalendarDayView200ResponseEventsInner.md) |  | 
**FilterSelector** | **string** | filter_selector | [default to "null"]
**Larrow** | **string** | larrow | [default to "null"]
**Neweventtimestamp** | **int32** | neweventtimestamp | [default to null]
**Nextperiod** | [**CoreCalendarGetCalendarDayView200ResponseNextperiod**](CoreCalendarGetCalendarDayView200ResponseNextperiod.md) |  | 
**Nextperiodlink** | **string** | nextperiodlink | [default to "null"]
**Nextperiodname** | **string** | nextperiodname | [default to "null"]
**Periodname** | **string** | periodname | [default to "null"]
**Previousperiod** | [**CoreCalendarGetCalendarDayView200ResponseNextperiod**](CoreCalendarGetCalendarDayView200ResponseNextperiod.md) |  | 
**Previousperiodlink** | **string** | previousperiodlink | [default to "null"]
**Previousperiodname** | **string** | previousperiodname | [default to "null"]
**Rarrow** | **string** | rarrow | [default to "null"]

## Methods

### NewCoreCalendarGetCalendarDayView200Response

`func NewCoreCalendarGetCalendarDayView200Response(courseid int32, date CoreCalendarGetCalendarDayView200ResponseDate, defaulteventcontext int32, events []CoreCalendarGetCalendarDayView200ResponseEventsInner, filterSelector string, larrow string, neweventtimestamp int32, nextperiod CoreCalendarGetCalendarDayView200ResponseNextperiod, nextperiodlink string, nextperiodname string, periodname string, previousperiod CoreCalendarGetCalendarDayView200ResponseNextperiod, previousperiodlink string, previousperiodname string, rarrow string, ) *CoreCalendarGetCalendarDayView200Response`

NewCoreCalendarGetCalendarDayView200Response instantiates a new CoreCalendarGetCalendarDayView200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarDayView200ResponseWithDefaults

`func NewCoreCalendarGetCalendarDayView200ResponseWithDefaults() *CoreCalendarGetCalendarDayView200Response`

NewCoreCalendarGetCalendarDayView200ResponseWithDefaults instantiates a new CoreCalendarGetCalendarDayView200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryid

`func (o *CoreCalendarGetCalendarDayView200Response) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCalendarGetCalendarDayView200Response) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCalendarGetCalendarDayView200Response) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *CoreCalendarGetCalendarDayView200Response) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetCourseid

`func (o *CoreCalendarGetCalendarDayView200Response) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCalendarGetCalendarDayView200Response) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCalendarGetCalendarDayView200Response) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetDate

`func (o *CoreCalendarGetCalendarDayView200Response) GetDate() CoreCalendarGetCalendarDayView200ResponseDate`

GetDate returns the Date field if non-nil, zero value otherwise.

### GetDateOk

`func (o *CoreCalendarGetCalendarDayView200Response) GetDateOk() (*CoreCalendarGetCalendarDayView200ResponseDate, bool)`

GetDateOk returns a tuple with the Date field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDate

`func (o *CoreCalendarGetCalendarDayView200Response) SetDate(v CoreCalendarGetCalendarDayView200ResponseDate)`

SetDate sets Date field to given value.


### GetDefaulteventcontext

`func (o *CoreCalendarGetCalendarDayView200Response) GetDefaulteventcontext() int32`

GetDefaulteventcontext returns the Defaulteventcontext field if non-nil, zero value otherwise.

### GetDefaulteventcontextOk

`func (o *CoreCalendarGetCalendarDayView200Response) GetDefaulteventcontextOk() (*int32, bool)`

GetDefaulteventcontextOk returns a tuple with the Defaulteventcontext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaulteventcontext

`func (o *CoreCalendarGetCalendarDayView200Response) SetDefaulteventcontext(v int32)`

SetDefaulteventcontext sets Defaulteventcontext field to given value.


### GetEvents

`func (o *CoreCalendarGetCalendarDayView200Response) GetEvents() []CoreCalendarGetCalendarDayView200ResponseEventsInner`

GetEvents returns the Events field if non-nil, zero value otherwise.

### GetEventsOk

`func (o *CoreCalendarGetCalendarDayView200Response) GetEventsOk() (*[]CoreCalendarGetCalendarDayView200ResponseEventsInner, bool)`

GetEventsOk returns a tuple with the Events field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvents

`func (o *CoreCalendarGetCalendarDayView200Response) SetEvents(v []CoreCalendarGetCalendarDayView200ResponseEventsInner)`

SetEvents sets Events field to given value.


### GetFilterSelector

`func (o *CoreCalendarGetCalendarDayView200Response) GetFilterSelector() string`

GetFilterSelector returns the FilterSelector field if non-nil, zero value otherwise.

### GetFilterSelectorOk

`func (o *CoreCalendarGetCalendarDayView200Response) GetFilterSelectorOk() (*string, bool)`

GetFilterSelectorOk returns a tuple with the FilterSelector field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterSelector

`func (o *CoreCalendarGetCalendarDayView200Response) SetFilterSelector(v string)`

SetFilterSelector sets FilterSelector field to given value.


### GetLarrow

`func (o *CoreCalendarGetCalendarDayView200Response) GetLarrow() string`

GetLarrow returns the Larrow field if non-nil, zero value otherwise.

### GetLarrowOk

`func (o *CoreCalendarGetCalendarDayView200Response) GetLarrowOk() (*string, bool)`

GetLarrowOk returns a tuple with the Larrow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLarrow

`func (o *CoreCalendarGetCalendarDayView200Response) SetLarrow(v string)`

SetLarrow sets Larrow field to given value.


### GetNeweventtimestamp

`func (o *CoreCalendarGetCalendarDayView200Response) GetNeweventtimestamp() int32`

GetNeweventtimestamp returns the Neweventtimestamp field if non-nil, zero value otherwise.

### GetNeweventtimestampOk

`func (o *CoreCalendarGetCalendarDayView200Response) GetNeweventtimestampOk() (*int32, bool)`

GetNeweventtimestampOk returns a tuple with the Neweventtimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNeweventtimestamp

`func (o *CoreCalendarGetCalendarDayView200Response) SetNeweventtimestamp(v int32)`

SetNeweventtimestamp sets Neweventtimestamp field to given value.


### GetNextperiod

`func (o *CoreCalendarGetCalendarDayView200Response) GetNextperiod() CoreCalendarGetCalendarDayView200ResponseNextperiod`

GetNextperiod returns the Nextperiod field if non-nil, zero value otherwise.

### GetNextperiodOk

`func (o *CoreCalendarGetCalendarDayView200Response) GetNextperiodOk() (*CoreCalendarGetCalendarDayView200ResponseNextperiod, bool)`

GetNextperiodOk returns a tuple with the Nextperiod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextperiod

`func (o *CoreCalendarGetCalendarDayView200Response) SetNextperiod(v CoreCalendarGetCalendarDayView200ResponseNextperiod)`

SetNextperiod sets Nextperiod field to given value.


### GetNextperiodlink

`func (o *CoreCalendarGetCalendarDayView200Response) GetNextperiodlink() string`

GetNextperiodlink returns the Nextperiodlink field if non-nil, zero value otherwise.

### GetNextperiodlinkOk

`func (o *CoreCalendarGetCalendarDayView200Response) GetNextperiodlinkOk() (*string, bool)`

GetNextperiodlinkOk returns a tuple with the Nextperiodlink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextperiodlink

`func (o *CoreCalendarGetCalendarDayView200Response) SetNextperiodlink(v string)`

SetNextperiodlink sets Nextperiodlink field to given value.


### GetNextperiodname

`func (o *CoreCalendarGetCalendarDayView200Response) GetNextperiodname() string`

GetNextperiodname returns the Nextperiodname field if non-nil, zero value otherwise.

### GetNextperiodnameOk

`func (o *CoreCalendarGetCalendarDayView200Response) GetNextperiodnameOk() (*string, bool)`

GetNextperiodnameOk returns a tuple with the Nextperiodname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextperiodname

`func (o *CoreCalendarGetCalendarDayView200Response) SetNextperiodname(v string)`

SetNextperiodname sets Nextperiodname field to given value.


### GetPeriodname

`func (o *CoreCalendarGetCalendarDayView200Response) GetPeriodname() string`

GetPeriodname returns the Periodname field if non-nil, zero value otherwise.

### GetPeriodnameOk

`func (o *CoreCalendarGetCalendarDayView200Response) GetPeriodnameOk() (*string, bool)`

GetPeriodnameOk returns a tuple with the Periodname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPeriodname

`func (o *CoreCalendarGetCalendarDayView200Response) SetPeriodname(v string)`

SetPeriodname sets Periodname field to given value.


### GetPreviousperiod

`func (o *CoreCalendarGetCalendarDayView200Response) GetPreviousperiod() CoreCalendarGetCalendarDayView200ResponseNextperiod`

GetPreviousperiod returns the Previousperiod field if non-nil, zero value otherwise.

### GetPreviousperiodOk

`func (o *CoreCalendarGetCalendarDayView200Response) GetPreviousperiodOk() (*CoreCalendarGetCalendarDayView200ResponseNextperiod, bool)`

GetPreviousperiodOk returns a tuple with the Previousperiod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreviousperiod

`func (o *CoreCalendarGetCalendarDayView200Response) SetPreviousperiod(v CoreCalendarGetCalendarDayView200ResponseNextperiod)`

SetPreviousperiod sets Previousperiod field to given value.


### GetPreviousperiodlink

`func (o *CoreCalendarGetCalendarDayView200Response) GetPreviousperiodlink() string`

GetPreviousperiodlink returns the Previousperiodlink field if non-nil, zero value otherwise.

### GetPreviousperiodlinkOk

`func (o *CoreCalendarGetCalendarDayView200Response) GetPreviousperiodlinkOk() (*string, bool)`

GetPreviousperiodlinkOk returns a tuple with the Previousperiodlink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreviousperiodlink

`func (o *CoreCalendarGetCalendarDayView200Response) SetPreviousperiodlink(v string)`

SetPreviousperiodlink sets Previousperiodlink field to given value.


### GetPreviousperiodname

`func (o *CoreCalendarGetCalendarDayView200Response) GetPreviousperiodname() string`

GetPreviousperiodname returns the Previousperiodname field if non-nil, zero value otherwise.

### GetPreviousperiodnameOk

`func (o *CoreCalendarGetCalendarDayView200Response) GetPreviousperiodnameOk() (*string, bool)`

GetPreviousperiodnameOk returns a tuple with the Previousperiodname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreviousperiodname

`func (o *CoreCalendarGetCalendarDayView200Response) SetPreviousperiodname(v string)`

SetPreviousperiodname sets Previousperiodname field to given value.


### GetRarrow

`func (o *CoreCalendarGetCalendarDayView200Response) GetRarrow() string`

GetRarrow returns the Rarrow field if non-nil, zero value otherwise.

### GetRarrowOk

`func (o *CoreCalendarGetCalendarDayView200Response) GetRarrowOk() (*string, bool)`

GetRarrowOk returns a tuple with the Rarrow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRarrow

`func (o *CoreCalendarGetCalendarDayView200Response) SetRarrow(v string)`

SetRarrow sets Rarrow field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


