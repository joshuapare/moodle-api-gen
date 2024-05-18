# ModChoiceSubmitChoiceResponse200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Answers** | [**[]ModChoiceSubmitChoiceResponse200ResponseAnswersInner**](ModChoiceSubmitChoiceResponse200ResponseAnswersInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModChoiceSubmitChoiceResponse200Response

`func NewModChoiceSubmitChoiceResponse200Response(answers []ModChoiceSubmitChoiceResponse200ResponseAnswersInner, ) *ModChoiceSubmitChoiceResponse200Response`

NewModChoiceSubmitChoiceResponse200Response instantiates a new ModChoiceSubmitChoiceResponse200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChoiceSubmitChoiceResponse200ResponseWithDefaults

`func NewModChoiceSubmitChoiceResponse200ResponseWithDefaults() *ModChoiceSubmitChoiceResponse200Response`

NewModChoiceSubmitChoiceResponse200ResponseWithDefaults instantiates a new ModChoiceSubmitChoiceResponse200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAnswers

`func (o *ModChoiceSubmitChoiceResponse200Response) GetAnswers() []ModChoiceSubmitChoiceResponse200ResponseAnswersInner`

GetAnswers returns the Answers field if non-nil, zero value otherwise.

### GetAnswersOk

`func (o *ModChoiceSubmitChoiceResponse200Response) GetAnswersOk() (*[]ModChoiceSubmitChoiceResponse200ResponseAnswersInner, bool)`

GetAnswersOk returns a tuple with the Answers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnswers

`func (o *ModChoiceSubmitChoiceResponse200Response) SetAnswers(v []ModChoiceSubmitChoiceResponse200ResponseAnswersInner)`

SetAnswers sets Answers field to given value.


### GetWarnings

`func (o *ModChoiceSubmitChoiceResponse200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModChoiceSubmitChoiceResponse200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModChoiceSubmitChoiceResponse200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModChoiceSubmitChoiceResponse200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


