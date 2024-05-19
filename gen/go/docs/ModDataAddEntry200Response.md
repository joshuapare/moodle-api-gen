# ModDataAddEntry200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Fieldnotifications** | [**[]ModDataAddEntry200ResponseFieldnotificationsInner**](ModDataAddEntry200ResponseFieldnotificationsInner.md) |  | 
**Generalnotifications** | **[]map[string]interface{}** |  | 
**Newentryid** | **int32** | True new created entry id. 0 if the entry was not created. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModDataAddEntry200Response

`func NewModDataAddEntry200Response(fieldnotifications []ModDataAddEntry200ResponseFieldnotificationsInner, generalnotifications []map[string]interface{}, newentryid int32, ) *ModDataAddEntry200Response`

NewModDataAddEntry200Response instantiates a new ModDataAddEntry200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataAddEntry200ResponseWithDefaults

`func NewModDataAddEntry200ResponseWithDefaults() *ModDataAddEntry200Response`

NewModDataAddEntry200ResponseWithDefaults instantiates a new ModDataAddEntry200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFieldnotifications

`func (o *ModDataAddEntry200Response) GetFieldnotifications() []ModDataAddEntry200ResponseFieldnotificationsInner`

GetFieldnotifications returns the Fieldnotifications field if non-nil, zero value otherwise.

### GetFieldnotificationsOk

`func (o *ModDataAddEntry200Response) GetFieldnotificationsOk() (*[]ModDataAddEntry200ResponseFieldnotificationsInner, bool)`

GetFieldnotificationsOk returns a tuple with the Fieldnotifications field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFieldnotifications

`func (o *ModDataAddEntry200Response) SetFieldnotifications(v []ModDataAddEntry200ResponseFieldnotificationsInner)`

SetFieldnotifications sets Fieldnotifications field to given value.


### GetGeneralnotifications

`func (o *ModDataAddEntry200Response) GetGeneralnotifications() []map[string]interface{}`

GetGeneralnotifications returns the Generalnotifications field if non-nil, zero value otherwise.

### GetGeneralnotificationsOk

`func (o *ModDataAddEntry200Response) GetGeneralnotificationsOk() (*[]map[string]interface{}, bool)`

GetGeneralnotificationsOk returns a tuple with the Generalnotifications field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneralnotifications

`func (o *ModDataAddEntry200Response) SetGeneralnotifications(v []map[string]interface{})`

SetGeneralnotifications sets Generalnotifications field to given value.


### GetNewentryid

`func (o *ModDataAddEntry200Response) GetNewentryid() int32`

GetNewentryid returns the Newentryid field if non-nil, zero value otherwise.

### GetNewentryidOk

`func (o *ModDataAddEntry200Response) GetNewentryidOk() (*int32, bool)`

GetNewentryidOk returns a tuple with the Newentryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewentryid

`func (o *ModDataAddEntry200Response) SetNewentryid(v int32)`

SetNewentryid sets Newentryid field to given value.


### GetWarnings

`func (o *ModDataAddEntry200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModDataAddEntry200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModDataAddEntry200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModDataAddEntry200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


