# AuthEmailGetSignupSettings200ResponseProfilefieldsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryid** | Pointer to **int32** | Profield field category id | [optional] [default to null]
**Categoryname** | Pointer to **string** | Profield field category name | [optional] [default to "null"]
**Datatype** | Pointer to **string** | Profield field datatype | [optional] [default to "null"]
**Defaultdata** | Pointer to **string** | Profield field default data | [optional] [default to "null"]
**Defaultdataformat** | Pointer to **int32** | defaultdata format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Description** | Pointer to **string** | Profield field description | [optional] [default to "null"]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Forceunique** | Pointer to **int32** | Profield field unique | [optional] [default to null]
**Id** | Pointer to **int32** | Profile field id | [optional] [default to null]
**Locked** | Pointer to **int32** | Profield field locked | [optional] [default to null]
**Name** | Pointer to **string** | Profield field name | [optional] [default to "null"]
**Param1** | Pointer to **string** | Profield field settings | [optional] [default to "null"]
**Param2** | Pointer to **string** | Profield field settings | [optional] 
**Param3** | Pointer to **string** | Profield field settings | [optional] 
**Param4** | Pointer to **string** | Profield field settings | [optional] 
**Param5** | Pointer to **string** | Profield field settings | [optional] 
**Required** | Pointer to **int32** | Profield field required | [optional] [default to null]
**Shortname** | Pointer to **string** | Profile field shortname | [optional] [default to "null"]
**Signup** | Pointer to **int32** | Profield field in signup form | [optional] [default to null]
**Sortorder** | Pointer to **int32** | Profield field sort order | [optional] [default to null]
**Visible** | Pointer to **int32** | Profield field visible | [optional] [default to null]

## Methods

### NewAuthEmailGetSignupSettings200ResponseProfilefieldsInner

`func NewAuthEmailGetSignupSettings200ResponseProfilefieldsInner() *AuthEmailGetSignupSettings200ResponseProfilefieldsInner`

NewAuthEmailGetSignupSettings200ResponseProfilefieldsInner instantiates a new AuthEmailGetSignupSettings200ResponseProfilefieldsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuthEmailGetSignupSettings200ResponseProfilefieldsInnerWithDefaults

`func NewAuthEmailGetSignupSettings200ResponseProfilefieldsInnerWithDefaults() *AuthEmailGetSignupSettings200ResponseProfilefieldsInner`

NewAuthEmailGetSignupSettings200ResponseProfilefieldsInnerWithDefaults instantiates a new AuthEmailGetSignupSettings200ResponseProfilefieldsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryid

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetCategoryname

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetCategoryname() string`

GetCategoryname returns the Categoryname field if non-nil, zero value otherwise.

### GetCategorynameOk

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetCategorynameOk() (*string, bool)`

GetCategorynameOk returns a tuple with the Categoryname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryname

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetCategoryname(v string)`

SetCategoryname sets Categoryname field to given value.

### HasCategoryname

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasCategoryname() bool`

HasCategoryname returns a boolean if a field has been set.

### GetDatatype

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetDatatype() string`

GetDatatype returns the Datatype field if non-nil, zero value otherwise.

### GetDatatypeOk

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetDatatypeOk() (*string, bool)`

GetDatatypeOk returns a tuple with the Datatype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatatype

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetDatatype(v string)`

SetDatatype sets Datatype field to given value.

### HasDatatype

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasDatatype() bool`

HasDatatype returns a boolean if a field has been set.

### GetDefaultdata

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetDefaultdata() string`

GetDefaultdata returns the Defaultdata field if non-nil, zero value otherwise.

### GetDefaultdataOk

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetDefaultdataOk() (*string, bool)`

GetDefaultdataOk returns a tuple with the Defaultdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultdata

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetDefaultdata(v string)`

SetDefaultdata sets Defaultdata field to given value.

### HasDefaultdata

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasDefaultdata() bool`

HasDefaultdata returns a boolean if a field has been set.

### GetDefaultdataformat

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetDefaultdataformat() int32`

GetDefaultdataformat returns the Defaultdataformat field if non-nil, zero value otherwise.

### GetDefaultdataformatOk

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetDefaultdataformatOk() (*int32, bool)`

GetDefaultdataformatOk returns a tuple with the Defaultdataformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultdataformat

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetDefaultdataformat(v int32)`

SetDefaultdataformat sets Defaultdataformat field to given value.

### HasDefaultdataformat

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasDefaultdataformat() bool`

HasDefaultdataformat returns a boolean if a field has been set.

