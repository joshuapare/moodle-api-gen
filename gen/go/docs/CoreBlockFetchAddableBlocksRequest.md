# CoreBlockFetchAddableBlocksRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pagecontextid** | **int32** | The context ID of the page. | [default to null]
**Pagehash** | Pointer to **string** | Page hash | [optional] [default to ""]
**Pagelayout** | **string** | The layout of the page. | [default to "null"]
**Pagetype** | **string** | The type of the page. | [default to "null"]
**Subpage** | Pointer to **string** | The subpage identifier | [optional] [default to ""]

## Methods

### NewCoreBlockFetchAddableBlocksRequest

`func NewCoreBlockFetchAddableBlocksRequest(pagecontextid int32, pagelayout string, pagetype string, ) *CoreBlockFetchAddableBlocksRequest`

NewCoreBlockFetchAddableBlocksRequest instantiates a new CoreBlockFetchAddableBlocksRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBlockFetchAddableBlocksRequestWithDefaults

`func NewCoreBlockFetchAddableBlocksRequestWithDefaults() *CoreBlockFetchAddableBlocksRequest`

NewCoreBlockFetchAddableBlocksRequestWithDefaults instantiates a new CoreBlockFetchAddableBlocksRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPagecontextid

`func (o *CoreBlockFetchAddableBlocksRequest) GetPagecontextid() int32`

GetPagecontextid returns the Pagecontextid field if non-nil, zero value otherwise.

### GetPagecontextidOk

`func (o *CoreBlockFetchAddableBlocksRequest) GetPagecontextidOk() (*int32, bool)`

GetPagecontextidOk returns a tuple with the Pagecontextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPagecontextid

`func (o *CoreBlockFetchAddableBlocksRequest) SetPagecontextid(v int32)`

SetPagecontextid sets Pagecontextid field to given value.


### GetPagehash

`func (o *CoreBlockFetchAddableBlocksRequest) GetPagehash() string`

GetPagehash returns the Pagehash field if non-nil, zero value otherwise.

### GetPagehashOk

`func (o *CoreBlockFetchAddableBlocksRequest) GetPagehashOk() (*string, bool)`

GetPagehashOk returns a tuple with the Pagehash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPagehash

`func (o *CoreBlockFetchAddableBlocksRequest) SetPagehash(v string)`

SetPagehash sets Pagehash field to given value.

### HasPagehash

`func (o *CoreBlockFetchAddableBlocksRequest) HasPagehash() bool`

HasPagehash returns a boolean if a field has been set.

### GetPagelayout

`func (o *CoreBlockFetchAddableBlocksRequest) GetPagelayout() string`

GetPagelayout returns the Pagelayout field if non-nil, zero value otherwise.

### GetPagelayoutOk

`func (o *CoreBlockFetchAddableBlocksRequest) GetPagelayoutOk() (*string, bool)`

GetPagelayoutOk returns a tuple with the Pagelayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPagelayout

`func (o *CoreBlockFetchAddableBlocksRequest) SetPagelayout(v string)`

SetPagelayout sets Pagelayout field to given value.


### GetPagetype

`func (o *CoreBlockFetchAddableBlocksRequest) GetPagetype() string`

GetPagetype returns the Pagetype field if non-nil, zero value otherwise.

### GetPagetypeOk

`func (o *CoreBlockFetchAddableBlocksRequest) GetPagetypeOk() (*string, bool)`

GetPagetypeOk returns a tuple with the Pagetype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPagetype

`func (o *CoreBlockFetchAddableBlocksRequest) SetPagetype(v string)`

SetPagetype sets Pagetype field to given value.


### GetSubpage

`func (o *CoreBlockFetchAddableBlocksRequest) GetSubpage() string`

GetSubpage returns the Subpage field if non-nil, zero value otherwise.

### GetSubpageOk

`func (o *CoreBlockFetchAddableBlocksRequest) GetSubpageOk() (*string, bool)`

GetSubpageOk returns a tuple with the Subpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubpage

`func (o *CoreBlockFetchAddableBlocksRequest) SetSubpage(v string)`

SetSubpage sets Subpage field to given value.

### HasSubpage

`func (o *CoreBlockFetchAddableBlocksRequest) HasSubpage() bool`

HasSubpage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


