# ModDataGetDatabasesByCourses200ResponseDatabasesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Addtemplate** | Pointer to **string** | addtemplate field | [optional] [default to "null"]
**Approval** | Pointer to **bool** | approval field | [optional] [default to null]
**Asearchtemplate** | Pointer to **string** | asearchtemplate field | [optional] [default to "null"]
**Assessed** | Pointer to **int32** | assessed field | [optional] [default to null]
**Assesstimefinish** | Pointer to **int32** | assesstimefinish field | [optional] [default to null]
**Assesstimestart** | Pointer to **int32** | assesstimestart field | [optional] [default to null]
**Comments** | Pointer to **bool** | comments enabled | [optional] [default to null]
**Course** | Pointer to **int32** | Course id | [optional] [default to null]
**Coursemodule** | Pointer to **int32** | coursemodule | [optional] [default to null]
**Csstemplate** | Pointer to **string** | csstemplate field | [optional] [default to "null"]
**Defaultsort** | Pointer to **int32** | defaultsort field | [optional] [default to null]
**Defaultsortdir** | Pointer to **int32** | defaultsortdir field | [optional] [default to null]
**Editany** | Pointer to **bool** | editany field (not used any more) | [optional] [default to null]
**Id** | Pointer to **int32** | Database id | [optional] [default to null]
**Intro** | Pointer to **string** | The Database intro | [optional] [default to "null"]
**Introfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Jstemplate** | Pointer to **string** | jstemplate field | [optional] [default to "null"]
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Listtemplate** | Pointer to **string** | listtemplate field | [optional] [default to "null"]
**Listtemplatefooter** | Pointer to **string** | listtemplatefooter field | [optional] [default to "null"]
**Listtemplateheader** | Pointer to **string** | listtemplateheader field | [optional] [default to "null"]
**Manageapproved** | Pointer to **bool** | manageapproved field | [optional] [default to null]
**Maxentries** | Pointer to **int32** | maxentries field | [optional] [default to null]
**Name** | Pointer to **string** | Database name | [optional] [default to "null"]
**Notification** | Pointer to **int32** | notification field (not used any more) | [optional] [default to null]
**Requiredentries** | Pointer to **int32** | requiredentries field | [optional] [default to null]
**Requiredentriestoview** | Pointer to **int32** | requiredentriestoview field | [optional] [default to null]
**Rssarticles** | Pointer to **int32** | rssarticles field | [optional] [default to null]
**Rsstemplate** | Pointer to **string** | rsstemplate field | [optional] [default to "null"]
**Rsstitletemplate** | Pointer to **string** | rsstitletemplate field | [optional] [default to "null"]
**Scale** | Pointer to **int32** | scale field | [optional] [default to null]
**Singletemplate** | Pointer to **string** | singletemplate field | [optional] [default to "null"]
**Timeavailablefrom** | Pointer to **int32** | timeavailablefrom field | [optional] [default to null]
**Timeavailableto** | Pointer to **int32** | timeavailableto field | [optional] [default to null]
**Timemodified** | Pointer to **int32** | Time modified | [optional] [default to null]
**Timeviewfrom** | Pointer to **int32** | timeviewfrom field | [optional] [default to null]
**Timeviewto** | Pointer to **int32** | timeviewto field | [optional] [default to null]

## Methods

### NewModDataGetDatabasesByCourses200ResponseDatabasesInner

`func NewModDataGetDatabasesByCourses200ResponseDatabasesInner() *ModDataGetDatabasesByCourses200ResponseDatabasesInner`

NewModDataGetDatabasesByCourses200ResponseDatabasesInner instantiates a new ModDataGetDatabasesByCourses200ResponseDatabasesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataGetDatabasesByCourses200ResponseDatabasesInnerWithDefaults

`func NewModDataGetDatabasesByCourses200ResponseDatabasesInnerWithDefaults() *ModDataGetDatabasesByCourses200ResponseDatabasesInner`

NewModDataGetDatabasesByCourses200ResponseDatabasesInnerWithDefaults instantiates a new ModDataGetDatabasesByCourses200ResponseDatabasesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddtemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetAddtemplate() string`

GetAddtemplate returns the Addtemplate field if non-nil, zero value otherwise.

### GetAddtemplateOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetAddtemplateOk() (*string, bool)`

GetAddtemplateOk returns a tuple with the Addtemplate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddtemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetAddtemplate(v string)`

SetAddtemplate sets Addtemplate field to given value.

### HasAddtemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasAddtemplate() bool`

HasAddtemplate returns a boolean if a field has been set.

### GetApproval

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetApproval() bool`

GetApproval returns the Approval field if non-nil, zero value otherwise.

### GetApprovalOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetApprovalOk() (*bool, bool)`

