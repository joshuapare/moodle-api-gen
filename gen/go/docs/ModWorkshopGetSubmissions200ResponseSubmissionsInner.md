# ModWorkshopGetSubmissions200ResponseSubmissionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attachment** | Pointer to **int32** | Used by File API file_postupdate_standard_filemanager. | [optional] [default to 0]
**Attachmentfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Authorid** | Pointer to **int32** | The author of the submission. | [optional] 
**Content** | Pointer to **string** | Submission text. | [optional] 
**Contentfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Contentformat** | Pointer to **int32** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Contenttrust** | Pointer to **int32** | The trust mode of the data. | [optional] [default to 0]
**Example** | Pointer to **bool** | Is this submission an example from teacher. | [optional] [default to false]
**Feedbackauthor** | Pointer to **string** | Teacher comment/feedback for the author of the submission, for example describing the reasons                     for the grade overriding. | [optional] 
**Feedbackauthorformat** | Pointer to **int32** | feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Grade** | Pointer to **float32** | Aggregated grade for the submission. The grade is a decimal number from interval 0..100.                     If NULL then the grade for submission has not been aggregated yet. | [optional] 
**Gradeover** | Pointer to **float32** | Grade for the submission manually overridden by a teacher. Grade is always from interval 0..100.                     If NULL then the grade is not overriden. | [optional] 
**Gradeoverby** | Pointer to **int32** | The id of the user who has overridden the grade for submission. | [optional] 
**Id** | Pointer to **int32** | The primary key of the record. | [optional] 
**Late** | Pointer to **int32** | Has this submission been submitted after the deadline or during the assessment phase? | [optional] [default to 0]
**Published** | Pointer to **bool** | Shall the submission be available to other when the workshop is closed. | [optional] [default to false]
**Timecreated** | Pointer to **int32** | Timestamp when the work was submitted for the first time. | [optional] 
**Timegraded** | Pointer to **int32** | The timestamp when grade or gradeover was recently modified. | [optional] 
**Timemodified** | Pointer to **int32** | Timestamp when the submission has been updated. | [optional] 
**Title** | Pointer to **string** | The submission title. | [optional] 
**Workshopid** | Pointer to **int32** | The id of the workshop instance. | [optional] 

## Methods

### NewModWorkshopGetSubmissions200ResponseSubmissionsInner

`func NewModWorkshopGetSubmissions200ResponseSubmissionsInner() *ModWorkshopGetSubmissions200ResponseSubmissionsInner`

NewModWorkshopGetSubmissions200ResponseSubmissionsInner instantiates a new ModWorkshopGetSubmissions200ResponseSubmissionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetSubmissions200ResponseSubmissionsInnerWithDefaults

`func NewModWorkshopGetSubmissions200ResponseSubmissionsInnerWithDefaults() *ModWorkshopGetSubmissions200ResponseSubmissionsInner`

NewModWorkshopGetSubmissions200ResponseSubmissionsInnerWithDefaults instantiates a new ModWorkshopGetSubmissions200ResponseSubmissionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttachment

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetAttachment() int32`

GetAttachment returns the Attachment field if non-nil, zero value otherwise.

### GetAttachmentOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetAttachmentOk() (*int32, bool)`

GetAttachmentOk returns a tuple with the Attachment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachment

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetAttachment(v int32)`

SetAttachment sets Attachment field to given value.

### HasAttachment

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasAttachment() bool`

HasAttachment returns a boolean if a field has been set.

### GetAttachmentfiles

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetAttachmentfiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetAttachmentfiles returns the Attachmentfiles field if non-nil, zero value otherwise.

### GetAttachmentfilesOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetAttachmentfilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetAttachmentfilesOk returns a tuple with the Attachmentfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachmentfiles

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetAttachmentfiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetAttachmentfiles sets Attachmentfiles field to given value.

### HasAttachmentfiles

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasAttachmentfiles() bool`

HasAttachmentfiles returns a boolean if a field has been set.

### GetAuthorid

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetAuthorid() int32`

GetAuthorid returns the Authorid field if non-nil, zero value otherwise.

### GetAuthoridOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetAuthoridOk() (*int32, bool)`

GetAuthoridOk returns a tuple with the Authorid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthorid

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetAuthorid(v int32)`

SetAuthorid sets Authorid field to given value.

### HasAuthorid

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasAuthorid() bool`

HasAuthorid returns a boolean if a field has been set.

### GetContent

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetContent(v string)`

SetContent sets Content field to given value.

### HasContent

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasContent() bool`

HasContent returns a boolean if a field has been set.

### GetContentfiles

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetContentfiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetContentfiles returns the Contentfiles field if non-nil, zero value otherwise.

### GetContentfilesOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetContentfilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetContentfilesOk returns a tuple with the Contentfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentfiles

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetContentfiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetContentfiles sets Contentfiles field to given value.

### HasContentfiles

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasContentfiles() bool`

HasContentfiles returns a boolean if a field has been set.

### GetContentformat

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetContentformat() int32`

GetContentformat returns the Contentformat field if non-nil, zero value otherwise.

### GetContentformatOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetContentformatOk() (*int32, bool)`

