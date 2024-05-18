# BlockIomadCompanyAdminGetDepartments200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**departments** | [**List[BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner]**](BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner.md) |  | 
**warnings** | [**List[BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner]**](BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.block_iomad_company_admin_get_departments200_response import BlockIomadCompanyAdminGetDepartments200Response

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminGetDepartments200Response from a JSON string
block_iomad_company_admin_get_departments200_response_instance = BlockIomadCompanyAdminGetDepartments200Response.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminGetDepartments200Response.to_json())

# convert the object into a dict
block_iomad_company_admin_get_departments200_response_dict = block_iomad_company_admin_get_departments200_response_instance.to_dict()
# create an instance of BlockIomadCompanyAdminGetDepartments200Response from a dict
block_iomad_company_admin_get_departments200_response_from_dict = BlockIomadCompanyAdminGetDepartments200Response.from_dict(block_iomad_company_admin_get_departments200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


