# CoreCustomfieldMoveCategoryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Beforeid** | Pointer to **int32** | Id of the category before which it needs to be moved | [optional] [default to 0]
**Id** | **int32** | Category ID to move | [default to null]

## Methods

### NewCoreCustomfieldMoveCategoryRequest

`func NewCoreCustomfieldMoveCategoryRequest(id int32, ) *CoreCustomfieldMoveCategoryRequest`

NewCoreCustomfieldMoveCategoryRequest instantiates a new CoreCustomfieldMoveCategoryRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCustomfieldMoveCategoryRequestWithDefaults

`func NewCoreCustomfieldMoveCategoryRequestWithDefaults() *CoreCustomfieldMoveCategoryRequest`

NewCoreCustomfieldMoveCategoryRequestWithDefaults instantiates a new CoreCustomfieldMoveCategoryRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBeforeid

`func (o *CoreCustomfieldMoveCategoryRequest) GetBeforeid() int32`

GetBeforeid returns the Beforeid field if non-nil, zero value otherwise.

### GetBeforeidOk

`func (o *CoreCustomfieldMoveCategoryRequest) GetBeforeidOk() (*int32, bool)`

GetBeforeidOk returns a tuple with the Beforeid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeforeid

`func (o *CoreCustomfieldMoveCategoryRequest) SetBeforeid(v int32)`

SetBeforeid sets Beforeid field to given value.

### HasBeforeid

`func (o *CoreCustomfieldMoveCategoryRequest) HasBeforeid() bool`

HasBeforeid returns a boolean if a field has been set.

### GetId

`func (o *CoreCustomfieldMoveCategoryRequest) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCustomfieldMoveCategoryRequest) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCustomfieldMoveCategoryRequest) SetId(v int32)`

SetId sets Id field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


