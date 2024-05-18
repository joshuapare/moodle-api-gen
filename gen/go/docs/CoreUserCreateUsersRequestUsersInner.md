# CoreUserCreateUsersRequestUsersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | Pointer to **string** | Postal address | [optional] 
**Alternatename** | Pointer to **string** | The alternate name of the user | [optional] [default to "null"]
**Auth** | Pointer to **string** | Auth plugins include manual, ldap, etc | [optional] [default to "manual"]
**Calendartype** | Pointer to **string** | Calendar type such as \&quot;gregorian\&quot;, must exist on server | [optional] [default to "gregorian"]
**City** | Pointer to **string** | Home city of the user | [optional] 
**Country** | Pointer to **string** | Home country code of the user, such as AU or CZ | [optional] 
**Createpassword** | Pointer to **bool** | True if password should be created and mailed to user. | [optional] [default to null]
**Customfields** | Pointer to [**[]CoreUserCreateUsersRequestUsersInnerCustomfieldsInner**](CoreUserCreateUsersRequestUsersInnerCustomfieldsInner.md) |  | [optional] 
**Department** | Pointer to **string** | department | [optional] 
**Description** | Pointer to **string** | User profile description, no HTML | [optional] [default to "null"]
**Email** | Pointer to **string** | A valid and unique email address | [optional] 
**Firstname** | Pointer to **string** | The first name(s) of the user | [optional] 
**Firstnamephonetic** | Pointer to **string** | The first name(s) phonetically of the user | [optional] [default to "null"]
**Idnumber** | Pointer to **string** | An arbitrary ID code number perhaps from the institution | [optional] [default to ""]
**Institution** | Pointer to **string** | institution | [optional] 
**Interests** | Pointer to **string** | User interests (separated by commas) | [optional] [default to "null"]
**Lang** | Pointer to **string** | Language code such as \&quot;en\&quot;, must exist on server | [optional] [default to "en"]
**Lastname** | Pointer to **string** | The family name of the user | [optional] 
**Lastnamephonetic** | Pointer to **string** | The family name phonetically of the user | [optional] [default to "null"]
**Maildisplay** | Pointer to **int32** | Email visibility | [optional] [default to null]
**Mailformat** | Pointer to **int32** | Mail format code is 0 for plain text, 1 for HTML etc | [optional] 
**Middlename** | Pointer to **string** | The middle name of the user | [optional] [default to "null"]
**Password** | Pointer to **string** | Plain text password consisting of any characters | [optional] [default to "null"]
**Phone1** | Pointer to **string** | Phone 1 | [optional] 
**Phone2** | Pointer to **string** | Phone 2 | [optional] 
**Preferences** | Pointer to [**[]CoreUserCreateUsersRequestUsersInnerPreferencesInner**](CoreUserCreateUsersRequestUsersInnerPreferencesInner.md) |  | [optional] 
**Theme** | Pointer to **string** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional] 
**Timezone** | Pointer to **string** | Timezone code such as Australia/Perth, or 99 for default | [optional] 
**Username** | Pointer to **string** | Username policy is defined in Moodle security config. | [optional] [default to "null"]

## Methods

### NewCoreUserCreateUsersRequestUsersInner

`func NewCoreUserCreateUsersRequestUsersInner() *CoreUserCreateUsersRequestUsersInner`

NewCoreUserCreateUsersRequestUsersInner instantiates a new CoreUserCreateUsersRequestUsersInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserCreateUsersRequestUsersInnerWithDefaults

`func NewCoreUserCreateUsersRequestUsersInnerWithDefaults() *CoreUserCreateUsersRequestUsersInner`

NewCoreUserCreateUsersRequestUsersInnerWithDefaults instantiates a new CoreUserCreateUsersRequestUsersInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddress

`func (o *CoreUserCreateUsersRequestUsersInner) GetAddress() string`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetAddressOk() (*string, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *CoreUserCreateUsersRequestUsersInner) SetAddress(v string)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *CoreUserCreateUsersRequestUsersInner) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetAlternatename

`func (o *CoreUserCreateUsersRequestUsersInner) GetAlternatename() string`

GetAlternatename returns the Alternatename field if non-nil, zero value otherwise.

### GetAlternatenameOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetAlternatenameOk() (*string, bool)`

GetAlternatenameOk returns a tuple with the Alternatename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAlternatename

`func (o *CoreUserCreateUsersRequestUsersInner) SetAlternatename(v string)`

SetAlternatename sets Alternatename field to given value.

### HasAlternatename

`func (o *CoreUserCreateUsersRequestUsersInner) HasAlternatename() bool`

HasAlternatename returns a boolean if a field has been set.

### GetAuth

`func (o *CoreUserCreateUsersRequestUsersInner) GetAuth() string`

