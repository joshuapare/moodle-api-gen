# CoreTagGetTagindexRequestTagindex

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ctx** | Pointer to **int32** | context id where to search for items | [optional] [default to 0]
**Excl** | Pointer to **bool** | exlusive mode for this tag area | [optional] [default to 0]
**From** | Pointer to **int32** | context id where the link was displayed | [optional] [default to 0]
**Page** | Pointer to **int32** | page number (0-based) | [optional] [default to 0]
**Rec** | Pointer to **int32** | search in the context recursive | [optional] [default to 1]
**Ta** | **int32** | tag area id | [default to null]
**Tag** | **string** | tag name | [default to "null"]
**Tc** | **int32** | tag collection id | [default to null]

## Methods

### NewCoreTagGetTagindexRequestTagindex

`func NewCoreTagGetTagindexRequestTagindex(ta int32, tag string, tc int32, ) *CoreTagGetTagindexRequestTagindex`

NewCoreTagGetTagindexRequestTagindex instantiates a new CoreTagGetTagindexRequestTagindex object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreTagGetTagindexRequestTagindexWithDefaults

`func NewCoreTagGetTagindexRequestTagindexWithDefaults() *CoreTagGetTagindexRequestTagindex`

NewCoreTagGetTagindexRequestTagindexWithDefaults instantiates a new CoreTagGetTagindexRequestTagindex object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCtx

`func (o *CoreTagGetTagindexRequestTagindex) GetCtx() int32`

GetCtx returns the Ctx field if non-nil, zero value otherwise.

### GetCtxOk

`func (o *CoreTagGetTagindexRequestTagindex) GetCtxOk() (*int32, bool)`

GetCtxOk returns a tuple with the Ctx field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCtx

`func (o *CoreTagGetTagindexRequestTagindex) SetCtx(v int32)`

SetCtx sets Ctx field to given value.

### HasCtx

`func (o *CoreTagGetTagindexRequestTagindex) HasCtx() bool`

HasCtx returns a boolean if a field has been set.

### GetExcl

`func (o *CoreTagGetTagindexRequestTagindex) GetExcl() bool`

GetExcl returns the Excl field if non-nil, zero value otherwise.

### GetExclOk

`func (o *CoreTagGetTagindexRequestTagindex) GetExclOk() (*bool, bool)`

GetExclOk returns a tuple with the Excl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExcl

`func (o *CoreTagGetTagindexRequestTagindex) SetExcl(v bool)`

SetExcl sets Excl field to given value.

### HasExcl

`func (o *CoreTagGetTagindexRequestTagindex) HasExcl() bool`

HasExcl returns a boolean if a field has been set.

### GetFrom

`func (o *CoreTagGetTagindexRequestTagindex) GetFrom() int32`

GetFrom returns the From field if non-nil, zero value otherwise.

### GetFromOk

`func (o *CoreTagGetTagindexRequestTagindex) GetFromOk() (*int32, bool)`

GetFromOk returns a tuple with the From field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrom

`func (o *CoreTagGetTagindexRequestTagindex) SetFrom(v int32)`

SetFrom sets From field to given value.

### HasFrom

`func (o *CoreTagGetTagindexRequestTagindex) HasFrom() bool`

HasFrom returns a boolean if a field has been set.

### GetPage

`func (o *CoreTagGetTagindexRequestTagindex) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *CoreTagGetTagindexRequestTagindex) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *CoreTagGetTagindexRequestTagindex) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *CoreTagGetTagindexRequestTagindex) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetRec

`func (o *CoreTagGetTagindexRequestTagindex) GetRec() int32`

GetRec returns the Rec field if non-nil, zero value otherwise.

### GetRecOk

`func (o *CoreTagGetTagindexRequestTagindex) GetRecOk() (*int32, bool)`

GetRecOk returns a tuple with the Rec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRec

`func (o *CoreTagGetTagindexRequestTagindex) SetRec(v int32)`

SetRec sets Rec field to given value.

### HasRec

`func (o *CoreTagGetTagindexRequestTagindex) HasRec() bool`

HasRec returns a boolean if a field has been set.

### GetTa

`func (o *CoreTagGetTagindexRequestTagindex) GetTa() int32`

GetTa returns the Ta field if non-nil, zero value otherwise.

### GetTaOk

`func (o *CoreTagGetTagindexRequestTagindex) GetTaOk() (*int32, bool)`

GetTaOk returns a tuple with the Ta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTa

`func (o *CoreTagGetTagindexRequestTagindex) SetTa(v int32)`

SetTa sets Ta field to given value.


### GetTag

`func (o *CoreTagGetTagindexRequestTagindex) GetTag() string`

GetTag returns the Tag field if non-nil, zero value otherwise.

### GetTagOk

`func (o *CoreTagGetTagindexRequestTagindex) GetTagOk() (*string, bool)`

GetTagOk returns a tuple with the Tag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTag

`func (o *CoreTagGetTagindexRequestTagindex) SetTag(v string)`

SetTag sets Tag field to given value.


### GetTc

`func (o *CoreTagGetTagindexRequestTagindex) GetTc() int32`

GetTc returns the Tc field if non-nil, zero value otherwise.

### GetTcOk

`func (o *CoreTagGetTagindexRequestTagindex) GetTcOk() (*int32, bool)`

GetTcOk returns a tuple with the Tc field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTc

`func (o *CoreTagGetTagindexRequestTagindex) SetTc(v int32)`

SetTc sets Tc field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


