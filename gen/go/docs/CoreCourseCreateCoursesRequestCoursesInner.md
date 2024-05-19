# CoreCourseCreateCoursesRequestCoursesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryid** | Pointer to **int32** | category id | [optional] [default to null]
**Completionnotify** | Pointer to **int32** | 1: yes 0: no | [optional] [default to null]
**Courseformatoptions** | Pointer to [**[]CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner**](CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner.md) |  | [optional] 
**Customfields** | Pointer to [**[]CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**Defaultgroupingid** | Pointer to **int32** | default grouping id | [optional] [default to 0]
**Enablecompletion** | Pointer to **int32** | Enabled, control via completion and activity settings. Disabled,                                         not shown in activity settings. | [optional] [default to null]
**Enddate** | Pointer to **int32** | timestamp when the course end | [optional] [default to null]
**Forcetheme** | Pointer to **string** | name of the force theme | [optional] [default to "null"]
**Format** | Pointer to **string** | course format: weeks, topics, social, site,.. | [optional] [default to "topics"]
**Fullname** | Pointer to **string** | full name | [optional] [default to "null"]
**Groupmode** | Pointer to **int32** | no group, separate, visible | [optional] [default to 0]
**Groupmodeforce** | Pointer to **int32** | 1: yes, 0: no | [optional] [default to 0]
**Hiddensections** | Pointer to **int32** | (deprecated, use courseformatoptions) How the hidden sections in the course are displayed to students | [optional] [default to null]
**Idnumber** | Pointer to **string** | id number | [optional] [default to "null"]
**Lang** | Pointer to **string** | forced course language | [optional] [default to "null"]
**Maxbytes** | Pointer to **int32** | largest size of file that can be uploaded into the course | [optional] [default to 0]
**Newsitems** | Pointer to **int32** | number of recent items appearing on the course page | [optional] [default to 5]
**Numsections** | Pointer to **int32** | (deprecated, use courseformatoptions) number of weeks/topics | [optional] [default to null]
**Shortname** | Pointer to **string** | course short name | [optional] [default to "null"]
**Showgrades** | Pointer to **int32** | 1 if grades are shown, otherwise 0 | [optional] [default to 1]
**Showreports** | Pointer to **int32** | are activity report shown (yes &#x3D; 1, no &#x3D;0) | [optional] [default to 0]
**Startdate** | Pointer to **int32** | timestamp when the course start | [optional] [default to null]
**Summary** | Pointer to **string** | summary | [optional] 
**Summaryformat** | Pointer to **int32** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Visible** | Pointer to **int32** | 1: available to student, 0:not available | [optional] [default to null]

## Methods

### NewCoreCourseCreateCoursesRequestCoursesInner

`func NewCoreCourseCreateCoursesRequestCoursesInner() *CoreCourseCreateCoursesRequestCoursesInner`

NewCoreCourseCreateCoursesRequestCoursesInner instantiates a new CoreCourseCreateCoursesRequestCoursesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseCreateCoursesRequestCoursesInnerWithDefaults

`func NewCoreCourseCreateCoursesRequestCoursesInnerWithDefaults() *CoreCourseCreateCoursesRequestCoursesInner`

NewCoreCourseCreateCoursesRequestCoursesInnerWithDefaults instantiates a new CoreCourseCreateCoursesRequestCoursesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryid

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetCompletionnotify

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetCompletionnotify() int32`

GetCompletionnotify returns the Completionnotify field if non-nil, zero value otherwise.

### GetCompletionnotifyOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetCompletionnotifyOk() (*int32, bool)`

GetCompletionnotifyOk returns a tuple with the Completionnotify field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionnotify

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetCompletionnotify(v int32)`

SetCompletionnotify sets Completionnotify field to given value.

### HasCompletionnotify

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasCompletionnotify() bool`

HasCompletionnotify returns a boolean if a field has been set.

### GetCourseformatoptions

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetCourseformatoptions() []CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner`

GetCourseformatoptions returns the Courseformatoptions field if non-nil, zero value otherwise.

### GetCourseformatoptionsOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetCourseformatoptionsOk() (*[]CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner, bool)`

GetCourseformatoptionsOk returns a tuple with the Courseformatoptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseformatoptions

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetCourseformatoptions(v []CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner)`

SetCourseformatoptions sets Courseformatoptions field to given value.

### HasCourseformatoptions

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasCourseformatoptions() bool`

HasCourseformatoptions returns a boolean if a field has been set.

### GetCustomfields

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetCustomfields() []CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner`

GetCustomfields returns the Customfields field if non-nil, zero value otherwise.

### GetCustomfieldsOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetCustomfieldsOk() (*[]CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner, bool)`

GetCustomfieldsOk returns a tuple with the Customfields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfields

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetCustomfields(v []CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner)`

SetCustomfields sets Customfields field to given value.

### HasCustomfields

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasCustomfields() bool`

HasCustomfields returns a boolean if a field has been set.

### GetDefaultgroupingid

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetDefaultgroupingid() int32`

GetDefaultgroupingid returns the Defaultgroupingid field if non-nil, zero value otherwise.

### GetDefaultgroupingidOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetDefaultgroupingidOk() (*int32, bool)`

GetDefaultgroupingidOk returns a tuple with the Defaultgroupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultgroupingid

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetDefaultgroupingid(v int32)`

SetDefaultgroupingid sets Defaultgroupingid field to given value.

### HasDefaultgroupingid

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasDefaultgroupingid() bool`

HasDefaultgroupingid returns a boolean if a field has been set.

### GetEnablecompletion

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetEnablecompletion() int32`

GetEnablecompletion returns the Enablecompletion field if non-nil, zero value otherwise.

### GetEnablecompletionOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetEnablecompletionOk() (*int32, bool)`

GetEnablecompletionOk returns a tuple with the Enablecompletion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnablecompletion

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetEnablecompletion(v int32)`

SetEnablecompletion sets Enablecompletion field to given value.

### HasEnablecompletion

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasEnablecompletion() bool`

HasEnablecompletion returns a boolean if a field has been set.

### GetEnddate

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetEnddate() int32`

GetEnddate returns the Enddate field if non-nil, zero value otherwise.

### GetEnddateOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetEnddateOk() (*int32, bool)`

GetEnddateOk returns a tuple with the Enddate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnddate

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetEnddate(v int32)`

SetEnddate sets Enddate field to given value.

### HasEnddate

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasEnddate() bool`

HasEnddate returns a boolean if a field has been set.

### GetForcetheme

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetForcetheme() string`

GetForcetheme returns the Forcetheme field if non-nil, zero value otherwise.

### GetForcethemeOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetForcethemeOk() (*string, bool)`

GetForcethemeOk returns a tuple with the Forcetheme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForcetheme

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetForcetheme(v string)`

SetForcetheme sets Forcetheme field to given value.

### HasForcetheme

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasForcetheme() bool`

HasForcetheme returns a boolean if a field has been set.

### GetFormat

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetFormat() string`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetFormatOk() (*string, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetFormat(v string)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetFullname

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetFullname() string`

GetFullname returns the Fullname field if non-nil, zero value otherwise.

### GetFullnameOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetFullnameOk() (*string, bool)`

GetFullnameOk returns a tuple with the Fullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullname

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetFullname(v string)`

SetFullname sets Fullname field to given value.

### HasFullname

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasFullname() bool`

HasFullname returns a boolean if a field has been set.

### GetGroupmode

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetGroupmodeforce

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetGroupmodeforce() int32`

GetGroupmodeforce returns the Groupmodeforce field if non-nil, zero value otherwise.

### GetGroupmodeforceOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetGroupmodeforceOk() (*int32, bool)`

GetGroupmodeforceOk returns a tuple with the Groupmodeforce field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmodeforce

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetGroupmodeforce(v int32)`

SetGroupmodeforce sets Groupmodeforce field to given value.

### HasGroupmodeforce

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasGroupmodeforce() bool`

HasGroupmodeforce returns a boolean if a field has been set.

### GetHiddensections

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetHiddensections() int32`

GetHiddensections returns the Hiddensections field if non-nil, zero value otherwise.

### GetHiddensectionsOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetHiddensectionsOk() (*int32, bool)`

GetHiddensectionsOk returns a tuple with the Hiddensections field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHiddensections

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetHiddensections(v int32)`

SetHiddensections sets Hiddensections field to given value.

### HasHiddensections

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasHiddensections() bool`

HasHiddensections returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetLang

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetMaxbytes

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetMaxbytes() int32`

GetMaxbytes returns the Maxbytes field if non-nil, zero value otherwise.

### GetMaxbytesOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetMaxbytesOk() (*int32, bool)`

GetMaxbytesOk returns a tuple with the Maxbytes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxbytes

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetMaxbytes(v int32)`

SetMaxbytes sets Maxbytes field to given value.

### HasMaxbytes

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasMaxbytes() bool`

HasMaxbytes returns a boolean if a field has been set.

### GetNewsitems

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetNewsitems() int32`

GetNewsitems returns the Newsitems field if non-nil, zero value otherwise.

### GetNewsitemsOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetNewsitemsOk() (*int32, bool)`

GetNewsitemsOk returns a tuple with the Newsitems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewsitems

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetNewsitems(v int32)`

SetNewsitems sets Newsitems field to given value.

### HasNewsitems

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasNewsitems() bool`

HasNewsitems returns a boolean if a field has been set.

### GetNumsections

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetNumsections() int32`

GetNumsections returns the Numsections field if non-nil, zero value otherwise.

### GetNumsectionsOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetNumsectionsOk() (*int32, bool)`

GetNumsectionsOk returns a tuple with the Numsections field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumsections

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetNumsections(v int32)`

SetNumsections sets Numsections field to given value.

### HasNumsections

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasNumsections() bool`

HasNumsections returns a boolean if a field has been set.

### GetShortname

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetShortname(v string)`

SetShortname sets Shortname field to given value.

### HasShortname

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasShortname() bool`

HasShortname returns a boolean if a field has been set.

### GetShowgrades

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetShowgrades() int32`

GetShowgrades returns the Showgrades field if non-nil, zero value otherwise.

### GetShowgradesOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetShowgradesOk() (*int32, bool)`

GetShowgradesOk returns a tuple with the Showgrades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowgrades

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetShowgrades(v int32)`

SetShowgrades sets Showgrades field to given value.

### HasShowgrades

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasShowgrades() bool`

HasShowgrades returns a boolean if a field has been set.

### GetShowreports

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetShowreports() int32`

GetShowreports returns the Showreports field if non-nil, zero value otherwise.

### GetShowreportsOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetShowreportsOk() (*int32, bool)`

GetShowreportsOk returns a tuple with the Showreports field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowreports

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetShowreports(v int32)`

SetShowreports sets Showreports field to given value.

### HasShowreports

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasShowreports() bool`

HasShowreports returns a boolean if a field has been set.

### GetStartdate

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetStartdate() int32`

GetStartdate returns the Startdate field if non-nil, zero value otherwise.

### GetStartdateOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetStartdateOk() (*int32, bool)`

GetStartdateOk returns a tuple with the Startdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartdate

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetStartdate(v int32)`

SetStartdate sets Startdate field to given value.

### HasStartdate

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasStartdate() bool`

HasStartdate returns a boolean if a field has been set.

### GetSummary

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetSummary() string`

GetSummary returns the Summary field if non-nil, zero value otherwise.

### GetSummaryOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetSummaryOk() (*string, bool)`

GetSummaryOk returns a tuple with the Summary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummary

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetSummary(v string)`

SetSummary sets Summary field to given value.

### HasSummary

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasSummary() bool`

HasSummary returns a boolean if a field has been set.

### GetSummaryformat

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetSummaryformat() int32`

GetSummaryformat returns the Summaryformat field if non-nil, zero value otherwise.

### GetSummaryformatOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetSummaryformatOk() (*int32, bool)`

GetSummaryformatOk returns a tuple with the Summaryformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryformat

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetSummaryformat(v int32)`

SetSummaryformat sets Summaryformat field to given value.

### HasSummaryformat

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasSummaryformat() bool`

HasSummaryformat returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCourseCreateCoursesRequestCoursesInner) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCourseCreateCoursesRequestCoursesInner) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCourseCreateCoursesRequestCoursesInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


