# ToolMobileGetPublicConfig200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Agedigitalconsentverification** | Pointer to **bool** | Whether age digital consent verification                     is enabled. | [optional] [default to null]
**Authinstructions** | **string** | Authentication instructions. | [default to "null"]
**Authloginviaemail** | **int32** | Whether log in via email is enabled. | [default to null]
**Authnoneenabled** | **int32** | Whether auth none is enabled. | [default to null]
**Autolang** | Pointer to **int32** | Whether to detect default language                     from browser setting. | [optional] [default to null]
**Compactlogourl** | Pointer to **string** | The site compact logo URL | [optional] [default to "null"]
**Country** | Pointer to **string** | Default site country | [optional] [default to "null"]
**Enablemobilewebservice** | **int32** | Whether the Mobile service is enabled. | [default to null]
**Enablewebservices** | **int32** | Whether Web Services are enabled. | [default to null]
**Forgottenpasswordurl** | **string** | Forgotten password URL. | [default to "null"]
**Guestlogin** | **int32** | Whether guest login is enabled. | [default to null]
**Httpswwwroot** | **string** | Site https URL (if httpslogin is enabled). | [default to "null"]
**Identityproviders** | Pointer to [**[]ToolMobileGetPublicConfig200ResponseIdentityprovidersInner**](ToolMobileGetPublicConfig200ResponseIdentityprovidersInner.md) |  | [optional] 
**Lang** | Pointer to **string** | Default language for the site. | [optional] [default to "null"]
**Langlist** | Pointer to **string** | Languages on language menu. | [optional] [default to "null"]
**Langmenu** | Pointer to **int32** | Whether the language menu should be displayed. | [optional] [default to null]
**Launchurl** | Pointer to **string** | SSO login launch URL. | [optional] [default to "null"]
**Locale** | Pointer to **string** | Sitewide locale. | [optional] [default to "null"]
**Logourl** | Pointer to **string** | The site logo URL | [optional] [default to "null"]
**Maintenanceenabled** | **int32** | Whether site maintenance is enabled. | [default to null]
**Maintenancemessage** | **string** | Maintenance message. | [default to "null"]
**Mobilecssurl** | Pointer to **string** | Mobile custom CSS theme | [optional] 
**Registerauth** | **string** | Authentication method for user registration. | [default to "null"]
**Rememberusername** | **int32** | Values: 0 for No, 1 for Yes, 2 for optional. | [default to null]
**Sitename** | **string** | Site name. | [default to "null"]
**Supportavailability** | Pointer to **int32** | Determines who has access to contact site support. | [optional] [default to null]
**Supportemail** | Pointer to **string** | Site support contact email                     (only if age verification is enabled). | [optional] [default to "null"]
**Supportname** | Pointer to **string** | Site support contact name                     (only if age verification is enabled). | [optional] [default to "null"]
**Supportpage** | Pointer to **string** | Site support page link. | [optional] [default to "null"]
**ToolMobileAndroidappid** | Pointer to **string** | Android app&#39;s unique identifier. | [optional] [default to "null"]
**ToolMobileDisabledfeatures** | Pointer to **string** | Disabled features in the app | [optional] [default to "null"]
**ToolMobileIosappid** | Pointer to **string** | iOS app&#39;s unique identifier. | [optional] [default to "null"]
**ToolMobileMinimumversion** | Pointer to **string** | Minimum required version to access. | [optional] [default to "null"]
**ToolMobileQrcodetype** | Pointer to **int32** | QR login configuration. | [optional] [default to null]
**ToolMobileSetuplink** | Pointer to **string** | App download page. | [optional] [default to "null"]
**Typeoflogin** | **int32** | The type of login. 1 for app, 2 for browser, 3 for embedded. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 
**Wwwroot** | **string** | Site URL. | [default to "null"]

## Methods

### NewToolMobileGetPublicConfig200Response

`func NewToolMobileGetPublicConfig200Response(authinstructions string, authloginviaemail int32, authnoneenabled int32, enablemobilewebservice int32, enablewebservices int32, forgottenpasswordurl string, guestlogin int32, httpswwwroot string, maintenanceenabled int32, maintenancemessage string, registerauth string, rememberusername int32, sitename string, typeoflogin int32, wwwroot string, ) *ToolMobileGetPublicConfig200Response`

