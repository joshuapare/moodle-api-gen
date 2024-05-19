# BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | Pointer to **string** | Company location address | [optional] [default to "null"]
**Autosubscribe** | Pointer to **int32** | User default forum auto-subscribe | [optional] [default to 1]
**City** | Pointer to **string** | Company location city | [optional] [default to "null"]
**Code** | Pointer to **string** | Company code | [optional] [default to ""]
**Companyterminated** | Pointer to **int32** | Company contract is terminated when &lt;&gt; 0 | [optional] [default to 0]
**Country** | Pointer to **string** | Company location country | [optional] [default to "null"]
**Custom1** | Pointer to **string** | Company custom 1 | [optional] [default to "null"]
**Custom2** | Pointer to **string** | Company custom 2 | [optional] [default to "null"]
**Custom3** | Pointer to **string** | Company custom 3 | [optional] [default to "null"]
**Customcss** | Pointer to **string** | Company custom css | [optional] [default to ""]
**Ecommerce** | Pointer to **int32** | Ecommerce is disabled when &#x3D; 0 | [optional] [default to 0]
**Headingcolor** | Pointer to **string** | Company heading color | [optional] [default to ""]
**Hostname** | Pointer to **string** | Company hostname | [optional] [default to ""]
**Htmleditor** | Pointer to **int32** | User default text editor | [optional] [default to 1]
**Lang** | Pointer to **string** | User default language | [optional] [default to "en"]
**Linkcolor** | Pointer to **string** | Company ink color | [optional] [default to ""]
**Maildigest** | Pointer to **int32** | User default digest type | [optional] [default to 0]
**Maildisplay** | Pointer to **int32** | User default email display | [optional] [default to 2]
**Mailformat** | Pointer to **int32** | User default email format | [optional] [default to 1]
**Maincolor** | Pointer to **string** | Company main color | [optional] [default to ""]
**Maxusers** | Pointer to **int32** | Company maximum number of users | [optional] [default to 0]
**Name** | Pointer to **string** | Company long name | [optional] [default to "null"]
**Parentid** | Pointer to **int32** | ID of parent company | [optional] [default to 0]
**Postcode** | Pointer to **string** | Company location postcode | [optional] [default to "null"]
**Region** | Pointer to **string** | Company location region | [optional] [default to "null"]
**Screenreader** | Pointer to **int32** | User default screen reader | [optional] [default to 0]
**Shortname** | Pointer to **string** | Compay short name | [optional] [default to "null"]
**Suspendafter** | Pointer to **int32** | Number of seconds after termination date to suspend the company | [optional] [default to 0]
**Suspended** | Pointer to **int32** | Company is suspended when &lt;&gt; 0 | [optional] [default to 0]
**Theme** | Pointer to **string** | Company theme | [optional] [default to ""]
**Timezone** | Pointer to **string** | User default timezone | [optional] [default to "99"]
**Trackforums** | Pointer to **int32** | User default forum tracking | [optional] [default to 0]
**Validto** | Pointer to **int32** | Contract termination date in unix timestamp | [optional] [default to null]

## Methods

### NewBlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner

`func NewBlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner() *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner`

NewBlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner instantiates a new BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBlockIomadCompanyAdminCreateCompaniesRequestCompaniesInnerWithDefaults

`func NewBlockIomadCompanyAdminCreateCompaniesRequestCompaniesInnerWithDefaults() *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner`

NewBlockIomadCompanyAdminCreateCompaniesRequestCompaniesInnerWithDefaults instantiates a new BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddress

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetAddress() string`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetAddressOk() (*string, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetAddress(v string)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetAutosubscribe

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetAutosubscribe() int32`

GetAutosubscribe returns the Autosubscribe field if non-nil, zero value otherwise.

### GetAutosubscribeOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetAutosubscribeOk() (*int32, bool)`

