# CoreCalendarSubmitCreateUpdateForm200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Event** | Pointer to [**CoreCalendarGetCalendarEventById200ResponseEvent**](CoreCalendarGetCalendarEventById200ResponseEvent.md) |  | [optional] 
**Validationerror** | Pointer to **bool** | Invalid form data | [optional] [default to false]

## Methods

### NewCoreCalendarSubmitCreateUpdateForm200Response

`func NewCoreCalendarSubmitCreateUpdateForm200Response() *CoreCalendarSubmitCreateUpdateForm200Response`

NewCoreCalendarSubmitCreateUpdateForm200Response instantiates a new CoreCalendarSubmitCreateUpdateForm200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarSubmitCreateUpdateForm200ResponseWithDefaults

`func NewCoreCalendarSubmitCreateUpdateForm200ResponseWithDefaults() *CoreCalendarSubmitCreateUpdateForm200Response`

NewCoreCalendarSubmitCreateUpdateForm200ResponseWithDefaults instantiates a new CoreCalendarSubmitCreateUpdateForm200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEvent

`func (o *CoreCalendarSubmitCreateUpdateForm200Response) GetEvent() CoreCalendarGetCalendarEventById200ResponseEvent`

GetEvent returns the Event field if non-nil, zero value otherwise.

### GetEventOk

`func (o *CoreCalendarSubmitCreateUpdateForm200Response) GetEventOk() (*CoreCalendarGetCalendarEventById200ResponseEvent, bool)`

GetEventOk returns a tuple with the Event field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvent

`func (o *CoreCalendarSubmitCreateUpdateForm200Response) SetEvent(v CoreCalendarGetCalendarEventById200ResponseEvent)`

SetEvent sets Event field to given value.

### HasEvent

`func (o *CoreCalendarSubmitCreateUpdateForm200Response) HasEvent() bool`

HasEvent returns a boolean if a field has been set.

### GetValidationerror

`func (o *CoreCalendarSubmitCreateUpdateForm200Response) GetValidationerror() bool`

GetValidationerror returns the Validationerror field if non-nil, zero value otherwise.

### GetValidationerrorOk

`func (o *CoreCalendarSubmitCreateUpdateForm200Response) GetValidationerrorOk() (*bool, bool)`

GetValidationerrorOk returns a tuple with the Validationerror field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidationerror

`func (o *CoreCalendarSubmitCreateUpdateForm200Response) SetValidationerror(v bool)`

SetValidationerror sets Validationerror field to given value.

### HasValidationerror

`func (o *CoreCalendarSubmitCreateUpdateForm200Response) HasValidationerror() bool`

HasValidationerror returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


