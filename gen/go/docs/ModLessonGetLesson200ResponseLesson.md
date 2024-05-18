# ModLessonGetLesson200ResponseLesson

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Activitylink** | Pointer to **int32** | Id of the next activity to be linked once the lesson is completed | [optional] [default to null]
**Allowofflineattempts** | **bool** | Whether to allow the lesson to be attempted offline in the mobile app | [default to null]
**Available** | Pointer to **int32** | Available from | [optional] [default to null]
**Bgcolor** | Pointer to **string** | Slideshow bgcolor | [optional] [default to "null"]
**Completionendreached** | Pointer to **int32** | Require end reached for completion? | [optional] [default to null]
**Completiontimespent** | Pointer to **int32** | Student must do this activity at least for | [optional] [default to null]
**Conditions** | Pointer to **string** | Conditions to enable the lesson | [optional] [default to "null"]
**Course** | **int32** | Foreign key reference to the course this lesson is part of. | [default to null]
**Coursemodule** | **int32** | Course module id. | [default to null]
**Custom** | Pointer to **bool** | Custom scoring? | [optional] [default to null]
**Deadline** | Pointer to **int32** | Available until | [optional] [default to null]
**Dependency** | Pointer to **int32** | Dependent on (another lesson id) | [optional] [default to null]
**Displayleft** | Pointer to **bool** | Display left pages menu? | [optional] [default to null]
**Displayleftif** | Pointer to **int32** | Minimum grade to display menu | [optional] [default to null]
**Feedback** | Pointer to **bool** | Display default feedback | [optional] [default to null]
**Grade** | Pointer to **int32** | The total that the grade is scaled to be out of | [optional] [default to null]
**Height** | Pointer to **int32** | Slideshow height | [optional] [default to null]
**Id** | **int32** | Standard Moodle primary key. | [default to null]
**Intro** | Pointer to **string** | Lesson introduction text. | [optional] [default to "null"]
**Introfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Lang** | **string** | Forced activity language | 
**Maxanswers** | Pointer to **int32** | Maximum answers per page | [optional] [default to null]
**Maxattempts** | Pointer to **int32** | Maximum attempts | [optional] [default to null]
**Maxpages** | Pointer to **int32** | Number of pages to show | [optional] [default to null]
**Mediaclose** | Pointer to **int32** | Display a close button in the popup? | [optional] [default to null]
**Mediafile** | Pointer to **string** | Local file path or full external URL | [optional] [default to "null"]
**Mediafiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Mediaheight** | Pointer to **int32** | Popup for media file height | [optional] [default to null]
**Mediawidth** | Pointer to **int32** | Popup for media with | [optional] [default to null]
**Minquestions** | Pointer to **int32** | Minimum number of questions | [optional] [default to null]
**Modattempts** | Pointer to **bool** | Allow student review? | [optional] [default to null]
**Name** | **string** | Lesson name. | [default to "null"]
**Nextpagedefault** | Pointer to **int32** | Action for a correct answer | [optional] [default to null]
**Ongoing** | Pointer to **bool** | Display ongoing score? | [optional] [default to null]
**Password** | Pointer to **string** | Password | [optional] [default to "null"]
**Practice** | Pointer to **bool** | Practice lesson? | [optional] [default to null]
**Progressbar** | Pointer to **bool** | Display progress bar? | [optional] [default to null]
**Retake** | Pointer to **bool** | Re-takes allowed | [optional] [default to null]
**Review** | Pointer to **bool** | Provide option to try a question again | [optional] [default to null]
**Slideshow** | Pointer to **bool** | Display lesson as slideshow | [optional] [default to null]
**Timelimit** | Pointer to **int32** | Time limit | [optional] [default to null]
**Timemodified** | Pointer to **int32** | Last time settings were updated | [optional] [default to null]
**Usemaxgrade** | Pointer to **int32** | How to calculate the final grade | [optional] [default to null]
**Usepassword** | Pointer to **bool** | Password protected lesson? | [optional] [default to null]
**Width** | Pointer to **int32** | Slideshow width | [optional] [default to null]

