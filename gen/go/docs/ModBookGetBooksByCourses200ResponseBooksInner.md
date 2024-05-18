# ModBookGetBooksByCourses200ResponseBooksInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Course** | Pointer to **int32** | Course id | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id | [optional] 
**Customtitles** | Pointer to **int32** | Book custom titles type | [optional] [default to null]
**Groupingid** | Pointer to **int32** | Group id | [optional] 
**Groupmode** | Pointer to **int32** | Group mode | [optional] 
**Id** | Pointer to **int32** | Activity instance id | [optional] 
**Intro** | Pointer to **string** | Activity introduction | [optional] 
**Introfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Name** | Pointer to **string** | Activity name | [optional] 
**Navstyle** | Pointer to **int32** | Book navigation style configuration | [optional] [default to null]
**Numbering** | Pointer to **int32** | Book numbering configuration | [optional] [default to null]
**Revision** | Pointer to **int32** | Book revision | [optional] [default to null]
**Section** | Pointer to **int32** | Course section id | [optional] 
**Timecreated** | Pointer to **int32** | Time of creation | [optional] [default to null]
**Timemodified** | Pointer to **int32** | Time of last modification | [optional] [default to null]
**Visible** | Pointer to **bool** | Visible | [optional] 

## Methods

### NewModBookGetBooksByCourses200ResponseBooksInner

`func NewModBookGetBooksByCourses200ResponseBooksInner() *ModBookGetBooksByCourses200ResponseBooksInner`

NewModBookGetBooksByCourses200ResponseBooksInner instantiates a new ModBookGetBooksByCourses200ResponseBooksInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModBookGetBooksByCourses200ResponseBooksInnerWithDefaults

`func NewModBookGetBooksByCourses200ResponseBooksInnerWithDefaults() *ModBookGetBooksByCourses200ResponseBooksInner`

NewModBookGetBooksByCourses200ResponseBooksInnerWithDefaults instantiates a new ModBookGetBooksByCourses200ResponseBooksInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourse

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetCustomtitles

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetCustomtitles() int32`

GetCustomtitles returns the Customtitles field if non-nil, zero value otherwise.

### GetCustomtitlesOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetCustomtitlesOk() (*int32, bool)`

GetCustomtitlesOk returns a tuple with the Customtitles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomtitles

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetCustomtitles(v int32)`

SetCustomtitles sets Customtitles field to given value.

### HasCustomtitles

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasCustomtitles() bool`

HasCustomtitles returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetId

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetName

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNavstyle

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetNavstyle() int32`

GetNavstyle returns the Navstyle field if non-nil, zero value otherwise.

### GetNavstyleOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetNavstyleOk() (*int32, bool)`

GetNavstyleOk returns a tuple with the Navstyle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNavstyle

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetNavstyle(v int32)`

SetNavstyle sets Navstyle field to given value.

### HasNavstyle

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasNavstyle() bool`

HasNavstyle returns a boolean if a field has been set.

### GetNumbering

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetNumbering() int32`

GetNumbering returns the Numbering field if non-nil, zero value otherwise.

### GetNumberingOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetNumberingOk() (*int32, bool)`

GetNumberingOk returns a tuple with the Numbering field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumbering

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetNumbering(v int32)`

SetNumbering sets Numbering field to given value.

### HasNumbering

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasNumbering() bool`

HasNumbering returns a boolean if a field has been set.

### GetRevision

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetRevision() int32`

GetRevision returns the Revision field if non-nil, zero value otherwise.

### GetRevisionOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetRevisionOk() (*int32, bool)`

GetRevisionOk returns a tuple with the Revision field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevision

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetRevision(v int32)`

SetRevision sets Revision field to given value.

### HasRevision

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasRevision() bool`

HasRevision returns a boolean if a field has been set.

### GetSection

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetVisible

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModBookGetBooksByCourses200ResponseBooksInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


