# ModFeedbackGetResponsesAnalysis200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Anonattempts** | [**[]ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner**](ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.md) |  | 
**Attempts** | [**[]ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner**](ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner.md) |  | 
**Totalanonattempts** | **int32** | Total anonymous responses count. | [default to null]
**Totalattempts** | **int32** | Total responses count. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModFeedbackGetResponsesAnalysis200Response

`func NewModFeedbackGetResponsesAnalysis200Response(anonattempts []ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner, attempts []ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner, totalanonattempts int32, totalattempts int32, ) *ModFeedbackGetResponsesAnalysis200Response`

NewModFeedbackGetResponsesAnalysis200Response instantiates a new ModFeedbackGetResponsesAnalysis200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetResponsesAnalysis200ResponseWithDefaults

`func NewModFeedbackGetResponsesAnalysis200ResponseWithDefaults() *ModFeedbackGetResponsesAnalysis200Response`

NewModFeedbackGetResponsesAnalysis200ResponseWithDefaults instantiates a new ModFeedbackGetResponsesAnalysis200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAnonattempts

`func (o *ModFeedbackGetResponsesAnalysis200Response) GetAnonattempts() []ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner`

GetAnonattempts returns the Anonattempts field if non-nil, zero value otherwise.

### GetAnonattemptsOk

`func (o *ModFeedbackGetResponsesAnalysis200Response) GetAnonattemptsOk() (*[]ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner, bool)`

GetAnonattemptsOk returns a tuple with the Anonattempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnonattempts

`func (o *ModFeedbackGetResponsesAnalysis200Response) SetAnonattempts(v []ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner)`

SetAnonattempts sets Anonattempts field to given value.


### GetAttempts

`func (o *ModFeedbackGetResponsesAnalysis200Response) GetAttempts() []ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner`

GetAttempts returns the Attempts field if non-nil, zero value otherwise.

### GetAttemptsOk

`func (o *ModFeedbackGetResponsesAnalysis200Response) GetAttemptsOk() (*[]ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner, bool)`

GetAttemptsOk returns a tuple with the Attempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttempts

`func (o *ModFeedbackGetResponsesAnalysis200Response) SetAttempts(v []ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner)`

SetAttempts sets Attempts field to given value.


### GetTotalanonattempts

`func (o *ModFeedbackGetResponsesAnalysis200Response) GetTotalanonattempts() int32`

GetTotalanonattempts returns the Totalanonattempts field if non-nil, zero value otherwise.

### GetTotalanonattemptsOk

`func (o *ModFeedbackGetResponsesAnalysis200Response) GetTotalanonattemptsOk() (*int32, bool)`

GetTotalanonattemptsOk returns a tuple with the Totalanonattempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalanonattempts

`func (o *ModFeedbackGetResponsesAnalysis200Response) SetTotalanonattempts(v int32)`

SetTotalanonattempts sets Totalanonattempts field to given value.


### GetTotalattempts

`func (o *ModFeedbackGetResponsesAnalysis200Response) GetTotalattempts() int32`

GetTotalattempts returns the Totalattempts field if non-nil, zero value otherwise.

### GetTotalattemptsOk

`func (o *ModFeedbackGetResponsesAnalysis200Response) GetTotalattemptsOk() (*int32, bool)`

GetTotalattemptsOk returns a tuple with the Totalattempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalattempts

`func (o *ModFeedbackGetResponsesAnalysis200Response) SetTotalattempts(v int32)`

SetTotalattempts sets Totalattempts field to given value.


### GetWarnings

`func (o *ModFeedbackGetResponsesAnalysis200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModFeedbackGetResponsesAnalysis200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModFeedbackGetResponsesAnalysis200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModFeedbackGetResponsesAnalysis200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


