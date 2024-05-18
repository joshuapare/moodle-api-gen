# CoreUserUpdateUsersRequestUsersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | Pointer to **string** | Postal address | [optional] 
**Alternatename** | Pointer to **string** | The alternate name of the user | [optional] 
**Auth** | Pointer to **string** | Auth plugins include manual, ldap, etc | [optional] [default to ""]
**Calendartype** | Pointer to **string** | Calendar type such as \&quot;gregorian\&quot;, must exist on server | [optional] [default to ""]
**City** | Pointer to **string** | Home city of the user | [optional] 
**Country** | Pointer to **string** | Home country code of the user, such as AU or CZ | [optional] 
**Customfields** | Pointer to [**[]CoreUserCreateUsersRequestUsersInnerCustomfieldsInner**](CoreUserCreateUsersRequestUsersInnerCustomfieldsInner.md) |  | [optional] 
**Department** | Pointer to **string** | Department | [optional] [default to "null"]
**Description** | Pointer to **string** | User profile description, no HTML | [optional] 
**Email** | Pointer to **string** | A valid and unique email address | [optional] [default to ""]
**Firstname** | Pointer to **string** | The first name(s) of the user | [optional] [default to ""]
**Firstnamephonetic** | Pointer to **string** | The first name(s) phonetically of the user | [optional] 
**Id** | Pointer to **int32** | ID of the user | [optional] 
**Idnumber** | Pointer to **string** | An arbitrary ID code number perhaps from the institution | [optional] 
**Institution** | Pointer to **string** | Institution | [optional] [default to "null"]
**Interests** | Pointer to **string** | User interests (separated by commas) | [optional] 
**Lang** | Pointer to **string** | Language code such as \&quot;en\&quot;, must exist on server | [optional] [default to ""]
**Lastname** | Pointer to **string** | The family name of the user | [optional] 
**Lastnamephonetic** | Pointer to **string** | The family name phonetically of the user | [optional] 
**Maildisplay** | Pointer to **int32** | Email visibility | [optional] 
**Mailformat** | Pointer to **int32** | Mail format code is 0 for plain text, 1 for HTML etc | [optional] 
**Middlename** | Pointer to **string** | The middle name of the user | [optional] 
**Password** | Pointer to **string** | Plain text password consisting of any characters | [optional] [default to ""]
**Phone1** | Pointer to **string** | Phone | [optional] [default to "null"]
**Phone2** | Pointer to **string** | Mobile phone | [optional] [default to "null"]
**Preferences** | Pointer to [**[]CoreUserUpdateUsersRequestUsersInnerPreferencesInner**](CoreUserUpdateUsersRequestUsersInnerPreferencesInner.md) |  | [optional] 
**Suspended** | Pointer to **bool** | Suspend user account, either false to enable user login or true to disable it | [optional] 
**Theme** | Pointer to **string** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional] 
**Timezone** | Pointer to **string** | Timezone code such as Australia/Perth, or 99 for default | [optional] 
**Username** | Pointer to **string** | Username policy is defined in Moodle security config. | [optional] [default to ""]
**Userpicture** | Pointer to **int32** | The itemid where the new user picture has been uploaded to, 0 to delete | [optional] [default to null]

## Methods

### NewCoreUserUpdateUsersRequestUsersInner

`func NewCoreUserUpdateUsersRequestUsersInner() *CoreUserUpdateUsersRequestUsersInner`

NewCoreUserUpdateUsersRequestUsersInner instantiates a new CoreUserUpdateUsersRequestUsersInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserUpdateUsersRequestUsersInnerWithDefaults

`func NewCoreUserUpdateUsersRequestUsersInnerWithDefaults() *CoreUserUpdateUsersRequestUsersInner`

NewCoreUserUpdateUsersRequestUsersInnerWithDefaults instantiates a new CoreUserUpdateUsersRequestUsersInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddress

`func (o *CoreUserUpdateUsersRequestUsersInner) GetAddress() string`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetAddressOk() (*string, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *CoreUserUpdateUsersRequestUsersInner) SetAddress(v string)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *CoreUserUpdateUsersRequestUsersInner) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetAlternatename

