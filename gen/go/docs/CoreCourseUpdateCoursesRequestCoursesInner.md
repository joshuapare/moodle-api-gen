# CoreCourseUpdateCoursesRequestCoursesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryid** | Pointer to **int32** | category id | [optional] 
**Completionnotify** | Pointer to **int32** | 1: yes 0: no | [optional] 
**Courseformatoptions** | Pointer to [**[]CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner**](CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner.md) |  | [optional] 
**Customfields** | Pointer to [**[]CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**Defaultgroupingid** | Pointer to **int32** | default grouping id | [optional] 
**Enablecompletion** | Pointer to **int32** | Enabled, control via completion and activity settings. Disabled,                                         not shown in activity settings. | [optional] 
**Enddate** | Pointer to **int32** | timestamp when the course end | [optional] 
**Forcetheme** | Pointer to **string** | name of the force theme | [optional] 
**Format** | Pointer to **string** | course format: weeks, topics, social, site,.. | [optional] [default to "null"]
**Fullname** | Pointer to **string** | full name | [optional] 
**Groupmode** | Pointer to **int32** | no group, separate, visible | [optional] 
**Groupmodeforce** | Pointer to **int32** | 1: yes, 0: no | [optional] 
**Hiddensections** | Pointer to **int32** | (deprecated, use courseformatoptions) How the hidden sections in the course are                                         displayed to students | [optional] [default to null]
**Id** | Pointer to **int32** | ID of the course | [optional] 
**Idnumber** | Pointer to **string** | id number | [optional] 
**Lang** | Pointer to **string** | forced course language | [optional] 
**Maxbytes** | Pointer to **int32** | largest size of file that can be uploaded into the course | [optional] [default to null]
**Newsitems** | Pointer to **int32** | number of recent items appearing on the course page | [optional] [default to null]
**Numsections** | Pointer to **int32** | (deprecated, use courseformatoptions) number of weeks/topics | [optional] 
**Shortname** | Pointer to **string** | course short name | [optional] 
**Showgrades** | Pointer to **int32** | 1 if grades are shown, otherwise 0 | [optional] 
**Showreports** | Pointer to **int32** | are activity report shown (yes &#x3D; 1, no &#x3D;0) | [optional] [default to null]
**Startdate** | Pointer to **int32** | timestamp when the course start | [optional] 
**Summary** | Pointer to **string** | summary | [optional] 
**Summaryformat** | Pointer to **int32** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Visible** | Pointer to **int32** | 1: available to student, 0:not available | [optional] 

## Methods

### NewCoreCourseUpdateCoursesRequestCoursesInner

`func NewCoreCourseUpdateCoursesRequestCoursesInner() *CoreCourseUpdateCoursesRequestCoursesInner`

NewCoreCourseUpdateCoursesRequestCoursesInner instantiates a new CoreCourseUpdateCoursesRequestCoursesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseUpdateCoursesRequestCoursesInnerWithDefaults

`func NewCoreCourseUpdateCoursesRequestCoursesInnerWithDefaults() *CoreCourseUpdateCoursesRequestCoursesInner`

NewCoreCourseUpdateCoursesRequestCoursesInnerWithDefaults instantiates a new CoreCourseUpdateCoursesRequestCoursesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryid

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetCompletionnotify

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetCompletionnotify() int32`

GetCompletionnotify returns the Completionnotify field if non-nil, zero value otherwise.

### GetCompletionnotifyOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetCompletionnotifyOk() (*int32, bool)`

GetCompletionnotifyOk returns a tuple with the Completionnotify field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionnotify

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetCompletionnotify(v int32)`

SetCompletionnotify sets Completionnotify field to given value.

### HasCompletionnotify

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasCompletionnotify() bool`

HasCompletionnotify returns a boolean if a field has been set.

### GetCourseformatoptions

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetCourseformatoptions() []CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner`

GetCourseformatoptions returns the Courseformatoptions field if non-nil, zero value otherwise.

### GetCourseformatoptionsOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetCourseformatoptionsOk() (*[]CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner, bool)`

GetCourseformatoptionsOk returns a tuple with the Courseformatoptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseformatoptions

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetCourseformatoptions(v []CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner)`

SetCourseformatoptions sets Courseformatoptions field to given value.

### HasCourseformatoptions

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasCourseformatoptions() bool`

HasCourseformatoptions returns a boolean if a field has been set.

### GetCustomfields

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetCustomfields() []CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner`

GetCustomfields returns the Customfields field if non-nil, zero value otherwise.

### GetCustomfieldsOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetCustomfieldsOk() (*[]CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner, bool)`

GetCustomfieldsOk returns a tuple with the Customfields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfields

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetCustomfields(v []CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner)`

SetCustomfields sets Customfields field to given value.

### HasCustomfields

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasCustomfields() bool`

HasCustomfields returns a boolean if a field has been set.

### GetDefaultgroupingid

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetDefaultgroupingid() int32`

GetDefaultgroupingid returns the Defaultgroupingid field if non-nil, zero value otherwise.

### GetDefaultgroupingidOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetDefaultgroupingidOk() (*int32, bool)`

GetDefaultgroupingidOk returns a tuple with the Defaultgroupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultgroupingid

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetDefaultgroupingid(v int32)`

SetDefaultgroupingid sets Defaultgroupingid field to given value.

### HasDefaultgroupingid

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasDefaultgroupingid() bool`

HasDefaultgroupingid returns a boolean if a field has been set.

### GetEnablecompletion

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetEnablecompletion() int32`

GetEnablecompletion returns the Enablecompletion field if non-nil, zero value otherwise.

### GetEnablecompletionOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetEnablecompletionOk() (*int32, bool)`

GetEnablecompletionOk returns a tuple with the Enablecompletion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnablecompletion

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetEnablecompletion(v int32)`

SetEnablecompletion sets Enablecompletion field to given value.

### HasEnablecompletion

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasEnablecompletion() bool`

HasEnablecompletion returns a boolean if a field has been set.

### GetEnddate

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetEnddate() int32`

GetEnddate returns the Enddate field if non-nil, zero value otherwise.

### GetEnddateOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetEnddateOk() (*int32, bool)`

GetEnddateOk returns a tuple with the Enddate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnddate

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetEnddate(v int32)`

SetEnddate sets Enddate field to given value.

### HasEnddate

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasEnddate() bool`

HasEnddate returns a boolean if a field has been set.

### GetForcetheme

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetForcetheme() string`

GetForcetheme returns the Forcetheme field if non-nil, zero value otherwise.

### GetForcethemeOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetForcethemeOk() (*string, bool)`

GetForcethemeOk returns a tuple with the Forcetheme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForcetheme

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetForcetheme(v string)`

SetForcetheme sets Forcetheme field to given value.

### HasForcetheme

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasForcetheme() bool`

HasForcetheme returns a boolean if a field has been set.

### GetFormat

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetFormat() string`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetFormatOk() (*string, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetFormat(v string)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetFullname

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetFullname() string`

GetFullname returns the Fullname field if non-nil, zero value otherwise.

### GetFullnameOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetFullnameOk() (*string, bool)`

GetFullnameOk returns a tuple with the Fullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullname

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetFullname(v string)`

SetFullname sets Fullname field to given value.

### HasFullname

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasFullname() bool`

HasFullname returns a boolean if a field has been set.

### GetGroupmode

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetGroupmodeforce

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetGroupmodeforce() int32`

GetGroupmodeforce returns the Groupmodeforce field if non-nil, zero value otherwise.

### GetGroupmodeforceOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetGroupmodeforceOk() (*int32, bool)`

GetGroupmodeforceOk returns a tuple with the Groupmodeforce field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmodeforce

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetGroupmodeforce(v int32)`

SetGroupmodeforce sets Groupmodeforce field to given value.

### HasGroupmodeforce

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasGroupmodeforce() bool`

HasGroupmodeforce returns a boolean if a field has been set.

### GetHiddensections

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetHiddensections() int32`

GetHiddensections returns the Hiddensections field if non-nil, zero value otherwise.

### GetHiddensectionsOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetHiddensectionsOk() (*int32, bool)`

GetHiddensectionsOk returns a tuple with the Hiddensections field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHiddensections

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetHiddensections(v int32)`

SetHiddensections sets Hiddensections field to given value.

### HasHiddensections

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasHiddensections() bool`

HasHiddensections returns a boolean if a field has been set.

### GetId

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetLang

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetMaxbytes

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetMaxbytes() int32`

GetMaxbytes returns the Maxbytes field if non-nil, zero value otherwise.

### GetMaxbytesOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetMaxbytesOk() (*int32, bool)`

GetMaxbytesOk returns a tuple with the Maxbytes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxbytes

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetMaxbytes(v int32)`

SetMaxbytes sets Maxbytes field to given value.

### HasMaxbytes

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasMaxbytes() bool`

HasMaxbytes returns a boolean if a field has been set.

### GetNewsitems

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetNewsitems() int32`

GetNewsitems returns the Newsitems field if non-nil, zero value otherwise.

### GetNewsitemsOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetNewsitemsOk() (*int32, bool)`

GetNewsitemsOk returns a tuple with the Newsitems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewsitems

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetNewsitems(v int32)`

SetNewsitems sets Newsitems field to given value.

### HasNewsitems

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasNewsitems() bool`

HasNewsitems returns a boolean if a field has been set.

### GetNumsections

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetNumsections() int32`

GetNumsections returns the Numsections field if non-nil, zero value otherwise.

### GetNumsectionsOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetNumsectionsOk() (*int32, bool)`

GetNumsectionsOk returns a tuple with the Numsections field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumsections

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetNumsections(v int32)`

SetNumsections sets Numsections field to given value.

### HasNumsections

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasNumsections() bool`

HasNumsections returns a boolean if a field has been set.

### GetShortname

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetShortname(v string)`

SetShortname sets Shortname field to given value.

### HasShortname

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasShortname() bool`

HasShortname returns a boolean if a field has been set.

### GetShowgrades

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetShowgrades() int32`

GetShowgrades returns the Showgrades field if non-nil, zero value otherwise.

### GetShowgradesOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetShowgradesOk() (*int32, bool)`

GetShowgradesOk returns a tuple with the Showgrades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowgrades

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetShowgrades(v int32)`

SetShowgrades sets Showgrades field to given value.

### HasShowgrades

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasShowgrades() bool`

HasShowgrades returns a boolean if a field has been set.

### GetShowreports

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetShowreports() int32`

GetShowreports returns the Showreports field if non-nil, zero value otherwise.

### GetShowreportsOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetShowreportsOk() (*int32, bool)`

GetShowreportsOk returns a tuple with the Showreports field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowreports

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetShowreports(v int32)`

SetShowreports sets Showreports field to given value.

### HasShowreports

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasShowreports() bool`

HasShowreports returns a boolean if a field has been set.

### GetStartdate

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetStartdate() int32`

GetStartdate returns the Startdate field if non-nil, zero value otherwise.

### GetStartdateOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetStartdateOk() (*int32, bool)`

GetStartdateOk returns a tuple with the Startdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartdate

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetStartdate(v int32)`

SetStartdate sets Startdate field to given value.

### HasStartdate

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasStartdate() bool`

HasStartdate returns a boolean if a field has been set.

### GetSummary

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetSummary() string`

GetSummary returns the Summary field if non-nil, zero value otherwise.

### GetSummaryOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetSummaryOk() (*string, bool)`

GetSummaryOk returns a tuple with the Summary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummary

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetSummary(v string)`

SetSummary sets Summary field to given value.

### HasSummary

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasSummary() bool`

HasSummary returns a boolean if a field has been set.

### GetSummaryformat

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetSummaryformat() int32`

GetSummaryformat returns the Summaryformat field if non-nil, zero value otherwise.

### GetSummaryformatOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetSummaryformatOk() (*int32, bool)`

GetSummaryformatOk returns a tuple with the Summaryformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryformat

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetSummaryformat(v int32)`

SetSummaryformat sets Summaryformat field to given value.

### HasSummaryformat

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasSummaryformat() bool`

HasSummaryformat returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCourseUpdateCoursesRequestCoursesInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


