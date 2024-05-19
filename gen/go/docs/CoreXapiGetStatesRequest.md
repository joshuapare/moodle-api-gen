# CoreXapiGetStatesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActivityId** | **string** | xAPI activity ID IRI | 
**Agent** | **string** | The xAPI agent json | 
**Component** | **string** | Component name | 
**Registration** | Pointer to **string** | The xAPI registration UUID | [optional] 
**Since** | Pointer to **string** | Filter ids stored since the timestamp (exclusive) | [optional] [default to "null"]

## Methods

### NewCoreXapiGetStatesRequest

`func NewCoreXapiGetStatesRequest(activityId string, agent string, component string, ) *CoreXapiGetStatesRequest`

NewCoreXapiGetStatesRequest instantiates a new CoreXapiGetStatesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreXapiGetStatesRequestWithDefaults

`func NewCoreXapiGetStatesRequestWithDefaults() *CoreXapiGetStatesRequest`

NewCoreXapiGetStatesRequestWithDefaults instantiates a new CoreXapiGetStatesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActivityId

`func (o *CoreXapiGetStatesRequest) GetActivityId() string`

GetActivityId returns the ActivityId field if non-nil, zero value otherwise.

### GetActivityIdOk

`func (o *CoreXapiGetStatesRequest) GetActivityIdOk() (*string, bool)`

GetActivityIdOk returns a tuple with the ActivityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivityId

`func (o *CoreXapiGetStatesRequest) SetActivityId(v string)`

SetActivityId sets ActivityId field to given value.


### GetAgent

`func (o *CoreXapiGetStatesRequest) GetAgent() string`

GetAgent returns the Agent field if non-nil, zero value otherwise.

### GetAgentOk

`func (o *CoreXapiGetStatesRequest) GetAgentOk() (*string, bool)`

GetAgentOk returns a tuple with the Agent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgent

`func (o *CoreXapiGetStatesRequest) SetAgent(v string)`

SetAgent sets Agent field to given value.


### GetComponent

`func (o *CoreXapiGetStatesRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreXapiGetStatesRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreXapiGetStatesRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetRegistration

`func (o *CoreXapiGetStatesRequest) GetRegistration() string`

GetRegistration returns the Registration field if non-nil, zero value otherwise.

### GetRegistrationOk

`func (o *CoreXapiGetStatesRequest) GetRegistrationOk() (*string, bool)`

GetRegistrationOk returns a tuple with the Registration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegistration

`func (o *CoreXapiGetStatesRequest) SetRegistration(v string)`

SetRegistration sets Registration field to given value.

### HasRegistration

`func (o *CoreXapiGetStatesRequest) HasRegistration() bool`

HasRegistration returns a boolean if a field has been set.

### GetSince

`func (o *CoreXapiGetStatesRequest) GetSince() string`

GetSince returns the Since field if non-nil, zero value otherwise.

### GetSinceOk

`func (o *CoreXapiGetStatesRequest) GetSinceOk() (*string, bool)`

GetSinceOk returns a tuple with the Since field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSince

`func (o *CoreXapiGetStatesRequest) SetSince(v string)`

SetSince sets Since field to given value.

### HasSince

`func (o *CoreXapiGetStatesRequest) HasSince() bool`

HasSince returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


