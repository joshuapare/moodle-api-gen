# CoreXapiDeleteStateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActivityId** | **string** | xAPI activity ID IRI | [default to "null"]
**Agent** | **string** | The xAPI agent json | [default to "null"]
**Component** | **string** | Component name | [default to "null"]
**Registration** | Pointer to **string** | The xAPI registration UUID | [optional] [default to "null"]
**StateId** | **string** | The xAPI state ID | [default to "null"]

## Methods

### NewCoreXapiDeleteStateRequest

`func NewCoreXapiDeleteStateRequest(activityId string, agent string, component string, stateId string, ) *CoreXapiDeleteStateRequest`

NewCoreXapiDeleteStateRequest instantiates a new CoreXapiDeleteStateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreXapiDeleteStateRequestWithDefaults

`func NewCoreXapiDeleteStateRequestWithDefaults() *CoreXapiDeleteStateRequest`

NewCoreXapiDeleteStateRequestWithDefaults instantiates a new CoreXapiDeleteStateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActivityId

`func (o *CoreXapiDeleteStateRequest) GetActivityId() string`

GetActivityId returns the ActivityId field if non-nil, zero value otherwise.

### GetActivityIdOk

`func (o *CoreXapiDeleteStateRequest) GetActivityIdOk() (*string, bool)`

GetActivityIdOk returns a tuple with the ActivityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivityId

`func (o *CoreXapiDeleteStateRequest) SetActivityId(v string)`

SetActivityId sets ActivityId field to given value.


### GetAgent

`func (o *CoreXapiDeleteStateRequest) GetAgent() string`

GetAgent returns the Agent field if non-nil, zero value otherwise.

### GetAgentOk

`func (o *CoreXapiDeleteStateRequest) GetAgentOk() (*string, bool)`

GetAgentOk returns a tuple with the Agent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgent

`func (o *CoreXapiDeleteStateRequest) SetAgent(v string)`

SetAgent sets Agent field to given value.


### GetComponent

`func (o *CoreXapiDeleteStateRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreXapiDeleteStateRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreXapiDeleteStateRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetRegistration

`func (o *CoreXapiDeleteStateRequest) GetRegistration() string`

GetRegistration returns the Registration field if non-nil, zero value otherwise.

### GetRegistrationOk

`func (o *CoreXapiDeleteStateRequest) GetRegistrationOk() (*string, bool)`

GetRegistrationOk returns a tuple with the Registration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegistration

`func (o *CoreXapiDeleteStateRequest) SetRegistration(v string)`

SetRegistration sets Registration field to given value.

### HasRegistration

`func (o *CoreXapiDeleteStateRequest) HasRegistration() bool`

HasRegistration returns a boolean if a field has been set.

### GetStateId

`func (o *CoreXapiDeleteStateRequest) GetStateId() string`

GetStateId returns the StateId field if non-nil, zero value otherwise.

### GetStateIdOk

`func (o *CoreXapiDeleteStateRequest) GetStateIdOk() (*string, bool)`

GetStateIdOk returns a tuple with the StateId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStateId

`func (o *CoreXapiDeleteStateRequest) SetStateId(v string)`

SetStateId sets StateId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


