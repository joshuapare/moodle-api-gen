# ModLabelGetLabelsByCourses200ResponseLabelsInner

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
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Name** | Pointer to **string** | Activity name | [optional] 
**Section** | Pointer to **int32** | Course section id | [optional] 
**Timemodified** | Pointer to **int32** | Last time the label was modified | [optional] [default to null]
**Visible** | Pointer to **bool** | Visible | [optional] 

## Methods

### NewModLabelGetLabelsByCourses200ResponseLabelsInner

`func NewModLabelGetLabelsByCourses200ResponseLabelsInner() *ModLabelGetLabelsByCourses200ResponseLabelsInner`

NewModLabelGetLabelsByCourses200ResponseLabelsInner instantiates a new ModLabelGetLabelsByCourses200ResponseLabelsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLabelGetLabelsByCourses200ResponseLabelsInnerWithDefaults

`func NewModLabelGetLabelsByCourses200ResponseLabelsInnerWithDefaults() *ModLabelGetLabelsByCourses200ResponseLabelsInner`

NewModLabelGetLabelsByCourses200ResponseLabelsInnerWithDefaults instantiates a new ModLabelGetLabelsByCourses200ResponseLabelsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourse

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetId

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetName

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetSection

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetVisible

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModLabelGetLabelsByCourses200ResponseLabelsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


