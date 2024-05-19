# BlockIomadCompanyAdminGetCompanies200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Companies** | [**[]BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner**](BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.md) |  | 
**Warnings** | Pointer to [**[]BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner**](BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewBlockIomadCompanyAdminGetCompanies200Response

`func NewBlockIomadCompanyAdminGetCompanies200Response(companies []BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner, ) *BlockIomadCompanyAdminGetCompanies200Response`

NewBlockIomadCompanyAdminGetCompanies200Response instantiates a new BlockIomadCompanyAdminGetCompanies200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBlockIomadCompanyAdminGetCompanies200ResponseWithDefaults

`func NewBlockIomadCompanyAdminGetCompanies200ResponseWithDefaults() *BlockIomadCompanyAdminGetCompanies200Response`

NewBlockIomadCompanyAdminGetCompanies200ResponseWithDefaults instantiates a new BlockIomadCompanyAdminGetCompanies200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompanies

`func (o *BlockIomadCompanyAdminGetCompanies200Response) GetCompanies() []BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner`

GetCompanies returns the Companies field if non-nil, zero value otherwise.

### GetCompaniesOk

`func (o *BlockIomadCompanyAdminGetCompanies200Response) GetCompaniesOk() (*[]BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner, bool)`

GetCompaniesOk returns a tuple with the Companies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompanies

`func (o *BlockIomadCompanyAdminGetCompanies200Response) SetCompanies(v []BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner)`

SetCompanies sets Companies field to given value.


### GetWarnings

`func (o *BlockIomadCompanyAdminGetCompanies200Response) GetWarnings() []BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *BlockIomadCompanyAdminGetCompanies200Response) GetWarningsOk() (*[]BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *BlockIomadCompanyAdminGetCompanies200Response) SetWarnings(v []BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *BlockIomadCompanyAdminGetCompanies200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


