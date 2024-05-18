# ModWikiGetWikisByCourses200ResponseWikisInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cancreatepages** | Pointer to **bool** | True if user can create pages. | [optional] [default to null]
**Course** | Pointer to **int32** | Course id | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id | [optional] 
**Defaultformat** | Pointer to **string** | Wiki&#39;s default format (html, creole, nwiki). | [optional] [default to "null"]
**Editbegin** | Pointer to **int32** | Edit begin. | [optional] [default to null]
**Editend** | Pointer to **int32** | Edit end. | [optional] [default to null]
**Firstpagetitle** | Pointer to **string** | First page title. | [optional] [default to "null"]
**Forceformat** | Pointer to **int32** | 1 if format is forced, 0 otherwise. | [optional] [default to null]
**Groupingid** | Pointer to **int32** | Group id | [optional] 
**Groupmode** | Pointer to **int32** | Group mode | [optional] 
**Id** | Pointer to **int32** | Activity instance id | [optional] 
**Intro** | Pointer to **string** | Activity introduction | [optional] 
**Introfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Name** | Pointer to **string** | Activity name | [optional] 
**Section** | Pointer to **int32** | Course section id | [optional] 
**Timecreated** | Pointer to **int32** | Time of creation. | [optional] 
**Timemodified** | Pointer to **int32** | Time of last modification. | [optional] 
**Visible** | Pointer to **bool** | Visible | [optional] 
**Wikimode** | Pointer to **string** | Wiki mode (individual, collaborative). | [optional] [default to "null"]

## Methods

### NewModWikiGetWikisByCourses200ResponseWikisInner

`func NewModWikiGetWikisByCourses200ResponseWikisInner() *ModWikiGetWikisByCourses200ResponseWikisInner`

NewModWikiGetWikisByCourses200ResponseWikisInner instantiates a new ModWikiGetWikisByCourses200ResponseWikisInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWikiGetWikisByCourses200ResponseWikisInnerWithDefaults

`func NewModWikiGetWikisByCourses200ResponseWikisInnerWithDefaults() *ModWikiGetWikisByCourses200ResponseWikisInner`

NewModWikiGetWikisByCourses200ResponseWikisInnerWithDefaults instantiates a new ModWikiGetWikisByCourses200ResponseWikisInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCancreatepages

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetCancreatepages() bool`

GetCancreatepages returns the Cancreatepages field if non-nil, zero value otherwise.

### GetCancreatepagesOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetCancreatepagesOk() (*bool, bool)`

GetCancreatepagesOk returns a tuple with the Cancreatepages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancreatepages

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetCancreatepages(v bool)`

SetCancreatepages sets Cancreatepages field to given value.

### HasCancreatepages

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasCancreatepages() bool`

HasCancreatepages returns a boolean if a field has been set.

### GetCourse

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetDefaultformat

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetDefaultformat() string`

GetDefaultformat returns the Defaultformat field if non-nil, zero value otherwise.

### GetDefaultformatOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetDefaultformatOk() (*string, bool)`

GetDefaultformatOk returns a tuple with the Defaultformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultformat

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetDefaultformat(v string)`

SetDefaultformat sets Defaultformat field to given value.

### HasDefaultformat

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasDefaultformat() bool`

HasDefaultformat returns a boolean if a field has been set.

### GetEditbegin

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetEditbegin() int32`

GetEditbegin returns the Editbegin field if non-nil, zero value otherwise.

### GetEditbeginOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetEditbeginOk() (*int32, bool)`

GetEditbeginOk returns a tuple with the Editbegin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditbegin

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetEditbegin(v int32)`

SetEditbegin sets Editbegin field to given value.

### HasEditbegin

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasEditbegin() bool`

HasEditbegin returns a boolean if a field has been set.

### GetEditend

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetEditend() int32`

GetEditend returns the Editend field if non-nil, zero value otherwise.

### GetEditendOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetEditendOk() (*int32, bool)`

GetEditendOk returns a tuple with the Editend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditend

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetEditend(v int32)`

SetEditend sets Editend field to given value.

### HasEditend

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasEditend() bool`

HasEditend returns a boolean if a field has been set.

### GetFirstpagetitle

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetFirstpagetitle() string`

GetFirstpagetitle returns the Firstpagetitle field if non-nil, zero value otherwise.

### GetFirstpagetitleOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetFirstpagetitleOk() (*string, bool)`

GetFirstpagetitleOk returns a tuple with the Firstpagetitle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstpagetitle

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetFirstpagetitle(v string)`

SetFirstpagetitle sets Firstpagetitle field to given value.

### HasFirstpagetitle

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasFirstpagetitle() bool`

HasFirstpagetitle returns a boolean if a field has been set.

### GetForceformat

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetForceformat() int32`

GetForceformat returns the Forceformat field if non-nil, zero value otherwise.

### GetForceformatOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetForceformatOk() (*int32, bool)`

GetForceformatOk returns a tuple with the Forceformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForceformat

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetForceformat(v int32)`

SetForceformat sets Forceformat field to given value.

### HasForceformat

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasForceformat() bool`

HasForceformat returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetId

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetName

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetSection

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetVisible

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.

### GetWikimode

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetWikimode() string`

GetWikimode returns the Wikimode field if non-nil, zero value otherwise.

### GetWikimodeOk

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) GetWikimodeOk() (*string, bool)`

GetWikimodeOk returns a tuple with the Wikimode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWikimode

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) SetWikimode(v string)`

SetWikimode sets Wikimode field to given value.

### HasWikimode

`func (o *ModWikiGetWikisByCourses200ResponseWikisInner) HasWikimode() bool`

HasWikimode returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


