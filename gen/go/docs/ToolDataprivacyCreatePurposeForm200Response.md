# ToolDataprivacyCreatePurposeForm200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Purpose** | [**ToolDataprivacyCreatePurposeForm200ResponsePurpose**](ToolDataprivacyCreatePurposeForm200ResponsePurpose.md) |  | 
**Validationerrors** | **bool** | Were there validation errors | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewToolDataprivacyCreatePurposeForm200Response

`func NewToolDataprivacyCreatePurposeForm200Response(purpose ToolDataprivacyCreatePurposeForm200ResponsePurpose, validationerrors bool, ) *ToolDataprivacyCreatePurposeForm200Response`

NewToolDataprivacyCreatePurposeForm200Response instantiates a new ToolDataprivacyCreatePurposeForm200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolDataprivacyCreatePurposeForm200ResponseWithDefaults

`func NewToolDataprivacyCreatePurposeForm200ResponseWithDefaults() *ToolDataprivacyCreatePurposeForm200Response`

NewToolDataprivacyCreatePurposeForm200ResponseWithDefaults instantiates a new ToolDataprivacyCreatePurposeForm200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPurpose

`func (o *ToolDataprivacyCreatePurposeForm200Response) GetPurpose() ToolDataprivacyCreatePurposeForm200ResponsePurpose`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *ToolDataprivacyCreatePurposeForm200Response) GetPurposeOk() (*ToolDataprivacyCreatePurposeForm200ResponsePurpose, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *ToolDataprivacyCreatePurposeForm200Response) SetPurpose(v ToolDataprivacyCreatePurposeForm200ResponsePurpose)`

SetPurpose sets Purpose field to given value.


### GetValidationerrors

`func (o *ToolDataprivacyCreatePurposeForm200Response) GetValidationerrors() bool`

GetValidationerrors returns the Validationerrors field if non-nil, zero value otherwise.

### GetValidationerrorsOk

`func (o *ToolDataprivacyCreatePurposeForm200Response) GetValidationerrorsOk() (*bool, bool)`

GetValidationerrorsOk returns a tuple with the Validationerrors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidationerrors

`func (o *ToolDataprivacyCreatePurposeForm200Response) SetValidationerrors(v bool)`

SetValidationerrors sets Validationerrors field to given value.


### GetWarnings

`func (o *ToolDataprivacyCreatePurposeForm200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ToolDataprivacyCreatePurposeForm200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ToolDataprivacyCreatePurposeForm200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ToolDataprivacyCreatePurposeForm200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


