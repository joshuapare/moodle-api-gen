# ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Course** | Pointer to **int32** | Course id | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id | [optional] [default to null]
**Groupingid** | Pointer to **int32** | Group id | [optional] [default to null]
**Groupmode** | Pointer to **int32** | Group mode | [optional] 
**Id** | Pointer to **int32** | Activity instance id | [optional] [default to null]
**Intro** | Pointer to **string** | Activity introduction | [optional] [default to "null"]
**Introfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | Pointer to **string** | Forced activity language | [optional] [default to "null"]
**Meetingid** | Pointer to **string** | Meeting id | [optional] [default to "null"]
**Name** | Pointer to **string** | Activity name | [optional] 
**Section** | Pointer to **int32** | Course section id | [optional] [default to null]
**Timemodified** | Pointer to **int32** | Last time the instance was modified | [optional] [default to null]
**Visible** | Pointer to **bool** | Visible | [optional] [default to null]

## Methods

### NewModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner

`func NewModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner() *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner`

NewModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner instantiates a new ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInnerWithDefaults

`func NewModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInnerWithDefaults() *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner`

NewModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInnerWithDefaults instantiates a new ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourse

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetId

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetMeetingid

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetMeetingid() string`

GetMeetingid returns the Meetingid field if non-nil, zero value otherwise.

### GetMeetingidOk

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetMeetingidOk() (*string, bool)`

GetMeetingidOk returns a tuple with the Meetingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMeetingid

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) SetMeetingid(v string)`

SetMeetingid sets Meetingid field to given value.

### HasMeetingid

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) HasMeetingid() bool`

HasMeetingid returns a boolean if a field has been set.

### GetName

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetSection

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetVisible

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