NewToolMobileGetPublicConfig200Response instantiates a new ToolMobileGetPublicConfig200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolMobileGetPublicConfig200ResponseWithDefaults

`func NewToolMobileGetPublicConfig200ResponseWithDefaults() *ToolMobileGetPublicConfig200Response`

NewToolMobileGetPublicConfig200ResponseWithDefaults instantiates a new ToolMobileGetPublicConfig200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAgedigitalconsentverification

`func (o *ToolMobileGetPublicConfig200Response) GetAgedigitalconsentverification() bool`

GetAgedigitalconsentverification returns the Agedigitalconsentverification field if non-nil, zero value otherwise.

### GetAgedigitalconsentverificationOk

`func (o *ToolMobileGetPublicConfig200Response) GetAgedigitalconsentverificationOk() (*bool, bool)`

GetAgedigitalconsentverificationOk returns a tuple with the Agedigitalconsentverification field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgedigitalconsentverification

`func (o *ToolMobileGetPublicConfig200Response) SetAgedigitalconsentverification(v bool)`

SetAgedigitalconsentverification sets Agedigitalconsentverification field to given value.

### HasAgedigitalconsentverification

`func (o *ToolMobileGetPublicConfig200Response) HasAgedigitalconsentverification() bool`

HasAgedigitalconsentverification returns a boolean if a field has been set.

### GetAuthinstructions

`func (o *ToolMobileGetPublicConfig200Response) GetAuthinstructions() string`

GetAuthinstructions returns the Authinstructions field if non-nil, zero value otherwise.

### GetAuthinstructionsOk

`func (o *ToolMobileGetPublicConfig200Response) GetAuthinstructionsOk() (*string, bool)`

GetAuthinstructionsOk returns a tuple with the Authinstructions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthinstructions

`func (o *ToolMobileGetPublicConfig200Response) SetAuthinstructions(v string)`

SetAuthinstructions sets Authinstructions field to given value.


### GetAuthloginviaemail

`func (o *ToolMobileGetPublicConfig200Response) GetAuthloginviaemail() int32`

GetAuthloginviaemail returns the Authloginviaemail field if non-nil, zero value otherwise.

### GetAuthloginviaemailOk

`func (o *ToolMobileGetPublicConfig200Response) GetAuthloginviaemailOk() (*int32, bool)`

GetAuthloginviaemailOk returns a tuple with the Authloginviaemail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthloginviaemail

`func (o *ToolMobileGetPublicConfig200Response) SetAuthloginviaemail(v int32)`

SetAuthloginviaemail sets Authloginviaemail field to given value.


### GetAuthnoneenabled

`func (o *ToolMobileGetPublicConfig200Response) GetAuthnoneenabled() int32`

GetAuthnoneenabled returns the Authnoneenabled field if non-nil, zero value otherwise.

### GetAuthnoneenabledOk

`func (o *ToolMobileGetPublicConfig200Response) GetAuthnoneenabledOk() (*int32, bool)`

GetAuthnoneenabledOk returns a tuple with the Authnoneenabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthnoneenabled

`func (o *ToolMobileGetPublicConfig200Response) SetAuthnoneenabled(v int32)`

SetAuthnoneenabled sets Authnoneenabled field to given value.


### GetAutolang

`func (o *ToolMobileGetPublicConfig200Response) GetAutolang() int32`

GetAutolang returns the Autolang field if non-nil, zero value otherwise.

### GetAutolangOk

`func (o *ToolMobileGetPublicConfig200Response) GetAutolangOk() (*int32, bool)`

GetAutolangOk returns a tuple with the Autolang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutolang

`func (o *ToolMobileGetPublicConfig200Response) SetAutolang(v int32)`

SetAutolang sets Autolang field to given value.

### HasAutolang

`func (o *ToolMobileGetPublicConfig200Response) HasAutolang() bool`

HasAutolang returns a boolean if a field has been set.

### GetCompactlogourl

`func (o *ToolMobileGetPublicConfig200Response) GetCompactlogourl() string`

GetCompactlogourl returns the Compactlogourl field if non-nil, zero value otherwise.

### GetCompactlogourlOk

`func (o *ToolMobileGetPublicConfig200Response) GetCompactlogourlOk() (*string, bool)`

GetCompactlogourlOk returns a tuple with the Compactlogourl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompactlogourl

