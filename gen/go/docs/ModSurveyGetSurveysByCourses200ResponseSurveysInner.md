# ModSurveyGetSurveysByCourses200ResponseSurveysInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Course** | Pointer to **int32** | Course id | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id | [optional] 
**Days** | Pointer to **int32** | Days | [optional] [default to null]
**Groupingid** | Pointer to **int32** | Group id | [optional] 
**Groupmode** | Pointer to **int32** | Group mode | [optional] 
**Id** | Pointer to **int32** | Activity instance id | [optional] 
**Intro** | Pointer to **string** | Activity introduction | [optional] 
**Introfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Name** | Pointer to **string** | Activity name | [optional] 
**Questions** | Pointer to **string** | Question ids | [optional] [default to "null"]
**Section** | Pointer to **int32** | Course section id | [optional] 
**Surveydone** | Pointer to **int32** | Did I finish the survey? | [optional] [default to null]
**Template** | Pointer to **int32** | Survey type | [optional] [default to null]
**Timecreated** | Pointer to **int32** | Time of creation | [optional] 
**Timemodified** | Pointer to **int32** | Time of last modification | [optional] 
**Visible** | Pointer to **bool** | Visible | [optional] 

## Methods

### NewModSurveyGetSurveysByCourses200ResponseSurveysInner

`func NewModSurveyGetSurveysByCourses200ResponseSurveysInner() *ModSurveyGetSurveysByCourses200ResponseSurveysInner`

NewModSurveyGetSurveysByCourses200ResponseSurveysInner instantiates a new ModSurveyGetSurveysByCourses200ResponseSurveysInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModSurveyGetSurveysByCourses200ResponseSurveysInnerWithDefaults

`func NewModSurveyGetSurveysByCourses200ResponseSurveysInnerWithDefaults() *ModSurveyGetSurveysByCourses200ResponseSurveysInner`

NewModSurveyGetSurveysByCourses200ResponseSurveysInnerWithDefaults instantiates a new ModSurveyGetSurveysByCourses200ResponseSurveysInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourse

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetDays

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetDays() int32`

GetDays returns the Days field if non-nil, zero value otherwise.

### GetDaysOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetDaysOk() (*int32, bool)`

GetDaysOk returns a tuple with the Days field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDays

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetDays(v int32)`

SetDays sets Days field to given value.

### HasDays

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasDays() bool`

HasDays returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetId

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetName

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetQuestions

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetQuestions() string`

GetQuestions returns the Questions field if non-nil, zero value otherwise.

### GetQuestionsOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetQuestionsOk() (*string, bool)`

GetQuestionsOk returns a tuple with the Questions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestions

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetQuestions(v string)`

SetQuestions sets Questions field to given value.

### HasQuestions

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasQuestions() bool`

HasQuestions returns a boolean if a field has been set.

### GetSection

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetSurveydone

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetSurveydone() int32`

GetSurveydone returns the Surveydone field if non-nil, zero value otherwise.

### GetSurveydoneOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetSurveydoneOk() (*int32, bool)`

GetSurveydoneOk returns a tuple with the Surveydone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSurveydone

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetSurveydone(v int32)`

SetSurveydone sets Surveydone field to given value.

### HasSurveydone

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasSurveydone() bool`

HasSurveydone returns a boolean if a field has been set.

### GetTemplate

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetTemplate() int32`

GetTemplate returns the Template field if non-nil, zero value otherwise.

### GetTemplateOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetTemplateOk() (*int32, bool)`

GetTemplateOk returns a tuple with the Template field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplate

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetTemplate(v int32)`

SetTemplate sets Template field to given value.

### HasTemplate

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasTemplate() bool`

HasTemplate returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetVisible

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModSurveyGetSurveysByCourses200ResponseSurveysInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


