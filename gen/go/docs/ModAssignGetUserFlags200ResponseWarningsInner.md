# ModAssignGetUserFlags200ResponseWarningsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Item** | Pointer to **string** | item is always &#39;assignment&#39; | [optional] 
**Itemid** | Pointer to **int32** | when errorcode is 3 then itemid is an assignment id. When errorcode is 1, itemid is a course module id | [optional] 
**Message** | Pointer to **string** | untranslated english message to explain the warning | [optional] 
**Warningcode** | Pointer to **string** | errorcode can be 3 (no user flags found) or 1 (no permission to get user flags) | [optional] [default to "null"]

## Methods

### NewModAssignGetUserFlags200ResponseWarningsInner

`func NewModAssignGetUserFlags200ResponseWarningsInner() *ModAssignGetUserFlags200ResponseWarningsInner`

NewModAssignGetUserFlags200ResponseWarningsInner instantiates a new ModAssignGetUserFlags200ResponseWarningsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetUserFlags200ResponseWarningsInnerWithDefaults

`func NewModAssignGetUserFlags200ResponseWarningsInnerWithDefaults() *ModAssignGetUserFlags200ResponseWarningsInner`

NewModAssignGetUserFlags200ResponseWarningsInnerWithDefaults instantiates a new ModAssignGetUserFlags200ResponseWarningsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItem

`func (o *ModAssignGetUserFlags200ResponseWarningsInner) GetItem() string`

GetItem returns the Item field if non-nil, zero value otherwise.

### GetItemOk

`func (o *ModAssignGetUserFlags200ResponseWarningsInner) GetItemOk() (*string, bool)`

GetItemOk returns a tuple with the Item field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItem

`func (o *ModAssignGetUserFlags200ResponseWarningsInner) SetItem(v string)`

SetItem sets Item field to given value.

### HasItem

`func (o *ModAssignGetUserFlags200ResponseWarningsInner) HasItem() bool`

HasItem returns a boolean if a field has been set.

### GetItemid

`func (o *ModAssignGetUserFlags200ResponseWarningsInner) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *ModAssignGetUserFlags200ResponseWarningsInner) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *ModAssignGetUserFlags200ResponseWarningsInner) SetItemid(v int32)`

SetItemid sets Itemid field to given value.

### HasItemid

`func (o *ModAssignGetUserFlags200ResponseWarningsInner) HasItemid() bool`

HasItemid returns a boolean if a field has been set.

### GetMessage

`func (o *ModAssignGetUserFlags200ResponseWarningsInner) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ModAssignGetUserFlags200ResponseWarningsInner) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ModAssignGetUserFlags200ResponseWarningsInner) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *ModAssignGetUserFlags200ResponseWarningsInner) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetWarningcode

`func (o *ModAssignGetUserFlags200ResponseWarningsInner) GetWarningcode() string`

GetWarningcode returns the Warningcode field if non-nil, zero value otherwise.

### GetWarningcodeOk

`func (o *ModAssignGetUserFlags200ResponseWarningsInner) GetWarningcodeOk() (*string, bool)`

GetWarningcodeOk returns a tuple with the Warningcode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarningcode

`func (o *ModAssignGetUserFlags200ResponseWarningsInner) SetWarningcode(v string)`

SetWarningcode sets Warningcode field to given value.

### HasWarningcode

`func (o *ModAssignGetUserFlags200ResponseWarningsInner) HasWarningcode() bool`

HasWarningcode returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


