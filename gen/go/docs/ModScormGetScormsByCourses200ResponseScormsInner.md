# ModScormGetScormsByCourses200ResponseScormsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Auto** | Pointer to **bool** | Auto continue? | [optional] [default to null]
**Autocommit** | Pointer to **bool** | Save track data automatically? | [optional] [default to null]
**Completionscorerequired** | Pointer to **int32** | Minimum score required | [optional] [default to null]
**Completionstatusallscos** | Pointer to **int32** | Require all scos to return completion status | [optional] [default to null]
**Completionstatusrequired** | Pointer to **int32** | Status passed/completed required? | [optional] [default to null]
**Course** | Pointer to **int32** | Course id | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id | [optional] 
**Displayattemptstatus** | Pointer to **int32** | How to display attempt status | [optional] [default to null]
**Displaycoursestructure** | Pointer to **bool** | Display contents structure | [optional] [default to null]
**Forcecompleted** | Pointer to **bool** | Status current attempt is forced to \&quot;completed\&quot; | [optional] [default to null]
**Forcenewattempt** | Pointer to **int32** | Controls re-entry behaviour | [optional] [default to null]
**Grademethod** | Pointer to **int32** | Grade method | [optional] [default to null]
**Groupingid** | Pointer to **int32** | Group id | [optional] 
**Groupmode** | Pointer to **int32** | Group mode | [optional] 
**Height** | Pointer to **int32** | Frame height | [optional] [default to null]
**Hidebrowse** | Pointer to **bool** | Disable preview mode? | [optional] [default to null]
**Hidetoc** | Pointer to **int32** | How to display the SCORM structure in player | [optional] [default to null]
**Id** | Pointer to **int32** | Activity instance id | [optional] 
**Intro** | Pointer to **string** | Activity introduction | [optional] 
**Introfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Lastattemptlock** | Pointer to **bool** | Prevents to launch new attempts once finished | [optional] [default to null]
**Launch** | Pointer to **int32** | First content to launch | [optional] [default to null]
**Maxattempt** | Pointer to **int32** | Maximum number of attemtps | [optional] [default to null]
**Maxgrade** | Pointer to **int32** | Max grade | [optional] [default to null]
**Md5hash** | Pointer to **string** | MD5 Hash of package file | [optional] [default to "null"]
**Name** | Pointer to **string** | Activity name | [optional] 
**Nav** | Pointer to **int32** | Show navigation buttons | [optional] [default to null]
**Navpositionleft** | Pointer to **int32** | Navigation position left | [optional] [default to null]
**Navpositiontop** | Pointer to **int32** | Navigation position top | [optional] [default to null]
**Options** | Pointer to **string** | Additional options | [optional] 
**Packagesize** | Pointer to **int32** | SCORM zip package size | [optional] [default to null]
**Packageurl** | Pointer to **string** | SCORM zip package URL | [optional] [default to "null"]
**Popup** | Pointer to **int32** | Display in current or new window | [optional] [default to null]
**Protectpackagedownloads** | Pointer to **bool** | Protect package downloads? | [optional] [default to null]
**Reference** | Pointer to **string** | Reference to the package | [optional] [default to "null"]
**Revision** | Pointer to **int32** | Revison number | [optional] [default to null]
**Scormtype** | Pointer to **string** | SCORM type | [optional] [default to "null"]
**Section** | Pointer to **int32** | Course section id | [optional] 
**Sha1hash** | Pointer to **string** | Package content or ext path hash | [optional] [default to "null"]
**Skipview** | Pointer to **int32** | How to skip the content structure page | [optional] [default to null]
**Timeclose** | Pointer to **int32** | Available to | [optional] [default to null]
**Timemodified** | Pointer to **int32** | Time of last modification | [optional] 
**Timeopen** | Pointer to **int32** | Available from | [optional] [default to null]
**Updatefreq** | Pointer to **int32** | Auto-update frequency for remote packages | [optional] [default to null]
**Version** | Pointer to **string** | SCORM version (SCORM_12, SCORM_13, SCORM_AICC) | [optional] [default to "null"]
**Visible** | Pointer to **bool** | Visible | [optional] 
**Whatgrade** | Pointer to **int32** | What grade | [optional] [default to null]
**Width** | Pointer to **int32** | Frame width | [optional] [default to null]

## Methods

### NewModScormGetScormsByCourses200ResponseScormsInner

`func NewModScormGetScormsByCourses200ResponseScormsInner() *ModScormGetScormsByCourses200ResponseScormsInner`

