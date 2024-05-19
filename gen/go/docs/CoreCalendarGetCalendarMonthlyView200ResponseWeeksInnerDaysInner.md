# CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Calendareventtypes** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Daytitle** | Pointer to **string** | daytitle | [optional] [default to "null"]
**Events** | Pointer to [**[]CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner**](CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner.md) |  | [optional] 
**Hasevents** | Pointer to **bool** | hasevents | [optional] [default to false]
**Haslastdayofevent** | Pointer to **bool** | haslastdayofevent | [optional] [default to false]
**Hours** | Pointer to **int32** | hours | [optional] 
**Istoday** | Pointer to **bool** | istoday | [optional] [default to false]
**Isweekend** | Pointer to **bool** | isweekend | [optional] [default to false]
**Mday** | Pointer to **int32** | mday | [optional] 
**Minutes** | Pointer to **int32** | minutes | [optional] 
**Neweventtimestamp** | Pointer to **int32** | neweventtimestamp | [optional] 
**Nextperiod** | Pointer to **int32** | nextperiod | [optional] [default to null]
**Popovertitle** | Pointer to **string** | popovertitle | [optional] [default to ""]
**Previousperiod** | Pointer to **int32** | previousperiod | [optional] [default to null]
**Seconds** | Pointer to **int32** | seconds | [optional] 
**Timestamp** | Pointer to **int32** | timestamp | [optional] 
**Viewdaylink** | Pointer to **string** | viewdaylink | [optional] [default to "null"]
**Viewdaylinktitle** | Pointer to **string** | viewdaylinktitle | [optional] [default to "null"]
**Wday** | Pointer to **int32** | wday | [optional] 
**Yday** | Pointer to **int32** | yday | [optional] 
**Year** | Pointer to **int32** | year | [optional] 

## Methods

### NewCoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner

`func NewCoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner() *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner`

NewCoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner instantiates a new CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerWithDefaults

`func NewCoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerWithDefaults() *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner`

NewCoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerWithDefaults instantiates a new CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCalendareventtypes

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetCalendareventtypes() []map[string]interface{}`

GetCalendareventtypes returns the Calendareventtypes field if non-nil, zero value otherwise.

### GetCalendareventtypesOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetCalendareventtypesOk() (*[]map[string]interface{}, bool)`

GetCalendareventtypesOk returns a tuple with the Calendareventtypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCalendareventtypes

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetCalendareventtypes(v []map[string]interface{})`

SetCalendareventtypes sets Calendareventtypes field to given value.

### HasCalendareventtypes

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasCalendareventtypes() bool`

HasCalendareventtypes returns a boolean if a field has been set.

### GetDaytitle

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetDaytitle() string`

GetDaytitle returns the Daytitle field if non-nil, zero value otherwise.

### GetDaytitleOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetDaytitleOk() (*string, bool)`

GetDaytitleOk returns a tuple with the Daytitle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDaytitle

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetDaytitle(v string)`

SetDaytitle sets Daytitle field to given value.

### HasDaytitle

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasDaytitle() bool`

HasDaytitle returns a boolean if a field has been set.

### GetEvents

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetEvents() []CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner`

GetEvents returns the Events field if non-nil, zero value otherwise.

### GetEventsOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetEventsOk() (*[]CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner, bool)`

GetEventsOk returns a tuple with the Events field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvents

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetEvents(v []CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner)`

SetEvents sets Events field to given value.

### HasEvents

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasEvents() bool`

HasEvents returns a boolean if a field has been set.

### GetHasevents

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetHasevents() bool`

GetHasevents returns the Hasevents field if non-nil, zero value otherwise.

### GetHaseventsOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetHaseventsOk() (*bool, bool)`

GetHaseventsOk returns a tuple with the Hasevents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasevents

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetHasevents(v bool)`

SetHasevents sets Hasevents field to given value.

### HasHasevents

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasHasevents() bool`

