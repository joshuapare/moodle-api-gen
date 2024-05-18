# CoreTagGetTags200ResponseTagsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **string** | tag description | [optional] [default to "null"]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Flag** | Pointer to **int32** | flag | [optional] [default to null]
**Id** | Pointer to **int32** | tag id | [optional] 
**Isstandard** | Pointer to **int32** | whether this flag is standard | [optional] [default to null]
**Name** | Pointer to **string** | name | [optional] 
**Official** | Pointer to **int32** | whether this flag is standard (deprecated, use isstandard) | [optional] [default to null]
**Rawname** | Pointer to **string** | tag raw name (may contain capital letters) | [optional] [default to "null"]
**Tagcollid** | Pointer to **int32** | tag collection id | [optional] 
**Viewurl** | Pointer to **string** | URL to view | [optional] [default to "null"]

## Methods

### NewCoreTagGetTags200ResponseTagsInner

`func NewCoreTagGetTags200ResponseTagsInner() *CoreTagGetTags200ResponseTagsInner`

NewCoreTagGetTags200ResponseTagsInner instantiates a new CoreTagGetTags200ResponseTagsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreTagGetTags200ResponseTagsInnerWithDefaults

`func NewCoreTagGetTags200ResponseTagsInnerWithDefaults() *CoreTagGetTags200ResponseTagsInner`

NewCoreTagGetTags200ResponseTagsInnerWithDefaults instantiates a new CoreTagGetTags200ResponseTagsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *CoreTagGetTags200ResponseTagsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreTagGetTags200ResponseTagsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreTagGetTags200ResponseTagsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreTagGetTags200ResponseTagsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreTagGetTags200ResponseTagsInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreTagGetTags200ResponseTagsInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreTagGetTags200ResponseTagsInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreTagGetTags200ResponseTagsInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetFlag

`func (o *CoreTagGetTags200ResponseTagsInner) GetFlag() int32`

GetFlag returns the Flag field if non-nil, zero value otherwise.

### GetFlagOk

`func (o *CoreTagGetTags200ResponseTagsInner) GetFlagOk() (*int32, bool)`

GetFlagOk returns a tuple with the Flag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlag

`func (o *CoreTagGetTags200ResponseTagsInner) SetFlag(v int32)`

SetFlag sets Flag field to given value.

### HasFlag

`func (o *CoreTagGetTags200ResponseTagsInner) HasFlag() bool`

HasFlag returns a boolean if a field has been set.

### GetId

`func (o *CoreTagGetTags200ResponseTagsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreTagGetTags200ResponseTagsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreTagGetTags200ResponseTagsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreTagGetTags200ResponseTagsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIsstandard

`func (o *CoreTagGetTags200ResponseTagsInner) GetIsstandard() int32`

GetIsstandard returns the Isstandard field if non-nil, zero value otherwise.

### GetIsstandardOk

`func (o *CoreTagGetTags200ResponseTagsInner) GetIsstandardOk() (*int32, bool)`

GetIsstandardOk returns a tuple with the Isstandard field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsstandard

`func (o *CoreTagGetTags200ResponseTagsInner) SetIsstandard(v int32)`

SetIsstandard sets Isstandard field to given value.

### HasIsstandard

`func (o *CoreTagGetTags200ResponseTagsInner) HasIsstandard() bool`

HasIsstandard returns a boolean if a field has been set.

### GetName

`func (o *CoreTagGetTags200ResponseTagsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreTagGetTags200ResponseTagsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreTagGetTags200ResponseTagsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreTagGetTags200ResponseTagsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOfficial

`func (o *CoreTagGetTags200ResponseTagsInner) GetOfficial() int32`

GetOfficial returns the Official field if non-nil, zero value otherwise.

### GetOfficialOk

`func (o *CoreTagGetTags200ResponseTagsInner) GetOfficialOk() (*int32, bool)`

GetOfficialOk returns a tuple with the Official field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfficial

`func (o *CoreTagGetTags200ResponseTagsInner) SetOfficial(v int32)`

SetOfficial sets Official field to given value.

### HasOfficial

`func (o *CoreTagGetTags200ResponseTagsInner) HasOfficial() bool`

HasOfficial returns a boolean if a field has been set.

### GetRawname

`func (o *CoreTagGetTags200ResponseTagsInner) GetRawname() string`

GetRawname returns the Rawname field if non-nil, zero value otherwise.

### GetRawnameOk

`func (o *CoreTagGetTags200ResponseTagsInner) GetRawnameOk() (*string, bool)`

GetRawnameOk returns a tuple with the Rawname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRawname

`func (o *CoreTagGetTags200ResponseTagsInner) SetRawname(v string)`

SetRawname sets Rawname field to given value.

### HasRawname

`func (o *CoreTagGetTags200ResponseTagsInner) HasRawname() bool`

HasRawname returns a boolean if a field has been set.

### GetTagcollid

`func (o *CoreTagGetTags200ResponseTagsInner) GetTagcollid() int32`

GetTagcollid returns the Tagcollid field if non-nil, zero value otherwise.

### GetTagcollidOk

`func (o *CoreTagGetTags200ResponseTagsInner) GetTagcollidOk() (*int32, bool)`

GetTagcollidOk returns a tuple with the Tagcollid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTagcollid

`func (o *CoreTagGetTags200ResponseTagsInner) SetTagcollid(v int32)`

SetTagcollid sets Tagcollid field to given value.

### HasTagcollid

`func (o *CoreTagGetTags200ResponseTagsInner) HasTagcollid() bool`

HasTagcollid returns a boolean if a field has been set.

### GetViewurl

`func (o *CoreTagGetTags200ResponseTagsInner) GetViewurl() string`

GetViewurl returns the Viewurl field if non-nil, zero value otherwise.

### GetViewurlOk

`func (o *CoreTagGetTags200ResponseTagsInner) GetViewurlOk() (*string, bool)`

GetViewurlOk returns a tuple with the Viewurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewurl

`func (o *CoreTagGetTags200ResponseTagsInner) SetViewurl(v string)`

SetViewurl sets Viewurl field to given value.

### HasViewurl

`func (o *CoreTagGetTags200ResponseTagsInner) HasViewurl() bool`

HasViewurl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


