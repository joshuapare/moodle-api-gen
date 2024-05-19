# BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allallocated** | **bool** | All licenses allocated | [default to False]
**allocation** | **int** | Allocation | [default to null]
**companyid** | **int** | Company ID | 
**expirydate** | **int** | Expiry date | [default to null]
**id** | **int** | License ID | 
**instant** | **bool** | Instant | [default to False]
**name** | **str** | License name | 
**parentid** | **int** | Parent ID | [default to null]
**program** | **bool** | Program | [default to False]
**reference** | **str** | Reference | [default to 'null']
**startdate** | **int** | Start date | [default to null]
**type** | **int** | License type - 0 &#x3D; standard, 1 &#x3D; reusable, 2 &#x3D; standard educator, 3 &#x3D; reusable educator | 
**used** | **int** | Used | [default to null]
**validlength** | **int** | Valid length | [default to null]

## Example

```python
from openapi_client.models.block_iomad_company_admin_get_license_from_id200_response_license import BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense from a JSON string
block_iomad_company_admin_get_license_from_id200_response_license_instance = BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense.to_json())

# convert the object into a dict
block_iomad_company_admin_get_license_from_id200_response_license_dict = block_iomad_company_admin_get_license_from_id200_response_license_instance.to_dict()
# create an instance of BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense from a dict
block_iomad_company_admin_get_license_from_id200_response_license_from_dict = BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense.from_dict(block_iomad_company_admin_get_license_from_id200_response_license_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


