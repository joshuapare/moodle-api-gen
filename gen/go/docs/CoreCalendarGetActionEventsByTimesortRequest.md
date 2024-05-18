# CoreCalendarGetActionEventsByTimesortRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Aftereventid** | Pointer to **int32** | The last seen event id | [optional] [default to 0]
**Limitnum** | Pointer to **int32** | Limit number | [optional] [default to 20]
**Limittononsuspendedevents** | Pointer to **bool** | Limit the events to courses the user is not suspended in | [optional] [default to false]
**Searchvalue** | Pointer to **string** | The value a user wishes to search against | [optional] 
**Timesortfrom** | Pointer to **int32** | Time sort from | [optional] [default to 0]
**Timesortto** | Pointer to **int32** | Time sort to | [optional] 
**Userid** | Pointer to **int32** | The user id | [optional] [default to null]

## Methods

### NewCoreCalendarGetActionEventsByTimesortRequest

`func NewCoreCalendarGetActionEventsByTimesortRequest() *CoreCalendarGetActionEventsByTimesortRequest`

NewCoreCalendarGetActionEventsByTimesortRequest instantiates a new CoreCalendarGetActionEventsByTimesortRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetActionEventsByTimesortRequestWithDefaults

`func NewCoreCalendarGetActionEventsByTimesortRequestWithDefaults() *CoreCalendarGetActionEventsByTimesortRequest`

NewCoreCalendarGetActionEventsByTimesortRequestWithDefaults instantiates a new CoreCalendarGetActionEventsByTimesortRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAftereventid

`func (o *CoreCalendarGetActionEventsByTimesortRequest) GetAftereventid() int32`

GetAftereventid returns the Aftereventid field if non-nil, zero value otherwise.

### GetAftereventidOk

`func (o *CoreCalendarGetActionEventsByTimesortRequest) GetAftereventidOk() (*int32, bool)`

GetAftereventidOk returns a tuple with the Aftereventid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAftereventid

`func (o *CoreCalendarGetActionEventsByTimesortRequest) SetAftereventid(v int32)`

SetAftereventid sets Aftereventid field to given value.

### HasAftereventid

`func (o *CoreCalendarGetActionEventsByTimesortRequest) HasAftereventid() bool`

HasAftereventid returns a boolean if a field has been set.

### GetLimitnum

`func (o *CoreCalendarGetActionEventsByTimesortRequest) GetLimitnum() int32`

GetLimitnum returns the Limitnum field if non-nil, zero value otherwise.

### GetLimitnumOk

`func (o *CoreCalendarGetActionEventsByTimesortRequest) GetLimitnumOk() (*int32, bool)`

GetLimitnumOk returns a tuple with the Limitnum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitnum

`func (o *CoreCalendarGetActionEventsByTimesortRequest) SetLimitnum(v int32)`

SetLimitnum sets Limitnum field to given value.

### HasLimitnum

`func (o *CoreCalendarGetActionEventsByTimesortRequest) HasLimitnum() bool`

HasLimitnum returns a boolean if a field has been set.

### GetLimittononsuspendedevents

`func (o *CoreCalendarGetActionEventsByTimesortRequest) GetLimittononsuspendedevents() bool`

GetLimittononsuspendedevents returns the Limittononsuspendedevents field if non-nil, zero value otherwise.

### GetLimittononsuspendedeventsOk

`func (o *CoreCalendarGetActionEventsByTimesortRequest) GetLimittononsuspendedeventsOk() (*bool, bool)`

GetLimittononsuspendedeventsOk returns a tuple with the Limittononsuspendedevents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimittononsuspendedevents

`func (o *CoreCalendarGetActionEventsByTimesortRequest) SetLimittononsuspendedevents(v bool)`

SetLimittononsuspendedevents sets Limittononsuspendedevents field to given value.

### HasLimittononsuspendedevents

`func (o *CoreCalendarGetActionEventsByTimesortRequest) HasLimittononsuspendedevents() bool`

HasLimittononsuspendedevents returns a boolean if a field has been set.

### GetSearchvalue

`func (o *CoreCalendarGetActionEventsByTimesortRequest) GetSearchvalue() string`

GetSearchvalue returns the Searchvalue field if non-nil, zero value otherwise.

### GetSearchvalueOk

`func (o *CoreCalendarGetActionEventsByTimesortRequest) GetSearchvalueOk() (*string, bool)`

GetSearchvalueOk returns a tuple with the Searchvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearchvalue

`func (o *CoreCalendarGetActionEventsByTimesortRequest) SetSearchvalue(v string)`

SetSearchvalue sets Searchvalue field to given value.

### HasSearchvalue

`func (o *CoreCalendarGetActionEventsByTimesortRequest) HasSearchvalue() bool`

HasSearchvalue returns a boolean if a field has been set.

### GetTimesortfrom

`func (o *CoreCalendarGetActionEventsByTimesortRequest) GetTimesortfrom() int32`

GetTimesortfrom returns the Timesortfrom field if non-nil, zero value otherwise.

### GetTimesortfromOk

`func (o *CoreCalendarGetActionEventsByTimesortRequest) GetTimesortfromOk() (*int32, bool)`

GetTimesortfromOk returns a tuple with the Timesortfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimesortfrom

`func (o *CoreCalendarGetActionEventsByTimesortRequest) SetTimesortfrom(v int32)`

SetTimesortfrom sets Timesortfrom field to given value.

### HasTimesortfrom

`func (o *CoreCalendarGetActionEventsByTimesortRequest) HasTimesortfrom() bool`

HasTimesortfrom returns a boolean if a field has been set.

### GetTimesortto

`func (o *CoreCalendarGetActionEventsByTimesortRequest) GetTimesortto() int32`

GetTimesortto returns the Timesortto field if non-nil, zero value otherwise.

### GetTimesorttoOk

`func (o *CoreCalendarGetActionEventsByTimesortRequest) GetTimesorttoOk() (*int32, bool)`

GetTimesorttoOk returns a tuple with the Timesortto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimesortto

`func (o *CoreCalendarGetActionEventsByTimesortRequest) SetTimesortto(v int32)`

SetTimesortto sets Timesortto field to given value.

### HasTimesortto

`func (o *CoreCalendarGetActionEventsByTimesortRequest) HasTimesortto() bool`

HasTimesortto returns a boolean if a field has been set.

### GetUserid

`func (o *CoreCalendarGetActionEventsByTimesortRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCalendarGetActionEventsByTimesortRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCalendarGetActionEventsByTimesortRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreCalendarGetActionEventsByTimesortRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


