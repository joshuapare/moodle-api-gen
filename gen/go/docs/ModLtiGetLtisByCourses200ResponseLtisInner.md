# ModLtiGetLtisByCourses200ResponseLtisInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Course** | Pointer to **int32** | Course id | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id | [optional] 
**Debuglaunch** | Pointer to **int32** | Debug launch | [optional] [default to null]
**Grade** | Pointer to **int32** | Enable grades | [optional] [default to null]
**Groupingid** | Pointer to **int32** | Group id | [optional] 
**Groupmode** | Pointer to **int32** | Group mode | [optional] 
**Icon** | Pointer to **string** | Alternative icon URL | [optional] [default to "null"]
**Id** | Pointer to **int32** | Activity instance id | [optional] 
**Instructorchoiceacceptgrades** | Pointer to **int32** | instructor choice accept grades | [optional] [default to null]
**Instructorchoiceallowroster** | Pointer to **int32** | Instructor choice allow roster | [optional] [default to null]
**Instructorchoiceallowsetting** | Pointer to **int32** | Instructor choice allow setting | [optional] [default to null]
**Instructorchoicesendemailaddr** | Pointer to **int32** | instructor choice send mail address | [optional] [default to null]
**Instructorchoicesendname** | Pointer to **string** | Instructor choice send name | [optional] [default to "null"]
**Instructorcustomparameters** | Pointer to **string** | instructor custom parameters | [optional] [default to "null"]
**Intro** | Pointer to **string** | Activity introduction | [optional] 
**Introfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Launchcontainer** | Pointer to **int32** | Launch container mode | [optional] [default to null]
**Name** | Pointer to **string** | Activity name | [optional] 
**Password** | Pointer to **string** | Shared secret | [optional] [default to "null"]
**Resourcekey** | Pointer to **string** | Resource key | [optional] [default to "null"]
**Section** | Pointer to **int32** | Course section id | [optional] 
**Secureicon** | Pointer to **string** | Secure icon URL | [optional] [default to "null"]
**Securetoolurl** | Pointer to **string** | Secure tool url | [optional] [default to "null"]
**Servicesalt** | Pointer to **string** | Service salt | [optional] [default to "null"]
**Showdescriptionlaunch** | Pointer to **int32** | Show description launch | [optional] [default to null]
**Showtitlelaunch** | Pointer to **int32** | Show title launch | [optional] [default to null]
**Timecreated** | Pointer to **int32** | Time of creation | [optional] 
**Timemodified** | Pointer to **int32** | Time of last modification | [optional] 
**Toolurl** | Pointer to **string** | Tool url | [optional] [default to "null"]
**Typeid** | Pointer to **int32** | Type id | [optional] [default to null]
**Visible** | Pointer to **bool** | Visible | [optional] 

## Methods

### NewModLtiGetLtisByCourses200ResponseLtisInner

`func NewModLtiGetLtisByCourses200ResponseLtisInner() *ModLtiGetLtisByCourses200ResponseLtisInner`

NewModLtiGetLtisByCourses200ResponseLtisInner instantiates a new ModLtiGetLtisByCourses200ResponseLtisInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLtiGetLtisByCourses200ResponseLtisInnerWithDefaults

`func NewModLtiGetLtisByCourses200ResponseLtisInnerWithDefaults() *ModLtiGetLtisByCourses200ResponseLtisInner`

NewModLtiGetLtisByCourses200ResponseLtisInnerWithDefaults instantiates a new ModLtiGetLtisByCourses200ResponseLtisInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourse

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetDebuglaunch

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetDebuglaunch() int32`

GetDebuglaunch returns the Debuglaunch field if non-nil, zero value otherwise.

### GetDebuglaunchOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetDebuglaunchOk() (*int32, bool)`

GetDebuglaunchOk returns a tuple with the Debuglaunch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebuglaunch

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetDebuglaunch(v int32)`

SetDebuglaunch sets Debuglaunch field to given value.

### HasDebuglaunch

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasDebuglaunch() bool`

HasDebuglaunch returns a boolean if a field has been set.

