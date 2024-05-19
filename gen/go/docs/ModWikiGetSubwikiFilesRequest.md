# ModWikiGetSubwikiFilesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Groupid** | Pointer to **int32** | Subwiki&#39;s group ID, -1 means current group. It will be ignored if the wiki doesn&#39;t use groups. | [optional] [default to -1]
**Userid** | Pointer to **int32** | Subwiki&#39;s user ID, 0 means current user. It will be ignored in collaborative wikis. | [optional] [default to 0]
**Wikiid** | **int32** | Wiki instance ID. | [default to null]

## Methods

### NewModWikiGetSubwikiFilesRequest

`func NewModWikiGetSubwikiFilesRequest(wikiid int32, ) *ModWikiGetSubwikiFilesRequest`

NewModWikiGetSubwikiFilesRequest instantiates a new ModWikiGetSubwikiFilesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWikiGetSubwikiFilesRequestWithDefaults

`func NewModWikiGetSubwikiFilesRequestWithDefaults() *ModWikiGetSubwikiFilesRequest`

NewModWikiGetSubwikiFilesRequestWithDefaults instantiates a new ModWikiGetSubwikiFilesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGroupid

`func (o *ModWikiGetSubwikiFilesRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModWikiGetSubwikiFilesRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModWikiGetSubwikiFilesRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModWikiGetSubwikiFilesRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetUserid

`func (o *ModWikiGetSubwikiFilesRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModWikiGetSubwikiFilesRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModWikiGetSubwikiFilesRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModWikiGetSubwikiFilesRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetWikiid

`func (o *ModWikiGetSubwikiFilesRequest) GetWikiid() int32`

GetWikiid returns the Wikiid field if non-nil, zero value otherwise.

### GetWikiidOk

`func (o *ModWikiGetSubwikiFilesRequest) GetWikiidOk() (*int32, bool)`

GetWikiidOk returns a tuple with the Wikiid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWikiid

`func (o *ModWikiGetSubwikiFilesRequest) SetWikiid(v int32)`

SetWikiid sets Wikiid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


