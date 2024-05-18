# CoreGradesGetGradableUsers200ResponseUsersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | Pointer to **string** | Postal address | [optional] 
**Auth** | Pointer to **string** | Auth plugins include manual, ldap, etc | [optional] 
**Calendartype** | Pointer to **string** | Calendar type such as \&quot;gregorian\&quot;, must exist on server | [optional] 
**City** | Pointer to **string** | Home city of the user | [optional] 
**Confirmed** | Pointer to **bool** | Active user: 1 if confirmed, 0 otherwise | [optional] 
**Country** | Pointer to **string** | Home country code of the user, such as AU or CZ | [optional] 
**Customfields** | Pointer to [**[]CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner**](CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner.md) |  | [optional] 
**Department** | Pointer to **string** | department | [optional] 
**Description** | Pointer to **string** | User profile description | [optional] 
**Descriptionformat** | Pointer to **int32** | int format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Email** | Pointer to **string** | An email address - allow email as root@localhost | [optional] 
**Firstaccess** | Pointer to **int32** | first access to the site (0 if never) | [optional] 
**Firstname** | Pointer to **string** | The first name(s) of the user | [optional] 
**Fullname** | Pointer to **string** | The fullname of the user | [optional] 
**Id** | Pointer to **int32** | ID of the user | [optional] 
**Idnumber** | Pointer to **string** | An arbitrary ID code number perhaps from the institution | [optional] 
**Institution** | Pointer to **string** | institution | [optional] 
**Interests** | Pointer to **string** | user interests (separated by commas) | [optional] 
**Lang** | Pointer to **string** | Language code such as \&quot;en\&quot;, must exist on server | [optional] 
**Lastaccess** | Pointer to **int32** | last access to the site (0 if never) | [optional] 
**Lastname** | Pointer to **string** | The family name of the user | [optional] 
**Mailformat** | Pointer to **int32** | Mail format code is 0 for plain text, 1 for HTML etc | [optional] 
**Phone1** | Pointer to **string** | Phone 1 | [optional] 
**Phone2** | Pointer to **string** | Phone 2 | [optional] 
**Preferences** | Pointer to [**[]CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner**](CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner.md) |  | [optional] 
**Profileimageurl** | Pointer to **string** | User image profile URL - big version | [optional] 
**Profileimageurlsmall** | Pointer to **string** | User image profile URL - small version | [optional] 
**Suspended** | Pointer to **bool** | Suspend user account, either false to enable user login or true to disable it | [optional] 
**Theme** | Pointer to **string** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional] 
**Timezone** | Pointer to **string** | Timezone code such as Australia/Perth, or 99 for default | [optional] 
**Username** | Pointer to **string** | The username | [optional] 

## Methods

### NewCoreGradesGetGradableUsers200ResponseUsersInner

`func NewCoreGradesGetGradableUsers200ResponseUsersInner() *CoreGradesGetGradableUsers200ResponseUsersInner`

NewCoreGradesGetGradableUsers200ResponseUsersInner instantiates a new CoreGradesGetGradableUsers200ResponseUsersInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesGetGradableUsers200ResponseUsersInnerWithDefaults

`func NewCoreGradesGetGradableUsers200ResponseUsersInnerWithDefaults() *CoreGradesGetGradableUsers200ResponseUsersInner`

NewCoreGradesGetGradableUsers200ResponseUsersInnerWithDefaults instantiates a new CoreGradesGetGradableUsers200ResponseUsersInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddress

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetAddress() string`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetAddressOk() (*string, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetAddress(v string)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetAuth

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetAuth() string`

GetAuth returns the Auth field if non-nil, zero value otherwise.

### GetAuthOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetAuthOk() (*string, bool)`

GetAuthOk returns a tuple with the Auth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuth

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetAuth(v string)`

SetAuth sets Auth field to given value.

### HasAuth

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasAuth() bool`

HasAuth returns a boolean if a field has been set.

### GetCalendartype

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetCalendartype() string`

GetCalendartype returns the Calendartype field if non-nil, zero value otherwise.

### GetCalendartypeOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetCalendartypeOk() (*string, bool)`

GetCalendartypeOk returns a tuple with the Calendartype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCalendartype

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetCalendartype(v string)`

SetCalendartype sets Calendartype field to given value.

### HasCalendartype

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasCalendartype() bool`

HasCalendartype returns a boolean if a field has been set.

