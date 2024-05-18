# ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Feedbackattachmentfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Feedbackauthor** | Pointer to **string** | The comment/feedback from the reviewer for the author. | [optional] 
**Feedbackauthorattachment** | Pointer to **int32** | Are there some files attached to the feedbackauthor field?                     Sets to 1 by file_postupdate_standard_filemanager(). | [optional] [default to 0]
**Feedbackauthorformat** | Pointer to **int32** | feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Feedbackcontentfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Feedbackreviewer** | Pointer to **string** | The comment/feedback from the teacher for the reviewer.                     For example the reason why the grade for assessment was overridden | [optional] 
**Feedbackreviewerformat** | Pointer to **int32** | feedbackreviewer format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Grade** | Pointer to **float32** | The aggregated grade for submission suggested by the reviewer.                     The grade 0..100 is computed from the values assigned to the assessment dimensions fields. If NULL then it has not been aggregated yet. | [optional] 
**Gradinggrade** | Pointer to **float32** | The computed grade 0..100 for this assessment. If NULL then it has not been computed yet. | [optional] 
**Gradinggradeover** | Pointer to **float32** | Grade for the assessment manually overridden by a teacher.                     Grade is always from interval 0..100. If NULL then the grade is not overriden. | [optional] 
**Gradinggradeoverby** | Pointer to **int32** | The id of the user who has overridden the grade for submission. | [optional] 
**Id** | Pointer to **int32** | The primary key of the record. | [optional] 
**Reviewerid** | Pointer to **int32** | The id of the reviewer who makes this assessment | [optional] 
**Submissionid** | Pointer to **int32** | The id of the assessed submission | [optional] 
**Timecreated** | Pointer to **int32** | If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the first time | [optional] [default to 0]
**Timemodified** | Pointer to **int32** | If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the last time | [optional] [default to 0]
**Weight** | Pointer to **int32** | The weight of the assessment for the purposes of aggregation | [optional] [default to 1]

## Methods

### NewModWorkshopGetReviewerAssessments200ResponseAssessmentsInner

`func NewModWorkshopGetReviewerAssessments200ResponseAssessmentsInner() *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner`

NewModWorkshopGetReviewerAssessments200ResponseAssessmentsInner instantiates a new ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetReviewerAssessments200ResponseAssessmentsInnerWithDefaults

`func NewModWorkshopGetReviewerAssessments200ResponseAssessmentsInnerWithDefaults() *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner`

NewModWorkshopGetReviewerAssessments200ResponseAssessmentsInnerWithDefaults instantiates a new ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeedbackattachmentfiles

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetFeedbackattachmentfiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetFeedbackattachmentfiles returns the Feedbackattachmentfiles field if non-nil, zero value otherwise.

### GetFeedbackattachmentfilesOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetFeedbackattachmentfilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetFeedbackattachmentfilesOk returns a tuple with the Feedbackattachmentfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackattachmentfiles

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetFeedbackattachmentfiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetFeedbackattachmentfiles sets Feedbackattachmentfiles field to given value.

### HasFeedbackattachmentfiles

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasFeedbackattachmentfiles() bool`

HasFeedbackattachmentfiles returns a boolean if a field has been set.

### GetFeedbackauthor

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetFeedbackauthor() string`

GetFeedbackauthor returns the Feedbackauthor field if non-nil, zero value otherwise.

### GetFeedbackauthorOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetFeedbackauthorOk() (*string, bool)`

GetFeedbackauthorOk returns a tuple with the Feedbackauthor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackauthor

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetFeedbackauthor(v string)`

SetFeedbackauthor sets Feedbackauthor field to given value.

### HasFeedbackauthor

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasFeedbackauthor() bool`

HasFeedbackauthor returns a boolean if a field has been set.

### GetFeedbackauthorattachment

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetFeedbackauthorattachment() int32`

GetFeedbackauthorattachment returns the Feedbackauthorattachment field if non-nil, zero value otherwise.

### GetFeedbackauthorattachmentOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetFeedbackauthorattachmentOk() (*int32, bool)`

GetFeedbackauthorattachmentOk returns a tuple with the Feedbackauthorattachment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackauthorattachment

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetFeedbackauthorattachment(v int32)`

SetFeedbackauthorattachment sets Feedbackauthorattachment field to given value.

### HasFeedbackauthorattachment

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasFeedbackauthorattachment() bool`

HasFeedbackauthorattachment returns a boolean if a field has been set.

### GetFeedbackauthorformat

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetFeedbackauthorformat() int32`

GetFeedbackauthorformat returns the Feedbackauthorformat field if non-nil, zero value otherwise.

### GetFeedbackauthorformatOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetFeedbackauthorformatOk() (*int32, bool)`

GetFeedbackauthorformatOk returns a tuple with the Feedbackauthorformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackauthorformat

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetFeedbackauthorformat(v int32)`

SetFeedbackauthorformat sets Feedbackauthorformat field to given value.

### HasFeedbackauthorformat

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasFeedbackauthorformat() bool`

