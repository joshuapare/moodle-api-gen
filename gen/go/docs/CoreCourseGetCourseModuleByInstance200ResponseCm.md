# CoreCourseGetCourseModuleByInstance200ResponseCm

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Added** | Pointer to **int32** | Time added | [optional] 
**Advancedgrading** | Pointer to [**[]CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner**](CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner.md) |  | [optional] 
**Availability** | Pointer to **string** | Availability settings | [optional] 
**Completion** | **int32** | If completion is enabled | 
**Completionexpected** | Pointer to **int32** | Completion time expected | [optional] 
**Completiongradeitemnumber** | Pointer to **int32** | Completion grade item | [optional] 
**Completionpassgrade** | Pointer to **int32** | Completion pass grade setting | [optional] 
**Completionview** | Pointer to **int32** | Completion view setting | [optional] 
**Course** | **int32** | The course id | 
**Downloadcontent** | Pointer to **int32** | The download content value | [optional] 
**Grade** | Pointer to **float32** | Grade (max value or scale id) | [optional] 
**Gradecat** | Pointer to **int32** | Grade category | [optional] 
**Gradepass** | Pointer to **string** | Grade to pass (float) | [optional] 
**Groupingid** | **int32** | Grouping id | 
**Groupmode** | **int32** | Group mode | 
**Id** | **int32** | The course module id | 
**Idnumber** | Pointer to **string** | Module id number | [optional] 
**Indent** | Pointer to **int32** | Indentation | [optional] 
**Instance** | **int32** | The activity instance id | 
**Modname** | **string** | The module component name (forum, assign, etc..) | 
**Module** | **int32** | The module type id | 
**Name** | **string** | The activity name | 
**Outcomes** | Pointer to [**[]CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner**](CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner.md) |  | [optional] 
**Scale** | Pointer to **string** | Scale items (if used) | [optional] 
**Score** | Pointer to **int32** | Score | [optional] 
**Section** | **int32** | The module section id | 
**Sectionnum** | **int32** | The module section number | 
**Showdescription** | Pointer to **int32** | If the description is showed | [optional] 
**Visible** | Pointer to **int32** | If visible | [optional] 
**Visibleold** | Pointer to **int32** | Visible old | [optional] 
**Visibleoncoursepage** | Pointer to **int32** | If visible on course page | [optional] 

## Methods

### NewCoreCourseGetCourseModuleByInstance200ResponseCm

`func NewCoreCourseGetCourseModuleByInstance200ResponseCm(completion int32, course int32, groupingid int32, groupmode int32, id int32, instance int32, modname string, module int32, name string, section int32, sectionnum int32, ) *CoreCourseGetCourseModuleByInstance200ResponseCm`

NewCoreCourseGetCourseModuleByInstance200ResponseCm instantiates a new CoreCourseGetCourseModuleByInstance200ResponseCm object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetCourseModuleByInstance200ResponseCmWithDefaults

`func NewCoreCourseGetCourseModuleByInstance200ResponseCmWithDefaults() *CoreCourseGetCourseModuleByInstance200ResponseCm`

NewCoreCourseGetCourseModuleByInstance200ResponseCmWithDefaults instantiates a new CoreCourseGetCourseModuleByInstance200ResponseCm object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdded

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetAdded() int32`

GetAdded returns the Added field if non-nil, zero value otherwise.

### GetAddedOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetAddedOk() (*int32, bool)`

GetAddedOk returns a tuple with the Added field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdded

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetAdded(v int32)`

SetAdded sets Added field to given value.

### HasAdded

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasAdded() bool`

HasAdded returns a boolean if a field has been set.

### GetAdvancedgrading

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetAdvancedgrading() []CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner`

GetAdvancedgrading returns the Advancedgrading field if non-nil, zero value otherwise.

### GetAdvancedgradingOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetAdvancedgradingOk() (*[]CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner, bool)`

GetAdvancedgradingOk returns a tuple with the Advancedgrading field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdvancedgrading

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetAdvancedgrading(v []CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner)`

SetAdvancedgrading sets Advancedgrading field to given value.

### HasAdvancedgrading

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasAdvancedgrading() bool`

HasAdvancedgrading returns a boolean if a field has been set.

### GetAvailability

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetAvailability() string`

GetAvailability returns the Availability field if non-nil, zero value otherwise.

### GetAvailabilityOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetAvailabilityOk() (*string, bool)`

GetAvailabilityOk returns a tuple with the Availability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailability

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetAvailability(v string)`

SetAvailability sets Availability field to given value.

### HasAvailability

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasAvailability() bool`

