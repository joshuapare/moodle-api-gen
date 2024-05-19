# CoreCourseGetCoursesByField200ResponseCoursesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cacherev** | Pointer to **int32** | Cache revision number | [optional] [default to null]
**Calendartype** | Pointer to **string** | Calendar type | [optional] [default to "null"]
**Categoryid** | Pointer to **int32** | category id | [optional] 
**Categoryname** | Pointer to **string** | category name | [optional] [default to "null"]
**Completionnotify** | Pointer to **int32** | 1: yes 0: no | [optional] 
**Contacts** | Pointer to [**[]CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner**](CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner.md) |  | [optional] 
**Courseformatoptions** | Pointer to [**[]CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner**](CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner.md) |  | [optional] 
**Courseimage** | Pointer to **string** | Course image | [optional] [default to "null"]
**Customfields** | Pointer to [**[]CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner**](CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.md) |  | [optional] 
**Defaultgroupingid** | Pointer to **int32** | default grouping id | [optional] [default to null]
**Displayname** | Pointer to **string** | course display name | [optional] [default to "null"]
**Enablecompletion** | Pointer to **int32** | Completion enabled? 1: yes 0: no | [optional] [default to null]
**Enddate** | Pointer to **int32** | Timestamp when the course end | [optional] [default to null]
**Enrollmentmethods** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Filters** | Pointer to [**[]CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner**](CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.md) |  | [optional] 
**Format** | Pointer to **string** | Course format: weeks, topics, social, site,.. | [optional] [default to "null"]
**Fullname** | Pointer to **string** | course full name | [optional] [default to "null"]
**Groupmode** | Pointer to **int32** | no group, separate, visible | [optional] [default to null]
**Groupmodeforce** | Pointer to **int32** | 1: yes, 0: no | [optional] [default to null]
**Id** | Pointer to **int32** | course id | [optional] 
**Idnumber** | Pointer to **string** | Id number | [optional] [default to "null"]
**Lang** | Pointer to **string** | Forced course language | [optional] [default to "null"]
**Legacyfiles** | Pointer to **int32** | If legacy files are enabled | [optional] [default to null]
**Marker** | Pointer to **int32** | Current course marker | [optional] [default to null]
**Maxbytes** | Pointer to **int32** | Largest size of file that can be uploaded into | [optional] [default to null]
**Newsitems** | Pointer to **int32** | Number of recent items appearing on the course page | [optional] [default to null]
**Overviewfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Requested** | Pointer to **int32** | If is a requested course | [optional] [default to null]
**Shortname** | Pointer to **string** | course short name | [optional] 
**Showactivitydates** | Pointer to **bool** | Whether the activity dates are shown or not | [optional] [default to null]
**Showcompletionconditions** | Pointer to **bool** | Whether the activity completion conditions are shown or not | [optional] [default to null]
**Showgrades** | Pointer to **int32** | 1 if grades are shown, otherwise 0 | [optional] [default to null]
**Showreports** | Pointer to **int32** | Are activity report shown (yes &#x3D; 1, no &#x3D;0) | [optional] [default to null]
**Sortorder** | Pointer to **int32** | Sort order in the category | [optional] [default to null]
**Startdate** | Pointer to **int32** | Timestamp when the course start | [optional] [default to null]
**Summary** | Pointer to **string** | summary | [optional] 
**Summaryfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Summaryformat** | Pointer to **int32** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Theme** | Pointer to **string** | Fame of the forced theme | [optional] [default to "null"]
**Timecreated** | Pointer to **int32** | Time when the course was created | [optional] [default to null]
**Timemodified** | Pointer to **int32** | Last time  the course was updated | [optional] [default to null]
**Visible** | Pointer to **int32** | 1: available to student, 0:not available | [optional] 

## Methods

### NewCoreCourseGetCoursesByField200ResponseCoursesInner

`func NewCoreCourseGetCoursesByField200ResponseCoursesInner() *CoreCourseGetCoursesByField200ResponseCoursesInner`

NewCoreCourseGetCoursesByField200ResponseCoursesInner instantiates a new CoreCourseGetCoursesByField200ResponseCoursesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetCoursesByField200ResponseCoursesInnerWithDefaults

`func NewCoreCourseGetCoursesByField200ResponseCoursesInnerWithDefaults() *CoreCourseGetCoursesByField200ResponseCoursesInner`

NewCoreCourseGetCoursesByField200ResponseCoursesInnerWithDefaults instantiates a new CoreCourseGetCoursesByField200ResponseCoursesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCacherev

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetCacherev() int32`

GetCacherev returns the Cacherev field if non-nil, zero value otherwise.

### GetCacherevOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetCacherevOk() (*int32, bool)`

GetCacherevOk returns a tuple with the Cacherev field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCacherev

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetCacherev(v int32)`

SetCacherev sets Cacherev field to given value.

### HasCacherev

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasCacherev() bool`

HasCacherev returns a boolean if a field has been set.

### GetCalendartype

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetCalendartype() string`

GetCalendartype returns the Calendartype field if non-nil, zero value otherwise.

### GetCalendartypeOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetCalendartypeOk() (*string, bool)`

GetCalendartypeOk returns a tuple with the Calendartype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCalendartype

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetCalendartype(v string)`

SetCalendartype sets Calendartype field to given value.

### HasCalendartype

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasCalendartype() bool`

HasCalendartype returns a boolean if a field has been set.

### GetCategoryid

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetCategoryname

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetCategoryname() string`

GetCategoryname returns the Categoryname field if non-nil, zero value otherwise.

### GetCategorynameOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetCategorynameOk() (*string, bool)`

GetCategorynameOk returns a tuple with the Categoryname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryname

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetCategoryname(v string)`

SetCategoryname sets Categoryname field to given value.

### HasCategoryname

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasCategoryname() bool`

HasCategoryname returns a boolean if a field has been set.

### GetCompletionnotify

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetCompletionnotify() int32`

GetCompletionnotify returns the Completionnotify field if non-nil, zero value otherwise.

### GetCompletionnotifyOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetCompletionnotifyOk() (*int32, bool)`

GetCompletionnotifyOk returns a tuple with the Completionnotify field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionnotify

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetCompletionnotify(v int32)`

SetCompletionnotify sets Completionnotify field to given value.

### HasCompletionnotify

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasCompletionnotify() bool`

HasCompletionnotify returns a boolean if a field has been set.

### GetContacts

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetContacts() []CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner`

GetContacts returns the Contacts field if non-nil, zero value otherwise.

### GetContactsOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetContactsOk() (*[]CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner, bool)`

GetContactsOk returns a tuple with the Contacts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContacts

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetContacts(v []CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner)`

SetContacts sets Contacts field to given value.

### HasContacts

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasContacts() bool`

HasContacts returns a boolean if a field has been set.

### GetCourseformatoptions

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetCourseformatoptions() []CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner`

GetCourseformatoptions returns the Courseformatoptions field if non-nil, zero value otherwise.

### GetCourseformatoptionsOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetCourseformatoptionsOk() (*[]CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner, bool)`

GetCourseformatoptionsOk returns a tuple with the Courseformatoptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseformatoptions

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetCourseformatoptions(v []CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner)`

SetCourseformatoptions sets Courseformatoptions field to given value.

### HasCourseformatoptions

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasCourseformatoptions() bool`

HasCourseformatoptions returns a boolean if a field has been set.

### GetCourseimage

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetCourseimage() string`

GetCourseimage returns the Courseimage field if non-nil, zero value otherwise.

### GetCourseimageOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetCourseimageOk() (*string, bool)`

GetCourseimageOk returns a tuple with the Courseimage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseimage

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetCourseimage(v string)`

SetCourseimage sets Courseimage field to given value.

### HasCourseimage

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasCourseimage() bool`

HasCourseimage returns a boolean if a field has been set.

### GetCustomfields

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetCustomfields() []CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner`

GetCustomfields returns the Customfields field if non-nil, zero value otherwise.

### GetCustomfieldsOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetCustomfieldsOk() (*[]CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner, bool)`

GetCustomfieldsOk returns a tuple with the Customfields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfields

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetCustomfields(v []CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner)`

SetCustomfields sets Customfields field to given value.

### HasCustomfields

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasCustomfields() bool`

HasCustomfields returns a boolean if a field has been set.

### GetDefaultgroupingid

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetDefaultgroupingid() int32`

GetDefaultgroupingid returns the Defaultgroupingid field if non-nil, zero value otherwise.

### GetDefaultgroupingidOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetDefaultgroupingidOk() (*int32, bool)`

GetDefaultgroupingidOk returns a tuple with the Defaultgroupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultgroupingid

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetDefaultgroupingid(v int32)`

SetDefaultgroupingid sets Defaultgroupingid field to given value.

### HasDefaultgroupingid

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasDefaultgroupingid() bool`

HasDefaultgroupingid returns a boolean if a field has been set.

### GetDisplayname

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetDisplayname() string`

GetDisplayname returns the Displayname field if non-nil, zero value otherwise.

### GetDisplaynameOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetDisplaynameOk() (*string, bool)`

GetDisplaynameOk returns a tuple with the Displayname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayname

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetDisplayname(v string)`

SetDisplayname sets Displayname field to given value.

### HasDisplayname

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasDisplayname() bool`

HasDisplayname returns a boolean if a field has been set.

### GetEnablecompletion

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetEnablecompletion() int32`

GetEnablecompletion returns the Enablecompletion field if non-nil, zero value otherwise.

### GetEnablecompletionOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetEnablecompletionOk() (*int32, bool)`

GetEnablecompletionOk returns a tuple with the Enablecompletion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnablecompletion

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetEnablecompletion(v int32)`

SetEnablecompletion sets Enablecompletion field to given value.

### HasEnablecompletion

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasEnablecompletion() bool`

HasEnablecompletion returns a boolean if a field has been set.

### GetEnddate

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetEnddate() int32`

GetEnddate returns the Enddate field if non-nil, zero value otherwise.

### GetEnddateOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetEnddateOk() (*int32, bool)`

GetEnddateOk returns a tuple with the Enddate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnddate

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetEnddate(v int32)`

SetEnddate sets Enddate field to given value.

### HasEnddate

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasEnddate() bool`

HasEnddate returns a boolean if a field has been set.

### GetEnrollmentmethods

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetEnrollmentmethods() []map[string]interface{}`

GetEnrollmentmethods returns the Enrollmentmethods field if non-nil, zero value otherwise.

### GetEnrollmentmethodsOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetEnrollmentmethodsOk() (*[]map[string]interface{}, bool)`

GetEnrollmentmethodsOk returns a tuple with the Enrollmentmethods field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnrollmentmethods

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetEnrollmentmethods(v []map[string]interface{})`

SetEnrollmentmethods sets Enrollmentmethods field to given value.

### HasEnrollmentmethods

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasEnrollmentmethods() bool`

HasEnrollmentmethods returns a boolean if a field has been set.

### GetFilters

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetFilters() []CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetFiltersOk() (*[]CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetFilters(v []CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner)`

SetFilters sets Filters field to given value.

### HasFilters

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasFilters() bool`

HasFilters returns a boolean if a field has been set.

### GetFormat

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetFormat() string`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetFormatOk() (*string, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetFormat(v string)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetFullname

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetFullname() string`

GetFullname returns the Fullname field if non-nil, zero value otherwise.

### GetFullnameOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetFullnameOk() (*string, bool)`

GetFullnameOk returns a tuple with the Fullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullname

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetFullname(v string)`

SetFullname sets Fullname field to given value.

### HasFullname

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasFullname() bool`

HasFullname returns a boolean if a field has been set.

### GetGroupmode

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetGroupmodeforce

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetGroupmodeforce() int32`

GetGroupmodeforce returns the Groupmodeforce field if non-nil, zero value otherwise.

### GetGroupmodeforceOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetGroupmodeforceOk() (*int32, bool)`

GetGroupmodeforceOk returns a tuple with the Groupmodeforce field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmodeforce

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetGroupmodeforce(v int32)`

SetGroupmodeforce sets Groupmodeforce field to given value.

### HasGroupmodeforce

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasGroupmodeforce() bool`

HasGroupmodeforce returns a boolean if a field has been set.

### GetId

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetLang

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetLegacyfiles

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetLegacyfiles() int32`

GetLegacyfiles returns the Legacyfiles field if non-nil, zero value otherwise.

### GetLegacyfilesOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetLegacyfilesOk() (*int32, bool)`

GetLegacyfilesOk returns a tuple with the Legacyfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLegacyfiles

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetLegacyfiles(v int32)`

SetLegacyfiles sets Legacyfiles field to given value.

### HasLegacyfiles

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasLegacyfiles() bool`

HasLegacyfiles returns a boolean if a field has been set.

### GetMarker

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetMarker() int32`

GetMarker returns the Marker field if non-nil, zero value otherwise.

### GetMarkerOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetMarkerOk() (*int32, bool)`

GetMarkerOk returns a tuple with the Marker field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarker

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetMarker(v int32)`

SetMarker sets Marker field to given value.

### HasMarker

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasMarker() bool`

HasMarker returns a boolean if a field has been set.

### GetMaxbytes

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetMaxbytes() int32`

GetMaxbytes returns the Maxbytes field if non-nil, zero value otherwise.

### GetMaxbytesOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetMaxbytesOk() (*int32, bool)`

GetMaxbytesOk returns a tuple with the Maxbytes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxbytes

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetMaxbytes(v int32)`

SetMaxbytes sets Maxbytes field to given value.

### HasMaxbytes

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasMaxbytes() bool`

HasMaxbytes returns a boolean if a field has been set.

### GetNewsitems

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetNewsitems() int32`

GetNewsitems returns the Newsitems field if non-nil, zero value otherwise.

### GetNewsitemsOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetNewsitemsOk() (*int32, bool)`

GetNewsitemsOk returns a tuple with the Newsitems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewsitems

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetNewsitems(v int32)`

SetNewsitems sets Newsitems field to given value.

### HasNewsitems

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasNewsitems() bool`

HasNewsitems returns a boolean if a field has been set.

### GetOverviewfiles

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetOverviewfiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetOverviewfiles returns the Overviewfiles field if non-nil, zero value otherwise.

### GetOverviewfilesOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetOverviewfilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetOverviewfilesOk returns a tuple with the Overviewfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverviewfiles

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetOverviewfiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetOverviewfiles sets Overviewfiles field to given value.

### HasOverviewfiles

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasOverviewfiles() bool`

HasOverviewfiles returns a boolean if a field has been set.

### GetRequested

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetRequested() int32`

GetRequested returns the Requested field if non-nil, zero value otherwise.

### GetRequestedOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetRequestedOk() (*int32, bool)`

GetRequestedOk returns a tuple with the Requested field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequested

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetRequested(v int32)`

SetRequested sets Requested field to given value.

### HasRequested

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasRequested() bool`

HasRequested returns a boolean if a field has been set.

### GetShortname

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetShortname(v string)`

SetShortname sets Shortname field to given value.

### HasShortname

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasShortname() bool`

HasShortname returns a boolean if a field has been set.

### GetShowactivitydates

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetShowactivitydates() bool`

GetShowactivitydates returns the Showactivitydates field if non-nil, zero value otherwise.

### GetShowactivitydatesOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetShowactivitydatesOk() (*bool, bool)`

GetShowactivitydatesOk returns a tuple with the Showactivitydates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowactivitydates

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetShowactivitydates(v bool)`

SetShowactivitydates sets Showactivitydates field to given value.

### HasShowactivitydates

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasShowactivitydates() bool`

HasShowactivitydates returns a boolean if a field has been set.

### GetShowcompletionconditions

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetShowcompletionconditions() bool`

GetShowcompletionconditions returns the Showcompletionconditions field if non-nil, zero value otherwise.

### GetShowcompletionconditionsOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetShowcompletionconditionsOk() (*bool, bool)`

GetShowcompletionconditionsOk returns a tuple with the Showcompletionconditions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowcompletionconditions

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetShowcompletionconditions(v bool)`

SetShowcompletionconditions sets Showcompletionconditions field to given value.

### HasShowcompletionconditions

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasShowcompletionconditions() bool`

HasShowcompletionconditions returns a boolean if a field has been set.

### GetShowgrades

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetShowgrades() int32`

GetShowgrades returns the Showgrades field if non-nil, zero value otherwise.

### GetShowgradesOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetShowgradesOk() (*int32, bool)`

GetShowgradesOk returns a tuple with the Showgrades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowgrades

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetShowgrades(v int32)`

SetShowgrades sets Showgrades field to given value.

### HasShowgrades

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasShowgrades() bool`

HasShowgrades returns a boolean if a field has been set.

### GetShowreports

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetShowreports() int32`

GetShowreports returns the Showreports field if non-nil, zero value otherwise.

### GetShowreportsOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetShowreportsOk() (*int32, bool)`

GetShowreportsOk returns a tuple with the Showreports field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowreports

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetShowreports(v int32)`

SetShowreports sets Showreports field to given value.

### HasShowreports

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasShowreports() bool`

HasShowreports returns a boolean if a field has been set.

### GetSortorder

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetSortorder() int32`

GetSortorder returns the Sortorder field if non-nil, zero value otherwise.

### GetSortorderOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetSortorderOk() (*int32, bool)`

GetSortorderOk returns a tuple with the Sortorder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortorder

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetSortorder(v int32)`

SetSortorder sets Sortorder field to given value.

### HasSortorder

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasSortorder() bool`

HasSortorder returns a boolean if a field has been set.

### GetStartdate

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetStartdate() int32`

GetStartdate returns the Startdate field if non-nil, zero value otherwise.

### GetStartdateOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetStartdateOk() (*int32, bool)`

GetStartdateOk returns a tuple with the Startdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartdate

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetStartdate(v int32)`

SetStartdate sets Startdate field to given value.

### HasStartdate

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasStartdate() bool`

HasStartdate returns a boolean if a field has been set.

### GetSummary

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetSummary() string`

GetSummary returns the Summary field if non-nil, zero value otherwise.

### GetSummaryOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetSummaryOk() (*string, bool)`

GetSummaryOk returns a tuple with the Summary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummary

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetSummary(v string)`

SetSummary sets Summary field to given value.

### HasSummary

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasSummary() bool`

HasSummary returns a boolean if a field has been set.

### GetSummaryfiles

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetSummaryfiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetSummaryfiles returns the Summaryfiles field if non-nil, zero value otherwise.

### GetSummaryfilesOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetSummaryfilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetSummaryfilesOk returns a tuple with the Summaryfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryfiles

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetSummaryfiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetSummaryfiles sets Summaryfiles field to given value.

### HasSummaryfiles

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasSummaryfiles() bool`

HasSummaryfiles returns a boolean if a field has been set.

### GetSummaryformat

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetSummaryformat() int32`

GetSummaryformat returns the Summaryformat field if non-nil, zero value otherwise.

### GetSummaryformatOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetSummaryformatOk() (*int32, bool)`

GetSummaryformatOk returns a tuple with the Summaryformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryformat

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetSummaryformat(v int32)`

SetSummaryformat sets Summaryformat field to given value.

### HasSummaryformat

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasSummaryformat() bool`

HasSummaryformat returns a boolean if a field has been set.

### GetTheme

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetTheme() string`

GetTheme returns the Theme field if non-nil, zero value otherwise.

### GetThemeOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetThemeOk() (*string, bool)`

GetThemeOk returns a tuple with the Theme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTheme

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetTheme(v string)`

SetTheme sets Theme field to given value.

### HasTheme

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasTheme() bool`

HasTheme returns a boolean if a field has been set.

### GetTimecreated

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCourseGetCoursesByField200ResponseCoursesInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


