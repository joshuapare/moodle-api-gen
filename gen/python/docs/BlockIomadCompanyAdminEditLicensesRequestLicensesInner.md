# BlockIomadCompanyAdminEditLicensesRequestLicensesInner

one or many licenses

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocation** | **int** | Number of license slots | [optional] 
**companyid** | **int** | Company id | [optional] 
**courses** | [**List[BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner]**](BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner.md) |  | [optional] 
**expirydate** | **int** | License expiry date | [optional] [default to null]
**id** | **int** | license ID | [optional] 
**instant** | **int** | Instant access - 0 &#x3D; no, 1 &#x3D; yes | [optional] 
**name** | **str** | License name | [optional] 
**parentid** | **int** | Parent license id | [optional] 
**program** | **int** | Program pf courses 0 &#x3D; no, 1 &#x3D; yes | [optional] 
**reference** | **str** | License reference | [optional] 
**type** | **int** | License type - 0 &#x3D; standard, 1 &#x3D; reusable, 2 &#x3D; standard educator, 3 &#x3D; reusable educator | [optional] 
**used** | **int** | Number allocated | [optional] [default to null]
**validlength** | **int** | Course access length (days) | [optional] 

## Example

```python
from openapi_client.models.block_iomad_company_admin_edit_licenses_request_licenses_inner import BlockIomadCompanyAdminEditLicensesRequestLicensesInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminEditLicensesRequestLicensesInner from a JSON string
block_iomad_company_admin_edit_licenses_request_licenses_inner_instance = BlockIomadCompanyAdminEditLicensesRequestLicensesInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminEditLicensesRequestLicensesInner.to_json())

# convert the object into a dict
block_iomad_company_admin_edit_licenses_request_licenses_inner_dict = block_iomad_company_admin_edit_licenses_request_licenses_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminEditLicensesRequestLicensesInner from a dict
block_iomad_company_admin_edit_licenses_request_licenses_inner_from_dict = BlockIomadCompanyAdminEditLicensesRequestLicensesInner.from_dict(block_iomad_company_admin_edit_licenses_request_licenses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


