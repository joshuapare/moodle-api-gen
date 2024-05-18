# AuthEmailGetSignupSettings200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | Pointer to **string** | Default country | [optional] [default to "null"]
**Defaultcity** | Pointer to **string** | Default city | [optional] [default to "null"]
**Namefields** | **[]map[string]interface{}** |  | 
**Passwordpolicy** | Pointer to **string** | Password policy | [optional] [default to "null"]
**Profilefields** | Pointer to [**[]AuthEmailGetSignupSettings200ResponseProfilefieldsInner**](AuthEmailGetSignupSettings200ResponseProfilefieldsInner.md) |  | [optional] 
**Recaptchachallengehash** | Pointer to **string** | Recaptcha challenge hash | [optional] [default to "null"]
**Recaptchachallengeimage** | Pointer to **string** | Recaptcha challenge noscript image | [optional] [default to "null"]
**Recaptchachallengejs** | Pointer to **string** | Recaptcha challenge js url | [optional] [default to "null"]
**Recaptchapublickey** | Pointer to **string** | Recaptcha public key | [optional] [default to "null"]
**Sitepolicy** | Pointer to **string** | Site policy | [optional] [default to "null"]
**Sitepolicyhandler** | Pointer to **string** | Site policy handler | [optional] [default to "null"]
**Warnings** | Pointer to [**[]AuthEmailGetSignupSettings200ResponseWarningsInner**](AuthEmailGetSignupSettings200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewAuthEmailGetSignupSettings200Response

`func NewAuthEmailGetSignupSettings200Response(namefields []map[string]interface{}, ) *AuthEmailGetSignupSettings200Response`

NewAuthEmailGetSignupSettings200Response instantiates a new AuthEmailGetSignupSettings200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuthEmailGetSignupSettings200ResponseWithDefaults

`func NewAuthEmailGetSignupSettings200ResponseWithDefaults() *AuthEmailGetSignupSettings200Response`

NewAuthEmailGetSignupSettings200ResponseWithDefaults instantiates a new AuthEmailGetSignupSettings200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountry

`func (o *AuthEmailGetSignupSettings200Response) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *AuthEmailGetSignupSettings200Response) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *AuthEmailGetSignupSettings200Response) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *AuthEmailGetSignupSettings200Response) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetDefaultcity

`func (o *AuthEmailGetSignupSettings200Response) GetDefaultcity() string`

GetDefaultcity returns the Defaultcity field if non-nil, zero value otherwise.

### GetDefaultcityOk

`func (o *AuthEmailGetSignupSettings200Response) GetDefaultcityOk() (*string, bool)`

GetDefaultcityOk returns a tuple with the Defaultcity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultcity

`func (o *AuthEmailGetSignupSettings200Response) SetDefaultcity(v string)`

SetDefaultcity sets Defaultcity field to given value.

### HasDefaultcity

`func (o *AuthEmailGetSignupSettings200Response) HasDefaultcity() bool`

HasDefaultcity returns a boolean if a field has been set.

### GetNamefields

`func (o *AuthEmailGetSignupSettings200Response) GetNamefields() []map[string]interface{}`

GetNamefields returns the Namefields field if non-nil, zero value otherwise.

### GetNamefieldsOk

`func (o *AuthEmailGetSignupSettings200Response) GetNamefieldsOk() (*[]map[string]interface{}, bool)`

GetNamefieldsOk returns a tuple with the Namefields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNamefields

`func (o *AuthEmailGetSignupSettings200Response) SetNamefields(v []map[string]interface{})`

SetNamefields sets Namefields field to given value.


### GetPasswordpolicy

`func (o *AuthEmailGetSignupSettings200Response) GetPasswordpolicy() string`

GetPasswordpolicy returns the Passwordpolicy field if non-nil, zero value otherwise.

### GetPasswordpolicyOk

`func (o *AuthEmailGetSignupSettings200Response) GetPasswordpolicyOk() (*string, bool)`

GetPasswordpolicyOk returns a tuple with the Passwordpolicy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPasswordpolicy

`func (o *AuthEmailGetSignupSettings200Response) SetPasswordpolicy(v string)`

SetPasswordpolicy sets Passwordpolicy field to given value.

### HasPasswordpolicy

`func (o *AuthEmailGetSignupSettings200Response) HasPasswordpolicy() bool`

HasPasswordpolicy returns a boolean if a field has been set.

### GetProfilefields

`func (o *AuthEmailGetSignupSettings200Response) GetProfilefields() []AuthEmailGetSignupSettings200ResponseProfilefieldsInner`

GetProfilefields returns the Profilefields field if non-nil, zero value otherwise.

### GetProfilefieldsOk

`func (o *AuthEmailGetSignupSettings200Response) GetProfilefieldsOk() (*[]AuthEmailGetSignupSettings200ResponseProfilefieldsInner, bool)`

GetProfilefieldsOk returns a tuple with the Profilefields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfilefields

`func (o *AuthEmailGetSignupSettings200Response) SetProfilefields(v []AuthEmailGetSignupSettings200ResponseProfilefieldsInner)`

SetProfilefields sets Profilefields field to given value.

### HasProfilefields

`func (o *AuthEmailGetSignupSettings200Response) HasProfilefields() bool`

HasProfilefields returns a boolean if a field has been set.

### GetRecaptchachallengehash

`func (o *AuthEmailGetSignupSettings200Response) GetRecaptchachallengehash() string`

GetRecaptchachallengehash returns the Recaptchachallengehash field if non-nil, zero value otherwise.

### GetRecaptchachallengehashOk

`func (o *AuthEmailGetSignupSettings200Response) GetRecaptchachallengehashOk() (*string, bool)`

GetRecaptchachallengehashOk returns a tuple with the Recaptchachallengehash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecaptchachallengehash

`func (o *AuthEmailGetSignupSettings200Response) SetRecaptchachallengehash(v string)`

SetRecaptchachallengehash sets Recaptchachallengehash field to given value.

### HasRecaptchachallengehash

`func (o *AuthEmailGetSignupSettings200Response) HasRecaptchachallengehash() bool`

HasRecaptchachallengehash returns a boolean if a field has been set.

### GetRecaptchachallengeimage

`func (o *AuthEmailGetSignupSettings200Response) GetRecaptchachallengeimage() string`

GetRecaptchachallengeimage returns the Recaptchachallengeimage field if non-nil, zero value otherwise.

### GetRecaptchachallengeimageOk

`func (o *AuthEmailGetSignupSettings200Response) GetRecaptchachallengeimageOk() (*string, bool)`

GetRecaptchachallengeimageOk returns a tuple with the Recaptchachallengeimage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecaptchachallengeimage

`func (o *AuthEmailGetSignupSettings200Response) SetRecaptchachallengeimage(v string)`

SetRecaptchachallengeimage sets Recaptchachallengeimage field to given value.

### HasRecaptchachallengeimage

`func (o *AuthEmailGetSignupSettings200Response) HasRecaptchachallengeimage() bool`

HasRecaptchachallengeimage returns a boolean if a field has been set.

### GetRecaptchachallengejs

`func (o *AuthEmailGetSignupSettings200Response) GetRecaptchachallengejs() string`

GetRecaptchachallengejs returns the Recaptchachallengejs field if non-nil, zero value otherwise.

### GetRecaptchachallengejsOk

`func (o *AuthEmailGetSignupSettings200Response) GetRecaptchachallengejsOk() (*string, bool)`

GetRecaptchachallengejsOk returns a tuple with the Recaptchachallengejs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecaptchachallengejs

`func (o *AuthEmailGetSignupSettings200Response) SetRecaptchachallengejs(v string)`

SetRecaptchachallengejs sets Recaptchachallengejs field to given value.

### HasRecaptchachallengejs

`func (o *AuthEmailGetSignupSettings200Response) HasRecaptchachallengejs() bool`

HasRecaptchachallengejs returns a boolean if a field has been set.

### GetRecaptchapublickey

`func (o *AuthEmailGetSignupSettings200Response) GetRecaptchapublickey() string`

GetRecaptchapublickey returns the Recaptchapublickey field if non-nil, zero value otherwise.

### GetRecaptchapublickeyOk

`func (o *AuthEmailGetSignupSettings200Response) GetRecaptchapublickeyOk() (*string, bool)`

GetRecaptchapublickeyOk returns a tuple with the Recaptchapublickey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecaptchapublickey

`func (o *AuthEmailGetSignupSettings200Response) SetRecaptchapublickey(v string)`

SetRecaptchapublickey sets Recaptchapublickey field to given value.

### HasRecaptchapublickey

`func (o *AuthEmailGetSignupSettings200Response) HasRecaptchapublickey() bool`

HasRecaptchapublickey returns a boolean if a field has been set.

### GetSitepolicy

`func (o *AuthEmailGetSignupSettings200Response) GetSitepolicy() string`

GetSitepolicy returns the Sitepolicy field if non-nil, zero value otherwise.

### GetSitepolicyOk

`func (o *AuthEmailGetSignupSettings200Response) GetSitepolicyOk() (*string, bool)`

GetSitepolicyOk returns a tuple with the Sitepolicy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSitepolicy

`func (o *AuthEmailGetSignupSettings200Response) SetSitepolicy(v string)`

SetSitepolicy sets Sitepolicy field to given value.

### HasSitepolicy

`func (o *AuthEmailGetSignupSettings200Response) HasSitepolicy() bool`

HasSitepolicy returns a boolean if a field has been set.

### GetSitepolicyhandler

`func (o *AuthEmailGetSignupSettings200Response) GetSitepolicyhandler() string`

GetSitepolicyhandler returns the Sitepolicyhandler field if non-nil, zero value otherwise.

### GetSitepolicyhandlerOk

`func (o *AuthEmailGetSignupSettings200Response) GetSitepolicyhandlerOk() (*string, bool)`

GetSitepolicyhandlerOk returns a tuple with the Sitepolicyhandler field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSitepolicyhandler

`func (o *AuthEmailGetSignupSettings200Response) SetSitepolicyhandler(v string)`

SetSitepolicyhandler sets Sitepolicyhandler field to given value.

### HasSitepolicyhandler

`func (o *AuthEmailGetSignupSettings200Response) HasSitepolicyhandler() bool`

HasSitepolicyhandler returns a boolean if a field has been set.

### GetWarnings

`func (o *AuthEmailGetSignupSettings200Response) GetWarnings() []AuthEmailGetSignupSettings200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *AuthEmailGetSignupSettings200Response) GetWarningsOk() (*[]AuthEmailGetSignupSettings200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *AuthEmailGetSignupSettings200Response) SetWarnings(v []AuthEmailGetSignupSettings200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *AuthEmailGetSignupSettings200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


