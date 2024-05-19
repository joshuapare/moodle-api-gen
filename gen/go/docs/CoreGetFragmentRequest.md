# CoreGetFragmentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Args** | Pointer to [**[]CoreGetFragmentRequestArgsInner**](CoreGetFragmentRequestArgsInner.md) |  | [optional] 
**Callback** | **string** | Name of the callback to execute | [default to "null"]
**Component** | **string** | Component for the callback e.g. mod_assign | [default to "null"]
**Contextid** | **int32** | Context ID that the fragment is from | [default to null]

## Methods

### NewCoreGetFragmentRequest

`func NewCoreGetFragmentRequest(callback string, component string, contextid int32, ) *CoreGetFragmentRequest`

NewCoreGetFragmentRequest instantiates a new CoreGetFragmentRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGetFragmentRequestWithDefaults

`func NewCoreGetFragmentRequestWithDefaults() *CoreGetFragmentRequest`

NewCoreGetFragmentRequestWithDefaults instantiates a new CoreGetFragmentRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetArgs

`func (o *CoreGetFragmentRequest) GetArgs() []CoreGetFragmentRequestArgsInner`

GetArgs returns the Args field if non-nil, zero value otherwise.

### GetArgsOk

`func (o *CoreGetFragmentRequest) GetArgsOk() (*[]CoreGetFragmentRequestArgsInner, bool)`

GetArgsOk returns a tuple with the Args field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArgs

`func (o *CoreGetFragmentRequest) SetArgs(v []CoreGetFragmentRequestArgsInner)`

SetArgs sets Args field to given value.

### HasArgs

`func (o *CoreGetFragmentRequest) HasArgs() bool`

HasArgs returns a boolean if a field has been set.

### GetCallback

`func (o *CoreGetFragmentRequest) GetCallback() string`

GetCallback returns the Callback field if non-nil, zero value otherwise.

### GetCallbackOk

`func (o *CoreGetFragmentRequest) GetCallbackOk() (*string, bool)`

GetCallbackOk returns a tuple with the Callback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCallback

`func (o *CoreGetFragmentRequest) SetCallback(v string)`

SetCallback sets Callback field to given value.


### GetComponent

`func (o *CoreGetFragmentRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreGetFragmentRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreGetFragmentRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetContextid

`func (o *CoreGetFragmentRequest) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreGetFragmentRequest) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreGetFragmentRequest) SetContextid(v int32)`

SetContextid sets Contextid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


