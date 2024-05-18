# ModDataAddEntryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**[]ModDataAddEntryRequestDataInner**](ModDataAddEntryRequestDataInner.md) |  | 
**Databaseid** | **int32** | data instance id | [default to null]
**Groupid** | Pointer to **int32** | Group id, 0 means that the function will determine the user group | [optional] [default to 0]

## Methods

### NewModDataAddEntryRequest

`func NewModDataAddEntryRequest(data []ModDataAddEntryRequestDataInner, databaseid int32, ) *ModDataAddEntryRequest`

NewModDataAddEntryRequest instantiates a new ModDataAddEntryRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataAddEntryRequestWithDefaults

`func NewModDataAddEntryRequestWithDefaults() *ModDataAddEntryRequest`

NewModDataAddEntryRequestWithDefaults instantiates a new ModDataAddEntryRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ModDataAddEntryRequest) GetData() []ModDataAddEntryRequestDataInner`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ModDataAddEntryRequest) GetDataOk() (*[]ModDataAddEntryRequestDataInner, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ModDataAddEntryRequest) SetData(v []ModDataAddEntryRequestDataInner)`

SetData sets Data field to given value.


### GetDatabaseid

`func (o *ModDataAddEntryRequest) GetDatabaseid() int32`

GetDatabaseid returns the Databaseid field if non-nil, zero value otherwise.

### GetDatabaseidOk

`func (o *ModDataAddEntryRequest) GetDatabaseidOk() (*int32, bool)`

GetDatabaseidOk returns a tuple with the Databaseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatabaseid

`func (o *ModDataAddEntryRequest) SetDatabaseid(v int32)`

SetDatabaseid sets Databaseid field to given value.


### GetGroupid

`func (o *ModDataAddEntryRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModDataAddEntryRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModDataAddEntryRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModDataAddEntryRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