### GetCity

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetConfirmed

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetConfirmed() bool`

GetConfirmed returns the Confirmed field if non-nil, zero value otherwise.

### GetConfirmedOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetConfirmedOk() (*bool, bool)`

GetConfirmedOk returns a tuple with the Confirmed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfirmed

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetConfirmed(v bool)`

SetConfirmed sets Confirmed field to given value.

### HasConfirmed

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasConfirmed() bool`

HasConfirmed returns a boolean if a field has been set.

### GetCountry

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCustomfields

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetCustomfields() []CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner`

GetCustomfields returns the Customfields field if non-nil, zero value otherwise.

### GetCustomfieldsOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetCustomfieldsOk() (*[]CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner, bool)`

GetCustomfieldsOk returns a tuple with the Customfields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfields

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetCustomfields(v []CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner)`

SetCustomfields sets Customfields field to given value.

### HasCustomfields

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasCustomfields() bool`

HasCustomfields returns a boolean if a field has been set.

### GetDepartment

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetDepartment() string`

GetDepartment returns the Department field if non-nil, zero value otherwise.

### GetDepartmentOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetDepartmentOk() (*string, bool)`

GetDepartmentOk returns a tuple with the Department field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDepartment

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetDepartment(v string)`

SetDepartment sets Department field to given value.

### HasDepartment

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasDepartment() bool`

HasDepartment returns a boolean if a field has been set.

### GetDescription

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetEmail

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetFirstaccess

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetFirstaccess() int32`

GetFirstaccess returns the Firstaccess field if non-nil, zero value otherwise.

### GetFirstaccessOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetFirstaccessOk() (*int32, bool)`

GetFirstaccessOk returns a tuple with the Firstaccess field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstaccess

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetFirstaccess(v int32)`

SetFirstaccess sets Firstaccess field to given value.

### HasFirstaccess

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasFirstaccess() bool`

HasFirstaccess returns a boolean if a field has been set.

### GetFirstname

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetFirstname() string`

GetFirstname returns the Firstname field if non-nil, zero value otherwise.

### GetFirstnameOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetFirstnameOk() (*string, bool)`

GetFirstnameOk returns a tuple with the Firstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstname

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetFirstname(v string)`

SetFirstname sets Firstname field to given value.

### HasFirstname

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasFirstname() bool`

HasFirstname returns a boolean if a field has been set.

### GetFullname

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetFullname() string`

GetFullname returns the Fullname field if non-nil, zero value otherwise.

### GetFullnameOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetFullnameOk() (*string, bool)`

GetFullnameOk returns a tuple with the Fullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullname

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetFullname(v string)`

SetFullname sets Fullname field to given value.

### HasFullname

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasFullname() bool`

HasFullname returns a boolean if a field has been set.

### GetId

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetInstitution

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetInstitution() string`

GetInstitution returns the Institution field if non-nil, zero value otherwise.

### GetInstitutionOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetInstitutionOk() (*string, bool)`

GetInstitutionOk returns a tuple with the Institution field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstitution

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetInstitution(v string)`

SetInstitution sets Institution field to given value.

### HasInstitution

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasInstitution() bool`

HasInstitution returns a boolean if a field has been set.

### GetInterests

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetInterests() string`

GetInterests returns the Interests field if non-nil, zero value otherwise.

### GetInterestsOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetInterestsOk() (*string, bool)`

GetInterestsOk returns a tuple with the Interests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterests

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetInterests(v string)`

SetInterests sets Interests field to given value.

### HasInterests

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasInterests() bool`

HasInterests returns a boolean if a field has been set.

### GetLang

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetLastaccess

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetLastaccess() int32`

GetLastaccess returns the Lastaccess field if non-nil, zero value otherwise.

### GetLastaccessOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetLastaccessOk() (*int32, bool)`

GetLastaccessOk returns a tuple with the Lastaccess field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastaccess

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetLastaccess(v int32)`

SetLastaccess sets Lastaccess field to given value.

### HasLastaccess

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasLastaccess() bool`

HasLastaccess returns a boolean if a field has been set.

### GetLastname

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetLastname() string`

GetLastname returns the Lastname field if non-nil, zero value otherwise.

### GetLastnameOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetLastnameOk() (*string, bool)`

GetLastnameOk returns a tuple with the Lastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastname

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetLastname(v string)`

SetLastname sets Lastname field to given value.

### HasLastname

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasLastname() bool`