## Methods

### NewModLessonGetLesson200ResponseLesson

`func NewModLessonGetLesson200ResponseLesson(allowofflineattempts bool, course int32, coursemodule int32, id int32, lang string, name string, ) *ModLessonGetLesson200ResponseLesson`

NewModLessonGetLesson200ResponseLesson instantiates a new ModLessonGetLesson200ResponseLesson object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetLesson200ResponseLessonWithDefaults

`func NewModLessonGetLesson200ResponseLessonWithDefaults() *ModLessonGetLesson200ResponseLesson`

NewModLessonGetLesson200ResponseLessonWithDefaults instantiates a new ModLessonGetLesson200ResponseLesson object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActivitylink

`func (o *ModLessonGetLesson200ResponseLesson) GetActivitylink() int32`

GetActivitylink returns the Activitylink field if non-nil, zero value otherwise.

### GetActivitylinkOk

`func (o *ModLessonGetLesson200ResponseLesson) GetActivitylinkOk() (*int32, bool)`

GetActivitylinkOk returns a tuple with the Activitylink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivitylink

`func (o *ModLessonGetLesson200ResponseLesson) SetActivitylink(v int32)`

SetActivitylink sets Activitylink field to given value.

### HasActivitylink

`func (o *ModLessonGetLesson200ResponseLesson) HasActivitylink() bool`

HasActivitylink returns a boolean if a field has been set.

### GetAllowofflineattempts

`func (o *ModLessonGetLesson200ResponseLesson) GetAllowofflineattempts() bool`

GetAllowofflineattempts returns the Allowofflineattempts field if non-nil, zero value otherwise.

### GetAllowofflineattemptsOk

`func (o *ModLessonGetLesson200ResponseLesson) GetAllowofflineattemptsOk() (*bool, bool)`

GetAllowofflineattemptsOk returns a tuple with the Allowofflineattempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowofflineattempts

`func (o *ModLessonGetLesson200ResponseLesson) SetAllowofflineattempts(v bool)`

SetAllowofflineattempts sets Allowofflineattempts field to given value.


### GetAvailable

`func (o *ModLessonGetLesson200ResponseLesson) GetAvailable() int32`

GetAvailable returns the Available field if non-nil, zero value otherwise.

### GetAvailableOk

`func (o *ModLessonGetLesson200ResponseLesson) GetAvailableOk() (*int32, bool)`

GetAvailableOk returns a tuple with the Available field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailable

`func (o *ModLessonGetLesson200ResponseLesson) SetAvailable(v int32)`

SetAvailable sets Available field to given value.

### HasAvailable

`func (o *ModLessonGetLesson200ResponseLesson) HasAvailable() bool`

HasAvailable returns a boolean if a field has been set.

### GetBgcolor

`func (o *ModLessonGetLesson200ResponseLesson) GetBgcolor() string`

GetBgcolor returns the Bgcolor field if non-nil, zero value otherwise.

### GetBgcolorOk

`func (o *ModLessonGetLesson200ResponseLesson) GetBgcolorOk() (*string, bool)`

GetBgcolorOk returns a tuple with the Bgcolor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBgcolor

`func (o *ModLessonGetLesson200ResponseLesson) SetBgcolor(v string)`

SetBgcolor sets Bgcolor field to given value.

### HasBgcolor

`func (o *ModLessonGetLesson200ResponseLesson) HasBgcolor() bool`

HasBgcolor returns a boolean if a field has been set.

### GetCompletionendreached

`func (o *ModLessonGetLesson200ResponseLesson) GetCompletionendreached() int32`

GetCompletionendreached returns the Completionendreached field if non-nil, zero value otherwise.

### GetCompletionendreachedOk

`func (o *ModLessonGetLesson200ResponseLesson) GetCompletionendreachedOk() (*int32, bool)`

GetCompletionendreachedOk returns a tuple with the Completionendreached field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionendreached

