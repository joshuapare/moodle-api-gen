# CoreGroupGetGroupingsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Groupingids** | **[]map[string]interface{}** |  | 
**Returngroups** | Pointer to **bool** | return associated groups | [optional] [default to 0]

## Methods

### NewCoreGroupGetGroupingsRequest

`func NewCoreGroupGetGroupingsRequest(groupingids []map[string]interface{}, ) *CoreGroupGetGroupingsRequest`

NewCoreGroupGetGroupingsRequest instantiates a new CoreGroupGetGroupingsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGroupGetGroupingsRequestWithDefaults

`func NewCoreGroupGetGroupingsRequestWithDefaults() *CoreGroupGetGroupingsRequest`

NewCoreGroupGetGroupingsRequestWithDefaults instantiates a new CoreGroupGetGroupingsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGroupingids

`func (o *CoreGroupGetGroupingsRequest) GetGroupingids() []map[string]interface{}`

GetGroupingids returns the Groupingids field if non-nil, zero value otherwise.

### GetGroupingidsOk

`func (o *CoreGroupGetGroupingsRequest) GetGroupingidsOk() (*[]map[string]interface{}, bool)`

GetGroupingidsOk returns a tuple with the Groupingids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingids

`func (o *CoreGroupGetGroupingsRequest) SetGroupingids(v []map[string]interface{})`

SetGroupingids sets Groupingids field to given value.


### GetReturngroups

`func (o *CoreGroupGetGroupingsRequest) GetReturngroups() bool`

GetReturngroups returns the Returngroups field if non-nil, zero value otherwise.

### GetReturngroupsOk

`func (o *CoreGroupGetGroupingsRequest) GetReturngroupsOk() (*bool, bool)`

GetReturngroupsOk returns a tuple with the Returngroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReturngroups

`func (o *CoreGroupGetGroupingsRequest) SetReturngroups(v bool)`

SetReturngroups sets Returngroups field to given value.

### HasReturngroups

`func (o *CoreGroupGetGroupingsRequest) HasReturngroups() bool`

HasReturngroups returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


