# CoreTagGetTagindexPerAreaRequestTagindex

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ctx** | Pointer to **int32** | context id where to search for items | [optional] [default to 0]
**Excl** | Pointer to **bool** | exlusive mode for this tag area | [optional] [default to 0]
**From** | Pointer to **int32** | context id where the link was displayed | [optional] [default to 0]
**Id** | Pointer to **int32** | tag id | [optional] [default to 0]
**Page** | Pointer to **int32** | page number (0-based) | [optional] [default to 0]
**Rec** | Pointer to **int32** | search in the context recursive | [optional] [default to 1]
**Ta** | Pointer to **int32** | tag area id | [optional] [default to 0]
**Tag** | Pointer to **string** | tag name | [optional] [default to ""]
**Tc** | Pointer to **int32** | tag collection id | [optional] [default to 0]

## Methods

### NewCoreTagGetTagindexPerAreaRequestTagindex

`func NewCoreTagGetTagindexPerAreaRequestTagindex() *CoreTagGetTagindexPerAreaRequestTagindex`

NewCoreTagGetTagindexPerAreaRequestTagindex instantiates a new CoreTagGetTagindexPerAreaRequestTagindex object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreTagGetTagindexPerAreaRequestTagindexWithDefaults

`func NewCoreTagGetTagindexPerAreaRequestTagindexWithDefaults() *CoreTagGetTagindexPerAreaRequestTagindex`

NewCoreTagGetTagindexPerAreaRequestTagindexWithDefaults instantiates a new CoreTagGetTagindexPerAreaRequestTagindex object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCtx

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetCtx() int32`

GetCtx returns the Ctx field if non-nil, zero value otherwise.

### GetCtxOk

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetCtxOk() (*int32, bool)`

GetCtxOk returns a tuple with the Ctx field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCtx

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) SetCtx(v int32)`

SetCtx sets Ctx field to given value.

### HasCtx

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) HasCtx() bool`

HasCtx returns a boolean if a field has been set.

### GetExcl

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetExcl() bool`

GetExcl returns the Excl field if non-nil, zero value otherwise.

### GetExclOk

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetExclOk() (*bool, bool)`

GetExclOk returns a tuple with the Excl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExcl

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) SetExcl(v bool)`

SetExcl sets Excl field to given value.

### HasExcl

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) HasExcl() bool`

HasExcl returns a boolean if a field has been set.

### GetFrom

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetFrom() int32`

GetFrom returns the From field if non-nil, zero value otherwise.

### GetFromOk

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetFromOk() (*int32, bool)`

GetFromOk returns a tuple with the From field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrom

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) SetFrom(v int32)`

SetFrom sets From field to given value.

### HasFrom

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) HasFrom() bool`

HasFrom returns a boolean if a field has been set.

### GetId

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) HasId() bool`

HasId returns a boolean if a field has been set.

### GetPage

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetRec

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetRec() int32`

GetRec returns the Rec field if non-nil, zero value otherwise.

### GetRecOk

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetRecOk() (*int32, bool)`

GetRecOk returns a tuple with the Rec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRec

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) SetRec(v int32)`

SetRec sets Rec field to given value.

### HasRec

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) HasRec() bool`

HasRec returns a boolean if a field has been set.

### GetTa

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetTa() int32`

GetTa returns the Ta field if non-nil, zero value otherwise.

### GetTaOk

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetTaOk() (*int32, bool)`

GetTaOk returns a tuple with the Ta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTa

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) SetTa(v int32)`

SetTa sets Ta field to given value.

### HasTa

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) HasTa() bool`

HasTa returns a boolean if a field has been set.

### GetTag

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetTag() string`

GetTag returns the Tag field if non-nil, zero value otherwise.

### GetTagOk

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetTagOk() (*string, bool)`

GetTagOk returns a tuple with the Tag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTag

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) SetTag(v string)`

SetTag sets Tag field to given value.

### HasTag

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) HasTag() bool`

HasTag returns a boolean if a field has been set.

### GetTc

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetTc() int32`

GetTc returns the Tc field if non-nil, zero value otherwise.

### GetTcOk

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) GetTcOk() (*int32, bool)`

GetTcOk returns a tuple with the Tc field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTc

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) SetTc(v int32)`

SetTc sets Tc field to given value.

### HasTc

`func (o *CoreTagGetTagindexPerAreaRequestTagindex) HasTc() bool`

HasTc returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


