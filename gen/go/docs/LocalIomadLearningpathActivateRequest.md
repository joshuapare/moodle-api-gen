# LocalIomadLearningpathActivateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pathid** | **int32** | ID of Learning Path | [default to null]
**State** | **int32** | Active (1) / deactivate (0) | [default to null]

## Methods

### NewLocalIomadLearningpathActivateRequest

`func NewLocalIomadLearningpathActivateRequest(pathid int32, state int32, ) *LocalIomadLearningpathActivateRequest`

NewLocalIomadLearningpathActivateRequest instantiates a new LocalIomadLearningpathActivateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalIomadLearningpathActivateRequestWithDefaults

`func NewLocalIomadLearningpathActivateRequestWithDefaults() *LocalIomadLearningpathActivateRequest`

NewLocalIomadLearningpathActivateRequestWithDefaults instantiates a new LocalIomadLearningpathActivateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPathid

`func (o *LocalIomadLearningpathActivateRequest) GetPathid() int32`

GetPathid returns the Pathid field if non-nil, zero value otherwise.

### GetPathidOk

`func (o *LocalIomadLearningpathActivateRequest) GetPathidOk() (*int32, bool)`

GetPathidOk returns a tuple with the Pathid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPathid

`func (o *LocalIomadLearningpathActivateRequest) SetPathid(v int32)`

SetPathid sets Pathid field to given value.


### GetState

`func (o *LocalIomadLearningpathActivateRequest) GetState() int32`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *LocalIomadLearningpathActivateRequest) GetStateOk() (*int32, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *LocalIomadLearningpathActivateRequest) SetState(v int32)`

SetState sets State field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


