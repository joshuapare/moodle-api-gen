# ModAssignGetAssignments200ResponseWarningsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Item** | Pointer to **string** | item can be &#39;course&#39; (errorcode 1 or 2) or &#39;module&#39; (errorcode 1) | [optional] [default to "null"]
**Itemid** | Pointer to **int32** | When item is a course then itemid is a course id. When the item is a module then itemid is a module id | [optional] [default to null]
**Message** | Pointer to **string** | untranslated english message to explain the warning | [optional] 
**Warningcode** | Pointer to **string** | errorcode can be 1 (no access rights) or 2 (not enrolled or no permissions) | [optional] [default to "null"]

## Methods

### NewModAssignGetAssignments200ResponseWarningsInner

`func NewModAssignGetAssignments200ResponseWarningsInner() *ModAssignGetAssignments200ResponseWarningsInner`

NewModAssignGetAssignments200ResponseWarningsInner instantiates a new ModAssignGetAssignments200ResponseWarningsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetAssignments200ResponseWarningsInnerWithDefaults

`func NewModAssignGetAssignments200ResponseWarningsInnerWithDefaults() *ModAssignGetAssignments200ResponseWarningsInner`

NewModAssignGetAssignments200ResponseWarningsInnerWithDefaults instantiates a new ModAssignGetAssignments200ResponseWarningsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItem

`func (o *ModAssignGetAssignments200ResponseWarningsInner) GetItem() string`

GetItem returns the Item field if non-nil, zero value otherwise.

### GetItemOk

`func (o *ModAssignGetAssignments200ResponseWarningsInner) GetItemOk() (*string, bool)`

GetItemOk returns a tuple with the Item field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItem

`func (o *ModAssignGetAssignments200ResponseWarningsInner) SetItem(v string)`

SetItem sets Item field to given value.

### HasItem

`func (o *ModAssignGetAssignments200ResponseWarningsInner) HasItem() bool`

HasItem returns a boolean if a field has been set.

### GetItemid

`func (o *ModAssignGetAssignments200ResponseWarningsInner) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *ModAssignGetAssignments200ResponseWarningsInner) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *ModAssignGetAssignments200ResponseWarningsInner) SetItemid(v int32)`

SetItemid sets Itemid field to given value.

### HasItemid

`func (o *ModAssignGetAssignments200ResponseWarningsInner) HasItemid() bool`

HasItemid returns a boolean if a field has been set.

### GetMessage

`func (o *ModAssignGetAssignments200ResponseWarningsInner) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ModAssignGetAssignments200ResponseWarningsInner) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ModAssignGetAssignments200ResponseWarningsInner) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *ModAssignGetAssignments200ResponseWarningsInner) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetWarningcode

`func (o *ModAssignGetAssignments200ResponseWarningsInner) GetWarningcode() string`

GetWarningcode returns the Warningcode field if non-nil, zero value otherwise.

### GetWarningcodeOk

`func (o *ModAssignGetAssignments200ResponseWarningsInner) GetWarningcodeOk() (*string, bool)`

GetWarningcodeOk returns a tuple with the Warningcode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarningcode

`func (o *ModAssignGetAssignments200ResponseWarningsInner) SetWarningcode(v string)`

SetWarningcode sets Warningcode field to given value.

### HasWarningcode

`func (o *ModAssignGetAssignments200ResponseWarningsInner) HasWarningcode() bool`

HasWarningcode returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


