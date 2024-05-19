# CoreCourseGetCourseModule200ResponseCm

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Added** | Pointer to **int32** | Time added | [optional] [default to null]
**Advancedgrading** | Pointer to [**[]CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner**](CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner.md) |  | [optional] 
**Availability** | Pointer to **string** | Availability settings | [optional] [default to "null"]
**Completion** | **int32** | If completion is enabled | [default to null]
**Completionexpected** | Pointer to **int32** | Completion time expected | [optional] [default to null]
**Completiongradeitemnumber** | Pointer to **int32** | Completion grade item | [optional] [default to null]
**Completionpassgrade** | Pointer to **int32** | Completion pass grade setting | [optional] [default to null]
**Completionview** | Pointer to **int32** | Completion view setting | [optional] [default to null]
**Course** | **int32** | The course id | 
**Downloadcontent** | Pointer to **int32** | The download content value | [optional] [default to null]
**Grade** | Pointer to **float32** | Grade (max value or scale id) | [optional] [default to null]
**Gradecat** | Pointer to **int32** | Grade category | [optional] [default to null]
**Gradepass** | Pointer to **string** | Grade to pass (float) | [optional] [default to "null"]
**Groupingid** | **int32** | Grouping id | [default to null]
**Groupmode** | **int32** | Group mode | [default to null]
**Id** | **int32** | The course module id | 
**Idnumber** | Pointer to **string** | Module id number | [optional] [default to "null"]
**Indent** | Pointer to **int32** | Indentation | [optional] [default to null]
**Instance** | **int32** | The activity instance id | [default to null]
**Modname** | **string** | The module component name (forum, assign, etc..) | [default to "null"]
**Module** | **int32** | The module type id | [default to null]
**Name** | **string** | The activity name | [default to "null"]
**Outcomes** | Pointer to [**[]CoreCourseGetCourseModule200ResponseCmOutcomesInner**](CoreCourseGetCourseModule200ResponseCmOutcomesInner.md) |  | [optional] 
**Scale** | Pointer to **string** | Scale items (if used) | [optional] [default to "null"]
**Score** | Pointer to **int32** | Score | [optional] [default to null]
**Section** | **int32** | The module section id | [default to null]
**Sectionnum** | **int32** | The module section number | [default to null]
**Showdescription** | Pointer to **int32** | If the description is showed | [optional] [default to null]
**Visible** | Pointer to **int32** | If visible | [optional] [default to null]
**Visibleold** | Pointer to **int32** | Visible old | [optional] [default to null]
**Visibleoncoursepage** | Pointer to **int32** | If visible on course page | [optional] [default to null]

## Methods

### NewCoreCourseGetCourseModule200ResponseCm

`func NewCoreCourseGetCourseModule200ResponseCm(completion int32, course int32, groupingid int32, groupmode int32, id int32, instance int32, modname string, module int32, name string, section int32, sectionnum int32, ) *CoreCourseGetCourseModule200ResponseCm`

NewCoreCourseGetCourseModule200ResponseCm instantiates a new CoreCourseGetCourseModule200ResponseCm object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetCourseModule200ResponseCmWithDefaults

`func NewCoreCourseGetCourseModule200ResponseCmWithDefaults() *CoreCourseGetCourseModule200ResponseCm`

NewCoreCourseGetCourseModule200ResponseCmWithDefaults instantiates a new CoreCourseGetCourseModule200ResponseCm object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdded

`func (o *CoreCourseGetCourseModule200ResponseCm) GetAdded() int32`

GetAdded returns the Added field if non-nil, zero value otherwise.

### GetAddedOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetAddedOk() (*int32, bool)`

GetAddedOk returns a tuple with the Added field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdded

`func (o *CoreCourseGetCourseModule200ResponseCm) SetAdded(v int32)`

SetAdded sets Added field to given value.

### HasAdded

`func (o *CoreCourseGetCourseModule200ResponseCm) HasAdded() bool`

HasAdded returns a boolean if a field has been set.

### GetAdvancedgrading

`func (o *CoreCourseGetCourseModule200ResponseCm) GetAdvancedgrading() []CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner`

GetAdvancedgrading returns the Advancedgrading field if non-nil, zero value otherwise.

### GetAdvancedgradingOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetAdvancedgradingOk() (*[]CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner, bool)`

GetAdvancedgradingOk returns a tuple with the Advancedgrading field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdvancedgrading

`func (o *CoreCourseGetCourseModule200ResponseCm) SetAdvancedgrading(v []CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner)`

SetAdvancedgrading sets Advancedgrading field to given value.

### HasAdvancedgrading

`func (o *CoreCourseGetCourseModule200ResponseCm) HasAdvancedgrading() bool`

HasAdvancedgrading returns a boolean if a field has been set.

### GetAvailability

