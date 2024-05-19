# CoreCalendarGetAllowedEventTypes200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Allowedeventtypes** | **[]map[string]interface{}** |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreCalendarGetAllowedEventTypes200Response

`func NewCoreCalendarGetAllowedEventTypes200Response(allowedeventtypes []map[string]interface{}, ) *CoreCalendarGetAllowedEventTypes200Response`

NewCoreCalendarGetAllowedEventTypes200Response instantiates a new CoreCalendarGetAllowedEventTypes200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetAllowedEventTypes200ResponseWithDefaults

`func NewCoreCalendarGetAllowedEventTypes200ResponseWithDefaults() *CoreCalendarGetAllowedEventTypes200Response`

NewCoreCalendarGetAllowedEventTypes200ResponseWithDefaults instantiates a new CoreCalendarGetAllowedEventTypes200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAllowedeventtypes

`func (o *CoreCalendarGetAllowedEventTypes200Response) GetAllowedeventtypes() []map[string]interface{}`

GetAllowedeventtypes returns the Allowedeventtypes field if non-nil, zero value otherwise.

### GetAllowedeventtypesOk

`func (o *CoreCalendarGetAllowedEventTypes200Response) GetAllowedeventtypesOk() (*[]map[string]interface{}, bool)`

GetAllowedeventtypesOk returns a tuple with the Allowedeventtypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowedeventtypes

`func (o *CoreCalendarGetAllowedEventTypes200Response) SetAllowedeventtypes(v []map[string]interface{})`

SetAllowedeventtypes sets Allowedeventtypes field to given value.


### GetWarnings

`func (o *CoreCalendarGetAllowedEventTypes200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreCalendarGetAllowedEventTypes200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreCalendarGetAllowedEventTypes200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreCalendarGetAllowedEventTypes200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


