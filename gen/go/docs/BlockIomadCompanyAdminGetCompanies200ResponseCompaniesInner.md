# BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | Pointer to **string** | Company location address | [optional] 
**Autosubscribe** | Pointer to **int32** | User default forum auto-subscribe | [optional] 
**City** | Pointer to **string** | Company location city | [optional] 
**Code** | Pointer to **string** | Compay code | [optional] 
**Companyterminated** | Pointer to **int32** | Company contract is terminated when &lt;&gt; 0 | [optional] [default to 0]
**Country** | Pointer to **string** | Company location country | [optional] 
**Custom1** | Pointer to **string** | Company custom 1 | [optional] 
**Custom2** | Pointer to **string** | Company custom 2 | [optional] 
**Custom3** | Pointer to **string** | Company custom 3 | [optional] 
**Customcss** | Pointer to **string** | Company custom css | [optional] [default to ""]
**Ecommerce** | Pointer to **int32** | Ecommerce is disabled when &#x3D; 0 | [optional] [default to 0]
**Headingcolor** | Pointer to **string** | Company heading color | [optional] [default to ""]
**Hostname** | Pointer to **string** | Company hostname | [optional] [default to ""]
**Htmleditor** | Pointer to **int32** | User default text editor | [optional] 
**Id** | Pointer to **int32** | Companid ID | [optional] [default to null]
**Lang** | Pointer to **string** | User default language | [optional] 
**Linkcolor** | Pointer to **string** | Company ink color | [optional] [default to ""]
**Maildigest** | Pointer to **int32** | User default digest type | [optional] 
**Maildisplay** | Pointer to **int32** | User default email display | [optional] 
**Mailformat** | Pointer to **int32** | User default email format | [optional] 
**Maincolor** | Pointer to **string** | Company main color | [optional] [default to ""]
**Maxusers** | Pointer to **int32** | Company maximum number of users | [optional] [default to 0]
**Name** | Pointer to **string** | Company long name | [optional] 
**Parentid** | Pointer to **int32** | ID of parent company | [optional] [default to 0]
**Region** | Pointer to **string** | Company location region | [optional] 
**Screenreader** | Pointer to **int32** | User default screen reader | [optional] 
**Shortname** | Pointer to **string** | Compay short name | [optional] 
**Suspendafter** | Pointer to **int32** | Number of seconds after termination date to suspend the company | [optional] [default to 0]
**Suspended** | Pointer to **int32** | Company is suspended when &lt;&gt; 0 | [optional] 
**Theme** | Pointer to **string** | Company theme | [optional] [default to ""]
**Timezone** | Pointer to **string** | User default timezone | [optional] 
**Trackforums** | Pointer to **int32** | User default forum tracking | [optional] 
**Validto** | Pointer to **int32** | Contract termination date in unix timestamp | [optional] 

## Methods

### NewBlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner

`func NewBlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner() *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner`

NewBlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner instantiates a new BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBlockIomadCompanyAdminGetCompanies200ResponseCompaniesInnerWithDefaults

`func NewBlockIomadCompanyAdminGetCompanies200ResponseCompaniesInnerWithDefaults() *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner`

NewBlockIomadCompanyAdminGetCompanies200ResponseCompaniesInnerWithDefaults instantiates a new BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddress

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetAddress() string`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetAddressOk() (*string, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetAddress(v string)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetAutosubscribe

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetAutosubscribe() int32`

GetAutosubscribe returns the Autosubscribe field if non-nil, zero value otherwise.

### GetAutosubscribeOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetAutosubscribeOk() (*int32, bool)`

GetAutosubscribeOk returns a tuple with the Autosubscribe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutosubscribe

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetAutosubscribe(v int32)`

SetAutosubscribe sets Autosubscribe field to given value.

### HasAutosubscribe

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasAutosubscribe() bool`

HasAutosubscribe returns a boolean if a field has been set.

### GetCity

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetCode

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetCode(v string)`

SetCode sets Code field to given value.

### HasCode

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetCompanyterminated

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetCompanyterminated() int32`

GetCompanyterminated returns the Companyterminated field if non-nil, zero value otherwise.

### GetCompanyterminatedOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetCompanyterminatedOk() (*int32, bool)`

GetCompanyterminatedOk returns a tuple with the Companyterminated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompanyterminated

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetCompanyterminated(v int32)`

SetCompanyterminated sets Companyterminated field to given value.

### HasCompanyterminated

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasCompanyterminated() bool`

HasCompanyterminated returns a boolean if a field has been set.

### GetCountry

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCustom1

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetCustom1() string`

GetCustom1 returns the Custom1 field if non-nil, zero value otherwise.

### GetCustom1Ok

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetCustom1Ok() (*string, bool)`

GetCustom1Ok returns a tuple with the Custom1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom1

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetCustom1(v string)`

SetCustom1 sets Custom1 field to given value.

### HasCustom1

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasCustom1() bool`

HasCustom1 returns a boolean if a field has been set.

