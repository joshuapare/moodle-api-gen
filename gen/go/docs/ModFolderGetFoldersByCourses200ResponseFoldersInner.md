# ModFolderGetFoldersByCourses200ResponseFoldersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Course** | Pointer to **int32** | Course id | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id | [optional] 
**Display** | Pointer to **int32** | Display type of folder contents on a separate page or inline | [optional] [default to null]
**Forcedownload** | Pointer to **int32** | Whether file download is forced | [optional] [default to null]
**Groupingid** | Pointer to **int32** | Group id | [optional] 
**Groupmode** | Pointer to **int32** | Group mode | [optional] 
**Id** | Pointer to **int32** | Activity instance id | [optional] 
**Intro** | Pointer to **string** | Activity introduction | [optional] 
**Introfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Name** | Pointer to **string** | Activity name | [optional] 
**Revision** | Pointer to **int32** | Incremented when after each file changes, to avoid cache | [optional] [default to null]
**Section** | Pointer to **int32** | Course section id | [optional] 
**Showdownloadfolder** | Pointer to **int32** | Whether to show the download folder button | [optional] [default to null]
**Showexpanded** | Pointer to **int32** | 1 &#x3D; expanded, 0 &#x3D; collapsed for sub-folders | [optional] [default to null]
**Timemodified** | Pointer to **int32** | Last time the folder was modified | [optional] [default to null]
**Visible** | Pointer to **bool** | Visible | [optional] 

## Methods

### NewModFolderGetFoldersByCourses200ResponseFoldersInner

`func NewModFolderGetFoldersByCourses200ResponseFoldersInner() *ModFolderGetFoldersByCourses200ResponseFoldersInner`

NewModFolderGetFoldersByCourses200ResponseFoldersInner instantiates a new ModFolderGetFoldersByCourses200ResponseFoldersInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFolderGetFoldersByCourses200ResponseFoldersInnerWithDefaults

`func NewModFolderGetFoldersByCourses200ResponseFoldersInnerWithDefaults() *ModFolderGetFoldersByCourses200ResponseFoldersInner`

NewModFolderGetFoldersByCourses200ResponseFoldersInnerWithDefaults instantiates a new ModFolderGetFoldersByCourses200ResponseFoldersInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourse

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetDisplay

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetDisplay() int32`

GetDisplay returns the Display field if non-nil, zero value otherwise.

### GetDisplayOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetDisplayOk() (*int32, bool)`

GetDisplayOk returns a tuple with the Display field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplay

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetDisplay(v int32)`

SetDisplay sets Display field to given value.

### HasDisplay

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasDisplay() bool`

HasDisplay returns a boolean if a field has been set.

### GetForcedownload

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetForcedownload() int32`

GetForcedownload returns the Forcedownload field if non-nil, zero value otherwise.

### GetForcedownloadOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetForcedownloadOk() (*int32, bool)`

GetForcedownloadOk returns a tuple with the Forcedownload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForcedownload

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetForcedownload(v int32)`

SetForcedownload sets Forcedownload field to given value.

### HasForcedownload

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasForcedownload() bool`

HasForcedownload returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetId

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetName

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRevision

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetRevision() int32`

GetRevision returns the Revision field if non-nil, zero value otherwise.

### GetRevisionOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetRevisionOk() (*int32, bool)`

GetRevisionOk returns a tuple with the Revision field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevision

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetRevision(v int32)`

SetRevision sets Revision field to given value.

### HasRevision

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasRevision() bool`

HasRevision returns a boolean if a field has been set.

### GetSection

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetShowdownloadfolder

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetShowdownloadfolder() int32`

GetShowdownloadfolder returns the Showdownloadfolder field if non-nil, zero value otherwise.

### GetShowdownloadfolderOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetShowdownloadfolderOk() (*int32, bool)`

GetShowdownloadfolderOk returns a tuple with the Showdownloadfolder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowdownloadfolder

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetShowdownloadfolder(v int32)`

SetShowdownloadfolder sets Showdownloadfolder field to given value.

### HasShowdownloadfolder

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasShowdownloadfolder() bool`

HasShowdownloadfolder returns a boolean if a field has been set.

### GetShowexpanded

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetShowexpanded() int32`

GetShowexpanded returns the Showexpanded field if non-nil, zero value otherwise.

### GetShowexpandedOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetShowexpandedOk() (*int32, bool)`

GetShowexpandedOk returns a tuple with the Showexpanded field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowexpanded

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetShowexpanded(v int32)`

SetShowexpanded sets Showexpanded field to given value.

### HasShowexpanded

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasShowexpanded() bool`

HasShowexpanded returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetVisible

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModFolderGetFoldersByCourses200ResponseFoldersInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