GetAutosubscribeOk returns a tuple with the Autosubscribe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutosubscribe

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetAutosubscribe(v int32)`

SetAutosubscribe sets Autosubscribe field to given value.

### HasAutosubscribe

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasAutosubscribe() bool`

HasAutosubscribe returns a boolean if a field has been set.

### GetCity

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetCode

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetCode(v string)`

SetCode sets Code field to given value.

### HasCode

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetCompanyterminated

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetCompanyterminated() int32`

GetCompanyterminated returns the Companyterminated field if non-nil, zero value otherwise.

### GetCompanyterminatedOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetCompanyterminatedOk() (*int32, bool)`

GetCompanyterminatedOk returns a tuple with the Companyterminated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompanyterminated

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetCompanyterminated(v int32)`

SetCompanyterminated sets Companyterminated field to given value.

### HasCompanyterminated

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasCompanyterminated() bool`

HasCompanyterminated returns a boolean if a field has been set.

### GetCountry

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCustom1

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetCustom1() string`

GetCustom1 returns the Custom1 field if non-nil, zero value otherwise.

### GetCustom1Ok

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetCustom1Ok() (*string, bool)`

GetCustom1Ok returns a tuple with the Custom1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom1

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetCustom1(v string)`

SetCustom1 sets Custom1 field to given value.

### HasCustom1

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasCustom1() bool`

HasCustom1 returns a boolean if a field has been set.

### GetCustom2

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetCustom2() string`

GetCustom2 returns the Custom2 field if non-nil, zero value otherwise.

### GetCustom2Ok

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetCustom2Ok() (*string, bool)`

GetCustom2Ok returns a tuple with the Custom2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom2

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetCustom2(v string)`

SetCustom2 sets Custom2 field to given value.

### HasCustom2

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasCustom2() bool`

HasCustom2 returns a boolean if a field has been set.

### GetCustom3

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetCustom3() string`

GetCustom3 returns the Custom3 field if non-nil, zero value otherwise.

### GetCustom3Ok

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetCustom3Ok() (*string, bool)`

GetCustom3Ok returns a tuple with the Custom3 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom3

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetCustom3(v string)`

SetCustom3 sets Custom3 field to given value.

### HasCustom3

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasCustom3() bool`

HasCustom3 returns a boolean if a field has been set.

### GetCustomcss

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetCustomcss() string`

GetCustomcss returns the Customcss field if non-nil, zero value otherwise.

### GetCustomcssOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetCustomcssOk() (*string, bool)`

GetCustomcssOk returns a tuple with the Customcss field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomcss

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetCustomcss(v string)`

SetCustomcss sets Customcss field to given value.

### HasCustomcss

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasCustomcss() bool`

HasCustomcss returns a boolean if a field has been set.

### GetEcommerce

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetEcommerce() int32`

GetEcommerce returns the Ecommerce field if non-nil, zero value otherwise.

### GetEcommerceOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetEcommerceOk() (*int32, bool)`

GetEcommerceOk returns a tuple with the Ecommerce field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEcommerce

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetEcommerce(v int32)`

SetEcommerce sets Ecommerce field to given value.

### HasEcommerce

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasEcommerce() bool`

HasEcommerce returns a boolean if a field has been set.

### GetHeadingcolor

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetHeadingcolor() string`

GetHeadingcolor returns the Headingcolor field if non-nil, zero value otherwise.

### GetHeadingcolorOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetHeadingcolorOk() (*string, bool)`

GetHeadingcolorOk returns a tuple with the Headingcolor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeadingcolor

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetHeadingcolor(v string)`

SetHeadingcolor sets Headingcolor field to given value.

### HasHeadingcolor

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasHeadingcolor() bool`

HasHeadingcolor returns a boolean if a field has been set.

### GetHostname

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetHostname() string`

GetHostname returns the Hostname field if non-nil, zero value otherwise.

### GetHostnameOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetHostnameOk() (*string, bool)`

