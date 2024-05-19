# ModLessonGetLessonsByCourses200ResponseLessonsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Activitylink** | Pointer to **int32** | Id of the next activity to be linked once the lesson is completed | [optional] 
**Allowofflineattempts** | Pointer to **bool** | Whether to allow the lesson to be attempted offline in the mobile app | [optional] 
**Available** | Pointer to **int32** | Available from | [optional] 
**Bgcolor** | Pointer to **string** | Slideshow bgcolor | [optional] 
**Completionendreached** | Pointer to **int32** | Require end reached for completion? | [optional] 
**Completiontimespent** | Pointer to **int32** | Student must do this activity at least for | [optional] 
**Conditions** | Pointer to **string** | Conditions to enable the lesson | [optional] 
**Course** | Pointer to **int32** | Foreign key reference to the course this lesson is part of. | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id. | [optional] 
**Custom** | Pointer to **bool** | Custom scoring? | [optional] 
**Deadline** | Pointer to **int32** | Available until | [optional] 
**Dependency** | Pointer to **int32** | Dependent on (another lesson id) | [optional] 
**Displayleft** | Pointer to **bool** | Display left pages menu? | [optional] 
**Displayleftif** | Pointer to **int32** | Minimum grade to display menu | [optional] 
**Feedback** | Pointer to **bool** | Display default feedback | [optional] 
**Grade** | Pointer to **int32** | The total that the grade is scaled to be out of | [optional] 
**Height** | Pointer to **int32** | Slideshow height | [optional] 
**Id** | Pointer to **int32** | Standard Moodle primary key. | [optional] 
**Intro** | Pointer to **string** | Lesson introduction text. | [optional] 
**Introfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Maxanswers** | Pointer to **int32** | Maximum answers per page | [optional] 
**Maxattempts** | Pointer to **int32** | Maximum attempts | [optional] 
**Maxpages** | Pointer to **int32** | Number of pages to show | [optional] 
**Mediaclose** | Pointer to **int32** | Display a close button in the popup? | [optional] 
**Mediafile** | Pointer to **string** | Local file path or full external URL | [optional] 
**Mediafiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Mediaheight** | Pointer to **int32** | Popup for media file height | [optional] 
**Mediawidth** | Pointer to **int32** | Popup for media with | [optional] 
**Minquestions** | Pointer to **int32** | Minimum number of questions | [optional] 
**Modattempts** | Pointer to **bool** | Allow student review? | [optional] 
**Name** | Pointer to **string** | Lesson name. | [optional] 
**Nextpagedefault** | Pointer to **int32** | Action for a correct answer | [optional] 
**Ongoing** | Pointer to **bool** | Display ongoing score? | [optional] 
**Password** | Pointer to **string** | Password | [optional] 
**Practice** | Pointer to **bool** | Practice lesson? | [optional] 
**Progressbar** | Pointer to **bool** | Display progress bar? | [optional] 
**Retake** | Pointer to **bool** | Re-takes allowed | [optional] 
**Review** | Pointer to **bool** | Provide option to try a question again | [optional] 
**Slideshow** | Pointer to **bool** | Display lesson as slideshow | [optional] 
**Timelimit** | Pointer to **int32** | Time limit | [optional] 
**Timemodified** | Pointer to **int32** | Last time settings were updated | [optional] 
**Usemaxgrade** | Pointer to **int32** | How to calculate the final grade | [optional] 
**Usepassword** | Pointer to **bool** | Password protected lesson? | [optional] 
**Width** | Pointer to **int32** | Slideshow width | [optional] 

## Methods

### NewModLessonGetLessonsByCourses200ResponseLessonsInner

`func NewModLessonGetLessonsByCourses200ResponseLessonsInner() *ModLessonGetLessonsByCourses200ResponseLessonsInner`

NewModLessonGetLessonsByCourses200ResponseLessonsInner instantiates a new ModLessonGetLessonsByCourses200ResponseLessonsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetLessonsByCourses200ResponseLessonsInnerWithDefaults

`func NewModLessonGetLessonsByCourses200ResponseLessonsInnerWithDefaults() *ModLessonGetLessonsByCourses200ResponseLessonsInner`