NewModScormGetScormsByCourses200ResponseScormsInner instantiates a new ModScormGetScormsByCourses200ResponseScormsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModScormGetScormsByCourses200ResponseScormsInnerWithDefaults

`func NewModScormGetScormsByCourses200ResponseScormsInnerWithDefaults() *ModScormGetScormsByCourses200ResponseScormsInner`

NewModScormGetScormsByCourses200ResponseScormsInnerWithDefaults instantiates a new ModScormGetScormsByCourses200ResponseScormsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAuto

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetAuto() bool`

GetAuto returns the Auto field if non-nil, zero value otherwise.

### GetAutoOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetAutoOk() (*bool, bool)`

GetAutoOk returns a tuple with the Auto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuto

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetAuto(v bool)`

SetAuto sets Auto field to given value.

### HasAuto

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasAuto() bool`

HasAuto returns a boolean if a field has been set.

### GetAutocommit

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetAutocommit() bool`

GetAutocommit returns the Autocommit field if non-nil, zero value otherwise.

### GetAutocommitOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetAutocommitOk() (*bool, bool)`

GetAutocommitOk returns a tuple with the Autocommit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutocommit

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetAutocommit(v bool)`

SetAutocommit sets Autocommit field to given value.

### HasAutocommit

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasAutocommit() bool`

HasAutocommit returns a boolean if a field has been set.

### GetCompletionscorerequired

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetCompletionscorerequired() int32`

GetCompletionscorerequired returns the Completionscorerequired field if non-nil, zero value otherwise.

### GetCompletionscorerequiredOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetCompletionscorerequiredOk() (*int32, bool)`

GetCompletionscorerequiredOk returns a tuple with the Completionscorerequired field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionscorerequired

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetCompletionscorerequired(v int32)`

SetCompletionscorerequired sets Completionscorerequired field to given value.

### HasCompletionscorerequired

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasCompletionscorerequired() bool`

HasCompletionscorerequired returns a boolean if a field has been set.

### GetCompletionstatusallscos

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetCompletionstatusallscos() int32`

GetCompletionstatusallscos returns the Completionstatusallscos field if non-nil, zero value otherwise.

### GetCompletionstatusallscosOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetCompletionstatusallscosOk() (*int32, bool)`

GetCompletionstatusallscosOk returns a tuple with the Completionstatusallscos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionstatusallscos

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetCompletionstatusallscos(v int32)`

SetCompletionstatusallscos sets Completionstatusallscos field to given value.

### HasCompletionstatusallscos

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasCompletionstatusallscos() bool`

HasCompletionstatusallscos returns a boolean if a field has been set.

### GetCompletionstatusrequired

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetCompletionstatusrequired() int32`

GetCompletionstatusrequired returns the Completionstatusrequired field if non-nil, zero value otherwise.

### GetCompletionstatusrequiredOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetCompletionstatusrequiredOk() (*int32, bool)`

GetCompletionstatusrequiredOk returns a tuple with the Completionstatusrequired field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionstatusrequired

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetCompletionstatusrequired(v int32)`

SetCompletionstatusrequired sets Completionstatusrequired field to given value.

### HasCompletionstatusrequired

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasCompletionstatusrequired() bool`

HasCompletionstatusrequired returns a boolean if a field has been set.

### GetCourse

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetDisplayattemptstatus

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetDisplayattemptstatus() int32`

GetDisplayattemptstatus returns the Displayattemptstatus field if non-nil, zero value otherwise.

### GetDisplayattemptstatusOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetDisplayattemptstatusOk() (*int32, bool)`

GetDisplayattemptstatusOk returns a tuple with the Displayattemptstatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayattemptstatus

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetDisplayattemptstatus(v int32)`

SetDisplayattemptstatus sets Displayattemptstatus field to given value.

### HasDisplayattemptstatus

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasDisplayattemptstatus() bool`

HasDisplayattemptstatus returns a boolean if a field has been set.

### GetDisplaycoursestructure

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetDisplaycoursestructure() bool`

GetDisplaycoursestructure returns the Displaycoursestructure field if non-nil, zero value otherwise.

### GetDisplaycoursestructureOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetDisplaycoursestructureOk() (*bool, bool)`

GetDisplaycoursestructureOk returns a tuple with the Displaycoursestructure field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplaycoursestructure

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetDisplaycoursestructure(v bool)`

SetDisplaycoursestructure sets Displaycoursestructure field to given value.

### HasDisplaycoursestructure

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasDisplaycoursestructure() bool`

