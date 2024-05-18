# ModWorkshopGetSubmission200ResponseSubmission

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attachment** | **int32** | Used by File API file_postupdate_standard_filemanager. | [default to 0]
**Attachmentfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Authorid** | **int32** | The author of the submission. | [default to null]
**Content** | **string** | Submission text. | [default to "null"]
**Contentfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Contentformat** | Pointer to **int32** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Contenttrust** | **int32** | The trust mode of the data. | [default to 0]
**Example** | **bool** | Is this submission an example from teacher. | [default to false]
**Feedbackauthor** | Pointer to **string** | Teacher comment/feedback for the author of the submission, for example describing the reasons                     for the grade overriding. | [optional] [default to "null"]
**Feedbackauthorformat** | Pointer to **int32** | feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Grade** | Pointer to **float32** | Aggregated grade for the submission. The grade is a decimal number from interval 0..100.                     If NULL then the grade for submission has not been aggregated yet. | [optional] [default to null]
**Gradeover** | Pointer to **float32** | Grade for the submission manually overridden by a teacher. Grade is always from interval 0..100.                     If NULL then the grade is not overriden. | [optional] [default to null]
**Gradeoverby** | Pointer to **int32** | The id of the user who has overridden the grade for submission. | [optional] 
**Id** | **int32** | The primary key of the record. | 
**Late** | **int32** | Has this submission been submitted after the deadline or during the assessment phase? | [default to 0]
**Published** | **bool** | Shall the submission be available to other when the workshop is closed. | [default to false]
**Timecreated** | **int32** | Timestamp when the work was submitted for the first time. | [default to null]
**Timegraded** | Pointer to **int32** | The timestamp when grade or gradeover was recently modified. | [optional] [default to null]
**Timemodified** | **int32** | Timestamp when the submission has been updated. | [default to null]
**Title** | **string** | The submission title. | [default to "null"]
**Workshopid** | **int32** | The id of the workshop instance. | [default to null]

## Methods

### NewModWorkshopGetSubmission200ResponseSubmission

`func NewModWorkshopGetSubmission200ResponseSubmission(attachment int32, authorid int32, content string, contenttrust int32, example bool, id int32, late int32, published bool, timecreated int32, timemodified int32, title string, workshopid int32, ) *ModWorkshopGetSubmission200ResponseSubmission`

NewModWorkshopGetSubmission200ResponseSubmission instantiates a new ModWorkshopGetSubmission200ResponseSubmission object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetSubmission200ResponseSubmissionWithDefaults

`func NewModWorkshopGetSubmission200ResponseSubmissionWithDefaults() *ModWorkshopGetSubmission200ResponseSubmission`

NewModWorkshopGetSubmission200ResponseSubmissionWithDefaults instantiates a new ModWorkshopGetSubmission200ResponseSubmission object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttachment

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetAttachment() int32`

GetAttachment returns the Attachment field if non-nil, zero value otherwise.

### GetAttachmentOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetAttachmentOk() (*int32, bool)`

GetAttachmentOk returns a tuple with the Attachment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachment

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetAttachment(v int32)`

SetAttachment sets Attachment field to given value.


### GetAttachmentfiles

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetAttachmentfiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetAttachmentfiles returns the Attachmentfiles field if non-nil, zero value otherwise.

### GetAttachmentfilesOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetAttachmentfilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetAttachmentfilesOk returns a tuple with the Attachmentfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachmentfiles

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetAttachmentfiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetAttachmentfiles sets Attachmentfiles field to given value.

### HasAttachmentfiles

`func (o *ModWorkshopGetSubmission200ResponseSubmission) HasAttachmentfiles() bool`

HasAttachmentfiles returns a boolean if a field has been set.

### GetAuthorid

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetAuthorid() int32`

GetAuthorid returns the Authorid field if non-nil, zero value otherwise.

### GetAuthoridOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetAuthoridOk() (*int32, bool)`

GetAuthoridOk returns a tuple with the Authorid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthorid

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetAuthorid(v int32)`

SetAuthorid sets Authorid field to given value.


### GetContent

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetContent(v string)`

SetContent sets Content field to given value.


### GetContentfiles

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetContentfiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetContentfiles returns the Contentfiles field if non-nil, zero value otherwise.

### GetContentfilesOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetContentfilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetContentfilesOk returns a tuple with the Contentfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentfiles

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetContentfiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetContentfiles sets Contentfiles field to given value.

### HasContentfiles

`func (o *ModWorkshopGetSubmission200ResponseSubmission) HasContentfiles() bool`

HasContentfiles returns a boolean if a field has been set.

### GetContentformat

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetContentformat() int32`

GetContentformat returns the Contentformat field if non-nil, zero value otherwise.

### GetContentformatOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetContentformatOk() (*int32, bool)`

GetContentformatOk returns a tuple with the Contentformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentformat

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetContentformat(v int32)`

SetContentformat sets Contentformat field to given value.

### HasContentformat

`func (o *ModWorkshopGetSubmission200ResponseSubmission) HasContentformat() bool`

HasContentformat returns a boolean if a field has been set.

### GetContenttrust

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetContenttrust() int32`

