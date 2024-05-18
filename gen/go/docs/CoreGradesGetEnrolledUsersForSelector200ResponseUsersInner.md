# CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | Pointer to **string** | Postal address | [optional] [default to "null"]
**Auth** | Pointer to **string** | Auth plugins include manual, ldap, etc | [optional] [default to "null"]
**Calendartype** | Pointer to **string** | Calendar type such as \&quot;gregorian\&quot;, must exist on server | [optional] [default to "null"]
**City** | Pointer to **string** | Home city of the user | [optional] [default to "null"]
**Confirmed** | Pointer to **bool** | Active user: 1 if confirmed, 0 otherwise | [optional] [default to null]
**Country** | Pointer to **string** | Home country code of the user, such as AU or CZ | [optional] [default to "null"]
**Customfields** | Pointer to [**[]CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner**](CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.md) |  | [optional] 
**Department** | Pointer to **string** | department | [optional] [default to "null"]
**Description** | Pointer to **string** | User profile description | [optional] [default to "null"]
**Descriptionformat** | Pointer to **int32** | int format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Email** | Pointer to **string** | An email address - allow email as root@localhost | [optional] 
**Firstaccess** | Pointer to **int32** | first access to the site (0 if never) | [optional] [default to null]
**Firstname** | Pointer to **string** | The first name(s) of the user | [optional] 
**Fullname** | Pointer to **string** | The fullname of the user | [optional] [default to "null"]
**Id** | Pointer to **int32** | ID of the user | [optional] 
**Idnumber** | Pointer to **string** | An arbitrary ID code number perhaps from the institution | [optional] [default to "null"]
**Institution** | Pointer to **string** | institution | [optional] [default to "null"]
**Interests** | Pointer to **string** | user interests (separated by commas) | [optional] [default to "null"]
**Lang** | Pointer to **string** | Language code such as \&quot;en\&quot;, must exist on server | [optional] [default to "null"]
**Lastaccess** | Pointer to **int32** | last access to the site (0 if never) | [optional] [default to null]
**Lastname** | Pointer to **string** | The family name of the user | [optional] 
**Mailformat** | Pointer to **int32** | Mail format code is 0 for plain text, 1 for HTML etc | [optional] [default to null]
**Phone1** | Pointer to **string** | Phone 1 | [optional] [default to "null"]
**Phone2** | Pointer to **string** | Phone 2 | [optional] [default to "null"]
**Preferences** | Pointer to [**[]CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner**](CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner.md) |  | [optional] 
**Profileimageurl** | Pointer to **string** | User image profile URL - big version | [optional] [default to "null"]
**Profileimageurlsmall** | Pointer to **string** | User image profile URL - small version | [optional] [default to "null"]
**Suspended** | Pointer to **bool** | Suspend user account, either false to enable user login or true to disable it | [optional] [default to null]
**Theme** | Pointer to **string** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional] [default to "null"]
**Timezone** | Pointer to **string** | Timezone code such as Australia/Perth, or 99 for default | [optional] [default to "null"]
**Username** | Pointer to **string** | The username | [optional] [default to "null"]

## Methods

### NewCoreGradesGetEnrolledUsersForSelector200ResponseUsersInner

`func NewCoreGradesGetEnrolledUsersForSelector200ResponseUsersInner() *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner`

NewCoreGradesGetEnrolledUsersForSelector200ResponseUsersInner instantiates a new CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerWithDefaults

`func NewCoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerWithDefaults() *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner`

NewCoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerWithDefaults instantiates a new CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddress

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetAddress() string`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetAddressOk() (*string, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetAddress(v string)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetAuth

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetAuth() string`

GetAuth returns the Auth field if non-nil, zero value otherwise.

### GetAuthOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetAuthOk() (*string, bool)`

GetAuthOk returns a tuple with the Auth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuth

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetAuth(v string)`

SetAuth sets Auth field to given value.

### HasAuth

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasAuth() bool`

HasAuth returns a boolean if a field has been set.

### GetCalendartype

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetCalendartype() string`

GetCalendartype returns the Calendartype field if non-nil, zero value otherwise.

### GetCalendartypeOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetCalendartypeOk() (*string, bool)`

GetCalendartypeOk returns a tuple with the Calendartype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCalendartype

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetCalendartype(v string)`

SetCalendartype sets Calendartype field to given value.

### HasCalendartype

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasCalendartype() bool`