### GetDescription

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetForceunique

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetForceunique() int32`

GetForceunique returns the Forceunique field if non-nil, zero value otherwise.

### GetForceuniqueOk

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetForceuniqueOk() (*int32, bool)`

GetForceuniqueOk returns a tuple with the Forceunique field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForceunique

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetForceunique(v int32)`

SetForceunique sets Forceunique field to given value.

### HasForceunique

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasForceunique() bool`

HasForceunique returns a boolean if a field has been set.

### GetId

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLocked

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetLocked() int32`

GetLocked returns the Locked field if non-nil, zero value otherwise.

### GetLockedOk

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetLockedOk() (*int32, bool)`

GetLockedOk returns a tuple with the Locked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocked

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetLocked(v int32)`

SetLocked sets Locked field to given value.

### HasLocked

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasLocked() bool`

HasLocked returns a boolean if a field has been set.

### GetName

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetParam1

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetParam1() string`

GetParam1 returns the Param1 field if non-nil, zero value otherwise.

### GetParam1Ok

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetParam1Ok() (*string, bool)`

GetParam1Ok returns a tuple with the Param1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParam1

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetParam1(v string)`

SetParam1 sets Param1 field to given value.

### HasParam1

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasParam1() bool`

HasParam1 returns a boolean if a field has been set.

### GetParam2

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetParam2() string`

GetParam2 returns the Param2 field if non-nil, zero value otherwise.

### GetParam2Ok

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetParam2Ok() (*string, bool)`

GetParam2Ok returns a tuple with the Param2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParam2

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetParam2(v string)`

SetParam2 sets Param2 field to given value.

### HasParam2

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasParam2() bool`

HasParam2 returns a boolean if a field has been set.

### GetParam3

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetParam3() string`

GetParam3 returns the Param3 field if non-nil, zero value otherwise.

### GetParam3Ok

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetParam3Ok() (*string, bool)`

GetParam3Ok returns a tuple with the Param3 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParam3

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetParam3(v string)`

SetParam3 sets Param3 field to given value.

### HasParam3

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasParam3() bool`

HasParam3 returns a boolean if a field has been set.

### GetParam4

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetParam4() string`

GetParam4 returns the Param4 field if non-nil, zero value otherwise.

### GetParam4Ok

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetParam4Ok() (*string, bool)`

GetParam4Ok returns a tuple with the Param4 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParam4

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetParam4(v string)`

SetParam4 sets Param4 field to given value.

### HasParam4

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasParam4() bool`

HasParam4 returns a boolean if a field has been set.

### GetParam5

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetParam5() string`

GetParam5 returns the Param5 field if non-nil, zero value otherwise.

### GetParam5Ok

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetParam5Ok() (*string, bool)`

GetParam5Ok returns a tuple with the Param5 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParam5

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetParam5(v string)`

SetParam5 sets Param5 field to given value.

### HasParam5

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasParam5() bool`

HasParam5 returns a boolean if a field has been set.

### GetRequired

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetRequired() int32`

GetRequired returns the Required field if non-nil, zero value otherwise.

### GetRequiredOk

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetRequiredOk() (*int32, bool)`

GetRequiredOk returns a tuple with the Required field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequired

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetRequired(v int32)`

SetRequired sets Required field to given value.

### HasRequired

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasRequired() bool`

HasRequired returns a boolean if a field has been set.

### GetShortname

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetShortname(v string)`

SetShortname sets Shortname field to given value.

### HasShortname

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasShortname() bool`

HasShortname returns a boolean if a field has been set.

### GetSignup

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetSignup() int32`

GetSignup returns the Signup field if non-nil, zero value otherwise.

### GetSignupOk

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetSignupOk() (*int32, bool)`

GetSignupOk returns a tuple with the Signup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSignup

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetSignup(v int32)`

SetSignup sets Signup field to given value.

### HasSignup

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasSignup() bool`

HasSignup returns a boolean if a field has been set.

### GetSortorder

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetSortorder() int32`

GetSortorder returns the Sortorder field if non-nil, zero value otherwise.

### GetSortorderOk

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetSortorderOk() (*int32, bool)`

GetSortorderOk returns a tuple with the Sortorder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortorder

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetSortorder(v int32)`

SetSortorder sets Sortorder field to given value.

### HasSortorder

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasSortorder() bool`

HasSortorder returns a boolean if a field has been set.

### GetVisible

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *AuthEmailGetSignupSettings200ResponseProfilefieldsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


