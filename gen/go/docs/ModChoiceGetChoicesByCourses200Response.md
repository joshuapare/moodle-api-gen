# ModChoiceGetChoicesByCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Choices** | [**[]ModChoiceGetChoicesByCourses200ResponseChoicesInner**](ModChoiceGetChoicesByCourses200ResponseChoicesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModChoiceGetChoicesByCourses200Response

`func NewModChoiceGetChoicesByCourses200Response(choices []ModChoiceGetChoicesByCourses200ResponseChoicesInner, ) *ModChoiceGetChoicesByCourses200Response`

NewModChoiceGetChoicesByCourses200Response instantiates a new ModChoiceGetChoicesByCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChoiceGetChoicesByCourses200ResponseWithDefaults

`func NewModChoiceGetChoicesByCourses200ResponseWithDefaults() *ModChoiceGetChoicesByCourses200Response`

NewModChoiceGetChoicesByCourses200ResponseWithDefaults instantiates a new ModChoiceGetChoicesByCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChoices

`func (o *ModChoiceGetChoicesByCourses200Response) GetChoices() []ModChoiceGetChoicesByCourses200ResponseChoicesInner`

GetChoices returns the Choices field if non-nil, zero value otherwise.

### GetChoicesOk

`func (o *ModChoiceGetChoicesByCourses200Response) GetChoicesOk() (*[]ModChoiceGetChoicesByCourses200ResponseChoicesInner, bool)`

GetChoicesOk returns a tuple with the Choices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChoices

`func (o *ModChoiceGetChoicesByCourses200Response) SetChoices(v []ModChoiceGetChoicesByCourses200ResponseChoicesInner)`

SetChoices sets Choices field to given value.


### GetWarnings

`func (o *ModChoiceGetChoicesByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModChoiceGetChoicesByCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModChoiceGetChoicesByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModChoiceGetChoicesByCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


