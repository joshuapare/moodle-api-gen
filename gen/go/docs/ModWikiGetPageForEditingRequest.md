# ModWikiGetPageForEditingRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Lockonly** | Pointer to **bool** | Just renew lock and not return content. | [optional] [default to false]
**Pageid** | **int32** | Page ID to edit. | [default to null]
**Section** | Pointer to **string** | Section page title. | [optional] 

## Methods

### NewModWikiGetPageForEditingRequest

`func NewModWikiGetPageForEditingRequest(pageid int32, ) *ModWikiGetPageForEditingRequest`

NewModWikiGetPageForEditingRequest instantiates a new ModWikiGetPageForEditingRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWikiGetPageForEditingRequestWithDefaults

`func NewModWikiGetPageForEditingRequestWithDefaults() *ModWikiGetPageForEditingRequest`

NewModWikiGetPageForEditingRequestWithDefaults instantiates a new ModWikiGetPageForEditingRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLockonly

`func (o *ModWikiGetPageForEditingRequest) GetLockonly() bool`

GetLockonly returns the Lockonly field if non-nil, zero value otherwise.

### GetLockonlyOk

`func (o *ModWikiGetPageForEditingRequest) GetLockonlyOk() (*bool, bool)`

GetLockonlyOk returns a tuple with the Lockonly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLockonly

`func (o *ModWikiGetPageForEditingRequest) SetLockonly(v bool)`

SetLockonly sets Lockonly field to given value.

### HasLockonly

`func (o *ModWikiGetPageForEditingRequest) HasLockonly() bool`

HasLockonly returns a boolean if a field has been set.

### GetPageid

`func (o *ModWikiGetPageForEditingRequest) GetPageid() int32`

GetPageid returns the Pageid field if non-nil, zero value otherwise.

### GetPageidOk

`func (o *ModWikiGetPageForEditingRequest) GetPageidOk() (*int32, bool)`

GetPageidOk returns a tuple with the Pageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageid

`func (o *ModWikiGetPageForEditingRequest) SetPageid(v int32)`

SetPageid sets Pageid field to given value.


### GetSection

`func (o *ModWikiGetPageForEditingRequest) GetSection() string`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModWikiGetPageForEditingRequest) GetSectionOk() (*string, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModWikiGetPageForEditingRequest) SetSection(v string)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModWikiGetPageForEditingRequest) HasSection() bool`

HasSection returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


