# ModAssignGetParticipant200ResponseUser

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
**Fullname** | **string** | The fullname of the user | 
**Id** | **int32** | ID of the user | 
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
**Profileimageurl** | **string** | User image profile URL - big version | 
**Profileimageurlsmall** | **string** | User image profile URL - small version | 
**Suspended** | Pointer to **bool** | Suspend user account, either false to enable user login or true to disable it | [optional] 
**Theme** | Pointer to **string** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional] 
**Timezone** | Pointer to **string** | Timezone code such as Australia/Perth, or 99 for default | [optional] 
**Username** | Pointer to **string** | The username | [optional] 

## Methods

### NewModAssignGetParticipant200ResponseUser

`func NewModAssignGetParticipant200ResponseUser(fullname string, id int32, profileimageurl string, profileimageurlsmall string, ) *ModAssignGetParticipant200ResponseUser`

NewModAssignGetParticipant200ResponseUser instantiates a new ModAssignGetParticipant200ResponseUser object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetParticipant200ResponseUserWithDefaults

`func NewModAssignGetParticipant200ResponseUserWithDefaults() *ModAssignGetParticipant200ResponseUser`

NewModAssignGetParticipant200ResponseUserWithDefaults instantiates a new ModAssignGetParticipant200ResponseUser object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddress

`func (o *ModAssignGetParticipant200ResponseUser) GetAddress() string`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *ModAssignGetParticipant200ResponseUser) GetAddressOk() (*string, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *ModAssignGetParticipant200ResponseUser) SetAddress(v string)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *ModAssignGetParticipant200ResponseUser) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetAuth

`func (o *ModAssignGetParticipant200ResponseUser) GetAuth() string`

GetAuth returns the Auth field if non-nil, zero value otherwise.

### GetAuthOk

`func (o *ModAssignGetParticipant200ResponseUser) GetAuthOk() (*string, bool)`

GetAuthOk returns a tuple with the Auth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuth

`func (o *ModAssignGetParticipant200ResponseUser) SetAuth(v string)`

SetAuth sets Auth field to given value.

### HasAuth

`func (o *ModAssignGetParticipant200ResponseUser) HasAuth() bool`

HasAuth returns a boolean if a field has been set.

### GetCalendartype

`func (o *ModAssignGetParticipant200ResponseUser) GetCalendartype() string`

GetCalendartype returns the Calendartype field if non-nil, zero value otherwise.

### GetCalendartypeOk

`func (o *ModAssignGetParticipant200ResponseUser) GetCalendartypeOk() (*string, bool)`

GetCalendartypeOk returns a tuple with the Calendartype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCalendartype

`func (o *ModAssignGetParticipant200ResponseUser) SetCalendartype(v string)`

SetCalendartype sets Calendartype field to given value.

### HasCalendartype

`func (o *ModAssignGetParticipant200ResponseUser) HasCalendartype() bool`

HasCalendartype returns a boolean if a field has been set.

### GetCity

`func (o *ModAssignGetParticipant200ResponseUser) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *ModAssignGetParticipant200ResponseUser) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *ModAssignGetParticipant200ResponseUser) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *ModAssignGetParticipant200ResponseUser) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetConfirmed

`func (o *ModAssignGetParticipant200ResponseUser) GetConfirmed() bool`

GetConfirmed returns the Confirmed field if non-nil, zero value otherwise.

### GetConfirmedOk

`func (o *ModAssignGetParticipant200ResponseUser) GetConfirmedOk() (*bool, bool)`

GetConfirmedOk returns a tuple with the Confirmed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfirmed

`func (o *ModAssignGetParticipant200ResponseUser) SetConfirmed(v bool)`

SetConfirmed sets Confirmed field to given value.

### HasConfirmed

`func (o *ModAssignGetParticipant200ResponseUser) HasConfirmed() bool`

HasConfirmed returns a boolean if a field has been set.

### GetCountry

`func (o *ModAssignGetParticipant200ResponseUser) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *ModAssignGetParticipant200ResponseUser) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *ModAssignGetParticipant200ResponseUser) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *ModAssignGetParticipant200ResponseUser) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCustomfields

`func (o *ModAssignGetParticipant200ResponseUser) GetCustomfields() []CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner`

GetCustomfields returns the Customfields field if non-nil, zero value otherwise.

### GetCustomfieldsOk

`func (o *ModAssignGetParticipant200ResponseUser) GetCustomfieldsOk() (*[]CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner, bool)`

