# CoreAdminSetPluginOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Direction** | **int32** | The direction to move | [default to null]
**Plugin** | **string** | The name of the plugin | 

## Methods

### NewCoreAdminSetPluginOrderRequest

`func NewCoreAdminSetPluginOrderRequest(direction int32, plugin string, ) *CoreAdminSetPluginOrderRequest`

NewCoreAdminSetPluginOrderRequest instantiates a new CoreAdminSetPluginOrderRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreAdminSetPluginOrderRequestWithDefaults

`func NewCoreAdminSetPluginOrderRequestWithDefaults() *CoreAdminSetPluginOrderRequest`

NewCoreAdminSetPluginOrderRequestWithDefaults instantiates a new CoreAdminSetPluginOrderRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDirection

`func (o *CoreAdminSetPluginOrderRequest) GetDirection() int32`

GetDirection returns the Direction field if non-nil, zero value otherwise.

### GetDirectionOk

`func (o *CoreAdminSetPluginOrderRequest) GetDirectionOk() (*int32, bool)`

GetDirectionOk returns a tuple with the Direction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDirection

`func (o *CoreAdminSetPluginOrderRequest) SetDirection(v int32)`

SetDirection sets Direction field to given value.


### GetPlugin

`func (o *CoreAdminSetPluginOrderRequest) GetPlugin() string`

GetPlugin returns the Plugin field if non-nil, zero value otherwise.

### GetPluginOk

`func (o *CoreAdminSetPluginOrderRequest) GetPluginOk() (*string, bool)`

GetPluginOk returns a tuple with the Plugin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlugin

`func (o *CoreAdminSetPluginOrderRequest) SetPlugin(v string)`

SetPlugin sets Plugin field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


