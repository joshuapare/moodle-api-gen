# ModWikiGetSubwikiPagesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Groupid** | Pointer to **int32** | Subwiki&#39;s group ID, -1 means current group. It will be ignored if the wiki doesn&#39;t use groups. | [optional] [default to -1]
**Options** | Pointer to [**ModWikiGetSubwikiPagesRequestOptions**](ModWikiGetSubwikiPagesRequestOptions.md) |  | [optional] 
**Userid** | Pointer to **int32** | Subwiki&#39;s user ID, 0 means current user. It will be ignored in collaborative wikis. | [optional] [default to 0]
**Wikiid** | **int32** | Wiki instance ID. | 

## Methods

### NewModWikiGetSubwikiPagesRequest

`func NewModWikiGetSubwikiPagesRequest(wikiid int32, ) *ModWikiGetSubwikiPagesRequest`

NewModWikiGetSubwikiPagesRequest instantiates a new ModWikiGetSubwikiPagesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWikiGetSubwikiPagesRequestWithDefaults

`func NewModWikiGetSubwikiPagesRequestWithDefaults() *ModWikiGetSubwikiPagesRequest`

NewModWikiGetSubwikiPagesRequestWithDefaults instantiates a new ModWikiGetSubwikiPagesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGroupid

`func (o *ModWikiGetSubwikiPagesRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModWikiGetSubwikiPagesRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModWikiGetSubwikiPagesRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModWikiGetSubwikiPagesRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetOptions

`func (o *ModWikiGetSubwikiPagesRequest) GetOptions() ModWikiGetSubwikiPagesRequestOptions`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModWikiGetSubwikiPagesRequest) GetOptionsOk() (*ModWikiGetSubwikiPagesRequestOptions, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModWikiGetSubwikiPagesRequest) SetOptions(v ModWikiGetSubwikiPagesRequestOptions)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModWikiGetSubwikiPagesRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetUserid

`func (o *ModWikiGetSubwikiPagesRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModWikiGetSubwikiPagesRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModWikiGetSubwikiPagesRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModWikiGetSubwikiPagesRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetWikiid

`func (o *ModWikiGetSubwikiPagesRequest) GetWikiid() int32`

GetWikiid returns the Wikiid field if non-nil, zero value otherwise.

### GetWikiidOk

`func (o *ModWikiGetSubwikiPagesRequest) GetWikiidOk() (*int32, bool)`

GetWikiidOk returns a tuple with the Wikiid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWikiid

`func (o *ModWikiGetSubwikiPagesRequest) SetWikiid(v int32)`

SetWikiid sets Wikiid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