HasDisplaycoursestructure returns a boolean if a field has been set.

### GetForcecompleted

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetForcecompleted() bool`

GetForcecompleted returns the Forcecompleted field if non-nil, zero value otherwise.

### GetForcecompletedOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetForcecompletedOk() (*bool, bool)`

GetForcecompletedOk returns a tuple with the Forcecompleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForcecompleted

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetForcecompleted(v bool)`

SetForcecompleted sets Forcecompleted field to given value.

### HasForcecompleted

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasForcecompleted() bool`

HasForcecompleted returns a boolean if a field has been set.

### GetForcenewattempt

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetForcenewattempt() int32`

GetForcenewattempt returns the Forcenewattempt field if non-nil, zero value otherwise.

### GetForcenewattemptOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetForcenewattemptOk() (*int32, bool)`

GetForcenewattemptOk returns a tuple with the Forcenewattempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForcenewattempt

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetForcenewattempt(v int32)`

SetForcenewattempt sets Forcenewattempt field to given value.

### HasForcenewattempt

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasForcenewattempt() bool`

HasForcenewattempt returns a boolean if a field has been set.

### GetGrademethod

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetGrademethod() int32`

GetGrademethod returns the Grademethod field if non-nil, zero value otherwise.

### GetGrademethodOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetGrademethodOk() (*int32, bool)`

GetGrademethodOk returns a tuple with the Grademethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrademethod

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetGrademethod(v int32)`

SetGrademethod sets Grademethod field to given value.

### HasGrademethod

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasGrademethod() bool`

HasGrademethod returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetHeight

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetHeight() int32`

GetHeight returns the Height field if non-nil, zero value otherwise.

### GetHeightOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetHeightOk() (*int32, bool)`

GetHeightOk returns a tuple with the Height field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeight

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetHeight(v int32)`

SetHeight sets Height field to given value.

### HasHeight

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasHeight() bool`

HasHeight returns a boolean if a field has been set.

### GetHidebrowse

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetHidebrowse() bool`

GetHidebrowse returns the Hidebrowse field if non-nil, zero value otherwise.

### GetHidebrowseOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetHidebrowseOk() (*bool, bool)`

GetHidebrowseOk returns a tuple with the Hidebrowse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHidebrowse

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetHidebrowse(v bool)`

SetHidebrowse sets Hidebrowse field to given value.

### HasHidebrowse

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasHidebrowse() bool`

HasHidebrowse returns a boolean if a field has been set.

### GetHidetoc

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetHidetoc() int32`

GetHidetoc returns the Hidetoc field if non-nil, zero value otherwise.

### GetHidetocOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetHidetocOk() (*int32, bool)`

GetHidetocOk returns a tuple with the Hidetoc field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHidetoc

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetHidetoc(v int32)`

SetHidetoc sets Hidetoc field to given value.

### HasHidetoc

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasHidetoc() bool`

HasHidetoc returns a boolean if a field has been set.

### GetId

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetLastattemptlock

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetLastattemptlock() bool`

GetLastattemptlock returns the Lastattemptlock field if non-nil, zero value otherwise.

### GetLastattemptlockOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetLastattemptlockOk() (*bool, bool)`

GetLastattemptlockOk returns a tuple with the Lastattemptlock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastattemptlock

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetLastattemptlock(v bool)`

SetLastattemptlock sets Lastattemptlock field to given value.

### HasLastattemptlock

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasLastattemptlock() bool`

HasLastattemptlock returns a boolean if a field has been set.

### GetLaunch

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetLaunch() int32`

GetLaunch returns the Launch field if non-nil, zero value otherwise.

### GetLaunchOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetLaunchOk() (*int32, bool)`

GetLaunchOk returns a tuple with the Launch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLaunch

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetLaunch(v int32)`

SetLaunch sets Launch field to given value.

### HasLaunch

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasLaunch() bool`

HasLaunch returns a boolean if a field has been set.

### GetMaxattempt

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetMaxattempt() int32`

GetMaxattempt returns the Maxattempt field if non-nil, zero value otherwise.

### GetMaxattemptOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetMaxattemptOk() (*int32, bool)`

GetMaxattemptOk returns a tuple with the Maxattempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxattempt

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetMaxattempt(v int32)`

SetMaxattempt sets Maxattempt field to given value.

### HasMaxattempt

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasMaxattempt() bool`

HasMaxattempt returns a boolean if a field has been set.

### GetMaxgrade

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetMaxgrade() int32`

GetMaxgrade returns the Maxgrade field if non-nil, zero value otherwise.

### GetMaxgradeOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetMaxgradeOk() (*int32, bool)`

