# CoreXapiDeleteStatesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActivityId** | **string** | xAPI activity ID IRI | 
**Agent** | **string** | The xAPI agent json | 
**Component** | **string** | Component name | 
**Registration** | Pointer to **string** | The xAPI registration UUID | [optional] 

## Methods

### NewCoreXapiDeleteStatesRequest

`func NewCoreXapiDeleteStatesRequest(activityId string, agent string, component string, ) *CoreXapiDeleteStatesRequest`

NewCoreXapiDeleteStatesRequest instantiates a new CoreXapiDeleteStatesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreXapiDeleteStatesRequestWithDefaults

`func NewCoreXapiDeleteStatesRequestWithDefaults() *CoreXapiDeleteStatesRequest`

NewCoreXapiDeleteStatesRequestWithDefaults instantiates a new CoreXapiDeleteStatesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActivityId

`func (o *CoreXapiDeleteStatesRequest) GetActivityId() string`

GetActivityId returns the ActivityId field if non-nil, zero value otherwise.

### GetActivityIdOk

`func (o *CoreXapiDeleteStatesRequest) GetActivityIdOk() (*string, bool)`

GetActivityIdOk returns a tuple with the ActivityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivityId

`func (o *CoreXapiDeleteStatesRequest) SetActivityId(v string)`

SetActivityId sets ActivityId field to given value.


### GetAgent

`func (o *CoreXapiDeleteStatesRequest) GetAgent() string`

GetAgent returns the Agent field if non-nil, zero value otherwise.

### GetAgentOk

`func (o *CoreXapiDeleteStatesRequest) GetAgentOk() (*string, bool)`

GetAgentOk returns a tuple with the Agent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgent

`func (o *CoreXapiDeleteStatesRequest) SetAgent(v string)`

SetAgent sets Agent field to given value.


### GetComponent

`func (o *CoreXapiDeleteStatesRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreXapiDeleteStatesRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreXapiDeleteStatesRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetRegistration

`func (o *CoreXapiDeleteStatesRequest) GetRegistration() string`

GetRegistration returns the Registration field if non-nil, zero value otherwise.

### GetRegistrationOk

`func (o *CoreXapiDeleteStatesRequest) GetRegistrationOk() (*string, bool)`

GetRegistrationOk returns a tuple with the Registration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegistration

`func (o *CoreXapiDeleteStatesRequest) SetRegistration(v string)`

SetRegistration sets Registration field to given value.

### HasRegistration

`func (o *CoreXapiDeleteStatesRequest) HasRegistration() bool`

HasRegistration returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


