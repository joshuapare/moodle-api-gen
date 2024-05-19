# ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assessmentend** | Pointer to **int32** | 0 &#x3D; will be closed manually, greater than 0 the timestamp of the end of the assessment phase. | [optional] [default to 0]
**Assessmentstart** | Pointer to **int32** | 0 &#x3D; will be started manually, greater than 0 the timestamp of the start of the assessment phase. | [optional] [default to 0]
**Conclusion** | Pointer to **string** | A text to be displayed at the end of the workshop. | [optional] [default to "null"]
**Conclusionfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Conclusionformat** | Pointer to **int32** | conclusion format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Course** | Pointer to **int32** | Course id this workshop is part of. | [optional] [default to null]
**Coursemodule** | Pointer to **int32** | coursemodule | [optional] 
**Evaluation** | Pointer to **string** | The recently used grading evaluation method. | [optional] [default to "null"]
**Examplesmode** | Pointer to **int32** | 0 &#x3D; example assessments are voluntary, 1 &#x3D; examples must be assessed before submission,                     2 &#x3D; examples are available after own submission and must be assessed before peer/self assessment phase. | [optional] [default to 0]
**Grade** | Pointer to **float32** | The maximum grade for submission. | [optional] [default to 80]
**Gradedecimals** | Pointer to **int32** | Number of digits that should be shown after the decimal point when displaying grades. | [optional] [default to 0]
**Gradinggrade** | Pointer to **float32** | The maximum grade for assessment. | [optional] [default to 20]
**Id** | Pointer to **int32** | The primary key of the record. | [optional] 
**Instructauthors** | Pointer to **string** | Instructions for the submission phase. | [optional] [default to "null"]
**Instructauthorsfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Instructauthorsformat** | Pointer to **int32** | instructauthors format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Instructreviewers** | Pointer to **string** | Instructions for the assessment phase. | [optional] [default to "null"]
**Instructreviewersfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Instructreviewersformat** | Pointer to **int32** | instructreviewers format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Intro** | Pointer to **string** | Workshop introduction text. | [optional] [default to ""]
**Introfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Latesubmissions** | Pointer to **bool** | Allow submitting the work after the deadline. | [optional] [default to false]
**Maxbytes** | Pointer to **int32** | Maximum size of the one attached file. | [optional] [default to 100000]
**Name** | Pointer to **string** | Workshop name. | [optional] [default to "null"]
**Nattachments** | Pointer to **int32** | Maximum number of submission attachments. | [optional] [default to 1]
**Overallfeedbackfiles** | Pointer to **int32** | Number of allowed attachments to the overall feedback. | [optional] [default to 0]
**Overallfeedbackfiletypes** | Pointer to **string** | Comma separated list of file extensions. | [optional] [default to "null"]
**Overallfeedbackmaxbytes** | Pointer to **int32** | Maximum size of one file attached to the overall feedback. | [optional] [default to 100000]
**Overallfeedbackmode** | Pointer to **int32** | Mode of the overall feedback support. | [optional] [default to 1]
**Phase** | Pointer to **int32** | The current phase of workshop (0 &#x3D; not available, 1 &#x3D; submission, 2 &#x3D; assessment, 3 &#x3D; closed). | [optional] [default to 0]
**Phaseswitchassessment** | Pointer to **bool** | Automatically switch to the assessment phase after the submissions deadline. | [optional] [default to false]
**Strategy** | Pointer to **string** | The type of the current grading strategy used in this workshop. | [optional] [default to "null"]
**Submissionend** | Pointer to **int32** | 0 &#x3D; will be closed manually, greater than 0 the timestamp of the end of the submission phase. | [optional] [default to 0]
**Submissionfiletypes** | Pointer to **string** | Comma separated list of file extensions. | [optional] 
**Submissionstart** | Pointer to **int32** | 0 &#x3D; will be started manually, greater than 0 the timestamp of the start of the submission phase. | [optional] [default to 0]
**Submissiontypefile** | Pointer to **int32** | Indicates whether a file upload is required as part of each submission. 0 for no, 1 for optional, 2 for required. | [optional] [default to 1]
**Submissiontypetext** | Pointer to **int32** | Indicates whether text is required as part of each submission. 0 for no, 1 for optional, 2 for required. | [optional] [default to 1]
**Timemodified** | Pointer to **int32** | The timestamp when the module was modified. | [optional] [default to null]
**Useexamples** | Pointer to **bool** | Optional feature: students practise evaluating on example submissions from teacher. | [optional] [default to false]
**Usepeerassessment** | Pointer to **bool** | Optional feature: students perform peer assessment of others&#39; work. | [optional] [default to false]
**Useselfassessment** | Pointer to **bool** | Optional feature: students perform self assessment of their own work. | [optional] [default to false]

## Methods

### NewModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner

`func NewModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner() *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner`

NewModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner instantiates a new ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInnerWithDefaults

`func NewModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInnerWithDefaults() *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner`

NewModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInnerWithDefaults instantiates a new ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssessmentend

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetAssessmentend() int32`

GetAssessmentend returns the Assessmentend field if non-nil, zero value otherwise.

### GetAssessmentendOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetAssessmentendOk() (*int32, bool)`

GetAssessmentendOk returns a tuple with the Assessmentend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssessmentend

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetAssessmentend(v int32)`

SetAssessmentend sets Assessmentend field to given value.

### HasAssessmentend

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasAssessmentend() bool`

HasAssessmentend returns a boolean if a field has been set.

### GetAssessmentstart

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetAssessmentstart() int32`

GetAssessmentstart returns the Assessmentstart field if non-nil, zero value otherwise.

### GetAssessmentstartOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetAssessmentstartOk() (*int32, bool)`

GetAssessmentstartOk returns a tuple with the Assessmentstart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssessmentstart

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetAssessmentstart(v int32)`

SetAssessmentstart sets Assessmentstart field to given value.

### HasAssessmentstart

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasAssessmentstart() bool`

HasAssessmentstart returns a boolean if a field has been set.

### GetConclusion

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetConclusion() string`

GetConclusion returns the Conclusion field if non-nil, zero value otherwise.

### GetConclusionOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetConclusionOk() (*string, bool)`

GetConclusionOk returns a tuple with the Conclusion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConclusion

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetConclusion(v string)`

SetConclusion sets Conclusion field to given value.

### HasConclusion

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasConclusion() bool`

HasConclusion returns a boolean if a field has been set.

### GetConclusionfiles

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetConclusionfiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetConclusionfiles returns the Conclusionfiles field if non-nil, zero value otherwise.

### GetConclusionfilesOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetConclusionfilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetConclusionfilesOk returns a tuple with the Conclusionfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConclusionfiles

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetConclusionfiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetConclusionfiles sets Conclusionfiles field to given value.

### HasConclusionfiles

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasConclusionfiles() bool`

HasConclusionfiles returns a boolean if a field has been set.

### GetConclusionformat

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetConclusionformat() int32`

GetConclusionformat returns the Conclusionformat field if non-nil, zero value otherwise.

### GetConclusionformatOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetConclusionformatOk() (*int32, bool)`

GetConclusionformatOk returns a tuple with the Conclusionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConclusionformat

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetConclusionformat(v int32)`

SetConclusionformat sets Conclusionformat field to given value.

### HasConclusionformat

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasConclusionformat() bool`

HasConclusionformat returns a boolean if a field has been set.

### GetCourse

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetEvaluation

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetEvaluation() string`

GetEvaluation returns the Evaluation field if non-nil, zero value otherwise.

### GetEvaluationOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetEvaluationOk() (*string, bool)`

GetEvaluationOk returns a tuple with the Evaluation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvaluation

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetEvaluation(v string)`

SetEvaluation sets Evaluation field to given value.

### HasEvaluation

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasEvaluation() bool`

HasEvaluation returns a boolean if a field has been set.

### GetExamplesmode

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetExamplesmode() int32`

GetExamplesmode returns the Examplesmode field if non-nil, zero value otherwise.

### GetExamplesmodeOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetExamplesmodeOk() (*int32, bool)`

GetExamplesmodeOk returns a tuple with the Examplesmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExamplesmode

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetExamplesmode(v int32)`

SetExamplesmode sets Examplesmode field to given value.

### HasExamplesmode

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasExamplesmode() bool`

HasExamplesmode returns a boolean if a field has been set.

### GetGrade

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetGrade() float32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetGradeOk() (*float32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetGrade(v float32)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetGradedecimals

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetGradedecimals() int32`

GetGradedecimals returns the Gradedecimals field if non-nil, zero value otherwise.

### GetGradedecimalsOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetGradedecimalsOk() (*int32, bool)`

GetGradedecimalsOk returns a tuple with the Gradedecimals field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradedecimals

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetGradedecimals(v int32)`

SetGradedecimals sets Gradedecimals field to given value.

### HasGradedecimals

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasGradedecimals() bool`

HasGradedecimals returns a boolean if a field has been set.

### GetGradinggrade

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetGradinggrade() float32`

GetGradinggrade returns the Gradinggrade field if non-nil, zero value otherwise.

### GetGradinggradeOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetGradinggradeOk() (*float32, bool)`

GetGradinggradeOk returns a tuple with the Gradinggrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradinggrade

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetGradinggrade(v float32)`

SetGradinggrade sets Gradinggrade field to given value.

### HasGradinggrade

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasGradinggrade() bool`

HasGradinggrade returns a boolean if a field has been set.

### GetId

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInstructauthors

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetInstructauthors() string`

GetInstructauthors returns the Instructauthors field if non-nil, zero value otherwise.

### GetInstructauthorsOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetInstructauthorsOk() (*string, bool)`

GetInstructauthorsOk returns a tuple with the Instructauthors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructauthors

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetInstructauthors(v string)`

SetInstructauthors sets Instructauthors field to given value.

### HasInstructauthors

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasInstructauthors() bool`

HasInstructauthors returns a boolean if a field has been set.

### GetInstructauthorsfiles

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetInstructauthorsfiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetInstructauthorsfiles returns the Instructauthorsfiles field if non-nil, zero value otherwise.

### GetInstructauthorsfilesOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetInstructauthorsfilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetInstructauthorsfilesOk returns a tuple with the Instructauthorsfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructauthorsfiles

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetInstructauthorsfiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetInstructauthorsfiles sets Instructauthorsfiles field to given value.

### HasInstructauthorsfiles

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasInstructauthorsfiles() bool`

HasInstructauthorsfiles returns a boolean if a field has been set.

### GetInstructauthorsformat

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetInstructauthorsformat() int32`

GetInstructauthorsformat returns the Instructauthorsformat field if non-nil, zero value otherwise.

### GetInstructauthorsformatOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetInstructauthorsformatOk() (*int32, bool)`

GetInstructauthorsformatOk returns a tuple with the Instructauthorsformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructauthorsformat

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetInstructauthorsformat(v int32)`

SetInstructauthorsformat sets Instructauthorsformat field to given value.

### HasInstructauthorsformat

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasInstructauthorsformat() bool`

HasInstructauthorsformat returns a boolean if a field has been set.

### GetInstructreviewers

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetInstructreviewers() string`

GetInstructreviewers returns the Instructreviewers field if non-nil, zero value otherwise.

### GetInstructreviewersOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetInstructreviewersOk() (*string, bool)`

GetInstructreviewersOk returns a tuple with the Instructreviewers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructreviewers

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetInstructreviewers(v string)`

SetInstructreviewers sets Instructreviewers field to given value.

### HasInstructreviewers

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasInstructreviewers() bool`

HasInstructreviewers returns a boolean if a field has been set.

### GetInstructreviewersfiles

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetInstructreviewersfiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetInstructreviewersfiles returns the Instructreviewersfiles field if non-nil, zero value otherwise.

### GetInstructreviewersfilesOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetInstructreviewersfilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetInstructreviewersfilesOk returns a tuple with the Instructreviewersfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructreviewersfiles

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetInstructreviewersfiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetInstructreviewersfiles sets Instructreviewersfiles field to given value.

### HasInstructreviewersfiles

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasInstructreviewersfiles() bool`

HasInstructreviewersfiles returns a boolean if a field has been set.

### GetInstructreviewersformat

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetInstructreviewersformat() int32`

GetInstructreviewersformat returns the Instructreviewersformat field if non-nil, zero value otherwise.

### GetInstructreviewersformatOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetInstructreviewersformatOk() (*int32, bool)`

GetInstructreviewersformatOk returns a tuple with the Instructreviewersformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructreviewersformat

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetInstructreviewersformat(v int32)`

SetInstructreviewersformat sets Instructreviewersformat field to given value.

### HasInstructreviewersformat

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasInstructreviewersformat() bool`

HasInstructreviewersformat returns a boolean if a field has been set.

### GetIntro

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetIntrofiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetIntrofilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetIntrofiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetLatesubmissions

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetLatesubmissions() bool`

GetLatesubmissions returns the Latesubmissions field if non-nil, zero value otherwise.

### GetLatesubmissionsOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetLatesubmissionsOk() (*bool, bool)`

GetLatesubmissionsOk returns a tuple with the Latesubmissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatesubmissions

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetLatesubmissions(v bool)`

SetLatesubmissions sets Latesubmissions field to given value.

### HasLatesubmissions

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasLatesubmissions() bool`

HasLatesubmissions returns a boolean if a field has been set.

### GetMaxbytes

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetMaxbytes() int32`

GetMaxbytes returns the Maxbytes field if non-nil, zero value otherwise.

### GetMaxbytesOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetMaxbytesOk() (*int32, bool)`

GetMaxbytesOk returns a tuple with the Maxbytes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxbytes

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetMaxbytes(v int32)`

SetMaxbytes sets Maxbytes field to given value.

### HasMaxbytes

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasMaxbytes() bool`

HasMaxbytes returns a boolean if a field has been set.

### GetName

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNattachments

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetNattachments() int32`

GetNattachments returns the Nattachments field if non-nil, zero value otherwise.

### GetNattachmentsOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetNattachmentsOk() (*int32, bool)`

GetNattachmentsOk returns a tuple with the Nattachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNattachments

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetNattachments(v int32)`

SetNattachments sets Nattachments field to given value.

### HasNattachments

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasNattachments() bool`

HasNattachments returns a boolean if a field has been set.

### GetOverallfeedbackfiles

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetOverallfeedbackfiles() int32`

GetOverallfeedbackfiles returns the Overallfeedbackfiles field if non-nil, zero value otherwise.

### GetOverallfeedbackfilesOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetOverallfeedbackfilesOk() (*int32, bool)`

GetOverallfeedbackfilesOk returns a tuple with the Overallfeedbackfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverallfeedbackfiles

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetOverallfeedbackfiles(v int32)`

SetOverallfeedbackfiles sets Overallfeedbackfiles field to given value.

### HasOverallfeedbackfiles

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasOverallfeedbackfiles() bool`

HasOverallfeedbackfiles returns a boolean if a field has been set.

### GetOverallfeedbackfiletypes

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetOverallfeedbackfiletypes() string`

GetOverallfeedbackfiletypes returns the Overallfeedbackfiletypes field if non-nil, zero value otherwise.

### GetOverallfeedbackfiletypesOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetOverallfeedbackfiletypesOk() (*string, bool)`

GetOverallfeedbackfiletypesOk returns a tuple with the Overallfeedbackfiletypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverallfeedbackfiletypes

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetOverallfeedbackfiletypes(v string)`

SetOverallfeedbackfiletypes sets Overallfeedbackfiletypes field to given value.

### HasOverallfeedbackfiletypes

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasOverallfeedbackfiletypes() bool`

HasOverallfeedbackfiletypes returns a boolean if a field has been set.

### GetOverallfeedbackmaxbytes

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetOverallfeedbackmaxbytes() int32`

GetOverallfeedbackmaxbytes returns the Overallfeedbackmaxbytes field if non-nil, zero value otherwise.

### GetOverallfeedbackmaxbytesOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetOverallfeedbackmaxbytesOk() (*int32, bool)`

GetOverallfeedbackmaxbytesOk returns a tuple with the Overallfeedbackmaxbytes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverallfeedbackmaxbytes

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetOverallfeedbackmaxbytes(v int32)`

SetOverallfeedbackmaxbytes sets Overallfeedbackmaxbytes field to given value.

### HasOverallfeedbackmaxbytes

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasOverallfeedbackmaxbytes() bool`

HasOverallfeedbackmaxbytes returns a boolean if a field has been set.

### GetOverallfeedbackmode

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetOverallfeedbackmode() int32`

GetOverallfeedbackmode returns the Overallfeedbackmode field if non-nil, zero value otherwise.

### GetOverallfeedbackmodeOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetOverallfeedbackmodeOk() (*int32, bool)`

GetOverallfeedbackmodeOk returns a tuple with the Overallfeedbackmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverallfeedbackmode

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetOverallfeedbackmode(v int32)`

SetOverallfeedbackmode sets Overallfeedbackmode field to given value.

### HasOverallfeedbackmode

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasOverallfeedbackmode() bool`

HasOverallfeedbackmode returns a boolean if a field has been set.

### GetPhase

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetPhase() int32`

GetPhase returns the Phase field if non-nil, zero value otherwise.

### GetPhaseOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetPhaseOk() (*int32, bool)`

GetPhaseOk returns a tuple with the Phase field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhase

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetPhase(v int32)`

SetPhase sets Phase field to given value.

### HasPhase

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasPhase() bool`

HasPhase returns a boolean if a field has been set.

### GetPhaseswitchassessment

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetPhaseswitchassessment() bool`

GetPhaseswitchassessment returns the Phaseswitchassessment field if non-nil, zero value otherwise.

### GetPhaseswitchassessmentOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetPhaseswitchassessmentOk() (*bool, bool)`

GetPhaseswitchassessmentOk returns a tuple with the Phaseswitchassessment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhaseswitchassessment

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetPhaseswitchassessment(v bool)`

SetPhaseswitchassessment sets Phaseswitchassessment field to given value.

### HasPhaseswitchassessment

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasPhaseswitchassessment() bool`

HasPhaseswitchassessment returns a boolean if a field has been set.

### GetStrategy

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetStrategy() string`

GetStrategy returns the Strategy field if non-nil, zero value otherwise.

### GetStrategyOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetStrategyOk() (*string, bool)`

GetStrategyOk returns a tuple with the Strategy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStrategy

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetStrategy(v string)`

SetStrategy sets Strategy field to given value.

### HasStrategy

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasStrategy() bool`

HasStrategy returns a boolean if a field has been set.

### GetSubmissionend

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetSubmissionend() int32`

GetSubmissionend returns the Submissionend field if non-nil, zero value otherwise.

### GetSubmissionendOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetSubmissionendOk() (*int32, bool)`

GetSubmissionendOk returns a tuple with the Submissionend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionend

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetSubmissionend(v int32)`

SetSubmissionend sets Submissionend field to given value.

### HasSubmissionend

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasSubmissionend() bool`

HasSubmissionend returns a boolean if a field has been set.

### GetSubmissionfiletypes

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetSubmissionfiletypes() string`

GetSubmissionfiletypes returns the Submissionfiletypes field if non-nil, zero value otherwise.

### GetSubmissionfiletypesOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetSubmissionfiletypesOk() (*string, bool)`

GetSubmissionfiletypesOk returns a tuple with the Submissionfiletypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionfiletypes

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetSubmissionfiletypes(v string)`

SetSubmissionfiletypes sets Submissionfiletypes field to given value.

### HasSubmissionfiletypes

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasSubmissionfiletypes() bool`

HasSubmissionfiletypes returns a boolean if a field has been set.

### GetSubmissionstart

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetSubmissionstart() int32`

GetSubmissionstart returns the Submissionstart field if non-nil, zero value otherwise.

### GetSubmissionstartOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetSubmissionstartOk() (*int32, bool)`

GetSubmissionstartOk returns a tuple with the Submissionstart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionstart

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetSubmissionstart(v int32)`

SetSubmissionstart sets Submissionstart field to given value.

### HasSubmissionstart

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasSubmissionstart() bool`

HasSubmissionstart returns a boolean if a field has been set.

### GetSubmissiontypefile

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetSubmissiontypefile() int32`

GetSubmissiontypefile returns the Submissiontypefile field if non-nil, zero value otherwise.

### GetSubmissiontypefileOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetSubmissiontypefileOk() (*int32, bool)`

GetSubmissiontypefileOk returns a tuple with the Submissiontypefile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissiontypefile

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetSubmissiontypefile(v int32)`

SetSubmissiontypefile sets Submissiontypefile field to given value.

### HasSubmissiontypefile

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasSubmissiontypefile() bool`

HasSubmissiontypefile returns a boolean if a field has been set.

### GetSubmissiontypetext

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetSubmissiontypetext() int32`

GetSubmissiontypetext returns the Submissiontypetext field if non-nil, zero value otherwise.

### GetSubmissiontypetextOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetSubmissiontypetextOk() (*int32, bool)`

GetSubmissiontypetextOk returns a tuple with the Submissiontypetext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissiontypetext

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetSubmissiontypetext(v int32)`

SetSubmissiontypetext sets Submissiontypetext field to given value.

### HasSubmissiontypetext

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasSubmissiontypetext() bool`

HasSubmissiontypetext returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUseexamples

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetUseexamples() bool`

GetUseexamples returns the Useexamples field if non-nil, zero value otherwise.

### GetUseexamplesOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetUseexamplesOk() (*bool, bool)`

GetUseexamplesOk returns a tuple with the Useexamples field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseexamples

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetUseexamples(v bool)`

SetUseexamples sets Useexamples field to given value.

### HasUseexamples

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasUseexamples() bool`

HasUseexamples returns a boolean if a field has been set.

### GetUsepeerassessment

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetUsepeerassessment() bool`

GetUsepeerassessment returns the Usepeerassessment field if non-nil, zero value otherwise.

### GetUsepeerassessmentOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetUsepeerassessmentOk() (*bool, bool)`

GetUsepeerassessmentOk returns a tuple with the Usepeerassessment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsepeerassessment

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetUsepeerassessment(v bool)`

SetUsepeerassessment sets Usepeerassessment field to given value.

### HasUsepeerassessment

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasUsepeerassessment() bool`

HasUsepeerassessment returns a boolean if a field has been set.

### GetUseselfassessment

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetUseselfassessment() bool`

GetUseselfassessment returns the Useselfassessment field if non-nil, zero value otherwise.

### GetUseselfassessmentOk

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) GetUseselfassessmentOk() (*bool, bool)`

GetUseselfassessmentOk returns a tuple with the Useselfassessment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseselfassessment

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) SetUseselfassessment(v bool)`

SetUseselfassessment sets Useselfassessment field to given value.

### HasUseselfassessment

`func (o *ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner) HasUseselfassessment() bool`

HasUseselfassessment returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


