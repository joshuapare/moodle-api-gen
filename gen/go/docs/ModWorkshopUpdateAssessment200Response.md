# ModWorkshopUpdateAssessment200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Rawgrade** | Pointer to **float32** | Raw percentual grade (0.00000 to 100.00000) for submission. | [optional] [default to null]
**Status** | **bool** | status: true if the assessment was added or updated false otherwise. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModWorkshopUpdateAssessment200Response

`func NewModWorkshopUpdateAssessment200Response(status bool, ) *ModWorkshopUpdateAssessment200Response`

NewModWorkshopUpdateAssessment200Response instantiates a new ModWorkshopUpdateAssessment200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopUpdateAssessment200ResponseWithDefaults

`func NewModWorkshopUpdateAssessment200ResponseWithDefaults() *ModWorkshopUpdateAssessment200Response`

NewModWorkshopUpdateAssessment200ResponseWithDefaults instantiates a new ModWorkshopUpdateAssessment200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRawgrade

`func (o *ModWorkshopUpdateAssessment200Response) GetRawgrade() float32`

GetRawgrade returns the Rawgrade field if non-nil, zero value otherwise.

### GetRawgradeOk

`func (o *ModWorkshopUpdateAssessment200Response) GetRawgradeOk() (*float32, bool)`

GetRawgradeOk returns a tuple with the Rawgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRawgrade

`func (o *ModWorkshopUpdateAssessment200Response) SetRawgrade(v float32)`

SetRawgrade sets Rawgrade field to given value.

### HasRawgrade

`func (o *ModWorkshopUpdateAssessment200Response) HasRawgrade() bool`

HasRawgrade returns a boolean if a field has been set.

### GetStatus

`func (o *ModWorkshopUpdateAssessment200Response) GetStatus() bool`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ModWorkshopUpdateAssessment200Response) GetStatusOk() (*bool, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ModWorkshopUpdateAssessment200Response) SetStatus(v bool)`

SetStatus sets Status field to given value.


### GetWarnings

`func (o *ModWorkshopUpdateAssessment200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWorkshopUpdateAssessment200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWorkshopUpdateAssessment200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWorkshopUpdateAssessment200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


