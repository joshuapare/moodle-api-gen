# ModWikiGetSubwikiPagesRequestOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Includecontent** | Pointer to **int32** | Include each page contents or just the contents size. | [optional] [default to 1]
**Sortby** | Pointer to **string** | Field to sort by (id, title, ...). | [optional] [default to "title"]
**Sortdirection** | Pointer to **string** | Sort direction: ASC or DESC. | [optional] [default to "ASC"]

## Methods

### NewModWikiGetSubwikiPagesRequestOptions

`func NewModWikiGetSubwikiPagesRequestOptions() *ModWikiGetSubwikiPagesRequestOptions`

NewModWikiGetSubwikiPagesRequestOptions instantiates a new ModWikiGetSubwikiPagesRequestOptions object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWikiGetSubwikiPagesRequestOptionsWithDefaults

`func NewModWikiGetSubwikiPagesRequestOptionsWithDefaults() *ModWikiGetSubwikiPagesRequestOptions`

NewModWikiGetSubwikiPagesRequestOptionsWithDefaults instantiates a new ModWikiGetSubwikiPagesRequestOptions object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIncludecontent

`func (o *ModWikiGetSubwikiPagesRequestOptions) GetIncludecontent() int32`

GetIncludecontent returns the Includecontent field if non-nil, zero value otherwise.

### GetIncludecontentOk

`func (o *ModWikiGetSubwikiPagesRequestOptions) GetIncludecontentOk() (*int32, bool)`

GetIncludecontentOk returns a tuple with the Includecontent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludecontent

`func (o *ModWikiGetSubwikiPagesRequestOptions) SetIncludecontent(v int32)`

SetIncludecontent sets Includecontent field to given value.

### HasIncludecontent

`func (o *ModWikiGetSubwikiPagesRequestOptions) HasIncludecontent() bool`

HasIncludecontent returns a boolean if a field has been set.

### GetSortby

`func (o *ModWikiGetSubwikiPagesRequestOptions) GetSortby() string`

GetSortby returns the Sortby field if non-nil, zero value otherwise.

### GetSortbyOk

`func (o *ModWikiGetSubwikiPagesRequestOptions) GetSortbyOk() (*string, bool)`

GetSortbyOk returns a tuple with the Sortby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortby

`func (o *ModWikiGetSubwikiPagesRequestOptions) SetSortby(v string)`

SetSortby sets Sortby field to given value.

### HasSortby

`func (o *ModWikiGetSubwikiPagesRequestOptions) HasSortby() bool`

HasSortby returns a boolean if a field has been set.

### GetSortdirection

`func (o *ModWikiGetSubwikiPagesRequestOptions) GetSortdirection() string`

GetSortdirection returns the Sortdirection field if non-nil, zero value otherwise.

### GetSortdirectionOk

`func (o *ModWikiGetSubwikiPagesRequestOptions) GetSortdirectionOk() (*string, bool)`

GetSortdirectionOk returns a tuple with the Sortdirection field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortdirection

`func (o *ModWikiGetSubwikiPagesRequestOptions) SetSortdirection(v string)`

SetSortdirection sets Sortdirection field to given value.

### HasSortdirection

`func (o *ModWikiGetSubwikiPagesRequestOptions) HasSortdirection() bool`

HasSortdirection returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


