# ModPageGetPagesByCourses200ResponsePagesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | Pointer to **string** | Page content | [optional] [default to "null"]
**Contentfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Contentformat** | Pointer to **int32** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Course** | Pointer to **int32** | Course id | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id | [optional] 
**Display** | Pointer to **int32** | How to display the page | [optional] [default to null]
**Displayoptions** | Pointer to **string** | Display options (width, height) | [optional] [default to "null"]
**Groupingid** | Pointer to **int32** | Group id | [optional] 
**Groupmode** | Pointer to **int32** | Group mode | [optional] 
**Id** | Pointer to **int32** | Activity instance id | [optional] 
**Intro** | Pointer to **string** | Activity introduction | [optional] 
**Introfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Legacyfiles** | Pointer to **int32** | Legacy files flag | [optional] [default to null]
**Legacyfileslast** | Pointer to **int32** | Legacy files last control flag | [optional] [default to null]
**Name** | Pointer to **string** | Activity name | [optional] 
**Revision** | Pointer to **int32** | Incremented when after each file changes, to avoid cache | [optional] 
**Section** | Pointer to **int32** | Course section id | [optional] 
**Timemodified** | Pointer to **int32** | Last time the page was modified | [optional] [default to null]
**Visible** | Pointer to **bool** | Visible | [optional] 

## Methods

### NewModPageGetPagesByCourses200ResponsePagesInner

`func NewModPageGetPagesByCourses200ResponsePagesInner() *ModPageGetPagesByCourses200ResponsePagesInner`

NewModPageGetPagesByCourses200ResponsePagesInner instantiates a new ModPageGetPagesByCourses200ResponsePagesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModPageGetPagesByCourses200ResponsePagesInnerWithDefaults

`func NewModPageGetPagesByCourses200ResponsePagesInnerWithDefaults() *ModPageGetPagesByCourses200ResponsePagesInner`

NewModPageGetPagesByCourses200ResponsePagesInnerWithDefaults instantiates a new ModPageGetPagesByCourses200ResponsePagesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContent

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetContent(v string)`

SetContent sets Content field to given value.

### HasContent

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasContent() bool`

HasContent returns a boolean if a field has been set.

### GetContentfiles

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetContentfiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetContentfiles returns the Contentfiles field if non-nil, zero value otherwise.

### GetContentfilesOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetContentfilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetContentfilesOk returns a tuple with the Contentfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentfiles

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetContentfiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetContentfiles sets Contentfiles field to given value.

### HasContentfiles

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasContentfiles() bool`

HasContentfiles returns a boolean if a field has been set.

### GetContentformat

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetContentformat() int32`

GetContentformat returns the Contentformat field if non-nil, zero value otherwise.

### GetContentformatOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetContentformatOk() (*int32, bool)`

GetContentformatOk returns a tuple with the Contentformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentformat

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetContentformat(v int32)`

SetContentformat sets Contentformat field to given value.

### HasContentformat

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasContentformat() bool`

HasContentformat returns a boolean if a field has been set.

### GetCourse

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetDisplay

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetDisplay() int32`

GetDisplay returns the Display field if non-nil, zero value otherwise.

### GetDisplayOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetDisplayOk() (*int32, bool)`

GetDisplayOk returns a tuple with the Display field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplay

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetDisplay(v int32)`

SetDisplay sets Display field to given value.

### HasDisplay

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasDisplay() bool`

HasDisplay returns a boolean if a field has been set.

### GetDisplayoptions

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetDisplayoptions() string`

GetDisplayoptions returns the Displayoptions field if non-nil, zero value otherwise.

### GetDisplayoptionsOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetDisplayoptionsOk() (*string, bool)`

GetDisplayoptionsOk returns a tuple with the Displayoptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayoptions

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetDisplayoptions(v string)`

SetDisplayoptions sets Displayoptions field to given value.

### HasDisplayoptions

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasDisplayoptions() bool`

HasDisplayoptions returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetId

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetLegacyfiles

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetLegacyfiles() int32`

GetLegacyfiles returns the Legacyfiles field if non-nil, zero value otherwise.

### GetLegacyfilesOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetLegacyfilesOk() (*int32, bool)`

GetLegacyfilesOk returns a tuple with the Legacyfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLegacyfiles

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetLegacyfiles(v int32)`

SetLegacyfiles sets Legacyfiles field to given value.

### HasLegacyfiles

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasLegacyfiles() bool`

HasLegacyfiles returns a boolean if a field has been set.

### GetLegacyfileslast

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetLegacyfileslast() int32`

GetLegacyfileslast returns the Legacyfileslast field if non-nil, zero value otherwise.

### GetLegacyfileslastOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetLegacyfileslastOk() (*int32, bool)`

GetLegacyfileslastOk returns a tuple with the Legacyfileslast field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLegacyfileslast

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetLegacyfileslast(v int32)`

SetLegacyfileslast sets Legacyfileslast field to given value.

### HasLegacyfileslast

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasLegacyfileslast() bool`

HasLegacyfileslast returns a boolean if a field has been set.

### GetName

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRevision

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetRevision() int32`

GetRevision returns the Revision field if non-nil, zero value otherwise.

### GetRevisionOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetRevisionOk() (*int32, bool)`

GetRevisionOk returns a tuple with the Revision field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevision

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetRevision(v int32)`

SetRevision sets Revision field to given value.

### HasRevision

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasRevision() bool`

HasRevision returns a boolean if a field has been set.

### GetSection

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetVisible

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


