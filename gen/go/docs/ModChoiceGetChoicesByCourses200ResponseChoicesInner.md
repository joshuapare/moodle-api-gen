# ModChoiceGetChoicesByCourses200ResponseChoicesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Allowmultiple** | Pointer to **bool** | Allow multiple choices | [optional] [default to null]
**Allowupdate** | Pointer to **bool** | Allow update | [optional] [default to null]
**Completionsubmit** | Pointer to **bool** | Completion on user submission | [optional] [default to null]
**Course** | Pointer to **int32** | Course id | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id | [optional] 
**Display** | Pointer to **int32** | Display mode (vertical, horizontal) | [optional] [default to null]
**Groupingid** | Pointer to **int32** | Group id | [optional] 
**Groupmode** | Pointer to **int32** | Group mode | [optional] 
**Id** | Pointer to **int32** | Activity instance id | [optional] 
**Includeinactive** | Pointer to **bool** | Include inactive users | [optional] [default to null]
**Intro** | Pointer to **string** | Activity introduction | [optional] 
**Introfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Limitanswers** | Pointer to **bool** | Limit unswers | [optional] [default to null]
**Name** | Pointer to **string** | Activity name | [optional] 
**Publish** | Pointer to **bool** | If choice is published | [optional] [default to null]
**Section** | Pointer to **int32** | Course section id | [optional] 
**Showavailable** | Pointer to **bool** | Show available spaces | [optional] [default to null]
**Showpreview** | Pointer to **bool** | Show preview before timeopen | [optional] [default to null]
**Showresults** | Pointer to **int32** | 0 never, 1 after answer, 2 after close, 3 always | [optional] [default to null]
**Showunanswered** | Pointer to **bool** | Show users who not answered yet | [optional] [default to null]
**Timeclose** | Pointer to **int32** | Date of closing validity | [optional] [default to null]
**Timemodified** | Pointer to **int32** | Time of last modification | [optional] 
**Timeopen** | Pointer to **int32** | Date of opening validity | [optional] [default to null]
**Visible** | Pointer to **bool** | Visible | [optional] 

## Methods

### NewModChoiceGetChoicesByCourses200ResponseChoicesInner

`func NewModChoiceGetChoicesByCourses200ResponseChoicesInner() *ModChoiceGetChoicesByCourses200ResponseChoicesInner`

NewModChoiceGetChoicesByCourses200ResponseChoicesInner instantiates a new ModChoiceGetChoicesByCourses200ResponseChoicesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChoiceGetChoicesByCourses200ResponseChoicesInnerWithDefaults

`func NewModChoiceGetChoicesByCourses200ResponseChoicesInnerWithDefaults() *ModChoiceGetChoicesByCourses200ResponseChoicesInner`

NewModChoiceGetChoicesByCourses200ResponseChoicesInnerWithDefaults instantiates a new ModChoiceGetChoicesByCourses200ResponseChoicesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAllowmultiple

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetAllowmultiple() bool`

GetAllowmultiple returns the Allowmultiple field if non-nil, zero value otherwise.

### GetAllowmultipleOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetAllowmultipleOk() (*bool, bool)`

GetAllowmultipleOk returns a tuple with the Allowmultiple field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowmultiple

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetAllowmultiple(v bool)`

SetAllowmultiple sets Allowmultiple field to given value.

### HasAllowmultiple

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasAllowmultiple() bool`

HasAllowmultiple returns a boolean if a field has been set.

### GetAllowupdate

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetAllowupdate() bool`

GetAllowupdate returns the Allowupdate field if non-nil, zero value otherwise.

### GetAllowupdateOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetAllowupdateOk() (*bool, bool)`

GetAllowupdateOk returns a tuple with the Allowupdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowupdate

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetAllowupdate(v bool)`

SetAllowupdate sets Allowupdate field to given value.

### HasAllowupdate

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasAllowupdate() bool`

HasAllowupdate returns a boolean if a field has been set.

### GetCompletionsubmit

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetCompletionsubmit() bool`

GetCompletionsubmit returns the Completionsubmit field if non-nil, zero value otherwise.

### GetCompletionsubmitOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetCompletionsubmitOk() (*bool, bool)`

GetCompletionsubmitOk returns a tuple with the Completionsubmit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionsubmit

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetCompletionsubmit(v bool)`

SetCompletionsubmit sets Completionsubmit field to given value.

### HasCompletionsubmit

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasCompletionsubmit() bool`

HasCompletionsubmit returns a boolean if a field has been set.

