# ModDataUpdateEntryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**[]ModDataUpdateEntryRequestDataInner**](ModDataUpdateEntryRequestDataInner.md) |  | 
**Entryid** | **int32** | The entry record id. | [default to null]

## Methods

### NewModDataUpdateEntryRequest

`func NewModDataUpdateEntryRequest(data []ModDataUpdateEntryRequestDataInner, entryid int32, ) *ModDataUpdateEntryRequest`

NewModDataUpdateEntryRequest instantiates a new ModDataUpdateEntryRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataUpdateEntryRequestWithDefaults

`func NewModDataUpdateEntryRequestWithDefaults() *ModDataUpdateEntryRequest`

NewModDataUpdateEntryRequestWithDefaults instantiates a new ModDataUpdateEntryRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ModDataUpdateEntryRequest) GetData() []ModDataUpdateEntryRequestDataInner`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ModDataUpdateEntryRequest) GetDataOk() (*[]ModDataUpdateEntryRequestDataInner, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ModDataUpdateEntryRequest) SetData(v []ModDataUpdateEntryRequestDataInner)`

SetData sets Data field to given value.


### GetEntryid

`func (o *ModDataUpdateEntryRequest) GetEntryid() int32`

GetEntryid returns the Entryid field if non-nil, zero value otherwise.

### GetEntryidOk

`func (o *ModDataUpdateEntryRequest) GetEntryidOk() (*int32, bool)`

GetEntryidOk returns a tuple with the Entryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntryid

`func (o *ModDataUpdateEntryRequest) SetEntryid(v int32)`

SetEntryid sets Entryid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


