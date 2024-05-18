# ModWikiEditPageRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | **string** | Page contents. | 
**Pageid** | **int32** | Page ID. | [default to null]
**Section** | Pointer to **string** | Section page title. | [optional] [default to "null"]

## Methods

### NewModWikiEditPageRequest

`func NewModWikiEditPageRequest(content string, pageid int32, ) *ModWikiEditPageRequest`

NewModWikiEditPageRequest instantiates a new ModWikiEditPageRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWikiEditPageRequestWithDefaults

`func NewModWikiEditPageRequestWithDefaults() *ModWikiEditPageRequest`

NewModWikiEditPageRequestWithDefaults instantiates a new ModWikiEditPageRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContent

`func (o *ModWikiEditPageRequest) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *ModWikiEditPageRequest) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *ModWikiEditPageRequest) SetContent(v string)`

SetContent sets Content field to given value.


### GetPageid

`func (o *ModWikiEditPageRequest) GetPageid() int32`

GetPageid returns the Pageid field if non-nil, zero value otherwise.

### GetPageidOk

`func (o *ModWikiEditPageRequest) GetPageidOk() (*int32, bool)`

GetPageidOk returns a tuple with the Pageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageid

`func (o *ModWikiEditPageRequest) SetPageid(v int32)`

SetPageid sets Pageid field to given value.


### GetSection

`func (o *ModWikiEditPageRequest) GetSection() string`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModWikiEditPageRequest) GetSectionOk() (*string, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModWikiEditPageRequest) SetSection(v string)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModWikiEditPageRequest) HasSection() bool`

HasSection returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


