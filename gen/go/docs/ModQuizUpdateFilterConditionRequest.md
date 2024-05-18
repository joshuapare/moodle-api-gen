# ModQuizUpdateFilterConditionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cmid** | **int32** | The cmid of the quiz | 
**Filtercondition** | **string** | Filter condition | [default to "null"]
**Slotid** | **int32** | The quiz slot ID for the random question. | [default to null]

## Methods

### NewModQuizUpdateFilterConditionRequest

`func NewModQuizUpdateFilterConditionRequest(cmid int32, filtercondition string, slotid int32, ) *ModQuizUpdateFilterConditionRequest`

NewModQuizUpdateFilterConditionRequest instantiates a new ModQuizUpdateFilterConditionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizUpdateFilterConditionRequestWithDefaults

`func NewModQuizUpdateFilterConditionRequestWithDefaults() *ModQuizUpdateFilterConditionRequest`

NewModQuizUpdateFilterConditionRequestWithDefaults instantiates a new ModQuizUpdateFilterConditionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCmid

`func (o *ModQuizUpdateFilterConditionRequest) GetCmid() int32`

GetCmid returns the Cmid field if non-nil, zero value otherwise.

### GetCmidOk

`func (o *ModQuizUpdateFilterConditionRequest) GetCmidOk() (*int32, bool)`

GetCmidOk returns a tuple with the Cmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmid

`func (o *ModQuizUpdateFilterConditionRequest) SetCmid(v int32)`

SetCmid sets Cmid field to given value.


### GetFiltercondition

`func (o *ModQuizUpdateFilterConditionRequest) GetFiltercondition() string`

GetFiltercondition returns the Filtercondition field if non-nil, zero value otherwise.

### GetFilterconditionOk

`func (o *ModQuizUpdateFilterConditionRequest) GetFilterconditionOk() (*string, bool)`

GetFilterconditionOk returns a tuple with the Filtercondition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiltercondition

`func (o *ModQuizUpdateFilterConditionRequest) SetFiltercondition(v string)`

SetFiltercondition sets Filtercondition field to given value.


### GetSlotid

`func (o *ModQuizUpdateFilterConditionRequest) GetSlotid() int32`

GetSlotid returns the Slotid field if non-nil, zero value otherwise.

### GetSlotidOk

`func (o *ModQuizUpdateFilterConditionRequest) GetSlotidOk() (*int32, bool)`

GetSlotidOk returns a tuple with the Slotid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlotid

`func (o *ModQuizUpdateFilterConditionRequest) SetSlotid(v int32)`

SetSlotid sets Slotid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


