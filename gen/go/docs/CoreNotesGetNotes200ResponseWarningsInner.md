# CoreNotesGetNotes200ResponseWarningsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Item** | Pointer to **string** | item is always &#39;note&#39; | [optional] [default to "null"]
**Itemid** | Pointer to **int32** | When errorcode is savedfailed the note could not be modified.When errorcode is badparam, an incorrect parameter was provided.When errorcode is badid, the note does not exist | [optional] [default to null]
**Message** | Pointer to **string** | untranslated english message to explain the warning | [optional] 
**Warningcode** | Pointer to **string** | errorcode can be badparam (incorrect parameter), savedfailed (could not be modified), or badid (note does not exist) | [optional] [default to "null"]

## Methods

### NewCoreNotesGetNotes200ResponseWarningsInner

`func NewCoreNotesGetNotes200ResponseWarningsInner() *CoreNotesGetNotes200ResponseWarningsInner`

NewCoreNotesGetNotes200ResponseWarningsInner instantiates a new CoreNotesGetNotes200ResponseWarningsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreNotesGetNotes200ResponseWarningsInnerWithDefaults

`func NewCoreNotesGetNotes200ResponseWarningsInnerWithDefaults() *CoreNotesGetNotes200ResponseWarningsInner`

NewCoreNotesGetNotes200ResponseWarningsInnerWithDefaults instantiates a new CoreNotesGetNotes200ResponseWarningsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItem

`func (o *CoreNotesGetNotes200ResponseWarningsInner) GetItem() string`

GetItem returns the Item field if non-nil, zero value otherwise.

### GetItemOk

`func (o *CoreNotesGetNotes200ResponseWarningsInner) GetItemOk() (*string, bool)`

GetItemOk returns a tuple with the Item field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItem

`func (o *CoreNotesGetNotes200ResponseWarningsInner) SetItem(v string)`

SetItem sets Item field to given value.

### HasItem

`func (o *CoreNotesGetNotes200ResponseWarningsInner) HasItem() bool`

HasItem returns a boolean if a field has been set.

### GetItemid

`func (o *CoreNotesGetNotes200ResponseWarningsInner) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreNotesGetNotes200ResponseWarningsInner) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreNotesGetNotes200ResponseWarningsInner) SetItemid(v int32)`

SetItemid sets Itemid field to given value.

### HasItemid

`func (o *CoreNotesGetNotes200ResponseWarningsInner) HasItemid() bool`

HasItemid returns a boolean if a field has been set.

### GetMessage

`func (o *CoreNotesGetNotes200ResponseWarningsInner) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *CoreNotesGetNotes200ResponseWarningsInner) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *CoreNotesGetNotes200ResponseWarningsInner) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *CoreNotesGetNotes200ResponseWarningsInner) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetWarningcode

`func (o *CoreNotesGetNotes200ResponseWarningsInner) GetWarningcode() string`

GetWarningcode returns the Warningcode field if non-nil, zero value otherwise.

### GetWarningcodeOk

`func (o *CoreNotesGetNotes200ResponseWarningsInner) GetWarningcodeOk() (*string, bool)`

GetWarningcodeOk returns a tuple with the Warningcode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarningcode

`func (o *CoreNotesGetNotes200ResponseWarningsInner) SetWarningcode(v string)`

SetWarningcode sets Warningcode field to given value.

### HasWarningcode

`func (o *CoreNotesGetNotes200ResponseWarningsInner) HasWarningcode() bool`

HasWarningcode returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


