# CoreXapiPostStateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActivityId** | **string** | xAPI activity ID IRI | 
**Agent** | **string** | The xAPI agent json | 
**Component** | **string** | Component name | 
**Registration** | Pointer to **string** | The xAPI registration UUID | [optional] 
**StateData** | **string** | JSON object with the state data | [default to "null"]
**StateId** | **string** | The xAPI state ID | 

## Methods

### NewCoreXapiPostStateRequest

`func NewCoreXapiPostStateRequest(activityId string, agent string, component string, stateData string, stateId string, ) *CoreXapiPostStateRequest`

NewCoreXapiPostStateRequest instantiates a new CoreXapiPostStateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreXapiPostStateRequestWithDefaults

`func NewCoreXapiPostStateRequestWithDefaults() *CoreXapiPostStateRequest`

NewCoreXapiPostStateRequestWithDefaults instantiates a new CoreXapiPostStateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActivityId

`func (o *CoreXapiPostStateRequest) GetActivityId() string`

GetActivityId returns the ActivityId field if non-nil, zero value otherwise.

### GetActivityIdOk

`func (o *CoreXapiPostStateRequest) GetActivityIdOk() (*string, bool)`

GetActivityIdOk returns a tuple with the ActivityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivityId

`func (o *CoreXapiPostStateRequest) SetActivityId(v string)`

SetActivityId sets ActivityId field to given value.


### GetAgent

`func (o *CoreXapiPostStateRequest) GetAgent() string`

GetAgent returns the Agent field if non-nil, zero value otherwise.

### GetAgentOk

`func (o *CoreXapiPostStateRequest) GetAgentOk() (*string, bool)`

GetAgentOk returns a tuple with the Agent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgent

`func (o *CoreXapiPostStateRequest) SetAgent(v string)`

SetAgent sets Agent field to given value.


### GetComponent

`func (o *CoreXapiPostStateRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreXapiPostStateRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreXapiPostStateRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetRegistration

`func (o *CoreXapiPostStateRequest) GetRegistration() string`

GetRegistration returns the Registration field if non-nil, zero value otherwise.

### GetRegistrationOk

`func (o *CoreXapiPostStateRequest) GetRegistrationOk() (*string, bool)`

GetRegistrationOk returns a tuple with the Registration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegistration

`func (o *CoreXapiPostStateRequest) SetRegistration(v string)`

SetRegistration sets Registration field to given value.

### HasRegistration

`func (o *CoreXapiPostStateRequest) HasRegistration() bool`

HasRegistration returns a boolean if a field has been set.

### GetStateData

`func (o *CoreXapiPostStateRequest) GetStateData() string`

GetStateData returns the StateData field if non-nil, zero value otherwise.

### GetStateDataOk

`func (o *CoreXapiPostStateRequest) GetStateDataOk() (*string, bool)`

GetStateDataOk returns a tuple with the StateData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStateData

`func (o *CoreXapiPostStateRequest) SetStateData(v string)`

SetStateData sets StateData field to given value.


### GetStateId

`func (o *CoreXapiPostStateRequest) GetStateId() string`

GetStateId returns the StateId field if non-nil, zero value otherwise.

### GetStateIdOk

`func (o *CoreXapiPostStateRequest) GetStateIdOk() (*string, bool)`

GetStateIdOk returns a tuple with the StateId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStateId

`func (o *CoreXapiPostStateRequest) SetStateId(v string)`

SetStateId sets StateId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