GetAuth returns the Auth field if non-nil, zero value otherwise.

### GetAuthOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetAuthOk() (*string, bool)`

GetAuthOk returns a tuple with the Auth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuth

`func (o *CoreUserCreateUsersRequestUsersInner) SetAuth(v string)`

SetAuth sets Auth field to given value.

### HasAuth

`func (o *CoreUserCreateUsersRequestUsersInner) HasAuth() bool`

HasAuth returns a boolean if a field has been set.

### GetCalendartype

`func (o *CoreUserCreateUsersRequestUsersInner) GetCalendartype() string`

GetCalendartype returns the Calendartype field if non-nil, zero value otherwise.

### GetCalendartypeOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetCalendartypeOk() (*string, bool)`

GetCalendartypeOk returns a tuple with the Calendartype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCalendartype

`func (o *CoreUserCreateUsersRequestUsersInner) SetCalendartype(v string)`

SetCalendartype sets Calendartype field to given value.

### HasCalendartype

`func (o *CoreUserCreateUsersRequestUsersInner) HasCalendartype() bool`

HasCalendartype returns a boolean if a field has been set.

### GetCity

`func (o *CoreUserCreateUsersRequestUsersInner) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *CoreUserCreateUsersRequestUsersInner) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *CoreUserCreateUsersRequestUsersInner) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetCountry

`func (o *CoreUserCreateUsersRequestUsersInner) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CoreUserCreateUsersRequestUsersInner) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *CoreUserCreateUsersRequestUsersInner) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCreatepassword

`func (o *CoreUserCreateUsersRequestUsersInner) GetCreatepassword() bool`

GetCreatepassword returns the Createpassword field if non-nil, zero value otherwise.

### GetCreatepasswordOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetCreatepasswordOk() (*bool, bool)`

GetCreatepasswordOk returns a tuple with the Createpassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatepassword

`func (o *CoreUserCreateUsersRequestUsersInner) SetCreatepassword(v bool)`

SetCreatepassword sets Createpassword field to given value.

### HasCreatepassword

`func (o *CoreUserCreateUsersRequestUsersInner) HasCreatepassword() bool`

HasCreatepassword returns a boolean if a field has been set.

### GetCustomfields

`func (o *CoreUserCreateUsersRequestUsersInner) GetCustomfields() []CoreUserCreateUsersRequestUsersInnerCustomfieldsInner`

GetCustomfields returns the Customfields field if non-nil, zero value otherwise.

### GetCustomfieldsOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetCustomfieldsOk() (*[]CoreUserCreateUsersRequestUsersInnerCustomfieldsInner, bool)`

GetCustomfieldsOk returns a tuple with the Customfields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfields

`func (o *CoreUserCreateUsersRequestUsersInner) SetCustomfields(v []CoreUserCreateUsersRequestUsersInnerCustomfieldsInner)`

SetCustomfields sets Customfields field to given value.

### HasCustomfields

`func (o *CoreUserCreateUsersRequestUsersInner) HasCustomfields() bool`

HasCustomfields returns a boolean if a field has been set.

### GetDepartment

`func (o *CoreUserCreateUsersRequestUsersInner) GetDepartment() string`

GetDepartment returns the Department field if non-nil, zero value otherwise.

### GetDepartmentOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetDepartmentOk() (*string, bool)`

GetDepartmentOk returns a tuple with the Department field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDepartment

`func (o *CoreUserCreateUsersRequestUsersInner) SetDepartment(v string)`

SetDepartment sets Department field to given value.

### HasDepartment

`func (o *CoreUserCreateUsersRequestUsersInner) HasDepartment() bool`

HasDepartment returns a boolean if a field has been set.

### GetDescription

`func (o *CoreUserCreateUsersRequestUsersInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreUserCreateUsersRequestUsersInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreUserCreateUsersRequestUsersInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetEmail

`func (o *CoreUserCreateUsersRequestUsersInner) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *CoreUserCreateUsersRequestUsersInner) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *CoreUserCreateUsersRequestUsersInner) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetFirstname

`func (o *CoreUserCreateUsersRequestUsersInner) GetFirstname() string`

GetFirstname returns the Firstname field if non-nil, zero value otherwise.

### GetFirstnameOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetFirstnameOk() (*string, bool)`

GetFirstnameOk returns a tuple with the Firstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstname

`func (o *CoreUserCreateUsersRequestUsersInner) SetFirstname(v string)`

SetFirstname sets Firstname field to given value.

### HasFirstname

`func (o *CoreUserCreateUsersRequestUsersInner) HasFirstname() bool`

HasFirstname returns a boolean if a field has been set.

### GetFirstnamephonetic

`func (o *CoreUserCreateUsersRequestUsersInner) GetFirstnamephonetic() string`

