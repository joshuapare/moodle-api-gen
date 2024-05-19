# ModAssignStartSubmission200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Submissionid** | **int32** | New submission ID. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModAssignStartSubmission200Response

`func NewModAssignStartSubmission200Response(submissionid int32, ) *ModAssignStartSubmission200Response`

NewModAssignStartSubmission200Response instantiates a new ModAssignStartSubmission200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignStartSubmission200ResponseWithDefaults

`func NewModAssignStartSubmission200ResponseWithDefaults() *ModAssignStartSubmission200Response`

NewModAssignStartSubmission200ResponseWithDefaults instantiates a new ModAssignStartSubmission200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSubmissionid

`func (o *ModAssignStartSubmission200Response) GetSubmissionid() int32`

GetSubmissionid returns the Submissionid field if non-nil, zero value otherwise.

### GetSubmissionidOk

`func (o *ModAssignStartSubmission200Response) GetSubmissionidOk() (*int32, bool)`

GetSubmissionidOk returns a tuple with the Submissionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionid

`func (o *ModAssignStartSubmission200Response) SetSubmissionid(v int32)`

SetSubmissionid sets Submissionid field to given value.


### GetWarnings

`func (o *ModAssignStartSubmission200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModAssignStartSubmission200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModAssignStartSubmission200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModAssignStartSubmission200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