HasCalendartype returns a boolean if a field has been set.

### GetCity

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetConfirmed

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetConfirmed() bool`

GetConfirmed returns the Confirmed field if non-nil, zero value otherwise.

### GetConfirmedOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetConfirmedOk() (*bool, bool)`

GetConfirmedOk returns a tuple with the Confirmed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfirmed

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetConfirmed(v bool)`

SetConfirmed sets Confirmed field to given value.

### HasConfirmed

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasConfirmed() bool`

HasConfirmed returns a boolean if a field has been set.

### GetCountry

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCustomfields

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetCustomfields() []CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner`

GetCustomfields returns the Customfields field if non-nil, zero value otherwise.

### GetCustomfieldsOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetCustomfieldsOk() (*[]CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner, bool)`

GetCustomfieldsOk returns a tuple with the Customfields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfields

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetCustomfields(v []CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner)`

SetCustomfields sets Customfields field to given value.

### HasCustomfields

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasCustomfields() bool`

HasCustomfields returns a boolean if a field has been set.

### GetDepartment

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetDepartment() string`

GetDepartment returns the Department field if non-nil, zero value otherwise.

### GetDepartmentOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetDepartmentOk() (*string, bool)`

GetDepartmentOk returns a tuple with the Department field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDepartment

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetDepartment(v string)`

SetDepartment sets Department field to given value.

### HasDepartment

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasDepartment() bool`

HasDepartment returns a boolean if a field has been set.

### GetDescription

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetEmail

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetFirstaccess

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetFirstaccess() int32`

GetFirstaccess returns the Firstaccess field if non-nil, zero value otherwise.

### GetFirstaccessOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetFirstaccessOk() (*int32, bool)`

GetFirstaccessOk returns a tuple with the Firstaccess field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstaccess

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetFirstaccess(v int32)`

SetFirstaccess sets Firstaccess field to given value.

### HasFirstaccess

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasFirstaccess() bool`

HasFirstaccess returns a boolean if a field has been set.

### GetFirstname

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetFirstname() string`

GetFirstname returns the Firstname field if non-nil, zero value otherwise.

### GetFirstnameOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetFirstnameOk() (*string, bool)`

GetFirstnameOk returns a tuple with the Firstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstname

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetFirstname(v string)`

SetFirstname sets Firstname field to given value.

### HasFirstname

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasFirstname() bool`

HasFirstname returns a boolean if a field has been set.

### GetFullname

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetFullname() string`

GetFullname returns the Fullname field if non-nil, zero value otherwise.

### GetFullnameOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetFullnameOk() (*string, bool)`

GetFullnameOk returns a tuple with the Fullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullname

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetFullname(v string)`

SetFullname sets Fullname field to given value.

### HasFullname

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasFullname() bool`

HasFullname returns a boolean if a field has been set.

### GetId

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetInstitution

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetInstitution() string`

GetInstitution returns the Institution field if non-nil, zero value otherwise.

### GetInstitutionOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetInstitutionOk() (*string, bool)`

GetInstitutionOk returns a tuple with the Institution field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstitution

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetInstitution(v string)`

SetInstitution sets Institution field to given value.

### HasInstitution

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasInstitution() bool`

HasInstitution returns a boolean if a field has been set.

### GetInterests

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetInterests() string`

GetInterests returns the Interests field if non-nil, zero value otherwise.

### GetInterestsOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetInterestsOk() (*string, bool)`

GetInterestsOk returns a tuple with the Interests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterests

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetInterests(v string)`

SetInterests sets Interests field to given value.

### HasInterests

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasInterests() bool`

HasInterests returns a boolean if a field has been set.

### GetLang

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetLastaccess

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetLastaccess() int32`

GetLastaccess returns the Lastaccess field if non-nil, zero value otherwise.

### GetLastaccessOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetLastaccessOk() (*int32, bool)`

GetLastaccessOk returns a tuple with the Lastaccess field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastaccess

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetLastaccess(v int32)`

SetLastaccess sets Lastaccess field to given value.

### HasLastaccess

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasLastaccess() bool`

HasLastaccess returns a boolean if a field has been set.

### GetLastname

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetLastname() string`

GetLastname returns the Lastname field if non-nil, zero value otherwise.

### GetLastnameOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetLastnameOk() (*string, bool)`

GetLastnameOk returns a tuple with the Lastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastname

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetLastname(v string)`

SetLastname sets Lastname field to given value.

### HasLastname

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasLastname() bool`

