# ModLtiCreateToolProxyRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Capabilityoffered** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Name** | Pointer to **string** | Tool proxy name | [optional] [default to ""]
**Regurl** | **string** | Tool proxy registration URL | [default to "null"]
**Serviceoffered** | Pointer to **[]map[string]interface{}** |  | [optional] 

## Methods

### NewModLtiCreateToolProxyRequest

`func NewModLtiCreateToolProxyRequest(regurl string, ) *ModLtiCreateToolProxyRequest`

NewModLtiCreateToolProxyRequest instantiates a new ModLtiCreateToolProxyRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLtiCreateToolProxyRequestWithDefaults

`func NewModLtiCreateToolProxyRequestWithDefaults() *ModLtiCreateToolProxyRequest`

NewModLtiCreateToolProxyRequestWithDefaults instantiates a new ModLtiCreateToolProxyRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCapabilityoffered

`func (o *ModLtiCreateToolProxyRequest) GetCapabilityoffered() []map[string]interface{}`

GetCapabilityoffered returns the Capabilityoffered field if non-nil, zero value otherwise.

### GetCapabilityofferedOk

`func (o *ModLtiCreateToolProxyRequest) GetCapabilityofferedOk() (*[]map[string]interface{}, bool)`

GetCapabilityofferedOk returns a tuple with the Capabilityoffered field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCapabilityoffered

`func (o *ModLtiCreateToolProxyRequest) SetCapabilityoffered(v []map[string]interface{})`

SetCapabilityoffered sets Capabilityoffered field to given value.

### HasCapabilityoffered

`func (o *ModLtiCreateToolProxyRequest) HasCapabilityoffered() bool`

HasCapabilityoffered returns a boolean if a field has been set.

### GetName

`func (o *ModLtiCreateToolProxyRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModLtiCreateToolProxyRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModLtiCreateToolProxyRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModLtiCreateToolProxyRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRegurl

`func (o *ModLtiCreateToolProxyRequest) GetRegurl() string`

GetRegurl returns the Regurl field if non-nil, zero value otherwise.

### GetRegurlOk

`func (o *ModLtiCreateToolProxyRequest) GetRegurlOk() (*string, bool)`

GetRegurlOk returns a tuple with the Regurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegurl

`func (o *ModLtiCreateToolProxyRequest) SetRegurl(v string)`

SetRegurl sets Regurl field to given value.


### GetServiceoffered

`func (o *ModLtiCreateToolProxyRequest) GetServiceoffered() []map[string]interface{}`

GetServiceoffered returns the Serviceoffered field if non-nil, zero value otherwise.

### GetServiceofferedOk

`func (o *ModLtiCreateToolProxyRequest) GetServiceofferedOk() (*[]map[string]interface{}, bool)`

GetServiceofferedOk returns a tuple with the Serviceoffered field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceoffered

`func (o *ModLtiCreateToolProxyRequest) SetServiceoffered(v []map[string]interface{})`

SetServiceoffered sets Serviceoffered field to given value.

### HasServiceoffered

`func (o *ModLtiCreateToolProxyRequest) HasServiceoffered() bool`

HasServiceoffered returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


