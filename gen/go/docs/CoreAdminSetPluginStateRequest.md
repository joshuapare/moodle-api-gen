# CoreAdminSetPluginStateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Plugin** | **string** | The name of the plugin | 
**State** | **int32** | The target state | 

## Methods

### NewCoreAdminSetPluginStateRequest

`func NewCoreAdminSetPluginStateRequest(plugin string, state int32, ) *CoreAdminSetPluginStateRequest`

NewCoreAdminSetPluginStateRequest instantiates a new CoreAdminSetPluginStateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreAdminSetPluginStateRequestWithDefaults

`func NewCoreAdminSetPluginStateRequestWithDefaults() *CoreAdminSetPluginStateRequest`

NewCoreAdminSetPluginStateRequestWithDefaults instantiates a new CoreAdminSetPluginStateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPlugin

`func (o *CoreAdminSetPluginStateRequest) GetPlugin() string`

GetPlugin returns the Plugin field if non-nil, zero value otherwise.

### GetPluginOk

`func (o *CoreAdminSetPluginStateRequest) GetPluginOk() (*string, bool)`

GetPluginOk returns a tuple with the Plugin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlugin

`func (o *CoreAdminSetPluginStateRequest) SetPlugin(v string)`

SetPlugin sets Plugin field to given value.


### GetState

`func (o *CoreAdminSetPluginStateRequest) GetState() int32`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *CoreAdminSetPluginStateRequest) GetStateOk() (*int32, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *CoreAdminSetPluginStateRequest) SetState(v int32)`

SetState sets State field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