GetMaxgradeOk returns a tuple with the Maxgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxgrade

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetMaxgrade(v int32)`

SetMaxgrade sets Maxgrade field to given value.

### HasMaxgrade

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasMaxgrade() bool`

HasMaxgrade returns a boolean if a field has been set.

### GetMd5hash

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetMd5hash() string`

GetMd5hash returns the Md5hash field if non-nil, zero value otherwise.

### GetMd5hashOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetMd5hashOk() (*string, bool)`

GetMd5hashOk returns a tuple with the Md5hash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMd5hash

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetMd5hash(v string)`

SetMd5hash sets Md5hash field to given value.

### HasMd5hash

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasMd5hash() bool`

HasMd5hash returns a boolean if a field has been set.

### GetName

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNav

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetNav() int32`

GetNav returns the Nav field if non-nil, zero value otherwise.

### GetNavOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetNavOk() (*int32, bool)`

GetNavOk returns a tuple with the Nav field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNav

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetNav(v int32)`

SetNav sets Nav field to given value.

### HasNav

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasNav() bool`

HasNav returns a boolean if a field has been set.

### GetNavpositionleft

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetNavpositionleft() int32`

GetNavpositionleft returns the Navpositionleft field if non-nil, zero value otherwise.

### GetNavpositionleftOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetNavpositionleftOk() (*int32, bool)`

GetNavpositionleftOk returns a tuple with the Navpositionleft field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNavpositionleft

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetNavpositionleft(v int32)`

SetNavpositionleft sets Navpositionleft field to given value.

### HasNavpositionleft

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasNavpositionleft() bool`

HasNavpositionleft returns a boolean if a field has been set.

### GetNavpositiontop

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetNavpositiontop() int32`

GetNavpositiontop returns the Navpositiontop field if non-nil, zero value otherwise.

### GetNavpositiontopOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetNavpositiontopOk() (*int32, bool)`

GetNavpositiontopOk returns a tuple with the Navpositiontop field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNavpositiontop

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetNavpositiontop(v int32)`

SetNavpositiontop sets Navpositiontop field to given value.

### HasNavpositiontop

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasNavpositiontop() bool`

HasNavpositiontop returns a boolean if a field has been set.

### GetOptions

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetOptions() string`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetOptionsOk() (*string, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetOptions(v string)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetPackagesize

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetPackagesize() int32`

GetPackagesize returns the Packagesize field if non-nil, zero value otherwise.

### GetPackagesizeOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetPackagesizeOk() (*int32, bool)`

GetPackagesizeOk returns a tuple with the Packagesize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPackagesize

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetPackagesize(v int32)`

SetPackagesize sets Packagesize field to given value.

### HasPackagesize

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasPackagesize() bool`

HasPackagesize returns a boolean if a field has been set.

### GetPackageurl

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetPackageurl() string`

GetPackageurl returns the Packageurl field if non-nil, zero value otherwise.

### GetPackageurlOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetPackageurlOk() (*string, bool)`

GetPackageurlOk returns a tuple with the Packageurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPackageurl

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetPackageurl(v string)`

SetPackageurl sets Packageurl field to given value.

### HasPackageurl

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasPackageurl() bool`

HasPackageurl returns a boolean if a field has been set.

### GetPopup

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetPopup() int32`

GetPopup returns the Popup field if non-nil, zero value otherwise.

### GetPopupOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetPopupOk() (*int32, bool)`

GetPopupOk returns a tuple with the Popup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPopup

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetPopup(v int32)`

SetPopup sets Popup field to given value.

### HasPopup

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasPopup() bool`

HasPopup returns a boolean if a field has been set.

### GetProtectpackagedownloads

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetProtectpackagedownloads() bool`

GetProtectpackagedownloads returns the Protectpackagedownloads field if non-nil, zero value otherwise.

### GetProtectpackagedownloadsOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetProtectpackagedownloadsOk() (*bool, bool)`

GetProtectpackagedownloadsOk returns a tuple with the Protectpackagedownloads field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProtectpackagedownloads

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetProtectpackagedownloads(v bool)`

SetProtectpackagedownloads sets Protectpackagedownloads field to given value.

### HasProtectpackagedownloads

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasProtectpackagedownloads() bool`

HasProtectpackagedownloads returns a boolean if a field has been set.

### GetReference

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetReference() string`

GetReference returns the Reference field if non-nil, zero value otherwise.

### GetReferenceOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetReferenceOk() (*string, bool)`

