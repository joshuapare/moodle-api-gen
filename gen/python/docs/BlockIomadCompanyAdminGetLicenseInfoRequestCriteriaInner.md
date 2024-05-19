# BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** | the user column to search, expected keys (value format) are:                                 \&quot;id\&quot; (int) matching user id,                                 \&quot;name\&quot; (string) license name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;startdate\&quot; (int) license start date in unix time,                                 \&quot;expirydate\&quot; (int) license expiry date in unix time,                                 \&quot;companyid\&quot; (int) license company id,                                 \&quot;parentid\&quot;  (int) license parent id for split licenses,                                 \&quot;program\&quot;  (bool) license is program,                                 \&quot;instant\&quot;  (bool) license is instant,                                 \&quot;type\&quot;  (int) license type (0 &#x3D; standard, 1 &#x3D; reusable, 3 &#x3D; educator),                                 \&quot;reference\&quot; license reference (Note: you can use % for searching but it may be considerably slower!) | [optional] [default to 'null']
**value** | **str** | the value to search | [optional] 

## Example

```python
from openapi_client.models.block_iomad_company_admin_get_license_info_request_criteria_inner import BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner from a JSON string
block_iomad_company_admin_get_license_info_request_criteria_inner_instance = BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner.to_json())

# convert the object into a dict
block_iomad_company_admin_get_license_info_request_criteria_inner_dict = block_iomad_company_admin_get_license_info_request_criteria_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner from a dict
block_iomad_company_admin_get_license_info_request_criteria_inner_from_dict = BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner.from_dict(block_iomad_company_admin_get_license_info_request_criteria_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


