# CoreTagGetTagindex200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Anchor** | Pointer to **string** | name of anchor | [optional] [default to "null"]
**Component** | **string** | component | 
**Content** | **string** | title | [default to "null"]
**Exclusivetext** | Pointer to **string** | text for exclusive link | [optional] [default to "null"]
**Exclusiveurl** | Pointer to **string** | URL for exclusive link | [optional] [default to "null"]
**Hascontent** | **int32** | whether the content is present | [default to null]
**Itemtype** | **string** | itemtype | [default to "null"]
**Nextpageurl** | Pointer to **string** | URL for the next page | [optional] [default to "null"]
**Prevpageurl** | Pointer to **string** | URL for the next page | [optional] 
**Ta** | **int32** | tag area id | 
**Tagid** | **int32** | tag id | [default to null]
**Title** | **string** | title | 

## Methods

### NewCoreTagGetTagindex200Response

`func NewCoreTagGetTagindex200Response(component string, content string, hascontent int32, itemtype string, ta int32, tagid int32, title string, ) *CoreTagGetTagindex200Response`

NewCoreTagGetTagindex200Response instantiates a new CoreTagGetTagindex200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreTagGetTagindex200ResponseWithDefaults

`func NewCoreTagGetTagindex200ResponseWithDefaults() *CoreTagGetTagindex200Response`

NewCoreTagGetTagindex200ResponseWithDefaults instantiates a new CoreTagGetTagindex200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAnchor

`func (o *CoreTagGetTagindex200Response) GetAnchor() string`

GetAnchor returns the Anchor field if non-nil, zero value otherwise.

### GetAnchorOk

`func (o *CoreTagGetTagindex200Response) GetAnchorOk() (*string, bool)`

GetAnchorOk returns a tuple with the Anchor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnchor

`func (o *CoreTagGetTagindex200Response) SetAnchor(v string)`

SetAnchor sets Anchor field to given value.

### HasAnchor

`func (o *CoreTagGetTagindex200Response) HasAnchor() bool`

HasAnchor returns a boolean if a field has been set.

### GetComponent

`func (o *CoreTagGetTagindex200Response) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreTagGetTagindex200Response) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreTagGetTagindex200Response) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetContent

`func (o *CoreTagGetTagindex200Response) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *CoreTagGetTagindex200Response) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *CoreTagGetTagindex200Response) SetContent(v string)`

SetContent sets Content field to given value.


### GetExclusivetext

`func (o *CoreTagGetTagindex200Response) GetExclusivetext() string`

GetExclusivetext returns the Exclusivetext field if non-nil, zero value otherwise.

### GetExclusivetextOk

`func (o *CoreTagGetTagindex200Response) GetExclusivetextOk() (*string, bool)`

GetExclusivetextOk returns a tuple with the Exclusivetext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExclusivetext

`func (o *CoreTagGetTagindex200Response) SetExclusivetext(v string)`

SetExclusivetext sets Exclusivetext field to given value.

### HasExclusivetext

`func (o *CoreTagGetTagindex200Response) HasExclusivetext() bool`

HasExclusivetext returns a boolean if a field has been set.

### GetExclusiveurl

`func (o *CoreTagGetTagindex200Response) GetExclusiveurl() string`

GetExclusiveurl returns the Exclusiveurl field if non-nil, zero value otherwise.

### GetExclusiveurlOk

`func (o *CoreTagGetTagindex200Response) GetExclusiveurlOk() (*string, bool)`

GetExclusiveurlOk returns a tuple with the Exclusiveurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExclusiveurl

`func (o *CoreTagGetTagindex200Response) SetExclusiveurl(v string)`

SetExclusiveurl sets Exclusiveurl field to given value.

### HasExclusiveurl

`func (o *CoreTagGetTagindex200Response) HasExclusiveurl() bool`

HasExclusiveurl returns a boolean if a field has been set.

### GetHascontent

`func (o *CoreTagGetTagindex200Response) GetHascontent() int32`

GetHascontent returns the Hascontent field if non-nil, zero value otherwise.

### GetHascontentOk

`func (o *CoreTagGetTagindex200Response) GetHascontentOk() (*int32, bool)`

GetHascontentOk returns a tuple with the Hascontent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHascontent

`func (o *CoreTagGetTagindex200Response) SetHascontent(v int32)`

SetHascontent sets Hascontent field to given value.


### GetItemtype

`func (o *CoreTagGetTagindex200Response) GetItemtype() string`

GetItemtype returns the Itemtype field if non-nil, zero value otherwise.

### GetItemtypeOk

`func (o *CoreTagGetTagindex200Response) GetItemtypeOk() (*string, bool)`

GetItemtypeOk returns a tuple with the Itemtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemtype

`func (o *CoreTagGetTagindex200Response) SetItemtype(v string)`

SetItemtype sets Itemtype field to given value.


### GetNextpageurl

`func (o *CoreTagGetTagindex200Response) GetNextpageurl() string`

GetNextpageurl returns the Nextpageurl field if non-nil, zero value otherwise.

### GetNextpageurlOk

`func (o *CoreTagGetTagindex200Response) GetNextpageurlOk() (*string, bool)`

GetNextpageurlOk returns a tuple with the Nextpageurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextpageurl

`func (o *CoreTagGetTagindex200Response) SetNextpageurl(v string)`

SetNextpageurl sets Nextpageurl field to given value.

### HasNextpageurl

`func (o *CoreTagGetTagindex200Response) HasNextpageurl() bool`

HasNextpageurl returns a boolean if a field has been set.

### GetPrevpageurl

`func (o *CoreTagGetTagindex200Response) GetPrevpageurl() string`

GetPrevpageurl returns the Prevpageurl field if non-nil, zero value otherwise.

### GetPrevpageurlOk

`func (o *CoreTagGetTagindex200Response) GetPrevpageurlOk() (*string, bool)`

GetPrevpageurlOk returns a tuple with the Prevpageurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevpageurl

`func (o *CoreTagGetTagindex200Response) SetPrevpageurl(v string)`

SetPrevpageurl sets Prevpageurl field to given value.

### HasPrevpageurl

`func (o *CoreTagGetTagindex200Response) HasPrevpageurl() bool`

HasPrevpageurl returns a boolean if a field has been set.

### GetTa

`func (o *CoreTagGetTagindex200Response) GetTa() int32`

GetTa returns the Ta field if non-nil, zero value otherwise.

### GetTaOk

`func (o *CoreTagGetTagindex200Response) GetTaOk() (*int32, bool)`

GetTaOk returns a tuple with the Ta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTa

`func (o *CoreTagGetTagindex200Response) SetTa(v int32)`

SetTa sets Ta field to given value.


### GetTagid

`func (o *CoreTagGetTagindex200Response) GetTagid() int32`

GetTagid returns the Tagid field if non-nil, zero value otherwise.

### GetTagidOk

`func (o *CoreTagGetTagindex200Response) GetTagidOk() (*int32, bool)`

GetTagidOk returns a tuple with the Tagid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTagid

`func (o *CoreTagGetTagindex200Response) SetTagid(v int32)`

SetTagid sets Tagid field to given value.


### GetTitle

`func (o *CoreTagGetTagindex200Response) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *CoreTagGetTagindex200Response) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *CoreTagGetTagindex200Response) SetTitle(v string)`

SetTitle sets Title field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


