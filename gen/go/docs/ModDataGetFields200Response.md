# ModDataGetFields200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Fields** | [**[]ModDataGetFields200ResponseFieldsInner**](ModDataGetFields200ResponseFieldsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModDataGetFields200Response

`func NewModDataGetFields200Response(fields []ModDataGetFields200ResponseFieldsInner, ) *ModDataGetFields200Response`

NewModDataGetFields200Response instantiates a new ModDataGetFields200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataGetFields200ResponseWithDefaults

`func NewModDataGetFields200ResponseWithDefaults() *ModDataGetFields200Response`

NewModDataGetFields200ResponseWithDefaults instantiates a new ModDataGetFields200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFields

`func (o *ModDataGetFields200Response) GetFields() []ModDataGetFields200ResponseFieldsInner`

GetFields returns the Fields field if non-nil, zero value otherwise.

### GetFieldsOk

`func (o *ModDataGetFields200Response) GetFieldsOk() (*[]ModDataGetFields200ResponseFieldsInner, bool)`

GetFieldsOk returns a tuple with the Fields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFields

`func (o *ModDataGetFields200Response) SetFields(v []ModDataGetFields200ResponseFieldsInner)`

SetFields sets Fields field to given value.


### GetWarnings

`func (o *ModDataGetFields200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModDataGetFields200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModDataGetFields200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModDataGetFields200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


