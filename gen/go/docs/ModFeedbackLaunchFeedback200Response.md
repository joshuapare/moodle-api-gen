# ModFeedbackLaunchFeedback200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Gopage** | **int32** | The next page to go (-1 if we were already in the last page). 0 for first page. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModFeedbackLaunchFeedback200Response

`func NewModFeedbackLaunchFeedback200Response(gopage int32, ) *ModFeedbackLaunchFeedback200Response`

NewModFeedbackLaunchFeedback200Response instantiates a new ModFeedbackLaunchFeedback200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackLaunchFeedback200ResponseWithDefaults

`func NewModFeedbackLaunchFeedback200ResponseWithDefaults() *ModFeedbackLaunchFeedback200Response`

NewModFeedbackLaunchFeedback200ResponseWithDefaults instantiates a new ModFeedbackLaunchFeedback200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGopage

`func (o *ModFeedbackLaunchFeedback200Response) GetGopage() int32`

GetGopage returns the Gopage field if non-nil, zero value otherwise.

### GetGopageOk

`func (o *ModFeedbackLaunchFeedback200Response) GetGopageOk() (*int32, bool)`

GetGopageOk returns a tuple with the Gopage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGopage

`func (o *ModFeedbackLaunchFeedback200Response) SetGopage(v int32)`

SetGopage sets Gopage field to given value.


### GetWarnings

`func (o *ModFeedbackLaunchFeedback200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModFeedbackLaunchFeedback200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModFeedbackLaunchFeedback200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModFeedbackLaunchFeedback200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