GetReferenceOk returns a tuple with the Reference field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReference

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetReference(v string)`

SetReference sets Reference field to given value.

### HasReference

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasReference() bool`

HasReference returns a boolean if a field has been set.

### GetRevision

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetRevision() int32`

GetRevision returns the Revision field if non-nil, zero value otherwise.

### GetRevisionOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetRevisionOk() (*int32, bool)`

GetRevisionOk returns a tuple with the Revision field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevision

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetRevision(v int32)`

SetRevision sets Revision field to given value.

### HasRevision

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasRevision() bool`

HasRevision returns a boolean if a field has been set.

### GetScormtype

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetScormtype() string`

GetScormtype returns the Scormtype field if non-nil, zero value otherwise.

### GetScormtypeOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetScormtypeOk() (*string, bool)`

GetScormtypeOk returns a tuple with the Scormtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScormtype

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetScormtype(v string)`

SetScormtype sets Scormtype field to given value.

### HasScormtype

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasScormtype() bool`

HasScormtype returns a boolean if a field has been set.

### GetSection

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetSha1hash

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetSha1hash() string`

GetSha1hash returns the Sha1hash field if non-nil, zero value otherwise.

### GetSha1hashOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetSha1hashOk() (*string, bool)`

GetSha1hashOk returns a tuple with the Sha1hash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSha1hash

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetSha1hash(v string)`

SetSha1hash sets Sha1hash field to given value.

### HasSha1hash

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasSha1hash() bool`

HasSha1hash returns a boolean if a field has been set.

### GetSkipview

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetSkipview() int32`

GetSkipview returns the Skipview field if non-nil, zero value otherwise.

### GetSkipviewOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetSkipviewOk() (*int32, bool)`

GetSkipviewOk returns a tuple with the Skipview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSkipview

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetSkipview(v int32)`

SetSkipview sets Skipview field to given value.

### HasSkipview

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasSkipview() bool`

HasSkipview returns a boolean if a field has been set.

### GetTimeclose

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetTimeclose() int32`

GetTimeclose returns the Timeclose field if non-nil, zero value otherwise.

### GetTimecloseOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetTimecloseOk() (*int32, bool)`

GetTimecloseOk returns a tuple with the Timeclose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeclose

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetTimeclose(v int32)`

SetTimeclose sets Timeclose field to given value.

### HasTimeclose

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasTimeclose() bool`

HasTimeclose returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimeopen

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetTimeopen() int32`

GetTimeopen returns the Timeopen field if non-nil, zero value otherwise.

### GetTimeopenOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetTimeopenOk() (*int32, bool)`

GetTimeopenOk returns a tuple with the Timeopen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeopen

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetTimeopen(v int32)`

SetTimeopen sets Timeopen field to given value.

### HasTimeopen

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasTimeopen() bool`

HasTimeopen returns a boolean if a field has been set.

### GetUpdatefreq

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetUpdatefreq() int32`

GetUpdatefreq returns the Updatefreq field if non-nil, zero value otherwise.

### GetUpdatefreqOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetUpdatefreqOk() (*int32, bool)`

GetUpdatefreqOk returns a tuple with the Updatefreq field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatefreq

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetUpdatefreq(v int32)`

SetUpdatefreq sets Updatefreq field to given value.

### HasUpdatefreq

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasUpdatefreq() bool`

HasUpdatefreq returns a boolean if a field has been set.

### GetVersion

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetVersion(v string)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasVersion() bool`

HasVersion returns a boolean if a field has been set.

### GetVisible

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.

### GetWhatgrade

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetWhatgrade() int32`

GetWhatgrade returns the Whatgrade field if non-nil, zero value otherwise.

### GetWhatgradeOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetWhatgradeOk() (*int32, bool)`

GetWhatgradeOk returns a tuple with the Whatgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWhatgrade

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetWhatgrade(v int32)`

SetWhatgrade sets Whatgrade field to given value.

### HasWhatgrade

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasWhatgrade() bool`

HasWhatgrade returns a boolean if a field has been set.

### GetWidth

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetWidth() int32`

GetWidth returns the Width field if non-nil, zero value otherwise.

### GetWidthOk

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) GetWidthOk() (*int32, bool)`

GetWidthOk returns a tuple with the Width field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWidth

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) SetWidth(v int32)`

SetWidth sets Width field to given value.

### HasWidth

`func (o *ModScormGetScormsByCourses200ResponseScormsInner) HasWidth() bool`

HasWidth returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