HasFeedbackauthorformat returns a boolean if a field has been set.

### GetFeedbackcontentfiles

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetFeedbackcontentfiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetFeedbackcontentfiles returns the Feedbackcontentfiles field if non-nil, zero value otherwise.

### GetFeedbackcontentfilesOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetFeedbackcontentfilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetFeedbackcontentfilesOk returns a tuple with the Feedbackcontentfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackcontentfiles

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetFeedbackcontentfiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetFeedbackcontentfiles sets Feedbackcontentfiles field to given value.

### HasFeedbackcontentfiles

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasFeedbackcontentfiles() bool`

HasFeedbackcontentfiles returns a boolean if a field has been set.

### GetFeedbackreviewer

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetFeedbackreviewer() string`

GetFeedbackreviewer returns the Feedbackreviewer field if non-nil, zero value otherwise.

### GetFeedbackreviewerOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetFeedbackreviewerOk() (*string, bool)`

GetFeedbackreviewerOk returns a tuple with the Feedbackreviewer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackreviewer

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetFeedbackreviewer(v string)`

SetFeedbackreviewer sets Feedbackreviewer field to given value.

### HasFeedbackreviewer

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasFeedbackreviewer() bool`

HasFeedbackreviewer returns a boolean if a field has been set.

### GetFeedbackreviewerformat

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetFeedbackreviewerformat() int32`

GetFeedbackreviewerformat returns the Feedbackreviewerformat field if non-nil, zero value otherwise.

### GetFeedbackreviewerformatOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetFeedbackreviewerformatOk() (*int32, bool)`

GetFeedbackreviewerformatOk returns a tuple with the Feedbackreviewerformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackreviewerformat

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetFeedbackreviewerformat(v int32)`

SetFeedbackreviewerformat sets Feedbackreviewerformat field to given value.

### HasFeedbackreviewerformat

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasFeedbackreviewerformat() bool`

HasFeedbackreviewerformat returns a boolean if a field has been set.

### GetGrade

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetGrade() float32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetGradeOk() (*float32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetGrade(v float32)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetGradinggrade

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetGradinggrade() float32`

GetGradinggrade returns the Gradinggrade field if non-nil, zero value otherwise.

### GetGradinggradeOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetGradinggradeOk() (*float32, bool)`

GetGradinggradeOk returns a tuple with the Gradinggrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradinggrade

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetGradinggrade(v float32)`

SetGradinggrade sets Gradinggrade field to given value.

### HasGradinggrade

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasGradinggrade() bool`

HasGradinggrade returns a boolean if a field has been set.

### GetGradinggradeover

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetGradinggradeover() float32`

GetGradinggradeover returns the Gradinggradeover field if non-nil, zero value otherwise.

### GetGradinggradeoverOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetGradinggradeoverOk() (*float32, bool)`

GetGradinggradeoverOk returns a tuple with the Gradinggradeover field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradinggradeover

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetGradinggradeover(v float32)`

SetGradinggradeover sets Gradinggradeover field to given value.

### HasGradinggradeover

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasGradinggradeover() bool`

HasGradinggradeover returns a boolean if a field has been set.

### GetGradinggradeoverby

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetGradinggradeoverby() int32`

GetGradinggradeoverby returns the Gradinggradeoverby field if non-nil, zero value otherwise.

### GetGradinggradeoverbyOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetGradinggradeoverbyOk() (*int32, bool)`

GetGradinggradeoverbyOk returns a tuple with the Gradinggradeoverby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradinggradeoverby

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetGradinggradeoverby(v int32)`

SetGradinggradeoverby sets Gradinggradeoverby field to given value.

### HasGradinggradeoverby

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasGradinggradeoverby() bool`

HasGradinggradeoverby returns a boolean if a field has been set.

### GetId

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetReviewerid

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetReviewerid() int32`

GetReviewerid returns the Reviewerid field if non-nil, zero value otherwise.

### GetRevieweridOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetRevieweridOk() (*int32, bool)`

GetRevieweridOk returns a tuple with the Reviewerid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewerid

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetReviewerid(v int32)`

SetReviewerid sets Reviewerid field to given value.

### HasReviewerid

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasReviewerid() bool`

HasReviewerid returns a boolean if a field has been set.

### GetSubmissionid

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetSubmissionid() int32`

GetSubmissionid returns the Submissionid field if non-nil, zero value otherwise.

### GetSubmissionidOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetSubmissionidOk() (*int32, bool)`

GetSubmissionidOk returns a tuple with the Submissionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionid

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetSubmissionid(v int32)`

SetSubmissionid sets Submissionid field to given value.

### HasSubmissionid

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasSubmissionid() bool`

HasSubmissionid returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetWeight

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetWeight() int32`

GetWeight returns the Weight field if non-nil, zero value otherwise.

### GetWeightOk

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) GetWeightOk() (*int32, bool)`

GetWeightOk returns a tuple with the Weight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeight

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) SetWeight(v int32)`

SetWeight sets Weight field to given value.

### HasWeight

`func (o *ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) HasWeight() bool`

HasWeight returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


