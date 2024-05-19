# CoreMessageMessageProcessorConfigFormRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Formvalues** | [**[]CoreMessageMessageProcessorConfigFormRequestFormvaluesInner**](CoreMessageMessageProcessorConfigFormRequestFormvaluesInner.md) |  | 
**Name** | **string** | The name of the message processor | 
**Userid** | **int32** | id of the user, 0 for current user | 

## Methods

### NewCoreMessageMessageProcessorConfigFormRequest

`func NewCoreMessageMessageProcessorConfigFormRequest(formvalues []CoreMessageMessageProcessorConfigFormRequestFormvaluesInner, name string, userid int32, ) *CoreMessageMessageProcessorConfigFormRequest`

NewCoreMessageMessageProcessorConfigFormRequest instantiates a new CoreMessageMessageProcessorConfigFormRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageMessageProcessorConfigFormRequestWithDefaults

`func NewCoreMessageMessageProcessorConfigFormRequestWithDefaults() *CoreMessageMessageProcessorConfigFormRequest`

NewCoreMessageMessageProcessorConfigFormRequestWithDefaults instantiates a new CoreMessageMessageProcessorConfigFormRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFormvalues

`func (o *CoreMessageMessageProcessorConfigFormRequest) GetFormvalues() []CoreMessageMessageProcessorConfigFormRequestFormvaluesInner`

GetFormvalues returns the Formvalues field if non-nil, zero value otherwise.

### GetFormvaluesOk

`func (o *CoreMessageMessageProcessorConfigFormRequest) GetFormvaluesOk() (*[]CoreMessageMessageProcessorConfigFormRequestFormvaluesInner, bool)`

GetFormvaluesOk returns a tuple with the Formvalues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormvalues

`func (o *CoreMessageMessageProcessorConfigFormRequest) SetFormvalues(v []CoreMessageMessageProcessorConfigFormRequestFormvaluesInner)`

SetFormvalues sets Formvalues field to given value.


### GetName

`func (o *CoreMessageMessageProcessorConfigFormRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreMessageMessageProcessorConfigFormRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreMessageMessageProcessorConfigFormRequest) SetName(v string)`

SetName sets Name field to given value.


### GetUserid

`func (o *CoreMessageMessageProcessorConfigFormRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageMessageProcessorConfigFormRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageMessageProcessorConfigFormRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


