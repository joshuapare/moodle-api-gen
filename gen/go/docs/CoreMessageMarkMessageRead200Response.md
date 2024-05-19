# CoreMessageMarkMessageRead200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messageid** | **int32** | the id of the message in the messages table | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreMessageMarkMessageRead200Response

`func NewCoreMessageMarkMessageRead200Response(messageid int32, ) *CoreMessageMarkMessageRead200Response`

NewCoreMessageMarkMessageRead200Response instantiates a new CoreMessageMarkMessageRead200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageMarkMessageRead200ResponseWithDefaults

`func NewCoreMessageMarkMessageRead200ResponseWithDefaults() *CoreMessageMarkMessageRead200Response`

NewCoreMessageMarkMessageRead200ResponseWithDefaults instantiates a new CoreMessageMarkMessageRead200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessageid

`func (o *CoreMessageMarkMessageRead200Response) GetMessageid() int32`

GetMessageid returns the Messageid field if non-nil, zero value otherwise.

### GetMessageidOk

`func (o *CoreMessageMarkMessageRead200Response) GetMessageidOk() (*int32, bool)`

GetMessageidOk returns a tuple with the Messageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageid

`func (o *CoreMessageMarkMessageRead200Response) SetMessageid(v int32)`

SetMessageid sets Messageid field to given value.


### GetWarnings

`func (o *CoreMessageMarkMessageRead200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreMessageMarkMessageRead200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreMessageMarkMessageRead200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreMessageMarkMessageRead200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


