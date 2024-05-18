# ModGlossaryGetCategories200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categories** | [**[]ModGlossaryGetCategories200ResponseCategoriesInner**](ModGlossaryGetCategories200ResponseCategoriesInner.md) |  | 
**Count** | **int32** | The total number of records. | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModGlossaryGetCategories200Response

`func NewModGlossaryGetCategories200Response(categories []ModGlossaryGetCategories200ResponseCategoriesInner, count int32, ) *ModGlossaryGetCategories200Response`

NewModGlossaryGetCategories200Response instantiates a new ModGlossaryGetCategories200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetCategories200ResponseWithDefaults

`func NewModGlossaryGetCategories200ResponseWithDefaults() *ModGlossaryGetCategories200Response`

NewModGlossaryGetCategories200ResponseWithDefaults instantiates a new ModGlossaryGetCategories200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategories

`func (o *ModGlossaryGetCategories200Response) GetCategories() []ModGlossaryGetCategories200ResponseCategoriesInner`

GetCategories returns the Categories field if non-nil, zero value otherwise.

### GetCategoriesOk

`func (o *ModGlossaryGetCategories200Response) GetCategoriesOk() (*[]ModGlossaryGetCategories200ResponseCategoriesInner, bool)`

GetCategoriesOk returns a tuple with the Categories field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategories

`func (o *ModGlossaryGetCategories200Response) SetCategories(v []ModGlossaryGetCategories200ResponseCategoriesInner)`

SetCategories sets Categories field to given value.


### GetCount

`func (o *ModGlossaryGetCategories200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *ModGlossaryGetCategories200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *ModGlossaryGetCategories200Response) SetCount(v int32)`

SetCount sets Count field to given value.


### GetWarnings

`func (o *ModGlossaryGetCategories200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModGlossaryGetCategories200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModGlossaryGetCategories200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModGlossaryGetCategories200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


