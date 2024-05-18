# CoreXapiGetStateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActivityId** | **string** | xAPI activity ID IRI | 
**Agent** | **string** | The xAPI agent json | 
**Component** | **string** | Component name | 
**Registration** | Pointer to **string** | The xAPI registration UUID | [optional] 
**StateId** | **string** | The xAPI state ID | 

## Methods

### NewCoreXapiGetStateRequest

`func NewCoreXapiGetStateRequest(activityId string, agent string, component string, stateId string, ) *CoreXapiGetStateRequest`

NewCoreXapiGetStateRequest instantiates a new CoreXapiGetStateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreXapiGetStateRequestWithDefaults

`func NewCoreXapiGetStateRequestWithDefaults() *CoreXapiGetStateRequest`

NewCoreXapiGetStateRequestWithDefaults instantiates a new CoreXapiGetStateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActivityId

`func (o *CoreXapiGetStateRequest) GetActivityId() string`

GetActivityId returns the ActivityId field if non-nil, zero value otherwise.

### GetActivityIdOk

`func (o *CoreXapiGetStateRequest) GetActivityIdOk() (*string, bool)`

GetActivityIdOk returns a tuple with the ActivityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivityId

`func (o *CoreXapiGetStateRequest) SetActivityId(v string)`

SetActivityId sets ActivityId field to given value.


### GetAgent

`func (o *CoreXapiGetStateRequest) GetAgent() string`

GetAgent returns the Agent field if non-nil, zero value otherwise.

### GetAgentOk

`func (o *CoreXapiGetStateRequest) GetAgentOk() (*string, bool)`

GetAgentOk returns a tuple with the Agent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgent

`func (o *CoreXapiGetStateRequest) SetAgent(v string)`

SetAgent sets Agent field to given value.


### GetComponent

`func (o *CoreXapiGetStateRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreXapiGetStateRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreXapiGetStateRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetRegistration

`func (o *CoreXapiGetStateRequest) GetRegistration() string`

GetRegistration returns the Registration field if non-nil, zero value otherwise.

### GetRegistrationOk

`func (o *CoreXapiGetStateRequest) GetRegistrationOk() (*string, bool)`

GetRegistrationOk returns a tuple with the Registration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegistration

`func (o *CoreXapiGetStateRequest) SetRegistration(v string)`

SetRegistration sets Registration field to given value.

### HasRegistration

`func (o *CoreXapiGetStateRequest) HasRegistration() bool`

HasRegistration returns a boolean if a field has been set.

### GetStateId

`func (o *CoreXapiGetStateRequest) GetStateId() string`

GetStateId returns the StateId field if non-nil, zero value otherwise.

### GetStateIdOk

`func (o *CoreXapiGetStateRequest) GetStateIdOk() (*string, bool)`

GetStateIdOk returns a tuple with the StateId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStateId

`func (o *CoreXapiGetStateRequest) SetStateId(v string)`

SetStateId sets StateId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


