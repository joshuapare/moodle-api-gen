# ModImscpGetImscpsByCourses200ResponseImscpsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Course** | Pointer to **int32** | Course id | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id | [optional] 
**Groupingid** | Pointer to **int32** | Group id | [optional] 
**Groupmode** | Pointer to **int32** | Group mode | [optional] 
**Id** | Pointer to **int32** | Activity instance id | [optional] 
**Intro** | Pointer to **string** | Activity introduction | [optional] 
**Introfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Keepold** | Pointer to **int32** | Number of old IMSCP to keep | [optional] [default to null]
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Name** | Pointer to **string** | Activity name | [optional] 
**Revision** | Pointer to **int32** | Revision | [optional] [default to null]
**Section** | Pointer to **int32** | Course section id | [optional] 
**Structure** | Pointer to **string** | IMSCP structure | [optional] [default to "null"]
**Timemodified** | Pointer to **string** | Time of last modification | [optional] [default to "null"]
**Visible** | Pointer to **bool** | Visible | [optional] 

## Methods

### NewModImscpGetImscpsByCourses200ResponseImscpsInner

`func NewModImscpGetImscpsByCourses200ResponseImscpsInner() *ModImscpGetImscpsByCourses200ResponseImscpsInner`

NewModImscpGetImscpsByCourses200ResponseImscpsInner instantiates a new ModImscpGetImscpsByCourses200ResponseImscpsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModImscpGetImscpsByCourses200ResponseImscpsInnerWithDefaults

`func NewModImscpGetImscpsByCourses200ResponseImscpsInnerWithDefaults() *ModImscpGetImscpsByCourses200ResponseImscpsInner`

NewModImscpGetImscpsByCourses200ResponseImscpsInnerWithDefaults instantiates a new ModImscpGetImscpsByCourses200ResponseImscpsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourse

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetId

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetKeepold

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetKeepold() int32`

GetKeepold returns the Keepold field if non-nil, zero value otherwise.

### GetKeepoldOk

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetKeepoldOk() (*int32, bool)`

GetKeepoldOk returns a tuple with the Keepold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeepold

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) SetKeepold(v int32)`

SetKeepold sets Keepold field to given value.

### HasKeepold

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) HasKeepold() bool`

HasKeepold returns a boolean if a field has been set.

### GetLang

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetName

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRevision

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetRevision() int32`

GetRevision returns the Revision field if non-nil, zero value otherwise.

### GetRevisionOk

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetRevisionOk() (*int32, bool)`

GetRevisionOk returns a tuple with the Revision field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevision

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) SetRevision(v int32)`

SetRevision sets Revision field to given value.

### HasRevision

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) HasRevision() bool`

HasRevision returns a boolean if a field has been set.

### GetSection

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetStructure

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetStructure() string`

GetStructure returns the Structure field if non-nil, zero value otherwise.

### GetStructureOk

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetStructureOk() (*string, bool)`

GetStructureOk returns a tuple with the Structure field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStructure

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) SetStructure(v string)`

SetStructure sets Structure field to given value.

### HasStructure

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) HasStructure() bool`

HasStructure returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetTimemodified() string`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetTimemodifiedOk() (*string, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) SetTimemodified(v string)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetVisible

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModImscpGetImscpsByCourses200ResponseImscpsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


