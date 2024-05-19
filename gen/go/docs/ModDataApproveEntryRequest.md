# ModDataApproveEntryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Approve** | Pointer to **bool** | Whether to approve (true) or unapprove the entry. | [optional] [default to true]
**Entryid** | **int32** | Record entry id. | [default to null]

## Methods

### NewModDataApproveEntryRequest

`func NewModDataApproveEntryRequest(entryid int32, ) *ModDataApproveEntryRequest`

NewModDataApproveEntryRequest instantiates a new ModDataApproveEntryRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataApproveEntryRequestWithDefaults

`func NewModDataApproveEntryRequestWithDefaults() *ModDataApproveEntryRequest`

NewModDataApproveEntryRequestWithDefaults instantiates a new ModDataApproveEntryRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetApprove

`func (o *ModDataApproveEntryRequest) GetApprove() bool`

GetApprove returns the Approve field if non-nil, zero value otherwise.

### GetApproveOk

`func (o *ModDataApproveEntryRequest) GetApproveOk() (*bool, bool)`

GetApproveOk returns a tuple with the Approve field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApprove

`func (o *ModDataApproveEntryRequest) SetApprove(v bool)`

SetApprove sets Approve field to given value.

### HasApprove

`func (o *ModDataApproveEntryRequest) HasApprove() bool`

HasApprove returns a boolean if a field has been set.

### GetEntryid

`func (o *ModDataApproveEntryRequest) GetEntryid() int32`

GetEntryid returns the Entryid field if non-nil, zero value otherwise.

### GetEntryidOk

`func (o *ModDataApproveEntryRequest) GetEntryidOk() (*int32, bool)`

GetEntryidOk returns a tuple with the Entryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntryid

`func (o *ModDataApproveEntryRequest) SetEntryid(v int32)`

SetEntryid sets Entryid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


