# ModLessonGetPageData200ResponsePage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contents** | Pointer to **string** | The contents of this page | [optional] [default to "null"]
**Contentsformat** | Pointer to **int32** | contents format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Display** | **int32** | Used to record page specific display selections | [default to null]
**Displayinmenublock** | **bool** | Toggles display in the left menu block | [default to null]
**Id** | **int32** | The id of this lesson page | [default to null]
**Layout** | **int32** | Used to record page specific layout selections | [default to null]
**Lessonid** | **int32** | The id of the lesson this page belongs to | [default to null]
**Nextpageid** | **int32** | The id of the next page in the page sequence | [default to null]
**Prevpageid** | **int32** | The id of the page before this one | [default to null]
**Qoption** | **int32** | Used to record page type specific options | [default to null]
**Qtype** | **int32** | Identifies the page type of this page | [default to null]
**Timecreated** | **int32** | Timestamp for when the page was created | [default to null]
**Timemodified** | **int32** | Timestamp for when the page was last modified | [default to null]
**Title** | Pointer to **string** | The title of this page | [optional] [default to "null"]
**Type** | **int32** | The type of the page [question | structure] | [default to null]
**Typeid** | **int32** | The unique identifier for the page type | [default to null]
**Typestring** | **string** | The string that describes this page type | [default to "null"]

## Methods

### NewModLessonGetPageData200ResponsePage

`func NewModLessonGetPageData200ResponsePage(display int32, displayinmenublock bool, id int32, layout int32, lessonid int32, nextpageid int32, prevpageid int32, qoption int32, qtype int32, timecreated int32, timemodified int32, type_ int32, typeid int32, typestring string, ) *ModLessonGetPageData200ResponsePage`

NewModLessonGetPageData200ResponsePage instantiates a new ModLessonGetPageData200ResponsePage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetPageData200ResponsePageWithDefaults

`func NewModLessonGetPageData200ResponsePageWithDefaults() *ModLessonGetPageData200ResponsePage`

NewModLessonGetPageData200ResponsePageWithDefaults instantiates a new ModLessonGetPageData200ResponsePage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContents

`func (o *ModLessonGetPageData200ResponsePage) GetContents() string`

GetContents returns the Contents field if non-nil, zero value otherwise.

### GetContentsOk

`func (o *ModLessonGetPageData200ResponsePage) GetContentsOk() (*string, bool)`

GetContentsOk returns a tuple with the Contents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContents

`func (o *ModLessonGetPageData200ResponsePage) SetContents(v string)`

SetContents sets Contents field to given value.

### HasContents

`func (o *ModLessonGetPageData200ResponsePage) HasContents() bool`

HasContents returns a boolean if a field has been set.

### GetContentsformat

`func (o *ModLessonGetPageData200ResponsePage) GetContentsformat() int32`

GetContentsformat returns the Contentsformat field if non-nil, zero value otherwise.

### GetContentsformatOk

`func (o *ModLessonGetPageData200ResponsePage) GetContentsformatOk() (*int32, bool)`

GetContentsformatOk returns a tuple with the Contentsformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentsformat

`func (o *ModLessonGetPageData200ResponsePage) SetContentsformat(v int32)`

SetContentsformat sets Contentsformat field to given value.

### HasContentsformat

`func (o *ModLessonGetPageData200ResponsePage) HasContentsformat() bool`

HasContentsformat returns a boolean if a field has been set.

### GetDisplay

`func (o *ModLessonGetPageData200ResponsePage) GetDisplay() int32`

GetDisplay returns the Display field if non-nil, zero value otherwise.

### GetDisplayOk

`func (o *ModLessonGetPageData200ResponsePage) GetDisplayOk() (*int32, bool)`

GetDisplayOk returns a tuple with the Display field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplay

`func (o *ModLessonGetPageData200ResponsePage) SetDisplay(v int32)`

SetDisplay sets Display field to given value.


### GetDisplayinmenublock

`func (o *ModLessonGetPageData200ResponsePage) GetDisplayinmenublock() bool`

GetDisplayinmenublock returns the Displayinmenublock field if non-nil, zero value otherwise.

### GetDisplayinmenublockOk

`func (o *ModLessonGetPageData200ResponsePage) GetDisplayinmenublockOk() (*bool, bool)`

GetDisplayinmenublockOk returns a tuple with the Displayinmenublock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayinmenublock

`func (o *ModLessonGetPageData200ResponsePage) SetDisplayinmenublock(v bool)`

SetDisplayinmenublock sets Displayinmenublock field to given value.


### GetId

`func (o *ModLessonGetPageData200ResponsePage) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModLessonGetPageData200ResponsePage) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModLessonGetPageData200ResponsePage) SetId(v int32)`

SetId sets Id field to given value.


### GetLayout

