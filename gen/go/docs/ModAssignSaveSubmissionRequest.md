# ModAssignSaveSubmissionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignmentid** | **int32** | The assignment id to operate on | 
**Plugindata** | [**ModAssignSaveSubmissionRequestPlugindata**](ModAssignSaveSubmissionRequestPlugindata.md) |  | 

## Methods

### NewModAssignSaveSubmissionRequest

`func NewModAssignSaveSubmissionRequest(assignmentid int32, plugindata ModAssignSaveSubmissionRequestPlugindata, ) *ModAssignSaveSubmissionRequest`

NewModAssignSaveSubmissionRequest instantiates a new ModAssignSaveSubmissionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignSaveSubmissionRequestWithDefaults

`func NewModAssignSaveSubmissionRequestWithDefaults() *ModAssignSaveSubmissionRequest`

NewModAssignSaveSubmissionRequestWithDefaults instantiates a new ModAssignSaveSubmissionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignmentid

`func (o *ModAssignSaveSubmissionRequest) GetAssignmentid() int32`

GetAssignmentid returns the Assignmentid field if non-nil, zero value otherwise.

### GetAssignmentidOk

`func (o *ModAssignSaveSubmissionRequest) GetAssignmentidOk() (*int32, bool)`

GetAssignmentidOk returns a tuple with the Assignmentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignmentid

`func (o *ModAssignSaveSubmissionRequest) SetAssignmentid(v int32)`

SetAssignmentid sets Assignmentid field to given value.


### GetPlugindata

`func (o *ModAssignSaveSubmissionRequest) GetPlugindata() ModAssignSaveSubmissionRequestPlugindata`

GetPlugindata returns the Plugindata field if non-nil, zero value otherwise.

### GetPlugindataOk

`func (o *ModAssignSaveSubmissionRequest) GetPlugindataOk() (*ModAssignSaveSubmissionRequestPlugindata, bool)`

GetPlugindataOk returns a tuple with the Plugindata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlugindata

`func (o *ModAssignSaveSubmissionRequest) SetPlugindata(v ModAssignSaveSubmissionRequestPlugindata)`

SetPlugindata sets Plugindata field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