GetApprovalOk returns a tuple with the Approval field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApproval

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetApproval(v bool)`

SetApproval sets Approval field to given value.

### HasApproval

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasApproval() bool`

HasApproval returns a boolean if a field has been set.

### GetAsearchtemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetAsearchtemplate() string`

GetAsearchtemplate returns the Asearchtemplate field if non-nil, zero value otherwise.

### GetAsearchtemplateOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetAsearchtemplateOk() (*string, bool)`

GetAsearchtemplateOk returns a tuple with the Asearchtemplate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAsearchtemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetAsearchtemplate(v string)`

SetAsearchtemplate sets Asearchtemplate field to given value.

### HasAsearchtemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasAsearchtemplate() bool`

HasAsearchtemplate returns a boolean if a field has been set.

### GetAssessed

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetAssessed() int32`

GetAssessed returns the Assessed field if non-nil, zero value otherwise.

### GetAssessedOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetAssessedOk() (*int32, bool)`

GetAssessedOk returns a tuple with the Assessed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssessed

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetAssessed(v int32)`

SetAssessed sets Assessed field to given value.

### HasAssessed

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasAssessed() bool`

HasAssessed returns a boolean if a field has been set.

### GetAssesstimefinish

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetAssesstimefinish() int32`

GetAssesstimefinish returns the Assesstimefinish field if non-nil, zero value otherwise.

### GetAssesstimefinishOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetAssesstimefinishOk() (*int32, bool)`

GetAssesstimefinishOk returns a tuple with the Assesstimefinish field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssesstimefinish

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetAssesstimefinish(v int32)`

SetAssesstimefinish sets Assesstimefinish field to given value.

### HasAssesstimefinish

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasAssesstimefinish() bool`

HasAssesstimefinish returns a boolean if a field has been set.

### GetAssesstimestart

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetAssesstimestart() int32`

GetAssesstimestart returns the Assesstimestart field if non-nil, zero value otherwise.

### GetAssesstimestartOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetAssesstimestartOk() (*int32, bool)`

GetAssesstimestartOk returns a tuple with the Assesstimestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssesstimestart

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetAssesstimestart(v int32)`

SetAssesstimestart sets Assesstimestart field to given value.

### HasAssesstimestart

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasAssesstimestart() bool`

HasAssesstimestart returns a boolean if a field has been set.

### GetComments

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetComments() bool`

GetComments returns the Comments field if non-nil, zero value otherwise.

### GetCommentsOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetCommentsOk() (*bool, bool)`

GetCommentsOk returns a tuple with the Comments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComments

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetComments(v bool)`

SetComments sets Comments field to given value.

### HasComments

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasComments() bool`

HasComments returns a boolean if a field has been set.

### GetCourse

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetCsstemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetCsstemplate() string`

GetCsstemplate returns the Csstemplate field if non-nil, zero value otherwise.

### GetCsstemplateOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetCsstemplateOk() (*string, bool)`

GetCsstemplateOk returns a tuple with the Csstemplate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCsstemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetCsstemplate(v string)`

SetCsstemplate sets Csstemplate field to given value.

### HasCsstemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasCsstemplate() bool`

HasCsstemplate returns a boolean if a field has been set.

### GetDefaultsort

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetDefaultsort() int32`

GetDefaultsort returns the Defaultsort field if non-nil, zero value otherwise.

### GetDefaultsortOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetDefaultsortOk() (*int32, bool)`

GetDefaultsortOk returns a tuple with the Defaultsort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultsort

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetDefaultsort(v int32)`

SetDefaultsort sets Defaultsort field to given value.

### HasDefaultsort

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasDefaultsort() bool`

HasDefaultsort returns a boolean if a field has been set.

### GetDefaultsortdir

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetDefaultsortdir() int32`

GetDefaultsortdir returns the Defaultsortdir field if non-nil, zero value otherwise.

### GetDefaultsortdirOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetDefaultsortdirOk() (*int32, bool)`

GetDefaultsortdirOk returns a tuple with the Defaultsortdir field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultsortdir

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetDefaultsortdir(v int32)`

SetDefaultsortdir sets Defaultsortdir field to given value.

### HasDefaultsortdir

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasDefaultsortdir() bool`

HasDefaultsortdir returns a boolean if a field has been set.

### GetEditany

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetEditany() bool`

GetEditany returns the Editany field if non-nil, zero value otherwise.

### GetEditanyOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetEditanyOk() (*bool, bool)`

GetEditanyOk returns a tuple with the Editany field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditany

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetEditany(v bool)`

SetEditany sets Editany field to given value.

### HasEditany

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasEditany() bool`

