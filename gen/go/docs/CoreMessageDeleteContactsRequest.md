# CoreMessageDeleteContactsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Userid** | Pointer to **int32** | The id of the user we are deleting the contacts for, 0 for the                     current user | [optional] [default to 0]
**Userids** | **[]map[string]interface{}** |  | 

## Methods

### NewCoreMessageDeleteContactsRequest

`func NewCoreMessageDeleteContactsRequest(userids []map[string]interface{}, ) *CoreMessageDeleteContactsRequest`

NewCoreMessageDeleteContactsRequest instantiates a new CoreMessageDeleteContactsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageDeleteContactsRequestWithDefaults

`func NewCoreMessageDeleteContactsRequestWithDefaults() *CoreMessageDeleteContactsRequest`

NewCoreMessageDeleteContactsRequestWithDefaults instantiates a new CoreMessageDeleteContactsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUserid

`func (o *CoreMessageDeleteContactsRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageDeleteContactsRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageDeleteContactsRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreMessageDeleteContactsRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetUserids

`func (o *CoreMessageDeleteContactsRequest) GetUserids() []map[string]interface{}`

GetUserids returns the Userids field if non-nil, zero value otherwise.

### GetUseridsOk

`func (o *CoreMessageDeleteContactsRequest) GetUseridsOk() (*[]map[string]interface{}, bool)`

GetUseridsOk returns a tuple with the Userids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserids

`func (o *CoreMessageDeleteContactsRequest) SetUserids(v []map[string]interface{})`

SetUserids sets Userids field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


