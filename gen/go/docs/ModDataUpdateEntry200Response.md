# ModDataUpdateEntry200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Fieldnotifications** | [**[]ModDataUpdateEntry200ResponseFieldnotificationsInner**](ModDataUpdateEntry200ResponseFieldnotificationsInner.md) |  | 
**Generalnotifications** | **[]map[string]interface{}** |  | 
**Updated** | **bool** | True if the entry was successfully updated, false other wise. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModDataUpdateEntry200Response

`func NewModDataUpdateEntry200Response(fieldnotifications []ModDataUpdateEntry200ResponseFieldnotificationsInner, generalnotifications []map[string]interface{}, updated bool, ) *ModDataUpdateEntry200Response`

NewModDataUpdateEntry200Response instantiates a new ModDataUpdateEntry200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataUpdateEntry200ResponseWithDefaults

`func NewModDataUpdateEntry200ResponseWithDefaults() *ModDataUpdateEntry200Response`

NewModDataUpdateEntry200ResponseWithDefaults instantiates a new ModDataUpdateEntry200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFieldnotifications

`func (o *ModDataUpdateEntry200Response) GetFieldnotifications() []ModDataUpdateEntry200ResponseFieldnotificationsInner`

GetFieldnotifications returns the Fieldnotifications field if non-nil, zero value otherwise.

### GetFieldnotificationsOk

`func (o *ModDataUpdateEntry200Response) GetFieldnotificationsOk() (*[]ModDataUpdateEntry200ResponseFieldnotificationsInner, bool)`

GetFieldnotificationsOk returns a tuple with the Fieldnotifications field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFieldnotifications

`func (o *ModDataUpdateEntry200Response) SetFieldnotifications(v []ModDataUpdateEntry200ResponseFieldnotificationsInner)`

SetFieldnotifications sets Fieldnotifications field to given value.


### GetGeneralnotifications

`func (o *ModDataUpdateEntry200Response) GetGeneralnotifications() []map[string]interface{}`

GetGeneralnotifications returns the Generalnotifications field if non-nil, zero value otherwise.

### GetGeneralnotificationsOk

`func (o *ModDataUpdateEntry200Response) GetGeneralnotificationsOk() (*[]map[string]interface{}, bool)`

GetGeneralnotificationsOk returns a tuple with the Generalnotifications field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneralnotifications

`func (o *ModDataUpdateEntry200Response) SetGeneralnotifications(v []map[string]interface{})`

SetGeneralnotifications sets Generalnotifications field to given value.


### GetUpdated

`func (o *ModDataUpdateEntry200Response) GetUpdated() bool`

GetUpdated returns the Updated field if non-nil, zero value otherwise.

### GetUpdatedOk

`func (o *ModDataUpdateEntry200Response) GetUpdatedOk() (*bool, bool)`

GetUpdatedOk returns a tuple with the Updated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdated

`func (o *ModDataUpdateEntry200Response) SetUpdated(v bool)`

SetUpdated sets Updated field to given value.


### GetWarnings

`func (o *ModDataUpdateEntry200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModDataUpdateEntry200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModDataUpdateEntry200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModDataUpdateEntry200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