HasLastname returns a boolean if a field has been set.

### GetMailformat

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetMailformat() int32`

GetMailformat returns the Mailformat field if non-nil, zero value otherwise.

### GetMailformatOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetMailformatOk() (*int32, bool)`

GetMailformatOk returns a tuple with the Mailformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMailformat

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetMailformat(v int32)`

SetMailformat sets Mailformat field to given value.

### HasMailformat

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasMailformat() bool`

HasMailformat returns a boolean if a field has been set.

### GetPhone1

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetPhone1() string`

GetPhone1 returns the Phone1 field if non-nil, zero value otherwise.

### GetPhone1Ok

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetPhone1Ok() (*string, bool)`

GetPhone1Ok returns a tuple with the Phone1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhone1

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetPhone1(v string)`

SetPhone1 sets Phone1 field to given value.

### HasPhone1

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasPhone1() bool`

HasPhone1 returns a boolean if a field has been set.

### GetPhone2

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetPhone2() string`

GetPhone2 returns the Phone2 field if non-nil, zero value otherwise.

### GetPhone2Ok

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetPhone2Ok() (*string, bool)`

GetPhone2Ok returns a tuple with the Phone2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhone2

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetPhone2(v string)`

SetPhone2 sets Phone2 field to given value.

### HasPhone2

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasPhone2() bool`

HasPhone2 returns a boolean if a field has been set.

### GetPreferences

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetPreferences() []CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner`

GetPreferences returns the Preferences field if non-nil, zero value otherwise.

### GetPreferencesOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetPreferencesOk() (*[]CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner, bool)`

GetPreferencesOk returns a tuple with the Preferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferences

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetPreferences(v []CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner)`

SetPreferences sets Preferences field to given value.

### HasPreferences

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasPreferences() bool`

HasPreferences returns a boolean if a field has been set.

### GetProfileimageurl

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetProfileimageurl() string`

GetProfileimageurl returns the Profileimageurl field if non-nil, zero value otherwise.

### GetProfileimageurlOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetProfileimageurlOk() (*string, bool)`

GetProfileimageurlOk returns a tuple with the Profileimageurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileimageurl

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetProfileimageurl(v string)`

SetProfileimageurl sets Profileimageurl field to given value.

### HasProfileimageurl

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasProfileimageurl() bool`

HasProfileimageurl returns a boolean if a field has been set.

### GetProfileimageurlsmall

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetProfileimageurlsmall() string`

GetProfileimageurlsmall returns the Profileimageurlsmall field if non-nil, zero value otherwise.

### GetProfileimageurlsmallOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetProfileimageurlsmallOk() (*string, bool)`

GetProfileimageurlsmallOk returns a tuple with the Profileimageurlsmall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileimageurlsmall

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetProfileimageurlsmall(v string)`

SetProfileimageurlsmall sets Profileimageurlsmall field to given value.

### HasProfileimageurlsmall

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasProfileimageurlsmall() bool`

HasProfileimageurlsmall returns a boolean if a field has been set.

### GetSuspended

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetSuspended() bool`

GetSuspended returns the Suspended field if non-nil, zero value otherwise.

### GetSuspendedOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetSuspendedOk() (*bool, bool)`

GetSuspendedOk returns a tuple with the Suspended field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuspended

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetSuspended(v bool)`

SetSuspended sets Suspended field to given value.

### HasSuspended

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasSuspended() bool`

HasSuspended returns a boolean if a field has been set.

### GetTheme

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetTheme() string`

GetTheme returns the Theme field if non-nil, zero value otherwise.

### GetThemeOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetThemeOk() (*string, bool)`

GetThemeOk returns a tuple with the Theme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTheme

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetTheme(v string)`

SetTheme sets Theme field to given value.

### HasTheme

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasTheme() bool`

HasTheme returns a boolean if a field has been set.

### GetTimezone

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetTimezone() string`

GetTimezone returns the Timezone field if non-nil, zero value otherwise.

### GetTimezoneOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetTimezoneOk() (*string, bool)`

GetTimezoneOk returns a tuple with the Timezone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimezone

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetTimezone(v string)`

SetTimezone sets Timezone field to given value.

### HasTimezone

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasTimezone() bool`

HasTimezone returns a boolean if a field has been set.

### GetUsername

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner) HasUsername() bool`

HasUsername returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