`func (o *CoreUserUpdateUsersRequestUsersInner) GetAlternatename() string`

GetAlternatename returns the Alternatename field if non-nil, zero value otherwise.

### GetAlternatenameOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetAlternatenameOk() (*string, bool)`

GetAlternatenameOk returns a tuple with the Alternatename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAlternatename

`func (o *CoreUserUpdateUsersRequestUsersInner) SetAlternatename(v string)`

SetAlternatename sets Alternatename field to given value.

### HasAlternatename

`func (o *CoreUserUpdateUsersRequestUsersInner) HasAlternatename() bool`

HasAlternatename returns a boolean if a field has been set.

### GetAuth

`func (o *CoreUserUpdateUsersRequestUsersInner) GetAuth() string`

GetAuth returns the Auth field if non-nil, zero value otherwise.

### GetAuthOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetAuthOk() (*string, bool)`

GetAuthOk returns a tuple with the Auth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuth

`func (o *CoreUserUpdateUsersRequestUsersInner) SetAuth(v string)`

SetAuth sets Auth field to given value.

### HasAuth

`func (o *CoreUserUpdateUsersRequestUsersInner) HasAuth() bool`

HasAuth returns a boolean if a field has been set.

### GetCalendartype

`func (o *CoreUserUpdateUsersRequestUsersInner) GetCalendartype() string`

GetCalendartype returns the Calendartype field if non-nil, zero value otherwise.

### GetCalendartypeOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetCalendartypeOk() (*string, bool)`

GetCalendartypeOk returns a tuple with the Calendartype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCalendartype

`func (o *CoreUserUpdateUsersRequestUsersInner) SetCalendartype(v string)`

SetCalendartype sets Calendartype field to given value.

### HasCalendartype

`func (o *CoreUserUpdateUsersRequestUsersInner) HasCalendartype() bool`

HasCalendartype returns a boolean if a field has been set.

### GetCity

`func (o *CoreUserUpdateUsersRequestUsersInner) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *CoreUserUpdateUsersRequestUsersInner) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *CoreUserUpdateUsersRequestUsersInner) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetCountry

`func (o *CoreUserUpdateUsersRequestUsersInner) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CoreUserUpdateUsersRequestUsersInner) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *CoreUserUpdateUsersRequestUsersInner) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCustomfields

`func (o *CoreUserUpdateUsersRequestUsersInner) GetCustomfields() []CoreUserCreateUsersRequestUsersInnerCustomfieldsInner`

GetCustomfields returns the Customfields field if non-nil, zero value otherwise.

### GetCustomfieldsOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetCustomfieldsOk() (*[]CoreUserCreateUsersRequestUsersInnerCustomfieldsInner, bool)`

GetCustomfieldsOk returns a tuple with the Customfields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfields

`func (o *CoreUserUpdateUsersRequestUsersInner) SetCustomfields(v []CoreUserCreateUsersRequestUsersInnerCustomfieldsInner)`

SetCustomfields sets Customfields field to given value.

### HasCustomfields

`func (o *CoreUserUpdateUsersRequestUsersInner) HasCustomfields() bool`

HasCustomfields returns a boolean if a field has been set.

### GetDepartment

`func (o *CoreUserUpdateUsersRequestUsersInner) GetDepartment() string`

GetDepartment returns the Department field if non-nil, zero value otherwise.

### GetDepartmentOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetDepartmentOk() (*string, bool)`

GetDepartmentOk returns a tuple with the Department field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDepartment

`func (o *CoreUserUpdateUsersRequestUsersInner) SetDepartment(v string)`

SetDepartment sets Department field to given value.

### HasDepartment

`func (o *CoreUserUpdateUsersRequestUsersInner) HasDepartment() bool`

HasDepartment returns a boolean if a field has been set.

### GetDescription

