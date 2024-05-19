# BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | Pointer to **string** | the user column to search, expected keys (value format) are:                                 \&quot;id\&quot; (int) matching user id,                                 \&quot;name\&quot; (string) license name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;startdate\&quot; (int) license start date in unix time,                                 \&quot;expirydate\&quot; (int) license expiry date in unix time,                                 \&quot;companyid\&quot; (int) license company id,                                 \&quot;parentid\&quot;  (int) license parent id for split licenses,                                 \&quot;program\&quot;  (bool) license is program,                                 \&quot;instant\&quot;  (bool) license is instant,                                 \&quot;type\&quot;  (int) license type (0 &#x3D; standard, 1 &#x3D; reusable, 3 &#x3D; educator),                                 \&quot;reference\&quot; license reference (Note: you can use % for searching but it may be considerably slower!) | [optional] [default to "null"]
**Value** | Pointer to **string** | the value to search | [optional] 

## Methods

### NewBlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner

`func NewBlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner() *BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner`

NewBlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner instantiates a new BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInnerWithDefaults

`func NewBlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInnerWithDefaults() *BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner`

NewBlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInnerWithDefaults instantiates a new BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKey

`func (o *BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner) GetKey() string`

GetKey returns the Key field if non-nil, zero value otherwise.

### GetKeyOk

`func (o *BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner) GetKeyOk() (*string, bool)`

GetKeyOk returns a tuple with the Key field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKey

`func (o *BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner) SetKey(v string)`

SetKey sets Key field to given value.

### HasKey

`func (o *BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner) HasKey() bool`

HasKey returns a boolean if a field has been set.

### GetValue

`func (o *BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


