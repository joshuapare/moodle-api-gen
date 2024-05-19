# CoreCalendarGetActionEventsByCourse200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Events** | [**[]CoreCalendarGetActionEventsByCourse200ResponseEventsInner**](CoreCalendarGetActionEventsByCourse200ResponseEventsInner.md) |  | 
**Firstid** | **int32** | firstid | [default to null]
**Lastid** | **int32** | lastid | [default to null]

## Methods

### NewCoreCalendarGetActionEventsByCourse200Response

`func NewCoreCalendarGetActionEventsByCourse200Response(events []CoreCalendarGetActionEventsByCourse200ResponseEventsInner, firstid int32, lastid int32, ) *CoreCalendarGetActionEventsByCourse200Response`

NewCoreCalendarGetActionEventsByCourse200Response instantiates a new CoreCalendarGetActionEventsByCourse200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetActionEventsByCourse200ResponseWithDefaults

`func NewCoreCalendarGetActionEventsByCourse200ResponseWithDefaults() *CoreCalendarGetActionEventsByCourse200Response`

NewCoreCalendarGetActionEventsByCourse200ResponseWithDefaults instantiates a new CoreCalendarGetActionEventsByCourse200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEvents

`func (o *CoreCalendarGetActionEventsByCourse200Response) GetEvents() []CoreCalendarGetActionEventsByCourse200ResponseEventsInner`

GetEvents returns the Events field if non-nil, zero value otherwise.

### GetEventsOk

`func (o *CoreCalendarGetActionEventsByCourse200Response) GetEventsOk() (*[]CoreCalendarGetActionEventsByCourse200ResponseEventsInner, bool)`

GetEventsOk returns a tuple with the Events field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvents

`func (o *CoreCalendarGetActionEventsByCourse200Response) SetEvents(v []CoreCalendarGetActionEventsByCourse200ResponseEventsInner)`

SetEvents sets Events field to given value.


### GetFirstid

`func (o *CoreCalendarGetActionEventsByCourse200Response) GetFirstid() int32`

GetFirstid returns the Firstid field if non-nil, zero value otherwise.

### GetFirstidOk

`func (o *CoreCalendarGetActionEventsByCourse200Response) GetFirstidOk() (*int32, bool)`

GetFirstidOk returns a tuple with the Firstid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstid

`func (o *CoreCalendarGetActionEventsByCourse200Response) SetFirstid(v int32)`

SetFirstid sets Firstid field to given value.


### GetLastid

`func (o *CoreCalendarGetActionEventsByCourse200Response) GetLastid() int32`

GetLastid returns the Lastid field if non-nil, zero value otherwise.

### GetLastidOk

`func (o *CoreCalendarGetActionEventsByCourse200Response) GetLastidOk() (*int32, bool)`

GetLastidOk returns a tuple with the Lastid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastid

`func (o *CoreCalendarGetActionEventsByCourse200Response) SetLastid(v int32)`

SetLastid sets Lastid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