HasAvailability returns a boolean if a field has been set.

### GetCompletion

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetCompletion() int32`

GetCompletion returns the Completion field if non-nil, zero value otherwise.

### GetCompletionOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetCompletionOk() (*int32, bool)`

GetCompletionOk returns a tuple with the Completion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletion

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetCompletion(v int32)`

SetCompletion sets Completion field to given value.


### GetCompletionexpected

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetCompletionexpected() int32`

GetCompletionexpected returns the Completionexpected field if non-nil, zero value otherwise.

### GetCompletionexpectedOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetCompletionexpectedOk() (*int32, bool)`

GetCompletionexpectedOk returns a tuple with the Completionexpected field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionexpected

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetCompletionexpected(v int32)`

SetCompletionexpected sets Completionexpected field to given value.

### HasCompletionexpected

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasCompletionexpected() bool`

HasCompletionexpected returns a boolean if a field has been set.

### GetCompletiongradeitemnumber

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetCompletiongradeitemnumber() int32`

GetCompletiongradeitemnumber returns the Completiongradeitemnumber field if non-nil, zero value otherwise.

### GetCompletiongradeitemnumberOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetCompletiongradeitemnumberOk() (*int32, bool)`

GetCompletiongradeitemnumberOk returns a tuple with the Completiongradeitemnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletiongradeitemnumber

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetCompletiongradeitemnumber(v int32)`

SetCompletiongradeitemnumber sets Completiongradeitemnumber field to given value.

### HasCompletiongradeitemnumber

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasCompletiongradeitemnumber() bool`

HasCompletiongradeitemnumber returns a boolean if a field has been set.

### GetCompletionpassgrade

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetCompletionpassgrade() int32`

GetCompletionpassgrade returns the Completionpassgrade field if non-nil, zero value otherwise.

### GetCompletionpassgradeOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetCompletionpassgradeOk() (*int32, bool)`

GetCompletionpassgradeOk returns a tuple with the Completionpassgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionpassgrade

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetCompletionpassgrade(v int32)`

SetCompletionpassgrade sets Completionpassgrade field to given value.

### HasCompletionpassgrade

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasCompletionpassgrade() bool`

HasCompletionpassgrade returns a boolean if a field has been set.

### GetCompletionview

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetCompletionview() int32`

GetCompletionview returns the Completionview field if non-nil, zero value otherwise.

### GetCompletionviewOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetCompletionviewOk() (*int32, bool)`

GetCompletionviewOk returns a tuple with the Completionview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionview

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetCompletionview(v int32)`

SetCompletionview sets Completionview field to given value.

### HasCompletionview

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasCompletionview() bool`

HasCompletionview returns a boolean if a field has been set.

### GetCourse

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetCourse(v int32)`

SetCourse sets Course field to given value.


### GetDownloadcontent

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetDownloadcontent() int32`

GetDownloadcontent returns the Downloadcontent field if non-nil, zero value otherwise.

### GetDownloadcontentOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetDownloadcontentOk() (*int32, bool)`

GetDownloadcontentOk returns a tuple with the Downloadcontent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDownloadcontent

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetDownloadcontent(v int32)`

SetDownloadcontent sets Downloadcontent field to given value.

### HasDownloadcontent

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasDownloadcontent() bool`

HasDownloadcontent returns a boolean if a field has been set.