GetCustomfieldsOk returns a tuple with the Customfields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfields

`func (o *ModAssignGetParticipant200ResponseUser) SetCustomfields(v []CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner)`

SetCustomfields sets Customfields field to given value.

### HasCustomfields

`func (o *ModAssignGetParticipant200ResponseUser) HasCustomfields() bool`

HasCustomfields returns a boolean if a field has been set.

### GetDepartment

`func (o *ModAssignGetParticipant200ResponseUser) GetDepartment() string`

GetDepartment returns the Department field if non-nil, zero value otherwise.

### GetDepartmentOk

`func (o *ModAssignGetParticipant200ResponseUser) GetDepartmentOk() (*string, bool)`

GetDepartmentOk returns a tuple with the Department field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDepartment

`func (o *ModAssignGetParticipant200ResponseUser) SetDepartment(v string)`

SetDepartment sets Department field to given value.

### HasDepartment

`func (o *ModAssignGetParticipant200ResponseUser) HasDepartment() bool`

HasDepartment returns a boolean if a field has been set.

### GetDescription

`func (o *ModAssignGetParticipant200ResponseUser) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ModAssignGetParticipant200ResponseUser) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ModAssignGetParticipant200ResponseUser) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ModAssignGetParticipant200ResponseUser) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *ModAssignGetParticipant200ResponseUser) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *ModAssignGetParticipant200ResponseUser) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *ModAssignGetParticipant200ResponseUser) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *ModAssignGetParticipant200ResponseUser) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetEmail

`func (o *ModAssignGetParticipant200ResponseUser) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *ModAssignGetParticipant200ResponseUser) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *ModAssignGetParticipant200ResponseUser) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *ModAssignGetParticipant200ResponseUser) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetFirstaccess

`func (o *ModAssignGetParticipant200ResponseUser) GetFirstaccess() int32`

GetFirstaccess returns the Firstaccess field if non-nil, zero value otherwise.

### GetFirstaccessOk

`func (o *ModAssignGetParticipant200ResponseUser) GetFirstaccessOk() (*int32, bool)`

GetFirstaccessOk returns a tuple with the Firstaccess field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstaccess

`func (o *ModAssignGetParticipant200ResponseUser) SetFirstaccess(v int32)`

SetFirstaccess sets Firstaccess field to given value.

### HasFirstaccess

`func (o *ModAssignGetParticipant200ResponseUser) HasFirstaccess() bool`

HasFirstaccess returns a boolean if a field has been set.

### GetFirstname

`func (o *ModAssignGetParticipant200ResponseUser) GetFirstname() string`

GetFirstname returns the Firstname field if non-nil, zero value otherwise.

### GetFirstnameOk

`func (o *ModAssignGetParticipant200ResponseUser) GetFirstnameOk() (*string, bool)`

GetFirstnameOk returns a tuple with the Firstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstname

`func (o *ModAssignGetParticipant200ResponseUser) SetFirstname(v string)`

SetFirstname sets Firstname field to given value.

### HasFirstname

`func (o *ModAssignGetParticipant200ResponseUser) HasFirstname() bool`

HasFirstname returns a boolean if a field has been set.

### GetFullname

`func (o *ModAssignGetParticipant200ResponseUser) GetFullname() string`

GetFullname returns the Fullname field if non-nil, zero value otherwise.

### GetFullnameOk

`func (o *ModAssignGetParticipant200ResponseUser) GetFullnameOk() (*string, bool)`

GetFullnameOk returns a tuple with the Fullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullname

`func (o *ModAssignGetParticipant200ResponseUser) SetFullname(v string)`

SetFullname sets Fullname field to given value.


### GetId

`func (o *ModAssignGetParticipant200ResponseUser) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModAssignGetParticipant200ResponseUser) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModAssignGetParticipant200ResponseUser) SetId(v int32)`

SetId sets Id field to given value.


### GetIdnumber

