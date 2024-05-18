# BlockIomadCompanyAdminRestrictCapabilityRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Allow** | **bool** | Set capability? | [default to null]
**Capability** | **string** | The capability | [default to "null"]
**Companyid** | **int32** | Company ID. Ignored if templateid is non-zero | [default to null]
**Roleid** | **int32** | Role ID | [default to null]
**Templateid** | Pointer to **int32** | Template ID. Set to 0 if company restriction | [optional] [default to 0]

## Methods

### NewBlockIomadCompanyAdminRestrictCapabilityRequest

`func NewBlockIomadCompanyAdminRestrictCapabilityRequest(allow bool, capability string, companyid int32, roleid int32, ) *BlockIomadCompanyAdminRestrictCapabilityRequest`

NewBlockIomadCompanyAdminRestrictCapabilityRequest instantiates a new BlockIomadCompanyAdminRestrictCapabilityRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBlockIomadCompanyAdminRestrictCapabilityRequestWithDefaults

`func NewBlockIomadCompanyAdminRestrictCapabilityRequestWithDefaults() *BlockIomadCompanyAdminRestrictCapabilityRequest`

NewBlockIomadCompanyAdminRestrictCapabilityRequestWithDefaults instantiates a new BlockIomadCompanyAdminRestrictCapabilityRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAllow

`func (o *BlockIomadCompanyAdminRestrictCapabilityRequest) GetAllow() bool`

GetAllow returns the Allow field if non-nil, zero value otherwise.

### GetAllowOk

`func (o *BlockIomadCompanyAdminRestrictCapabilityRequest) GetAllowOk() (*bool, bool)`

GetAllowOk returns a tuple with the Allow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllow

`func (o *BlockIomadCompanyAdminRestrictCapabilityRequest) SetAllow(v bool)`

SetAllow sets Allow field to given value.


### GetCapability

`func (o *BlockIomadCompanyAdminRestrictCapabilityRequest) GetCapability() string`

GetCapability returns the Capability field if non-nil, zero value otherwise.

### GetCapabilityOk

`func (o *BlockIomadCompanyAdminRestrictCapabilityRequest) GetCapabilityOk() (*string, bool)`

GetCapabilityOk returns a tuple with the Capability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCapability

`func (o *BlockIomadCompanyAdminRestrictCapabilityRequest) SetCapability(v string)`

SetCapability sets Capability field to given value.


### GetCompanyid

`func (o *BlockIomadCompanyAdminRestrictCapabilityRequest) GetCompanyid() int32`

GetCompanyid returns the Companyid field if non-nil, zero value otherwise.

### GetCompanyidOk

`func (o *BlockIomadCompanyAdminRestrictCapabilityRequest) GetCompanyidOk() (*int32, bool)`

GetCompanyidOk returns a tuple with the Companyid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompanyid

`func (o *BlockIomadCompanyAdminRestrictCapabilityRequest) SetCompanyid(v int32)`

SetCompanyid sets Companyid field to given value.


### GetRoleid

`func (o *BlockIomadCompanyAdminRestrictCapabilityRequest) GetRoleid() int32`

GetRoleid returns the Roleid field if non-nil, zero value otherwise.

### GetRoleidOk

`func (o *BlockIomadCompanyAdminRestrictCapabilityRequest) GetRoleidOk() (*int32, bool)`

GetRoleidOk returns a tuple with the Roleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoleid

`func (o *BlockIomadCompanyAdminRestrictCapabilityRequest) SetRoleid(v int32)`

SetRoleid sets Roleid field to given value.


### GetTemplateid

`func (o *BlockIomadCompanyAdminRestrictCapabilityRequest) GetTemplateid() int32`

GetTemplateid returns the Templateid field if non-nil, zero value otherwise.

### GetTemplateidOk

`func (o *BlockIomadCompanyAdminRestrictCapabilityRequest) GetTemplateidOk() (*int32, bool)`

GetTemplateidOk returns a tuple with the Templateid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplateid

`func (o *BlockIomadCompanyAdminRestrictCapabilityRequest) SetTemplateid(v int32)`

SetTemplateid sets Templateid field to given value.

### HasTemplateid

`func (o *BlockIomadCompanyAdminRestrictCapabilityRequest) HasTemplateid() bool`

HasTemplateid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