NewModLessonGetLessonsByCourses200ResponseLessonsInnerWithDefaults instantiates a new ModLessonGetLessonsByCourses200ResponseLessonsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActivitylink

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetActivitylink() int32`

GetActivitylink returns the Activitylink field if non-nil, zero value otherwise.

### GetActivitylinkOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetActivitylinkOk() (*int32, bool)`

GetActivitylinkOk returns a tuple with the Activitylink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivitylink

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetActivitylink(v int32)`

SetActivitylink sets Activitylink field to given value.

### HasActivitylink

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasActivitylink() bool`

HasActivitylink returns a boolean if a field has been set.

### GetAllowofflineattempts

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetAllowofflineattempts() bool`

GetAllowofflineattempts returns the Allowofflineattempts field if non-nil, zero value otherwise.

### GetAllowofflineattemptsOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetAllowofflineattemptsOk() (*bool, bool)`

GetAllowofflineattemptsOk returns a tuple with the Allowofflineattempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowofflineattempts

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetAllowofflineattempts(v bool)`

SetAllowofflineattempts sets Allowofflineattempts field to given value.

### HasAllowofflineattempts

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasAllowofflineattempts() bool`

HasAllowofflineattempts returns a boolean if a field has been set.

### GetAvailable

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetAvailable() int32`

GetAvailable returns the Available field if non-nil, zero value otherwise.

### GetAvailableOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetAvailableOk() (*int32, bool)`

GetAvailableOk returns a tuple with the Available field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailable

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetAvailable(v int32)`

SetAvailable sets Available field to given value.

### HasAvailable

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasAvailable() bool`

HasAvailable returns a boolean if a field has been set.

### GetBgcolor

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetBgcolor() string`

GetBgcolor returns the Bgcolor field if non-nil, zero value otherwise.

### GetBgcolorOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetBgcolorOk() (*string, bool)`

GetBgcolorOk returns a tuple with the Bgcolor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBgcolor

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetBgcolor(v string)`

SetBgcolor sets Bgcolor field to given value.

### HasBgcolor

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasBgcolor() bool`

HasBgcolor returns a boolean if a field has been set.

### GetCompletionendreached

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetCompletionendreached() int32`

GetCompletionendreached returns the Completionendreached field if non-nil, zero value otherwise.

### GetCompletionendreachedOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetCompletionendreachedOk() (*int32, bool)`

GetCompletionendreachedOk returns a tuple with the Completionendreached field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionendreached

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetCompletionendreached(v int32)`

SetCompletionendreached sets Completionendreached field to given value.

### HasCompletionendreached

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasCompletionendreached() bool`

HasCompletionendreached returns a boolean if a field has been set.

### GetCompletiontimespent

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetCompletiontimespent() int32`

GetCompletiontimespent returns the Completiontimespent field if non-nil, zero value otherwise.

### GetCompletiontimespentOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetCompletiontimespentOk() (*int32, bool)`

GetCompletiontimespentOk returns a tuple with the Completiontimespent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletiontimespent

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetCompletiontimespent(v int32)`

SetCompletiontimespent sets Completiontimespent field to given value.

### HasCompletiontimespent

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasCompletiontimespent() bool`

HasCompletiontimespent returns a boolean if a field has been set.

### GetConditions

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetConditions() string`

GetConditions returns the Conditions field if non-nil, zero value otherwise.

### GetConditionsOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetConditionsOk() (*string, bool)`

GetConditionsOk returns a tuple with the Conditions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConditions

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetConditions(v string)`

SetConditions sets Conditions field to given value.

### HasConditions

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasConditions() bool`

HasConditions returns a boolean if a field has been set.

### GetCourse

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetCustom

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetCustom() bool`

GetCustom returns the Custom field if non-nil, zero value otherwise.

### GetCustomOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetCustomOk() (*bool, bool)`

GetCustomOk returns a tuple with the Custom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetCustom(v bool)`

SetCustom sets Custom field to given value.

### HasCustom

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasCustom() bool`

HasCustom returns a boolean if a field has been set.

### GetDeadline

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetDeadline() int32`

GetDeadline returns the Deadline field if non-nil, zero value otherwise.

### GetDeadlineOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetDeadlineOk() (*int32, bool)`

