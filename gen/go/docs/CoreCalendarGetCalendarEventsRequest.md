# CoreCalendarGetCalendarEventsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Events** | Pointer to [**CoreCalendarGetCalendarEventsRequestEvents**](CoreCalendarGetCalendarEventsRequestEvents.md) |  | [optional] 
**Options** | Pointer to [**CoreCalendarGetCalendarEventsRequestOptions**](CoreCalendarGetCalendarEventsRequestOptions.md) |  | [optional] 

## Methods

### NewCoreCalendarGetCalendarEventsRequest

`func NewCoreCalendarGetCalendarEventsRequest() *CoreCalendarGetCalendarEventsRequest`

NewCoreCalendarGetCalendarEventsRequest instantiates a new CoreCalendarGetCalendarEventsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarEventsRequestWithDefaults

`func NewCoreCalendarGetCalendarEventsRequestWithDefaults() *CoreCalendarGetCalendarEventsRequest`

NewCoreCalendarGetCalendarEventsRequestWithDefaults instantiates a new CoreCalendarGetCalendarEventsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEvents

`func (o *CoreCalendarGetCalendarEventsRequest) GetEvents() CoreCalendarGetCalendarEventsRequestEvents`

GetEvents returns the Events field if non-nil, zero value otherwise.

### GetEventsOk

`func (o *CoreCalendarGetCalendarEventsRequest) GetEventsOk() (*CoreCalendarGetCalendarEventsRequestEvents, bool)`

GetEventsOk returns a tuple with the Events field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvents

`func (o *CoreCalendarGetCalendarEventsRequest) SetEvents(v CoreCalendarGetCalendarEventsRequestEvents)`

SetEvents sets Events field to given value.

### HasEvents

`func (o *CoreCalendarGetCalendarEventsRequest) HasEvents() bool`

HasEvents returns a boolean if a field has been set.

### GetOptions

`func (o *CoreCalendarGetCalendarEventsRequest) GetOptions() CoreCalendarGetCalendarEventsRequestOptions`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *CoreCalendarGetCalendarEventsRequest) GetOptionsOk() (*CoreCalendarGetCalendarEventsRequestOptions, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *CoreCalendarGetCalendarEventsRequest) SetOptions(v CoreCalendarGetCalendarEventsRequestOptions)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *CoreCalendarGetCalendarEventsRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