HasLastname returns a boolean if a field has been set.

### GetMailformat

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetMailformat() int32`

GetMailformat returns the Mailformat field if non-nil, zero value otherwise.

### GetMailformatOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetMailformatOk() (*int32, bool)`

GetMailformatOk returns a tuple with the Mailformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMailformat

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetMailformat(v int32)`

SetMailformat sets Mailformat field to given value.

### HasMailformat

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasMailformat() bool`

HasMailformat returns a boolean if a field has been set.

### GetPhone1

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetPhone1() string`

GetPhone1 returns the Phone1 field if non-nil, zero value otherwise.

### GetPhone1Ok

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetPhone1Ok() (*string, bool)`

GetPhone1Ok returns a tuple with the Phone1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhone1

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetPhone1(v string)`

SetPhone1 sets Phone1 field to given value.

### HasPhone1

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasPhone1() bool`

HasPhone1 returns a boolean if a field has been set.

### GetPhone2

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetPhone2() string`

GetPhone2 returns the Phone2 field if non-nil, zero value otherwise.

### GetPhone2Ok

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetPhone2Ok() (*string, bool)`

GetPhone2Ok returns a tuple with the Phone2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhone2

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetPhone2(v string)`

SetPhone2 sets Phone2 field to given value.

### HasPhone2

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasPhone2() bool`

HasPhone2 returns a boolean if a field has been set.

### GetPreferences

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetPreferences() []CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner`

GetPreferences returns the Preferences field if non-nil, zero value otherwise.

### GetPreferencesOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetPreferencesOk() (*[]CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner, bool)`

GetPreferencesOk returns a tuple with the Preferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferences

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetPreferences(v []CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner)`

SetPreferences sets Preferences field to given value.

### HasPreferences

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasPreferences() bool`

HasPreferences returns a boolean if a field has been set.

### GetProfileimageurl

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetProfileimageurl() string`

GetProfileimageurl returns the Profileimageurl field if non-nil, zero value otherwise.

### GetProfileimageurlOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetProfileimageurlOk() (*string, bool)`

GetProfileimageurlOk returns a tuple with the Profileimageurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileimageurl

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetProfileimageurl(v string)`

SetProfileimageurl sets Profileimageurl field to given value.

### HasProfileimageurl

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasProfileimageurl() bool`

HasProfileimageurl returns a boolean if a field has been set.

### GetProfileimageurlsmall

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetProfileimageurlsmall() string`

GetProfileimageurlsmall returns the Profileimageurlsmall field if non-nil, zero value otherwise.

### GetProfileimageurlsmallOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetProfileimageurlsmallOk() (*string, bool)`

GetProfileimageurlsmallOk returns a tuple with the Profileimageurlsmall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileimageurlsmall

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetProfileimageurlsmall(v string)`

SetProfileimageurlsmall sets Profileimageurlsmall field to given value.

### HasProfileimageurlsmall

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasProfileimageurlsmall() bool`

HasProfileimageurlsmall returns a boolean if a field has been set.

### GetSuspended

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetSuspended() bool`

GetSuspended returns the Suspended field if non-nil, zero value otherwise.

### GetSuspendedOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetSuspendedOk() (*bool, bool)`

GetSuspendedOk returns a tuple with the Suspended field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuspended

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetSuspended(v bool)`

SetSuspended sets Suspended field to given value.

### HasSuspended

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasSuspended() bool`

HasSuspended returns a boolean if a field has been set.

### GetTheme

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetTheme() string`

GetTheme returns the Theme field if non-nil, zero value otherwise.

### GetThemeOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetThemeOk() (*string, bool)`

GetThemeOk returns a tuple with the Theme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTheme

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetTheme(v string)`

SetTheme sets Theme field to given value.

### HasTheme

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasTheme() bool`

HasTheme returns a boolean if a field has been set.

### GetTimezone

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetTimezone() string`

GetTimezone returns the Timezone field if non-nil, zero value otherwise.

### GetTimezoneOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetTimezoneOk() (*string, bool)`

GetTimezoneOk returns a tuple with the Timezone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimezone

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetTimezone(v string)`

SetTimezone sets Timezone field to given value.

### HasTimezone

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasTimezone() bool`

HasTimezone returns a boolean if a field has been set.

### GetUsername

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *CoreGradesGetGradableUsers200ResponseUsersInner) HasUsername() bool`

HasUsername returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