`func (o *ToolMobileGetPublicConfig200Response) SetCompactlogourl(v string)`

SetCompactlogourl sets Compactlogourl field to given value.

### HasCompactlogourl

`func (o *ToolMobileGetPublicConfig200Response) HasCompactlogourl() bool`

HasCompactlogourl returns a boolean if a field has been set.

### GetCountry

`func (o *ToolMobileGetPublicConfig200Response) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *ToolMobileGetPublicConfig200Response) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *ToolMobileGetPublicConfig200Response) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *ToolMobileGetPublicConfig200Response) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetEnablemobilewebservice

`func (o *ToolMobileGetPublicConfig200Response) GetEnablemobilewebservice() int32`

GetEnablemobilewebservice returns the Enablemobilewebservice field if non-nil, zero value otherwise.

### GetEnablemobilewebserviceOk

`func (o *ToolMobileGetPublicConfig200Response) GetEnablemobilewebserviceOk() (*int32, bool)`

GetEnablemobilewebserviceOk returns a tuple with the Enablemobilewebservice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnablemobilewebservice

`func (o *ToolMobileGetPublicConfig200Response) SetEnablemobilewebservice(v int32)`

SetEnablemobilewebservice sets Enablemobilewebservice field to given value.


### GetEnablewebservices

`func (o *ToolMobileGetPublicConfig200Response) GetEnablewebservices() int32`

GetEnablewebservices returns the Enablewebservices field if non-nil, zero value otherwise.

### GetEnablewebservicesOk

`func (o *ToolMobileGetPublicConfig200Response) GetEnablewebservicesOk() (*int32, bool)`

GetEnablewebservicesOk returns a tuple with the Enablewebservices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnablewebservices

`func (o *ToolMobileGetPublicConfig200Response) SetEnablewebservices(v int32)`

SetEnablewebservices sets Enablewebservices field to given value.


### GetForgottenpasswordurl

`func (o *ToolMobileGetPublicConfig200Response) GetForgottenpasswordurl() string`

GetForgottenpasswordurl returns the Forgottenpasswordurl field if non-nil, zero value otherwise.

### GetForgottenpasswordurlOk

`func (o *ToolMobileGetPublicConfig200Response) GetForgottenpasswordurlOk() (*string, bool)`

GetForgottenpasswordurlOk returns a tuple with the Forgottenpasswordurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForgottenpasswordurl

`func (o *ToolMobileGetPublicConfig200Response) SetForgottenpasswordurl(v string)`

SetForgottenpasswordurl sets Forgottenpasswordurl field to given value.


### GetGuestlogin

`func (o *ToolMobileGetPublicConfig200Response) GetGuestlogin() int32`

GetGuestlogin returns the Guestlogin field if non-nil, zero value otherwise.

### GetGuestloginOk

`func (o *ToolMobileGetPublicConfig200Response) GetGuestloginOk() (*int32, bool)`

GetGuestloginOk returns a tuple with the Guestlogin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuestlogin

`func (o *ToolMobileGetPublicConfig200Response) SetGuestlogin(v int32)`

SetGuestlogin sets Guestlogin field to given value.


### GetHttpswwwroot

`func (o *ToolMobileGetPublicConfig200Response) GetHttpswwwroot() string`

GetHttpswwwroot returns the Httpswwwroot field if non-nil, zero value otherwise.

### GetHttpswwwrootOk

`func (o *ToolMobileGetPublicConfig200Response) GetHttpswwwrootOk() (*string, bool)`

GetHttpswwwrootOk returns a tuple with the Httpswwwroot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHttpswwwroot

`func (o *ToolMobileGetPublicConfig200Response) SetHttpswwwroot(v string)`

SetHttpswwwroot sets Httpswwwroot field to given value.


### GetIdentityproviders

`func (o *ToolMobileGetPublicConfig200Response) GetIdentityproviders() []ToolMobileGetPublicConfig200ResponseIdentityprovidersInner`

GetIdentityproviders returns the Identityproviders field if non-nil, zero value otherwise.

### GetIdentityprovidersOk

`func (o *ToolMobileGetPublicConfig200Response) GetIdentityprovidersOk() (*[]ToolMobileGetPublicConfig200ResponseIdentityprovidersInner, bool)`

GetIdentityprovidersOk returns a tuple with the Identityproviders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityproviders

`func (o *ToolMobileGetPublicConfig200Response) SetIdentityproviders(v []ToolMobileGetPublicConfig200ResponseIdentityprovidersInner)`

SetIdentityproviders sets Identityproviders field to given value.

### HasIdentityproviders

`func (o *ToolMobileGetPublicConfig200Response) HasIdentityproviders() bool`

HasIdentityproviders returns a boolean if a field has been set.

### GetLang

`func (o *ToolMobileGetPublicConfig200Response) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ToolMobileGetPublicConfig200Response) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ToolMobileGetPublicConfig200Response) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ToolMobileGetPublicConfig200Response) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetLanglist

