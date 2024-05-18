# CoreMessageGetMessageProcessorRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | The name of the message processor | [default to "null"]
**Userid** | **int32** | id of the user, 0 for current user | [default to null]

## Methods

### NewCoreMessageGetMessageProcessorRequest

`func NewCoreMessageGetMessageProcessorRequest(name string, userid int32, ) *CoreMessageGetMessageProcessorRequest`

NewCoreMessageGetMessageProcessorRequest instantiates a new CoreMessageGetMessageProcessorRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetMessageProcessorRequestWithDefaults

`func NewCoreMessageGetMessageProcessorRequestWithDefaults() *CoreMessageGetMessageProcessorRequest`

NewCoreMessageGetMessageProcessorRequestWithDefaults instantiates a new CoreMessageGetMessageProcessorRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *CoreMessageGetMessageProcessorRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreMessageGetMessageProcessorRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreMessageGetMessageProcessorRequest) SetName(v string)`

SetName sets Name field to given value.


### GetUserid

`func (o *CoreMessageGetMessageProcessorRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageGetMessageProcessorRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageGetMessageProcessorRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