HasEditany returns a boolean if a field has been set.

### GetId

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetIntrofiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetIntrofilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetIntrofiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetJstemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetJstemplate() string`

GetJstemplate returns the Jstemplate field if non-nil, zero value otherwise.

### GetJstemplateOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetJstemplateOk() (*string, bool)`

GetJstemplateOk returns a tuple with the Jstemplate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJstemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetJstemplate(v string)`

SetJstemplate sets Jstemplate field to given value.

### HasJstemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasJstemplate() bool`

HasJstemplate returns a boolean if a field has been set.

### GetLang

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetListtemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetListtemplate() string`

GetListtemplate returns the Listtemplate field if non-nil, zero value otherwise.

### GetListtemplateOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetListtemplateOk() (*string, bool)`

GetListtemplateOk returns a tuple with the Listtemplate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetListtemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetListtemplate(v string)`

SetListtemplate sets Listtemplate field to given value.

### HasListtemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasListtemplate() bool`

HasListtemplate returns a boolean if a field has been set.

### GetListtemplatefooter

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetListtemplatefooter() string`

GetListtemplatefooter returns the Listtemplatefooter field if non-nil, zero value otherwise.

### GetListtemplatefooterOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetListtemplatefooterOk() (*string, bool)`

GetListtemplatefooterOk returns a tuple with the Listtemplatefooter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetListtemplatefooter

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetListtemplatefooter(v string)`

SetListtemplatefooter sets Listtemplatefooter field to given value.

### HasListtemplatefooter

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasListtemplatefooter() bool`

HasListtemplatefooter returns a boolean if a field has been set.

### GetListtemplateheader

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetListtemplateheader() string`

GetListtemplateheader returns the Listtemplateheader field if non-nil, zero value otherwise.

### GetListtemplateheaderOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetListtemplateheaderOk() (*string, bool)`

GetListtemplateheaderOk returns a tuple with the Listtemplateheader field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetListtemplateheader

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetListtemplateheader(v string)`

SetListtemplateheader sets Listtemplateheader field to given value.

### HasListtemplateheader

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasListtemplateheader() bool`

HasListtemplateheader returns a boolean if a field has been set.

### GetManageapproved

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetManageapproved() bool`

GetManageapproved returns the Manageapproved field if non-nil, zero value otherwise.

### GetManageapprovedOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetManageapprovedOk() (*bool, bool)`

GetManageapprovedOk returns a tuple with the Manageapproved field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetManageapproved

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetManageapproved(v bool)`

SetManageapproved sets Manageapproved field to given value.

### HasManageapproved

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasManageapproved() bool`

HasManageapproved returns a boolean if a field has been set.

### GetMaxentries

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetMaxentries() int32`

GetMaxentries returns the Maxentries field if non-nil, zero value otherwise.

### GetMaxentriesOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetMaxentriesOk() (*int32, bool)`

GetMaxentriesOk returns a tuple with the Maxentries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxentries

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetMaxentries(v int32)`

SetMaxentries sets Maxentries field to given value.

### HasMaxentries

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasMaxentries() bool`

HasMaxentries returns a boolean if a field has been set.

### GetName

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNotification

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetNotification() int32`

GetNotification returns the Notification field if non-nil, zero value otherwise.

### GetNotificationOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetNotificationOk() (*int32, bool)`

GetNotificationOk returns a tuple with the Notification field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotification

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetNotification(v int32)`

SetNotification sets Notification field to given value.

### HasNotification

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasNotification() bool`

HasNotification returns a boolean if a field has been set.

### GetRequiredentries

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetRequiredentries() int32`

GetRequiredentries returns the Requiredentries field if non-nil, zero value otherwise.

### GetRequiredentriesOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetRequiredentriesOk() (*int32, bool)`

GetRequiredentriesOk returns a tuple with the Requiredentries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequiredentries

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetRequiredentries(v int32)`

SetRequiredentries sets Requiredentries field to given value.

### HasRequiredentries

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasRequiredentries() bool`

HasRequiredentries returns a boolean if a field has been set.

### GetRequiredentriestoview

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetRequiredentriestoview() int32`

GetRequiredentriestoview returns the Requiredentriestoview field if non-nil, zero value otherwise.

### GetRequiredentriestoviewOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetRequiredentriestoviewOk() (*int32, bool)`

GetRequiredentriestoviewOk returns a tuple with the Requiredentriestoview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequiredentriestoview

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetRequiredentriestoview(v int32)`

SetRequiredentriestoview sets Requiredentriestoview field to given value.

### HasRequiredentriestoview

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasRequiredentriestoview() bool`

HasRequiredentriestoview returns a boolean if a field has been set.

