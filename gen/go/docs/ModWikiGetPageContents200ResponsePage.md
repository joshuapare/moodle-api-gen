# ModWikiGetPageContents200ResponsePage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cachedcontent** | **string** | Page contents. | 
**Caneditpage** | **bool** | True if user can edit the page. | [default to null]
**Contentformat** | Pointer to **int32** | cachedcontent format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Groupid** | **int32** | Page&#39;s group ID. | [default to null]
**Id** | **int32** | Page ID. | 
**Subwikiid** | **int32** | Page&#39;s subwiki ID. | [default to null]
**Tags** | Pointer to [**[]ModDataGetEntries200ResponseEntriesInnerTagsInner**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**Title** | **string** | Page title. | 
**Userid** | **int32** | Page&#39;s user ID. | [default to null]
**Version** | Pointer to **int32** | Latest version of the page. | [optional] [default to null]
**Wikiid** | **int32** | Page&#39;s wiki ID. | [default to null]

## Methods

### NewModWikiGetPageContents200ResponsePage

`func NewModWikiGetPageContents200ResponsePage(cachedcontent string, caneditpage bool, groupid int32, id int32, subwikiid int32, title string, userid int32, wikiid int32, ) *ModWikiGetPageContents200ResponsePage`

NewModWikiGetPageContents200ResponsePage instantiates a new ModWikiGetPageContents200ResponsePage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWikiGetPageContents200ResponsePageWithDefaults

`func NewModWikiGetPageContents200ResponsePageWithDefaults() *ModWikiGetPageContents200ResponsePage`

NewModWikiGetPageContents200ResponsePageWithDefaults instantiates a new ModWikiGetPageContents200ResponsePage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCachedcontent

`func (o *ModWikiGetPageContents200ResponsePage) GetCachedcontent() string`

GetCachedcontent returns the Cachedcontent field if non-nil, zero value otherwise.

### GetCachedcontentOk

`func (o *ModWikiGetPageContents200ResponsePage) GetCachedcontentOk() (*string, bool)`

GetCachedcontentOk returns a tuple with the Cachedcontent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCachedcontent

`func (o *ModWikiGetPageContents200ResponsePage) SetCachedcontent(v string)`

SetCachedcontent sets Cachedcontent field to given value.


### GetCaneditpage

`func (o *ModWikiGetPageContents200ResponsePage) GetCaneditpage() bool`

GetCaneditpage returns the Caneditpage field if non-nil, zero value otherwise.

### GetCaneditpageOk

`func (o *ModWikiGetPageContents200ResponsePage) GetCaneditpageOk() (*bool, bool)`

GetCaneditpageOk returns a tuple with the Caneditpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaneditpage

`func (o *ModWikiGetPageContents200ResponsePage) SetCaneditpage(v bool)`

SetCaneditpage sets Caneditpage field to given value.


### GetContentformat

`func (o *ModWikiGetPageContents200ResponsePage) GetContentformat() int32`

GetContentformat returns the Contentformat field if non-nil, zero value otherwise.

### GetContentformatOk

`func (o *ModWikiGetPageContents200ResponsePage) GetContentformatOk() (*int32, bool)`

GetContentformatOk returns a tuple with the Contentformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentformat

`func (o *ModWikiGetPageContents200ResponsePage) SetContentformat(v int32)`

SetContentformat sets Contentformat field to given value.

### HasContentformat

`func (o *ModWikiGetPageContents200ResponsePage) HasContentformat() bool`

HasContentformat returns a boolean if a field has been set.

### GetGroupid

`func (o *ModWikiGetPageContents200ResponsePage) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModWikiGetPageContents200ResponsePage) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModWikiGetPageContents200ResponsePage) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.


### GetId

`func (o *ModWikiGetPageContents200ResponsePage) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModWikiGetPageContents200ResponsePage) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModWikiGetPageContents200ResponsePage) SetId(v int32)`

SetId sets Id field to given value.


### GetSubwikiid

`func (o *ModWikiGetPageContents200ResponsePage) GetSubwikiid() int32`

GetSubwikiid returns the Subwikiid field if non-nil, zero value otherwise.

### GetSubwikiidOk

`func (o *ModWikiGetPageContents200ResponsePage) GetSubwikiidOk() (*int32, bool)`

GetSubwikiidOk returns a tuple with the Subwikiid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubwikiid

`func (o *ModWikiGetPageContents200ResponsePage) SetSubwikiid(v int32)`

SetSubwikiid sets Subwikiid field to given value.


### GetTags

`func (o *ModWikiGetPageContents200ResponsePage) GetTags() []ModDataGetEntries200ResponseEntriesInnerTagsInner`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *ModWikiGetPageContents200ResponsePage) GetTagsOk() (*[]ModDataGetEntries200ResponseEntriesInnerTagsInner, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *ModWikiGetPageContents200ResponsePage) SetTags(v []ModDataGetEntries200ResponseEntriesInnerTagsInner)`

SetTags sets Tags field to given value.

### HasTags

`func (o *ModWikiGetPageContents200ResponsePage) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetTitle

`func (o *ModWikiGetPageContents200ResponsePage) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ModWikiGetPageContents200ResponsePage) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ModWikiGetPageContents200ResponsePage) SetTitle(v string)`

SetTitle sets Title field to given value.


### GetUserid

`func (o *ModWikiGetPageContents200ResponsePage) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModWikiGetPageContents200ResponsePage) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModWikiGetPageContents200ResponsePage) SetUserid(v int32)`

SetUserid sets Userid field to given value.


### GetVersion

`func (o *ModWikiGetPageContents200ResponsePage) GetVersion() int32`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *ModWikiGetPageContents200ResponsePage) GetVersionOk() (*int32, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *ModWikiGetPageContents200ResponsePage) SetVersion(v int32)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *ModWikiGetPageContents200ResponsePage) HasVersion() bool`

HasVersion returns a boolean if a field has been set.

### GetWikiid

`func (o *ModWikiGetPageContents200ResponsePage) GetWikiid() int32`

GetWikiid returns the Wikiid field if non-nil, zero value otherwise.

### GetWikiidOk

`func (o *ModWikiGetPageContents200ResponsePage) GetWikiidOk() (*int32, bool)`

GetWikiidOk returns a tuple with the Wikiid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWikiid

`func (o *ModWikiGetPageContents200ResponsePage) SetWikiid(v int32)`

SetWikiid sets Wikiid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


