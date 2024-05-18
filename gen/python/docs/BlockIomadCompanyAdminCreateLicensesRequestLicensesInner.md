# BlockIomadCompanyAdminCreateLicensesRequestLicensesInner

one or many licenses

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocation** | **int** | Number of license slots | [optional] [default to null]
**clearonexpire** | **int** | Clear license assignments on expire - 0 &#x3D; no, 1 &#x3D; yes | [optional] [default to null]
**companyid** | **int** | Company id | [optional] [default to null]
**courses** | [**List[BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner]**](BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner.md) |  | [optional] 
**cutoffdate** | **int** | License cut off date (int &#x3D; timestamp) | [optional] [default to null]
**expirydate** | **int** | License expiry date (int &#x3D; timestamp) | [optional] [default to null]
**instant** | **int** | Instant access - 0 &#x3D; no, 1 &#x3D; yes | [optional] [default to null]
**name** | **str** | License name | [optional] [default to 'null']
**parentid** | **int** | Parent license id | [optional] [default to null]
**program** | **int** | Program pf courses 0 &#x3D; no, 1 &#x3D; yes | [optional] [default to null]
**reference** | **str** | License reference | [optional] [default to 'null']
**startdate** | **int** | Date from which the liucense is available (int &#x3D; timestamp)  | [optional] [default to null]
**type** | **int** | License type - 0 &#x3D; standard, 1 &#x3D; reusable, 2 &#x3D; standard educator, 3 &#x3D; reusable educator | [optional] [default to null]
**used** | **int** | Number how often the lic can be allocated | [optional] [default to null]
**validlength** | **int** | Course access length (days) | [optional] [default to null]

## Example

```python
from openapi_client.models.block_iomad_company_admin_create_licenses_request_licenses_inner import BlockIomadCompanyAdminCreateLicensesRequestLicensesInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminCreateLicensesRequestLicensesInner from a JSON string
block_iomad_company_admin_create_licenses_request_licenses_inner_instance = BlockIomadCompanyAdminCreateLicensesRequestLicensesInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminCreateLicensesRequestLicensesInner.to_json())

# convert the object into a dict
block_iomad_company_admin_create_licenses_request_licenses_inner_dict = block_iomad_company_admin_create_licenses_request_licenses_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminCreateLicensesRequestLicensesInner from a dict
block_iomad_company_admin_create_licenses_request_licenses_inner_from_dict = BlockIomadCompanyAdminCreateLicensesRequestLicensesInner.from_dict(block_iomad_company_admin_create_licenses_request_licenses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