### GetRssarticles

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetRssarticles() int32`

GetRssarticles returns the Rssarticles field if non-nil, zero value otherwise.

### GetRssarticlesOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetRssarticlesOk() (*int32, bool)`

GetRssarticlesOk returns a tuple with the Rssarticles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRssarticles

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetRssarticles(v int32)`

SetRssarticles sets Rssarticles field to given value.

### HasRssarticles

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasRssarticles() bool`

HasRssarticles returns a boolean if a field has been set.

### GetRsstemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetRsstemplate() string`

GetRsstemplate returns the Rsstemplate field if non-nil, zero value otherwise.

### GetRsstemplateOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetRsstemplateOk() (*string, bool)`

GetRsstemplateOk returns a tuple with the Rsstemplate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRsstemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetRsstemplate(v string)`

SetRsstemplate sets Rsstemplate field to given value.

### HasRsstemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasRsstemplate() bool`

HasRsstemplate returns a boolean if a field has been set.

### GetRsstitletemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetRsstitletemplate() string`

GetRsstitletemplate returns the Rsstitletemplate field if non-nil, zero value otherwise.

### GetRsstitletemplateOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetRsstitletemplateOk() (*string, bool)`

GetRsstitletemplateOk returns a tuple with the Rsstitletemplate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRsstitletemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetRsstitletemplate(v string)`

SetRsstitletemplate sets Rsstitletemplate field to given value.

### HasRsstitletemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasRsstitletemplate() bool`

HasRsstitletemplate returns a boolean if a field has been set.

### GetScale

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetScale() int32`

GetScale returns the Scale field if non-nil, zero value otherwise.

### GetScaleOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetScaleOk() (*int32, bool)`

GetScaleOk returns a tuple with the Scale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScale

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetScale(v int32)`

SetScale sets Scale field to given value.

### HasScale

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasScale() bool`

HasScale returns a boolean if a field has been set.

### GetSingletemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetSingletemplate() string`

GetSingletemplate returns the Singletemplate field if non-nil, zero value otherwise.

### GetSingletemplateOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetSingletemplateOk() (*string, bool)`

GetSingletemplateOk returns a tuple with the Singletemplate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSingletemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetSingletemplate(v string)`

SetSingletemplate sets Singletemplate field to given value.

### HasSingletemplate

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasSingletemplate() bool`

HasSingletemplate returns a boolean if a field has been set.

### GetTimeavailablefrom

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetTimeavailablefrom() int32`

GetTimeavailablefrom returns the Timeavailablefrom field if non-nil, zero value otherwise.

### GetTimeavailablefromOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetTimeavailablefromOk() (*int32, bool)`

GetTimeavailablefromOk returns a tuple with the Timeavailablefrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeavailablefrom

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetTimeavailablefrom(v int32)`

SetTimeavailablefrom sets Timeavailablefrom field to given value.

### HasTimeavailablefrom

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasTimeavailablefrom() bool`

HasTimeavailablefrom returns a boolean if a field has been set.

### GetTimeavailableto

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetTimeavailableto() int32`

GetTimeavailableto returns the Timeavailableto field if non-nil, zero value otherwise.

### GetTimeavailabletoOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetTimeavailabletoOk() (*int32, bool)`

GetTimeavailabletoOk returns a tuple with the Timeavailableto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeavailableto

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetTimeavailableto(v int32)`

SetTimeavailableto sets Timeavailableto field to given value.

### HasTimeavailableto

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasTimeavailableto() bool`

HasTimeavailableto returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimeviewfrom

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetTimeviewfrom() int32`

GetTimeviewfrom returns the Timeviewfrom field if non-nil, zero value otherwise.

### GetTimeviewfromOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetTimeviewfromOk() (*int32, bool)`

GetTimeviewfromOk returns a tuple with the Timeviewfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeviewfrom

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetTimeviewfrom(v int32)`

SetTimeviewfrom sets Timeviewfrom field to given value.

### HasTimeviewfrom

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasTimeviewfrom() bool`

HasTimeviewfrom returns a boolean if a field has been set.

### GetTimeviewto

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetTimeviewto() int32`

GetTimeviewto returns the Timeviewto field if non-nil, zero value otherwise.

### GetTimeviewtoOk

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) GetTimeviewtoOk() (*int32, bool)`

GetTimeviewtoOk returns a tuple with the Timeviewto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeviewto

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) SetTimeviewto(v int32)`

SetTimeviewto sets Timeviewto field to given value.

### HasTimeviewto

`func (o *ModDataGetDatabasesByCourses200ResponseDatabasesInner) HasTimeviewto() bool`

HasTimeviewto returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