`func (o *CoreUserUpdateUsersRequestUsersInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreUserUpdateUsersRequestUsersInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreUserUpdateUsersRequestUsersInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetEmail

`func (o *CoreUserUpdateUsersRequestUsersInner) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *CoreUserUpdateUsersRequestUsersInner) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *CoreUserUpdateUsersRequestUsersInner) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetFirstname

`func (o *CoreUserUpdateUsersRequestUsersInner) GetFirstname() string`

GetFirstname returns the Firstname field if non-nil, zero value otherwise.

### GetFirstnameOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetFirstnameOk() (*string, bool)`

GetFirstnameOk returns a tuple with the Firstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstname

`func (o *CoreUserUpdateUsersRequestUsersInner) SetFirstname(v string)`

SetFirstname sets Firstname field to given value.

### HasFirstname

`func (o *CoreUserUpdateUsersRequestUsersInner) HasFirstname() bool`

HasFirstname returns a boolean if a field has been set.

### GetFirstnamephonetic

`func (o *CoreUserUpdateUsersRequestUsersInner) GetFirstnamephonetic() string`

GetFirstnamephonetic returns the Firstnamephonetic field if non-nil, zero value otherwise.

### GetFirstnamephoneticOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetFirstnamephoneticOk() (*string, bool)`

GetFirstnamephoneticOk returns a tuple with the Firstnamephonetic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstnamephonetic

`func (o *CoreUserUpdateUsersRequestUsersInner) SetFirstnamephonetic(v string)`

SetFirstnamephonetic sets Firstnamephonetic field to given value.

### HasFirstnamephonetic

`func (o *CoreUserUpdateUsersRequestUsersInner) HasFirstnamephonetic() bool`

HasFirstnamephonetic returns a boolean if a field has been set.

### GetId

`func (o *CoreUserUpdateUsersRequestUsersInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreUserUpdateUsersRequestUsersInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreUserUpdateUsersRequestUsersInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreUserUpdateUsersRequestUsersInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreUserUpdateUsersRequestUsersInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreUserUpdateUsersRequestUsersInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetInstitution

`func (o *CoreUserUpdateUsersRequestUsersInner) GetInstitution() string`

GetInstitution returns the Institution field if non-nil, zero value otherwise.

### GetInstitutionOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetInstitutionOk() (*string, bool)`

GetInstitutionOk returns a tuple with the Institution field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstitution

`func (o *CoreUserUpdateUsersRequestUsersInner) SetInstitution(v string)`

SetInstitution sets Institution field to given value.

### HasInstitution

`func (o *CoreUserUpdateUsersRequestUsersInner) HasInstitution() bool`

HasInstitution returns a boolean if a field has been set.

### GetInterests

`func (o *CoreUserUpdateUsersRequestUsersInner) GetInterests() string`

GetInterests returns the Interests field if non-nil, zero value otherwise.

### GetInterestsOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetInterestsOk() (*string, bool)`

GetInterestsOk returns a tuple with the Interests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterests

`func (o *CoreUserUpdateUsersRequestUsersInner) SetInterests(v string)`

SetInterests sets Interests field to given value.

### HasInterests

`func (o *CoreUserUpdateUsersRequestUsersInner) HasInterests() bool`

HasInterests returns a boolean if a field has been set.

### GetLang

`func (o *CoreUserUpdateUsersRequestUsersInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *CoreUserUpdateUsersRequestUsersInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *CoreUserUpdateUsersRequestUsersInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetLastname

`func (o *CoreUserUpdateUsersRequestUsersInner) GetLastname() string`

GetLastname returns the Lastname field if non-nil, zero value otherwise.

### GetLastnameOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetLastnameOk() (*string, bool)`

GetLastnameOk returns a tuple with the Lastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastname

`func (o *CoreUserUpdateUsersRequestUsersInner) SetLastname(v string)`

SetLastname sets Lastname field to given value.

### HasLastname

`func (o *CoreUserUpdateUsersRequestUsersInner) HasLastname() bool`

HasLastname returns a boolean if a field has been set.

### GetLastnamephonetic