`func (o *ToolMobileGetPublicConfig200Response) GetLanglist() string`

GetLanglist returns the Langlist field if non-nil, zero value otherwise.

### GetLanglistOk

`func (o *ToolMobileGetPublicConfig200Response) GetLanglistOk() (*string, bool)`

GetLanglistOk returns a tuple with the Langlist field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanglist

`func (o *ToolMobileGetPublicConfig200Response) SetLanglist(v string)`

SetLanglist sets Langlist field to given value.

### HasLanglist

`func (o *ToolMobileGetPublicConfig200Response) HasLanglist() bool`

HasLanglist returns a boolean if a field has been set.

### GetLangmenu

`func (o *ToolMobileGetPublicConfig200Response) GetLangmenu() int32`

GetLangmenu returns the Langmenu field if non-nil, zero value otherwise.

### GetLangmenuOk

`func (o *ToolMobileGetPublicConfig200Response) GetLangmenuOk() (*int32, bool)`

GetLangmenuOk returns a tuple with the Langmenu field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLangmenu

`func (o *ToolMobileGetPublicConfig200Response) SetLangmenu(v int32)`

SetLangmenu sets Langmenu field to given value.

### HasLangmenu

`func (o *ToolMobileGetPublicConfig200Response) HasLangmenu() bool`

HasLangmenu returns a boolean if a field has been set.

### GetLaunchurl

`func (o *ToolMobileGetPublicConfig200Response) GetLaunchurl() string`

GetLaunchurl returns the Launchurl field if non-nil, zero value otherwise.

### GetLaunchurlOk

`func (o *ToolMobileGetPublicConfig200Response) GetLaunchurlOk() (*string, bool)`

GetLaunchurlOk returns a tuple with the Launchurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLaunchurl

`func (o *ToolMobileGetPublicConfig200Response) SetLaunchurl(v string)`

SetLaunchurl sets Launchurl field to given value.

### HasLaunchurl

`func (o *ToolMobileGetPublicConfig200Response) HasLaunchurl() bool`

HasLaunchurl returns a boolean if a field has been set.

### GetLocale

`func (o *ToolMobileGetPublicConfig200Response) GetLocale() string`

GetLocale returns the Locale field if non-nil, zero value otherwise.

### GetLocaleOk

`func (o *ToolMobileGetPublicConfig200Response) GetLocaleOk() (*string, bool)`

GetLocaleOk returns a tuple with the Locale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocale

`func (o *ToolMobileGetPublicConfig200Response) SetLocale(v string)`

SetLocale sets Locale field to given value.

### HasLocale

`func (o *ToolMobileGetPublicConfig200Response) HasLocale() bool`

HasLocale returns a boolean if a field has been set.

### GetLogourl

`func (o *ToolMobileGetPublicConfig200Response) GetLogourl() string`

GetLogourl returns the Logourl field if non-nil, zero value otherwise.

### GetLogourlOk

`func (o *ToolMobileGetPublicConfig200Response) GetLogourlOk() (*string, bool)`

GetLogourlOk returns a tuple with the Logourl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogourl

`func (o *ToolMobileGetPublicConfig200Response) SetLogourl(v string)`

SetLogourl sets Logourl field to given value.

### HasLogourl

`func (o *ToolMobileGetPublicConfig200Response) HasLogourl() bool`

HasLogourl returns a boolean if a field has been set.

### GetMaintenanceenabled

`func (o *ToolMobileGetPublicConfig200Response) GetMaintenanceenabled() int32`

GetMaintenanceenabled returns the Maintenanceenabled field if non-nil, zero value otherwise.

### GetMaintenanceenabledOk

`func (o *ToolMobileGetPublicConfig200Response) GetMaintenanceenabledOk() (*int32, bool)`

