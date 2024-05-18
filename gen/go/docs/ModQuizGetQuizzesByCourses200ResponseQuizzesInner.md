# ModQuizGetQuizzesByCourses200ResponseQuizzesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Allowofflineattempts** | Pointer to **int32** | Whether to allow the quiz to be attempted                                                                             offline in the mobile app | [optional] [default to null]
**Attemptonlast** | Pointer to **int32** | Whether subsequent attempts start from the answer                                                                     to the previous attempt (1) or start blank (0). | [optional] [default to null]
**Attempts** | Pointer to **int32** | The maximum number of attempts a student is allowed. | [optional] [default to null]
**Autosaveperiod** | Pointer to **int32** | Auto-save delay | [optional] [default to null]
**Browsersecurity** | Pointer to **string** | Restriciton on the browser the student must                                                                     use. E.g. &#39;securewindow&#39;. | [optional] [default to "null"]
**Canredoquestions** | Pointer to **int32** | Allows students to redo any completed question                                                                         within a quiz attempt. | [optional] [default to null]
**Completionattemptsexhausted** | Pointer to **int32** | Mark quiz complete when the student has                                                                                 exhausted the maximum number of attempts | [optional] [default to null]
**Completionpass** | Pointer to **int32** | Whether to require passing grade | [optional] [default to null]
**Course** | Pointer to **int32** | Course id | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id | [optional] 
**Decimalpoints** | Pointer to **int32** | Number of decimal points to use when displaying                                                                     grades. | [optional] [default to null]
**Delay1** | Pointer to **int32** | Delay that must be left between the first and second attempt,                                                             in seconds. | [optional] [default to null]
**Delay2** | Pointer to **int32** | Delay that must be left between the second and subsequent                                                             attempt, in seconds. | [optional] [default to null]
**Graceperiod** | Pointer to **int32** | The amount of time (in seconds) after the time limit                                                                 runs out during which attempts can still be submitted,                                                                 if overduehandling is set to allow it. | [optional] [default to null]
**Grade** | Pointer to **float32** | The total that the quiz overall grade is scaled to be                                                             out of. | [optional] [default to null]
**Grademethod** | Pointer to **int32** | One of the values QUIZ_GRADEHIGHEST, QUIZ_GRADEAVERAGE,                                                                     QUIZ_ATTEMPTFIRST or QUIZ_ATTEMPTLAST. | [optional] [default to null]
**Groupingid** | Pointer to **int32** | Group id | [optional] 
**Groupmode** | Pointer to **int32** | Group mode | [optional] 
**Hasfeedback** | Pointer to **int32** | Whether the quiz has any non-blank feedback text | [optional] [default to null]
**Hasquestions** | Pointer to **int32** | Whether the quiz has questions | [optional] [default to null]
**Id** | Pointer to **int32** | Activity instance id | [optional] 
**Intro** | Pointer to **string** | Activity introduction | [optional] 
**Introfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Name** | Pointer to **string** | Activity name | [optional] 
**Navmethod** | Pointer to **string** | Any constraints on how the user is allowed to navigate                                                                 around the quiz. Currently recognised values are                                                                 &#39;free&#39; and &#39;seq&#39;. | [optional] [default to "null"]
**Overduehandling** | Pointer to **string** | The method used to handle overdue attempts.                                                                     &#39;autosubmit&#39;, &#39;graceperiod&#39; or &#39;autoabandon&#39;. | [optional] [default to "null"]
**Password** | Pointer to **string** | A password that the student must enter before starting or                                                                 continuing a quiz attempt. | [optional] [default to "null"]
**Preferredbehaviour** | Pointer to **string** | The behaviour to ask questions to use. | [optional] [default to "null"]
**Questiondecimalpoints** | Pointer to **int32** | Number of decimal points to use when                                                                             displaying question grades.                                                                             (-1 means use decimalpoints.) | [optional] [default to null]
**Questionsperpage** | Pointer to **int32** | How often to insert a page break when editing                                                                         the quiz, or when shuffling the question order. | [optional] [default to null]
**Reviewattempt** | Pointer to **int32** | Whether users are allowed to review their quiz                                                                     attempts at various times. This is a bit field, decoded by the                                                                     \\mod_quiz\\question\\display_options class. It is formed by ORing                                                                     together the constants defined there. | [optional] [default to null]
**Reviewcorrectness** | Pointer to **int32** | Whether users are allowed to review their quiz                                                        attempts at various times.A bit field, like reviewattempt. | [optional] [default to null]
**Reviewgeneralfeedback** | Pointer to **int32** | Whether users are allowed to review their                                                                             quiz attempts at various times. A bit field, like                                                                             reviewattempt. | [optional] [default to null]
**Reviewmarks** | Pointer to **int32** | Whether users are allowed to review their quiz attempts                                                                 at various times. A bit field, like reviewattempt. | [optional] [default to null]
**Reviewmaxmarks** | Pointer to **int32** | Whether users are allowed to review their quiz                                                   attempts at various times. A bit field, like reviewattempt. | [optional] [default to null]
**Reviewoverallfeedback** | Pointer to **int32** | Whether users are allowed to review their quiz                                                                             attempts at various times. A bit field, like                                                                             reviewattempt. | [optional] [default to null]
**Reviewrightanswer** | Pointer to **int32** | Whether users are allowed to review their quiz                                                                         attempts at various times. A bit field, like                                                                         reviewattempt. | [optional] [default to null]
**Reviewspecificfeedback** | Pointer to **int32** | Whether users are allowed to review their                                                                             quiz attempts at various times. A bit field, like                                                                             reviewattempt. | [optional] 
**Section** | Pointer to **int32** | Course section id | [optional] 
**Showblocks** | Pointer to **int32** | Whether blocks should be shown on the attempt.php and                                                                 review.php pages. | [optional] [default to null]
**Showuserpicture** | Pointer to **int32** | Option to show the user&#39;s picture during the                                                                     attempt and on the review page. | [optional] [default to null]
**Shuffleanswers** | Pointer to **int32** | Whether the parts of the question should be shuffled,                                                                     in those question types that support it. | [optional] [default to null]
**Subnet** | Pointer to **string** | Used to restrict the IP addresses from which this quiz can                                                             be attempted. The format is as requried by the address_in_subnet                                                             function. | [optional] [default to "null"]
**Sumgrades** | Pointer to **float32** | The total of all the question instance maxmarks. | [optional] [default to null]
**Timeclose** | Pointer to **int32** | The time when this quiz closes. (0 &#x3D; no restriction.) | [optional] [default to null]
**Timecreated** | Pointer to **int32** | The time when the quiz was added to the course. | [optional] [default to null]
**Timelimit** | Pointer to **int32** | The time limit for quiz attempts, in seconds. | [optional] [default to null]
**Timemodified** | Pointer to **int32** | Last modified time. | [optional] 
**Timeopen** | Pointer to **int32** | The time when this quiz opens. (0 &#x3D; no restriction.) | [optional] [default to null]
**Visible** | Pointer to **bool** | Visible | [optional] 

## Methods

### NewModQuizGetQuizzesByCourses200ResponseQuizzesInner

`func NewModQuizGetQuizzesByCourses200ResponseQuizzesInner() *ModQuizGetQuizzesByCourses200ResponseQuizzesInner`

NewModQuizGetQuizzesByCourses200ResponseQuizzesInner instantiates a new ModQuizGetQuizzesByCourses200ResponseQuizzesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetQuizzesByCourses200ResponseQuizzesInnerWithDefaults

`func NewModQuizGetQuizzesByCourses200ResponseQuizzesInnerWithDefaults() *ModQuizGetQuizzesByCourses200ResponseQuizzesInner`

NewModQuizGetQuizzesByCourses200ResponseQuizzesInnerWithDefaults instantiates a new ModQuizGetQuizzesByCourses200ResponseQuizzesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAllowofflineattempts

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetAllowofflineattempts() int32`

GetAllowofflineattempts returns the Allowofflineattempts field if non-nil, zero value otherwise.

### GetAllowofflineattemptsOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetAllowofflineattemptsOk() (*int32, bool)`

GetAllowofflineattemptsOk returns a tuple with the Allowofflineattempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowofflineattempts

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetAllowofflineattempts(v int32)`

SetAllowofflineattempts sets Allowofflineattempts field to given value.

### HasAllowofflineattempts

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasAllowofflineattempts() bool`

HasAllowofflineattempts returns a boolean if a field has been set.

### GetAttemptonlast

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetAttemptonlast() int32`

GetAttemptonlast returns the Attemptonlast field if non-nil, zero value otherwise.

### GetAttemptonlastOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetAttemptonlastOk() (*int32, bool)`

GetAttemptonlastOk returns a tuple with the Attemptonlast field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptonlast

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetAttemptonlast(v int32)`

SetAttemptonlast sets Attemptonlast field to given value.

### HasAttemptonlast

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasAttemptonlast() bool`

HasAttemptonlast returns a boolean if a field has been set.

### GetAttempts

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetAttempts() int32`

GetAttempts returns the Attempts field if non-nil, zero value otherwise.

### GetAttemptsOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetAttemptsOk() (*int32, bool)`

GetAttemptsOk returns a tuple with the Attempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttempts

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetAttempts(v int32)`

SetAttempts sets Attempts field to given value.

### HasAttempts

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasAttempts() bool`

HasAttempts returns a boolean if a field has been set.

### GetAutosaveperiod

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetAutosaveperiod() int32`

GetAutosaveperiod returns the Autosaveperiod field if non-nil, zero value otherwise.

### GetAutosaveperiodOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetAutosaveperiodOk() (*int32, bool)`

GetAutosaveperiodOk returns a tuple with the Autosaveperiod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutosaveperiod

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetAutosaveperiod(v int32)`

SetAutosaveperiod sets Autosaveperiod field to given value.

### HasAutosaveperiod

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasAutosaveperiod() bool`

HasAutosaveperiod returns a boolean if a field has been set.

### GetBrowsersecurity

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetBrowsersecurity() string`

GetBrowsersecurity returns the Browsersecurity field if non-nil, zero value otherwise.

### GetBrowsersecurityOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetBrowsersecurityOk() (*string, bool)`

GetBrowsersecurityOk returns a tuple with the Browsersecurity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrowsersecurity

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetBrowsersecurity(v string)`

SetBrowsersecurity sets Browsersecurity field to given value.

### HasBrowsersecurity

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasBrowsersecurity() bool`

HasBrowsersecurity returns a boolean if a field has been set.

### GetCanredoquestions

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetCanredoquestions() int32`

GetCanredoquestions returns the Canredoquestions field if non-nil, zero value otherwise.

### GetCanredoquestionsOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetCanredoquestionsOk() (*int32, bool)`

GetCanredoquestionsOk returns a tuple with the Canredoquestions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanredoquestions

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetCanredoquestions(v int32)`

SetCanredoquestions sets Canredoquestions field to given value.

### HasCanredoquestions

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasCanredoquestions() bool`

HasCanredoquestions returns a boolean if a field has been set.

### GetCompletionattemptsexhausted

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetCompletionattemptsexhausted() int32`

GetCompletionattemptsexhausted returns the Completionattemptsexhausted field if non-nil, zero value otherwise.

### GetCompletionattemptsexhaustedOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetCompletionattemptsexhaustedOk() (*int32, bool)`

GetCompletionattemptsexhaustedOk returns a tuple with the Completionattemptsexhausted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionattemptsexhausted

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetCompletionattemptsexhausted(v int32)`

SetCompletionattemptsexhausted sets Completionattemptsexhausted field to given value.

### HasCompletionattemptsexhausted

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasCompletionattemptsexhausted() bool`

HasCompletionattemptsexhausted returns a boolean if a field has been set.

### GetCompletionpass

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetCompletionpass() int32`

GetCompletionpass returns the Completionpass field if non-nil, zero value otherwise.

### GetCompletionpassOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetCompletionpassOk() (*int32, bool)`

GetCompletionpassOk returns a tuple with the Completionpass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionpass

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetCompletionpass(v int32)`

SetCompletionpass sets Completionpass field to given value.

### HasCompletionpass

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasCompletionpass() bool`

HasCompletionpass returns a boolean if a field has been set.

### GetCourse

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetDecimalpoints

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetDecimalpoints() int32`

GetDecimalpoints returns the Decimalpoints field if non-nil, zero value otherwise.

### GetDecimalpointsOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetDecimalpointsOk() (*int32, bool)`

GetDecimalpointsOk returns a tuple with the Decimalpoints field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDecimalpoints

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetDecimalpoints(v int32)`

SetDecimalpoints sets Decimalpoints field to given value.

### HasDecimalpoints

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasDecimalpoints() bool`

HasDecimalpoints returns a boolean if a field has been set.

### GetDelay1

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetDelay1() int32`

GetDelay1 returns the Delay1 field if non-nil, zero value otherwise.

### GetDelay1Ok

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetDelay1Ok() (*int32, bool)`

GetDelay1Ok returns a tuple with the Delay1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDelay1

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetDelay1(v int32)`

SetDelay1 sets Delay1 field to given value.

### HasDelay1

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasDelay1() bool`

HasDelay1 returns a boolean if a field has been set.

### GetDelay2

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetDelay2() int32`

GetDelay2 returns the Delay2 field if non-nil, zero value otherwise.

### GetDelay2Ok

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetDelay2Ok() (*int32, bool)`

GetDelay2Ok returns a tuple with the Delay2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDelay2

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetDelay2(v int32)`

SetDelay2 sets Delay2 field to given value.

### HasDelay2

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasDelay2() bool`

HasDelay2 returns a boolean if a field has been set.

### GetGraceperiod

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetGraceperiod() int32`

GetGraceperiod returns the Graceperiod field if non-nil, zero value otherwise.

### GetGraceperiodOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetGraceperiodOk() (*int32, bool)`

GetGraceperiodOk returns a tuple with the Graceperiod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGraceperiod

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetGraceperiod(v int32)`

SetGraceperiod sets Graceperiod field to given value.

### HasGraceperiod

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasGraceperiod() bool`

HasGraceperiod returns a boolean if a field has been set.

### GetGrade

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetGrade() float32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetGradeOk() (*float32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetGrade(v float32)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetGrademethod

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetGrademethod() int32`

GetGrademethod returns the Grademethod field if non-nil, zero value otherwise.

### GetGrademethodOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetGrademethodOk() (*int32, bool)`

GetGrademethodOk returns a tuple with the Grademethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrademethod

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetGrademethod(v int32)`

SetGrademethod sets Grademethod field to given value.

### HasGrademethod

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasGrademethod() bool`

HasGrademethod returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetHasfeedback

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetHasfeedback() int32`

GetHasfeedback returns the Hasfeedback field if non-nil, zero value otherwise.

### GetHasfeedbackOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetHasfeedbackOk() (*int32, bool)`

GetHasfeedbackOk returns a tuple with the Hasfeedback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasfeedback

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetHasfeedback(v int32)`

SetHasfeedback sets Hasfeedback field to given value.

### HasHasfeedback

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasHasfeedback() bool`

HasHasfeedback returns a boolean if a field has been set.

### GetHasquestions

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetHasquestions() int32`

GetHasquestions returns the Hasquestions field if non-nil, zero value otherwise.

### GetHasquestionsOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetHasquestionsOk() (*int32, bool)`

GetHasquestionsOk returns a tuple with the Hasquestions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasquestions

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetHasquestions(v int32)`

SetHasquestions sets Hasquestions field to given value.

### HasHasquestions

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasHasquestions() bool`

HasHasquestions returns a boolean if a field has been set.

### GetId

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetName

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNavmethod

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetNavmethod() string`

GetNavmethod returns the Navmethod field if non-nil, zero value otherwise.

### GetNavmethodOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetNavmethodOk() (*string, bool)`

GetNavmethodOk returns a tuple with the Navmethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNavmethod

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetNavmethod(v string)`

SetNavmethod sets Navmethod field to given value.

### HasNavmethod

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasNavmethod() bool`

HasNavmethod returns a boolean if a field has been set.

### GetOverduehandling

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetOverduehandling() string`

GetOverduehandling returns the Overduehandling field if non-nil, zero value otherwise.

### GetOverduehandlingOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetOverduehandlingOk() (*string, bool)`

GetOverduehandlingOk returns a tuple with the Overduehandling field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverduehandling

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetOverduehandling(v string)`

SetOverduehandling sets Overduehandling field to given value.

### HasOverduehandling

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasOverduehandling() bool`

HasOverduehandling returns a boolean if a field has been set.

### GetPassword

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasPassword() bool`

HasPassword returns a boolean if a field has been set.

### GetPreferredbehaviour

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetPreferredbehaviour() string`

GetPreferredbehaviour returns the Preferredbehaviour field if non-nil, zero value otherwise.

### GetPreferredbehaviourOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetPreferredbehaviourOk() (*string, bool)`

GetPreferredbehaviourOk returns a tuple with the Preferredbehaviour field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferredbehaviour

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetPreferredbehaviour(v string)`

SetPreferredbehaviour sets Preferredbehaviour field to given value.

### HasPreferredbehaviour

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasPreferredbehaviour() bool`

HasPreferredbehaviour returns a boolean if a field has been set.

### GetQuestiondecimalpoints

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetQuestiondecimalpoints() int32`

GetQuestiondecimalpoints returns the Questiondecimalpoints field if non-nil, zero value otherwise.

### GetQuestiondecimalpointsOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetQuestiondecimalpointsOk() (*int32, bool)`

GetQuestiondecimalpointsOk returns a tuple with the Questiondecimalpoints field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestiondecimalpoints

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetQuestiondecimalpoints(v int32)`

SetQuestiondecimalpoints sets Questiondecimalpoints field to given value.

### HasQuestiondecimalpoints

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasQuestiondecimalpoints() bool`

HasQuestiondecimalpoints returns a boolean if a field has been set.

### GetQuestionsperpage

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetQuestionsperpage() int32`

GetQuestionsperpage returns the Questionsperpage field if non-nil, zero value otherwise.

### GetQuestionsperpageOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetQuestionsperpageOk() (*int32, bool)`

GetQuestionsperpageOk returns a tuple with the Questionsperpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestionsperpage

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetQuestionsperpage(v int32)`

SetQuestionsperpage sets Questionsperpage field to given value.

### HasQuestionsperpage

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasQuestionsperpage() bool`

HasQuestionsperpage returns a boolean if a field has been set.

### GetReviewattempt

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetReviewattempt() int32`

GetReviewattempt returns the Reviewattempt field if non-nil, zero value otherwise.

### GetReviewattemptOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetReviewattemptOk() (*int32, bool)`

GetReviewattemptOk returns a tuple with the Reviewattempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewattempt

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetReviewattempt(v int32)`

SetReviewattempt sets Reviewattempt field to given value.

### HasReviewattempt

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasReviewattempt() bool`

HasReviewattempt returns a boolean if a field has been set.

### GetReviewcorrectness

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetReviewcorrectness() int32`

GetReviewcorrectness returns the Reviewcorrectness field if non-nil, zero value otherwise.

### GetReviewcorrectnessOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetReviewcorrectnessOk() (*int32, bool)`

GetReviewcorrectnessOk returns a tuple with the Reviewcorrectness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewcorrectness

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetReviewcorrectness(v int32)`

SetReviewcorrectness sets Reviewcorrectness field to given value.

### HasReviewcorrectness

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasReviewcorrectness() bool`

HasReviewcorrectness returns a boolean if a field has been set.

### GetReviewgeneralfeedback

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetReviewgeneralfeedback() int32`

GetReviewgeneralfeedback returns the Reviewgeneralfeedback field if non-nil, zero value otherwise.

### GetReviewgeneralfeedbackOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetReviewgeneralfeedbackOk() (*int32, bool)`

GetReviewgeneralfeedbackOk returns a tuple with the Reviewgeneralfeedback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewgeneralfeedback

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetReviewgeneralfeedback(v int32)`

SetReviewgeneralfeedback sets Reviewgeneralfeedback field to given value.

### HasReviewgeneralfeedback

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasReviewgeneralfeedback() bool`

HasReviewgeneralfeedback returns a boolean if a field has been set.

### GetReviewmarks

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetReviewmarks() int32`

GetReviewmarks returns the Reviewmarks field if non-nil, zero value otherwise.

### GetReviewmarksOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetReviewmarksOk() (*int32, bool)`

GetReviewmarksOk returns a tuple with the Reviewmarks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewmarks

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetReviewmarks(v int32)`

SetReviewmarks sets Reviewmarks field to given value.

### HasReviewmarks

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasReviewmarks() bool`

HasReviewmarks returns a boolean if a field has been set.

### GetReviewmaxmarks

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetReviewmaxmarks() int32`

GetReviewmaxmarks returns the Reviewmaxmarks field if non-nil, zero value otherwise.

### GetReviewmaxmarksOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetReviewmaxmarksOk() (*int32, bool)`

GetReviewmaxmarksOk returns a tuple with the Reviewmaxmarks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewmaxmarks

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetReviewmaxmarks(v int32)`

SetReviewmaxmarks sets Reviewmaxmarks field to given value.

### HasReviewmaxmarks

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasReviewmaxmarks() bool`

HasReviewmaxmarks returns a boolean if a field has been set.

### GetReviewoverallfeedback

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetReviewoverallfeedback() int32`

GetReviewoverallfeedback returns the Reviewoverallfeedback field if non-nil, zero value otherwise.

### GetReviewoverallfeedbackOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetReviewoverallfeedbackOk() (*int32, bool)`

GetReviewoverallfeedbackOk returns a tuple with the Reviewoverallfeedback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewoverallfeedback

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetReviewoverallfeedback(v int32)`

SetReviewoverallfeedback sets Reviewoverallfeedback field to given value.

### HasReviewoverallfeedback

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasReviewoverallfeedback() bool`

HasReviewoverallfeedback returns a boolean if a field has been set.

### GetReviewrightanswer

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetReviewrightanswer() int32`

GetReviewrightanswer returns the Reviewrightanswer field if non-nil, zero value otherwise.

### GetReviewrightanswerOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetReviewrightanswerOk() (*int32, bool)`

GetReviewrightanswerOk returns a tuple with the Reviewrightanswer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewrightanswer

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetReviewrightanswer(v int32)`

SetReviewrightanswer sets Reviewrightanswer field to given value.

### HasReviewrightanswer

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasReviewrightanswer() bool`

HasReviewrightanswer returns a boolean if a field has been set.

### GetReviewspecificfeedback

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetReviewspecificfeedback() int32`

GetReviewspecificfeedback returns the Reviewspecificfeedback field if non-nil, zero value otherwise.

### GetReviewspecificfeedbackOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetReviewspecificfeedbackOk() (*int32, bool)`

GetReviewspecificfeedbackOk returns a tuple with the Reviewspecificfeedback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewspecificfeedback

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetReviewspecificfeedback(v int32)`

SetReviewspecificfeedback sets Reviewspecificfeedback field to given value.

### HasReviewspecificfeedback

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasReviewspecificfeedback() bool`

HasReviewspecificfeedback returns a boolean if a field has been set.

### GetSection

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetShowblocks

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetShowblocks() int32`

GetShowblocks returns the Showblocks field if non-nil, zero value otherwise.

### GetShowblocksOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetShowblocksOk() (*int32, bool)`

GetShowblocksOk returns a tuple with the Showblocks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowblocks

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetShowblocks(v int32)`

SetShowblocks sets Showblocks field to given value.

### HasShowblocks

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasShowblocks() bool`

HasShowblocks returns a boolean if a field has been set.

### GetShowuserpicture

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetShowuserpicture() int32`

GetShowuserpicture returns the Showuserpicture field if non-nil, zero value otherwise.

### GetShowuserpictureOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetShowuserpictureOk() (*int32, bool)`

GetShowuserpictureOk returns a tuple with the Showuserpicture field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowuserpicture

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetShowuserpicture(v int32)`

SetShowuserpicture sets Showuserpicture field to given value.

### HasShowuserpicture

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasShowuserpicture() bool`

HasShowuserpicture returns a boolean if a field has been set.

### GetShuffleanswers

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetShuffleanswers() int32`

GetShuffleanswers returns the Shuffleanswers field if non-nil, zero value otherwise.

### GetShuffleanswersOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetShuffleanswersOk() (*int32, bool)`

GetShuffleanswersOk returns a tuple with the Shuffleanswers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShuffleanswers

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetShuffleanswers(v int32)`

SetShuffleanswers sets Shuffleanswers field to given value.

### HasShuffleanswers

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasShuffleanswers() bool`

HasShuffleanswers returns a boolean if a field has been set.

### GetSubnet

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetSubnet() string`

GetSubnet returns the Subnet field if non-nil, zero value otherwise.

### GetSubnetOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetSubnetOk() (*string, bool)`

GetSubnetOk returns a tuple with the Subnet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubnet

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetSubnet(v string)`

SetSubnet sets Subnet field to given value.

### HasSubnet

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasSubnet() bool`

HasSubnet returns a boolean if a field has been set.

### GetSumgrades

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetSumgrades() float32`

GetSumgrades returns the Sumgrades field if non-nil, zero value otherwise.

### GetSumgradesOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetSumgradesOk() (*float32, bool)`

GetSumgradesOk returns a tuple with the Sumgrades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSumgrades

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetSumgrades(v float32)`

SetSumgrades sets Sumgrades field to given value.

### HasSumgrades

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasSumgrades() bool`

HasSumgrades returns a boolean if a field has been set.

### GetTimeclose

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetTimeclose() int32`

GetTimeclose returns the Timeclose field if non-nil, zero value otherwise.

### GetTimecloseOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetTimecloseOk() (*int32, bool)`

GetTimecloseOk returns a tuple with the Timeclose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeclose

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetTimeclose(v int32)`

SetTimeclose sets Timeclose field to given value.

### HasTimeclose

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasTimeclose() bool`

HasTimeclose returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimelimit

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetTimelimit() int32`

GetTimelimit returns the Timelimit field if non-nil, zero value otherwise.

### GetTimelimitOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetTimelimitOk() (*int32, bool)`

GetTimelimitOk returns a tuple with the Timelimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimelimit

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetTimelimit(v int32)`

SetTimelimit sets Timelimit field to given value.

### HasTimelimit

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasTimelimit() bool`

HasTimelimit returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimeopen

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetTimeopen() int32`

GetTimeopen returns the Timeopen field if non-nil, zero value otherwise.

### GetTimeopenOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetTimeopenOk() (*int32, bool)`

GetTimeopenOk returns a tuple with the Timeopen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeopen

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetTimeopen(v int32)`

SetTimeopen sets Timeopen field to given value.

### HasTimeopen

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasTimeopen() bool`

HasTimeopen returns a boolean if a field has been set.

### GetVisible

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModQuizGetQuizzesByCourses200ResponseQuizzesInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