GetDeadlineOk returns a tuple with the Deadline field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeadline

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetDeadline(v int32)`

SetDeadline sets Deadline field to given value.

### HasDeadline

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasDeadline() bool`

HasDeadline returns a boolean if a field has been set.

### GetDependency

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetDependency() int32`

GetDependency returns the Dependency field if non-nil, zero value otherwise.

### GetDependencyOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetDependencyOk() (*int32, bool)`

GetDependencyOk returns a tuple with the Dependency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDependency

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetDependency(v int32)`

SetDependency sets Dependency field to given value.

### HasDependency

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasDependency() bool`

HasDependency returns a boolean if a field has been set.

### GetDisplayleft

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetDisplayleft() bool`

GetDisplayleft returns the Displayleft field if non-nil, zero value otherwise.

### GetDisplayleftOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetDisplayleftOk() (*bool, bool)`

GetDisplayleftOk returns a tuple with the Displayleft field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayleft

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetDisplayleft(v bool)`

SetDisplayleft sets Displayleft field to given value.

### HasDisplayleft

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasDisplayleft() bool`

HasDisplayleft returns a boolean if a field has been set.

### GetDisplayleftif

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetDisplayleftif() int32`

GetDisplayleftif returns the Displayleftif field if non-nil, zero value otherwise.

### GetDisplayleftifOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetDisplayleftifOk() (*int32, bool)`

GetDisplayleftifOk returns a tuple with the Displayleftif field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayleftif

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetDisplayleftif(v int32)`

SetDisplayleftif sets Displayleftif field to given value.

### HasDisplayleftif

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasDisplayleftif() bool`

HasDisplayleftif returns a boolean if a field has been set.

### GetFeedback

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetFeedback() bool`

GetFeedback returns the Feedback field if non-nil, zero value otherwise.

### GetFeedbackOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetFeedbackOk() (*bool, bool)`

GetFeedbackOk returns a tuple with the Feedback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedback

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetFeedback(v bool)`

SetFeedback sets Feedback field to given value.

### HasFeedback

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasFeedback() bool`

HasFeedback returns a boolean if a field has been set.

