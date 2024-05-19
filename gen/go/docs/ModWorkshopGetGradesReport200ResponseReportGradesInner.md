# ModWorkshopGetGradesReport200ResponseReportGradesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Gradinggrade** | Pointer to **float32** | Computed grade for the assessment. | [optional] [default to null]
**Reviewedby** | Pointer to [**[]ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner**](ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner.md) |  | [optional] 
**Reviewerof** | Pointer to [**[]ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner**](ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner.md) |  | [optional] 
**Submissiongrade** | Pointer to **float32** | Aggregated grade for the submission. | [optional] [default to null]
**Submissiongradeover** | Pointer to **float32** | Grade for the assessment overrided                                         by the teacher. | [optional] [default to null]
**Submissiongradeoverby** | Pointer to **int32** | The id of the user who overrided                                         the grade. | [optional] [default to null]
**Submissionid** | Pointer to **int32** | Submission id. | [optional] [default to null]
**Submissionmodified** | Pointer to **int32** | Timestamp submission was updated. | [optional] [default to null]
**Submissionpublished** | Pointer to **int32** | Whether is a submission published. | [optional] [default to null]
**Submissiontitle** | Pointer to **string** | Submission title. | [optional] [default to "null"]
**Userid** | Pointer to **int32** | The id of the user being displayed in the report. | [optional] [default to null]

## Methods

### NewModWorkshopGetGradesReport200ResponseReportGradesInner

`func NewModWorkshopGetGradesReport200ResponseReportGradesInner() *ModWorkshopGetGradesReport200ResponseReportGradesInner`

NewModWorkshopGetGradesReport200ResponseReportGradesInner instantiates a new ModWorkshopGetGradesReport200ResponseReportGradesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetGradesReport200ResponseReportGradesInnerWithDefaults

`func NewModWorkshopGetGradesReport200ResponseReportGradesInnerWithDefaults() *ModWorkshopGetGradesReport200ResponseReportGradesInner`

NewModWorkshopGetGradesReport200ResponseReportGradesInnerWithDefaults instantiates a new ModWorkshopGetGradesReport200ResponseReportGradesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGradinggrade

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetGradinggrade() float32`

GetGradinggrade returns the Gradinggrade field if non-nil, zero value otherwise.

### GetGradinggradeOk

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetGradinggradeOk() (*float32, bool)`

GetGradinggradeOk returns a tuple with the Gradinggrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradinggrade

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) SetGradinggrade(v float32)`

SetGradinggrade sets Gradinggrade field to given value.

### HasGradinggrade

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) HasGradinggrade() bool`

HasGradinggrade returns a boolean if a field has been set.

### GetReviewedby

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetReviewedby() []ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner`

GetReviewedby returns the Reviewedby field if non-nil, zero value otherwise.

### GetReviewedbyOk

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetReviewedbyOk() (*[]ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner, bool)`

GetReviewedbyOk returns a tuple with the Reviewedby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewedby

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) SetReviewedby(v []ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner)`

SetReviewedby sets Reviewedby field to given value.

### HasReviewedby

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) HasReviewedby() bool`

HasReviewedby returns a boolean if a field has been set.

### GetReviewerof

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetReviewerof() []ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner`

GetReviewerof returns the Reviewerof field if non-nil, zero value otherwise.

### GetReviewerofOk

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetReviewerofOk() (*[]ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner, bool)`

GetReviewerofOk returns a tuple with the Reviewerof field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewerof

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) SetReviewerof(v []ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner)`

SetReviewerof sets Reviewerof field to given value.

### HasReviewerof

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) HasReviewerof() bool`

HasReviewerof returns a boolean if a field has been set.

### GetSubmissiongrade

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetSubmissiongrade() float32`

GetSubmissiongrade returns the Submissiongrade field if non-nil, zero value otherwise.

### GetSubmissiongradeOk

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetSubmissiongradeOk() (*float32, bool)`