GetFirstnamephonetic returns the Firstnamephonetic field if non-nil, zero value otherwise.

### GetFirstnamephoneticOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetFirstnamephoneticOk() (*string, bool)`

GetFirstnamephoneticOk returns a tuple with the Firstnamephonetic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstnamephonetic

`func (o *CoreUserCreateUsersRequestUsersInner) SetFirstnamephonetic(v string)`

SetFirstnamephonetic sets Firstnamephonetic field to given value.

### HasFirstnamephonetic

`func (o *CoreUserCreateUsersRequestUsersInner) HasFirstnamephonetic() bool`

HasFirstnamephonetic returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreUserCreateUsersRequestUsersInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreUserCreateUsersRequestUsersInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreUserCreateUsersRequestUsersInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetInstitution

`func (o *CoreUserCreateUsersRequestUsersInner) GetInstitution() string`

GetInstitution returns the Institution field if non-nil, zero value otherwise.

### GetInstitutionOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetInstitutionOk() (*string, bool)`

GetInstitutionOk returns a tuple with the Institution field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstitution

`func (o *CoreUserCreateUsersRequestUsersInner) SetInstitution(v string)`

SetInstitution sets Institution field to given value.

### HasInstitution

`func (o *CoreUserCreateUsersRequestUsersInner) HasInstitution() bool`

HasInstitution returns a boolean if a field has been set.

### GetInterests

`func (o *CoreUserCreateUsersRequestUsersInner) GetInterests() string`

GetInterests returns the Interests field if non-nil, zero value otherwise.

### GetInterestsOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetInterestsOk() (*string, bool)`

GetInterestsOk returns a tuple with the Interests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterests

`func (o *CoreUserCreateUsersRequestUsersInner) SetInterests(v string)`

SetInterests sets Interests field to given value.

### HasInterests

`func (o *CoreUserCreateUsersRequestUsersInner) HasInterests() bool`

HasInterests returns a boolean if a field has been set.

### GetLang

`func (o *CoreUserCreateUsersRequestUsersInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *CoreUserCreateUsersRequestUsersInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *CoreUserCreateUsersRequestUsersInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetLastname

`func (o *CoreUserCreateUsersRequestUsersInner) GetLastname() string`

GetLastname returns the Lastname field if non-nil, zero value otherwise.

### GetLastnameOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetLastnameOk() (*string, bool)`

GetLastnameOk returns a tuple with the Lastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastname

`func (o *CoreUserCreateUsersRequestUsersInner) SetLastname(v string)`

SetLastname sets Lastname field to given value.

### HasLastname

`func (o *CoreUserCreateUsersRequestUsersInner) HasLastname() bool`

HasLastname returns a boolean if a field has been set.

### GetLastnamephonetic

`func (o *CoreUserCreateUsersRequestUsersInner) GetLastnamephonetic() string`

GetLastnamephonetic returns the Lastnamephonetic field if non-nil, zero value otherwise.

### GetLastnamephoneticOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetLastnamephoneticOk() (*string, bool)`

GetLastnamephoneticOk returns a tuple with the Lastnamephonetic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastnamephonetic

`func (o *CoreUserCreateUsersRequestUsersInner) SetLastnamephonetic(v string)`

SetLastnamephonetic sets Lastnamephonetic field to given value.

### HasLastnamephonetic

`func (o *CoreUserCreateUsersRequestUsersInner) HasLastnamephonetic() bool`

HasLastnamephonetic returns a boolean if a field has been set.

### GetMaildisplay

`func (o *CoreUserCreateUsersRequestUsersInner) GetMaildisplay() int32`

GetMaildisplay returns the Maildisplay field if non-nil, zero value otherwise.

### GetMaildisplayOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetMaildisplayOk() (*int32, bool)`

GetMaildisplayOk returns a tuple with the Maildisplay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaildisplay

`func (o *CoreUserCreateUsersRequestUsersInner) SetMaildisplay(v int32)`

SetMaildisplay sets Maildisplay field to given value.

### HasMaildisplay

`func (o *CoreUserCreateUsersRequestUsersInner) HasMaildisplay() bool`

HasMaildisplay returns a boolean if a field has been set.

### GetMailformat

`func (o *CoreUserCreateUsersRequestUsersInner) GetMailformat() int32`

GetMailformat returns the Mailformat field if non-nil, zero value otherwise.

### GetMailformatOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetMailformatOk() (*int32, bool)`

GetMailformatOk returns a tuple with the Mailformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMailformat

`func (o *CoreUserCreateUsersRequestUsersInner) SetMailformat(v int32)`

SetMailformat sets Mailformat field to given value.

### HasMailformat

