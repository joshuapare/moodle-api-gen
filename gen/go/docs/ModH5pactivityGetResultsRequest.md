# ModH5pactivityGetResultsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attemptids** | Pointer to **[]map[string]interface{}** |  | [optional] 
**H5pactivityid** | **int32** | h5p activity instance id | 

## Methods

### NewModH5pactivityGetResultsRequest

`func NewModH5pactivityGetResultsRequest(h5pactivityid int32, ) *ModH5pactivityGetResultsRequest`

NewModH5pactivityGetResultsRequest instantiates a new ModH5pactivityGetResultsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModH5pactivityGetResultsRequestWithDefaults

`func NewModH5pactivityGetResultsRequestWithDefaults() *ModH5pactivityGetResultsRequest`

NewModH5pactivityGetResultsRequestWithDefaults instantiates a new ModH5pactivityGetResultsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttemptids

`func (o *ModH5pactivityGetResultsRequest) GetAttemptids() []map[string]interface{}`

GetAttemptids returns the Attemptids field if non-nil, zero value otherwise.

### GetAttemptidsOk

`func (o *ModH5pactivityGetResultsRequest) GetAttemptidsOk() (*[]map[string]interface{}, bool)`

GetAttemptidsOk returns a tuple with the Attemptids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptids

`func (o *ModH5pactivityGetResultsRequest) SetAttemptids(v []map[string]interface{})`

SetAttemptids sets Attemptids field to given value.

### HasAttemptids

`func (o *ModH5pactivityGetResultsRequest) HasAttemptids() bool`

HasAttemptids returns a boolean if a field has been set.

### GetH5pactivityid

`func (o *ModH5pactivityGetResultsRequest) GetH5pactivityid() int32`

GetH5pactivityid returns the H5pactivityid field if non-nil, zero value otherwise.

### GetH5pactivityidOk

`func (o *ModH5pactivityGetResultsRequest) GetH5pactivityidOk() (*int32, bool)`

GetH5pactivityidOk returns a tuple with the H5pactivityid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetH5pactivityid

`func (o *ModH5pactivityGetResultsRequest) SetH5pactivityid(v int32)`

SetH5pactivityid sets H5pactivityid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


