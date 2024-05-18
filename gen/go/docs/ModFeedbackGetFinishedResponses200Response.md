# ModFeedbackGetFinishedResponses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Responses** | [**[]ModFeedbackGetFinishedResponses200ResponseResponsesInner**](ModFeedbackGetFinishedResponses200ResponseResponsesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModFeedbackGetFinishedResponses200Response

`func NewModFeedbackGetFinishedResponses200Response(responses []ModFeedbackGetFinishedResponses200ResponseResponsesInner, ) *ModFeedbackGetFinishedResponses200Response`

NewModFeedbackGetFinishedResponses200Response instantiates a new ModFeedbackGetFinishedResponses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetFinishedResponses200ResponseWithDefaults

`func NewModFeedbackGetFinishedResponses200ResponseWithDefaults() *ModFeedbackGetFinishedResponses200Response`

NewModFeedbackGetFinishedResponses200ResponseWithDefaults instantiates a new ModFeedbackGetFinishedResponses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResponses

`func (o *ModFeedbackGetFinishedResponses200Response) GetResponses() []ModFeedbackGetFinishedResponses200ResponseResponsesInner`

GetResponses returns the Responses field if non-nil, zero value otherwise.

### GetResponsesOk

`func (o *ModFeedbackGetFinishedResponses200Response) GetResponsesOk() (*[]ModFeedbackGetFinishedResponses200ResponseResponsesInner, bool)`

GetResponsesOk returns a tuple with the Responses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponses

`func (o *ModFeedbackGetFinishedResponses200Response) SetResponses(v []ModFeedbackGetFinishedResponses200ResponseResponsesInner)`

SetResponses sets Responses field to given value.


### GetWarnings

`func (o *ModFeedbackGetFinishedResponses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModFeedbackGetFinishedResponses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModFeedbackGetFinishedResponses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModFeedbackGetFinishedResponses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