`func (o *CoreUserCreateUsersRequestUsersInner) HasMailformat() bool`

HasMailformat returns a boolean if a field has been set.

### GetMiddlename

`func (o *CoreUserCreateUsersRequestUsersInner) GetMiddlename() string`

GetMiddlename returns the Middlename field if non-nil, zero value otherwise.

### GetMiddlenameOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetMiddlenameOk() (*string, bool)`

GetMiddlenameOk returns a tuple with the Middlename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMiddlename

`func (o *CoreUserCreateUsersRequestUsersInner) SetMiddlename(v string)`

SetMiddlename sets Middlename field to given value.

### HasMiddlename

`func (o *CoreUserCreateUsersRequestUsersInner) HasMiddlename() bool`

HasMiddlename returns a boolean if a field has been set.

### GetPassword

`func (o *CoreUserCreateUsersRequestUsersInner) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *CoreUserCreateUsersRequestUsersInner) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *CoreUserCreateUsersRequestUsersInner) HasPassword() bool`

HasPassword returns a boolean if a field has been set.

### GetPhone1

`func (o *CoreUserCreateUsersRequestUsersInner) GetPhone1() string`

GetPhone1 returns the Phone1 field if non-nil, zero value otherwise.

### GetPhone1Ok

`func (o *CoreUserCreateUsersRequestUsersInner) GetPhone1Ok() (*string, bool)`

GetPhone1Ok returns a tuple with the Phone1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhone1

`func (o *CoreUserCreateUsersRequestUsersInner) SetPhone1(v string)`

SetPhone1 sets Phone1 field to given value.

### HasPhone1

`func (o *CoreUserCreateUsersRequestUsersInner) HasPhone1() bool`

HasPhone1 returns a boolean if a field has been set.

### GetPhone2

`func (o *CoreUserCreateUsersRequestUsersInner) GetPhone2() string`

GetPhone2 returns the Phone2 field if non-nil, zero value otherwise.

### GetPhone2Ok

`func (o *CoreUserCreateUsersRequestUsersInner) GetPhone2Ok() (*string, bool)`

GetPhone2Ok returns a tuple with the Phone2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhone2

`func (o *CoreUserCreateUsersRequestUsersInner) SetPhone2(v string)`

SetPhone2 sets Phone2 field to given value.

### HasPhone2

`func (o *CoreUserCreateUsersRequestUsersInner) HasPhone2() bool`

HasPhone2 returns a boolean if a field has been set.

### GetPreferences

`func (o *CoreUserCreateUsersRequestUsersInner) GetPreferences() []CoreUserCreateUsersRequestUsersInnerPreferencesInner`

GetPreferences returns the Preferences field if non-nil, zero value otherwise.

### GetPreferencesOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetPreferencesOk() (*[]CoreUserCreateUsersRequestUsersInnerPreferencesInner, bool)`

GetPreferencesOk returns a tuple with the Preferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferences

`func (o *CoreUserCreateUsersRequestUsersInner) SetPreferences(v []CoreUserCreateUsersRequestUsersInnerPreferencesInner)`

SetPreferences sets Preferences field to given value.

### HasPreferences

`func (o *CoreUserCreateUsersRequestUsersInner) HasPreferences() bool`

HasPreferences returns a boolean if a field has been set.

### GetTheme

`func (o *CoreUserCreateUsersRequestUsersInner) GetTheme() string`

GetTheme returns the Theme field if non-nil, zero value otherwise.

### GetThemeOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetThemeOk() (*string, bool)`

GetThemeOk returns a tuple with the Theme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTheme

`func (o *CoreUserCreateUsersRequestUsersInner) SetTheme(v string)`

SetTheme sets Theme field to given value.

### HasTheme

`func (o *CoreUserCreateUsersRequestUsersInner) HasTheme() bool`

HasTheme returns a boolean if a field has been set.

### GetTimezone

`func (o *CoreUserCreateUsersRequestUsersInner) GetTimezone() string`

GetTimezone returns the Timezone field if non-nil, zero value otherwise.

### GetTimezoneOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetTimezoneOk() (*string, bool)`

GetTimezoneOk returns a tuple with the Timezone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimezone

`func (o *CoreUserCreateUsersRequestUsersInner) SetTimezone(v string)`

SetTimezone sets Timezone field to given value.

### HasTimezone

`func (o *CoreUserCreateUsersRequestUsersInner) HasTimezone() bool`

HasTimezone returns a boolean if a field has been set.

### GetUsername

`func (o *CoreUserCreateUsersRequestUsersInner) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *CoreUserCreateUsersRequestUsersInner) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *CoreUserCreateUsersRequestUsersInner) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *CoreUserCreateUsersRequestUsersInner) HasUsername() bool`

HasUsername returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


