# ModFeedbackGetCurrentCompletedTmp200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Feedback** | [**ModFeedbackGetCurrentCompletedTmp200ResponseFeedback**](ModFeedbackGetCurrentCompletedTmp200ResponseFeedback.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModFeedbackGetCurrentCompletedTmp200Response

`func NewModFeedbackGetCurrentCompletedTmp200Response(feedback ModFeedbackGetCurrentCompletedTmp200ResponseFeedback, ) *ModFeedbackGetCurrentCompletedTmp200Response`

NewModFeedbackGetCurrentCompletedTmp200Response instantiates a new ModFeedbackGetCurrentCompletedTmp200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetCurrentCompletedTmp200ResponseWithDefaults

`func NewModFeedbackGetCurrentCompletedTmp200ResponseWithDefaults() *ModFeedbackGetCurrentCompletedTmp200Response`

NewModFeedbackGetCurrentCompletedTmp200ResponseWithDefaults instantiates a new ModFeedbackGetCurrentCompletedTmp200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeedback

`func (o *ModFeedbackGetCurrentCompletedTmp200Response) GetFeedback() ModFeedbackGetCurrentCompletedTmp200ResponseFeedback`

GetFeedback returns the Feedback field if non-nil, zero value otherwise.

### GetFeedbackOk

`func (o *ModFeedbackGetCurrentCompletedTmp200Response) GetFeedbackOk() (*ModFeedbackGetCurrentCompletedTmp200ResponseFeedback, bool)`

GetFeedbackOk returns a tuple with the Feedback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedback

`func (o *ModFeedbackGetCurrentCompletedTmp200Response) SetFeedback(v ModFeedbackGetCurrentCompletedTmp200ResponseFeedback)`

SetFeedback sets Feedback field to given value.


### GetWarnings

`func (o *ModFeedbackGetCurrentCompletedTmp200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModFeedbackGetCurrentCompletedTmp200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModFeedbackGetCurrentCompletedTmp200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModFeedbackGetCurrentCompletedTmp200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