GetMaintenanceenabledOk returns a tuple with the Maintenanceenabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaintenanceenabled

`func (o *ToolMobileGetPublicConfig200Response) SetMaintenanceenabled(v int32)`

SetMaintenanceenabled sets Maintenanceenabled field to given value.


### GetMaintenancemessage

`func (o *ToolMobileGetPublicConfig200Response) GetMaintenancemessage() string`

GetMaintenancemessage returns the Maintenancemessage field if non-nil, zero value otherwise.

### GetMaintenancemessageOk

`func (o *ToolMobileGetPublicConfig200Response) GetMaintenancemessageOk() (*string, bool)`

GetMaintenancemessageOk returns a tuple with the Maintenancemessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaintenancemessage

`func (o *ToolMobileGetPublicConfig200Response) SetMaintenancemessage(v string)`

SetMaintenancemessage sets Maintenancemessage field to given value.


### GetMobilecssurl

`func (o *ToolMobileGetPublicConfig200Response) GetMobilecssurl() string`

GetMobilecssurl returns the Mobilecssurl field if non-nil, zero value otherwise.

### GetMobilecssurlOk

`func (o *ToolMobileGetPublicConfig200Response) GetMobilecssurlOk() (*string, bool)`

GetMobilecssurlOk returns a tuple with the Mobilecssurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMobilecssurl

`func (o *ToolMobileGetPublicConfig200Response) SetMobilecssurl(v string)`

SetMobilecssurl sets Mobilecssurl field to given value.

### HasMobilecssurl

`func (o *ToolMobileGetPublicConfig200Response) HasMobilecssurl() bool`

HasMobilecssurl returns a boolean if a field has been set.

### GetRegisterauth

`func (o *ToolMobileGetPublicConfig200Response) GetRegisterauth() string`

GetRegisterauth returns the Registerauth field if non-nil, zero value otherwise.

### GetRegisterauthOk

`func (o *ToolMobileGetPublicConfig200Response) GetRegisterauthOk() (*string, bool)`

GetRegisterauthOk returns a tuple with the Registerauth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegisterauth

`func (o *ToolMobileGetPublicConfig200Response) SetRegisterauth(v string)`

SetRegisterauth sets Registerauth field to given value.


### GetRememberusername

`func (o *ToolMobileGetPublicConfig200Response) GetRememberusername() int32`

GetRememberusername returns the Rememberusername field if non-nil, zero value otherwise.

### GetRememberusernameOk

`func (o *ToolMobileGetPublicConfig200Response) GetRememberusernameOk() (*int32, bool)`

GetRememberusernameOk returns a tuple with the Rememberusername field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRememberusername

`func (o *ToolMobileGetPublicConfig200Response) SetRememberusername(v int32)`

SetRememberusername sets Rememberusername field to given value.


### GetSitename

`func (o *ToolMobileGetPublicConfig200Response) GetSitename() string`

GetSitename returns the Sitename field if non-nil, zero value otherwise.

### GetSitenameOk

`func (o *ToolMobileGetPublicConfig200Response) GetSitenameOk() (*string, bool)`

GetSitenameOk returns a tuple with the Sitename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSitename

`func (o *ToolMobileGetPublicConfig200Response) SetSitename(v string)`

SetSitename sets Sitename field to given value.


### GetSupportavailability

`func (o *ToolMobileGetPublicConfig200Response) GetSupportavailability() int32`

GetSupportavailability returns the Supportavailability field if non-nil, zero value otherwise.

### GetSupportavailabilityOk

`func (o *ToolMobileGetPublicConfig200Response) GetSupportavailabilityOk() (*int32, bool)`

GetSupportavailabilityOk returns a tuple with the Supportavailability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupportavailability

`func (o *ToolMobileGetPublicConfig200Response) SetSupportavailability(v int32)`

SetSupportavailability sets Supportavailability field to given value.

### HasSupportavailability

`func (o *ToolMobileGetPublicConfig200Response) HasSupportavailability() bool`

HasSupportavailability returns a boolean if a field has been set.

### GetSupportemail

`func (o *ToolMobileGetPublicConfig200Response) GetSupportemail() string`

GetSupportemail returns the Supportemail field if non-nil, zero value otherwise.

### GetSupportemailOk

`func (o *ToolMobileGetPublicConfig200Response) GetSupportemailOk() (*string, bool)`

