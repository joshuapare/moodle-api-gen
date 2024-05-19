# CoreCalendarUpdateEventStartDayRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Daytimestamp** | **int32** | Timestamp for the new start day | [default to null]
**Eventid** | **int32** | Id of event to be updated | [default to null]

## Methods

### NewCoreCalendarUpdateEventStartDayRequest

`func NewCoreCalendarUpdateEventStartDayRequest(daytimestamp int32, eventid int32, ) *CoreCalendarUpdateEventStartDayRequest`

NewCoreCalendarUpdateEventStartDayRequest instantiates a new CoreCalendarUpdateEventStartDayRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarUpdateEventStartDayRequestWithDefaults

`func NewCoreCalendarUpdateEventStartDayRequestWithDefaults() *CoreCalendarUpdateEventStartDayRequest`

NewCoreCalendarUpdateEventStartDayRequestWithDefaults instantiates a new CoreCalendarUpdateEventStartDayRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDaytimestamp

`func (o *CoreCalendarUpdateEventStartDayRequest) GetDaytimestamp() int32`

GetDaytimestamp returns the Daytimestamp field if non-nil, zero value otherwise.

### GetDaytimestampOk

`func (o *CoreCalendarUpdateEventStartDayRequest) GetDaytimestampOk() (*int32, bool)`

GetDaytimestampOk returns a tuple with the Daytimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDaytimestamp

`func (o *CoreCalendarUpdateEventStartDayRequest) SetDaytimestamp(v int32)`

SetDaytimestamp sets Daytimestamp field to given value.


### GetEventid

`func (o *CoreCalendarUpdateEventStartDayRequest) GetEventid() int32`

GetEventid returns the Eventid field if non-nil, zero value otherwise.

### GetEventidOk

`func (o *CoreCalendarUpdateEventStartDayRequest) GetEventidOk() (*int32, bool)`

GetEventidOk returns a tuple with the Eventid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventid

`func (o *CoreCalendarUpdateEventStartDayRequest) SetEventid(v int32)`

SetEventid sets Eventid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


