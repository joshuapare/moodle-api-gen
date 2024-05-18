# BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | Pointer to **string** | Company location address | [optional] 
**Autosubscribe** | Pointer to **int32** | User default forum auto-subscribe | [optional] [default to null]
**City** | Pointer to **string** | Company location city | [optional] 
**Code** | Pointer to **string** | Compay code | [optional] [default to "null"]
**Companyterminated** | Pointer to **int32** | Company contract is terminated when &lt;&gt; 0 | [optional] [default to null]
**Country** | Pointer to **string** | Company location country | [optional] 
**Custom1** | Pointer to **string** | Company custom 1 | [optional] 
**Custom2** | Pointer to **string** | Company custom 2 | [optional] 
**Custom3** | Pointer to **string** | Company custom 3 | [optional] 
**Customcss** | Pointer to **string** | Company custom css | [optional] [default to "null"]
**Ecommerce** | Pointer to **int32** | Ecommerce is disabled when &#x3D; 0 | [optional] [default to null]
**Headingcolor** | Pointer to **string** | Company heading color | [optional] [default to "null"]
**Hostname** | Pointer to **string** | Company hostname | [optional] [default to "null"]
**Htmleditor** | Pointer to **int32** | User default text editor | [optional] [default to null]
**Id** | Pointer to **int32** | Company id number | [optional] [default to null]
**Lang** | Pointer to **string** | User default language | [optional] [default to "null"]
**Linkcolor** | Pointer to **string** | Company ink color | [optional] [default to "null"]
**Maildigest** | Pointer to **int32** | User default digest type | [optional] [default to null]
**Maildisplay** | Pointer to **int32** | User default email display | [optional] [default to null]
**Mailformat** | Pointer to **int32** | User default email format | [optional] [default to null]
**Maincolor** | Pointer to **string** | Company main color | [optional] [default to "null"]
**Maxusers** | Pointer to **int32** | Company maximum number of users | [optional] [default to null]
**Name** | Pointer to **string** | Company long name | [optional] 
**Parentid** | Pointer to **int32** | ID of parent company | [optional] [default to null]
**Postcode** | Pointer to **string** | Company location postcode | [optional] 
**Region** | Pointer to **string** | Company location region | [optional] 
**Screenreader** | Pointer to **int32** | User default screen reader | [optional] [default to null]
**Shortname** | Pointer to **string** | Compay short name | [optional] 
**Suspendafter** | Pointer to **int32** | Number of seconds after termination date to suspend the company | [optional] [default to null]
**Suspended** | Pointer to **int32** | Company is suspended when &lt;&gt; 0 | [optional] [default to null]
**Theme** | Pointer to **string** | Company theme | [optional] [default to "null"]
**Timezone** | Pointer to **string** | User default timezone | [optional] [default to "null"]
**Trackforums** | Pointer to **int32** | User default forum tracking | [optional] [default to null]
**Validto** | Pointer to **int32** | Contract termination date in unix timestamp | [optional] 

## Methods

### NewBlockIomadCompanyAdminEditCompaniesRequestCompaniesInner

`func NewBlockIomadCompanyAdminEditCompaniesRequestCompaniesInner() *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner`

NewBlockIomadCompanyAdminEditCompaniesRequestCompaniesInner instantiates a new BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBlockIomadCompanyAdminEditCompaniesRequestCompaniesInnerWithDefaults

`func NewBlockIomadCompanyAdminEditCompaniesRequestCompaniesInnerWithDefaults() *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner`

NewBlockIomadCompanyAdminEditCompaniesRequestCompaniesInnerWithDefaults instantiates a new BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddress

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetAddress() string`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetAddressOk() (*string, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetAddress(v string)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetAutosubscribe

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetAutosubscribe() int32`

GetAutosubscribe returns the Autosubscribe field if non-nil, zero value otherwise.

### GetAutosubscribeOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetAutosubscribeOk() (*int32, bool)`

