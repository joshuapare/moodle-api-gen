# ModUrlGetUrlsByCourses200ResponseUrlsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Course** | Pointer to **int32** | Course id | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id | [optional] 
**Display** | Pointer to **int32** | How to display the url | [optional] [default to null]
**Displayoptions** | Pointer to **string** | Display options (width, height) | [optional] 
**Externalurl** | Pointer to **string** | External URL | [optional] [default to "null"]
**Groupingid** | Pointer to **int32** | Group id | [optional] 
**Groupmode** | Pointer to **int32** | Group mode | [optional] 
**Id** | Pointer to **int32** | Activity instance id | [optional] 
**Intro** | Pointer to **string** | Activity introduction | [optional] 
**Introfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Name** | Pointer to **string** | Activity name | [optional] 
**Parameters** | Pointer to **string** | Parameters to append to the URL | [optional] [default to "null"]
**Section** | Pointer to **int32** | Course section id | [optional] 
**Timemodified** | Pointer to **int32** | Last time the url was modified | [optional] [default to null]
**Visible** | Pointer to **bool** | Visible | [optional] 

## Methods

### NewModUrlGetUrlsByCourses200ResponseUrlsInner

`func NewModUrlGetUrlsByCourses200ResponseUrlsInner() *ModUrlGetUrlsByCourses200ResponseUrlsInner`

NewModUrlGetUrlsByCourses200ResponseUrlsInner instantiates a new ModUrlGetUrlsByCourses200ResponseUrlsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModUrlGetUrlsByCourses200ResponseUrlsInnerWithDefaults

`func NewModUrlGetUrlsByCourses200ResponseUrlsInnerWithDefaults() *ModUrlGetUrlsByCourses200ResponseUrlsInner`

NewModUrlGetUrlsByCourses200ResponseUrlsInnerWithDefaults instantiates a new ModUrlGetUrlsByCourses200ResponseUrlsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourse

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetDisplay

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetDisplay() int32`

GetDisplay returns the Display field if non-nil, zero value otherwise.

### GetDisplayOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetDisplayOk() (*int32, bool)`

GetDisplayOk returns a tuple with the Display field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplay

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetDisplay(v int32)`

SetDisplay sets Display field to given value.

### HasDisplay

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasDisplay() bool`

HasDisplay returns a boolean if a field has been set.

### GetDisplayoptions

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetDisplayoptions() string`

GetDisplayoptions returns the Displayoptions field if non-nil, zero value otherwise.

### GetDisplayoptionsOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetDisplayoptionsOk() (*string, bool)`

GetDisplayoptionsOk returns a tuple with the Displayoptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayoptions

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetDisplayoptions(v string)`

SetDisplayoptions sets Displayoptions field to given value.

### HasDisplayoptions

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasDisplayoptions() bool`

HasDisplayoptions returns a boolean if a field has been set.

### GetExternalurl

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetExternalurl() string`

GetExternalurl returns the Externalurl field if non-nil, zero value otherwise.

### GetExternalurlOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetExternalurlOk() (*string, bool)`

GetExternalurlOk returns a tuple with the Externalurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalurl

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetExternalurl(v string)`

SetExternalurl sets Externalurl field to given value.

### HasExternalurl

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasExternalurl() bool`

HasExternalurl returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetId

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetName

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetParameters

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetParameters() string`

GetParameters returns the Parameters field if non-nil, zero value otherwise.

### GetParametersOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetParametersOk() (*string, bool)`

GetParametersOk returns a tuple with the Parameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParameters

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetParameters(v string)`

SetParameters sets Parameters field to given value.

### HasParameters

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasParameters() bool`

HasParameters returns a boolean if a field has been set.

### GetSection

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetVisible

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


