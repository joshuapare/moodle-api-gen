# BlockIomadCompanyAdminCreateLicensesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**licenses** | [**List[BlockIomadCompanyAdminCreateLicensesRequestLicensesInner]**](BlockIomadCompanyAdminCreateLicensesRequestLicensesInner.md) |  | 

## Example

```python
from openapi_client.models.block_iomad_company_admin_create_licenses_request import BlockIomadCompanyAdminCreateLicensesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminCreateLicensesRequest from a JSON string
block_iomad_company_admin_create_licenses_request_instance = BlockIomadCompanyAdminCreateLicensesRequest.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminCreateLicensesRequest.to_json())

# convert the object into a dict
block_iomad_company_admin_create_licenses_request_dict = block_iomad_company_admin_create_licenses_request_instance.to_dict()
# create an instance of BlockIomadCompanyAdminCreateLicensesRequest from a dict
block_iomad_company_admin_create_licenses_request_from_dict = BlockIomadCompanyAdminCreateLicensesRequest.from_dict(block_iomad_company_admin_create_licenses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


