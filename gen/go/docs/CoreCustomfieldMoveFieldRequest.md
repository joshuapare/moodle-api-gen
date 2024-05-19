# CoreCustomfieldMoveFieldRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Beforeid** | Pointer to **int32** | Id of the field before which it needs to be moved | [optional] [default to 0]
**Categoryid** | **int32** | New parent category id | [default to null]
**Id** | **int32** | Id of the field to move | [default to null]

## Methods

### NewCoreCustomfieldMoveFieldRequest

`func NewCoreCustomfieldMoveFieldRequest(categoryid int32, id int32, ) *CoreCustomfieldMoveFieldRequest`

NewCoreCustomfieldMoveFieldRequest instantiates a new CoreCustomfieldMoveFieldRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCustomfieldMoveFieldRequestWithDefaults

`func NewCoreCustomfieldMoveFieldRequestWithDefaults() *CoreCustomfieldMoveFieldRequest`

NewCoreCustomfieldMoveFieldRequestWithDefaults instantiates a new CoreCustomfieldMoveFieldRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBeforeid

`func (o *CoreCustomfieldMoveFieldRequest) GetBeforeid() int32`

GetBeforeid returns the Beforeid field if non-nil, zero value otherwise.

### GetBeforeidOk

`func (o *CoreCustomfieldMoveFieldRequest) GetBeforeidOk() (*int32, bool)`

GetBeforeidOk returns a tuple with the Beforeid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeforeid

`func (o *CoreCustomfieldMoveFieldRequest) SetBeforeid(v int32)`

SetBeforeid sets Beforeid field to given value.

### HasBeforeid

`func (o *CoreCustomfieldMoveFieldRequest) HasBeforeid() bool`

HasBeforeid returns a boolean if a field has been set.

### GetCategoryid

`func (o *CoreCustomfieldMoveFieldRequest) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCustomfieldMoveFieldRequest) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCustomfieldMoveFieldRequest) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.


### GetId

`func (o *CoreCustomfieldMoveFieldRequest) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCustomfieldMoveFieldRequest) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCustomfieldMoveFieldRequest) SetId(v int32)`

SetId sets Id field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