`func (o *CoreCourseGetCourseModule200ResponseCm) GetAvailability() string`

GetAvailability returns the Availability field if non-nil, zero value otherwise.

### GetAvailabilityOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetAvailabilityOk() (*string, bool)`

GetAvailabilityOk returns a tuple with the Availability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailability

`func (o *CoreCourseGetCourseModule200ResponseCm) SetAvailability(v string)`

SetAvailability sets Availability field to given value.

### HasAvailability

`func (o *CoreCourseGetCourseModule200ResponseCm) HasAvailability() bool`

HasAvailability returns a boolean if a field has been set.

### GetCompletion

`func (o *CoreCourseGetCourseModule200ResponseCm) GetCompletion() int32`

GetCompletion returns the Completion field if non-nil, zero value otherwise.

### GetCompletionOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetCompletionOk() (*int32, bool)`

GetCompletionOk returns a tuple with the Completion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletion

`func (o *CoreCourseGetCourseModule200ResponseCm) SetCompletion(v int32)`

SetCompletion sets Completion field to given value.


### GetCompletionexpected

`func (o *CoreCourseGetCourseModule200ResponseCm) GetCompletionexpected() int32`

GetCompletionexpected returns the Completionexpected field if non-nil, zero value otherwise.

### GetCompletionexpectedOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetCompletionexpectedOk() (*int32, bool)`

GetCompletionexpectedOk returns a tuple with the Completionexpected field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionexpected

`func (o *CoreCourseGetCourseModule200ResponseCm) SetCompletionexpected(v int32)`

SetCompletionexpected sets Completionexpected field to given value.

### HasCompletionexpected

`func (o *CoreCourseGetCourseModule200ResponseCm) HasCompletionexpected() bool`

HasCompletionexpected returns a boolean if a field has been set.

### GetCompletiongradeitemnumber

`func (o *CoreCourseGetCourseModule200ResponseCm) GetCompletiongradeitemnumber() int32`

GetCompletiongradeitemnumber returns the Completiongradeitemnumber field if non-nil, zero value otherwise.

### GetCompletiongradeitemnumberOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetCompletiongradeitemnumberOk() (*int32, bool)`

GetCompletiongradeitemnumberOk returns a tuple with the Completiongradeitemnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletiongradeitemnumber

`func (o *CoreCourseGetCourseModule200ResponseCm) SetCompletiongradeitemnumber(v int32)`

SetCompletiongradeitemnumber sets Completiongradeitemnumber field to given value.

### HasCompletiongradeitemnumber

`func (o *CoreCourseGetCourseModule200ResponseCm) HasCompletiongradeitemnumber() bool`

HasCompletiongradeitemnumber returns a boolean if a field has been set.

### GetCompletionpassgrade

`func (o *CoreCourseGetCourseModule200ResponseCm) GetCompletionpassgrade() int32`

GetCompletionpassgrade returns the Completionpassgrade field if non-nil, zero value otherwise.

### GetCompletionpassgradeOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetCompletionpassgradeOk() (*int32, bool)`

GetCompletionpassgradeOk returns a tuple with the Completionpassgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionpassgrade

`func (o *CoreCourseGetCourseModule200ResponseCm) SetCompletionpassgrade(v int32)`

SetCompletionpassgrade sets Completionpassgrade field to given value.

### HasCompletionpassgrade

`func (o *CoreCourseGetCourseModule200ResponseCm) HasCompletionpassgrade() bool`

HasCompletionpassgrade returns a boolean if a field has been set.

### GetCompletionview

`func (o *CoreCourseGetCourseModule200ResponseCm) GetCompletionview() int32`

GetCompletionview returns the Completionview field if non-nil, zero value otherwise.

### GetCompletionviewOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetCompletionviewOk() (*int32, bool)`

GetCompletionviewOk returns a tuple with the Completionview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionview

`func (o *CoreCourseGetCourseModule200ResponseCm) SetCompletionview(v int32)`

SetCompletionview sets Completionview field to given value.

### HasCompletionview

`func (o *CoreCourseGetCourseModule200ResponseCm) HasCompletionview() bool`

HasCompletionview returns a boolean if a field has been set.

### GetCourse

`func (o *CoreCourseGetCourseModule200ResponseCm) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *CoreCourseGetCourseModule200ResponseCm) SetCourse(v int32)`

SetCourse sets Course field to given value.


### GetDownloadcontent

`func (o *CoreCourseGetCourseModule200ResponseCm) GetDownloadcontent() int32`

GetDownloadcontent returns the Downloadcontent field if non-nil, zero value otherwise.

### GetDownloadcontentOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetDownloadcontentOk() (*int32, bool)`

GetDownloadcontentOk returns a tuple with the Downloadcontent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDownloadcontent

`func (o *CoreCourseGetCourseModule200ResponseCm) SetDownloadcontent(v int32)`

