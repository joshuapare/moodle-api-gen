# BlockIomadCompanyAdminCreateCompaniesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companies** | [**List[BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner]**](BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner.md) |  | 

## Example

```python
from openapi_client.models.block_iomad_company_admin_create_companies_request import BlockIomadCompanyAdminCreateCompaniesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminCreateCompaniesRequest from a JSON string
block_iomad_company_admin_create_companies_request_instance = BlockIomadCompanyAdminCreateCompaniesRequest.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminCreateCompaniesRequest.to_json())

# convert the object into a dict
block_iomad_company_admin_create_companies_request_dict = block_iomad_company_admin_create_companies_request_instance.to_dict()
# create an instance of BlockIomadCompanyAdminCreateCompaniesRequest from a dict
block_iomad_company_admin_create_companies_request_from_dict = BlockIomadCompanyAdminCreateCompaniesRequest.from_dict(block_iomad_company_admin_create_companies_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


