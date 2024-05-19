# ModBigbluebuttonbnGetRecordingsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bigbluebuttonbnid** | **int32** | bigbluebuttonbn instance id | 
**Groupid** | Pointer to **int32** | Group ID | [optional] [default to null]
**Tools** | Pointer to **string** | a set of enabled tools | [optional] [default to "protect,unprotect,publish,unpublish,delete"]

## Methods

### NewModBigbluebuttonbnGetRecordingsRequest

`func NewModBigbluebuttonbnGetRecordingsRequest(bigbluebuttonbnid int32, ) *ModBigbluebuttonbnGetRecordingsRequest`

NewModBigbluebuttonbnGetRecordingsRequest instantiates a new ModBigbluebuttonbnGetRecordingsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModBigbluebuttonbnGetRecordingsRequestWithDefaults

`func NewModBigbluebuttonbnGetRecordingsRequestWithDefaults() *ModBigbluebuttonbnGetRecordingsRequest`

NewModBigbluebuttonbnGetRecordingsRequestWithDefaults instantiates a new ModBigbluebuttonbnGetRecordingsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBigbluebuttonbnid

`func (o *ModBigbluebuttonbnGetRecordingsRequest) GetBigbluebuttonbnid() int32`

GetBigbluebuttonbnid returns the Bigbluebuttonbnid field if non-nil, zero value otherwise.

### GetBigbluebuttonbnidOk

`func (o *ModBigbluebuttonbnGetRecordingsRequest) GetBigbluebuttonbnidOk() (*int32, bool)`

GetBigbluebuttonbnidOk returns a tuple with the Bigbluebuttonbnid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBigbluebuttonbnid

`func (o *ModBigbluebuttonbnGetRecordingsRequest) SetBigbluebuttonbnid(v int32)`

SetBigbluebuttonbnid sets Bigbluebuttonbnid field to given value.


### GetGroupid

`func (o *ModBigbluebuttonbnGetRecordingsRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModBigbluebuttonbnGetRecordingsRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModBigbluebuttonbnGetRecordingsRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModBigbluebuttonbnGetRecordingsRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetTools

`func (o *ModBigbluebuttonbnGetRecordingsRequest) GetTools() string`

GetTools returns the Tools field if non-nil, zero value otherwise.

### GetToolsOk

`func (o *ModBigbluebuttonbnGetRecordingsRequest) GetToolsOk() (*string, bool)`

GetToolsOk returns a tuple with the Tools field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTools

`func (o *ModBigbluebuttonbnGetRecordingsRequest) SetTools(v string)`

SetTools sets Tools field to given value.

### HasTools

`func (o *ModBigbluebuttonbnGetRecordingsRequest) HasTools() bool`

HasTools returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