### GetCustom2

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetCustom2() string`

GetCustom2 returns the Custom2 field if non-nil, zero value otherwise.

### GetCustom2Ok

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetCustom2Ok() (*string, bool)`

GetCustom2Ok returns a tuple with the Custom2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom2

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetCustom2(v string)`

SetCustom2 sets Custom2 field to given value.

### HasCustom2

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasCustom2() bool`

HasCustom2 returns a boolean if a field has been set.

### GetCustom3

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetCustom3() string`

GetCustom3 returns the Custom3 field if non-nil, zero value otherwise.

### GetCustom3Ok

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetCustom3Ok() (*string, bool)`

GetCustom3Ok returns a tuple with the Custom3 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom3

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetCustom3(v string)`

SetCustom3 sets Custom3 field to given value.

### HasCustom3

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasCustom3() bool`

HasCustom3 returns a boolean if a field has been set.

### GetCustomcss

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetCustomcss() string`

GetCustomcss returns the Customcss field if non-nil, zero value otherwise.

### GetCustomcssOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetCustomcssOk() (*string, bool)`

GetCustomcssOk returns a tuple with the Customcss field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomcss

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetCustomcss(v string)`

SetCustomcss sets Customcss field to given value.

### HasCustomcss

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasCustomcss() bool`

HasCustomcss returns a boolean if a field has been set.

### GetEcommerce

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetEcommerce() int32`

GetEcommerce returns the Ecommerce field if non-nil, zero value otherwise.

### GetEcommerceOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetEcommerceOk() (*int32, bool)`

GetEcommerceOk returns a tuple with the Ecommerce field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEcommerce

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetEcommerce(v int32)`

SetEcommerce sets Ecommerce field to given value.

### HasEcommerce

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasEcommerce() bool`

HasEcommerce returns a boolean if a field has been set.

### GetHeadingcolor

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetHeadingcolor() string`

GetHeadingcolor returns the Headingcolor field if non-nil, zero value otherwise.

### GetHeadingcolorOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetHeadingcolorOk() (*string, bool)`

GetHeadingcolorOk returns a tuple with the Headingcolor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeadingcolor

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetHeadingcolor(v string)`

SetHeadingcolor sets Headingcolor field to given value.

### HasHeadingcolor

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasHeadingcolor() bool`

HasHeadingcolor returns a boolean if a field has been set.

### GetHostname

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetHostname() string`

GetHostname returns the Hostname field if non-nil, zero value otherwise.

### GetHostnameOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetHostnameOk() (*string, bool)`

GetHostnameOk returns a tuple with the Hostname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostname

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetHostname(v string)`

SetHostname sets Hostname field to given value.

### HasHostname

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasHostname() bool`

HasHostname returns a boolean if a field has been set.

### GetHtmleditor

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetHtmleditor() int32`

GetHtmleditor returns the Htmleditor field if non-nil, zero value otherwise.

### GetHtmleditorOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetHtmleditorOk() (*int32, bool)`

GetHtmleditorOk returns a tuple with the Htmleditor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHtmleditor

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetHtmleditor(v int32)`

SetHtmleditor sets Htmleditor field to given value.

### HasHtmleditor

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasHtmleditor() bool`

HasHtmleditor returns a boolean if a field has been set.

### GetId

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLang

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetLinkcolor

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetLinkcolor() string`

GetLinkcolor returns the Linkcolor field if non-nil, zero value otherwise.

### GetLinkcolorOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetLinkcolorOk() (*string, bool)`

GetLinkcolorOk returns a tuple with the Linkcolor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLinkcolor

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetLinkcolor(v string)`

SetLinkcolor sets Linkcolor field to given value.

### HasLinkcolor

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasLinkcolor() bool`

HasLinkcolor returns a boolean if a field has been set.

### GetMaildigest

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetMaildigest() int32`

GetMaildigest returns the Maildigest field if non-nil, zero value otherwise.

### GetMaildigestOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetMaildigestOk() (*int32, bool)`

GetMaildigestOk returns a tuple with the Maildigest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaildigest

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetMaildigest(v int32)`

SetMaildigest sets Maildigest field to given value.

### HasMaildigest

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasMaildigest() bool`

HasMaildigest returns a boolean if a field has been set.

### GetMaildisplay

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetMaildisplay() int32`

GetMaildisplay returns the Maildisplay field if non-nil, zero value otherwise.

### GetMaildisplayOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetMaildisplayOk() (*int32, bool)`

GetMaildisplayOk returns a tuple with the Maildisplay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaildisplay

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetMaildisplay(v int32)`

SetMaildisplay sets Maildisplay field to given value.

### HasMaildisplay

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasMaildisplay() bool`

HasMaildisplay returns a boolean if a field has been set.

### GetMailformat

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetMailformat() int32`

GetMailformat returns the Mailformat field if non-nil, zero value otherwise.

### GetMailformatOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetMailformatOk() (*int32, bool)`