### GetCourse

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetDisplay

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetDisplay() int32`

GetDisplay returns the Display field if non-nil, zero value otherwise.

### GetDisplayOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetDisplayOk() (*int32, bool)`

GetDisplayOk returns a tuple with the Display field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplay

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetDisplay(v int32)`

SetDisplay sets Display field to given value.

### HasDisplay

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasDisplay() bool`

HasDisplay returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetId

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIncludeinactive

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIncludeinactive() bool`

GetIncludeinactive returns the Includeinactive field if non-nil, zero value otherwise.

### GetIncludeinactiveOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIncludeinactiveOk() (*bool, bool)`

GetIncludeinactiveOk returns a tuple with the Includeinactive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludeinactive

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetIncludeinactive(v bool)`

SetIncludeinactive sets Includeinactive field to given value.

### HasIncludeinactive

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasIncludeinactive() bool`

HasIncludeinactive returns a boolean if a field has been set.

### GetIntro

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetLimitanswers

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetLimitanswers() bool`

GetLimitanswers returns the Limitanswers field if non-nil, zero value otherwise.

### GetLimitanswersOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetLimitanswersOk() (*bool, bool)`

GetLimitanswersOk returns a tuple with the Limitanswers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitanswers

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetLimitanswers(v bool)`

SetLimitanswers sets Limitanswers field to given value.

### HasLimitanswers

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasLimitanswers() bool`

HasLimitanswers returns a boolean if a field has been set.

### GetName

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPublish

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetPublish() bool`

GetPublish returns the Publish field if non-nil, zero value otherwise.

### GetPublishOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetPublishOk() (*bool, bool)`

GetPublishOk returns a tuple with the Publish field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublish

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetPublish(v bool)`

SetPublish sets Publish field to given value.

### HasPublish

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasPublish() bool`

HasPublish returns a boolean if a field has been set.

### GetSection

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetShowavailable

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetShowavailable() bool`

GetShowavailable returns the Showavailable field if non-nil, zero value otherwise.

### GetShowavailableOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetShowavailableOk() (*bool, bool)`

GetShowavailableOk returns a tuple with the Showavailable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowavailable

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetShowavailable(v bool)`

SetShowavailable sets Showavailable field to given value.

### HasShowavailable

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasShowavailable() bool`

HasShowavailable returns a boolean if a field has been set.

### GetShowpreview

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetShowpreview() bool`

GetShowpreview returns the Showpreview field if non-nil, zero value otherwise.

### GetShowpreviewOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetShowpreviewOk() (*bool, bool)`

GetShowpreviewOk returns a tuple with the Showpreview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowpreview

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetShowpreview(v bool)`

SetShowpreview sets Showpreview field to given value.

### HasShowpreview

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasShowpreview() bool`

HasShowpreview returns a boolean if a field has been set.

### GetShowresults

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetShowresults() int32`

GetShowresults returns the Showresults field if non-nil, zero value otherwise.

### GetShowresultsOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetShowresultsOk() (*int32, bool)`

GetShowresultsOk returns a tuple with the Showresults field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowresults

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetShowresults(v int32)`

SetShowresults sets Showresults field to given value.

### HasShowresults

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasShowresults() bool`

HasShowresults returns a boolean if a field has been set.

### GetShowunanswered

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetShowunanswered() bool`

GetShowunanswered returns the Showunanswered field if non-nil, zero value otherwise.

### GetShowunansweredOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetShowunansweredOk() (*bool, bool)`

GetShowunansweredOk returns a tuple with the Showunanswered field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowunanswered

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetShowunanswered(v bool)`

SetShowunanswered sets Showunanswered field to given value.

### HasShowunanswered

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasShowunanswered() bool`

HasShowunanswered returns a boolean if a field has been set.

### GetTimeclose

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetTimeclose() int32`

GetTimeclose returns the Timeclose field if non-nil, zero value otherwise.

### GetTimecloseOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetTimecloseOk() (*int32, bool)`

GetTimecloseOk returns a tuple with the Timeclose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeclose

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetTimeclose(v int32)`

SetTimeclose sets Timeclose field to given value.

### HasTimeclose

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasTimeclose() bool`

HasTimeclose returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimeopen

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetTimeopen() int32`

GetTimeopen returns the Timeopen field if non-nil, zero value otherwise.

### GetTimeopenOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetTimeopenOk() (*int32, bool)`

GetTimeopenOk returns a tuple with the Timeopen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeopen

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetTimeopen(v int32)`

SetTimeopen sets Timeopen field to given value.

### HasTimeopen

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasTimeopen() bool`

HasTimeopen returns a boolean if a field has been set.

### GetVisible

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


