# ModScormGetScormScoes200ResponseScoesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Extradata** | Pointer to [**[]ModScormGetScormScoes200ResponseScoesInnerExtradataInner**](ModScormGetScormScoes200ResponseScoesInnerExtradataInner.md) |  | [optional] 
**Id** | Pointer to **int32** | sco id | [optional] 
**Identifier** | Pointer to **string** | identifier | [optional] [default to "null"]
**Launch** | Pointer to **string** | launch file | [optional] [default to "null"]
**Manifest** | Pointer to **string** | manifest id | [optional] [default to "null"]
**Organization** | Pointer to **string** | organization id | [optional] [default to "null"]
**Parent** | Pointer to **string** | parent | [optional] [default to "null"]
**Scorm** | Pointer to **int32** | scorm id | [optional] [default to null]
**Scormtype** | Pointer to **string** | scorm type (asset, sco) | [optional] [default to "null"]
**Sortorder** | Pointer to **int32** | sort order | [optional] [default to null]
**Title** | Pointer to **string** | sco title | [optional] [default to "null"]

## Methods

### NewModScormGetScormScoes200ResponseScoesInner

`func NewModScormGetScormScoes200ResponseScoesInner() *ModScormGetScormScoes200ResponseScoesInner`

NewModScormGetScormScoes200ResponseScoesInner instantiates a new ModScormGetScormScoes200ResponseScoesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModScormGetScormScoes200ResponseScoesInnerWithDefaults

`func NewModScormGetScormScoes200ResponseScoesInnerWithDefaults() *ModScormGetScormScoes200ResponseScoesInner`

NewModScormGetScormScoes200ResponseScoesInnerWithDefaults instantiates a new ModScormGetScormScoes200ResponseScoesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExtradata

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetExtradata() []ModScormGetScormScoes200ResponseScoesInnerExtradataInner`

GetExtradata returns the Extradata field if non-nil, zero value otherwise.

### GetExtradataOk

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetExtradataOk() (*[]ModScormGetScormScoes200ResponseScoesInnerExtradataInner, bool)`

GetExtradataOk returns a tuple with the Extradata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExtradata

`func (o *ModScormGetScormScoes200ResponseScoesInner) SetExtradata(v []ModScormGetScormScoes200ResponseScoesInnerExtradataInner)`

SetExtradata sets Extradata field to given value.

### HasExtradata

`func (o *ModScormGetScormScoes200ResponseScoesInner) HasExtradata() bool`

HasExtradata returns a boolean if a field has been set.

### GetId

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModScormGetScormScoes200ResponseScoesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModScormGetScormScoes200ResponseScoesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIdentifier

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetIdentifier() string`

GetIdentifier returns the Identifier field if non-nil, zero value otherwise.

### GetIdentifierOk

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetIdentifierOk() (*string, bool)`

GetIdentifierOk returns a tuple with the Identifier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentifier

`func (o *ModScormGetScormScoes200ResponseScoesInner) SetIdentifier(v string)`

SetIdentifier sets Identifier field to given value.

### HasIdentifier

`func (o *ModScormGetScormScoes200ResponseScoesInner) HasIdentifier() bool`

HasIdentifier returns a boolean if a field has been set.

### GetLaunch

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetLaunch() string`

GetLaunch returns the Launch field if non-nil, zero value otherwise.

### GetLaunchOk

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetLaunchOk() (*string, bool)`

GetLaunchOk returns a tuple with the Launch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLaunch

`func (o *ModScormGetScormScoes200ResponseScoesInner) SetLaunch(v string)`

SetLaunch sets Launch field to given value.

### HasLaunch

`func (o *ModScormGetScormScoes200ResponseScoesInner) HasLaunch() bool`

HasLaunch returns a boolean if a field has been set.

### GetManifest

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetManifest() string`

GetManifest returns the Manifest field if non-nil, zero value otherwise.

### GetManifestOk

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetManifestOk() (*string, bool)`

GetManifestOk returns a tuple with the Manifest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetManifest

`func (o *ModScormGetScormScoes200ResponseScoesInner) SetManifest(v string)`

SetManifest sets Manifest field to given value.

### HasManifest

`func (o *ModScormGetScormScoes200ResponseScoesInner) HasManifest() bool`

HasManifest returns a boolean if a field has been set.

### GetOrganization

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetOrganization() string`

GetOrganization returns the Organization field if non-nil, zero value otherwise.

### GetOrganizationOk

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetOrganizationOk() (*string, bool)`

GetOrganizationOk returns a tuple with the Organization field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrganization

`func (o *ModScormGetScormScoes200ResponseScoesInner) SetOrganization(v string)`

SetOrganization sets Organization field to given value.

### HasOrganization

`func (o *ModScormGetScormScoes200ResponseScoesInner) HasOrganization() bool`

HasOrganization returns a boolean if a field has been set.

### GetParent

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetParent() string`

GetParent returns the Parent field if non-nil, zero value otherwise.

### GetParentOk

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetParentOk() (*string, bool)`

GetParentOk returns a tuple with the Parent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParent

`func (o *ModScormGetScormScoes200ResponseScoesInner) SetParent(v string)`

SetParent sets Parent field to given value.

### HasParent

`func (o *ModScormGetScormScoes200ResponseScoesInner) HasParent() bool`

HasParent returns a boolean if a field has been set.

### GetScorm

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetScorm() int32`

GetScorm returns the Scorm field if non-nil, zero value otherwise.

### GetScormOk

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetScormOk() (*int32, bool)`

GetScormOk returns a tuple with the Scorm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScorm

`func (o *ModScormGetScormScoes200ResponseScoesInner) SetScorm(v int32)`

SetScorm sets Scorm field to given value.

### HasScorm

`func (o *ModScormGetScormScoes200ResponseScoesInner) HasScorm() bool`

HasScorm returns a boolean if a field has been set.

### GetScormtype

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetScormtype() string`

GetScormtype returns the Scormtype field if non-nil, zero value otherwise.

### GetScormtypeOk

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetScormtypeOk() (*string, bool)`

GetScormtypeOk returns a tuple with the Scormtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScormtype

`func (o *ModScormGetScormScoes200ResponseScoesInner) SetScormtype(v string)`

SetScormtype sets Scormtype field to given value.

### HasScormtype

`func (o *ModScormGetScormScoes200ResponseScoesInner) HasScormtype() bool`

HasScormtype returns a boolean if a field has been set.

### GetSortorder

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetSortorder() int32`

GetSortorder returns the Sortorder field if non-nil, zero value otherwise.

### GetSortorderOk

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetSortorderOk() (*int32, bool)`

GetSortorderOk returns a tuple with the Sortorder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortorder

`func (o *ModScormGetScormScoes200ResponseScoesInner) SetSortorder(v int32)`

SetSortorder sets Sortorder field to given value.

### HasSortorder

`func (o *ModScormGetScormScoes200ResponseScoesInner) HasSortorder() bool`

HasSortorder returns a boolean if a field has been set.

### GetTitle

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ModScormGetScormScoes200ResponseScoesInner) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ModScormGetScormScoes200ResponseScoesInner) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *ModScormGetScormScoes200ResponseScoesInner) HasTitle() bool`

HasTitle returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


