/*
Moodle Webservice API

Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

API version: 4.3.4
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package moodleclient

import (
	"encoding/json"
)

// checks if the CoreUserUpdateUsersRequestUsersInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreUserUpdateUsersRequestUsersInner{}

// CoreUserUpdateUsersRequestUsersInner struct for CoreUserUpdateUsersRequestUsersInner
type CoreUserUpdateUsersRequestUsersInner struct {
	// Postal address
	Address *string `json:"address,omitempty"`
	// The alternate name of the user
	Alternatename *string `json:"alternatename,omitempty"`
	// Auth plugins include manual, ldap, etc
	Auth *string `json:"auth,omitempty"`
	// Calendar type such as \"gregorian\", must exist on server
	Calendartype *string `json:"calendartype,omitempty"`
	// Home city of the user
	City *string `json:"city,omitempty"`
	// Home country code of the user, such as AU or CZ
	Country *string `json:"country,omitempty"`
	Customfields []CoreUserCreateUsersRequestUsersInnerCustomfieldsInner `json:"customfields,omitempty"`
	// Department
	Department *string `json:"department,omitempty"`
	// User profile description, no HTML
	Description *string `json:"description,omitempty"`
	// A valid and unique email address
	Email *string `json:"email,omitempty"`
	// The first name(s) of the user
	Firstname *string `json:"firstname,omitempty"`
	// The first name(s) phonetically of the user
	Firstnamephonetic *string `json:"firstnamephonetic,omitempty"`
	// ID of the user
	Id *int32 `json:"id,omitempty"`
	// An arbitrary ID code number perhaps from the institution
	Idnumber *string `json:"idnumber,omitempty"`
	// Institution
	Institution *string `json:"institution,omitempty"`
	// User interests (separated by commas)
	Interests *string `json:"interests,omitempty"`
	// Language code such as \"en\", must exist on server
	Lang *string `json:"lang,omitempty"`
	// The family name of the user
	Lastname *string `json:"lastname,omitempty"`
	// The family name phonetically of the user
	Lastnamephonetic *string `json:"lastnamephonetic,omitempty"`
	// Email visibility
	Maildisplay *int32 `json:"maildisplay,omitempty"`
	// Mail format code is 0 for plain text, 1 for HTML etc
	Mailformat *int32 `json:"mailformat,omitempty"`
	// The middle name of the user
	Middlename *string `json:"middlename,omitempty"`
	// Plain text password consisting of any characters
	Password *string `json:"password,omitempty"`
	// Phone
	Phone1 *string `json:"phone1,omitempty"`
	// Mobile phone
	Phone2 *string `json:"phone2,omitempty"`
	Preferences []CoreUserUpdateUsersRequestUsersInnerPreferencesInner `json:"preferences,omitempty"`
	// Suspend user account, either false to enable user login or true to disable it
	Suspended *bool `json:"suspended,omitempty"`
	// Theme name such as \"standard\", must exist on server
	Theme *string `json:"theme,omitempty"`
	// Timezone code such as Australia/Perth, or 99 for default
	Timezone *string `json:"timezone,omitempty"`
	// Username policy is defined in Moodle security config.
	Username *string `json:"username,omitempty"`
	// The itemid where the new user picture has been uploaded to, 0 to delete
	Userpicture *int32 `json:"userpicture,omitempty"`
}

// NewCoreUserUpdateUsersRequestUsersInner instantiates a new CoreUserUpdateUsersRequestUsersInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreUserUpdateUsersRequestUsersInner() *CoreUserUpdateUsersRequestUsersInner {
	this := CoreUserUpdateUsersRequestUsersInner{}
	var auth string = ""
	this.Auth = &auth
	var calendartype string = ""
	this.Calendartype = &calendartype
	var department string = "null"
	this.Department = &department
	var email string = ""
	this.Email = &email
	var firstname string = ""
	this.Firstname = &firstname
	var institution string = "null"
	this.Institution = &institution
	var lang string = ""
	this.Lang = &lang
	var password string = ""
	this.Password = &password
	var phone1 string = "null"
	this.Phone1 = &phone1
	var phone2 string = "null"
	this.Phone2 = &phone2
	var username string = ""
	this.Username = &username
	var userpicture int32 = null
	this.Userpicture = &userpicture
	return &this
}

// NewCoreUserUpdateUsersRequestUsersInnerWithDefaults instantiates a new CoreUserUpdateUsersRequestUsersInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreUserUpdateUsersRequestUsersInnerWithDefaults() *CoreUserUpdateUsersRequestUsersInner {
	this := CoreUserUpdateUsersRequestUsersInner{}
	var auth string = ""
	this.Auth = &auth
	var calendartype string = ""
	this.Calendartype = &calendartype
	var department string = "null"
	this.Department = &department
	var email string = ""
	this.Email = &email
	var firstname string = ""
	this.Firstname = &firstname
	var institution string = "null"
	this.Institution = &institution
	var lang string = ""
	this.Lang = &lang
	var password string = ""
	this.Password = &password
	var phone1 string = "null"
	this.Phone1 = &phone1
	var phone2 string = "null"
	this.Phone2 = &phone2
	var username string = ""
	this.Username = &username
	var userpicture int32 = null
	this.Userpicture = &userpicture
	return &this
}

// GetAddress returns the Address field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetAddress() string {
	if o == nil || IsNil(o.Address) {
		var ret string
		return ret
	}
	return *o.Address
}

// GetAddressOk returns a tuple with the Address field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetAddressOk() (*string, bool) {
	if o == nil || IsNil(o.Address) {
		return nil, false
	}
	return o.Address, true
}

// HasAddress returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasAddress() bool {
	if o != nil && !IsNil(o.Address) {
		return true
	}

	return false
}

// SetAddress gets a reference to the given string and assigns it to the Address field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetAddress(v string) {
	o.Address = &v
}

// GetAlternatename returns the Alternatename field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetAlternatename() string {
	if o == nil || IsNil(o.Alternatename) {
		var ret string
		return ret
	}
	return *o.Alternatename
}

// GetAlternatenameOk returns a tuple with the Alternatename field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetAlternatenameOk() (*string, bool) {
	if o == nil || IsNil(o.Alternatename) {
		return nil, false
	}
	return o.Alternatename, true
}

// HasAlternatename returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasAlternatename() bool {
	if o != nil && !IsNil(o.Alternatename) {
		return true
	}

	return false
}

// SetAlternatename gets a reference to the given string and assigns it to the Alternatename field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetAlternatename(v string) {
	o.Alternatename = &v
}

// GetAuth returns the Auth field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetAuth() string {
	if o == nil || IsNil(o.Auth) {
		var ret string
		return ret
	}
	return *o.Auth
}

// GetAuthOk returns a tuple with the Auth field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetAuthOk() (*string, bool) {
	if o == nil || IsNil(o.Auth) {
		return nil, false
	}
	return o.Auth, true
}

// HasAuth returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasAuth() bool {
	if o != nil && !IsNil(o.Auth) {
		return true
	}

	return false
}

// SetAuth gets a reference to the given string and assigns it to the Auth field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetAuth(v string) {
	o.Auth = &v
}

// GetCalendartype returns the Calendartype field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetCalendartype() string {
	if o == nil || IsNil(o.Calendartype) {
		var ret string
		return ret
	}
	return *o.Calendartype
}

// GetCalendartypeOk returns a tuple with the Calendartype field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetCalendartypeOk() (*string, bool) {
	if o == nil || IsNil(o.Calendartype) {
		return nil, false
	}
	return o.Calendartype, true
}

// HasCalendartype returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasCalendartype() bool {
	if o != nil && !IsNil(o.Calendartype) {
		return true
	}

	return false
}

// SetCalendartype gets a reference to the given string and assigns it to the Calendartype field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetCalendartype(v string) {
	o.Calendartype = &v
}

// GetCity returns the City field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetCity() string {
	if o == nil || IsNil(o.City) {
		var ret string
		return ret
	}
	return *o.City
}

// GetCityOk returns a tuple with the City field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetCityOk() (*string, bool) {
	if o == nil || IsNil(o.City) {
		return nil, false
	}
	return o.City, true
}

// HasCity returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasCity() bool {
	if o != nil && !IsNil(o.City) {
		return true
	}

	return false
}

// SetCity gets a reference to the given string and assigns it to the City field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetCity(v string) {
	o.City = &v
}

// GetCountry returns the Country field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetCountry() string {
	if o == nil || IsNil(o.Country) {
		var ret string
		return ret
	}
	return *o.Country
}

// GetCountryOk returns a tuple with the Country field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetCountryOk() (*string, bool) {
	if o == nil || IsNil(o.Country) {
		return nil, false
	}
	return o.Country, true
}

// HasCountry returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasCountry() bool {
	if o != nil && !IsNil(o.Country) {
		return true
	}

	return false
}

// SetCountry gets a reference to the given string and assigns it to the Country field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetCountry(v string) {
	o.Country = &v
}

// GetCustomfields returns the Customfields field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetCustomfields() []CoreUserCreateUsersRequestUsersInnerCustomfieldsInner {
	if o == nil || IsNil(o.Customfields) {
		var ret []CoreUserCreateUsersRequestUsersInnerCustomfieldsInner
		return ret
	}
	return o.Customfields
}

// GetCustomfieldsOk returns a tuple with the Customfields field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetCustomfieldsOk() ([]CoreUserCreateUsersRequestUsersInnerCustomfieldsInner, bool) {
	if o == nil || IsNil(o.Customfields) {
		return nil, false
	}
	return o.Customfields, true
}

// HasCustomfields returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasCustomfields() bool {
	if o != nil && !IsNil(o.Customfields) {
		return true
	}

	return false
}

// SetCustomfields gets a reference to the given []CoreUserCreateUsersRequestUsersInnerCustomfieldsInner and assigns it to the Customfields field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetCustomfields(v []CoreUserCreateUsersRequestUsersInnerCustomfieldsInner) {
	o.Customfields = v
}

// GetDepartment returns the Department field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetDepartment() string {
	if o == nil || IsNil(o.Department) {
		var ret string
		return ret
	}
	return *o.Department
}

// GetDepartmentOk returns a tuple with the Department field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetDepartmentOk() (*string, bool) {
	if o == nil || IsNil(o.Department) {
		return nil, false
	}
	return o.Department, true
}

// HasDepartment returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasDepartment() bool {
	if o != nil && !IsNil(o.Department) {
		return true
	}

	return false
}

// SetDepartment gets a reference to the given string and assigns it to the Department field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetDepartment(v string) {
	o.Department = &v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetDescription() string {
	if o == nil || IsNil(o.Description) {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetDescriptionOk() (*string, bool) {
	if o == nil || IsNil(o.Description) {
		return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasDescription() bool {
	if o != nil && !IsNil(o.Description) {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetDescription(v string) {
	o.Description = &v
}

// GetEmail returns the Email field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetEmail() string {
	if o == nil || IsNil(o.Email) {
		var ret string
		return ret
	}
	return *o.Email
}

// GetEmailOk returns a tuple with the Email field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetEmailOk() (*string, bool) {
	if o == nil || IsNil(o.Email) {
		return nil, false
	}
	return o.Email, true
}

// HasEmail returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasEmail() bool {
	if o != nil && !IsNil(o.Email) {
		return true
	}

	return false
}

// SetEmail gets a reference to the given string and assigns it to the Email field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetEmail(v string) {
	o.Email = &v
}

// GetFirstname returns the Firstname field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetFirstname() string {
	if o == nil || IsNil(o.Firstname) {
		var ret string
		return ret
	}
	return *o.Firstname
}

// GetFirstnameOk returns a tuple with the Firstname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetFirstnameOk() (*string, bool) {
	if o == nil || IsNil(o.Firstname) {
		return nil, false
	}
	return o.Firstname, true
}

// HasFirstname returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasFirstname() bool {
	if o != nil && !IsNil(o.Firstname) {
		return true
	}

	return false
}

// SetFirstname gets a reference to the given string and assigns it to the Firstname field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetFirstname(v string) {
	o.Firstname = &v
}

// GetFirstnamephonetic returns the Firstnamephonetic field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetFirstnamephonetic() string {
	if o == nil || IsNil(o.Firstnamephonetic) {
		var ret string
		return ret
	}
	return *o.Firstnamephonetic
}

// GetFirstnamephoneticOk returns a tuple with the Firstnamephonetic field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetFirstnamephoneticOk() (*string, bool) {
	if o == nil || IsNil(o.Firstnamephonetic) {
		return nil, false
	}
	return o.Firstnamephonetic, true
}

// HasFirstnamephonetic returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasFirstnamephonetic() bool {
	if o != nil && !IsNil(o.Firstnamephonetic) {
		return true
	}

	return false
}

// SetFirstnamephonetic gets a reference to the given string and assigns it to the Firstnamephonetic field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetFirstnamephonetic(v string) {
	o.Firstnamephonetic = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetId(v int32) {
	o.Id = &v
}

// GetIdnumber returns the Idnumber field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetIdnumber() string {
	if o == nil || IsNil(o.Idnumber) {
		var ret string
		return ret
	}
	return *o.Idnumber
}

// GetIdnumberOk returns a tuple with the Idnumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetIdnumberOk() (*string, bool) {
	if o == nil || IsNil(o.Idnumber) {
		return nil, false
	}
	return o.Idnumber, true
}

// HasIdnumber returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasIdnumber() bool {
	if o != nil && !IsNil(o.Idnumber) {
		return true
	}

	return false
}

// SetIdnumber gets a reference to the given string and assigns it to the Idnumber field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetIdnumber(v string) {
	o.Idnumber = &v
}

// GetInstitution returns the Institution field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetInstitution() string {
	if o == nil || IsNil(o.Institution) {
		var ret string
		return ret
	}
	return *o.Institution
}

// GetInstitutionOk returns a tuple with the Institution field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetInstitutionOk() (*string, bool) {
	if o == nil || IsNil(o.Institution) {
		return nil, false
	}
	return o.Institution, true
}

// HasInstitution returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasInstitution() bool {
	if o != nil && !IsNil(o.Institution) {
		return true
	}

	return false
}

// SetInstitution gets a reference to the given string and assigns it to the Institution field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetInstitution(v string) {
	o.Institution = &v
}

// GetInterests returns the Interests field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetInterests() string {
	if o == nil || IsNil(o.Interests) {
		var ret string
		return ret
	}
	return *o.Interests
}

// GetInterestsOk returns a tuple with the Interests field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetInterestsOk() (*string, bool) {
	if o == nil || IsNil(o.Interests) {
		return nil, false
	}
	return o.Interests, true
}

// HasInterests returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasInterests() bool {
	if o != nil && !IsNil(o.Interests) {
		return true
	}

	return false
}

// SetInterests gets a reference to the given string and assigns it to the Interests field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetInterests(v string) {
	o.Interests = &v
}

// GetLang returns the Lang field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetLang() string {
	if o == nil || IsNil(o.Lang) {
		var ret string
		return ret
	}
	return *o.Lang
}

// GetLangOk returns a tuple with the Lang field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetLangOk() (*string, bool) {
	if o == nil || IsNil(o.Lang) {
		return nil, false
	}
	return o.Lang, true
}

// HasLang returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasLang() bool {
	if o != nil && !IsNil(o.Lang) {
		return true
	}

	return false
}

// SetLang gets a reference to the given string and assigns it to the Lang field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetLang(v string) {
	o.Lang = &v
}

// GetLastname returns the Lastname field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetLastname() string {
	if o == nil || IsNil(o.Lastname) {
		var ret string
		return ret
	}
	return *o.Lastname
}

// GetLastnameOk returns a tuple with the Lastname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetLastnameOk() (*string, bool) {
	if o == nil || IsNil(o.Lastname) {
		return nil, false
	}
	return o.Lastname, true
}

// HasLastname returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasLastname() bool {
	if o != nil && !IsNil(o.Lastname) {
		return true
	}

	return false
}

// SetLastname gets a reference to the given string and assigns it to the Lastname field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetLastname(v string) {
	o.Lastname = &v
}

// GetLastnamephonetic returns the Lastnamephonetic field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetLastnamephonetic() string {
	if o == nil || IsNil(o.Lastnamephonetic) {
		var ret string
		return ret
	}
	return *o.Lastnamephonetic
}

// GetLastnamephoneticOk returns a tuple with the Lastnamephonetic field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetLastnamephoneticOk() (*string, bool) {
	if o == nil || IsNil(o.Lastnamephonetic) {
		return nil, false
	}
	return o.Lastnamephonetic, true
}

// HasLastnamephonetic returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasLastnamephonetic() bool {
	if o != nil && !IsNil(o.Lastnamephonetic) {
		return true
	}

	return false
}

// SetLastnamephonetic gets a reference to the given string and assigns it to the Lastnamephonetic field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetLastnamephonetic(v string) {
	o.Lastnamephonetic = &v
}

// GetMaildisplay returns the Maildisplay field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetMaildisplay() int32 {
	if o == nil || IsNil(o.Maildisplay) {
		var ret int32
		return ret
	}
	return *o.Maildisplay
}

// GetMaildisplayOk returns a tuple with the Maildisplay field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetMaildisplayOk() (*int32, bool) {
	if o == nil || IsNil(o.Maildisplay) {
		return nil, false
	}
	return o.Maildisplay, true
}

// HasMaildisplay returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasMaildisplay() bool {
	if o != nil && !IsNil(o.Maildisplay) {
		return true
	}

	return false
}

// SetMaildisplay gets a reference to the given int32 and assigns it to the Maildisplay field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetMaildisplay(v int32) {
	o.Maildisplay = &v
}

// GetMailformat returns the Mailformat field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetMailformat() int32 {
	if o == nil || IsNil(o.Mailformat) {
		var ret int32
		return ret
	}
	return *o.Mailformat
}

// GetMailformatOk returns a tuple with the Mailformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetMailformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Mailformat) {
		return nil, false
	}
	return o.Mailformat, true
}

// HasMailformat returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasMailformat() bool {
	if o != nil && !IsNil(o.Mailformat) {
		return true
	}

	return false
}

// SetMailformat gets a reference to the given int32 and assigns it to the Mailformat field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetMailformat(v int32) {
	o.Mailformat = &v
}

// GetMiddlename returns the Middlename field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetMiddlename() string {
	if o == nil || IsNil(o.Middlename) {
		var ret string
		return ret
	}
	return *o.Middlename
}

// GetMiddlenameOk returns a tuple with the Middlename field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetMiddlenameOk() (*string, bool) {
	if o == nil || IsNil(o.Middlename) {
		return nil, false
	}
	return o.Middlename, true
}

// HasMiddlename returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasMiddlename() bool {
	if o != nil && !IsNil(o.Middlename) {
		return true
	}

	return false
}

// SetMiddlename gets a reference to the given string and assigns it to the Middlename field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetMiddlename(v string) {
	o.Middlename = &v
}

// GetPassword returns the Password field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetPassword() string {
	if o == nil || IsNil(o.Password) {
		var ret string
		return ret
	}
	return *o.Password
}

// GetPasswordOk returns a tuple with the Password field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetPasswordOk() (*string, bool) {
	if o == nil || IsNil(o.Password) {
		return nil, false
	}
	return o.Password, true
}

// HasPassword returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasPassword() bool {
	if o != nil && !IsNil(o.Password) {
		return true
	}

	return false
}

// SetPassword gets a reference to the given string and assigns it to the Password field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetPassword(v string) {
	o.Password = &v
}

// GetPhone1 returns the Phone1 field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetPhone1() string {
	if o == nil || IsNil(o.Phone1) {
		var ret string
		return ret
	}
	return *o.Phone1
}

// GetPhone1Ok returns a tuple with the Phone1 field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetPhone1Ok() (*string, bool) {
	if o == nil || IsNil(o.Phone1) {
		return nil, false
	}
	return o.Phone1, true
}

// HasPhone1 returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasPhone1() bool {
	if o != nil && !IsNil(o.Phone1) {
		return true
	}

	return false
}

// SetPhone1 gets a reference to the given string and assigns it to the Phone1 field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetPhone1(v string) {
	o.Phone1 = &v
}

// GetPhone2 returns the Phone2 field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetPhone2() string {
	if o == nil || IsNil(o.Phone2) {
		var ret string
		return ret
	}
	return *o.Phone2
}

// GetPhone2Ok returns a tuple with the Phone2 field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetPhone2Ok() (*string, bool) {
	if o == nil || IsNil(o.Phone2) {
		return nil, false
	}
	return o.Phone2, true
}

// HasPhone2 returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasPhone2() bool {
	if o != nil && !IsNil(o.Phone2) {
		return true
	}

	return false
}

// SetPhone2 gets a reference to the given string and assigns it to the Phone2 field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetPhone2(v string) {
	o.Phone2 = &v
}

// GetPreferences returns the Preferences field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetPreferences() []CoreUserUpdateUsersRequestUsersInnerPreferencesInner {
	if o == nil || IsNil(o.Preferences) {
		var ret []CoreUserUpdateUsersRequestUsersInnerPreferencesInner
		return ret
	}
	return o.Preferences
}

// GetPreferencesOk returns a tuple with the Preferences field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetPreferencesOk() ([]CoreUserUpdateUsersRequestUsersInnerPreferencesInner, bool) {
	if o == nil || IsNil(o.Preferences) {
		return nil, false
	}
	return o.Preferences, true
}

// HasPreferences returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasPreferences() bool {
	if o != nil && !IsNil(o.Preferences) {
		return true
	}

	return false
}

// SetPreferences gets a reference to the given []CoreUserUpdateUsersRequestUsersInnerPreferencesInner and assigns it to the Preferences field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetPreferences(v []CoreUserUpdateUsersRequestUsersInnerPreferencesInner) {
	o.Preferences = v
}

// GetSuspended returns the Suspended field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetSuspended() bool {
	if o == nil || IsNil(o.Suspended) {
		var ret bool
		return ret
	}
	return *o.Suspended
}

// GetSuspendedOk returns a tuple with the Suspended field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetSuspendedOk() (*bool, bool) {
	if o == nil || IsNil(o.Suspended) {
		return nil, false
	}
	return o.Suspended, true
}

// HasSuspended returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasSuspended() bool {
	if o != nil && !IsNil(o.Suspended) {
		return true
	}

	return false
}

// SetSuspended gets a reference to the given bool and assigns it to the Suspended field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetSuspended(v bool) {
	o.Suspended = &v
}

// GetTheme returns the Theme field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetTheme() string {
	if o == nil || IsNil(o.Theme) {
		var ret string
		return ret
	}
	return *o.Theme
}

// GetThemeOk returns a tuple with the Theme field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetThemeOk() (*string, bool) {
	if o == nil || IsNil(o.Theme) {
		return nil, false
	}
	return o.Theme, true
}

// HasTheme returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasTheme() bool {
	if o != nil && !IsNil(o.Theme) {
		return true
	}

	return false
}

// SetTheme gets a reference to the given string and assigns it to the Theme field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetTheme(v string) {
	o.Theme = &v
}

// GetTimezone returns the Timezone field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetTimezone() string {
	if o == nil || IsNil(o.Timezone) {
		var ret string
		return ret
	}
	return *o.Timezone
}

// GetTimezoneOk returns a tuple with the Timezone field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetTimezoneOk() (*string, bool) {
	if o == nil || IsNil(o.Timezone) {
		return nil, false
	}
	return o.Timezone, true
}

// HasTimezone returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasTimezone() bool {
	if o != nil && !IsNil(o.Timezone) {
		return true
	}

	return false
}

// SetTimezone gets a reference to the given string and assigns it to the Timezone field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetTimezone(v string) {
	o.Timezone = &v
}

// GetUsername returns the Username field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetUsername() string {
	if o == nil || IsNil(o.Username) {
		var ret string
		return ret
	}
	return *o.Username
}

// GetUsernameOk returns a tuple with the Username field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetUsernameOk() (*string, bool) {
	if o == nil || IsNil(o.Username) {
		return nil, false
	}
	return o.Username, true
}

// HasUsername returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasUsername() bool {
	if o != nil && !IsNil(o.Username) {
		return true
	}

	return false
}

// SetUsername gets a reference to the given string and assigns it to the Username field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetUsername(v string) {
	o.Username = &v
}

// GetUserpicture returns the Userpicture field value if set, zero value otherwise.
func (o *CoreUserUpdateUsersRequestUsersInner) GetUserpicture() int32 {
	if o == nil || IsNil(o.Userpicture) {
		var ret int32
		return ret
	}
	return *o.Userpicture
}

// GetUserpictureOk returns a tuple with the Userpicture field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) GetUserpictureOk() (*int32, bool) {
	if o == nil || IsNil(o.Userpicture) {
		return nil, false
	}
	return o.Userpicture, true
}

// HasUserpicture returns a boolean if a field has been set.
func (o *CoreUserUpdateUsersRequestUsersInner) HasUserpicture() bool {
	if o != nil && !IsNil(o.Userpicture) {
		return true
	}

	return false
}

// SetUserpicture gets a reference to the given int32 and assigns it to the Userpicture field.
func (o *CoreUserUpdateUsersRequestUsersInner) SetUserpicture(v int32) {
	o.Userpicture = &v
}

func (o CoreUserUpdateUsersRequestUsersInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreUserUpdateUsersRequestUsersInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Address) {
		toSerialize["address"] = o.Address
	}
	if !IsNil(o.Alternatename) {
		toSerialize["alternatename"] = o.Alternatename
	}
	if !IsNil(o.Auth) {
		toSerialize["auth"] = o.Auth
	}
	if !IsNil(o.Calendartype) {
		toSerialize["calendartype"] = o.Calendartype
	}
	if !IsNil(o.City) {
		toSerialize["city"] = o.City
	}
	if !IsNil(o.Country) {
		toSerialize["country"] = o.Country
	}
	if !IsNil(o.Customfields) {
		toSerialize["customfields"] = o.Customfields
	}
	if !IsNil(o.Department) {
		toSerialize["department"] = o.Department
	}
	if !IsNil(o.Description) {
		toSerialize["description"] = o.Description
	}
	if !IsNil(o.Email) {
		toSerialize["email"] = o.Email
	}
	if !IsNil(o.Firstname) {
		toSerialize["firstname"] = o.Firstname
	}
	if !IsNil(o.Firstnamephonetic) {
		toSerialize["firstnamephonetic"] = o.Firstnamephonetic
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Idnumber) {
		toSerialize["idnumber"] = o.Idnumber
	}
	if !IsNil(o.Institution) {
		toSerialize["institution"] = o.Institution
	}
	if !IsNil(o.Interests) {
		toSerialize["interests"] = o.Interests
	}
	if !IsNil(o.Lang) {
		toSerialize["lang"] = o.Lang
	}
	if !IsNil(o.Lastname) {
		toSerialize["lastname"] = o.Lastname
	}
	if !IsNil(o.Lastnamephonetic) {
		toSerialize["lastnamephonetic"] = o.Lastnamephonetic
	}
	if !IsNil(o.Maildisplay) {
		toSerialize["maildisplay"] = o.Maildisplay
	}
	if !IsNil(o.Mailformat) {
		toSerialize["mailformat"] = o.Mailformat
	}
	if !IsNil(o.Middlename) {
		toSerialize["middlename"] = o.Middlename
	}
	if !IsNil(o.Password) {
		toSerialize["password"] = o.Password
	}
	if !IsNil(o.Phone1) {
		toSerialize["phone1"] = o.Phone1
	}
	if !IsNil(o.Phone2) {
		toSerialize["phone2"] = o.Phone2
	}
	if !IsNil(o.Preferences) {
		toSerialize["preferences"] = o.Preferences
	}
	if !IsNil(o.Suspended) {
		toSerialize["suspended"] = o.Suspended
	}
	if !IsNil(o.Theme) {
		toSerialize["theme"] = o.Theme
	}
	if !IsNil(o.Timezone) {
		toSerialize["timezone"] = o.Timezone
	}
	if !IsNil(o.Username) {
		toSerialize["username"] = o.Username
	}
	if !IsNil(o.Userpicture) {
		toSerialize["userpicture"] = o.Userpicture
	}
	return toSerialize, nil
}

type NullableCoreUserUpdateUsersRequestUsersInner struct {
	value *CoreUserUpdateUsersRequestUsersInner
	isSet bool
}

func (v NullableCoreUserUpdateUsersRequestUsersInner) Get() *CoreUserUpdateUsersRequestUsersInner {
	return v.value
}

func (v *NullableCoreUserUpdateUsersRequestUsersInner) Set(val *CoreUserUpdateUsersRequestUsersInner) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreUserUpdateUsersRequestUsersInner) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreUserUpdateUsersRequestUsersInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreUserUpdateUsersRequestUsersInner(val *CoreUserUpdateUsersRequestUsersInner) *NullableCoreUserUpdateUsersRequestUsersInner {
	return &NullableCoreUserUpdateUsersRequestUsersInner{value: val, isSet: true}
}

func (v NullableCoreUserUpdateUsersRequestUsersInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreUserUpdateUsersRequestUsersInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


