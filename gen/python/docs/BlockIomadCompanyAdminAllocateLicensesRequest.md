# BlockIomadCompanyAdminAllocateLicensesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**licenses** | [**List[BlockIomadCompanyAdminAllocateLicensesRequestLicensesInner]**](BlockIomadCompanyAdminAllocateLicensesRequestLicensesInner.md) |  | 

## Example

```python
from openapi_client.models.block_iomad_company_admin_allocate_licenses_request import BlockIomadCompanyAdminAllocateLicensesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminAllocateLicensesRequest from a JSON string
block_iomad_company_admin_allocate_licenses_request_instance = BlockIomadCompanyAdminAllocateLicensesRequest.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminAllocateLicensesRequest.to_json())

# convert the object into a dict
block_iomad_company_admin_allocate_licenses_request_dict = block_iomad_company_admin_allocate_licenses_request_instance.to_dict()
# create an instance of BlockIomadCompanyAdminAllocateLicensesRequest from a dict
block_iomad_company_admin_allocate_licenses_request_from_dict = BlockIomadCompanyAdminAllocateLicensesRequest.from_dict(block_iomad_company_admin_allocate_licenses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


