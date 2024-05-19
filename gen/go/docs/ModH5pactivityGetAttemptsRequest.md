# ModH5pactivityGetAttemptsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**H5pactivityid** | **int32** | h5p activity instance id | [default to null]
**Userids** | Pointer to **[]map[string]interface{}** |  | [optional] 

## Methods

### NewModH5pactivityGetAttemptsRequest

`func NewModH5pactivityGetAttemptsRequest(h5pactivityid int32, ) *ModH5pactivityGetAttemptsRequest`

NewModH5pactivityGetAttemptsRequest instantiates a new ModH5pactivityGetAttemptsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModH5pactivityGetAttemptsRequestWithDefaults

`func NewModH5pactivityGetAttemptsRequestWithDefaults() *ModH5pactivityGetAttemptsRequest`

NewModH5pactivityGetAttemptsRequestWithDefaults instantiates a new ModH5pactivityGetAttemptsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetH5pactivityid

`func (o *ModH5pactivityGetAttemptsRequest) GetH5pactivityid() int32`

GetH5pactivityid returns the H5pactivityid field if non-nil, zero value otherwise.

### GetH5pactivityidOk

`func (o *ModH5pactivityGetAttemptsRequest) GetH5pactivityidOk() (*int32, bool)`

GetH5pactivityidOk returns a tuple with the H5pactivityid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetH5pactivityid

`func (o *ModH5pactivityGetAttemptsRequest) SetH5pactivityid(v int32)`

SetH5pactivityid sets H5pactivityid field to given value.


### GetUserids

`func (o *ModH5pactivityGetAttemptsRequest) GetUserids() []map[string]interface{}`

GetUserids returns the Userids field if non-nil, zero value otherwise.

### GetUseridsOk

`func (o *ModH5pactivityGetAttemptsRequest) GetUseridsOk() (*[]map[string]interface{}, bool)`

GetUseridsOk returns a tuple with the Userids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserids

`func (o *ModH5pactivityGetAttemptsRequest) SetUserids(v []map[string]interface{})`

SetUserids sets Userids field to given value.

### HasUserids

`func (o *ModH5pactivityGetAttemptsRequest) HasUserids() bool`

HasUserids returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


