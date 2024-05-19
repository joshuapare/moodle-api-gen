# CoreTagGetTagCloudRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ctx** | Pointer to **int32** | Only retrieve tag instances in this context. | [optional] [default to 0]
**Fromctx** | Pointer to **int32** | Context id where this tag cloud is displayed. | [optional] [default to 0]
**Isstandard** | Pointer to **bool** | Whether to return only standard tags. | [optional] [default to false]
**Limit** | Pointer to **int32** | Maximum number of tags to retrieve. | [optional] [default to 150]
**Rec** | Pointer to **int32** | Retrieve tag instances in the $ctx context and it&#39;s children. | [optional] [default to 1]
**Search** | Pointer to **string** | Search string. | [optional] [default to ""]
**Sort** | Pointer to **string** | Sort order for display                     (id, name, rawname, count, flag, isstandard, tagcollid). | [optional] [default to "name"]
**Tagcollid** | Pointer to **int32** | Tag collection id. | [optional] [default to 0]

## Methods

### NewCoreTagGetTagCloudRequest

`func NewCoreTagGetTagCloudRequest() *CoreTagGetTagCloudRequest`

NewCoreTagGetTagCloudRequest instantiates a new CoreTagGetTagCloudRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreTagGetTagCloudRequestWithDefaults

`func NewCoreTagGetTagCloudRequestWithDefaults() *CoreTagGetTagCloudRequest`

NewCoreTagGetTagCloudRequestWithDefaults instantiates a new CoreTagGetTagCloudRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCtx

`func (o *CoreTagGetTagCloudRequest) GetCtx() int32`

GetCtx returns the Ctx field if non-nil, zero value otherwise.

### GetCtxOk

`func (o *CoreTagGetTagCloudRequest) GetCtxOk() (*int32, bool)`

GetCtxOk returns a tuple with the Ctx field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCtx

`func (o *CoreTagGetTagCloudRequest) SetCtx(v int32)`

SetCtx sets Ctx field to given value.

### HasCtx

`func (o *CoreTagGetTagCloudRequest) HasCtx() bool`

HasCtx returns a boolean if a field has been set.

### GetFromctx

`func (o *CoreTagGetTagCloudRequest) GetFromctx() int32`

GetFromctx returns the Fromctx field if non-nil, zero value otherwise.

### GetFromctxOk

`func (o *CoreTagGetTagCloudRequest) GetFromctxOk() (*int32, bool)`

GetFromctxOk returns a tuple with the Fromctx field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFromctx

`func (o *CoreTagGetTagCloudRequest) SetFromctx(v int32)`

SetFromctx sets Fromctx field to given value.

### HasFromctx

`func (o *CoreTagGetTagCloudRequest) HasFromctx() bool`

HasFromctx returns a boolean if a field has been set.

### GetIsstandard

`func (o *CoreTagGetTagCloudRequest) GetIsstandard() bool`

GetIsstandard returns the Isstandard field if non-nil, zero value otherwise.

### GetIsstandardOk

`func (o *CoreTagGetTagCloudRequest) GetIsstandardOk() (*bool, bool)`

GetIsstandardOk returns a tuple with the Isstandard field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsstandard

`func (o *CoreTagGetTagCloudRequest) SetIsstandard(v bool)`

SetIsstandard sets Isstandard field to given value.

### HasIsstandard

`func (o *CoreTagGetTagCloudRequest) HasIsstandard() bool`

HasIsstandard returns a boolean if a field has been set.

### GetLimit

`func (o *CoreTagGetTagCloudRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *CoreTagGetTagCloudRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *CoreTagGetTagCloudRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *CoreTagGetTagCloudRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetRec

`func (o *CoreTagGetTagCloudRequest) GetRec() int32`

GetRec returns the Rec field if non-nil, zero value otherwise.

### GetRecOk

`func (o *CoreTagGetTagCloudRequest) GetRecOk() (*int32, bool)`

GetRecOk returns a tuple with the Rec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRec

`func (o *CoreTagGetTagCloudRequest) SetRec(v int32)`

SetRec sets Rec field to given value.

### HasRec

`func (o *CoreTagGetTagCloudRequest) HasRec() bool`

HasRec returns a boolean if a field has been set.

### GetSearch

`func (o *CoreTagGetTagCloudRequest) GetSearch() string`

GetSearch returns the Search field if non-nil, zero value otherwise.

### GetSearchOk

`func (o *CoreTagGetTagCloudRequest) GetSearchOk() (*string, bool)`

GetSearchOk returns a tuple with the Search field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearch

`func (o *CoreTagGetTagCloudRequest) SetSearch(v string)`

SetSearch sets Search field to given value.

### HasSearch

`func (o *CoreTagGetTagCloudRequest) HasSearch() bool`

HasSearch returns a boolean if a field has been set.

### GetSort

`func (o *CoreTagGetTagCloudRequest) GetSort() string`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *CoreTagGetTagCloudRequest) GetSortOk() (*string, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *CoreTagGetTagCloudRequest) SetSort(v string)`

SetSort sets Sort field to given value.

### HasSort

`func (o *CoreTagGetTagCloudRequest) HasSort() bool`

HasSort returns a boolean if a field has been set.

### GetTagcollid

`func (o *CoreTagGetTagCloudRequest) GetTagcollid() int32`

GetTagcollid returns the Tagcollid field if non-nil, zero value otherwise.

### GetTagcollidOk

`func (o *CoreTagGetTagCloudRequest) GetTagcollidOk() (*int32, bool)`

GetTagcollidOk returns a tuple with the Tagcollid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTagcollid

`func (o *CoreTagGetTagCloudRequest) SetTagcollid(v int32)`

SetTagcollid sets Tagcollid field to given value.

### HasTagcollid

`func (o *CoreTagGetTagCloudRequest) HasTagcollid() bool`

HasTagcollid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


