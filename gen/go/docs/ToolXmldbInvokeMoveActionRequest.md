# ToolXmldbInvokeMoveActionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | **string** | Action | [default to "null"]
**Dir** | **string** | Plugin that is being edited | [default to "null"]
**Field** | Pointer to **string** | Field name | [optional] [default to ""]
**Index** | Pointer to **string** | Index name | [optional] [default to ""]
**Key** | Pointer to **string** | Key name | [optional] [default to ""]
**Position** | **int32** | How many positions to move by (negative - up, positive - down) | [default to null]
**Table** | **string** | Table name | [default to "null"]

## Methods

### NewToolXmldbInvokeMoveActionRequest

`func NewToolXmldbInvokeMoveActionRequest(action string, dir string, position int32, table string, ) *ToolXmldbInvokeMoveActionRequest`

NewToolXmldbInvokeMoveActionRequest instantiates a new ToolXmldbInvokeMoveActionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolXmldbInvokeMoveActionRequestWithDefaults

`func NewToolXmldbInvokeMoveActionRequestWithDefaults() *ToolXmldbInvokeMoveActionRequest`

NewToolXmldbInvokeMoveActionRequestWithDefaults instantiates a new ToolXmldbInvokeMoveActionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAction

`func (o *ToolXmldbInvokeMoveActionRequest) GetAction() string`

GetAction returns the Action field if non-nil, zero value otherwise.

### GetActionOk

`func (o *ToolXmldbInvokeMoveActionRequest) GetActionOk() (*string, bool)`

GetActionOk returns a tuple with the Action field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAction

`func (o *ToolXmldbInvokeMoveActionRequest) SetAction(v string)`

SetAction sets Action field to given value.


### GetDir

`func (o *ToolXmldbInvokeMoveActionRequest) GetDir() string`

GetDir returns the Dir field if non-nil, zero value otherwise.

### GetDirOk

`func (o *ToolXmldbInvokeMoveActionRequest) GetDirOk() (*string, bool)`

GetDirOk returns a tuple with the Dir field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDir

`func (o *ToolXmldbInvokeMoveActionRequest) SetDir(v string)`

SetDir sets Dir field to given value.


### GetField

`func (o *ToolXmldbInvokeMoveActionRequest) GetField() string`

GetField returns the Field field if non-nil, zero value otherwise.

### GetFieldOk

`func (o *ToolXmldbInvokeMoveActionRequest) GetFieldOk() (*string, bool)`

GetFieldOk returns a tuple with the Field field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetField

`func (o *ToolXmldbInvokeMoveActionRequest) SetField(v string)`

SetField sets Field field to given value.

### HasField

`func (o *ToolXmldbInvokeMoveActionRequest) HasField() bool`

HasField returns a boolean if a field has been set.

### GetIndex

`func (o *ToolXmldbInvokeMoveActionRequest) GetIndex() string`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *ToolXmldbInvokeMoveActionRequest) GetIndexOk() (*string, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *ToolXmldbInvokeMoveActionRequest) SetIndex(v string)`

SetIndex sets Index field to given value.

### HasIndex

`func (o *ToolXmldbInvokeMoveActionRequest) HasIndex() bool`

HasIndex returns a boolean if a field has been set.

### GetKey

`func (o *ToolXmldbInvokeMoveActionRequest) GetKey() string`

GetKey returns the Key field if non-nil, zero value otherwise.

### GetKeyOk

`func (o *ToolXmldbInvokeMoveActionRequest) GetKeyOk() (*string, bool)`

GetKeyOk returns a tuple with the Key field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKey

`func (o *ToolXmldbInvokeMoveActionRequest) SetKey(v string)`

SetKey sets Key field to given value.

### HasKey

`func (o *ToolXmldbInvokeMoveActionRequest) HasKey() bool`

HasKey returns a boolean if a field has been set.

### GetPosition

`func (o *ToolXmldbInvokeMoveActionRequest) GetPosition() int32`

GetPosition returns the Position field if non-nil, zero value otherwise.

### GetPositionOk

`func (o *ToolXmldbInvokeMoveActionRequest) GetPositionOk() (*int32, bool)`

GetPositionOk returns a tuple with the Position field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPosition

`func (o *ToolXmldbInvokeMoveActionRequest) SetPosition(v int32)`

SetPosition sets Position field to given value.


### GetTable

`func (o *ToolXmldbInvokeMoveActionRequest) GetTable() string`

GetTable returns the Table field if non-nil, zero value otherwise.

### GetTableOk

`func (o *ToolXmldbInvokeMoveActionRequest) GetTableOk() (*string, bool)`

GetTableOk returns a tuple with the Table field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTable

`func (o *ToolXmldbInvokeMoveActionRequest) SetTable(v string)`

SetTable sets Table field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


