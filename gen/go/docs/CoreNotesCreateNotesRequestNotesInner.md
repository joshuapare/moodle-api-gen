# CoreNotesCreateNotesRequestNotesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Clientnoteid** | Pointer to **string** | your own client id for the note. If this id is provided, the fail message id will be returned to you | [optional] [default to "null"]
**Courseid** | Pointer to **int32** | course id of the note (in Moodle a note can only be created into a course, even for site and personal notes) | [optional] [default to null]
**Format** | Pointer to **int32** | text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Publishstate** | Pointer to **string** | &#39;personal&#39;, &#39;course&#39; or &#39;site&#39; | [optional] [default to "null"]
**Text** | Pointer to **string** | the text of the message - text or HTML | [optional] [default to "null"]
**Userid** | Pointer to **int32** | id of the user the note is about | [optional] [default to null]

## Methods

### NewCoreNotesCreateNotesRequestNotesInner

`func NewCoreNotesCreateNotesRequestNotesInner() *CoreNotesCreateNotesRequestNotesInner`

NewCoreNotesCreateNotesRequestNotesInner instantiates a new CoreNotesCreateNotesRequestNotesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreNotesCreateNotesRequestNotesInnerWithDefaults

`func NewCoreNotesCreateNotesRequestNotesInnerWithDefaults() *CoreNotesCreateNotesRequestNotesInner`

NewCoreNotesCreateNotesRequestNotesInnerWithDefaults instantiates a new CoreNotesCreateNotesRequestNotesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClientnoteid

`func (o *CoreNotesCreateNotesRequestNotesInner) GetClientnoteid() string`

GetClientnoteid returns the Clientnoteid field if non-nil, zero value otherwise.

### GetClientnoteidOk

`func (o *CoreNotesCreateNotesRequestNotesInner) GetClientnoteidOk() (*string, bool)`

GetClientnoteidOk returns a tuple with the Clientnoteid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientnoteid

`func (o *CoreNotesCreateNotesRequestNotesInner) SetClientnoteid(v string)`

SetClientnoteid sets Clientnoteid field to given value.

### HasClientnoteid

`func (o *CoreNotesCreateNotesRequestNotesInner) HasClientnoteid() bool`

HasClientnoteid returns a boolean if a field has been set.

### GetCourseid

`func (o *CoreNotesCreateNotesRequestNotesInner) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreNotesCreateNotesRequestNotesInner) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreNotesCreateNotesRequestNotesInner) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreNotesCreateNotesRequestNotesInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetFormat

`func (o *CoreNotesCreateNotesRequestNotesInner) GetFormat() int32`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CoreNotesCreateNotesRequestNotesInner) GetFormatOk() (*int32, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CoreNotesCreateNotesRequestNotesInner) SetFormat(v int32)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *CoreNotesCreateNotesRequestNotesInner) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetPublishstate

`func (o *CoreNotesCreateNotesRequestNotesInner) GetPublishstate() string`

GetPublishstate returns the Publishstate field if non-nil, zero value otherwise.

### GetPublishstateOk

`func (o *CoreNotesCreateNotesRequestNotesInner) GetPublishstateOk() (*string, bool)`

GetPublishstateOk returns a tuple with the Publishstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublishstate

`func (o *CoreNotesCreateNotesRequestNotesInner) SetPublishstate(v string)`

SetPublishstate sets Publishstate field to given value.

### HasPublishstate

`func (o *CoreNotesCreateNotesRequestNotesInner) HasPublishstate() bool`

HasPublishstate returns a boolean if a field has been set.

### GetText

`func (o *CoreNotesCreateNotesRequestNotesInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *CoreNotesCreateNotesRequestNotesInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *CoreNotesCreateNotesRequestNotesInner) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *CoreNotesCreateNotesRequestNotesInner) HasText() bool`

HasText returns a boolean if a field has been set.

### GetUserid

`func (o *CoreNotesCreateNotesRequestNotesInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreNotesCreateNotesRequestNotesInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreNotesCreateNotesRequestNotesInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreNotesCreateNotesRequestNotesInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