`func (o *CoreUserUpdateUsersRequestUsersInner) GetLastnamephonetic() string`

GetLastnamephonetic returns the Lastnamephonetic field if non-nil, zero value otherwise.

### GetLastnamephoneticOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetLastnamephoneticOk() (*string, bool)`

GetLastnamephoneticOk returns a tuple with the Lastnamephonetic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastnamephonetic

`func (o *CoreUserUpdateUsersRequestUsersInner) SetLastnamephonetic(v string)`

SetLastnamephonetic sets Lastnamephonetic field to given value.

### HasLastnamephonetic

`func (o *CoreUserUpdateUsersRequestUsersInner) HasLastnamephonetic() bool`

HasLastnamephonetic returns a boolean if a field has been set.

### GetMaildisplay

`func (o *CoreUserUpdateUsersRequestUsersInner) GetMaildisplay() int32`

GetMaildisplay returns the Maildisplay field if non-nil, zero value otherwise.

### GetMaildisplayOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetMaildisplayOk() (*int32, bool)`

GetMaildisplayOk returns a tuple with the Maildisplay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaildisplay

`func (o *CoreUserUpdateUsersRequestUsersInner) SetMaildisplay(v int32)`

SetMaildisplay sets Maildisplay field to given value.

### HasMaildisplay

`func (o *CoreUserUpdateUsersRequestUsersInner) HasMaildisplay() bool`

HasMaildisplay returns a boolean if a field has been set.

### GetMailformat

`func (o *CoreUserUpdateUsersRequestUsersInner) GetMailformat() int32`

GetMailformat returns the Mailformat field if non-nil, zero value otherwise.

### GetMailformatOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetMailformatOk() (*int32, bool)`

GetMailformatOk returns a tuple with the Mailformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMailformat

`func (o *CoreUserUpdateUsersRequestUsersInner) SetMailformat(v int32)`

SetMailformat sets Mailformat field to given value.

### HasMailformat

`func (o *CoreUserUpdateUsersRequestUsersInner) HasMailformat() bool`

HasMailformat returns a boolean if a field has been set.

### GetMiddlename

`func (o *CoreUserUpdateUsersRequestUsersInner) GetMiddlename() string`

GetMiddlename returns the Middlename field if non-nil, zero value otherwise.

### GetMiddlenameOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetMiddlenameOk() (*string, bool)`

GetMiddlenameOk returns a tuple with the Middlename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMiddlename

`func (o *CoreUserUpdateUsersRequestUsersInner) SetMiddlename(v string)`

SetMiddlename sets Middlename field to given value.

### HasMiddlename

`func (o *CoreUserUpdateUsersRequestUsersInner) HasMiddlename() bool`

HasMiddlename returns a boolean if a field has been set.

### GetPassword

`func (o *CoreUserUpdateUsersRequestUsersInner) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *CoreUserUpdateUsersRequestUsersInner) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *CoreUserUpdateUsersRequestUsersInner) HasPassword() bool`

HasPassword returns a boolean if a field has been set.

### GetPhone1

`func (o *CoreUserUpdateUsersRequestUsersInner) GetPhone1() string`

GetPhone1 returns the Phone1 field if non-nil, zero value otherwise.

### GetPhone1Ok

`func (o *CoreUserUpdateUsersRequestUsersInner) GetPhone1Ok() (*string, bool)`

GetPhone1Ok returns a tuple with the Phone1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhone1

`func (o *CoreUserUpdateUsersRequestUsersInner) SetPhone1(v string)`

SetPhone1 sets Phone1 field to given value.

### HasPhone1

`func (o *CoreUserUpdateUsersRequestUsersInner) HasPhone1() bool`

HasPhone1 returns a boolean if a field has been set.

### GetPhone2

`func (o *CoreUserUpdateUsersRequestUsersInner) GetPhone2() string`

GetPhone2 returns the Phone2 field if non-nil, zero value otherwise.

### GetPhone2Ok

`func (o *CoreUserUpdateUsersRequestUsersInner) GetPhone2Ok() (*string, bool)`

