# CoreNotesGetCourseNotes200ResponseCoursenotesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | Pointer to **string** | the content text formated | [optional] [default to "null"]
**Courseid** | Pointer to **int32** | id of the course | [optional] 
**Created** | Pointer to **int32** | time created (timestamp) | [optional] [default to null]
**Format** | Pointer to **int32** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Id** | Pointer to **int32** | id of this note | [optional] [default to null]
**Lastmodified** | Pointer to **int32** | time of last modification (timestamp) | [optional] [default to null]
**Publishstate** | Pointer to **string** | state of the note (i.e. draft, public, site)  | [optional] [default to "null"]
**Userid** | Pointer to **int32** | user id | [optional] 
**Usermodified** | Pointer to **int32** | user id of the creator of this note | [optional] [default to null]

## Methods

### NewCoreNotesGetCourseNotes200ResponseCoursenotesInner

`func NewCoreNotesGetCourseNotes200ResponseCoursenotesInner() *CoreNotesGetCourseNotes200ResponseCoursenotesInner`

NewCoreNotesGetCourseNotes200ResponseCoursenotesInner instantiates a new CoreNotesGetCourseNotes200ResponseCoursenotesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreNotesGetCourseNotes200ResponseCoursenotesInnerWithDefaults

`func NewCoreNotesGetCourseNotes200ResponseCoursenotesInnerWithDefaults() *CoreNotesGetCourseNotes200ResponseCoursenotesInner`

NewCoreNotesGetCourseNotes200ResponseCoursenotesInnerWithDefaults instantiates a new CoreNotesGetCourseNotes200ResponseCoursenotesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContent

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) SetContent(v string)`

SetContent sets Content field to given value.

### HasContent

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) HasContent() bool`

HasContent returns a boolean if a field has been set.

### GetCourseid

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetCreated

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) SetCreated(v int32)`

SetCreated sets Created field to given value.

### HasCreated

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) HasCreated() bool`

HasCreated returns a boolean if a field has been set.

### GetFormat

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetFormat() int32`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetFormatOk() (*int32, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) SetFormat(v int32)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetId

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLastmodified

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetLastmodified() int32`

GetLastmodified returns the Lastmodified field if non-nil, zero value otherwise.

### GetLastmodifiedOk

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetLastmodifiedOk() (*int32, bool)`

GetLastmodifiedOk returns a tuple with the Lastmodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastmodified

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) SetLastmodified(v int32)`

SetLastmodified sets Lastmodified field to given value.

### HasLastmodified

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) HasLastmodified() bool`

HasLastmodified returns a boolean if a field has been set.

### GetPublishstate

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetPublishstate() string`

GetPublishstate returns the Publishstate field if non-nil, zero value otherwise.

### GetPublishstateOk

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetPublishstateOk() (*string, bool)`

GetPublishstateOk returns a tuple with the Publishstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublishstate

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) SetPublishstate(v string)`

SetPublishstate sets Publishstate field to given value.

### HasPublishstate

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) HasPublishstate() bool`

HasPublishstate returns a boolean if a field has been set.

### GetUserid

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetUsermodified

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *CoreNotesGetCourseNotes200ResponseCoursenotesInner) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