`func (o *ModAssignGetParticipant200ResponseUser) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *ModAssignGetParticipant200ResponseUser) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *ModAssignGetParticipant200ResponseUser) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *ModAssignGetParticipant200ResponseUser) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetInstitution

`func (o *ModAssignGetParticipant200ResponseUser) GetInstitution() string`

GetInstitution returns the Institution field if non-nil, zero value otherwise.

### GetInstitutionOk

`func (o *ModAssignGetParticipant200ResponseUser) GetInstitutionOk() (*string, bool)`

GetInstitutionOk returns a tuple with the Institution field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstitution

`func (o *ModAssignGetParticipant200ResponseUser) SetInstitution(v string)`

SetInstitution sets Institution field to given value.

### HasInstitution

`func (o *ModAssignGetParticipant200ResponseUser) HasInstitution() bool`

HasInstitution returns a boolean if a field has been set.

### GetInterests

`func (o *ModAssignGetParticipant200ResponseUser) GetInterests() string`

GetInterests returns the Interests field if non-nil, zero value otherwise.

### GetInterestsOk

`func (o *ModAssignGetParticipant200ResponseUser) GetInterestsOk() (*string, bool)`

GetInterestsOk returns a tuple with the Interests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterests

`func (o *ModAssignGetParticipant200ResponseUser) SetInterests(v string)`

SetInterests sets Interests field to given value.

### HasInterests

`func (o *ModAssignGetParticipant200ResponseUser) HasInterests() bool`

HasInterests returns a boolean if a field has been set.

### GetLang

`func (o *ModAssignGetParticipant200ResponseUser) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModAssignGetParticipant200ResponseUser) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModAssignGetParticipant200ResponseUser) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModAssignGetParticipant200ResponseUser) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetLastaccess

`func (o *ModAssignGetParticipant200ResponseUser) GetLastaccess() int32`

GetLastaccess returns the Lastaccess field if non-nil, zero value otherwise.

### GetLastaccessOk

`func (o *ModAssignGetParticipant200ResponseUser) GetLastaccessOk() (*int32, bool)`

GetLastaccessOk returns a tuple with the Lastaccess field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastaccess

`func (o *ModAssignGetParticipant200ResponseUser) SetLastaccess(v int32)`

SetLastaccess sets Lastaccess field to given value.

### HasLastaccess

`func (o *ModAssignGetParticipant200ResponseUser) HasLastaccess() bool`

HasLastaccess returns a boolean if a field has been set.

### GetLastname

`func (o *ModAssignGetParticipant200ResponseUser) GetLastname() string`

GetLastname returns the Lastname field if non-nil, zero value otherwise.

### GetLastnameOk

`func (o *ModAssignGetParticipant200ResponseUser) GetLastnameOk() (*string, bool)`

GetLastnameOk returns a tuple with the Lastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastname

`func (o *ModAssignGetParticipant200ResponseUser) SetLastname(v string)`

SetLastname sets Lastname field to given value.

### HasLastname

`func (o *ModAssignGetParticipant200ResponseUser) HasLastname() bool`

HasLastname returns a boolean if a field has been set.

### GetMailformat

`func (o *ModAssignGetParticipant200ResponseUser) GetMailformat() int32`

GetMailformat returns the Mailformat field if non-nil, zero value otherwise.

### GetMailformatOk

`func (o *ModAssignGetParticipant200ResponseUser) GetMailformatOk() (*int32, bool)`

GetMailformatOk returns a tuple with the Mailformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMailformat

`func (o *ModAssignGetParticipant200ResponseUser) SetMailformat(v int32)`

SetMailformat sets Mailformat field to given value.

### HasMailformat

`func (o *ModAssignGetParticipant200ResponseUser) HasMailformat() bool`

HasMailformat returns a boolean if a field has been set.

### GetPhone1

`func (o *ModAssignGetParticipant200ResponseUser) GetPhone1() string`

GetPhone1 returns the Phone1 field if non-nil, zero value otherwise.

### GetPhone1Ok

`func (o *ModAssignGetParticipant200ResponseUser) GetPhone1Ok() (*string, bool)`

GetPhone1Ok returns a tuple with the Phone1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhone1

`func (o *ModAssignGetParticipant200ResponseUser) SetPhone1(v string)`

SetPhone1 sets Phone1 field to given value.

### HasPhone1

`func (o *ModAssignGetParticipant200ResponseUser) HasPhone1() bool`

HasPhone1 returns a boolean if a field has been set.

### GetPhone2

`func (o *ModAssignGetParticipant200ResponseUser) GetPhone2() string`

GetPhone2 returns the Phone2 field if non-nil, zero value otherwise.

### GetPhone2Ok

`func (o *ModAssignGetParticipant200ResponseUser) GetPhone2Ok() (*string, bool)`

GetPhone2Ok returns a tuple with the Phone2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhone2

`func (o *ModAssignGetParticipant200ResponseUser) SetPhone2(v string)`

SetPhone2 sets Phone2 field to given value.

