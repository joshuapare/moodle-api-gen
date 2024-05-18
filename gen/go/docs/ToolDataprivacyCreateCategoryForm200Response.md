# ToolDataprivacyCreateCategoryForm200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Category** | [**ToolDataprivacyCreateCategoryForm200ResponseCategory**](ToolDataprivacyCreateCategoryForm200ResponseCategory.md) |  | 
**Validationerrors** | **bool** | Were there validation errors | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewToolDataprivacyCreateCategoryForm200Response

`func NewToolDataprivacyCreateCategoryForm200Response(category ToolDataprivacyCreateCategoryForm200ResponseCategory, validationerrors bool, ) *ToolDataprivacyCreateCategoryForm200Response`

NewToolDataprivacyCreateCategoryForm200Response instantiates a new ToolDataprivacyCreateCategoryForm200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolDataprivacyCreateCategoryForm200ResponseWithDefaults

`func NewToolDataprivacyCreateCategoryForm200ResponseWithDefaults() *ToolDataprivacyCreateCategoryForm200Response`

NewToolDataprivacyCreateCategoryForm200ResponseWithDefaults instantiates a new ToolDataprivacyCreateCategoryForm200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategory

`func (o *ToolDataprivacyCreateCategoryForm200Response) GetCategory() ToolDataprivacyCreateCategoryForm200ResponseCategory`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *ToolDataprivacyCreateCategoryForm200Response) GetCategoryOk() (*ToolDataprivacyCreateCategoryForm200ResponseCategory, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *ToolDataprivacyCreateCategoryForm200Response) SetCategory(v ToolDataprivacyCreateCategoryForm200ResponseCategory)`

SetCategory sets Category field to given value.


### GetValidationerrors

`func (o *ToolDataprivacyCreateCategoryForm200Response) GetValidationerrors() bool`

GetValidationerrors returns the Validationerrors field if non-nil, zero value otherwise.

### GetValidationerrorsOk

`func (o *ToolDataprivacyCreateCategoryForm200Response) GetValidationerrorsOk() (*bool, bool)`

GetValidationerrorsOk returns a tuple with the Validationerrors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidationerrors

`func (o *ToolDataprivacyCreateCategoryForm200Response) SetValidationerrors(v bool)`

SetValidationerrors sets Validationerrors field to given value.


### GetWarnings

`func (o *ToolDataprivacyCreateCategoryForm200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ToolDataprivacyCreateCategoryForm200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ToolDataprivacyCreateCategoryForm200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ToolDataprivacyCreateCategoryForm200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


