# ModLessonGetPages200ResponsePagesInnerPage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contents** | Pointer to **string** | The contents of this page | [optional] 
**Contentsformat** | Pointer to **int32** | contents format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Display** | **int32** | Used to record page specific display selections | 
**Displayinmenublock** | **bool** | Toggles display in the left menu block | 
**Id** | **int32** | The id of this lesson page | 
**Layout** | **int32** | Used to record page specific layout selections | 
**Lessonid** | **int32** | The id of the lesson this page belongs to | 
**Nextpageid** | **int32** | The id of the next page in the page sequence | 
**Prevpageid** | **int32** | The id of the page before this one | 
**Qoption** | **int32** | Used to record page type specific options | 
**Qtype** | **int32** | Identifies the page type of this page | 
**Timecreated** | **int32** | Timestamp for when the page was created | 
**Timemodified** | **int32** | Timestamp for when the page was last modified | 
**Title** | Pointer to **string** | The title of this page | [optional] 
**Type** | **int32** | The type of the page [question | structure] | 
**Typeid** | **int32** | The unique identifier for the page type | 
**Typestring** | **string** | The string that describes this page type | 

## Methods

### NewModLessonGetPages200ResponsePagesInnerPage

`func NewModLessonGetPages200ResponsePagesInnerPage(display int32, displayinmenublock bool, id int32, layout int32, lessonid int32, nextpageid int32, prevpageid int32, qoption int32, qtype int32, timecreated int32, timemodified int32, type_ int32, typeid int32, typestring string, ) *ModLessonGetPages200ResponsePagesInnerPage`

NewModLessonGetPages200ResponsePagesInnerPage instantiates a new ModLessonGetPages200ResponsePagesInnerPage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetPages200ResponsePagesInnerPageWithDefaults

`func NewModLessonGetPages200ResponsePagesInnerPageWithDefaults() *ModLessonGetPages200ResponsePagesInnerPage`

NewModLessonGetPages200ResponsePagesInnerPageWithDefaults instantiates a new ModLessonGetPages200ResponsePagesInnerPage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContents

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetContents() string`

GetContents returns the Contents field if non-nil, zero value otherwise.

### GetContentsOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetContentsOk() (*string, bool)`

GetContentsOk returns a tuple with the Contents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContents

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetContents(v string)`

SetContents sets Contents field to given value.

### HasContents

`func (o *ModLessonGetPages200ResponsePagesInnerPage) HasContents() bool`

HasContents returns a boolean if a field has been set.

### GetContentsformat

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetContentsformat() int32`

GetContentsformat returns the Contentsformat field if non-nil, zero value otherwise.

### GetContentsformatOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetContentsformatOk() (*int32, bool)`

GetContentsformatOk returns a tuple with the Contentsformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentsformat

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetContentsformat(v int32)`

SetContentsformat sets Contentsformat field to given value.

### HasContentsformat

`func (o *ModLessonGetPages200ResponsePagesInnerPage) HasContentsformat() bool`

HasContentsformat returns a boolean if a field has been set.

### GetDisplay

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetDisplay() int32`

GetDisplay returns the Display field if non-nil, zero value otherwise.

### GetDisplayOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetDisplayOk() (*int32, bool)`

GetDisplayOk returns a tuple with the Display field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplay

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetDisplay(v int32)`

SetDisplay sets Display field to given value.


### GetDisplayinmenublock

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetDisplayinmenublock() bool`

GetDisplayinmenublock returns the Displayinmenublock field if non-nil, zero value otherwise.

### GetDisplayinmenublockOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetDisplayinmenublockOk() (*bool, bool)`

GetDisplayinmenublockOk returns a tuple with the Displayinmenublock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayinmenublock

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetDisplayinmenublock(v bool)`

SetDisplayinmenublock sets Displayinmenublock field to given value.


### GetId

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetId(v int32)`

SetId sets Id field to given value.


### GetLayout

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetLayout() int32`

GetLayout returns the Layout field if non-nil, zero value otherwise.

### GetLayoutOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetLayoutOk() (*int32, bool)`

GetLayoutOk returns a tuple with the Layout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLayout

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetLayout(v int32)`

SetLayout sets Layout field to given value.


### GetLessonid

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetLessonid() int32`

GetLessonid returns the Lessonid field if non-nil, zero value otherwise.

### GetLessonidOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetLessonidOk() (*int32, bool)`

GetLessonidOk returns a tuple with the Lessonid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonid

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetLessonid(v int32)`

SetLessonid sets Lessonid field to given value.


### GetNextpageid

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetNextpageid() int32`

GetNextpageid returns the Nextpageid field if non-nil, zero value otherwise.

### GetNextpageidOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetNextpageidOk() (*int32, bool)`

GetNextpageidOk returns a tuple with the Nextpageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextpageid

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetNextpageid(v int32)`

SetNextpageid sets Nextpageid field to given value.


### GetPrevpageid

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetPrevpageid() int32`

GetPrevpageid returns the Prevpageid field if non-nil, zero value otherwise.

### GetPrevpageidOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetPrevpageidOk() (*int32, bool)`

GetPrevpageidOk returns a tuple with the Prevpageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevpageid

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetPrevpageid(v int32)`

SetPrevpageid sets Prevpageid field to given value.


### GetQoption

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetQoption() int32`

GetQoption returns the Qoption field if non-nil, zero value otherwise.

### GetQoptionOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetQoptionOk() (*int32, bool)`

GetQoptionOk returns a tuple with the Qoption field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQoption

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetQoption(v int32)`

SetQoption sets Qoption field to given value.


### GetQtype

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetQtype() int32`

GetQtype returns the Qtype field if non-nil, zero value otherwise.

### GetQtypeOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetQtypeOk() (*int32, bool)`

GetQtypeOk returns a tuple with the Qtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQtype

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetQtype(v int32)`

SetQtype sets Qtype field to given value.


### GetTimecreated

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetTitle

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *ModLessonGetPages200ResponsePagesInnerPage) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetType

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetType(v int32)`

SetType sets Type field to given value.


### GetTypeid

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetTypeid() int32`

GetTypeid returns the Typeid field if non-nil, zero value otherwise.

### GetTypeidOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetTypeidOk() (*int32, bool)`

GetTypeidOk returns a tuple with the Typeid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypeid

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetTypeid(v int32)`

SetTypeid sets Typeid field to given value.


### GetTypestring

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetTypestring() string`

GetTypestring returns the Typestring field if non-nil, zero value otherwise.

### GetTypestringOk

`func (o *ModLessonGetPages200ResponsePagesInnerPage) GetTypestringOk() (*string, bool)`

GetTypestringOk returns a tuple with the Typestring field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypestring

`func (o *ModLessonGetPages200ResponsePagesInnerPage) SetTypestring(v string)`

SetTypestring sets Typestring field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