HasHasevents returns a boolean if a field has been set.

### GetHaslastdayofevent

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetHaslastdayofevent() bool`

GetHaslastdayofevent returns the Haslastdayofevent field if non-nil, zero value otherwise.

### GetHaslastdayofeventOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetHaslastdayofeventOk() (*bool, bool)`

GetHaslastdayofeventOk returns a tuple with the Haslastdayofevent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHaslastdayofevent

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetHaslastdayofevent(v bool)`

SetHaslastdayofevent sets Haslastdayofevent field to given value.

### HasHaslastdayofevent

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasHaslastdayofevent() bool`

HasHaslastdayofevent returns a boolean if a field has been set.

### GetHours

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetHours() int32`

GetHours returns the Hours field if non-nil, zero value otherwise.

### GetHoursOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetHoursOk() (*int32, bool)`

GetHoursOk returns a tuple with the Hours field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHours

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetHours(v int32)`

SetHours sets Hours field to given value.

### HasHours

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasHours() bool`

HasHours returns a boolean if a field has been set.

### GetIstoday

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetIstoday() bool`

GetIstoday returns the Istoday field if non-nil, zero value otherwise.

### GetIstodayOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetIstodayOk() (*bool, bool)`

GetIstodayOk returns a tuple with the Istoday field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIstoday

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetIstoday(v bool)`

SetIstoday sets Istoday field to given value.

### HasIstoday

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasIstoday() bool`

HasIstoday returns a boolean if a field has been set.

### GetIsweekend

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetIsweekend() bool`

GetIsweekend returns the Isweekend field if non-nil, zero value otherwise.

### GetIsweekendOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetIsweekendOk() (*bool, bool)`

GetIsweekendOk returns a tuple with the Isweekend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsweekend

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetIsweekend(v bool)`

SetIsweekend sets Isweekend field to given value.

### HasIsweekend

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasIsweekend() bool`

HasIsweekend returns a boolean if a field has been set.

### GetMday

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetMday() int32`

GetMday returns the Mday field if non-nil, zero value otherwise.

### GetMdayOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetMdayOk() (*int32, bool)`

GetMdayOk returns a tuple with the Mday field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMday

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetMday(v int32)`

SetMday sets Mday field to given value.

### HasMday

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasMday() bool`

HasMday returns a boolean if a field has been set.

### GetMinutes

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetMinutes() int32`

GetMinutes returns the Minutes field if non-nil, zero value otherwise.

### GetMinutesOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetMinutesOk() (*int32, bool)`

GetMinutesOk returns a tuple with the Minutes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinutes

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetMinutes(v int32)`

SetMinutes sets Minutes field to given value.

### HasMinutes

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasMinutes() bool`

HasMinutes returns a boolean if a field has been set.

### GetNeweventtimestamp

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetNeweventtimestamp() int32`

GetNeweventtimestamp returns the Neweventtimestamp field if non-nil, zero value otherwise.

### GetNeweventtimestampOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetNeweventtimestampOk() (*int32, bool)`

GetNeweventtimestampOk returns a tuple with the Neweventtimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNeweventtimestamp

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetNeweventtimestamp(v int32)`

SetNeweventtimestamp sets Neweventtimestamp field to given value.

### HasNeweventtimestamp

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasNeweventtimestamp() bool`

HasNeweventtimestamp returns a boolean if a field has been set.

### GetNextperiod

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetNextperiod() int32`

GetNextperiod returns the Nextperiod field if non-nil, zero value otherwise.

### GetNextperiodOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetNextperiodOk() (*int32, bool)`

GetNextperiodOk returns a tuple with the Nextperiod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextperiod

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetNextperiod(v int32)`

SetNextperiod sets Nextperiod field to given value.

### HasNextperiod

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasNextperiod() bool`

HasNextperiod returns a boolean if a field has been set.