GetSupportemailOk returns a tuple with the Supportemail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupportemail

`func (o *ToolMobileGetPublicConfig200Response) SetSupportemail(v string)`

SetSupportemail sets Supportemail field to given value.

### HasSupportemail

`func (o *ToolMobileGetPublicConfig200Response) HasSupportemail() bool`

HasSupportemail returns a boolean if a field has been set.

### GetSupportname

`func (o *ToolMobileGetPublicConfig200Response) GetSupportname() string`

GetSupportname returns the Supportname field if non-nil, zero value otherwise.

### GetSupportnameOk

`func (o *ToolMobileGetPublicConfig200Response) GetSupportnameOk() (*string, bool)`

GetSupportnameOk returns a tuple with the Supportname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupportname

`func (o *ToolMobileGetPublicConfig200Response) SetSupportname(v string)`

SetSupportname sets Supportname field to given value.

### HasSupportname

`func (o *ToolMobileGetPublicConfig200Response) HasSupportname() bool`

HasSupportname returns a boolean if a field has been set.

### GetSupportpage

`func (o *ToolMobileGetPublicConfig200Response) GetSupportpage() string`

GetSupportpage returns the Supportpage field if non-nil, zero value otherwise.

### GetSupportpageOk

`func (o *ToolMobileGetPublicConfig200Response) GetSupportpageOk() (*string, bool)`

GetSupportpageOk returns a tuple with the Supportpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupportpage

`func (o *ToolMobileGetPublicConfig200Response) SetSupportpage(v string)`

SetSupportpage sets Supportpage field to given value.

### HasSupportpage

`func (o *ToolMobileGetPublicConfig200Response) HasSupportpage() bool`

HasSupportpage returns a boolean if a field has been set.

### GetToolMobileAndroidappid

`func (o *ToolMobileGetPublicConfig200Response) GetToolMobileAndroidappid() string`

GetToolMobileAndroidappid returns the ToolMobileAndroidappid field if non-nil, zero value otherwise.

### GetToolMobileAndroidappidOk

`func (o *ToolMobileGetPublicConfig200Response) GetToolMobileAndroidappidOk() (*string, bool)`

GetToolMobileAndroidappidOk returns a tuple with the ToolMobileAndroidappid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolMobileAndroidappid

`func (o *ToolMobileGetPublicConfig200Response) SetToolMobileAndroidappid(v string)`

SetToolMobileAndroidappid sets ToolMobileAndroidappid field to given value.

### HasToolMobileAndroidappid

`func (o *ToolMobileGetPublicConfig200Response) HasToolMobileAndroidappid() bool`

HasToolMobileAndroidappid returns a boolean if a field has been set.

### GetToolMobileDisabledfeatures

`func (o *ToolMobileGetPublicConfig200Response) GetToolMobileDisabledfeatures() string`

GetToolMobileDisabledfeatures returns the ToolMobileDisabledfeatures field if non-nil, zero value otherwise.

### GetToolMobileDisabledfeaturesOk

`func (o *ToolMobileGetPublicConfig200Response) GetToolMobileDisabledfeaturesOk() (*string, bool)`

GetToolMobileDisabledfeaturesOk returns a tuple with the ToolMobileDisabledfeatures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolMobileDisabledfeatures

`func (o *ToolMobileGetPublicConfig200Response) SetToolMobileDisabledfeatures(v string)`

SetToolMobileDisabledfeatures sets ToolMobileDisabledfeatures field to given value.

### HasToolMobileDisabledfeatures

`func (o *ToolMobileGetPublicConfig200Response) HasToolMobileDisabledfeatures() bool`

HasToolMobileDisabledfeatures returns a boolean if a field has been set.

### GetToolMobileIosappid

`func (o *ToolMobileGetPublicConfig200Response) GetToolMobileIosappid() string`

GetToolMobileIosappid returns the ToolMobileIosappid field if non-nil, zero value otherwise.

### GetToolMobileIosappidOk

`func (o *ToolMobileGetPublicConfig200Response) GetToolMobileIosappidOk() (*string, bool)`

GetToolMobileIosappidOk returns a tuple with the ToolMobileIosappid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolMobileIosappid

`func (o *ToolMobileGetPublicConfig200Response) SetToolMobileIosappid(v string)`

SetToolMobileIosappid sets ToolMobileIosappid field to given value.