GetAutosubscribeOk returns a tuple with the Autosubscribe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutosubscribe

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetAutosubscribe(v int32)`

SetAutosubscribe sets Autosubscribe field to given value.

### HasAutosubscribe

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasAutosubscribe() bool`

HasAutosubscribe returns a boolean if a field has been set.

### GetCity

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetCode

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetCode(v string)`

SetCode sets Code field to given value.

### HasCode

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetCompanyterminated

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetCompanyterminated() int32`

GetCompanyterminated returns the Companyterminated field if non-nil, zero value otherwise.

### GetCompanyterminatedOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetCompanyterminatedOk() (*int32, bool)`

GetCompanyterminatedOk returns a tuple with the Companyterminated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompanyterminated

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetCompanyterminated(v int32)`

SetCompanyterminated sets Companyterminated field to given value.

### HasCompanyterminated

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasCompanyterminated() bool`

HasCompanyterminated returns a boolean if a field has been set.

### GetCountry

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCustom1

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetCustom1() string`

GetCustom1 returns the Custom1 field if non-nil, zero value otherwise.

### GetCustom1Ok

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetCustom1Ok() (*string, bool)`

GetCustom1Ok returns a tuple with the Custom1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom1

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetCustom1(v string)`

SetCustom1 sets Custom1 field to given value.

### HasCustom1

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasCustom1() bool`

HasCustom1 returns a boolean if a field has been set.

### GetCustom2

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetCustom2() string`

GetCustom2 returns the Custom2 field if non-nil, zero value otherwise.

### GetCustom2Ok

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetCustom2Ok() (*string, bool)`

GetCustom2Ok returns a tuple with the Custom2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom2

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetCustom2(v string)`

SetCustom2 sets Custom2 field to given value.

### HasCustom2

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasCustom2() bool`

HasCustom2 returns a boolean if a field has been set.

### GetCustom3

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetCustom3() string`

GetCustom3 returns the Custom3 field if non-nil, zero value otherwise.

### GetCustom3Ok

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetCustom3Ok() (*string, bool)`

GetCustom3Ok returns a tuple with the Custom3 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom3

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetCustom3(v string)`

SetCustom3 sets Custom3 field to given value.

### HasCustom3

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasCustom3() bool`

HasCustom3 returns a boolean if a field has been set.

### GetCustomcss

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetCustomcss() string`

GetCustomcss returns the Customcss field if non-nil, zero value otherwise.

### GetCustomcssOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetCustomcssOk() (*string, bool)`

GetCustomcssOk returns a tuple with the Customcss field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomcss

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetCustomcss(v string)`

SetCustomcss sets Customcss field to given value.

### HasCustomcss

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasCustomcss() bool`

HasCustomcss returns a boolean if a field has been set.

### GetEcommerce

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetEcommerce() int32`

GetEcommerce returns the Ecommerce field if non-nil, zero value otherwise.

### GetEcommerceOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetEcommerceOk() (*int32, bool)`

GetEcommerceOk returns a tuple with the Ecommerce field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEcommerce

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetEcommerce(v int32)`

SetEcommerce sets Ecommerce field to given value.

### HasEcommerce

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasEcommerce() bool`

HasEcommerce returns a boolean if a field has been set.

### GetHeadingcolor

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetHeadingcolor() string`

GetHeadingcolor returns the Headingcolor field if non-nil, zero value otherwise.

### GetHeadingcolorOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetHeadingcolorOk() (*string, bool)`

GetHeadingcolorOk returns a tuple with the Headingcolor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeadingcolor

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetHeadingcolor(v string)`

SetHeadingcolor sets Headingcolor field to given value.

### HasHeadingcolor

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasHeadingcolor() bool`

HasHeadingcolor returns a boolean if a field has been set.

### GetHostname

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetHostname() string`

GetHostname returns the Hostname field if non-nil, zero value otherwise.

### GetHostnameOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetHostnameOk() (*string, bool)`

