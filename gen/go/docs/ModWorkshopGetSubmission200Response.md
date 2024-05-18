# ModWorkshopGetSubmission200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Submission** | [**ModWorkshopGetSubmission200ResponseSubmission**](ModWorkshopGetSubmission200ResponseSubmission.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModWorkshopGetSubmission200Response

`func NewModWorkshopGetSubmission200Response(submission ModWorkshopGetSubmission200ResponseSubmission, ) *ModWorkshopGetSubmission200Response`

NewModWorkshopGetSubmission200Response instantiates a new ModWorkshopGetSubmission200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetSubmission200ResponseWithDefaults

`func NewModWorkshopGetSubmission200ResponseWithDefaults() *ModWorkshopGetSubmission200Response`

NewModWorkshopGetSubmission200ResponseWithDefaults instantiates a new ModWorkshopGetSubmission200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSubmission

`func (o *ModWorkshopGetSubmission200Response) GetSubmission() ModWorkshopGetSubmission200ResponseSubmission`

GetSubmission returns the Submission field if non-nil, zero value otherwise.

### GetSubmissionOk

`func (o *ModWorkshopGetSubmission200Response) GetSubmissionOk() (*ModWorkshopGetSubmission200ResponseSubmission, bool)`

GetSubmissionOk returns a tuple with the Submission field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmission

`func (o *ModWorkshopGetSubmission200Response) SetSubmission(v ModWorkshopGetSubmission200ResponseSubmission)`

SetSubmission sets Submission field to given value.


### GetWarnings

`func (o *ModWorkshopGetSubmission200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWorkshopGetSubmission200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWorkshopGetSubmission200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWorkshopGetSubmission200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


