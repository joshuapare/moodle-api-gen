# CoreGradesCreateGradecategories200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryids** | **[]map[string]interface{}** |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreGradesCreateGradecategories200Response

`func NewCoreGradesCreateGradecategories200Response(categoryids []map[string]interface{}, ) *CoreGradesCreateGradecategories200Response`

NewCoreGradesCreateGradecategories200Response instantiates a new CoreGradesCreateGradecategories200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesCreateGradecategories200ResponseWithDefaults

`func NewCoreGradesCreateGradecategories200ResponseWithDefaults() *CoreGradesCreateGradecategories200Response`

NewCoreGradesCreateGradecategories200ResponseWithDefaults instantiates a new CoreGradesCreateGradecategories200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryids

`func (o *CoreGradesCreateGradecategories200Response) GetCategoryids() []map[string]interface{}`

GetCategoryids returns the Categoryids field if non-nil, zero value otherwise.

### GetCategoryidsOk

`func (o *CoreGradesCreateGradecategories200Response) GetCategoryidsOk() (*[]map[string]interface{}, bool)`

GetCategoryidsOk returns a tuple with the Categoryids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryids

`func (o *CoreGradesCreateGradecategories200Response) SetCategoryids(v []map[string]interface{})`

SetCategoryids sets Categoryids field to given value.


### GetWarnings

`func (o *CoreGradesCreateGradecategories200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreGradesCreateGradecategories200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreGradesCreateGradecategories200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreGradesCreateGradecategories200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