`func (o *ModLessonGetPageData200ResponsePage) GetLayout() int32`

GetLayout returns the Layout field if non-nil, zero value otherwise.

### GetLayoutOk

`func (o *ModLessonGetPageData200ResponsePage) GetLayoutOk() (*int32, bool)`

GetLayoutOk returns a tuple with the Layout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLayout

`func (o *ModLessonGetPageData200ResponsePage) SetLayout(v int32)`

SetLayout sets Layout field to given value.


### GetLessonid

`func (o *ModLessonGetPageData200ResponsePage) GetLessonid() int32`

GetLessonid returns the Lessonid field if non-nil, zero value otherwise.

### GetLessonidOk

`func (o *ModLessonGetPageData200ResponsePage) GetLessonidOk() (*int32, bool)`

GetLessonidOk returns a tuple with the Lessonid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonid

`func (o *ModLessonGetPageData200ResponsePage) SetLessonid(v int32)`

SetLessonid sets Lessonid field to given value.


### GetNextpageid

`func (o *ModLessonGetPageData200ResponsePage) GetNextpageid() int32`

GetNextpageid returns the Nextpageid field if non-nil, zero value otherwise.

### GetNextpageidOk

`func (o *ModLessonGetPageData200ResponsePage) GetNextpageidOk() (*int32, bool)`

GetNextpageidOk returns a tuple with the Nextpageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextpageid

`func (o *ModLessonGetPageData200ResponsePage) SetNextpageid(v int32)`

SetNextpageid sets Nextpageid field to given value.


### GetPrevpageid

`func (o *ModLessonGetPageData200ResponsePage) GetPrevpageid() int32`

GetPrevpageid returns the Prevpageid field if non-nil, zero value otherwise.

### GetPrevpageidOk

`func (o *ModLessonGetPageData200ResponsePage) GetPrevpageidOk() (*int32, bool)`

GetPrevpageidOk returns a tuple with the Prevpageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevpageid

`func (o *ModLessonGetPageData200ResponsePage) SetPrevpageid(v int32)`

SetPrevpageid sets Prevpageid field to given value.


### GetQoption

`func (o *ModLessonGetPageData200ResponsePage) GetQoption() int32`

GetQoption returns the Qoption field if non-nil, zero value otherwise.

### GetQoptionOk

`func (o *ModLessonGetPageData200ResponsePage) GetQoptionOk() (*int32, bool)`

GetQoptionOk returns a tuple with the Qoption field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQoption

`func (o *ModLessonGetPageData200ResponsePage) SetQoption(v int32)`

SetQoption sets Qoption field to given value.


### GetQtype

`func (o *ModLessonGetPageData200ResponsePage) GetQtype() int32`

GetQtype returns the Qtype field if non-nil, zero value otherwise.

### GetQtypeOk

`func (o *ModLessonGetPageData200ResponsePage) GetQtypeOk() (*int32, bool)`

GetQtypeOk returns a tuple with the Qtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQtype

`func (o *ModLessonGetPageData200ResponsePage) SetQtype(v int32)`

SetQtype sets Qtype field to given value.


### GetTimecreated

`func (o *ModLessonGetPageData200ResponsePage) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModLessonGetPageData200ResponsePage) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModLessonGetPageData200ResponsePage) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *ModLessonGetPageData200ResponsePage) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModLessonGetPageData200ResponsePage) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModLessonGetPageData200ResponsePage) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetTitle

`func (o *ModLessonGetPageData200ResponsePage) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ModLessonGetPageData200ResponsePage) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ModLessonGetPageData200ResponsePage) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *ModLessonGetPageData200ResponsePage) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetType

`func (o *ModLessonGetPageData200ResponsePage) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ModLessonGetPageData200ResponsePage) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ModLessonGetPageData200ResponsePage) SetType(v int32)`

SetType sets Type field to given value.


### GetTypeid

`func (o *ModLessonGetPageData200ResponsePage) GetTypeid() int32`

GetTypeid returns the Typeid field if non-nil, zero value otherwise.

### GetTypeidOk

`func (o *ModLessonGetPageData200ResponsePage) GetTypeidOk() (*int32, bool)`

GetTypeidOk returns a tuple with the Typeid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypeid

`func (o *ModLessonGetPageData200ResponsePage) SetTypeid(v int32)`

SetTypeid sets Typeid field to given value.


### GetTypestring

`func (o *ModLessonGetPageData200ResponsePage) GetTypestring() string`

GetTypestring returns the Typestring field if non-nil, zero value otherwise.

### GetTypestringOk

`func (o *ModLessonGetPageData200ResponsePage) GetTypestringOk() (*string, bool)`

GetTypestringOk returns a tuple with the Typestring field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypestring

`func (o *ModLessonGetPageData200ResponsePage) SetTypestring(v string)`

SetTypestring sets Typestring field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


