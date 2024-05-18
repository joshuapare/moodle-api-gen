# BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | Pointer to **string** | the company column to search, expected keys (value format) are:                                 \&quot;id\&quot; (int) matching company id,                                 \&quot;name\&quot; (string) company name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;shortname\&quot; (string) company short name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;code\&quot; (string) company code (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;suspended\&quot; (bool) company is suspended or not,                                 \&quot;city\&quot; (string) matching company city,                                 \&quot;country\&quot; (string) matching company country,                                 \&quot;timezone\&quot; (int) company timezone,                                 \&quot;lang\&quot; (string) matching company language setting | [optional] [default to "null"]
**Value** | Pointer to **string** | the value to search | [optional] [default to "null"]

## Methods

### NewBlockIomadCompanyAdminGetCompaniesRequestCriteriaInner

`func NewBlockIomadCompanyAdminGetCompaniesRequestCriteriaInner() *BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner`

NewBlockIomadCompanyAdminGetCompaniesRequestCriteriaInner instantiates a new BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBlockIomadCompanyAdminGetCompaniesRequestCriteriaInnerWithDefaults

`func NewBlockIomadCompanyAdminGetCompaniesRequestCriteriaInnerWithDefaults() *BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner`

NewBlockIomadCompanyAdminGetCompaniesRequestCriteriaInnerWithDefaults instantiates a new BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKey

`func (o *BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner) GetKey() string`

GetKey returns the Key field if non-nil, zero value otherwise.

### GetKeyOk

`func (o *BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner) GetKeyOk() (*string, bool)`

GetKeyOk returns a tuple with the Key field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKey

`func (o *BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner) SetKey(v string)`

SetKey sets Key field to given value.

### HasKey

`func (o *BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner) HasKey() bool`

HasKey returns a boolean if a field has been set.

### GetValue

`func (o *BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