### HasToolMobileIosappid

`func (o *ToolMobileGetPublicConfig200Response) HasToolMobileIosappid() bool`

HasToolMobileIosappid returns a boolean if a field has been set.

### GetToolMobileMinimumversion

`func (o *ToolMobileGetPublicConfig200Response) GetToolMobileMinimumversion() string`

GetToolMobileMinimumversion returns the ToolMobileMinimumversion field if non-nil, zero value otherwise.

### GetToolMobileMinimumversionOk

`func (o *ToolMobileGetPublicConfig200Response) GetToolMobileMinimumversionOk() (*string, bool)`

GetToolMobileMinimumversionOk returns a tuple with the ToolMobileMinimumversion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolMobileMinimumversion

`func (o *ToolMobileGetPublicConfig200Response) SetToolMobileMinimumversion(v string)`

SetToolMobileMinimumversion sets ToolMobileMinimumversion field to given value.

### HasToolMobileMinimumversion

`func (o *ToolMobileGetPublicConfig200Response) HasToolMobileMinimumversion() bool`

HasToolMobileMinimumversion returns a boolean if a field has been set.

### GetToolMobileQrcodetype

`func (o *ToolMobileGetPublicConfig200Response) GetToolMobileQrcodetype() int32`

GetToolMobileQrcodetype returns the ToolMobileQrcodetype field if non-nil, zero value otherwise.

### GetToolMobileQrcodetypeOk

`func (o *ToolMobileGetPublicConfig200Response) GetToolMobileQrcodetypeOk() (*int32, bool)`

GetToolMobileQrcodetypeOk returns a tuple with the ToolMobileQrcodetype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolMobileQrcodetype

`func (o *ToolMobileGetPublicConfig200Response) SetToolMobileQrcodetype(v int32)`

SetToolMobileQrcodetype sets ToolMobileQrcodetype field to given value.

### HasToolMobileQrcodetype

`func (o *ToolMobileGetPublicConfig200Response) HasToolMobileQrcodetype() bool`

HasToolMobileQrcodetype returns a boolean if a field has been set.

### GetToolMobileSetuplink

`func (o *ToolMobileGetPublicConfig200Response) GetToolMobileSetuplink() string`

GetToolMobileSetuplink returns the ToolMobileSetuplink field if non-nil, zero value otherwise.

### GetToolMobileSetuplinkOk

`func (o *ToolMobileGetPublicConfig200Response) GetToolMobileSetuplinkOk() (*string, bool)`

GetToolMobileSetuplinkOk returns a tuple with the ToolMobileSetuplink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolMobileSetuplink

`func (o *ToolMobileGetPublicConfig200Response) SetToolMobileSetuplink(v string)`

SetToolMobileSetuplink sets ToolMobileSetuplink field to given value.

### HasToolMobileSetuplink

`func (o *ToolMobileGetPublicConfig200Response) HasToolMobileSetuplink() bool`

HasToolMobileSetuplink returns a boolean if a field has been set.

### GetTypeoflogin

`func (o *ToolMobileGetPublicConfig200Response) GetTypeoflogin() int32`

GetTypeoflogin returns the Typeoflogin field if non-nil, zero value otherwise.

### GetTypeofloginOk

`func (o *ToolMobileGetPublicConfig200Response) GetTypeofloginOk() (*int32, bool)`

GetTypeofloginOk returns a tuple with the Typeoflogin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypeoflogin

`func (o *ToolMobileGetPublicConfig200Response) SetTypeoflogin(v int32)`

SetTypeoflogin sets Typeoflogin field to given value.


### GetWarnings

`func (o *ToolMobileGetPublicConfig200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ToolMobileGetPublicConfig200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ToolMobileGetPublicConfig200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ToolMobileGetPublicConfig200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.

### GetWwwroot

`func (o *ToolMobileGetPublicConfig200Response) GetWwwroot() string`

GetWwwroot returns the Wwwroot field if non-nil, zero value otherwise.

### GetWwwrootOk

`func (o *ToolMobileGetPublicConfig200Response) GetWwwrootOk() (*string, bool)`

GetWwwrootOk returns a tuple with the Wwwroot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWwwroot

`func (o *ToolMobileGetPublicConfig200Response) SetWwwroot(v string)`

SetWwwroot sets Wwwroot field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