GetContenttrust returns the Contenttrust field if non-nil, zero value otherwise.

### GetContenttrustOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetContenttrustOk() (*int32, bool)`

GetContenttrustOk returns a tuple with the Contenttrust field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContenttrust

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetContenttrust(v int32)`

SetContenttrust sets Contenttrust field to given value.


### GetExample

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetExample() bool`

GetExample returns the Example field if non-nil, zero value otherwise.

### GetExampleOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetExampleOk() (*bool, bool)`

GetExampleOk returns a tuple with the Example field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExample

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetExample(v bool)`

SetExample sets Example field to given value.


### GetFeedbackauthor

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetFeedbackauthor() string`

GetFeedbackauthor returns the Feedbackauthor field if non-nil, zero value otherwise.

### GetFeedbackauthorOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetFeedbackauthorOk() (*string, bool)`

GetFeedbackauthorOk returns a tuple with the Feedbackauthor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackauthor

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetFeedbackauthor(v string)`

SetFeedbackauthor sets Feedbackauthor field to given value.

### HasFeedbackauthor

`func (o *ModWorkshopGetSubmission200ResponseSubmission) HasFeedbackauthor() bool`

HasFeedbackauthor returns a boolean if a field has been set.

### GetFeedbackauthorformat

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetFeedbackauthorformat() int32`

GetFeedbackauthorformat returns the Feedbackauthorformat field if non-nil, zero value otherwise.

### GetFeedbackauthorformatOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetFeedbackauthorformatOk() (*int32, bool)`

GetFeedbackauthorformatOk returns a tuple with the Feedbackauthorformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackauthorformat

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetFeedbackauthorformat(v int32)`

SetFeedbackauthorformat sets Feedbackauthorformat field to given value.

### HasFeedbackauthorformat

`func (o *ModWorkshopGetSubmission200ResponseSubmission) HasFeedbackauthorformat() bool`

HasFeedbackauthorformat returns a boolean if a field has been set.

### GetGrade

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetGrade() float32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetGradeOk() (*float32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetGrade(v float32)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *ModWorkshopGetSubmission200ResponseSubmission) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetGradeover

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetGradeover() float32`

GetGradeover returns the Gradeover field if non-nil, zero value otherwise.

### GetGradeoverOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetGradeoverOk() (*float32, bool)`

GetGradeoverOk returns a tuple with the Gradeover field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradeover

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetGradeover(v float32)`

SetGradeover sets Gradeover field to given value.

### HasGradeover

`func (o *ModWorkshopGetSubmission200ResponseSubmission) HasGradeover() bool`

HasGradeover returns a boolean if a field has been set.

### GetGradeoverby

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetGradeoverby() int32`

GetGradeoverby returns the Gradeoverby field if non-nil, zero value otherwise.

### GetGradeoverbyOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetGradeoverbyOk() (*int32, bool)`

GetGradeoverbyOk returns a tuple with the Gradeoverby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradeoverby

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetGradeoverby(v int32)`

SetGradeoverby sets Gradeoverby field to given value.

### HasGradeoverby

`func (o *ModWorkshopGetSubmission200ResponseSubmission) HasGradeoverby() bool`

HasGradeoverby returns a boolean if a field has been set.

### GetId

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetId(v int32)`

SetId sets Id field to given value.


### GetLate

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetLate() int32`

GetLate returns the Late field if non-nil, zero value otherwise.

### GetLateOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetLateOk() (*int32, bool)`

GetLateOk returns a tuple with the Late field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLate

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetLate(v int32)`

SetLate sets Late field to given value.


### GetPublished

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetPublished() bool`

GetPublished returns the Published field if non-nil, zero value otherwise.

### GetPublishedOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetPublishedOk() (*bool, bool)`

GetPublishedOk returns a tuple with the Published field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublished

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetPublished(v bool)`

SetPublished sets Published field to given value.


### GetTimecreated

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimegraded

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetTimegraded() int32`

GetTimegraded returns the Timegraded field if non-nil, zero value otherwise.

### GetTimegradedOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetTimegradedOk() (*int32, bool)`

GetTimegradedOk returns a tuple with the Timegraded field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimegraded

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetTimegraded(v int32)`

SetTimegraded sets Timegraded field to given value.

### HasTimegraded

`func (o *ModWorkshopGetSubmission200ResponseSubmission) HasTimegraded() bool`

HasTimegraded returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetTitle

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetTitle(v string)`

SetTitle sets Title field to given value.


### GetWorkshopid

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetWorkshopid() int32`

GetWorkshopid returns the Workshopid field if non-nil, zero value otherwise.

### GetWorkshopidOk

`func (o *ModWorkshopGetSubmission200ResponseSubmission) GetWorkshopidOk() (*int32, bool)`

GetWorkshopidOk returns a tuple with the Workshopid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWorkshopid

`func (o *ModWorkshopGetSubmission200ResponseSubmission) SetWorkshopid(v int32)`

SetWorkshopid sets Workshopid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