GetHostnameOk returns a tuple with the Hostname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostname

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetHostname(v string)`

SetHostname sets Hostname field to given value.

### HasHostname

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasHostname() bool`

HasHostname returns a boolean if a field has been set.

### GetHtmleditor

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetHtmleditor() int32`

GetHtmleditor returns the Htmleditor field if non-nil, zero value otherwise.

### GetHtmleditorOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetHtmleditorOk() (*int32, bool)`

GetHtmleditorOk returns a tuple with the Htmleditor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHtmleditor

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetHtmleditor(v int32)`

SetHtmleditor sets Htmleditor field to given value.

### HasHtmleditor

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasHtmleditor() bool`

HasHtmleditor returns a boolean if a field has been set.

### GetLang

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetLinkcolor

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetLinkcolor() string`

GetLinkcolor returns the Linkcolor field if non-nil, zero value otherwise.

### GetLinkcolorOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetLinkcolorOk() (*string, bool)`

GetLinkcolorOk returns a tuple with the Linkcolor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLinkcolor

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetLinkcolor(v string)`

SetLinkcolor sets Linkcolor field to given value.

### HasLinkcolor

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasLinkcolor() bool`

HasLinkcolor returns a boolean if a field has been set.

### GetMaildigest

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetMaildigest() int32`

GetMaildigest returns the Maildigest field if non-nil, zero value otherwise.

### GetMaildigestOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetMaildigestOk() (*int32, bool)`

GetMaildigestOk returns a tuple with the Maildigest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaildigest

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetMaildigest(v int32)`

SetMaildigest sets Maildigest field to given value.

### HasMaildigest

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasMaildigest() bool`

HasMaildigest returns a boolean if a field has been set.

### GetMaildisplay

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetMaildisplay() int32`

GetMaildisplay returns the Maildisplay field if non-nil, zero value otherwise.

### GetMaildisplayOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetMaildisplayOk() (*int32, bool)`

GetMaildisplayOk returns a tuple with the Maildisplay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaildisplay

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetMaildisplay(v int32)`

SetMaildisplay sets Maildisplay field to given value.

### HasMaildisplay

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasMaildisplay() bool`

HasMaildisplay returns a boolean if a field has been set.

### GetMailformat

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetMailformat() int32`

GetMailformat returns the Mailformat field if non-nil, zero value otherwise.

### GetMailformatOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetMailformatOk() (*int32, bool)`

GetMailformatOk returns a tuple with the Mailformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMailformat

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetMailformat(v int32)`

SetMailformat sets Mailformat field to given value.

### HasMailformat

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasMailformat() bool`

HasMailformat returns a boolean if a field has been set.

### GetMaincolor

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetMaincolor() string`

GetMaincolor returns the Maincolor field if non-nil, zero value otherwise.

### GetMaincolorOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetMaincolorOk() (*string, bool)`

GetMaincolorOk returns a tuple with the Maincolor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaincolor

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetMaincolor(v string)`

SetMaincolor sets Maincolor field to given value.

### HasMaincolor

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasMaincolor() bool`

HasMaincolor returns a boolean if a field has been set.

### GetMaxusers

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetMaxusers() int32`

GetMaxusers returns the Maxusers field if non-nil, zero value otherwise.

### GetMaxusersOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetMaxusersOk() (*int32, bool)`

GetMaxusersOk returns a tuple with the Maxusers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxusers

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetMaxusers(v int32)`

SetMaxusers sets Maxusers field to given value.

### HasMaxusers

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasMaxusers() bool`

HasMaxusers returns a boolean if a field has been set.

### GetName

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetParentid

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetParentid() int32`

GetParentid returns the Parentid field if non-nil, zero value otherwise.

### GetParentidOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetParentidOk() (*int32, bool)`

GetParentidOk returns a tuple with the Parentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentid

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetParentid(v int32)`

SetParentid sets Parentid field to given value.

### HasParentid

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasParentid() bool`

HasParentid returns a boolean if a field has been set.

