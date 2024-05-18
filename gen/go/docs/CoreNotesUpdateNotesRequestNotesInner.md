# CoreNotesUpdateNotesRequestNotesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Format** | Pointer to **int32** | text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Id** | Pointer to **int32** | id of the note | [optional] 
**Publishstate** | Pointer to **string** | &#39;personal&#39;, &#39;course&#39; or &#39;site&#39; | [optional] 
**Text** | Pointer to **string** | the text of the message - text or HTML | [optional] 

## Methods

### NewCoreNotesUpdateNotesRequestNotesInner

`func NewCoreNotesUpdateNotesRequestNotesInner() *CoreNotesUpdateNotesRequestNotesInner`

NewCoreNotesUpdateNotesRequestNotesInner instantiates a new CoreNotesUpdateNotesRequestNotesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreNotesUpdateNotesRequestNotesInnerWithDefaults

`func NewCoreNotesUpdateNotesRequestNotesInnerWithDefaults() *CoreNotesUpdateNotesRequestNotesInner`

NewCoreNotesUpdateNotesRequestNotesInnerWithDefaults instantiates a new CoreNotesUpdateNotesRequestNotesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFormat

`func (o *CoreNotesUpdateNotesRequestNotesInner) GetFormat() int32`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CoreNotesUpdateNotesRequestNotesInner) GetFormatOk() (*int32, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CoreNotesUpdateNotesRequestNotesInner) SetFormat(v int32)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *CoreNotesUpdateNotesRequestNotesInner) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetId

`func (o *CoreNotesUpdateNotesRequestNotesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreNotesUpdateNotesRequestNotesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreNotesUpdateNotesRequestNotesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreNotesUpdateNotesRequestNotesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetPublishstate

`func (o *CoreNotesUpdateNotesRequestNotesInner) GetPublishstate() string`

GetPublishstate returns the Publishstate field if non-nil, zero value otherwise.

### GetPublishstateOk

`func (o *CoreNotesUpdateNotesRequestNotesInner) GetPublishstateOk() (*string, bool)`

GetPublishstateOk returns a tuple with the Publishstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublishstate

`func (o *CoreNotesUpdateNotesRequestNotesInner) SetPublishstate(v string)`

SetPublishstate sets Publishstate field to given value.

### HasPublishstate

`func (o *CoreNotesUpdateNotesRequestNotesInner) HasPublishstate() bool`

HasPublishstate returns a boolean if a field has been set.

### GetText

`func (o *CoreNotesUpdateNotesRequestNotesInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *CoreNotesUpdateNotesRequestNotesInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *CoreNotesUpdateNotesRequestNotesInner) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *CoreNotesUpdateNotesRequestNotesInner) HasText() bool`

HasText returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


