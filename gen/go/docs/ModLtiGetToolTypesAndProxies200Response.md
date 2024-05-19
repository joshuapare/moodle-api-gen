# ModLtiGetToolTypesAndProxies200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Limit** | Pointer to **int32** | Limit of how many tool types to show | [optional] [default to null]
**Offset** | Pointer to **int32** | Offset of tool types | [optional] [default to null]
**Proxies** | [**[]ModLtiGetToolTypesAndProxies200ResponseProxiesInner**](ModLtiGetToolTypesAndProxies200ResponseProxiesInner.md) |  | 
**Types** | [**[]ModLtiGetToolTypesAndProxies200ResponseTypesInner**](ModLtiGetToolTypesAndProxies200ResponseTypesInner.md) |  | 

## Methods

### NewModLtiGetToolTypesAndProxies200Response

`func NewModLtiGetToolTypesAndProxies200Response(proxies []ModLtiGetToolTypesAndProxies200ResponseProxiesInner, types []ModLtiGetToolTypesAndProxies200ResponseTypesInner, ) *ModLtiGetToolTypesAndProxies200Response`

NewModLtiGetToolTypesAndProxies200Response instantiates a new ModLtiGetToolTypesAndProxies200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLtiGetToolTypesAndProxies200ResponseWithDefaults

`func NewModLtiGetToolTypesAndProxies200ResponseWithDefaults() *ModLtiGetToolTypesAndProxies200Response`

NewModLtiGetToolTypesAndProxies200ResponseWithDefaults instantiates a new ModLtiGetToolTypesAndProxies200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLimit

`func (o *ModLtiGetToolTypesAndProxies200Response) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *ModLtiGetToolTypesAndProxies200Response) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *ModLtiGetToolTypesAndProxies200Response) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *ModLtiGetToolTypesAndProxies200Response) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOffset

`func (o *ModLtiGetToolTypesAndProxies200Response) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *ModLtiGetToolTypesAndProxies200Response) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *ModLtiGetToolTypesAndProxies200Response) SetOffset(v int32)`

SetOffset sets Offset field to given value.

### HasOffset

`func (o *ModLtiGetToolTypesAndProxies200Response) HasOffset() bool`

HasOffset returns a boolean if a field has been set.

### GetProxies

`func (o *ModLtiGetToolTypesAndProxies200Response) GetProxies() []ModLtiGetToolTypesAndProxies200ResponseProxiesInner`

GetProxies returns the Proxies field if non-nil, zero value otherwise.

### GetProxiesOk

`func (o *ModLtiGetToolTypesAndProxies200Response) GetProxiesOk() (*[]ModLtiGetToolTypesAndProxies200ResponseProxiesInner, bool)`

GetProxiesOk returns a tuple with the Proxies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProxies

`func (o *ModLtiGetToolTypesAndProxies200Response) SetProxies(v []ModLtiGetToolTypesAndProxies200ResponseProxiesInner)`

SetProxies sets Proxies field to given value.


### GetTypes

`func (o *ModLtiGetToolTypesAndProxies200Response) GetTypes() []ModLtiGetToolTypesAndProxies200ResponseTypesInner`

GetTypes returns the Types field if non-nil, zero value otherwise.

### GetTypesOk

`func (o *ModLtiGetToolTypesAndProxies200Response) GetTypesOk() (*[]ModLtiGetToolTypesAndProxies200ResponseTypesInner, bool)`

GetTypesOk returns a tuple with the Types field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypes

`func (o *ModLtiGetToolTypesAndProxies200Response) SetTypes(v []ModLtiGetToolTypesAndProxies200ResponseTypesInner)`

SetTypes sets Types field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