### GetPostcode

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetPostcode() string`

GetPostcode returns the Postcode field if non-nil, zero value otherwise.

### GetPostcodeOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetPostcodeOk() (*string, bool)`

GetPostcodeOk returns a tuple with the Postcode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPostcode

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetPostcode(v string)`

SetPostcode sets Postcode field to given value.

### HasPostcode

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasPostcode() bool`

HasPostcode returns a boolean if a field has been set.

### GetRegion

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetRegion() string`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetRegionOk() (*string, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetRegion(v string)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasRegion() bool`

HasRegion returns a boolean if a field has been set.

### GetScreenreader

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetScreenreader() int32`

GetScreenreader returns the Screenreader field if non-nil, zero value otherwise.

### GetScreenreaderOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetScreenreaderOk() (*int32, bool)`

GetScreenreaderOk returns a tuple with the Screenreader field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScreenreader

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetScreenreader(v int32)`

SetScreenreader sets Screenreader field to given value.

### HasScreenreader

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasScreenreader() bool`

HasScreenreader returns a boolean if a field has been set.

### GetShortname

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetShortname(v string)`

SetShortname sets Shortname field to given value.

### HasShortname

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasShortname() bool`

HasShortname returns a boolean if a field has been set.

### GetSuspendafter

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetSuspendafter() int32`

GetSuspendafter returns the Suspendafter field if non-nil, zero value otherwise.

### GetSuspendafterOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetSuspendafterOk() (*int32, bool)`

GetSuspendafterOk returns a tuple with the Suspendafter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuspendafter

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetSuspendafter(v int32)`

SetSuspendafter sets Suspendafter field to given value.

### HasSuspendafter

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasSuspendafter() bool`

HasSuspendafter returns a boolean if a field has been set.

### GetSuspended

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetSuspended() int32`

GetSuspended returns the Suspended field if non-nil, zero value otherwise.

### GetSuspendedOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetSuspendedOk() (*int32, bool)`

GetSuspendedOk returns a tuple with the Suspended field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuspended

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetSuspended(v int32)`

SetSuspended sets Suspended field to given value.

### HasSuspended

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasSuspended() bool`

HasSuspended returns a boolean if a field has been set.

### GetTheme

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetTheme() string`

GetTheme returns the Theme field if non-nil, zero value otherwise.

### GetThemeOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetThemeOk() (*string, bool)`

GetThemeOk returns a tuple with the Theme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTheme

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetTheme(v string)`

SetTheme sets Theme field to given value.

### HasTheme

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasTheme() bool`

HasTheme returns a boolean if a field has been set.

### GetTimezone

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetTimezone() string`

GetTimezone returns the Timezone field if non-nil, zero value otherwise.

### GetTimezoneOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetTimezoneOk() (*string, bool)`

GetTimezoneOk returns a tuple with the Timezone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimezone

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetTimezone(v string)`

SetTimezone sets Timezone field to given value.

### HasTimezone

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasTimezone() bool`

HasTimezone returns a boolean if a field has been set.

### GetTrackforums

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetTrackforums() int32`

GetTrackforums returns the Trackforums field if non-nil, zero value otherwise.

### GetTrackforumsOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetTrackforumsOk() (*int32, bool)`

GetTrackforumsOk returns a tuple with the Trackforums field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackforums

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetTrackforums(v int32)`

SetTrackforums sets Trackforums field to given value.

### HasTrackforums

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasTrackforums() bool`

HasTrackforums returns a boolean if a field has been set.

### GetValidto

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetValidto() int32`

GetValidto returns the Validto field if non-nil, zero value otherwise.

### GetValidtoOk

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) GetValidtoOk() (*int32, bool)`

GetValidtoOk returns a tuple with the Validto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidto

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) SetValidto(v int32)`

SetValidto sets Validto field to given value.

### HasValidto

`func (o *BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner) HasValidto() bool`

HasValidto returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