GetHostnameOk returns a tuple with the Hostname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostname

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetHostname(v string)`

SetHostname sets Hostname field to given value.

### HasHostname

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasHostname() bool`

HasHostname returns a boolean if a field has been set.

### GetHtmleditor

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetHtmleditor() int32`

GetHtmleditor returns the Htmleditor field if non-nil, zero value otherwise.

### GetHtmleditorOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetHtmleditorOk() (*int32, bool)`

GetHtmleditorOk returns a tuple with the Htmleditor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHtmleditor

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetHtmleditor(v int32)`

SetHtmleditor sets Htmleditor field to given value.

### HasHtmleditor

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasHtmleditor() bool`

HasHtmleditor returns a boolean if a field has been set.

### GetId

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLang

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetLinkcolor

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetLinkcolor() string`

GetLinkcolor returns the Linkcolor field if non-nil, zero value otherwise.

### GetLinkcolorOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetLinkcolorOk() (*string, bool)`

GetLinkcolorOk returns a tuple with the Linkcolor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLinkcolor

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetLinkcolor(v string)`

SetLinkcolor sets Linkcolor field to given value.

### HasLinkcolor

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasLinkcolor() bool`

HasLinkcolor returns a boolean if a field has been set.

### GetMaildigest

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetMaildigest() int32`

GetMaildigest returns the Maildigest field if non-nil, zero value otherwise.

### GetMaildigestOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetMaildigestOk() (*int32, bool)`

GetMaildigestOk returns a tuple with the Maildigest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaildigest

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetMaildigest(v int32)`

SetMaildigest sets Maildigest field to given value.

### HasMaildigest

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasMaildigest() bool`

HasMaildigest returns a boolean if a field has been set.

### GetMaildisplay

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetMaildisplay() int32`

GetMaildisplay returns the Maildisplay field if non-nil, zero value otherwise.

### GetMaildisplayOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetMaildisplayOk() (*int32, bool)`

GetMaildisplayOk returns a tuple with the Maildisplay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaildisplay

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetMaildisplay(v int32)`

SetMaildisplay sets Maildisplay field to given value.

### HasMaildisplay

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasMaildisplay() bool`

HasMaildisplay returns a boolean if a field has been set.

### GetMailformat

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetMailformat() int32`

GetMailformat returns the Mailformat field if non-nil, zero value otherwise.

### GetMailformatOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetMailformatOk() (*int32, bool)`

GetMailformatOk returns a tuple with the Mailformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMailformat

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetMailformat(v int32)`

SetMailformat sets Mailformat field to given value.

### HasMailformat

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasMailformat() bool`

HasMailformat returns a boolean if a field has been set.

### GetMaincolor

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetMaincolor() string`

GetMaincolor returns the Maincolor field if non-nil, zero value otherwise.

### GetMaincolorOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetMaincolorOk() (*string, bool)`

GetMaincolorOk returns a tuple with the Maincolor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaincolor

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetMaincolor(v string)`

SetMaincolor sets Maincolor field to given value.

### HasMaincolor

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasMaincolor() bool`

HasMaincolor returns a boolean if a field has been set.

### GetMaxusers

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetMaxusers() int32`

GetMaxusers returns the Maxusers field if non-nil, zero value otherwise.

### GetMaxusersOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetMaxusersOk() (*int32, bool)`

GetMaxusersOk returns a tuple with the Maxusers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxusers

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetMaxusers(v int32)`

SetMaxusers sets Maxusers field to given value.

### HasMaxusers

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasMaxusers() bool`

HasMaxusers returns a boolean if a field has been set.

### GetName

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetParentid

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetParentid() int32`

GetParentid returns the Parentid field if non-nil, zero value otherwise.

### GetParentidOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetParentidOk() (*int32, bool)`

GetParentidOk returns a tuple with the Parentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentid

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetParentid(v int32)`

SetParentid sets Parentid field to given value.

### HasParentid

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasParentid() bool`

