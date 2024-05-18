# CoreCalendarCreateCalendarEvents200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Events** | [**[]CoreCalendarCreateCalendarEvents200ResponseEventsInner**](CoreCalendarCreateCalendarEvents200ResponseEventsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreCalendarCreateCalendarEvents200Response

`func NewCoreCalendarCreateCalendarEvents200Response(events []CoreCalendarCreateCalendarEvents200ResponseEventsInner, ) *CoreCalendarCreateCalendarEvents200Response`

NewCoreCalendarCreateCalendarEvents200Response instantiates a new CoreCalendarCreateCalendarEvents200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarCreateCalendarEvents200ResponseWithDefaults

`func NewCoreCalendarCreateCalendarEvents200ResponseWithDefaults() *CoreCalendarCreateCalendarEvents200Response`

NewCoreCalendarCreateCalendarEvents200ResponseWithDefaults instantiates a new CoreCalendarCreateCalendarEvents200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEvents

`func (o *CoreCalendarCreateCalendarEvents200Response) GetEvents() []CoreCalendarCreateCalendarEvents200ResponseEventsInner`

GetEvents returns the Events field if non-nil, zero value otherwise.

### GetEventsOk

`func (o *CoreCalendarCreateCalendarEvents200Response) GetEventsOk() (*[]CoreCalendarCreateCalendarEvents200ResponseEventsInner, bool)`

GetEventsOk returns a tuple with the Events field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvents

`func (o *CoreCalendarCreateCalendarEvents200Response) SetEvents(v []CoreCalendarCreateCalendarEvents200ResponseEventsInner)`

SetEvents sets Events field to given value.


### GetWarnings

`func (o *CoreCalendarCreateCalendarEvents200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreCalendarCreateCalendarEvents200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreCalendarCreateCalendarEvents200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreCalendarCreateCalendarEvents200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


