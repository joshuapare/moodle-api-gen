# CoreQuestionUpdateFlagRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Checksum** | **string** | computed checksum with the last three arguments and                              the users username | [default to "null"]
**Newstate** | **bool** | the new state of the flag. true &#x3D; flagged | [default to null]
**Qaid** | **int32** | the question_attempt id | [default to null]
**Qubaid** | **int32** | the question usage id. | [default to null]
**Questionid** | **int32** | the question id | [default to null]
**Slot** | **int32** | the slot number within the usage | [default to null]

## Methods

### NewCoreQuestionUpdateFlagRequest

`func NewCoreQuestionUpdateFlagRequest(checksum string, newstate bool, qaid int32, qubaid int32, questionid int32, slot int32, ) *CoreQuestionUpdateFlagRequest`

NewCoreQuestionUpdateFlagRequest instantiates a new CoreQuestionUpdateFlagRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreQuestionUpdateFlagRequestWithDefaults

`func NewCoreQuestionUpdateFlagRequestWithDefaults() *CoreQuestionUpdateFlagRequest`

NewCoreQuestionUpdateFlagRequestWithDefaults instantiates a new CoreQuestionUpdateFlagRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChecksum

`func (o *CoreQuestionUpdateFlagRequest) GetChecksum() string`

GetChecksum returns the Checksum field if non-nil, zero value otherwise.

### GetChecksumOk

`func (o *CoreQuestionUpdateFlagRequest) GetChecksumOk() (*string, bool)`

GetChecksumOk returns a tuple with the Checksum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChecksum

`func (o *CoreQuestionUpdateFlagRequest) SetChecksum(v string)`

SetChecksum sets Checksum field to given value.


### GetNewstate

`func (o *CoreQuestionUpdateFlagRequest) GetNewstate() bool`

GetNewstate returns the Newstate field if non-nil, zero value otherwise.

### GetNewstateOk

`func (o *CoreQuestionUpdateFlagRequest) GetNewstateOk() (*bool, bool)`

GetNewstateOk returns a tuple with the Newstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewstate

`func (o *CoreQuestionUpdateFlagRequest) SetNewstate(v bool)`

SetNewstate sets Newstate field to given value.


### GetQaid

`func (o *CoreQuestionUpdateFlagRequest) GetQaid() int32`

GetQaid returns the Qaid field if non-nil, zero value otherwise.

### GetQaidOk

`func (o *CoreQuestionUpdateFlagRequest) GetQaidOk() (*int32, bool)`

GetQaidOk returns a tuple with the Qaid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQaid

`func (o *CoreQuestionUpdateFlagRequest) SetQaid(v int32)`

SetQaid sets Qaid field to given value.


### GetQubaid

`func (o *CoreQuestionUpdateFlagRequest) GetQubaid() int32`

GetQubaid returns the Qubaid field if non-nil, zero value otherwise.

### GetQubaidOk

`func (o *CoreQuestionUpdateFlagRequest) GetQubaidOk() (*int32, bool)`

GetQubaidOk returns a tuple with the Qubaid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQubaid

`func (o *CoreQuestionUpdateFlagRequest) SetQubaid(v int32)`

SetQubaid sets Qubaid field to given value.


### GetQuestionid

`func (o *CoreQuestionUpdateFlagRequest) GetQuestionid() int32`

GetQuestionid returns the Questionid field if non-nil, zero value otherwise.

### GetQuestionidOk

`func (o *CoreQuestionUpdateFlagRequest) GetQuestionidOk() (*int32, bool)`

GetQuestionidOk returns a tuple with the Questionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestionid

`func (o *CoreQuestionUpdateFlagRequest) SetQuestionid(v int32)`

SetQuestionid sets Questionid field to given value.


### GetSlot

`func (o *CoreQuestionUpdateFlagRequest) GetSlot() int32`

GetSlot returns the Slot field if non-nil, zero value otherwise.

### GetSlotOk

`func (o *CoreQuestionUpdateFlagRequest) GetSlotOk() (*int32, bool)`

GetSlotOk returns a tuple with the Slot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlot

`func (o *CoreQuestionUpdateFlagRequest) SetSlot(v int32)`

SetSlot sets Slot field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