SetDownloadcontent sets Downloadcontent field to given value.

### HasDownloadcontent

`func (o *CoreCourseGetCourseModule200ResponseCm) HasDownloadcontent() bool`

HasDownloadcontent returns a boolean if a field has been set.

### GetGrade

`func (o *CoreCourseGetCourseModule200ResponseCm) GetGrade() float32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetGradeOk() (*float32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *CoreCourseGetCourseModule200ResponseCm) SetGrade(v float32)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *CoreCourseGetCourseModule200ResponseCm) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetGradecat

`func (o *CoreCourseGetCourseModule200ResponseCm) GetGradecat() int32`

GetGradecat returns the Gradecat field if non-nil, zero value otherwise.

### GetGradecatOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetGradecatOk() (*int32, bool)`

GetGradecatOk returns a tuple with the Gradecat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradecat

`func (o *CoreCourseGetCourseModule200ResponseCm) SetGradecat(v int32)`

SetGradecat sets Gradecat field to given value.

### HasGradecat

`func (o *CoreCourseGetCourseModule200ResponseCm) HasGradecat() bool`

HasGradecat returns a boolean if a field has been set.

### GetGradepass

`func (o *CoreCourseGetCourseModule200ResponseCm) GetGradepass() string`

GetGradepass returns the Gradepass field if non-nil, zero value otherwise.

### GetGradepassOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetGradepassOk() (*string, bool)`

GetGradepassOk returns a tuple with the Gradepass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradepass

`func (o *CoreCourseGetCourseModule200ResponseCm) SetGradepass(v string)`

SetGradepass sets Gradepass field to given value.

### HasGradepass

`func (o *CoreCourseGetCourseModule200ResponseCm) HasGradepass() bool`

HasGradepass returns a boolean if a field has been set.

### GetGroupingid

`func (o *CoreCourseGetCourseModule200ResponseCm) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *CoreCourseGetCourseModule200ResponseCm) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.


### GetGroupmode

`func (o *CoreCourseGetCourseModule200ResponseCm) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *CoreCourseGetCourseModule200ResponseCm) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.


### GetId

`func (o *CoreCourseGetCourseModule200ResponseCm) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCourseGetCourseModule200ResponseCm) SetId(v int32)`

SetId sets Id field to given value.


### GetIdnumber

`func (o *CoreCourseGetCourseModule200ResponseCm) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreCourseGetCourseModule200ResponseCm) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreCourseGetCourseModule200ResponseCm) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetIndent

`func (o *CoreCourseGetCourseModule200ResponseCm) GetIndent() int32`

GetIndent returns the Indent field if non-nil, zero value otherwise.

### GetIndentOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetIndentOk() (*int32, bool)`

GetIndentOk returns a tuple with the Indent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndent

`func (o *CoreCourseGetCourseModule200ResponseCm) SetIndent(v int32)`

SetIndent sets Indent field to given value.

### HasIndent

`func (o *CoreCourseGetCourseModule200ResponseCm) HasIndent() bool`

HasIndent returns a boolean if a field has been set.

### GetInstance

`func (o *CoreCourseGetCourseModule200ResponseCm) GetInstance() int32`

GetInstance returns the Instance field if non-nil, zero value otherwise.

### GetInstanceOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetInstanceOk() (*int32, bool)`

GetInstanceOk returns a tuple with the Instance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstance

`func (o *CoreCourseGetCourseModule200ResponseCm) SetInstance(v int32)`

SetInstance sets Instance field to given value.


### GetModname

`func (o *CoreCourseGetCourseModule200ResponseCm) GetModname() string`

GetModname returns the Modname field if non-nil, zero value otherwise.

### GetModnameOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetModnameOk() (*string, bool)`

GetModnameOk returns a tuple with the Modname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModname

`func (o *CoreCourseGetCourseModule200ResponseCm) SetModname(v string)`

SetModname sets Modname field to given value.


### GetModule

`func (o *CoreCourseGetCourseModule200ResponseCm) GetModule() int32`

GetModule returns the Module field if non-nil, zero value otherwise.

### GetModuleOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetModuleOk() (*int32, bool)`

GetModuleOk returns a tuple with the Module field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModule

`func (o *CoreCourseGetCourseModule200ResponseCm) SetModule(v int32)`

SetModule sets Module field to given value.


### GetName

`func (o *CoreCourseGetCourseModule200ResponseCm) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCourseGetCourseModule200ResponseCm) SetName(v string)`

SetName sets Name field to given value.


### GetOutcomes

`func (o *CoreCourseGetCourseModule200ResponseCm) GetOutcomes() []CoreCourseGetCourseModule200ResponseCmOutcomesInner`

GetOutcomes returns the Outcomes field if non-nil, zero value otherwise.

### GetOutcomesOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetOutcomesOk() (*[]CoreCourseGetCourseModule200ResponseCmOutcomesInner, bool)`

GetOutcomesOk returns a tuple with the Outcomes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutcomes

`func (o *CoreCourseGetCourseModule200ResponseCm) SetOutcomes(v []CoreCourseGetCourseModule200ResponseCmOutcomesInner)`

SetOutcomes sets Outcomes field to given value.

### HasOutcomes

`func (o *CoreCourseGetCourseModule200ResponseCm) HasOutcomes() bool`

HasOutcomes returns a boolean if a field has been set.

### GetScale

`func (o *CoreCourseGetCourseModule200ResponseCm) GetScale() string`

GetScale returns the Scale field if non-nil, zero value otherwise.

### GetScaleOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetScaleOk() (*string, bool)`

GetScaleOk returns a tuple with the Scale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScale

`func (o *CoreCourseGetCourseModule200ResponseCm) SetScale(v string)`

SetScale sets Scale field to given value.

### HasScale

`func (o *CoreCourseGetCourseModule200ResponseCm) HasScale() bool`

HasScale returns a boolean if a field has been set.

### GetScore

`func (o *CoreCourseGetCourseModule200ResponseCm) GetScore() int32`

GetScore returns the Score field if non-nil, zero value otherwise.

### GetScoreOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetScoreOk() (*int32, bool)`

GetScoreOk returns a tuple with the Score field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScore

`func (o *CoreCourseGetCourseModule200ResponseCm) SetScore(v int32)`

SetScore sets Score field to given value.

### HasScore

`func (o *CoreCourseGetCourseModule200ResponseCm) HasScore() bool`

HasScore returns a boolean if a field has been set.

### GetSection

`func (o *CoreCourseGetCourseModule200ResponseCm) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *CoreCourseGetCourseModule200ResponseCm) SetSection(v int32)`

SetSection sets Section field to given value.


### GetSectionnum

`func (o *CoreCourseGetCourseModule200ResponseCm) GetSectionnum() int32`

GetSectionnum returns the Sectionnum field if non-nil, zero value otherwise.

### GetSectionnumOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetSectionnumOk() (*int32, bool)`

GetSectionnumOk returns a tuple with the Sectionnum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSectionnum

`func (o *CoreCourseGetCourseModule200ResponseCm) SetSectionnum(v int32)`

SetSectionnum sets Sectionnum field to given value.


### GetShowdescription

`func (o *CoreCourseGetCourseModule200ResponseCm) GetShowdescription() int32`

GetShowdescription returns the Showdescription field if non-nil, zero value otherwise.

### GetShowdescriptionOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetShowdescriptionOk() (*int32, bool)`

GetShowdescriptionOk returns a tuple with the Showdescription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowdescription

`func (o *CoreCourseGetCourseModule200ResponseCm) SetShowdescription(v int32)`

SetShowdescription sets Showdescription field to given value.

### HasShowdescription

`func (o *CoreCourseGetCourseModule200ResponseCm) HasShowdescription() bool`

HasShowdescription returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCourseGetCourseModule200ResponseCm) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCourseGetCourseModule200ResponseCm) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCourseGetCourseModule200ResponseCm) HasVisible() bool`

HasVisible returns a boolean if a field has been set.

### GetVisibleold

`func (o *CoreCourseGetCourseModule200ResponseCm) GetVisibleold() int32`

GetVisibleold returns the Visibleold field if non-nil, zero value otherwise.

### GetVisibleoldOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetVisibleoldOk() (*int32, bool)`

GetVisibleoldOk returns a tuple with the Visibleold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisibleold

`func (o *CoreCourseGetCourseModule200ResponseCm) SetVisibleold(v int32)`

SetVisibleold sets Visibleold field to given value.

### HasVisibleold

`func (o *CoreCourseGetCourseModule200ResponseCm) HasVisibleold() bool`

HasVisibleold returns a boolean if a field has been set.

### GetVisibleoncoursepage

`func (o *CoreCourseGetCourseModule200ResponseCm) GetVisibleoncoursepage() int32`

GetVisibleoncoursepage returns the Visibleoncoursepage field if non-nil, zero value otherwise.

### GetVisibleoncoursepageOk

`func (o *CoreCourseGetCourseModule200ResponseCm) GetVisibleoncoursepageOk() (*int32, bool)`

GetVisibleoncoursepageOk returns a tuple with the Visibleoncoursepage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisibleoncoursepage

`func (o *CoreCourseGetCourseModule200ResponseCm) SetVisibleoncoursepage(v int32)`

SetVisibleoncoursepage sets Visibleoncoursepage field to given value.

### HasVisibleoncoursepage

`func (o *CoreCourseGetCourseModule200ResponseCm) HasVisibleoncoursepage() bool`

HasVisibleoncoursepage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


