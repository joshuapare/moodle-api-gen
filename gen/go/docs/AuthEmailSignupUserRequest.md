# AuthEmailSignupUserRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**City** | Pointer to **string** | Home city of the user | [optional] [default to ""]
**Country** | Pointer to **string** | Home country code | [optional] [default to ""]
**Customprofilefields** | Pointer to [**[]AuthEmailSignupUserRequestCustomprofilefieldsInner**](AuthEmailSignupUserRequestCustomprofilefieldsInner.md) |  | [optional] 
**Email** | **string** | A valid and unique email address | [default to "null"]
**Firstname** | **string** | The first name(s) of the user | [default to "null"]
**Lastname** | **string** | The family name of the user | [default to "null"]
**Password** | **string** | Plain text password | [default to "null"]
**Recaptchachallengehash** | Pointer to **string** | Recaptcha challenge hash | [optional] [default to ""]
**Recaptcharesponse** | Pointer to **string** | Recaptcha response | [optional] [default to ""]
**Redirect** | Pointer to **string** | Redirect the user to this site url after confirmation. | [optional] [default to ""]
**Username** | **string** | Username | [default to "null"]

## Methods

### NewAuthEmailSignupUserRequest

`func NewAuthEmailSignupUserRequest(email string, firstname string, lastname string, password string, username string, ) *AuthEmailSignupUserRequest`

NewAuthEmailSignupUserRequest instantiates a new AuthEmailSignupUserRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuthEmailSignupUserRequestWithDefaults

`func NewAuthEmailSignupUserRequestWithDefaults() *AuthEmailSignupUserRequest`

NewAuthEmailSignupUserRequestWithDefaults instantiates a new AuthEmailSignupUserRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCity

`func (o *AuthEmailSignupUserRequest) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *AuthEmailSignupUserRequest) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *AuthEmailSignupUserRequest) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *AuthEmailSignupUserRequest) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetCountry

`func (o *AuthEmailSignupUserRequest) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *AuthEmailSignupUserRequest) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *AuthEmailSignupUserRequest) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *AuthEmailSignupUserRequest) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCustomprofilefields

`func (o *AuthEmailSignupUserRequest) GetCustomprofilefields() []AuthEmailSignupUserRequestCustomprofilefieldsInner`

GetCustomprofilefields returns the Customprofilefields field if non-nil, zero value otherwise.

### GetCustomprofilefieldsOk

`func (o *AuthEmailSignupUserRequest) GetCustomprofilefieldsOk() (*[]AuthEmailSignupUserRequestCustomprofilefieldsInner, bool)`

GetCustomprofilefieldsOk returns a tuple with the Customprofilefields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomprofilefields

`func (o *AuthEmailSignupUserRequest) SetCustomprofilefields(v []AuthEmailSignupUserRequestCustomprofilefieldsInner)`

SetCustomprofilefields sets Customprofilefields field to given value.

### HasCustomprofilefields

`func (o *AuthEmailSignupUserRequest) HasCustomprofilefields() bool`

HasCustomprofilefields returns a boolean if a field has been set.

### GetEmail

`func (o *AuthEmailSignupUserRequest) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *AuthEmailSignupUserRequest) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *AuthEmailSignupUserRequest) SetEmail(v string)`

SetEmail sets Email field to given value.


### GetFirstname

`func (o *AuthEmailSignupUserRequest) GetFirstname() string`

GetFirstname returns the Firstname field if non-nil, zero value otherwise.

### GetFirstnameOk

`func (o *AuthEmailSignupUserRequest) GetFirstnameOk() (*string, bool)`

GetFirstnameOk returns a tuple with the Firstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstname

`func (o *AuthEmailSignupUserRequest) SetFirstname(v string)`

SetFirstname sets Firstname field to given value.


### GetLastname

`func (o *AuthEmailSignupUserRequest) GetLastname() string`

GetLastname returns the Lastname field if non-nil, zero value otherwise.

### GetLastnameOk

`func (o *AuthEmailSignupUserRequest) GetLastnameOk() (*string, bool)`

GetLastnameOk returns a tuple with the Lastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastname

`func (o *AuthEmailSignupUserRequest) SetLastname(v string)`

SetLastname sets Lastname field to given value.


### GetPassword

`func (o *AuthEmailSignupUserRequest) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *AuthEmailSignupUserRequest) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *AuthEmailSignupUserRequest) SetPassword(v string)`

SetPassword sets Password field to given value.


### GetRecaptchachallengehash

`func (o *AuthEmailSignupUserRequest) GetRecaptchachallengehash() string`

GetRecaptchachallengehash returns the Recaptchachallengehash field if non-nil, zero value otherwise.

### GetRecaptchachallengehashOk

`func (o *AuthEmailSignupUserRequest) GetRecaptchachallengehashOk() (*string, bool)`

GetRecaptchachallengehashOk returns a tuple with the Recaptchachallengehash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecaptchachallengehash

`func (o *AuthEmailSignupUserRequest) SetRecaptchachallengehash(v string)`

SetRecaptchachallengehash sets Recaptchachallengehash field to given value.

### HasRecaptchachallengehash

`func (o *AuthEmailSignupUserRequest) HasRecaptchachallengehash() bool`

HasRecaptchachallengehash returns a boolean if a field has been set.

### GetRecaptcharesponse

`func (o *AuthEmailSignupUserRequest) GetRecaptcharesponse() string`

GetRecaptcharesponse returns the Recaptcharesponse field if non-nil, zero value otherwise.

### GetRecaptcharesponseOk

`func (o *AuthEmailSignupUserRequest) GetRecaptcharesponseOk() (*string, bool)`

GetRecaptcharesponseOk returns a tuple with the Recaptcharesponse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecaptcharesponse

`func (o *AuthEmailSignupUserRequest) SetRecaptcharesponse(v string)`

SetRecaptcharesponse sets Recaptcharesponse field to given value.

### HasRecaptcharesponse

`func (o *AuthEmailSignupUserRequest) HasRecaptcharesponse() bool`

HasRecaptcharesponse returns a boolean if a field has been set.

### GetRedirect

`func (o *AuthEmailSignupUserRequest) GetRedirect() string`

GetRedirect returns the Redirect field if non-nil, zero value otherwise.

### GetRedirectOk

`func (o *AuthEmailSignupUserRequest) GetRedirectOk() (*string, bool)`

GetRedirectOk returns a tuple with the Redirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRedirect

`func (o *AuthEmailSignupUserRequest) SetRedirect(v string)`

SetRedirect sets Redirect field to given value.

### HasRedirect

`func (o *AuthEmailSignupUserRequest) HasRedirect() bool`

HasRedirect returns a boolean if a field has been set.

### GetUsername

`func (o *AuthEmailSignupUserRequest) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *AuthEmailSignupUserRequest) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *AuthEmailSignupUserRequest) SetUsername(v string)`

SetUsername sets Username field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