GetContentformatOk returns a tuple with the Contentformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentformat

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetContentformat(v int32)`

SetContentformat sets Contentformat field to given value.

### HasContentformat

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasContentformat() bool`

HasContentformat returns a boolean if a field has been set.

### GetContenttrust

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetContenttrust() int32`

GetContenttrust returns the Contenttrust field if non-nil, zero value otherwise.

### GetContenttrustOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetContenttrustOk() (*int32, bool)`

GetContenttrustOk returns a tuple with the Contenttrust field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContenttrust

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetContenttrust(v int32)`

SetContenttrust sets Contenttrust field to given value.

### HasContenttrust

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasContenttrust() bool`

HasContenttrust returns a boolean if a field has been set.

### GetExample

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetExample() bool`

GetExample returns the Example field if non-nil, zero value otherwise.

### GetExampleOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetExampleOk() (*bool, bool)`

GetExampleOk returns a tuple with the Example field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExample

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetExample(v bool)`

SetExample sets Example field to given value.

### HasExample

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasExample() bool`

HasExample returns a boolean if a field has been set.

### GetFeedbackauthor

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetFeedbackauthor() string`

GetFeedbackauthor returns the Feedbackauthor field if non-nil, zero value otherwise.

### GetFeedbackauthorOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetFeedbackauthorOk() (*string, bool)`

GetFeedbackauthorOk returns a tuple with the Feedbackauthor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackauthor

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetFeedbackauthor(v string)`

SetFeedbackauthor sets Feedbackauthor field to given value.

### HasFeedbackauthor

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasFeedbackauthor() bool`

HasFeedbackauthor returns a boolean if a field has been set.

### GetFeedbackauthorformat

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetFeedbackauthorformat() int32`

GetFeedbackauthorformat returns the Feedbackauthorformat field if non-nil, zero value otherwise.

### GetFeedbackauthorformatOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetFeedbackauthorformatOk() (*int32, bool)`

GetFeedbackauthorformatOk returns a tuple with the Feedbackauthorformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackauthorformat

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetFeedbackauthorformat(v int32)`

SetFeedbackauthorformat sets Feedbackauthorformat field to given value.

### HasFeedbackauthorformat

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasFeedbackauthorformat() bool`

HasFeedbackauthorformat returns a boolean if a field has been set.

### GetGrade

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetGrade() float32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetGradeOk() (*float32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetGrade(v float32)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetGradeover

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetGradeover() float32`

GetGradeover returns the Gradeover field if non-nil, zero value otherwise.

### GetGradeoverOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetGradeoverOk() (*float32, bool)`

GetGradeoverOk returns a tuple with the Gradeover field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradeover

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetGradeover(v float32)`

SetGradeover sets Gradeover field to given value.

### HasGradeover

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasGradeover() bool`

HasGradeover returns a boolean if a field has been set.

### GetGradeoverby

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetGradeoverby() int32`

GetGradeoverby returns the Gradeoverby field if non-nil, zero value otherwise.

### GetGradeoverbyOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetGradeoverbyOk() (*int32, bool)`

GetGradeoverbyOk returns a tuple with the Gradeoverby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradeoverby

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetGradeoverby(v int32)`

SetGradeoverby sets Gradeoverby field to given value.

### HasGradeoverby

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasGradeoverby() bool`

HasGradeoverby returns a boolean if a field has been set.

### GetId

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLate

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetLate() int32`

GetLate returns the Late field if non-nil, zero value otherwise.

### GetLateOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetLateOk() (*int32, bool)`

GetLateOk returns a tuple with the Late field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLate

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetLate(v int32)`

SetLate sets Late field to given value.

### HasLate

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasLate() bool`

HasLate returns a boolean if a field has been set.

### GetPublished

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetPublished() bool`

GetPublished returns the Published field if non-nil, zero value otherwise.

### GetPublishedOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetPublishedOk() (*bool, bool)`

GetPublishedOk returns a tuple with the Published field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublished

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetPublished(v bool)`

SetPublished sets Published field to given value.

### HasPublished

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasPublished() bool`

HasPublished returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimegraded

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetTimegraded() int32`

GetTimegraded returns the Timegraded field if non-nil, zero value otherwise.

### GetTimegradedOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetTimegradedOk() (*int32, bool)`

GetTimegradedOk returns a tuple with the Timegraded field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimegraded

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetTimegraded(v int32)`

SetTimegraded sets Timegraded field to given value.

### HasTimegraded

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasTimegraded() bool`

HasTimegraded returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTitle

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetWorkshopid

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetWorkshopid() int32`

GetWorkshopid returns the Workshopid field if non-nil, zero value otherwise.

### GetWorkshopidOk

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) GetWorkshopidOk() (*int32, bool)`

GetWorkshopidOk returns a tuple with the Workshopid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWorkshopid

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) SetWorkshopid(v int32)`

SetWorkshopid sets Workshopid field to given value.

### HasWorkshopid

`func (o *ModWorkshopGetSubmissions200ResponseSubmissionsInner) HasWorkshopid() bool`

HasWorkshopid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


