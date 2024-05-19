# ModAssignGetSubmissionStatus200ResponseGradingsummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Participantcount** | **int32** | Number of users who can submit. | [default to null]
**Submissiondraftscount** | **int32** | Number of submissions in draft status. | [default to null]
**Submissionsenabled** | **bool** | Whether submissions are enabled or not. | [default to null]
**Submissionsneedgradingcount** | **int32** | Number of submissions that need grading. | [default to null]
**Submissionssubmittedcount** | **int32** | Number of submissions in submitted status. | [default to null]
**Warnofungroupedusers** | **string** | Whether we need to warn people that there                                                                         are users without groups (&#39;warningrequired&#39;), warn                                                                         people there are users who will submit in the default                                                                         group (&#39;warningoptional&#39;) or no warning (&#39;&#39;). | [default to "null"]

## Methods

### NewModAssignGetSubmissionStatus200ResponseGradingsummary

`func NewModAssignGetSubmissionStatus200ResponseGradingsummary(participantcount int32, submissiondraftscount int32, submissionsenabled bool, submissionsneedgradingcount int32, submissionssubmittedcount int32, warnofungroupedusers string, ) *ModAssignGetSubmissionStatus200ResponseGradingsummary`

NewModAssignGetSubmissionStatus200ResponseGradingsummary instantiates a new ModAssignGetSubmissionStatus200ResponseGradingsummary object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetSubmissionStatus200ResponseGradingsummaryWithDefaults

`func NewModAssignGetSubmissionStatus200ResponseGradingsummaryWithDefaults() *ModAssignGetSubmissionStatus200ResponseGradingsummary`

NewModAssignGetSubmissionStatus200ResponseGradingsummaryWithDefaults instantiates a new ModAssignGetSubmissionStatus200ResponseGradingsummary object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetParticipantcount

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) GetParticipantcount() int32`

GetParticipantcount returns the Participantcount field if non-nil, zero value otherwise.

### GetParticipantcountOk

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) GetParticipantcountOk() (*int32, bool)`

GetParticipantcountOk returns a tuple with the Participantcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParticipantcount

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) SetParticipantcount(v int32)`

SetParticipantcount sets Participantcount field to given value.


### GetSubmissiondraftscount

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) GetSubmissiondraftscount() int32`

GetSubmissiondraftscount returns the Submissiondraftscount field if non-nil, zero value otherwise.

### GetSubmissiondraftscountOk

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) GetSubmissiondraftscountOk() (*int32, bool)`

GetSubmissiondraftscountOk returns a tuple with the Submissiondraftscount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissiondraftscount

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) SetSubmissiondraftscount(v int32)`

SetSubmissiondraftscount sets Submissiondraftscount field to given value.


### GetSubmissionsenabled

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) GetSubmissionsenabled() bool`

GetSubmissionsenabled returns the Submissionsenabled field if non-nil, zero value otherwise.

### GetSubmissionsenabledOk

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) GetSubmissionsenabledOk() (*bool, bool)`

GetSubmissionsenabledOk returns a tuple with the Submissionsenabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionsenabled

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) SetSubmissionsenabled(v bool)`

SetSubmissionsenabled sets Submissionsenabled field to given value.


### GetSubmissionsneedgradingcount

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) GetSubmissionsneedgradingcount() int32`

GetSubmissionsneedgradingcount returns the Submissionsneedgradingcount field if non-nil, zero value otherwise.

### GetSubmissionsneedgradingcountOk

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) GetSubmissionsneedgradingcountOk() (*int32, bool)`

GetSubmissionsneedgradingcountOk returns a tuple with the Submissionsneedgradingcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionsneedgradingcount

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) SetSubmissionsneedgradingcount(v int32)`

SetSubmissionsneedgradingcount sets Submissionsneedgradingcount field to given value.


### GetSubmissionssubmittedcount

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) GetSubmissionssubmittedcount() int32`

GetSubmissionssubmittedcount returns the Submissionssubmittedcount field if non-nil, zero value otherwise.

### GetSubmissionssubmittedcountOk

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) GetSubmissionssubmittedcountOk() (*int32, bool)`

GetSubmissionssubmittedcountOk returns a tuple with the Submissionssubmittedcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionssubmittedcount

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) SetSubmissionssubmittedcount(v int32)`

SetSubmissionssubmittedcount sets Submissionssubmittedcount field to given value.


### GetWarnofungroupedusers

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) GetWarnofungroupedusers() string`

GetWarnofungroupedusers returns the Warnofungroupedusers field if non-nil, zero value otherwise.

### GetWarnofungroupedusersOk

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) GetWarnofungroupedusersOk() (*string, bool)`

GetWarnofungroupedusersOk returns a tuple with the Warnofungroupedusers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnofungroupedusers

`func (o *ModAssignGetSubmissionStatus200ResponseGradingsummary) SetWarnofungroupedusers(v string)`

SetWarnofungroupedusers sets Warnofungroupedusers field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


