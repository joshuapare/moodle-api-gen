# ModAssignSubmitGradingFormRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignmentid** | **int32** | The assignment id to operate on | 
**Jsonformdata** | **string** | The data from the grading form, encoded as a json array | [default to "null"]
**Userid** | **int32** | The user id the submission belongs to | [default to null]

## Methods

### NewModAssignSubmitGradingFormRequest

`func NewModAssignSubmitGradingFormRequest(assignmentid int32, jsonformdata string, userid int32, ) *ModAssignSubmitGradingFormRequest`

NewModAssignSubmitGradingFormRequest instantiates a new ModAssignSubmitGradingFormRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignSubmitGradingFormRequestWithDefaults

`func NewModAssignSubmitGradingFormRequestWithDefaults() *ModAssignSubmitGradingFormRequest`

NewModAssignSubmitGradingFormRequestWithDefaults instantiates a new ModAssignSubmitGradingFormRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignmentid

`func (o *ModAssignSubmitGradingFormRequest) GetAssignmentid() int32`

GetAssignmentid returns the Assignmentid field if non-nil, zero value otherwise.

### GetAssignmentidOk

`func (o *ModAssignSubmitGradingFormRequest) GetAssignmentidOk() (*int32, bool)`

GetAssignmentidOk returns a tuple with the Assignmentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignmentid

`func (o *ModAssignSubmitGradingFormRequest) SetAssignmentid(v int32)`

SetAssignmentid sets Assignmentid field to given value.


### GetJsonformdata

`func (o *ModAssignSubmitGradingFormRequest) GetJsonformdata() string`

GetJsonformdata returns the Jsonformdata field if non-nil, zero value otherwise.

### GetJsonformdataOk

`func (o *ModAssignSubmitGradingFormRequest) GetJsonformdataOk() (*string, bool)`

GetJsonformdataOk returns a tuple with the Jsonformdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJsonformdata

`func (o *ModAssignSubmitGradingFormRequest) SetJsonformdata(v string)`

SetJsonformdata sets Jsonformdata field to given value.


### GetUserid

`func (o *ModAssignSubmitGradingFormRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModAssignSubmitGradingFormRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModAssignSubmitGradingFormRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


