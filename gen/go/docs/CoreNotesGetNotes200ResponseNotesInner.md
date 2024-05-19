# CoreNotesGetNotes200ResponseNotesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | course id of the note | [optional] [default to null]
**Format** | Pointer to **int32** | text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Noteid** | Pointer to **int32** | id of the note | [optional] [default to null]
**Publishstate** | Pointer to **string** | &#39;personal&#39;, &#39;course&#39; or &#39;site&#39; | [optional] 
**Text** | Pointer to **string** | the text of the message - text or HTML | [optional] 
**Userid** | Pointer to **int32** | id of the user the note is about | [optional] 

## Methods

### NewCoreNotesGetNotes200ResponseNotesInner

`func NewCoreNotesGetNotes200ResponseNotesInner() *CoreNotesGetNotes200ResponseNotesInner`

NewCoreNotesGetNotes200ResponseNotesInner instantiates a new CoreNotesGetNotes200ResponseNotesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreNotesGetNotes200ResponseNotesInnerWithDefaults

`func NewCoreNotesGetNotes200ResponseNotesInnerWithDefaults() *CoreNotesGetNotes200ResponseNotesInner`

NewCoreNotesGetNotes200ResponseNotesInnerWithDefaults instantiates a new CoreNotesGetNotes200ResponseNotesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreNotesGetNotes200ResponseNotesInner) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreNotesGetNotes200ResponseNotesInner) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreNotesGetNotes200ResponseNotesInner) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreNotesGetNotes200ResponseNotesInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetFormat

`func (o *CoreNotesGetNotes200ResponseNotesInner) GetFormat() int32`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CoreNotesGetNotes200ResponseNotesInner) GetFormatOk() (*int32, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CoreNotesGetNotes200ResponseNotesInner) SetFormat(v int32)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *CoreNotesGetNotes200ResponseNotesInner) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetNoteid

`func (o *CoreNotesGetNotes200ResponseNotesInner) GetNoteid() int32`

GetNoteid returns the Noteid field if non-nil, zero value otherwise.

### GetNoteidOk

`func (o *CoreNotesGetNotes200ResponseNotesInner) GetNoteidOk() (*int32, bool)`

GetNoteidOk returns a tuple with the Noteid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNoteid

`func (o *CoreNotesGetNotes200ResponseNotesInner) SetNoteid(v int32)`

SetNoteid sets Noteid field to given value.

### HasNoteid

`func (o *CoreNotesGetNotes200ResponseNotesInner) HasNoteid() bool`

HasNoteid returns a boolean if a field has been set.

### GetPublishstate

`func (o *CoreNotesGetNotes200ResponseNotesInner) GetPublishstate() string`

GetPublishstate returns the Publishstate field if non-nil, zero value otherwise.

### GetPublishstateOk

`func (o *CoreNotesGetNotes200ResponseNotesInner) GetPublishstateOk() (*string, bool)`

GetPublishstateOk returns a tuple with the Publishstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublishstate

`func (o *CoreNotesGetNotes200ResponseNotesInner) SetPublishstate(v string)`

SetPublishstate sets Publishstate field to given value.

### HasPublishstate

`func (o *CoreNotesGetNotes200ResponseNotesInner) HasPublishstate() bool`

HasPublishstate returns a boolean if a field has been set.

### GetText

`func (o *CoreNotesGetNotes200ResponseNotesInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *CoreNotesGetNotes200ResponseNotesInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *CoreNotesGetNotes200ResponseNotesInner) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *CoreNotesGetNotes200ResponseNotesInner) HasText() bool`

HasText returns a boolean if a field has been set.

### GetUserid

`func (o *CoreNotesGetNotes200ResponseNotesInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreNotesGetNotes200ResponseNotesInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreNotesGetNotes200ResponseNotesInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreNotesGetNotes200ResponseNotesInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


