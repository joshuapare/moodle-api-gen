# CoreCalendarGetCalendarEventsRequestOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ignorehidden** | Pointer to **bool** | Ignore hidden events or not | [optional] [default to true]
**Siteevents** | Pointer to **bool** | Set to true to return site events | [optional] [default to true]
**Timeend** | Pointer to **int32** | Time to which the events should be returned. We treat 0 and null as no end | [optional] [default to 0]
**Timestart** | Pointer to **int32** | Time from which events should be returned | [optional] [default to 0]
**Userevents** | Pointer to **bool** | Set to true to return current user&#39;s user events | [optional] [default to true]

## Methods

### NewCoreCalendarGetCalendarEventsRequestOptions

`func NewCoreCalendarGetCalendarEventsRequestOptions() *CoreCalendarGetCalendarEventsRequestOptions`

NewCoreCalendarGetCalendarEventsRequestOptions instantiates a new CoreCalendarGetCalendarEventsRequestOptions object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarEventsRequestOptionsWithDefaults

`func NewCoreCalendarGetCalendarEventsRequestOptionsWithDefaults() *CoreCalendarGetCalendarEventsRequestOptions`

NewCoreCalendarGetCalendarEventsRequestOptionsWithDefaults instantiates a new CoreCalendarGetCalendarEventsRequestOptions object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIgnorehidden

`func (o *CoreCalendarGetCalendarEventsRequestOptions) GetIgnorehidden() bool`

GetIgnorehidden returns the Ignorehidden field if non-nil, zero value otherwise.

### GetIgnorehiddenOk

`func (o *CoreCalendarGetCalendarEventsRequestOptions) GetIgnorehiddenOk() (*bool, bool)`

GetIgnorehiddenOk returns a tuple with the Ignorehidden field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIgnorehidden

`func (o *CoreCalendarGetCalendarEventsRequestOptions) SetIgnorehidden(v bool)`

SetIgnorehidden sets Ignorehidden field to given value.

### HasIgnorehidden

`func (o *CoreCalendarGetCalendarEventsRequestOptions) HasIgnorehidden() bool`

HasIgnorehidden returns a boolean if a field has been set.

### GetSiteevents

`func (o *CoreCalendarGetCalendarEventsRequestOptions) GetSiteevents() bool`

GetSiteevents returns the Siteevents field if non-nil, zero value otherwise.

### GetSiteeventsOk

`func (o *CoreCalendarGetCalendarEventsRequestOptions) GetSiteeventsOk() (*bool, bool)`

GetSiteeventsOk returns a tuple with the Siteevents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSiteevents

`func (o *CoreCalendarGetCalendarEventsRequestOptions) SetSiteevents(v bool)`

SetSiteevents sets Siteevents field to given value.

### HasSiteevents

`func (o *CoreCalendarGetCalendarEventsRequestOptions) HasSiteevents() bool`

HasSiteevents returns a boolean if a field has been set.

### GetTimeend

`func (o *CoreCalendarGetCalendarEventsRequestOptions) GetTimeend() int32`

GetTimeend returns the Timeend field if non-nil, zero value otherwise.

### GetTimeendOk

`func (o *CoreCalendarGetCalendarEventsRequestOptions) GetTimeendOk() (*int32, bool)`

GetTimeendOk returns a tuple with the Timeend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeend

`func (o *CoreCalendarGetCalendarEventsRequestOptions) SetTimeend(v int32)`

SetTimeend sets Timeend field to given value.

### HasTimeend

`func (o *CoreCalendarGetCalendarEventsRequestOptions) HasTimeend() bool`

HasTimeend returns a boolean if a field has been set.

### GetTimestart

`func (o *CoreCalendarGetCalendarEventsRequestOptions) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *CoreCalendarGetCalendarEventsRequestOptions) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *CoreCalendarGetCalendarEventsRequestOptions) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.

### HasTimestart

`func (o *CoreCalendarGetCalendarEventsRequestOptions) HasTimestart() bool`

HasTimestart returns a boolean if a field has been set.

### GetUserevents

`func (o *CoreCalendarGetCalendarEventsRequestOptions) GetUserevents() bool`

GetUserevents returns the Userevents field if non-nil, zero value otherwise.

### GetUsereventsOk

`func (o *CoreCalendarGetCalendarEventsRequestOptions) GetUsereventsOk() (*bool, bool)`

GetUsereventsOk returns a tuple with the Userevents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserevents

`func (o *CoreCalendarGetCalendarEventsRequestOptions) SetUserevents(v bool)`

SetUserevents sets Userevents field to given value.

### HasUserevents

`func (o *CoreCalendarGetCalendarEventsRequestOptions) HasUserevents() bool`

HasUserevents returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


