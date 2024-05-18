# ModWorkshopGetAssessment200ResponseAssessment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Feedbackattachmentfiles** | [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | 
**Feedbackauthor** | **string** | The comment/feedback from the reviewer for the author. | [default to "null"]
**Feedbackauthorattachment** | **int32** | Are there some files attached to the feedbackauthor field?                     Sets to 1 by file_postupdate_standard_filemanager(). | [default to 0]
**Feedbackauthorformat** | Pointer to **int32** | feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Feedbackcontentfiles** | [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | 
**Feedbackreviewer** | Pointer to **string** | The comment/feedback from the teacher for the reviewer.                     For example the reason why the grade for assessment was overridden | [optional] [default to "null"]
**Feedbackreviewerformat** | Pointer to **int32** | feedbackreviewer format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Grade** | **float32** | The aggregated grade for submission suggested by the reviewer.                     The grade 0..100 is computed from the values assigned to the assessment dimensions fields. If NULL then it has not been aggregated yet. | [default to null]
**Gradinggrade** | **float32** | The computed grade 0..100 for this assessment. If NULL then it has not been computed yet. | [default to null]
**Gradinggradeover** | **float32** | Grade for the assessment manually overridden by a teacher.                     Grade is always from interval 0..100. If NULL then the grade is not overriden. | [default to null]
**Gradinggradeoverby** | **int32** | The id of the user who has overridden the grade for submission. | [default to null]
**Id** | **int32** | The primary key of the record. | 
**Reviewerid** | **int32** | The id of the reviewer who makes this assessment | [default to null]
**Submissionid** | **int32** | The id of the assessed submission | [default to null]
**Timecreated** | **int32** | If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the first time | [default to 0]
**Timemodified** | **int32** | If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the last time | [default to 0]
**Weight** | **int32** | The weight of the assessment for the purposes of aggregation | [default to 1]

## Methods

### NewModWorkshopGetAssessment200ResponseAssessment

`func NewModWorkshopGetAssessment200ResponseAssessment(feedbackattachmentfiles []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, feedbackauthor string, feedbackauthorattachment int32, feedbackcontentfiles []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, grade float32, gradinggrade float32, gradinggradeover float32, gradinggradeoverby int32, id int32, reviewerid int32, submissionid int32, timecreated int32, timemodified int32, weight int32, ) *ModWorkshopGetAssessment200ResponseAssessment`

NewModWorkshopGetAssessment200ResponseAssessment instantiates a new ModWorkshopGetAssessment200ResponseAssessment object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetAssessment200ResponseAssessmentWithDefaults

`func NewModWorkshopGetAssessment200ResponseAssessmentWithDefaults() *ModWorkshopGetAssessment200ResponseAssessment`

NewModWorkshopGetAssessment200ResponseAssessmentWithDefaults instantiates a new ModWorkshopGetAssessment200ResponseAssessment object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeedbackattachmentfiles

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetFeedbackattachmentfiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetFeedbackattachmentfiles returns the Feedbackattachmentfiles field if non-nil, zero value otherwise.

### GetFeedbackattachmentfilesOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetFeedbackattachmentfilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetFeedbackattachmentfilesOk returns a tuple with the Feedbackattachmentfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackattachmentfiles

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetFeedbackattachmentfiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetFeedbackattachmentfiles sets Feedbackattachmentfiles field to given value.


### GetFeedbackauthor

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetFeedbackauthor() string`

GetFeedbackauthor returns the Feedbackauthor field if non-nil, zero value otherwise.

### GetFeedbackauthorOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetFeedbackauthorOk() (*string, bool)`

GetFeedbackauthorOk returns a tuple with the Feedbackauthor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackauthor

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetFeedbackauthor(v string)`

SetFeedbackauthor sets Feedbackauthor field to given value.


### GetFeedbackauthorattachment

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetFeedbackauthorattachment() int32`

GetFeedbackauthorattachment returns the Feedbackauthorattachment field if non-nil, zero value otherwise.

### GetFeedbackauthorattachmentOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetFeedbackauthorattachmentOk() (*int32, bool)`

GetFeedbackauthorattachmentOk returns a tuple with the Feedbackauthorattachment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackauthorattachment

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetFeedbackauthorattachment(v int32)`

SetFeedbackauthorattachment sets Feedbackauthorattachment field to given value.


### GetFeedbackauthorformat

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetFeedbackauthorformat() int32`

GetFeedbackauthorformat returns the Feedbackauthorformat field if non-nil, zero value otherwise.

### GetFeedbackauthorformatOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetFeedbackauthorformatOk() (*int32, bool)`

GetFeedbackauthorformatOk returns a tuple with the Feedbackauthorformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackauthorformat

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetFeedbackauthorformat(v int32)`

SetFeedbackauthorformat sets Feedbackauthorformat field to given value.

### HasFeedbackauthorformat

`func (o *ModWorkshopGetAssessment200ResponseAssessment) HasFeedbackauthorformat() bool`

HasFeedbackauthorformat returns a boolean if a field has been set.

### GetFeedbackcontentfiles

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetFeedbackcontentfiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetFeedbackcontentfiles returns the Feedbackcontentfiles field if non-nil, zero value otherwise.

### GetFeedbackcontentfilesOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetFeedbackcontentfilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetFeedbackcontentfilesOk returns a tuple with the Feedbackcontentfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackcontentfiles

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetFeedbackcontentfiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetFeedbackcontentfiles sets Feedbackcontentfiles field to given value.


### GetFeedbackreviewer

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetFeedbackreviewer() string`

GetFeedbackreviewer returns the Feedbackreviewer field if non-nil, zero value otherwise.

### GetFeedbackreviewerOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetFeedbackreviewerOk() (*string, bool)`

GetFeedbackreviewerOk returns a tuple with the Feedbackreviewer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackreviewer

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetFeedbackreviewer(v string)`

SetFeedbackreviewer sets Feedbackreviewer field to given value.

### HasFeedbackreviewer

`func (o *ModWorkshopGetAssessment200ResponseAssessment) HasFeedbackreviewer() bool`

HasFeedbackreviewer returns a boolean if a field has been set.

### GetFeedbackreviewerformat

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetFeedbackreviewerformat() int32`

GetFeedbackreviewerformat returns the Feedbackreviewerformat field if non-nil, zero value otherwise.

### GetFeedbackreviewerformatOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetFeedbackreviewerformatOk() (*int32, bool)`

GetFeedbackreviewerformatOk returns a tuple with the Feedbackreviewerformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackreviewerformat

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetFeedbackreviewerformat(v int32)`

SetFeedbackreviewerformat sets Feedbackreviewerformat field to given value.

### HasFeedbackreviewerformat

`func (o *ModWorkshopGetAssessment200ResponseAssessment) HasFeedbackreviewerformat() bool`

HasFeedbackreviewerformat returns a boolean if a field has been set.

### GetGrade

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetGrade() float32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetGradeOk() (*float32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetGrade(v float32)`

SetGrade sets Grade field to given value.


### GetGradinggrade

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetGradinggrade() float32`

GetGradinggrade returns the Gradinggrade field if non-nil, zero value otherwise.

### GetGradinggradeOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetGradinggradeOk() (*float32, bool)`

GetGradinggradeOk returns a tuple with the Gradinggrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradinggrade

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetGradinggrade(v float32)`

SetGradinggrade sets Gradinggrade field to given value.


### GetGradinggradeover

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetGradinggradeover() float32`

GetGradinggradeover returns the Gradinggradeover field if non-nil, zero value otherwise.

### GetGradinggradeoverOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetGradinggradeoverOk() (*float32, bool)`

GetGradinggradeoverOk returns a tuple with the Gradinggradeover field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradinggradeover

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetGradinggradeover(v float32)`

SetGradinggradeover sets Gradinggradeover field to given value.


### GetGradinggradeoverby

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetGradinggradeoverby() int32`

GetGradinggradeoverby returns the Gradinggradeoverby field if non-nil, zero value otherwise.

### GetGradinggradeoverbyOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetGradinggradeoverbyOk() (*int32, bool)`

GetGradinggradeoverbyOk returns a tuple with the Gradinggradeoverby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradinggradeoverby

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetGradinggradeoverby(v int32)`

SetGradinggradeoverby sets Gradinggradeoverby field to given value.


### GetId

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetId(v int32)`

SetId sets Id field to given value.


### GetReviewerid

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetReviewerid() int32`

GetReviewerid returns the Reviewerid field if non-nil, zero value otherwise.

### GetRevieweridOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetRevieweridOk() (*int32, bool)`

GetRevieweridOk returns a tuple with the Reviewerid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewerid

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetReviewerid(v int32)`

SetReviewerid sets Reviewerid field to given value.


### GetSubmissionid

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetSubmissionid() int32`

GetSubmissionid returns the Submissionid field if non-nil, zero value otherwise.

### GetSubmissionidOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetSubmissionidOk() (*int32, bool)`

GetSubmissionidOk returns a tuple with the Submissionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionid

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetSubmissionid(v int32)`

SetSubmissionid sets Submissionid field to given value.


### GetTimecreated

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetWeight

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetWeight() int32`

GetWeight returns the Weight field if non-nil, zero value otherwise.

### GetWeightOk

`func (o *ModWorkshopGetAssessment200ResponseAssessment) GetWeightOk() (*int32, bool)`

GetWeightOk returns a tuple with the Weight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeight

`func (o *ModWorkshopGetAssessment200ResponseAssessment) SetWeight(v int32)`

SetWeight sets Weight field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


