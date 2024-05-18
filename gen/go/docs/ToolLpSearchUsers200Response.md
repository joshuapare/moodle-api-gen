# ToolLpSearchUsers200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | **int32** | Total number of results. | [default to null]
**Users** | [**[]ToolLpSearchUsers200ResponseUsersInner**](ToolLpSearchUsers200ResponseUsersInner.md) |  | 

## Methods

### NewToolLpSearchUsers200Response

`func NewToolLpSearchUsers200Response(count int32, users []ToolLpSearchUsers200ResponseUsersInner, ) *ToolLpSearchUsers200Response`

NewToolLpSearchUsers200Response instantiates a new ToolLpSearchUsers200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolLpSearchUsers200ResponseWithDefaults

`func NewToolLpSearchUsers200ResponseWithDefaults() *ToolLpSearchUsers200Response`

NewToolLpSearchUsers200ResponseWithDefaults instantiates a new ToolLpSearchUsers200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *ToolLpSearchUsers200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *ToolLpSearchUsers200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *ToolLpSearchUsers200Response) SetCount(v int32)`

SetCount sets Count field to given value.


### GetUsers

`func (o *ToolLpSearchUsers200Response) GetUsers() []ToolLpSearchUsers200ResponseUsersInner`

GetUsers returns the Users field if non-nil, zero value otherwise.

### GetUsersOk

`func (o *ToolLpSearchUsers200Response) GetUsersOk() (*[]ToolLpSearchUsers200ResponseUsersInner, bool)`

GetUsersOk returns a tuple with the Users field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsers

`func (o *ToolLpSearchUsers200Response) SetUsers(v []ToolLpSearchUsers200ResponseUsersInner)`

SetUsers sets Users field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