`func (o *ModLessonGetLesson200ResponseLesson) SetCompletionendreached(v int32)`

SetCompletionendreached sets Completionendreached field to given value.

### HasCompletionendreached

`func (o *ModLessonGetLesson200ResponseLesson) HasCompletionendreached() bool`

HasCompletionendreached returns a boolean if a field has been set.

### GetCompletiontimespent

`func (o *ModLessonGetLesson200ResponseLesson) GetCompletiontimespent() int32`

GetCompletiontimespent returns the Completiontimespent field if non-nil, zero value otherwise.

### GetCompletiontimespentOk

`func (o *ModLessonGetLesson200ResponseLesson) GetCompletiontimespentOk() (*int32, bool)`

GetCompletiontimespentOk returns a tuple with the Completiontimespent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletiontimespent

`func (o *ModLessonGetLesson200ResponseLesson) SetCompletiontimespent(v int32)`

SetCompletiontimespent sets Completiontimespent field to given value.

### HasCompletiontimespent

`func (o *ModLessonGetLesson200ResponseLesson) HasCompletiontimespent() bool`

HasCompletiontimespent returns a boolean if a field has been set.

### GetConditions

`func (o *ModLessonGetLesson200ResponseLesson) GetConditions() string`

GetConditions returns the Conditions field if non-nil, zero value otherwise.

### GetConditionsOk

`func (o *ModLessonGetLesson200ResponseLesson) GetConditionsOk() (*string, bool)`

GetConditionsOk returns a tuple with the Conditions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConditions

`func (o *ModLessonGetLesson200ResponseLesson) SetConditions(v string)`

SetConditions sets Conditions field to given value.

### HasConditions

`func (o *ModLessonGetLesson200ResponseLesson) HasConditions() bool`

HasConditions returns a boolean if a field has been set.

### GetCourse

`func (o *ModLessonGetLesson200ResponseLesson) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModLessonGetLesson200ResponseLesson) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModLessonGetLesson200ResponseLesson) SetCourse(v int32)`

SetCourse sets Course field to given value.


### GetCoursemodule

