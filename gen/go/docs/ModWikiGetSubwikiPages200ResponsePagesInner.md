# ModWikiGetSubwikiPages200ResponsePagesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cachedcontent** | Pointer to **string** | Page contents. | [optional] 
**Caneditpage** | Pointer to **bool** | True if user can edit the page. | [optional] 
**Contentformat** | Pointer to **int32** | cachedcontent format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Contentsize** | Pointer to **int32** | Size of page contents in bytes (doesn&#39;t include size of attached files). | [optional] [default to null]
**Firstpage** | Pointer to **bool** | True if it&#39;s the first page. | [optional] [default to null]
**Id** | Pointer to **int32** | Page ID. | [optional] 
**Pageviews** | Pointer to **int32** | Number of times the page has been viewed. | [optional] [default to null]
**Readonly** | Pointer to **int32** | 1 if readonly, 0 otherwise. | [optional] [default to null]
**Subwikiid** | Pointer to **int32** | Page&#39;s subwiki ID. | [optional] 
**Tags** | Pointer to [**[]ModDataGetEntries200ResponseEntriesInnerTagsInner**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**Timecreated** | Pointer to **int32** | Time of creation. | [optional] [default to null]
**Timemodified** | Pointer to **int32** | Time of last modification. | [optional] [default to null]
**Timerendered** | Pointer to **int32** | Time of last renderization. | [optional] [default to null]
**Title** | Pointer to **string** | Page title. | [optional] 
**Userid** | Pointer to **int32** | ID of the user that last modified the page. | [optional] [default to null]

## Methods

### NewModWikiGetSubwikiPages200ResponsePagesInner

`func NewModWikiGetSubwikiPages200ResponsePagesInner() *ModWikiGetSubwikiPages200ResponsePagesInner`

NewModWikiGetSubwikiPages200ResponsePagesInner instantiates a new ModWikiGetSubwikiPages200ResponsePagesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWikiGetSubwikiPages200ResponsePagesInnerWithDefaults

`func NewModWikiGetSubwikiPages200ResponsePagesInnerWithDefaults() *ModWikiGetSubwikiPages200ResponsePagesInner`

NewModWikiGetSubwikiPages200ResponsePagesInnerWithDefaults instantiates a new ModWikiGetSubwikiPages200ResponsePagesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCachedcontent

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetCachedcontent() string`

GetCachedcontent returns the Cachedcontent field if non-nil, zero value otherwise.

### GetCachedcontentOk

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetCachedcontentOk() (*string, bool)`

GetCachedcontentOk returns a tuple with the Cachedcontent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCachedcontent

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) SetCachedcontent(v string)`

SetCachedcontent sets Cachedcontent field to given value.

### HasCachedcontent

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) HasCachedcontent() bool`

HasCachedcontent returns a boolean if a field has been set.

### GetCaneditpage

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetCaneditpage() bool`

GetCaneditpage returns the Caneditpage field if non-nil, zero value otherwise.

### GetCaneditpageOk

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetCaneditpageOk() (*bool, bool)`

GetCaneditpageOk returns a tuple with the Caneditpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaneditpage

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) SetCaneditpage(v bool)`

SetCaneditpage sets Caneditpage field to given value.

### HasCaneditpage

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) HasCaneditpage() bool`

HasCaneditpage returns a boolean if a field has been set.

### GetContentformat

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetContentformat() int32`

GetContentformat returns the Contentformat field if non-nil, zero value otherwise.

### GetContentformatOk

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetContentformatOk() (*int32, bool)`

GetContentformatOk returns a tuple with the Contentformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentformat

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) SetContentformat(v int32)`

SetContentformat sets Contentformat field to given value.

### HasContentformat

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) HasContentformat() bool`

HasContentformat returns a boolean if a field has been set.

### GetContentsize

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetContentsize() int32`

GetContentsize returns the Contentsize field if non-nil, zero value otherwise.

### GetContentsizeOk

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetContentsizeOk() (*int32, bool)`

GetContentsizeOk returns a tuple with the Contentsize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentsize

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) SetContentsize(v int32)`

SetContentsize sets Contentsize field to given value.

### HasContentsize

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) HasContentsize() bool`

HasContentsize returns a boolean if a field has been set.

### GetFirstpage

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetFirstpage() bool`

GetFirstpage returns the Firstpage field if non-nil, zero value otherwise.

### GetFirstpageOk

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetFirstpageOk() (*bool, bool)`

GetFirstpageOk returns a tuple with the Firstpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstpage

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) SetFirstpage(v bool)`

SetFirstpage sets Firstpage field to given value.

### HasFirstpage

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) HasFirstpage() bool`

HasFirstpage returns a boolean if a field has been set.

### GetId

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetPageviews

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetPageviews() int32`

GetPageviews returns the Pageviews field if non-nil, zero value otherwise.

### GetPageviewsOk

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetPageviewsOk() (*int32, bool)`

GetPageviewsOk returns a tuple with the Pageviews field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageviews

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) SetPageviews(v int32)`

SetPageviews sets Pageviews field to given value.

### HasPageviews

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) HasPageviews() bool`

HasPageviews returns a boolean if a field has been set.

### GetReadonly

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetReadonly() int32`

GetReadonly returns the Readonly field if non-nil, zero value otherwise.

### GetReadonlyOk

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetReadonlyOk() (*int32, bool)`

GetReadonlyOk returns a tuple with the Readonly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReadonly

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) SetReadonly(v int32)`

SetReadonly sets Readonly field to given value.

### HasReadonly

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) HasReadonly() bool`

HasReadonly returns a boolean if a field has been set.

### GetSubwikiid

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetSubwikiid() int32`

GetSubwikiid returns the Subwikiid field if non-nil, zero value otherwise.

### GetSubwikiidOk

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetSubwikiidOk() (*int32, bool)`

GetSubwikiidOk returns a tuple with the Subwikiid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubwikiid

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) SetSubwikiid(v int32)`

SetSubwikiid sets Subwikiid field to given value.

### HasSubwikiid

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) HasSubwikiid() bool`

HasSubwikiid returns a boolean if a field has been set.

### GetTags

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetTags() []ModDataGetEntries200ResponseEntriesInnerTagsInner`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetTagsOk() (*[]ModDataGetEntries200ResponseEntriesInnerTagsInner, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) SetTags(v []ModDataGetEntries200ResponseEntriesInnerTagsInner)`

SetTags sets Tags field to given value.

### HasTags

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimerendered

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetTimerendered() int32`

GetTimerendered returns the Timerendered field if non-nil, zero value otherwise.

### GetTimerenderedOk

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetTimerenderedOk() (*int32, bool)`

GetTimerenderedOk returns a tuple with the Timerendered field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimerendered

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) SetTimerendered(v int32)`

SetTimerendered sets Timerendered field to given value.

### HasTimerendered

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) HasTimerendered() bool`

HasTimerendered returns a boolean if a field has been set.

### GetTitle

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetUserid

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModWikiGetSubwikiPages200ResponsePagesInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


