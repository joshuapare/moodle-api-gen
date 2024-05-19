# CoreGroupGetActivityAllowedGroups200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canaccessallgroups** | Pointer to **bool** | Whether the user will be able to access all the activity groups. | [optional] [default to null]
**Groups** | [**[]CoreGroupGetActivityAllowedGroups200ResponseGroupsInner**](CoreGroupGetActivityAllowedGroups200ResponseGroupsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreGroupGetActivityAllowedGroups200Response

`func NewCoreGroupGetActivityAllowedGroups200Response(groups []CoreGroupGetActivityAllowedGroups200ResponseGroupsInner, ) *CoreGroupGetActivityAllowedGroups200Response`

NewCoreGroupGetActivityAllowedGroups200Response instantiates a new CoreGroupGetActivityAllowedGroups200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGroupGetActivityAllowedGroups200ResponseWithDefaults

`func NewCoreGroupGetActivityAllowedGroups200ResponseWithDefaults() *CoreGroupGetActivityAllowedGroups200Response`

NewCoreGroupGetActivityAllowedGroups200ResponseWithDefaults instantiates a new CoreGroupGetActivityAllowedGroups200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanaccessallgroups

`func (o *CoreGroupGetActivityAllowedGroups200Response) GetCanaccessallgroups() bool`

GetCanaccessallgroups returns the Canaccessallgroups field if non-nil, zero value otherwise.

### GetCanaccessallgroupsOk

`func (o *CoreGroupGetActivityAllowedGroups200Response) GetCanaccessallgroupsOk() (*bool, bool)`

GetCanaccessallgroupsOk returns a tuple with the Canaccessallgroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanaccessallgroups

`func (o *CoreGroupGetActivityAllowedGroups200Response) SetCanaccessallgroups(v bool)`

SetCanaccessallgroups sets Canaccessallgroups field to given value.

### HasCanaccessallgroups

`func (o *CoreGroupGetActivityAllowedGroups200Response) HasCanaccessallgroups() bool`

HasCanaccessallgroups returns a boolean if a field has been set.

### GetGroups

`func (o *CoreGroupGetActivityAllowedGroups200Response) GetGroups() []CoreGroupGetActivityAllowedGroups200ResponseGroupsInner`

GetGroups returns the Groups field if non-nil, zero value otherwise.

### GetGroupsOk

`func (o *CoreGroupGetActivityAllowedGroups200Response) GetGroupsOk() (*[]CoreGroupGetActivityAllowedGroups200ResponseGroupsInner, bool)`

GetGroupsOk returns a tuple with the Groups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroups

`func (o *CoreGroupGetActivityAllowedGroups200Response) SetGroups(v []CoreGroupGetActivityAllowedGroups200ResponseGroupsInner)`

SetGroups sets Groups field to given value.


### GetWarnings

`func (o *CoreGroupGetActivityAllowedGroups200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreGroupGetActivityAllowedGroups200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreGroupGetActivityAllowedGroups200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreGroupGetActivityAllowedGroups200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