### GetGrade

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetGrade() int32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetGradeOk() (*int32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetGrade(v int32)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetIcon

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetIcon() string`

GetIcon returns the Icon field if non-nil, zero value otherwise.

### GetIconOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetIconOk() (*string, bool)`

GetIconOk returns a tuple with the Icon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIcon

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetIcon(v string)`

SetIcon sets Icon field to given value.

### HasIcon

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasIcon() bool`

HasIcon returns a boolean if a field has been set.

### GetId

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInstructorchoiceacceptgrades

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetInstructorchoiceacceptgrades() int32`

GetInstructorchoiceacceptgrades returns the Instructorchoiceacceptgrades field if non-nil, zero value otherwise.

### GetInstructorchoiceacceptgradesOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetInstructorchoiceacceptgradesOk() (*int32, bool)`

GetInstructorchoiceacceptgradesOk returns a tuple with the Instructorchoiceacceptgrades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructorchoiceacceptgrades

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetInstructorchoiceacceptgrades(v int32)`

SetInstructorchoiceacceptgrades sets Instructorchoiceacceptgrades field to given value.

### HasInstructorchoiceacceptgrades

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasInstructorchoiceacceptgrades() bool`

HasInstructorchoiceacceptgrades returns a boolean if a field has been set.

### GetInstructorchoiceallowroster

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetInstructorchoiceallowroster() int32`

GetInstructorchoiceallowroster returns the Instructorchoiceallowroster field if non-nil, zero value otherwise.

### GetInstructorchoiceallowrosterOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetInstructorchoiceallowrosterOk() (*int32, bool)`

GetInstructorchoiceallowrosterOk returns a tuple with the Instructorchoiceallowroster field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructorchoiceallowroster

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetInstructorchoiceallowroster(v int32)`

SetInstructorchoiceallowroster sets Instructorchoiceallowroster field to given value.

### HasInstructorchoiceallowroster

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasInstructorchoiceallowroster() bool`

HasInstructorchoiceallowroster returns a boolean if a field has been set.

### GetInstructorchoiceallowsetting

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetInstructorchoiceallowsetting() int32`

GetInstructorchoiceallowsetting returns the Instructorchoiceallowsetting field if non-nil, zero value otherwise.

### GetInstructorchoiceallowsettingOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetInstructorchoiceallowsettingOk() (*int32, bool)`

GetInstructorchoiceallowsettingOk returns a tuple with the Instructorchoiceallowsetting field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructorchoiceallowsetting

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetInstructorchoiceallowsetting(v int32)`

SetInstructorchoiceallowsetting sets Instructorchoiceallowsetting field to given value.

### HasInstructorchoiceallowsetting

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasInstructorchoiceallowsetting() bool`

HasInstructorchoiceallowsetting returns a boolean if a field has been set.

### GetInstructorchoicesendemailaddr

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetInstructorchoicesendemailaddr() int32`

GetInstructorchoicesendemailaddr returns the Instructorchoicesendemailaddr field if non-nil, zero value otherwise.

### GetInstructorchoicesendemailaddrOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetInstructorchoicesendemailaddrOk() (*int32, bool)`

GetInstructorchoicesendemailaddrOk returns a tuple with the Instructorchoicesendemailaddr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructorchoicesendemailaddr

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetInstructorchoicesendemailaddr(v int32)`

SetInstructorchoicesendemailaddr sets Instructorchoicesendemailaddr field to given value.

### HasInstructorchoicesendemailaddr

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasInstructorchoicesendemailaddr() bool`

HasInstructorchoicesendemailaddr returns a boolean if a field has been set.

### GetInstructorchoicesendname

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetInstructorchoicesendname() string`

GetInstructorchoicesendname returns the Instructorchoicesendname field if non-nil, zero value otherwise.

### GetInstructorchoicesendnameOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetInstructorchoicesendnameOk() (*string, bool)`

GetInstructorchoicesendnameOk returns a tuple with the Instructorchoicesendname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructorchoicesendname

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetInstructorchoicesendname(v string)`

SetInstructorchoicesendname sets Instructorchoicesendname field to given value.

### HasInstructorchoicesendname

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasInstructorchoicesendname() bool`

HasInstructorchoicesendname returns a boolean if a field has been set.

### GetInstructorcustomparameters

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetInstructorcustomparameters() string`

GetInstructorcustomparameters returns the Instructorcustomparameters field if non-nil, zero value otherwise.

### GetInstructorcustomparametersOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetInstructorcustomparametersOk() (*string, bool)`

GetInstructorcustomparametersOk returns a tuple with the Instructorcustomparameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructorcustomparameters

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetInstructorcustomparameters(v string)`

SetInstructorcustomparameters sets Instructorcustomparameters field to given value.

### HasInstructorcustomparameters

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasInstructorcustomparameters() bool`

HasInstructorcustomparameters returns a boolean if a field has been set.

### GetIntro

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetLaunchcontainer

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetLaunchcontainer() int32`

GetLaunchcontainer returns the Launchcontainer field if non-nil, zero value otherwise.

### GetLaunchcontainerOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetLaunchcontainerOk() (*int32, bool)`

GetLaunchcontainerOk returns a tuple with the Launchcontainer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLaunchcontainer

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetLaunchcontainer(v int32)`

SetLaunchcontainer sets Launchcontainer field to given value.

### HasLaunchcontainer

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasLaunchcontainer() bool`

HasLaunchcontainer returns a boolean if a field has been set.

### GetName

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPassword

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasPassword() bool`

HasPassword returns a boolean if a field has been set.

### GetResourcekey

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetResourcekey() string`

GetResourcekey returns the Resourcekey field if non-nil, zero value otherwise.

### GetResourcekeyOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetResourcekeyOk() (*string, bool)`

GetResourcekeyOk returns a tuple with the Resourcekey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResourcekey

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetResourcekey(v string)`

SetResourcekey sets Resourcekey field to given value.

### HasResourcekey

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasResourcekey() bool`

HasResourcekey returns a boolean if a field has been set.

### GetSection

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetSecureicon

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetSecureicon() string`

GetSecureicon returns the Secureicon field if non-nil, zero value otherwise.

### GetSecureiconOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetSecureiconOk() (*string, bool)`

GetSecureiconOk returns a tuple with the Secureicon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSecureicon

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetSecureicon(v string)`

SetSecureicon sets Secureicon field to given value.

### HasSecureicon

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasSecureicon() bool`

HasSecureicon returns a boolean if a field has been set.

### GetSecuretoolurl

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetSecuretoolurl() string`

GetSecuretoolurl returns the Securetoolurl field if non-nil, zero value otherwise.

### GetSecuretoolurlOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetSecuretoolurlOk() (*string, bool)`

GetSecuretoolurlOk returns a tuple with the Securetoolurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSecuretoolurl

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetSecuretoolurl(v string)`

SetSecuretoolurl sets Securetoolurl field to given value.

### HasSecuretoolurl

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasSecuretoolurl() bool`

HasSecuretoolurl returns a boolean if a field has been set.

### GetServicesalt

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetServicesalt() string`

GetServicesalt returns the Servicesalt field if non-nil, zero value otherwise.

### GetServicesaltOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetServicesaltOk() (*string, bool)`

GetServicesaltOk returns a tuple with the Servicesalt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServicesalt

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetServicesalt(v string)`

SetServicesalt sets Servicesalt field to given value.

### HasServicesalt

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasServicesalt() bool`

HasServicesalt returns a boolean if a field has been set.

### GetShowdescriptionlaunch

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetShowdescriptionlaunch() int32`

GetShowdescriptionlaunch returns the Showdescriptionlaunch field if non-nil, zero value otherwise.

### GetShowdescriptionlaunchOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetShowdescriptionlaunchOk() (*int32, bool)`

GetShowdescriptionlaunchOk returns a tuple with the Showdescriptionlaunch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowdescriptionlaunch

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetShowdescriptionlaunch(v int32)`

SetShowdescriptionlaunch sets Showdescriptionlaunch field to given value.

### HasShowdescriptionlaunch

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasShowdescriptionlaunch() bool`

HasShowdescriptionlaunch returns a boolean if a field has been set.

### GetShowtitlelaunch

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetShowtitlelaunch() int32`

GetShowtitlelaunch returns the Showtitlelaunch field if non-nil, zero value otherwise.

### GetShowtitlelaunchOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetShowtitlelaunchOk() (*int32, bool)`

GetShowtitlelaunchOk returns a tuple with the Showtitlelaunch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowtitlelaunch

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetShowtitlelaunch(v int32)`

SetShowtitlelaunch sets Showtitlelaunch field to given value.

### HasShowtitlelaunch

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasShowtitlelaunch() bool`

HasShowtitlelaunch returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetToolurl

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetToolurl() string`

GetToolurl returns the Toolurl field if non-nil, zero value otherwise.

### GetToolurlOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetToolurlOk() (*string, bool)`

GetToolurlOk returns a tuple with the Toolurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolurl

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetToolurl(v string)`

SetToolurl sets Toolurl field to given value.

### HasToolurl

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasToolurl() bool`

HasToolurl returns a boolean if a field has been set.

### GetTypeid

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetTypeid() int32`

GetTypeid returns the Typeid field if non-nil, zero value otherwise.

### GetTypeidOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetTypeidOk() (*int32, bool)`

GetTypeidOk returns a tuple with the Typeid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypeid

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetTypeid(v int32)`

SetTypeid sets Typeid field to given value.

### HasTypeid

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasTypeid() bool`

HasTypeid returns a boolean if a field has been set.

### GetVisible

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModLtiGetLtisByCourses200ResponseLtisInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