`func (o *ModLessonGetLesson200ResponseLesson) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModLessonGetLesson200ResponseLesson) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModLessonGetLesson200ResponseLesson) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.


### GetCustom

`func (o *ModLessonGetLesson200ResponseLesson) GetCustom() bool`

GetCustom returns the Custom field if non-nil, zero value otherwise.

### GetCustomOk

`func (o *ModLessonGetLesson200ResponseLesson) GetCustomOk() (*bool, bool)`

GetCustomOk returns a tuple with the Custom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom

`func (o *ModLessonGetLesson200ResponseLesson) SetCustom(v bool)`

SetCustom sets Custom field to given value.

### HasCustom

`func (o *ModLessonGetLesson200ResponseLesson) HasCustom() bool`

HasCustom returns a boolean if a field has been set.

### GetDeadline

`func (o *ModLessonGetLesson200ResponseLesson) GetDeadline() int32`

GetDeadline returns the Deadline field if non-nil, zero value otherwise.

### GetDeadlineOk

`func (o *ModLessonGetLesson200ResponseLesson) GetDeadlineOk() (*int32, bool)`

GetDeadlineOk returns a tuple with the Deadline field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeadline

`func (o *ModLessonGetLesson200ResponseLesson) SetDeadline(v int32)`

SetDeadline sets Deadline field to given value.

### HasDeadline

`func (o *ModLessonGetLesson200ResponseLesson) HasDeadline() bool`

HasDeadline returns a boolean if a field has been set.

### GetDependency

`func (o *ModLessonGetLesson200ResponseLesson) GetDependency() int32`

GetDependency returns the Dependency field if non-nil, zero value otherwise.

### GetDependencyOk

`func (o *ModLessonGetLesson200ResponseLesson) GetDependencyOk() (*int32, bool)`

GetDependencyOk returns a tuple with the Dependency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDependency

`func (o *ModLessonGetLesson200ResponseLesson) SetDependency(v int32)`

SetDependency sets Dependency field to given value.

### HasDependency

`func (o *ModLessonGetLesson200ResponseLesson) HasDependency() bool`

HasDependency returns a boolean if a field has been set.

### GetDisplayleft

`func (o *ModLessonGetLesson200ResponseLesson) GetDisplayleft() bool`

GetDisplayleft returns the Displayleft field if non-nil, zero value otherwise.

### GetDisplayleftOk

`func (o *ModLessonGetLesson200ResponseLesson) GetDisplayleftOk() (*bool, bool)`

GetDisplayleftOk returns a tuple with the Displayleft field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayleft

`func (o *ModLessonGetLesson200ResponseLesson) SetDisplayleft(v bool)`

SetDisplayleft sets Displayleft field to given value.

### HasDisplayleft

`func (o *ModLessonGetLesson200ResponseLesson) HasDisplayleft() bool`

HasDisplayleft returns a boolean if a field has been set.

### GetDisplayleftif

`func (o *ModLessonGetLesson200ResponseLesson) GetDisplayleftif() int32`

GetDisplayleftif returns the Displayleftif field if non-nil, zero value otherwise.

### GetDisplayleftifOk

`func (o *ModLessonGetLesson200ResponseLesson) GetDisplayleftifOk() (*int32, bool)`

GetDisplayleftifOk returns a tuple with the Displayleftif field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayleftif

`func (o *ModLessonGetLesson200ResponseLesson) SetDisplayleftif(v int32)`

SetDisplayleftif sets Displayleftif field to given value.

### HasDisplayleftif

`func (o *ModLessonGetLesson200ResponseLesson) HasDisplayleftif() bool`

HasDisplayleftif returns a boolean if a field has been set.

### GetFeedback

`func (o *ModLessonGetLesson200ResponseLesson) GetFeedback() bool`

GetFeedback returns the Feedback field if non-nil, zero value otherwise.

### GetFeedbackOk

`func (o *ModLessonGetLesson200ResponseLesson) GetFeedbackOk() (*bool, bool)`

GetFeedbackOk returns a tuple with the Feedback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedback

`func (o *ModLessonGetLesson200ResponseLesson) SetFeedback(v bool)`

SetFeedback sets Feedback field to given value.

### HasFeedback

`func (o *ModLessonGetLesson200ResponseLesson) HasFeedback() bool`

HasFeedback returns a boolean if a field has been set.

### GetGrade

`func (o *ModLessonGetLesson200ResponseLesson) GetGrade() int32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModLessonGetLesson200ResponseLesson) GetGradeOk() (*int32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModLessonGetLesson200ResponseLesson) SetGrade(v int32)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *ModLessonGetLesson200ResponseLesson) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetHeight

`func (o *ModLessonGetLesson200ResponseLesson) GetHeight() int32`

GetHeight returns the Height field if non-nil, zero value otherwise.

### GetHeightOk

`func (o *ModLessonGetLesson200ResponseLesson) GetHeightOk() (*int32, bool)`

GetHeightOk returns a tuple with the Height field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeight

`func (o *ModLessonGetLesson200ResponseLesson) SetHeight(v int32)`

SetHeight sets Height field to given value.

### HasHeight

`func (o *ModLessonGetLesson200ResponseLesson) HasHeight() bool`

HasHeight returns a boolean if a field has been set.

### GetId

`func (o *ModLessonGetLesson200ResponseLesson) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModLessonGetLesson200ResponseLesson) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModLessonGetLesson200ResponseLesson) SetId(v int32)`

SetId sets Id field to given value.


### GetIntro

