# ModWorkshopAddSubmission200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **bool** | True if the submission was created false otherwise. | [default to null]
**Submissionid** | Pointer to **int32** | New workshop submission id. | [optional] [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModWorkshopAddSubmission200Response

`func NewModWorkshopAddSubmission200Response(status bool, ) *ModWorkshopAddSubmission200Response`

NewModWorkshopAddSubmission200Response instantiates a new ModWorkshopAddSubmission200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopAddSubmission200ResponseWithDefaults

`func NewModWorkshopAddSubmission200ResponseWithDefaults() *ModWorkshopAddSubmission200Response`

NewModWorkshopAddSubmission200ResponseWithDefaults instantiates a new ModWorkshopAddSubmission200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *ModWorkshopAddSubmission200Response) GetStatus() bool`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ModWorkshopAddSubmission200Response) GetStatusOk() (*bool, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ModWorkshopAddSubmission200Response) SetStatus(v bool)`

SetStatus sets Status field to given value.


### GetSubmissionid

`func (o *ModWorkshopAddSubmission200Response) GetSubmissionid() int32`

GetSubmissionid returns the Submissionid field if non-nil, zero value otherwise.

### GetSubmissionidOk

`func (o *ModWorkshopAddSubmission200Response) GetSubmissionidOk() (*int32, bool)`

GetSubmissionidOk returns a tuple with the Submissionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionid

`func (o *ModWorkshopAddSubmission200Response) SetSubmissionid(v int32)`

SetSubmissionid sets Submissionid field to given value.

### HasSubmissionid

`func (o *ModWorkshopAddSubmission200Response) HasSubmissionid() bool`

HasSubmissionid returns a boolean if a field has been set.

### GetWarnings

`func (o *ModWorkshopAddSubmission200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWorkshopAddSubmission200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWorkshopAddSubmission200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWorkshopAddSubmission200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


