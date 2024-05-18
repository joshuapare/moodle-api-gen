# CoreCalendarDeleteCalendarEventsRequestEventsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Eventid** | Pointer to **int32** | Event ID | [optional] [default to ]
**Repeat** | Pointer to **bool** | Delete comeplete series if repeated event | [optional] [default to null]

## Methods

### NewCoreCalendarDeleteCalendarEventsRequestEventsInner

`func NewCoreCalendarDeleteCalendarEventsRequestEventsInner() *CoreCalendarDeleteCalendarEventsRequestEventsInner`

NewCoreCalendarDeleteCalendarEventsRequestEventsInner instantiates a new CoreCalendarDeleteCalendarEventsRequestEventsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarDeleteCalendarEventsRequestEventsInnerWithDefaults

`func NewCoreCalendarDeleteCalendarEventsRequestEventsInnerWithDefaults() *CoreCalendarDeleteCalendarEventsRequestEventsInner`

NewCoreCalendarDeleteCalendarEventsRequestEventsInnerWithDefaults instantiates a new CoreCalendarDeleteCalendarEventsRequestEventsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventid

`func (o *CoreCalendarDeleteCalendarEventsRequestEventsInner) GetEventid() int32`

GetEventid returns the Eventid field if non-nil, zero value otherwise.

### GetEventidOk

`func (o *CoreCalendarDeleteCalendarEventsRequestEventsInner) GetEventidOk() (*int32, bool)`

GetEventidOk returns a tuple with the Eventid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventid

`func (o *CoreCalendarDeleteCalendarEventsRequestEventsInner) SetEventid(v int32)`

SetEventid sets Eventid field to given value.

### HasEventid

`func (o *CoreCalendarDeleteCalendarEventsRequestEventsInner) HasEventid() bool`

HasEventid returns a boolean if a field has been set.

### GetRepeat

`func (o *CoreCalendarDeleteCalendarEventsRequestEventsInner) GetRepeat() bool`

GetRepeat returns the Repeat field if non-nil, zero value otherwise.

### GetRepeatOk

`func (o *CoreCalendarDeleteCalendarEventsRequestEventsInner) GetRepeatOk() (*bool, bool)`

GetRepeatOk returns a tuple with the Repeat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepeat

`func (o *CoreCalendarDeleteCalendarEventsRequestEventsInner) SetRepeat(v bool)`

SetRepeat sets Repeat field to given value.

### HasRepeat

`func (o *CoreCalendarDeleteCalendarEventsRequestEventsInner) HasRepeat() bool`

HasRepeat returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