`func (o *ModLessonGetLesson200ResponseLesson) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModLessonGetLesson200ResponseLesson) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModLessonGetLesson200ResponseLesson) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModLessonGetLesson200ResponseLesson) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModLessonGetLesson200ResponseLesson) GetIntrofiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModLessonGetLesson200ResponseLesson) GetIntrofilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModLessonGetLesson200ResponseLesson) SetIntrofiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModLessonGetLesson200ResponseLesson) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModLessonGetLesson200ResponseLesson) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModLessonGetLesson200ResponseLesson) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModLessonGetLesson200ResponseLesson) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModLessonGetLesson200ResponseLesson) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModLessonGetLesson200ResponseLesson) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModLessonGetLesson200ResponseLesson) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModLessonGetLesson200ResponseLesson) SetLang(v string)`

SetLang sets Lang field to given value.


### GetMaxanswers

`func (o *ModLessonGetLesson200ResponseLesson) GetMaxanswers() int32`

GetMaxanswers returns the Maxanswers field if non-nil, zero value otherwise.

### GetMaxanswersOk

`func (o *ModLessonGetLesson200ResponseLesson) GetMaxanswersOk() (*int32, bool)`

GetMaxanswersOk returns a tuple with the Maxanswers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxanswers

`func (o *ModLessonGetLesson200ResponseLesson) SetMaxanswers(v int32)`

SetMaxanswers sets Maxanswers field to given value.

### HasMaxanswers

`func (o *ModLessonGetLesson200ResponseLesson) HasMaxanswers() bool`

HasMaxanswers returns a boolean if a field has been set.

### GetMaxattempts

`func (o *ModLessonGetLesson200ResponseLesson) GetMaxattempts() int32`

GetMaxattempts returns the Maxattempts field if non-nil, zero value otherwise.

### GetMaxattemptsOk

`func (o *ModLessonGetLesson200ResponseLesson) GetMaxattemptsOk() (*int32, bool)`

GetMaxattemptsOk returns a tuple with the Maxattempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxattempts

`func (o *ModLessonGetLesson200ResponseLesson) SetMaxattempts(v int32)`

SetMaxattempts sets Maxattempts field to given value.

### HasMaxattempts

`func (o *ModLessonGetLesson200ResponseLesson) HasMaxattempts() bool`

HasMaxattempts returns a boolean if a field has been set.

### GetMaxpages

`func (o *ModLessonGetLesson200ResponseLesson) GetMaxpages() int32`

GetMaxpages returns the Maxpages field if non-nil, zero value otherwise.

### GetMaxpagesOk

`func (o *ModLessonGetLesson200ResponseLesson) GetMaxpagesOk() (*int32, bool)`

GetMaxpagesOk returns a tuple with the Maxpages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxpages

`func (o *ModLessonGetLesson200ResponseLesson) SetMaxpages(v int32)`

SetMaxpages sets Maxpages field to given value.

### HasMaxpages

`func (o *ModLessonGetLesson200ResponseLesson) HasMaxpages() bool`

HasMaxpages returns a boolean if a field has been set.

### GetMediaclose

`func (o *ModLessonGetLesson200ResponseLesson) GetMediaclose() int32`

GetMediaclose returns the Mediaclose field if non-nil, zero value otherwise.

### GetMediacloseOk

`func (o *ModLessonGetLesson200ResponseLesson) GetMediacloseOk() (*int32, bool)`

GetMediacloseOk returns a tuple with the Mediaclose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaclose

`func (o *ModLessonGetLesson200ResponseLesson) SetMediaclose(v int32)`

SetMediaclose sets Mediaclose field to given value.

### HasMediaclose

`func (o *ModLessonGetLesson200ResponseLesson) HasMediaclose() bool`

HasMediaclose returns a boolean if a field has been set.

### GetMediafile

`func (o *ModLessonGetLesson200ResponseLesson) GetMediafile() string`

GetMediafile returns the Mediafile field if non-nil, zero value otherwise.

### GetMediafileOk

`func (o *ModLessonGetLesson200ResponseLesson) GetMediafileOk() (*string, bool)`

GetMediafileOk returns a tuple with the Mediafile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediafile

`func (o *ModLessonGetLesson200ResponseLesson) SetMediafile(v string)`

SetMediafile sets Mediafile field to given value.

### HasMediafile

`func (o *ModLessonGetLesson200ResponseLesson) HasMediafile() bool`