HasParentid returns a boolean if a field has been set.

### GetPostcode

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetPostcode() string`

GetPostcode returns the Postcode field if non-nil, zero value otherwise.

### GetPostcodeOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetPostcodeOk() (*string, bool)`

GetPostcodeOk returns a tuple with the Postcode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPostcode

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetPostcode(v string)`

SetPostcode sets Postcode field to given value.

### HasPostcode

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasPostcode() bool`

HasPostcode returns a boolean if a field has been set.

### GetRegion

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetRegion() string`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetRegionOk() (*string, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetRegion(v string)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasRegion() bool`

HasRegion returns a boolean if a field has been set.

### GetScreenreader

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetScreenreader() int32`

GetScreenreader returns the Screenreader field if non-nil, zero value otherwise.

### GetScreenreaderOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetScreenreaderOk() (*int32, bool)`

GetScreenreaderOk returns a tuple with the Screenreader field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScreenreader

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetScreenreader(v int32)`

SetScreenreader sets Screenreader field to given value.

### HasScreenreader

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasScreenreader() bool`

HasScreenreader returns a boolean if a field has been set.

### GetShortname

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetShortname(v string)`

SetShortname sets Shortname field to given value.

### HasShortname

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasShortname() bool`

HasShortname returns a boolean if a field has been set.

### GetSuspendafter

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetSuspendafter() int32`

GetSuspendafter returns the Suspendafter field if non-nil, zero value otherwise.

### GetSuspendafterOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetSuspendafterOk() (*int32, bool)`

GetSuspendafterOk returns a tuple with the Suspendafter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuspendafter

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetSuspendafter(v int32)`

SetSuspendafter sets Suspendafter field to given value.

### HasSuspendafter

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasSuspendafter() bool`

HasSuspendafter returns a boolean if a field has been set.

### GetSuspended

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetSuspended() int32`

GetSuspended returns the Suspended field if non-nil, zero value otherwise.

### GetSuspendedOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetSuspendedOk() (*int32, bool)`

GetSuspendedOk returns a tuple with the Suspended field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuspended

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetSuspended(v int32)`

SetSuspended sets Suspended field to given value.

### HasSuspended

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasSuspended() bool`

HasSuspended returns a boolean if a field has been set.

### GetTheme

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetTheme() string`

GetTheme returns the Theme field if non-nil, zero value otherwise.

### GetThemeOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetThemeOk() (*string, bool)`

GetThemeOk returns a tuple with the Theme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTheme

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetTheme(v string)`

SetTheme sets Theme field to given value.

### HasTheme

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasTheme() bool`

HasTheme returns a boolean if a field has been set.

### GetTimezone

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetTimezone() string`

GetTimezone returns the Timezone field if non-nil, zero value otherwise.

### GetTimezoneOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetTimezoneOk() (*string, bool)`

GetTimezoneOk returns a tuple with the Timezone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimezone

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetTimezone(v string)`

SetTimezone sets Timezone field to given value.

### HasTimezone

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasTimezone() bool`

HasTimezone returns a boolean if a field has been set.

### GetTrackforums

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetTrackforums() int32`

GetTrackforums returns the Trackforums field if non-nil, zero value otherwise.

### GetTrackforumsOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetTrackforumsOk() (*int32, bool)`

GetTrackforumsOk returns a tuple with the Trackforums field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackforums

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetTrackforums(v int32)`

SetTrackforums sets Trackforums field to given value.

### HasTrackforums

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasTrackforums() bool`

HasTrackforums returns a boolean if a field has been set.

### GetValidto

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetValidto() int32`

GetValidto returns the Validto field if non-nil, zero value otherwise.

### GetValidtoOk

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) GetValidtoOk() (*int32, bool)`

GetValidtoOk returns a tuple with the Validto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidto

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) SetValidto(v int32)`

SetValidto sets Validto field to given value.

### HasValidto

`func (o *BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner) HasValidto() bool`

HasValidto returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


