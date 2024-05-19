# ModWikiNewPageRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | **string** | Page contents. | 
**Contentformat** | Pointer to **string** | Page contents format. If an invalid format is provided, default                     wiki format is used. | [optional] [default to "null"]
**Groupid** | Pointer to **int32** | Subwiki&#39;s group ID. Used if subwiki does not exists. | [optional] [default to null]
**Subwikiid** | Pointer to **int32** | Page&#39;s subwiki ID. | [optional] 
**Title** | **string** | New page title. | [default to "null"]
**Userid** | Pointer to **int32** | Subwiki&#39;s user ID. Used if subwiki does not exists. | [optional] [default to null]
**Wikiid** | Pointer to **int32** | Page&#39;s wiki ID. Used if subwiki does not exists. | [optional] [default to null]

## Methods

### NewModWikiNewPageRequest

`func NewModWikiNewPageRequest(content string, title string, ) *ModWikiNewPageRequest`

NewModWikiNewPageRequest instantiates a new ModWikiNewPageRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWikiNewPageRequestWithDefaults

`func NewModWikiNewPageRequestWithDefaults() *ModWikiNewPageRequest`

NewModWikiNewPageRequestWithDefaults instantiates a new ModWikiNewPageRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContent

`func (o *ModWikiNewPageRequest) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *ModWikiNewPageRequest) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *ModWikiNewPageRequest) SetContent(v string)`

SetContent sets Content field to given value.


### GetContentformat

`func (o *ModWikiNewPageRequest) GetContentformat() string`

GetContentformat returns the Contentformat field if non-nil, zero value otherwise.

### GetContentformatOk

`func (o *ModWikiNewPageRequest) GetContentformatOk() (*string, bool)`

GetContentformatOk returns a tuple with the Contentformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentformat

`func (o *ModWikiNewPageRequest) SetContentformat(v string)`

SetContentformat sets Contentformat field to given value.

### HasContentformat

`func (o *ModWikiNewPageRequest) HasContentformat() bool`

HasContentformat returns a boolean if a field has been set.

### GetGroupid

`func (o *ModWikiNewPageRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModWikiNewPageRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModWikiNewPageRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModWikiNewPageRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetSubwikiid

`func (o *ModWikiNewPageRequest) GetSubwikiid() int32`

GetSubwikiid returns the Subwikiid field if non-nil, zero value otherwise.

### GetSubwikiidOk

`func (o *ModWikiNewPageRequest) GetSubwikiidOk() (*int32, bool)`

GetSubwikiidOk returns a tuple with the Subwikiid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubwikiid

`func (o *ModWikiNewPageRequest) SetSubwikiid(v int32)`

SetSubwikiid sets Subwikiid field to given value.

### HasSubwikiid

`func (o *ModWikiNewPageRequest) HasSubwikiid() bool`

HasSubwikiid returns a boolean if a field has been set.

### GetTitle

`func (o *ModWikiNewPageRequest) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ModWikiNewPageRequest) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ModWikiNewPageRequest) SetTitle(v string)`

SetTitle sets Title field to given value.


### GetUserid

`func (o *ModWikiNewPageRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModWikiNewPageRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModWikiNewPageRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModWikiNewPageRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetWikiid

`func (o *ModWikiNewPageRequest) GetWikiid() int32`

GetWikiid returns the Wikiid field if non-nil, zero value otherwise.

### GetWikiidOk

`func (o *ModWikiNewPageRequest) GetWikiidOk() (*int32, bool)`

GetWikiidOk returns a tuple with the Wikiid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWikiid

`func (o *ModWikiNewPageRequest) SetWikiid(v int32)`

SetWikiid sets Wikiid field to given value.

### HasWikiid

`func (o *ModWikiNewPageRequest) HasWikiid() bool`

HasWikiid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


