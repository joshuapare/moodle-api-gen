# CoreChangeEditmodeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Context** | **int32** | Page context id | [default to null]
**Setmode** | **bool** | Set edit mode to | [default to null]

## Methods

### NewCoreChangeEditmodeRequest

`func NewCoreChangeEditmodeRequest(context int32, setmode bool, ) *CoreChangeEditmodeRequest`

NewCoreChangeEditmodeRequest instantiates a new CoreChangeEditmodeRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreChangeEditmodeRequestWithDefaults

`func NewCoreChangeEditmodeRequestWithDefaults() *CoreChangeEditmodeRequest`

NewCoreChangeEditmodeRequestWithDefaults instantiates a new CoreChangeEditmodeRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContext

`func (o *CoreChangeEditmodeRequest) GetContext() int32`

GetContext returns the Context field if non-nil, zero value otherwise.

### GetContextOk

`func (o *CoreChangeEditmodeRequest) GetContextOk() (*int32, bool)`

GetContextOk returns a tuple with the Context field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContext

`func (o *CoreChangeEditmodeRequest) SetContext(v int32)`

SetContext sets Context field to given value.


### GetSetmode

`func (o *CoreChangeEditmodeRequest) GetSetmode() bool`

GetSetmode returns the Setmode field if non-nil, zero value otherwise.

### GetSetmodeOk

`func (o *CoreChangeEditmodeRequest) GetSetmodeOk() (*bool, bool)`

GetSetmodeOk returns a tuple with the Setmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSetmode

`func (o *CoreChangeEditmodeRequest) SetSetmode(v bool)`

SetSetmode sets Setmode field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


