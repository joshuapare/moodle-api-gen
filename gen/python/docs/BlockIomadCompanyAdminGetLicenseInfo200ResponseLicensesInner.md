# BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocation** | **int** | Number of license slots | [optional] 
**companyid** | **int** | Company id | [optional] 
**expirydate** | **int** | License expiry date | [optional] 
**id** | **int** | license ID | [optional] 
**name** | **str** | License name | [optional] 
**parentid** | **int** | Parent license id | [optional] 
**used** | **int** | Number allocated | [optional] 
**validlength** | **int** | Course access length (days) | [optional] 

## Example

```python
from openapi_client.models.block_iomad_company_admin_get_license_info200_response_licenses_inner import BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner from a JSON string
block_iomad_company_admin_get_license_info200_response_licenses_inner_instance = BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.to_json())

# convert the object into a dict
block_iomad_company_admin_get_license_info200_response_licenses_inner_dict = block_iomad_company_admin_get_license_info200_response_licenses_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner from a dict
block_iomad_company_admin_get_license_info200_response_licenses_inner_from_dict = BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.from_dict(block_iomad_company_admin_get_license_info200_response_licenses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


