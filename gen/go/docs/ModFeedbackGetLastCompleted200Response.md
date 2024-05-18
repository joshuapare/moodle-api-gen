# ModFeedbackGetLastCompleted200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Completed** | [**ModFeedbackGetLastCompleted200ResponseCompleted**](ModFeedbackGetLastCompleted200ResponseCompleted.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModFeedbackGetLastCompleted200Response

`func NewModFeedbackGetLastCompleted200Response(completed ModFeedbackGetLastCompleted200ResponseCompleted, ) *ModFeedbackGetLastCompleted200Response`

NewModFeedbackGetLastCompleted200Response instantiates a new ModFeedbackGetLastCompleted200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetLastCompleted200ResponseWithDefaults

`func NewModFeedbackGetLastCompleted200ResponseWithDefaults() *ModFeedbackGetLastCompleted200Response`

NewModFeedbackGetLastCompleted200ResponseWithDefaults instantiates a new ModFeedbackGetLastCompleted200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompleted

`func (o *ModFeedbackGetLastCompleted200Response) GetCompleted() ModFeedbackGetLastCompleted200ResponseCompleted`

GetCompleted returns the Completed field if non-nil, zero value otherwise.

### GetCompletedOk

`func (o *ModFeedbackGetLastCompleted200Response) GetCompletedOk() (*ModFeedbackGetLastCompleted200ResponseCompleted, bool)`

GetCompletedOk returns a tuple with the Completed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompleted

`func (o *ModFeedbackGetLastCompleted200Response) SetCompleted(v ModFeedbackGetLastCompleted200ResponseCompleted)`

SetCompleted sets Completed field to given value.


### GetWarnings

`func (o *ModFeedbackGetLastCompleted200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModFeedbackGetLastCompleted200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModFeedbackGetLastCompleted200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModFeedbackGetLastCompleted200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


