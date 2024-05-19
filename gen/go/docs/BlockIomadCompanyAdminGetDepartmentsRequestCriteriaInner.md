# BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | Pointer to **string** | the user column to search, expected keys (value format) are:                                 \&quot;id\&quot; (int) matching department id,                                 \&quot;name\&quot; (string) department name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;shortname\&quot; (string) department short name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;company\&quot; (int) matching company id,                                 \&quot;parent\&quot; (int) matching department parent id | [optional] [default to "null"]
**Value** | Pointer to **string** | the value to search | [optional] 

## Methods

### NewBlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner

`func NewBlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner() *BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner`

NewBlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner instantiates a new BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBlockIomadCompanyAdminGetDepartmentsRequestCriteriaInnerWithDefaults

`func NewBlockIomadCompanyAdminGetDepartmentsRequestCriteriaInnerWithDefaults() *BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner`

NewBlockIomadCompanyAdminGetDepartmentsRequestCriteriaInnerWithDefaults instantiates a new BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKey

`func (o *BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner) GetKey() string`

GetKey returns the Key field if non-nil, zero value otherwise.

### GetKeyOk

`func (o *BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner) GetKeyOk() (*string, bool)`

GetKeyOk returns a tuple with the Key field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKey

`func (o *BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner) SetKey(v string)`

SetKey sets Key field to given value.

### HasKey

`func (o *BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner) HasKey() bool`

HasKey returns a boolean if a field has been set.

### GetValue

`func (o *BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


