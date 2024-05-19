# CoreMessageConfirmContactRequestRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Requesteduserid** | **int32** | The id of the user being requested | [default to null]
**Userid** | **int32** | The id of the user making the request | [default to null]

## Methods

### NewCoreMessageConfirmContactRequestRequest

`func NewCoreMessageConfirmContactRequestRequest(requesteduserid int32, userid int32, ) *CoreMessageConfirmContactRequestRequest`

NewCoreMessageConfirmContactRequestRequest instantiates a new CoreMessageConfirmContactRequestRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageConfirmContactRequestRequestWithDefaults

`func NewCoreMessageConfirmContactRequestRequestWithDefaults() *CoreMessageConfirmContactRequestRequest`

NewCoreMessageConfirmContactRequestRequestWithDefaults instantiates a new CoreMessageConfirmContactRequestRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRequesteduserid

`func (o *CoreMessageConfirmContactRequestRequest) GetRequesteduserid() int32`

GetRequesteduserid returns the Requesteduserid field if non-nil, zero value otherwise.

### GetRequesteduseridOk

`func (o *CoreMessageConfirmContactRequestRequest) GetRequesteduseridOk() (*int32, bool)`

GetRequesteduseridOk returns a tuple with the Requesteduserid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequesteduserid

`func (o *CoreMessageConfirmContactRequestRequest) SetRequesteduserid(v int32)`

SetRequesteduserid sets Requesteduserid field to given value.


### GetUserid

`func (o *CoreMessageConfirmContactRequestRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageConfirmContactRequestRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageConfirmContactRequestRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


