# ModBigbluebuttonbnUpdateRecordingRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | **string** | The action to perform | [default to "null"]
**Additionaloptions** | **string** | Additional options | [default to "null"]
**Bigbluebuttonbnid** | **int32** | bigbluebuttonbn instance id, this might be a different one from the one set in recordingid in case of importing | [default to null]
**Recordingid** | **int32** | The moodle internal recording ID | [default to null]

## Methods

### NewModBigbluebuttonbnUpdateRecordingRequest

`func NewModBigbluebuttonbnUpdateRecordingRequest(action string, additionaloptions string, bigbluebuttonbnid int32, recordingid int32, ) *ModBigbluebuttonbnUpdateRecordingRequest`

NewModBigbluebuttonbnUpdateRecordingRequest instantiates a new ModBigbluebuttonbnUpdateRecordingRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModBigbluebuttonbnUpdateRecordingRequestWithDefaults

`func NewModBigbluebuttonbnUpdateRecordingRequestWithDefaults() *ModBigbluebuttonbnUpdateRecordingRequest`

NewModBigbluebuttonbnUpdateRecordingRequestWithDefaults instantiates a new ModBigbluebuttonbnUpdateRecordingRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAction

`func (o *ModBigbluebuttonbnUpdateRecordingRequest) GetAction() string`

GetAction returns the Action field if non-nil, zero value otherwise.

### GetActionOk

`func (o *ModBigbluebuttonbnUpdateRecordingRequest) GetActionOk() (*string, bool)`

GetActionOk returns a tuple with the Action field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAction

`func (o *ModBigbluebuttonbnUpdateRecordingRequest) SetAction(v string)`

SetAction sets Action field to given value.


### GetAdditionaloptions

`func (o *ModBigbluebuttonbnUpdateRecordingRequest) GetAdditionaloptions() string`

GetAdditionaloptions returns the Additionaloptions field if non-nil, zero value otherwise.

### GetAdditionaloptionsOk

`func (o *ModBigbluebuttonbnUpdateRecordingRequest) GetAdditionaloptionsOk() (*string, bool)`

GetAdditionaloptionsOk returns a tuple with the Additionaloptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionaloptions

`func (o *ModBigbluebuttonbnUpdateRecordingRequest) SetAdditionaloptions(v string)`

SetAdditionaloptions sets Additionaloptions field to given value.


### GetBigbluebuttonbnid

`func (o *ModBigbluebuttonbnUpdateRecordingRequest) GetBigbluebuttonbnid() int32`

GetBigbluebuttonbnid returns the Bigbluebuttonbnid field if non-nil, zero value otherwise.

### GetBigbluebuttonbnidOk

`func (o *ModBigbluebuttonbnUpdateRecordingRequest) GetBigbluebuttonbnidOk() (*int32, bool)`

GetBigbluebuttonbnidOk returns a tuple with the Bigbluebuttonbnid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBigbluebuttonbnid

`func (o *ModBigbluebuttonbnUpdateRecordingRequest) SetBigbluebuttonbnid(v int32)`

SetBigbluebuttonbnid sets Bigbluebuttonbnid field to given value.


### GetRecordingid

`func (o *ModBigbluebuttonbnUpdateRecordingRequest) GetRecordingid() int32`

GetRecordingid returns the Recordingid field if non-nil, zero value otherwise.

### GetRecordingidOk

`func (o *ModBigbluebuttonbnUpdateRecordingRequest) GetRecordingidOk() (*int32, bool)`

GetRecordingidOk returns a tuple with the Recordingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecordingid

`func (o *ModBigbluebuttonbnUpdateRecordingRequest) SetRecordingid(v int32)`

SetRecordingid sets Recordingid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