HasMediafile returns a boolean if a field has been set.

### GetMediafiles

`func (o *ModLessonGetLesson200ResponseLesson) GetMediafiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetMediafiles returns the Mediafiles field if non-nil, zero value otherwise.

### GetMediafilesOk

`func (o *ModLessonGetLesson200ResponseLesson) GetMediafilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetMediafilesOk returns a tuple with the Mediafiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediafiles

`func (o *ModLessonGetLesson200ResponseLesson) SetMediafiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetMediafiles sets Mediafiles field to given value.

### HasMediafiles

`func (o *ModLessonGetLesson200ResponseLesson) HasMediafiles() bool`

HasMediafiles returns a boolean if a field has been set.

### GetMediaheight

`func (o *ModLessonGetLesson200ResponseLesson) GetMediaheight() int32`

GetMediaheight returns the Mediaheight field if non-nil, zero value otherwise.

### GetMediaheightOk

`func (o *ModLessonGetLesson200ResponseLesson) GetMediaheightOk() (*int32, bool)`

GetMediaheightOk returns a tuple with the Mediaheight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaheight

`func (o *ModLessonGetLesson200ResponseLesson) SetMediaheight(v int32)`

SetMediaheight sets Mediaheight field to given value.

### HasMediaheight

`func (o *ModLessonGetLesson200ResponseLesson) HasMediaheight() bool`

HasMediaheight returns a boolean if a field has been set.

### GetMediawidth

`func (o *ModLessonGetLesson200ResponseLesson) GetMediawidth() int32`

GetMediawidth returns the Mediawidth field if non-nil, zero value otherwise.

### GetMediawidthOk

`func (o *ModLessonGetLesson200ResponseLesson) GetMediawidthOk() (*int32, bool)`

GetMediawidthOk returns a tuple with the Mediawidth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediawidth

`func (o *ModLessonGetLesson200ResponseLesson) SetMediawidth(v int32)`

SetMediawidth sets Mediawidth field to given value.

### HasMediawidth

`func (o *ModLessonGetLesson200ResponseLesson) HasMediawidth() bool`

HasMediawidth returns a boolean if a field has been set.

### GetMinquestions

`func (o *ModLessonGetLesson200ResponseLesson) GetMinquestions() int32`

GetMinquestions returns the Minquestions field if non-nil, zero value otherwise.

### GetMinquestionsOk

`func (o *ModLessonGetLesson200ResponseLesson) GetMinquestionsOk() (*int32, bool)`

GetMinquestionsOk returns a tuple with the Minquestions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinquestions

`func (o *ModLessonGetLesson200ResponseLesson) SetMinquestions(v int32)`

SetMinquestions sets Minquestions field to given value.

### HasMinquestions

`func (o *ModLessonGetLesson200ResponseLesson) HasMinquestions() bool`

HasMinquestions returns a boolean if a field has been set.

### GetModattempts

`func (o *ModLessonGetLesson200ResponseLesson) GetModattempts() bool`

GetModattempts returns the Modattempts field if non-nil, zero value otherwise.

### GetModattemptsOk

`func (o *ModLessonGetLesson200ResponseLesson) GetModattemptsOk() (*bool, bool)`

GetModattemptsOk returns a tuple with the Modattempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModattempts

`func (o *ModLessonGetLesson200ResponseLesson) SetModattempts(v bool)`

SetModattempts sets Modattempts field to given value.

### HasModattempts

`func (o *ModLessonGetLesson200ResponseLesson) HasModattempts() bool`

HasModattempts returns a boolean if a field has been set.

### GetName

`func (o *ModLessonGetLesson200ResponseLesson) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModLessonGetLesson200ResponseLesson) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModLessonGetLesson200ResponseLesson) SetName(v string)`

SetName sets Name field to given value.


### GetNextpagedefault

`func (o *ModLessonGetLesson200ResponseLesson) GetNextpagedefault() int32`

GetNextpagedefault returns the Nextpagedefault field if non-nil, zero value otherwise.

### GetNextpagedefaultOk

`func (o *ModLessonGetLesson200ResponseLesson) GetNextpagedefaultOk() (*int32, bool)`

GetNextpagedefaultOk returns a tuple with the Nextpagedefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextpagedefault

`func (o *ModLessonGetLesson200ResponseLesson) SetNextpagedefault(v int32)`

SetNextpagedefault sets Nextpagedefault field to given value.

### HasNextpagedefault

`func (o *ModLessonGetLesson200ResponseLesson) HasNextpagedefault() bool`

HasNextpagedefault returns a boolean if a field has been set.

### GetOngoing

`func (o *ModLessonGetLesson200ResponseLesson) GetOngoing() bool`

GetOngoing returns the Ongoing field if non-nil, zero value otherwise.

### GetOngoingOk

`func (o *ModLessonGetLesson200ResponseLesson) GetOngoingOk() (*bool, bool)`

GetOngoingOk returns a tuple with the Ongoing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOngoing

`func (o *ModLessonGetLesson200ResponseLesson) SetOngoing(v bool)`

SetOngoing sets Ongoing field to given value.

### HasOngoing

`func (o *ModLessonGetLesson200ResponseLesson) HasOngoing() bool`

HasOngoing returns a boolean if a field has been set.

### GetPassword

`func (o *ModLessonGetLesson200ResponseLesson) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *ModLessonGetLesson200ResponseLesson) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *ModLessonGetLesson200ResponseLesson) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *ModLessonGetLesson200ResponseLesson) HasPassword() bool`

HasPassword returns a boolean if a field has been set.

### GetPractice

`func (o *ModLessonGetLesson200ResponseLesson) GetPractice() bool`

GetPractice returns the Practice field if non-nil, zero value otherwise.

### GetPracticeOk

`func (o *ModLessonGetLesson200ResponseLesson) GetPracticeOk() (*bool, bool)`

GetPracticeOk returns a tuple with the Practice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPractice

`func (o *ModLessonGetLesson200ResponseLesson) SetPractice(v bool)`

SetPractice sets Practice field to given value.

### HasPractice

`func (o *ModLessonGetLesson200ResponseLesson) HasPractice() bool`

HasPractice returns a boolean if a field has been set.

### GetProgressbar

`func (o *ModLessonGetLesson200ResponseLesson) GetProgressbar() bool`

GetProgressbar returns the Progressbar field if non-nil, zero value otherwise.

### GetProgressbarOk

`func (o *ModLessonGetLesson200ResponseLesson) GetProgressbarOk() (*bool, bool)`

GetProgressbarOk returns a tuple with the Progressbar field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProgressbar

`func (o *ModLessonGetLesson200ResponseLesson) SetProgressbar(v bool)`

SetProgressbar sets Progressbar field to given value.

### HasProgressbar

`func (o *ModLessonGetLesson200ResponseLesson) HasProgressbar() bool`

HasProgressbar returns a boolean if a field has been set.

### GetRetake

`func (o *ModLessonGetLesson200ResponseLesson) GetRetake() bool`

GetRetake returns the Retake field if non-nil, zero value otherwise.

### GetRetakeOk

`func (o *ModLessonGetLesson200ResponseLesson) GetRetakeOk() (*bool, bool)`

GetRetakeOk returns a tuple with the Retake field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRetake

`func (o *ModLessonGetLesson200ResponseLesson) SetRetake(v bool)`

SetRetake sets Retake field to given value.

### HasRetake

`func (o *ModLessonGetLesson200ResponseLesson) HasRetake() bool`

HasRetake returns a boolean if a field has been set.

### GetReview

`func (o *ModLessonGetLesson200ResponseLesson) GetReview() bool`

GetReview returns the Review field if non-nil, zero value otherwise.

### GetReviewOk

`func (o *ModLessonGetLesson200ResponseLesson) GetReviewOk() (*bool, bool)`

GetReviewOk returns a tuple with the Review field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReview

`func (o *ModLessonGetLesson200ResponseLesson) SetReview(v bool)`

SetReview sets Review field to given value.

### HasReview

`func (o *ModLessonGetLesson200ResponseLesson) HasReview() bool`

HasReview returns a boolean if a field has been set.

### GetSlideshow

`func (o *ModLessonGetLesson200ResponseLesson) GetSlideshow() bool`

GetSlideshow returns the Slideshow field if non-nil, zero value otherwise.

### GetSlideshowOk

`func (o *ModLessonGetLesson200ResponseLesson) GetSlideshowOk() (*bool, bool)`

GetSlideshowOk returns a tuple with the Slideshow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlideshow

`func (o *ModLessonGetLesson200ResponseLesson) SetSlideshow(v bool)`

SetSlideshow sets Slideshow field to given value.

### HasSlideshow

`func (o *ModLessonGetLesson200ResponseLesson) HasSlideshow() bool`

HasSlideshow returns a boolean if a field has been set.

### GetTimelimit

`func (o *ModLessonGetLesson200ResponseLesson) GetTimelimit() int32`

GetTimelimit returns the Timelimit field if non-nil, zero value otherwise.

### GetTimelimitOk

`func (o *ModLessonGetLesson200ResponseLesson) GetTimelimitOk() (*int32, bool)`

GetTimelimitOk returns a tuple with the Timelimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimelimit

`func (o *ModLessonGetLesson200ResponseLesson) SetTimelimit(v int32)`

SetTimelimit sets Timelimit field to given value.

### HasTimelimit

`func (o *ModLessonGetLesson200ResponseLesson) HasTimelimit() bool`

HasTimelimit returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModLessonGetLesson200ResponseLesson) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModLessonGetLesson200ResponseLesson) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModLessonGetLesson200ResponseLesson) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModLessonGetLesson200ResponseLesson) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUsemaxgrade

`func (o *ModLessonGetLesson200ResponseLesson) GetUsemaxgrade() int32`

GetUsemaxgrade returns the Usemaxgrade field if non-nil, zero value otherwise.

### GetUsemaxgradeOk

`func (o *ModLessonGetLesson200ResponseLesson) GetUsemaxgradeOk() (*int32, bool)`

GetUsemaxgradeOk returns a tuple with the Usemaxgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsemaxgrade

`func (o *ModLessonGetLesson200ResponseLesson) SetUsemaxgrade(v int32)`

SetUsemaxgrade sets Usemaxgrade field to given value.

### HasUsemaxgrade

`func (o *ModLessonGetLesson200ResponseLesson) HasUsemaxgrade() bool`

HasUsemaxgrade returns a boolean if a field has been set.

### GetUsepassword

`func (o *ModLessonGetLesson200ResponseLesson) GetUsepassword() bool`

GetUsepassword returns the Usepassword field if non-nil, zero value otherwise.

### GetUsepasswordOk

`func (o *ModLessonGetLesson200ResponseLesson) GetUsepasswordOk() (*bool, bool)`

GetUsepasswordOk returns a tuple with the Usepassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsepassword

`func (o *ModLessonGetLesson200ResponseLesson) SetUsepassword(v bool)`

SetUsepassword sets Usepassword field to given value.

### HasUsepassword

`func (o *ModLessonGetLesson200ResponseLesson) HasUsepassword() bool`

HasUsepassword returns a boolean if a field has been set.

### GetWidth

`func (o *ModLessonGetLesson200ResponseLesson) GetWidth() int32`

GetWidth returns the Width field if non-nil, zero value otherwise.

### GetWidthOk

`func (o *ModLessonGetLesson200ResponseLesson) GetWidthOk() (*int32, bool)`

GetWidthOk returns a tuple with the Width field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWidth

`func (o *ModLessonGetLesson200ResponseLesson) SetWidth(v int32)`

SetWidth sets Width field to given value.

### HasWidth

`func (o *ModLessonGetLesson200ResponseLesson) HasWidth() bool`

HasWidth returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