### GetGrade

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetGrade() int32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetGradeOk() (*int32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetGrade(v int32)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetHeight

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetHeight() int32`

GetHeight returns the Height field if non-nil, zero value otherwise.

### GetHeightOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetHeightOk() (*int32, bool)`

GetHeightOk returns a tuple with the Height field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeight

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetHeight(v int32)`

SetHeight sets Height field to given value.

### HasHeight

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasHeight() bool`

HasHeight returns a boolean if a field has been set.

### GetId

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetIntrofiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetIntrofilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetIntrofiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetMaxanswers

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMaxanswers() int32`

GetMaxanswers returns the Maxanswers field if non-nil, zero value otherwise.

### GetMaxanswersOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMaxanswersOk() (*int32, bool)`

GetMaxanswersOk returns a tuple with the Maxanswers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxanswers

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetMaxanswers(v int32)`

SetMaxanswers sets Maxanswers field to given value.

### HasMaxanswers

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasMaxanswers() bool`

HasMaxanswers returns a boolean if a field has been set.

### GetMaxattempts

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMaxattempts() int32`

GetMaxattempts returns the Maxattempts field if non-nil, zero value otherwise.

### GetMaxattemptsOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMaxattemptsOk() (*int32, bool)`

GetMaxattemptsOk returns a tuple with the Maxattempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxattempts

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetMaxattempts(v int32)`

SetMaxattempts sets Maxattempts field to given value.

### HasMaxattempts

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasMaxattempts() bool`

HasMaxattempts returns a boolean if a field has been set.

### GetMaxpages

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMaxpages() int32`

GetMaxpages returns the Maxpages field if non-nil, zero value otherwise.

### GetMaxpagesOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMaxpagesOk() (*int32, bool)`

GetMaxpagesOk returns a tuple with the Maxpages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxpages

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetMaxpages(v int32)`

SetMaxpages sets Maxpages field to given value.

### HasMaxpages

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasMaxpages() bool`

HasMaxpages returns a boolean if a field has been set.

### GetMediaclose

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMediaclose() int32`

GetMediaclose returns the Mediaclose field if non-nil, zero value otherwise.

### GetMediacloseOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMediacloseOk() (*int32, bool)`

GetMediacloseOk returns a tuple with the Mediaclose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaclose

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetMediaclose(v int32)`

SetMediaclose sets Mediaclose field to given value.

### HasMediaclose

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasMediaclose() bool`

HasMediaclose returns a boolean if a field has been set.

### GetMediafile

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMediafile() string`

GetMediafile returns the Mediafile field if non-nil, zero value otherwise.

### GetMediafileOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMediafileOk() (*string, bool)`

GetMediafileOk returns a tuple with the Mediafile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediafile

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetMediafile(v string)`

SetMediafile sets Mediafile field to given value.

### HasMediafile

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasMediafile() bool`

HasMediafile returns a boolean if a field has been set.

### GetMediafiles

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMediafiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetMediafiles returns the Mediafiles field if non-nil, zero value otherwise.

### GetMediafilesOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMediafilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetMediafilesOk returns a tuple with the Mediafiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediafiles

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetMediafiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetMediafiles sets Mediafiles field to given value.

### HasMediafiles

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasMediafiles() bool`

HasMediafiles returns a boolean if a field has been set.

### GetMediaheight

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMediaheight() int32`

GetMediaheight returns the Mediaheight field if non-nil, zero value otherwise.

### GetMediaheightOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMediaheightOk() (*int32, bool)`

GetMediaheightOk returns a tuple with the Mediaheight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaheight

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetMediaheight(v int32)`

SetMediaheight sets Mediaheight field to given value.

### HasMediaheight

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasMediaheight() bool`

HasMediaheight returns a boolean if a field has been set.

### GetMediawidth

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMediawidth() int32`

GetMediawidth returns the Mediawidth field if non-nil, zero value otherwise.

### GetMediawidthOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMediawidthOk() (*int32, bool)`

GetMediawidthOk returns a tuple with the Mediawidth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediawidth

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetMediawidth(v int32)`

SetMediawidth sets Mediawidth field to given value.

### HasMediawidth

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasMediawidth() bool`

HasMediawidth returns a boolean if a field has been set.

### GetMinquestions

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMinquestions() int32`

GetMinquestions returns the Minquestions field if non-nil, zero value otherwise.

### GetMinquestionsOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetMinquestionsOk() (*int32, bool)`

GetMinquestionsOk returns a tuple with the Minquestions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinquestions

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetMinquestions(v int32)`

SetMinquestions sets Minquestions field to given value.

### HasMinquestions

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasMinquestions() bool`

HasMinquestions returns a boolean if a field has been set.

### GetModattempts

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetModattempts() bool`

GetModattempts returns the Modattempts field if non-nil, zero value otherwise.

### GetModattemptsOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetModattemptsOk() (*bool, bool)`

GetModattemptsOk returns a tuple with the Modattempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModattempts

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetModattempts(v bool)`

SetModattempts sets Modattempts field to given value.

### HasModattempts

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasModattempts() bool`

HasModattempts returns a boolean if a field has been set.

### GetName

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNextpagedefault

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetNextpagedefault() int32`

GetNextpagedefault returns the Nextpagedefault field if non-nil, zero value otherwise.

### GetNextpagedefaultOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetNextpagedefaultOk() (*int32, bool)`

GetNextpagedefaultOk returns a tuple with the Nextpagedefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextpagedefault

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetNextpagedefault(v int32)`

SetNextpagedefault sets Nextpagedefault field to given value.

### HasNextpagedefault

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasNextpagedefault() bool`

HasNextpagedefault returns a boolean if a field has been set.

### GetOngoing

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetOngoing() bool`

GetOngoing returns the Ongoing field if non-nil, zero value otherwise.

### GetOngoingOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetOngoingOk() (*bool, bool)`

GetOngoingOk returns a tuple with the Ongoing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOngoing

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetOngoing(v bool)`

SetOngoing sets Ongoing field to given value.

### HasOngoing

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasOngoing() bool`

HasOngoing returns a boolean if a field has been set.

### GetPassword

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasPassword() bool`

HasPassword returns a boolean if a field has been set.

### GetPractice

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetPractice() bool`

GetPractice returns the Practice field if non-nil, zero value otherwise.

### GetPracticeOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetPracticeOk() (*bool, bool)`

GetPracticeOk returns a tuple with the Practice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPractice

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetPractice(v bool)`

SetPractice sets Practice field to given value.

### HasPractice

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasPractice() bool`

HasPractice returns a boolean if a field has been set.

### GetProgressbar

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetProgressbar() bool`

GetProgressbar returns the Progressbar field if non-nil, zero value otherwise.

### GetProgressbarOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetProgressbarOk() (*bool, bool)`

GetProgressbarOk returns a tuple with the Progressbar field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProgressbar

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetProgressbar(v bool)`

SetProgressbar sets Progressbar field to given value.

### HasProgressbar

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasProgressbar() bool`

HasProgressbar returns a boolean if a field has been set.

### GetRetake

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetRetake() bool`

GetRetake returns the Retake field if non-nil, zero value otherwise.

### GetRetakeOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetRetakeOk() (*bool, bool)`

GetRetakeOk returns a tuple with the Retake field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRetake

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetRetake(v bool)`

SetRetake sets Retake field to given value.

### HasRetake

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasRetake() bool`

HasRetake returns a boolean if a field has been set.

### GetReview

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetReview() bool`

GetReview returns the Review field if non-nil, zero value otherwise.

### GetReviewOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetReviewOk() (*bool, bool)`

GetReviewOk returns a tuple with the Review field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReview

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetReview(v bool)`

SetReview sets Review field to given value.

### HasReview

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasReview() bool`

HasReview returns a boolean if a field has been set.

### GetSlideshow

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetSlideshow() bool`

GetSlideshow returns the Slideshow field if non-nil, zero value otherwise.

### GetSlideshowOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetSlideshowOk() (*bool, bool)`

GetSlideshowOk returns a tuple with the Slideshow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlideshow

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetSlideshow(v bool)`

SetSlideshow sets Slideshow field to given value.

### HasSlideshow

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasSlideshow() bool`

HasSlideshow returns a boolean if a field has been set.

### GetTimelimit

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetTimelimit() int32`

GetTimelimit returns the Timelimit field if non-nil, zero value otherwise.

### GetTimelimitOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetTimelimitOk() (*int32, bool)`

GetTimelimitOk returns a tuple with the Timelimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimelimit

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetTimelimit(v int32)`

SetTimelimit sets Timelimit field to given value.

### HasTimelimit

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasTimelimit() bool`

HasTimelimit returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUsemaxgrade

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetUsemaxgrade() int32`

GetUsemaxgrade returns the Usemaxgrade field if non-nil, zero value otherwise.

### GetUsemaxgradeOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetUsemaxgradeOk() (*int32, bool)`

GetUsemaxgradeOk returns a tuple with the Usemaxgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsemaxgrade

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetUsemaxgrade(v int32)`

SetUsemaxgrade sets Usemaxgrade field to given value.

### HasUsemaxgrade

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasUsemaxgrade() bool`

HasUsemaxgrade returns a boolean if a field has been set.

### GetUsepassword

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetUsepassword() bool`

GetUsepassword returns the Usepassword field if non-nil, zero value otherwise.

### GetUsepasswordOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetUsepasswordOk() (*bool, bool)`

GetUsepasswordOk returns a tuple with the Usepassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsepassword

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetUsepassword(v bool)`

SetUsepassword sets Usepassword field to given value.

### HasUsepassword

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasUsepassword() bool`

HasUsepassword returns a boolean if a field has been set.

### GetWidth

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetWidth() int32`

GetWidth returns the Width field if non-nil, zero value otherwise.

### GetWidthOk

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) GetWidthOk() (*int32, bool)`

GetWidthOk returns a tuple with the Width field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWidth

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) SetWidth(v int32)`

SetWidth sets Width field to given value.

### HasWidth

`func (o *ModLessonGetLessonsByCourses200ResponseLessonsInner) HasWidth() bool`

HasWidth returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


