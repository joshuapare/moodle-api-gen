# BlockIomadCompanyAdminEditCompaniesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companies** | [**List[BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner]**](BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner.md) |  | 

## Example

```python
from openapi_client.models.block_iomad_company_admin_edit_companies_request import BlockIomadCompanyAdminEditCompaniesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminEditCompaniesRequest from a JSON string
block_iomad_company_admin_edit_companies_request_instance = BlockIomadCompanyAdminEditCompaniesRequest.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminEditCompaniesRequest.to_json())

# convert the object into a dict
block_iomad_company_admin_edit_companies_request_dict = block_iomad_company_admin_edit_companies_request_instance.to_dict()
# create an instance of BlockIomadCompanyAdminEditCompaniesRequest from a dict
block_iomad_company_admin_edit_companies_request_from_dict = BlockIomadCompanyAdminEditCompaniesRequest.from_dict(block_iomad_company_admin_edit_companies_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


