# CoreGroupCreateGroupsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Groups** | [**[]CoreGroupCreateGroupsRequestGroupsInner**](CoreGroupCreateGroupsRequestGroupsInner.md) |  | 

## Methods

### NewCoreGroupCreateGroupsRequest

`func NewCoreGroupCreateGroupsRequest(groups []CoreGroupCreateGroupsRequestGroupsInner, ) *CoreGroupCreateGroupsRequest`

NewCoreGroupCreateGroupsRequest instantiates a new CoreGroupCreateGroupsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGroupCreateGroupsRequestWithDefaults

`func NewCoreGroupCreateGroupsRequestWithDefaults() *CoreGroupCreateGroupsRequest`

NewCoreGroupCreateGroupsRequestWithDefaults instantiates a new CoreGroupCreateGroupsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGroups

`func (o *CoreGroupCreateGroupsRequest) GetGroups() []CoreGroupCreateGroupsRequestGroupsInner`

GetGroups returns the Groups field if non-nil, zero value otherwise.

### GetGroupsOk

`func (o *CoreGroupCreateGroupsRequest) GetGroupsOk() (*[]CoreGroupCreateGroupsRequestGroupsInner, bool)`

GetGroupsOk returns a tuple with the Groups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroups

`func (o *CoreGroupCreateGroupsRequest) SetGroups(v []CoreGroupCreateGroupsRequestGroupsInner)`

SetGroups sets Groups field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


