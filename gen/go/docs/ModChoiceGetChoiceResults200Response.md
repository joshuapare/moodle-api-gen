# ModChoiceGetChoiceResults200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Options** | [**[]ModChoiceGetChoiceResults200ResponseOptionsInner**](ModChoiceGetChoiceResults200ResponseOptionsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModChoiceGetChoiceResults200Response

`func NewModChoiceGetChoiceResults200Response(options []ModChoiceGetChoiceResults200ResponseOptionsInner, ) *ModChoiceGetChoiceResults200Response`

NewModChoiceGetChoiceResults200Response instantiates a new ModChoiceGetChoiceResults200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChoiceGetChoiceResults200ResponseWithDefaults

`func NewModChoiceGetChoiceResults200ResponseWithDefaults() *ModChoiceGetChoiceResults200Response`

NewModChoiceGetChoiceResults200ResponseWithDefaults instantiates a new ModChoiceGetChoiceResults200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOptions

`func (o *ModChoiceGetChoiceResults200Response) GetOptions() []ModChoiceGetChoiceResults200ResponseOptionsInner`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModChoiceGetChoiceResults200Response) GetOptionsOk() (*[]ModChoiceGetChoiceResults200ResponseOptionsInner, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModChoiceGetChoiceResults200Response) SetOptions(v []ModChoiceGetChoiceResults200ResponseOptionsInner)`

SetOptions sets Options field to given value.


### GetWarnings

`func (o *ModChoiceGetChoiceResults200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModChoiceGetChoiceResults200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModChoiceGetChoiceResults200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModChoiceGetChoiceResults200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