### HasPhone2

`func (o *ModAssignGetParticipant200ResponseUser) HasPhone2() bool`

HasPhone2 returns a boolean if a field has been set.

### GetPreferences

`func (o *ModAssignGetParticipant200ResponseUser) GetPreferences() []CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner`

GetPreferences returns the Preferences field if non-nil, zero value otherwise.

### GetPreferencesOk

`func (o *ModAssignGetParticipant200ResponseUser) GetPreferencesOk() (*[]CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner, bool)`

GetPreferencesOk returns a tuple with the Preferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferences

`func (o *ModAssignGetParticipant200ResponseUser) SetPreferences(v []CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner)`

SetPreferences sets Preferences field to given value.

### HasPreferences

`func (o *ModAssignGetParticipant200ResponseUser) HasPreferences() bool`

HasPreferences returns a boolean if a field has been set.

### GetProfileimageurl

`func (o *ModAssignGetParticipant200ResponseUser) GetProfileimageurl() string`

GetProfileimageurl returns the Profileimageurl field if non-nil, zero value otherwise.

### GetProfileimageurlOk

`func (o *ModAssignGetParticipant200ResponseUser) GetProfileimageurlOk() (*string, bool)`

GetProfileimageurlOk returns a tuple with the Profileimageurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileimageurl

`func (o *ModAssignGetParticipant200ResponseUser) SetProfileimageurl(v string)`

SetProfileimageurl sets Profileimageurl field to given value.


### GetProfileimageurlsmall

`func (o *ModAssignGetParticipant200ResponseUser) GetProfileimageurlsmall() string`

GetProfileimageurlsmall returns the Profileimageurlsmall field if non-nil, zero value otherwise.

### GetProfileimageurlsmallOk

`func (o *ModAssignGetParticipant200ResponseUser) GetProfileimageurlsmallOk() (*string, bool)`

GetProfileimageurlsmallOk returns a tuple with the Profileimageurlsmall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileimageurlsmall

`func (o *ModAssignGetParticipant200ResponseUser) SetProfileimageurlsmall(v string)`

SetProfileimageurlsmall sets Profileimageurlsmall field to given value.


### GetSuspended

`func (o *ModAssignGetParticipant200ResponseUser) GetSuspended() bool`

GetSuspended returns the Suspended field if non-nil, zero value otherwise.

### GetSuspendedOk

`func (o *ModAssignGetParticipant200ResponseUser) GetSuspendedOk() (*bool, bool)`

GetSuspendedOk returns a tuple with the Suspended field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuspended

`func (o *ModAssignGetParticipant200ResponseUser) SetSuspended(v bool)`

SetSuspended sets Suspended field to given value.

### HasSuspended

`func (o *ModAssignGetParticipant200ResponseUser) HasSuspended() bool`

HasSuspended returns a boolean if a field has been set.

### GetTheme

`func (o *ModAssignGetParticipant200ResponseUser) GetTheme() string`

GetTheme returns the Theme field if non-nil, zero value otherwise.

### GetThemeOk

`func (o *ModAssignGetParticipant200ResponseUser) GetThemeOk() (*string, bool)`

GetThemeOk returns a tuple with the Theme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTheme

`func (o *ModAssignGetParticipant200ResponseUser) SetTheme(v string)`

SetTheme sets Theme field to given value.

### HasTheme

`func (o *ModAssignGetParticipant200ResponseUser) HasTheme() bool`

HasTheme returns a boolean if a field has been set.

### GetTimezone

`func (o *ModAssignGetParticipant200ResponseUser) GetTimezone() string`

GetTimezone returns the Timezone field if non-nil, zero value otherwise.

### GetTimezoneOk

`func (o *ModAssignGetParticipant200ResponseUser) GetTimezoneOk() (*string, bool)`

GetTimezoneOk returns a tuple with the Timezone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimezone

`func (o *ModAssignGetParticipant200ResponseUser) SetTimezone(v string)`

SetTimezone sets Timezone field to given value.

### HasTimezone

`func (o *ModAssignGetParticipant200ResponseUser) HasTimezone() bool`

HasTimezone returns a boolean if a field has been set.

### GetUsername

`func (o *ModAssignGetParticipant200ResponseUser) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *ModAssignGetParticipant200ResponseUser) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *ModAssignGetParticipant200ResponseUser) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *ModAssignGetParticipant200ResponseUser) HasUsername() bool`

HasUsername returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


