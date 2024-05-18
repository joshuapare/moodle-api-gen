# ModResourceGetResourcesByCourses200ResponseResourcesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contentfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Course** | Pointer to **int32** | Course id | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id | [optional] 
**Display** | Pointer to **int32** | How to display the resource | [optional] [default to null]
**Displayoptions** | Pointer to **string** | Display options (width, height) | [optional] 
**Filterfiles** | Pointer to **int32** | If filters should be applied to the resource content | [optional] [default to null]
**Groupingid** | Pointer to **int32** | Group id | [optional] 
**Groupmode** | Pointer to **int32** | Group mode | [optional] 
**Id** | Pointer to **int32** | Activity instance id | [optional] 
**Intro** | Pointer to **string** | Activity introduction | [optional] 
**Introfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Legacyfiles** | Pointer to **int32** | Legacy files flag | [optional] 
**Legacyfileslast** | Pointer to **int32** | Legacy files last control flag | [optional] 
**Name** | Pointer to **string** | Activity name | [optional] 
**Revision** | Pointer to **int32** | Incremented when after each file changes, to avoid cache | [optional] 
**Section** | Pointer to **int32** | Course section id | [optional] 
**Timemodified** | Pointer to **int32** | Last time the resource was modified | [optional] [default to null]
**Tobemigrated** | Pointer to **int32** | Whether this resource was migrated | [optional] [default to null]
**Visible** | Pointer to **bool** | Visible | [optional] 

## Methods

### NewModResourceGetResourcesByCourses200ResponseResourcesInner

`func NewModResourceGetResourcesByCourses200ResponseResourcesInner() *ModResourceGetResourcesByCourses200ResponseResourcesInner`

NewModResourceGetResourcesByCourses200ResponseResourcesInner instantiates a new ModResourceGetResourcesByCourses200ResponseResourcesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModResourceGetResourcesByCourses200ResponseResourcesInnerWithDefaults

`func NewModResourceGetResourcesByCourses200ResponseResourcesInnerWithDefaults() *ModResourceGetResourcesByCourses200ResponseResourcesInner`

NewModResourceGetResourcesByCourses200ResponseResourcesInnerWithDefaults instantiates a new ModResourceGetResourcesByCourses200ResponseResourcesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContentfiles

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetContentfiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetContentfiles returns the Contentfiles field if non-nil, zero value otherwise.

### GetContentfilesOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetContentfilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetContentfilesOk returns a tuple with the Contentfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentfiles

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetContentfiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetContentfiles sets Contentfiles field to given value.

### HasContentfiles

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasContentfiles() bool`

HasContentfiles returns a boolean if a field has been set.

### GetCourse

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetDisplay

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetDisplay() int32`

GetDisplay returns the Display field if non-nil, zero value otherwise.

### GetDisplayOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetDisplayOk() (*int32, bool)`

GetDisplayOk returns a tuple with the Display field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplay

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetDisplay(v int32)`

SetDisplay sets Display field to given value.

### HasDisplay

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasDisplay() bool`

HasDisplay returns a boolean if a field has been set.

### GetDisplayoptions

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetDisplayoptions() string`

GetDisplayoptions returns the Displayoptions field if non-nil, zero value otherwise.

### GetDisplayoptionsOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetDisplayoptionsOk() (*string, bool)`

GetDisplayoptionsOk returns a tuple with the Displayoptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayoptions

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetDisplayoptions(v string)`

SetDisplayoptions sets Displayoptions field to given value.

### HasDisplayoptions

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasDisplayoptions() bool`

HasDisplayoptions returns a boolean if a field has been set.

### GetFilterfiles

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetFilterfiles() int32`

GetFilterfiles returns the Filterfiles field if non-nil, zero value otherwise.

### GetFilterfilesOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetFilterfilesOk() (*int32, bool)`

GetFilterfilesOk returns a tuple with the Filterfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterfiles

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetFilterfiles(v int32)`

SetFilterfiles sets Filterfiles field to given value.

### HasFilterfiles

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasFilterfiles() bool`

HasFilterfiles returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetId

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetLegacyfiles

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetLegacyfiles() int32`

GetLegacyfiles returns the Legacyfiles field if non-nil, zero value otherwise.

### GetLegacyfilesOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetLegacyfilesOk() (*int32, bool)`

GetLegacyfilesOk returns a tuple with the Legacyfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLegacyfiles

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetLegacyfiles(v int32)`

SetLegacyfiles sets Legacyfiles field to given value.

### HasLegacyfiles

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasLegacyfiles() bool`

HasLegacyfiles returns a boolean if a field has been set.

### GetLegacyfileslast

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetLegacyfileslast() int32`

GetLegacyfileslast returns the Legacyfileslast field if non-nil, zero value otherwise.

### GetLegacyfileslastOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetLegacyfileslastOk() (*int32, bool)`

GetLegacyfileslastOk returns a tuple with the Legacyfileslast field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLegacyfileslast

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetLegacyfileslast(v int32)`

SetLegacyfileslast sets Legacyfileslast field to given value.

### HasLegacyfileslast

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasLegacyfileslast() bool`

HasLegacyfileslast returns a boolean if a field has been set.

### GetName

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRevision

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetRevision() int32`

GetRevision returns the Revision field if non-nil, zero value otherwise.

### GetRevisionOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetRevisionOk() (*int32, bool)`

GetRevisionOk returns a tuple with the Revision field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevision

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetRevision(v int32)`

SetRevision sets Revision field to given value.

### HasRevision

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasRevision() bool`

HasRevision returns a boolean if a field has been set.

### GetSection

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTobemigrated

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetTobemigrated() int32`

GetTobemigrated returns the Tobemigrated field if non-nil, zero value otherwise.

### GetTobemigratedOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetTobemigratedOk() (*int32, bool)`

GetTobemigratedOk returns a tuple with the Tobemigrated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTobemigrated

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetTobemigrated(v int32)`

SetTobemigrated sets Tobemigrated field to given value.

### HasTobemigrated

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasTobemigrated() bool`

HasTobemigrated returns a boolean if a field has been set.

### GetVisible

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