GetPhone2Ok returns a tuple with the Phone2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhone2

`func (o *CoreUserUpdateUsersRequestUsersInner) SetPhone2(v string)`

SetPhone2 sets Phone2 field to given value.

### HasPhone2

`func (o *CoreUserUpdateUsersRequestUsersInner) HasPhone2() bool`

HasPhone2 returns a boolean if a field has been set.

### GetPreferences

`func (o *CoreUserUpdateUsersRequestUsersInner) GetPreferences() []CoreUserUpdateUsersRequestUsersInnerPreferencesInner`

GetPreferences returns the Preferences field if non-nil, zero value otherwise.

### GetPreferencesOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetPreferencesOk() (*[]CoreUserUpdateUsersRequestUsersInnerPreferencesInner, bool)`

GetPreferencesOk returns a tuple with the Preferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferences

`func (o *CoreUserUpdateUsersRequestUsersInner) SetPreferences(v []CoreUserUpdateUsersRequestUsersInnerPreferencesInner)`

SetPreferences sets Preferences field to given value.

### HasPreferences

`func (o *CoreUserUpdateUsersRequestUsersInner) HasPreferences() bool`

HasPreferences returns a boolean if a field has been set.

### GetSuspended

`func (o *CoreUserUpdateUsersRequestUsersInner) GetSuspended() bool`

GetSuspended returns the Suspended field if non-nil, zero value otherwise.

### GetSuspendedOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetSuspendedOk() (*bool, bool)`

GetSuspendedOk returns a tuple with the Suspended field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuspended

`func (o *CoreUserUpdateUsersRequestUsersInner) SetSuspended(v bool)`

SetSuspended sets Suspended field to given value.

### HasSuspended

`func (o *CoreUserUpdateUsersRequestUsersInner) HasSuspended() bool`

HasSuspended returns a boolean if a field has been set.

### GetTheme

`func (o *CoreUserUpdateUsersRequestUsersInner) GetTheme() string`

GetTheme returns the Theme field if non-nil, zero value otherwise.

### GetThemeOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetThemeOk() (*string, bool)`

GetThemeOk returns a tuple with the Theme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTheme

`func (o *CoreUserUpdateUsersRequestUsersInner) SetTheme(v string)`

SetTheme sets Theme field to given value.

### HasTheme

`func (o *CoreUserUpdateUsersRequestUsersInner) HasTheme() bool`

HasTheme returns a boolean if a field has been set.

### GetTimezone

`func (o *CoreUserUpdateUsersRequestUsersInner) GetTimezone() string`

GetTimezone returns the Timezone field if non-nil, zero value otherwise.

### GetTimezoneOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetTimezoneOk() (*string, bool)`

GetTimezoneOk returns a tuple with the Timezone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimezone

`func (o *CoreUserUpdateUsersRequestUsersInner) SetTimezone(v string)`

SetTimezone sets Timezone field to given value.

### HasTimezone

`func (o *CoreUserUpdateUsersRequestUsersInner) HasTimezone() bool`

HasTimezone returns a boolean if a field has been set.

### GetUsername

`func (o *CoreUserUpdateUsersRequestUsersInner) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *CoreUserUpdateUsersRequestUsersInner) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *CoreUserUpdateUsersRequestUsersInner) HasUsername() bool`

HasUsername returns a boolean if a field has been set.

### GetUserpicture

`func (o *CoreUserUpdateUsersRequestUsersInner) GetUserpicture() int32`

GetUserpicture returns the Userpicture field if non-nil, zero value otherwise.

### GetUserpictureOk

`func (o *CoreUserUpdateUsersRequestUsersInner) GetUserpictureOk() (*int32, bool)`

GetUserpictureOk returns a tuple with the Userpicture field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserpicture

`func (o *CoreUserUpdateUsersRequestUsersInner) SetUserpicture(v int32)`

SetUserpicture sets Userpicture field to given value.

### HasUserpicture

`func (o *CoreUserUpdateUsersRequestUsersInner) HasUserpicture() bool`

HasUserpicture returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


