# ModDataGetEntryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Entryid** | **int32** | record entry id | [default to null]
**Returncontents** | Pointer to **bool** | Whether to return contents or not. | [optional] [default to false]

## Methods

### NewModDataGetEntryRequest

`func NewModDataGetEntryRequest(entryid int32, ) *ModDataGetEntryRequest`

NewModDataGetEntryRequest instantiates a new ModDataGetEntryRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataGetEntryRequestWithDefaults

`func NewModDataGetEntryRequestWithDefaults() *ModDataGetEntryRequest`

NewModDataGetEntryRequestWithDefaults instantiates a new ModDataGetEntryRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntryid

`func (o *ModDataGetEntryRequest) GetEntryid() int32`

GetEntryid returns the Entryid field if non-nil, zero value otherwise.

### GetEntryidOk

`func (o *ModDataGetEntryRequest) GetEntryidOk() (*int32, bool)`

GetEntryidOk returns a tuple with the Entryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntryid

`func (o *ModDataGetEntryRequest) SetEntryid(v int32)`

SetEntryid sets Entryid field to given value.


### GetReturncontents

`func (o *ModDataGetEntryRequest) GetReturncontents() bool`

GetReturncontents returns the Returncontents field if non-nil, zero value otherwise.

### GetReturncontentsOk

`func (o *ModDataGetEntryRequest) GetReturncontentsOk() (*bool, bool)`

GetReturncontentsOk returns a tuple with the Returncontents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReturncontents

`func (o *ModDataGetEntryRequest) SetReturncontents(v bool)`

SetReturncontents sets Returncontents field to given value.

### HasReturncontents

`func (o *ModDataGetEntryRequest) HasReturncontents() bool`

HasReturncontents returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