GetSubmissiongradeOk returns a tuple with the Submissiongrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissiongrade

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) SetSubmissiongrade(v float32)`

SetSubmissiongrade sets Submissiongrade field to given value.

### HasSubmissiongrade

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) HasSubmissiongrade() bool`

HasSubmissiongrade returns a boolean if a field has been set.

### GetSubmissiongradeover

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetSubmissiongradeover() float32`

GetSubmissiongradeover returns the Submissiongradeover field if non-nil, zero value otherwise.

### GetSubmissiongradeoverOk

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetSubmissiongradeoverOk() (*float32, bool)`

GetSubmissiongradeoverOk returns a tuple with the Submissiongradeover field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissiongradeover

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) SetSubmissiongradeover(v float32)`

SetSubmissiongradeover sets Submissiongradeover field to given value.

### HasSubmissiongradeover

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) HasSubmissiongradeover() bool`

HasSubmissiongradeover returns a boolean if a field has been set.

### GetSubmissiongradeoverby

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetSubmissiongradeoverby() int32`

GetSubmissiongradeoverby returns the Submissiongradeoverby field if non-nil, zero value otherwise.

### GetSubmissiongradeoverbyOk

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetSubmissiongradeoverbyOk() (*int32, bool)`

GetSubmissiongradeoverbyOk returns a tuple with the Submissiongradeoverby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissiongradeoverby

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) SetSubmissiongradeoverby(v int32)`

SetSubmissiongradeoverby sets Submissiongradeoverby field to given value.

### HasSubmissiongradeoverby

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) HasSubmissiongradeoverby() bool`

HasSubmissiongradeoverby returns a boolean if a field has been set.

### GetSubmissionid

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetSubmissionid() int32`

GetSubmissionid returns the Submissionid field if non-nil, zero value otherwise.

### GetSubmissionidOk

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetSubmissionidOk() (*int32, bool)`

GetSubmissionidOk returns a tuple with the Submissionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionid

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) SetSubmissionid(v int32)`

SetSubmissionid sets Submissionid field to given value.

### HasSubmissionid

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) HasSubmissionid() bool`

HasSubmissionid returns a boolean if a field has been set.

### GetSubmissionmodified

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetSubmissionmodified() int32`

GetSubmissionmodified returns the Submissionmodified field if non-nil, zero value otherwise.

### GetSubmissionmodifiedOk

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetSubmissionmodifiedOk() (*int32, bool)`

GetSubmissionmodifiedOk returns a tuple with the Submissionmodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionmodified

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) SetSubmissionmodified(v int32)`

SetSubmissionmodified sets Submissionmodified field to given value.

### HasSubmissionmodified

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) HasSubmissionmodified() bool`

HasSubmissionmodified returns a boolean if a field has been set.

### GetSubmissionpublished

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetSubmissionpublished() int32`

GetSubmissionpublished returns the Submissionpublished field if non-nil, zero value otherwise.

### GetSubmissionpublishedOk

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetSubmissionpublishedOk() (*int32, bool)`

GetSubmissionpublishedOk returns a tuple with the Submissionpublished field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionpublished

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) SetSubmissionpublished(v int32)`

SetSubmissionpublished sets Submissionpublished field to given value.

### HasSubmissionpublished

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) HasSubmissionpublished() bool`

HasSubmissionpublished returns a boolean if a field has been set.

### GetSubmissiontitle

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetSubmissiontitle() string`

GetSubmissiontitle returns the Submissiontitle field if non-nil, zero value otherwise.

### GetSubmissiontitleOk

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetSubmissiontitleOk() (*string, bool)`

GetSubmissiontitleOk returns a tuple with the Submissiontitle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissiontitle

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) SetSubmissiontitle(v string)`

SetSubmissiontitle sets Submissiontitle field to given value.

### HasSubmissiontitle

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) HasSubmissiontitle() bool`

HasSubmissiontitle returns a boolean if a field has been set.

### GetUserid

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModWorkshopGetGradesReport200ResponseReportGradesInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