GetMailformatOk returns a tuple with the Mailformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMailformat

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetMailformat(v int32)`

SetMailformat sets Mailformat field to given value.

### HasMailformat

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasMailformat() bool`

HasMailformat returns a boolean if a field has been set.

### GetMaincolor

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetMaincolor() string`

GetMaincolor returns the Maincolor field if non-nil, zero value otherwise.

### GetMaincolorOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetMaincolorOk() (*string, bool)`

GetMaincolorOk returns a tuple with the Maincolor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaincolor

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetMaincolor(v string)`

SetMaincolor sets Maincolor field to given value.

### HasMaincolor

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasMaincolor() bool`

HasMaincolor returns a boolean if a field has been set.

### GetMaxusers

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetMaxusers() int32`

GetMaxusers returns the Maxusers field if non-nil, zero value otherwise.

### GetMaxusersOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetMaxusersOk() (*int32, bool)`

GetMaxusersOk returns a tuple with the Maxusers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxusers

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetMaxusers(v int32)`

SetMaxusers sets Maxusers field to given value.

### HasMaxusers

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasMaxusers() bool`

HasMaxusers returns a boolean if a field has been set.

### GetName

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetParentid

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetParentid() int32`

GetParentid returns the Parentid field if non-nil, zero value otherwise.

### GetParentidOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetParentidOk() (*int32, bool)`

GetParentidOk returns a tuple with the Parentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentid

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetParentid(v int32)`

SetParentid sets Parentid field to given value.

### HasParentid

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasParentid() bool`

HasParentid returns a boolean if a field has been set.

### GetRegion

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetRegion() string`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetRegionOk() (*string, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetRegion(v string)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasRegion() bool`

HasRegion returns a boolean if a field has been set.

### GetScreenreader

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetScreenreader() int32`

GetScreenreader returns the Screenreader field if non-nil, zero value otherwise.

### GetScreenreaderOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetScreenreaderOk() (*int32, bool)`

GetScreenreaderOk returns a tuple with the Screenreader field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScreenreader

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetScreenreader(v int32)`

SetScreenreader sets Screenreader field to given value.

### HasScreenreader

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasScreenreader() bool`

HasScreenreader returns a boolean if a field has been set.

### GetShortname

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetShortname(v string)`

SetShortname sets Shortname field to given value.

### HasShortname

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasShortname() bool`

HasShortname returns a boolean if a field has been set.

### GetSuspendafter

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetSuspendafter() int32`

GetSuspendafter returns the Suspendafter field if non-nil, zero value otherwise.

### GetSuspendafterOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetSuspendafterOk() (*int32, bool)`

GetSuspendafterOk returns a tuple with the Suspendafter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuspendafter

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetSuspendafter(v int32)`

SetSuspendafter sets Suspendafter field to given value.

### HasSuspendafter

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasSuspendafter() bool`

HasSuspendafter returns a boolean if a field has been set.

### GetSuspended

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetSuspended() int32`

GetSuspended returns the Suspended field if non-nil, zero value otherwise.

### GetSuspendedOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetSuspendedOk() (*int32, bool)`

GetSuspendedOk returns a tuple with the Suspended field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuspended

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetSuspended(v int32)`

SetSuspended sets Suspended field to given value.

### HasSuspended

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasSuspended() bool`

HasSuspended returns a boolean if a field has been set.

### GetTheme

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetTheme() string`

GetTheme returns the Theme field if non-nil, zero value otherwise.

### GetThemeOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetThemeOk() (*string, bool)`

GetThemeOk returns a tuple with the Theme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTheme

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetTheme(v string)`

SetTheme sets Theme field to given value.

### HasTheme

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasTheme() bool`

HasTheme returns a boolean if a field has been set.

### GetTimezone

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetTimezone() string`

GetTimezone returns the Timezone field if non-nil, zero value otherwise.

### GetTimezoneOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetTimezoneOk() (*string, bool)`

GetTimezoneOk returns a tuple with the Timezone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimezone

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetTimezone(v string)`

SetTimezone sets Timezone field to given value.

### HasTimezone

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasTimezone() bool`

HasTimezone returns a boolean if a field has been set.

### GetTrackforums

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetTrackforums() int32`

GetTrackforums returns the Trackforums field if non-nil, zero value otherwise.

### GetTrackforumsOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetTrackforumsOk() (*int32, bool)`

GetTrackforumsOk returns a tuple with the Trackforums field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackforums

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetTrackforums(v int32)`

SetTrackforums sets Trackforums field to given value.

### HasTrackforums

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasTrackforums() bool`

HasTrackforums returns a boolean if a field has been set.

### GetValidto

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetValidto() int32`

GetValidto returns the Validto field if non-nil, zero value otherwise.

### GetValidtoOk

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) GetValidtoOk() (*int32, bool)`

GetValidtoOk returns a tuple with the Validto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidto

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) SetValidto(v int32)`

SetValidto sets Validto field to given value.

### HasValidto

`func (o *BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) HasValidto() bool`

HasValidto returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