### GetGrade

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetGrade() float32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetGradeOk() (*float32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetGrade(v float32)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetGradecat

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetGradecat() int32`

GetGradecat returns the Gradecat field if non-nil, zero value otherwise.

### GetGradecatOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetGradecatOk() (*int32, bool)`

GetGradecatOk returns a tuple with the Gradecat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradecat

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetGradecat(v int32)`

SetGradecat sets Gradecat field to given value.

### HasGradecat

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasGradecat() bool`

HasGradecat returns a boolean if a field has been set.

### GetGradepass

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetGradepass() string`

GetGradepass returns the Gradepass field if non-nil, zero value otherwise.

### GetGradepassOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetGradepassOk() (*string, bool)`

GetGradepassOk returns a tuple with the Gradepass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradepass

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetGradepass(v string)`

SetGradepass sets Gradepass field to given value.

### HasGradepass

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasGradepass() bool`

HasGradepass returns a boolean if a field has been set.

### GetGroupingid

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.


### GetGroupmode

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.


### GetId

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetId(v int32)`

SetId sets Id field to given value.


### GetIdnumber

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetIndent

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetIndent() int32`

GetIndent returns the Indent field if non-nil, zero value otherwise.

### GetIndentOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetIndentOk() (*int32, bool)`

GetIndentOk returns a tuple with the Indent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndent

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetIndent(v int32)`

SetIndent sets Indent field to given value.

### HasIndent

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasIndent() bool`

HasIndent returns a boolean if a field has been set.

### GetInstance

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetInstance() int32`

GetInstance returns the Instance field if non-nil, zero value otherwise.

### GetInstanceOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetInstanceOk() (*int32, bool)`

GetInstanceOk returns a tuple with the Instance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstance

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetInstance(v int32)`

SetInstance sets Instance field to given value.


### GetModname

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetModname() string`

GetModname returns the Modname field if non-nil, zero value otherwise.

### GetModnameOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetModnameOk() (*string, bool)`

GetModnameOk returns a tuple with the Modname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModname

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetModname(v string)`

SetModname sets Modname field to given value.


### GetModule

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetModule() int32`

GetModule returns the Module field if non-nil, zero value otherwise.

### GetModuleOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetModuleOk() (*int32, bool)`

GetModuleOk returns a tuple with the Module field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModule

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetModule(v int32)`

SetModule sets Module field to given value.


### GetName

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetName(v string)`

SetName sets Name field to given value.


### GetOutcomes

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetOutcomes() []CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner`

GetOutcomes returns the Outcomes field if non-nil, zero value otherwise.

### GetOutcomesOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetOutcomesOk() (*[]CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner, bool)`

GetOutcomesOk returns a tuple with the Outcomes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutcomes

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetOutcomes(v []CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner)`

SetOutcomes sets Outcomes field to given value.

### HasOutcomes

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasOutcomes() bool`

HasOutcomes returns a boolean if a field has been set.

### GetScale

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetScale() string`

GetScale returns the Scale field if non-nil, zero value otherwise.

### GetScaleOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetScaleOk() (*string, bool)`

GetScaleOk returns a tuple with the Scale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScale

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetScale(v string)`

SetScale sets Scale field to given value.

### HasScale

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasScale() bool`

HasScale returns a boolean if a field has been set.

### GetScore

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetScore() int32`

GetScore returns the Score field if non-nil, zero value otherwise.

### GetScoreOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetScoreOk() (*int32, bool)`

GetScoreOk returns a tuple with the Score field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScore

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetScore(v int32)`

SetScore sets Score field to given value.

### HasScore

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasScore() bool`

HasScore returns a boolean if a field has been set.

### GetSection

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetSection(v int32)`

SetSection sets Section field to given value.


### GetSectionnum

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetSectionnum() int32`

GetSectionnum returns the Sectionnum field if non-nil, zero value otherwise.

### GetSectionnumOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetSectionnumOk() (*int32, bool)`

GetSectionnumOk returns a tuple with the Sectionnum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSectionnum

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetSectionnum(v int32)`

SetSectionnum sets Sectionnum field to given value.


### GetShowdescription

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetShowdescription() int32`

GetShowdescription returns the Showdescription field if non-nil, zero value otherwise.

### GetShowdescriptionOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetShowdescriptionOk() (*int32, bool)`

GetShowdescriptionOk returns a tuple with the Showdescription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowdescription

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetShowdescription(v int32)`

SetShowdescription sets Showdescription field to given value.

### HasShowdescription

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasShowdescription() bool`

HasShowdescription returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasVisible() bool`

HasVisible returns a boolean if a field has been set.

### GetVisibleold

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetVisibleold() int32`

GetVisibleold returns the Visibleold field if non-nil, zero value otherwise.

### GetVisibleoldOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetVisibleoldOk() (*int32, bool)`

GetVisibleoldOk returns a tuple with the Visibleold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisibleold

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetVisibleold(v int32)`

SetVisibleold sets Visibleold field to given value.

### HasVisibleold

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasVisibleold() bool`

HasVisibleold returns a boolean if a field has been set.

### GetVisibleoncoursepage

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetVisibleoncoursepage() int32`

GetVisibleoncoursepage returns the Visibleoncoursepage field if non-nil, zero value otherwise.

### GetVisibleoncoursepageOk

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) GetVisibleoncoursepageOk() (*int32, bool)`

GetVisibleoncoursepageOk returns a tuple with the Visibleoncoursepage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisibleoncoursepage

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) SetVisibleoncoursepage(v int32)`

SetVisibleoncoursepage sets Visibleoncoursepage field to given value.

### HasVisibleoncoursepage

`func (o *CoreCourseGetCourseModuleByInstance200ResponseCm) HasVisibleoncoursepage() bool`

HasVisibleoncoursepage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


