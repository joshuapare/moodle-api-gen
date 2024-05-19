# CoreMessageGetMemberInfoRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Includecontactrequests** | Pointer to **bool** | include contact requests in response | [optional] [default to false]
**Includeprivacyinfo** | Pointer to **bool** | include privacy info in response | [optional] [default to false]
**Referenceuserid** | **int32** | id of the user | [default to null]
**Userids** | **[]map[string]interface{}** |  | 

## Methods

### NewCoreMessageGetMemberInfoRequest

`func NewCoreMessageGetMemberInfoRequest(referenceuserid int32, userids []map[string]interface{}, ) *CoreMessageGetMemberInfoRequest`

NewCoreMessageGetMemberInfoRequest instantiates a new CoreMessageGetMemberInfoRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetMemberInfoRequestWithDefaults

`func NewCoreMessageGetMemberInfoRequestWithDefaults() *CoreMessageGetMemberInfoRequest`

NewCoreMessageGetMemberInfoRequestWithDefaults instantiates a new CoreMessageGetMemberInfoRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIncludecontactrequests

`func (o *CoreMessageGetMemberInfoRequest) GetIncludecontactrequests() bool`

GetIncludecontactrequests returns the Includecontactrequests field if non-nil, zero value otherwise.

### GetIncludecontactrequestsOk

`func (o *CoreMessageGetMemberInfoRequest) GetIncludecontactrequestsOk() (*bool, bool)`

GetIncludecontactrequestsOk returns a tuple with the Includecontactrequests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludecontactrequests

`func (o *CoreMessageGetMemberInfoRequest) SetIncludecontactrequests(v bool)`

SetIncludecontactrequests sets Includecontactrequests field to given value.

### HasIncludecontactrequests

`func (o *CoreMessageGetMemberInfoRequest) HasIncludecontactrequests() bool`

HasIncludecontactrequests returns a boolean if a field has been set.

### GetIncludeprivacyinfo

`func (o *CoreMessageGetMemberInfoRequest) GetIncludeprivacyinfo() bool`

GetIncludeprivacyinfo returns the Includeprivacyinfo field if non-nil, zero value otherwise.

### GetIncludeprivacyinfoOk

`func (o *CoreMessageGetMemberInfoRequest) GetIncludeprivacyinfoOk() (*bool, bool)`

GetIncludeprivacyinfoOk returns a tuple with the Includeprivacyinfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludeprivacyinfo

`func (o *CoreMessageGetMemberInfoRequest) SetIncludeprivacyinfo(v bool)`

SetIncludeprivacyinfo sets Includeprivacyinfo field to given value.

### HasIncludeprivacyinfo

`func (o *CoreMessageGetMemberInfoRequest) HasIncludeprivacyinfo() bool`

HasIncludeprivacyinfo returns a boolean if a field has been set.

### GetReferenceuserid

`func (o *CoreMessageGetMemberInfoRequest) GetReferenceuserid() int32`

GetReferenceuserid returns the Referenceuserid field if non-nil, zero value otherwise.

### GetReferenceuseridOk

`func (o *CoreMessageGetMemberInfoRequest) GetReferenceuseridOk() (*int32, bool)`

GetReferenceuseridOk returns a tuple with the Referenceuserid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReferenceuserid

`func (o *CoreMessageGetMemberInfoRequest) SetReferenceuserid(v int32)`

SetReferenceuserid sets Referenceuserid field to given value.


### GetUserids

`func (o *CoreMessageGetMemberInfoRequest) GetUserids() []map[string]interface{}`

GetUserids returns the Userids field if non-nil, zero value otherwise.

### GetUseridsOk

`func (o *CoreMessageGetMemberInfoRequest) GetUseridsOk() (*[]map[string]interface{}, bool)`

GetUseridsOk returns a tuple with the Userids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserids

`func (o *CoreMessageGetMemberInfoRequest) SetUserids(v []map[string]interface{})`

SetUserids sets Userids field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


