# ModChatGetChatsByCourses200ResponseChatsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Chatmethod** | Pointer to **string** | chat method (sockets, ajax, header_js) | [optional] [default to "null"]
**Chattime** | Pointer to **int32** | chat time | [optional] [default to null]
**Course** | Pointer to **int32** | Course id | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id | [optional] 
**Groupingid** | Pointer to **int32** | Group id | [optional] 
**Groupmode** | Pointer to **int32** | Group mode | [optional] 
**Id** | Pointer to **int32** | Activity instance id | [optional] 
**Intro** | Pointer to **string** | Activity introduction | [optional] 
**Introfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Keepdays** | Pointer to **int32** | keep days | [optional] [default to null]
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Name** | Pointer to **string** | Activity name | [optional] 
**Schedule** | Pointer to **int32** | schedule type | [optional] [default to null]
**Section** | Pointer to **int32** | Course section id | [optional] 
**Studentlogs** | Pointer to **int32** | student logs visible to everyone | [optional] [default to null]
**Timemodified** | Pointer to **int32** | time of last modification | [optional] [default to null]
**Visible** | Pointer to **bool** | Visible | [optional] 

## Methods

### NewModChatGetChatsByCourses200ResponseChatsInner

`func NewModChatGetChatsByCourses200ResponseChatsInner() *ModChatGetChatsByCourses200ResponseChatsInner`

NewModChatGetChatsByCourses200ResponseChatsInner instantiates a new ModChatGetChatsByCourses200ResponseChatsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatGetChatsByCourses200ResponseChatsInnerWithDefaults

`func NewModChatGetChatsByCourses200ResponseChatsInnerWithDefaults() *ModChatGetChatsByCourses200ResponseChatsInner`

NewModChatGetChatsByCourses200ResponseChatsInnerWithDefaults instantiates a new ModChatGetChatsByCourses200ResponseChatsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChatmethod

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetChatmethod() string`

GetChatmethod returns the Chatmethod field if non-nil, zero value otherwise.

### GetChatmethodOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetChatmethodOk() (*string, bool)`

GetChatmethodOk returns a tuple with the Chatmethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChatmethod

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetChatmethod(v string)`

SetChatmethod sets Chatmethod field to given value.

### HasChatmethod

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasChatmethod() bool`

HasChatmethod returns a boolean if a field has been set.

### GetChattime

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetChattime() int32`

GetChattime returns the Chattime field if non-nil, zero value otherwise.

### GetChattimeOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetChattimeOk() (*int32, bool)`

GetChattimeOk returns a tuple with the Chattime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChattime

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetChattime(v int32)`

SetChattime sets Chattime field to given value.

### HasChattime

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasChattime() bool`

HasChattime returns a boolean if a field has been set.

### GetCourse

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetId

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetKeepdays

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetKeepdays() int32`

GetKeepdays returns the Keepdays field if non-nil, zero value otherwise.

### GetKeepdaysOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetKeepdaysOk() (*int32, bool)`

GetKeepdaysOk returns a tuple with the Keepdays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeepdays

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetKeepdays(v int32)`

SetKeepdays sets Keepdays field to given value.

### HasKeepdays

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasKeepdays() bool`

HasKeepdays returns a boolean if a field has been set.

### GetLang

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetName

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetSchedule

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetSchedule() int32`

GetSchedule returns the Schedule field if non-nil, zero value otherwise.

### GetScheduleOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetScheduleOk() (*int32, bool)`

GetScheduleOk returns a tuple with the Schedule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSchedule

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetSchedule(v int32)`

SetSchedule sets Schedule field to given value.

### HasSchedule

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasSchedule() bool`

HasSchedule returns a boolean if a field has been set.

### GetSection

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetStudentlogs

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetStudentlogs() int32`

GetStudentlogs returns the Studentlogs field if non-nil, zero value otherwise.

### GetStudentlogsOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetStudentlogsOk() (*int32, bool)`

GetStudentlogsOk returns a tuple with the Studentlogs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStudentlogs

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetStudentlogs(v int32)`

SetStudentlogs sets Studentlogs field to given value.

### HasStudentlogs

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasStudentlogs() bool`

HasStudentlogs returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetVisible

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModChatGetChatsByCourses200ResponseChatsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