### GetPopovertitle

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetPopovertitle() string`

GetPopovertitle returns the Popovertitle field if non-nil, zero value otherwise.

### GetPopovertitleOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetPopovertitleOk() (*string, bool)`

GetPopovertitleOk returns a tuple with the Popovertitle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPopovertitle

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetPopovertitle(v string)`

SetPopovertitle sets Popovertitle field to given value.

### HasPopovertitle

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasPopovertitle() bool`

HasPopovertitle returns a boolean if a field has been set.

### GetPreviousperiod

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetPreviousperiod() int32`

GetPreviousperiod returns the Previousperiod field if non-nil, zero value otherwise.

### GetPreviousperiodOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetPreviousperiodOk() (*int32, bool)`

GetPreviousperiodOk returns a tuple with the Previousperiod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreviousperiod

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetPreviousperiod(v int32)`

SetPreviousperiod sets Previousperiod field to given value.

### HasPreviousperiod

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasPreviousperiod() bool`

HasPreviousperiod returns a boolean if a field has been set.

### GetSeconds

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetSeconds() int32`

GetSeconds returns the Seconds field if non-nil, zero value otherwise.

### GetSecondsOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetSecondsOk() (*int32, bool)`

GetSecondsOk returns a tuple with the Seconds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSeconds

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetSeconds(v int32)`

SetSeconds sets Seconds field to given value.

### HasSeconds

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasSeconds() bool`

HasSeconds returns a boolean if a field has been set.

### GetTimestamp

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetTimestamp() int32`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetTimestampOk() (*int32, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetTimestamp(v int32)`

SetTimestamp sets Timestamp field to given value.

### HasTimestamp

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasTimestamp() bool`

HasTimestamp returns a boolean if a field has been set.

### GetViewdaylink

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetViewdaylink() string`

GetViewdaylink returns the Viewdaylink field if non-nil, zero value otherwise.

### GetViewdaylinkOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetViewdaylinkOk() (*string, bool)`

GetViewdaylinkOk returns a tuple with the Viewdaylink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewdaylink

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetViewdaylink(v string)`

SetViewdaylink sets Viewdaylink field to given value.

### HasViewdaylink

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasViewdaylink() bool`

HasViewdaylink returns a boolean if a field has been set.

### GetViewdaylinktitle

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetViewdaylinktitle() string`

GetViewdaylinktitle returns the Viewdaylinktitle field if non-nil, zero value otherwise.

### GetViewdaylinktitleOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetViewdaylinktitleOk() (*string, bool)`

GetViewdaylinktitleOk returns a tuple with the Viewdaylinktitle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewdaylinktitle

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetViewdaylinktitle(v string)`

SetViewdaylinktitle sets Viewdaylinktitle field to given value.

### HasViewdaylinktitle

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasViewdaylinktitle() bool`

HasViewdaylinktitle returns a boolean if a field has been set.

### GetWday

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetWday() int32`

GetWday returns the Wday field if non-nil, zero value otherwise.

### GetWdayOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetWdayOk() (*int32, bool)`

GetWdayOk returns a tuple with the Wday field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWday

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetWday(v int32)`

SetWday sets Wday field to given value.

### HasWday

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasWday() bool`

HasWday returns a boolean if a field has been set.

### GetYday

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetYday() int32`

GetYday returns the Yday field if non-nil, zero value otherwise.

### GetYdayOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetYdayOk() (*int32, bool)`

GetYdayOk returns a tuple with the Yday field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYday

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetYday(v int32)`

SetYday sets Yday field to given value.

### HasYday

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasYday() bool`

HasYday returns a boolean if a field has been set.

### GetYear

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetYear() int32`

GetYear returns the Year field if non-nil, zero value otherwise.

### GetYearOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) GetYearOk() (*int32, bool)`

GetYearOk returns a tuple with the Year field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYear

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) SetYear(v int32)`

SetYear sets Year field to given value.

### HasYear

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) HasYear() bool`

HasYear returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


