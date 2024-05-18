# CoreCalendarGetCalendarEventById200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Event** | [**CoreCalendarGetCalendarEventById200ResponseEvent**](CoreCalendarGetCalendarEventById200ResponseEvent.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreCalendarGetCalendarEventById200Response

`func NewCoreCalendarGetCalendarEventById200Response(event CoreCalendarGetCalendarEventById200ResponseEvent, ) *CoreCalendarGetCalendarEventById200Response`

NewCoreCalendarGetCalendarEventById200Response instantiates a new CoreCalendarGetCalendarEventById200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarEventById200ResponseWithDefaults

`func NewCoreCalendarGetCalendarEventById200ResponseWithDefaults() *CoreCalendarGetCalendarEventById200Response`

NewCoreCalendarGetCalendarEventById200ResponseWithDefaults instantiates a new CoreCalendarGetCalendarEventById200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEvent

`func (o *CoreCalendarGetCalendarEventById200Response) GetEvent() CoreCalendarGetCalendarEventById200ResponseEvent`

GetEvent returns the Event field if non-nil, zero value otherwise.

### GetEventOk

`func (o *CoreCalendarGetCalendarEventById200Response) GetEventOk() (*CoreCalendarGetCalendarEventById200ResponseEvent, bool)`

GetEventOk returns a tuple with the Event field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvent

`func (o *CoreCalendarGetCalendarEventById200Response) SetEvent(v CoreCalendarGetCalendarEventById200ResponseEvent)`

SetEvent sets Event field to given value.


### GetWarnings

`func (o *CoreCalendarGetCalendarEventById200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreCalendarGetCalendarEventById200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreCalendarGetCalendarEventById200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreCalendarGetCalendarEventById200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


