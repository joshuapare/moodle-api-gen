# ModWikiGetPageForEditing200ResponsePagesection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | Pointer to **string** | The contents of the page-section to be edited. | [optional] [default to "null"]
**Contentformat** | Pointer to **string** | Format of the original content of the page. | [optional] [default to "null"]
**Version** | **int32** | Latest version of the page. | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModWikiGetPageForEditing200ResponsePagesection

`func NewModWikiGetPageForEditing200ResponsePagesection(version int32, ) *ModWikiGetPageForEditing200ResponsePagesection`

NewModWikiGetPageForEditing200ResponsePagesection instantiates a new ModWikiGetPageForEditing200ResponsePagesection object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWikiGetPageForEditing200ResponsePagesectionWithDefaults

`func NewModWikiGetPageForEditing200ResponsePagesectionWithDefaults() *ModWikiGetPageForEditing200ResponsePagesection`

NewModWikiGetPageForEditing200ResponsePagesectionWithDefaults instantiates a new ModWikiGetPageForEditing200ResponsePagesection object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContent

`func (o *ModWikiGetPageForEditing200ResponsePagesection) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *ModWikiGetPageForEditing200ResponsePagesection) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *ModWikiGetPageForEditing200ResponsePagesection) SetContent(v string)`

SetContent sets Content field to given value.

### HasContent

`func (o *ModWikiGetPageForEditing200ResponsePagesection) HasContent() bool`

HasContent returns a boolean if a field has been set.

### GetContentformat

`func (o *ModWikiGetPageForEditing200ResponsePagesection) GetContentformat() string`

GetContentformat returns the Contentformat field if non-nil, zero value otherwise.

### GetContentformatOk

`func (o *ModWikiGetPageForEditing200ResponsePagesection) GetContentformatOk() (*string, bool)`

GetContentformatOk returns a tuple with the Contentformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentformat

`func (o *ModWikiGetPageForEditing200ResponsePagesection) SetContentformat(v string)`

SetContentformat sets Contentformat field to given value.

### HasContentformat

`func (o *ModWikiGetPageForEditing200ResponsePagesection) HasContentformat() bool`

HasContentformat returns a boolean if a field has been set.

### GetVersion

`func (o *ModWikiGetPageForEditing200ResponsePagesection) GetVersion() int32`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *ModWikiGetPageForEditing200ResponsePagesection) GetVersionOk() (*int32, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *ModWikiGetPageForEditing200ResponsePagesection) SetVersion(v int32)`

SetVersion sets Version field to given value.


### GetWarnings

`func (o *ModWikiGetPageForEditing200ResponsePagesection) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWikiGetPageForEditing200ResponsePagesection) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWikiGetPageForEditing200ResponsePagesection) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWikiGetPageForEditing200ResponsePagesection) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


