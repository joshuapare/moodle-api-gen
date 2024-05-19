# BlockIomadCompanyAdminGetDepartmentUsers200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users** | [**List[BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner]**](BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner.md) |  | 
**warnings** | [**List[BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner]**](BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.block_iomad_company_admin_get_department_users200_response import BlockIomadCompanyAdminGetDepartmentUsers200Response

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminGetDepartmentUsers200Response from a JSON string
block_iomad_company_admin_get_department_users200_response_instance = BlockIomadCompanyAdminGetDepartmentUsers200Response.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminGetDepartmentUsers200Response.to_json())

# convert the object into a dict
block_iomad_company_admin_get_department_users200_response_dict = block_iomad_company_admin_get_department_users200_response_instance.to_dict()
# create an instance of BlockIomadCompanyAdminGetDepartmentUsers200Response from a dict
block_iomad_company_admin_get_department_users200_response_from_dict = BlockIomadCompanyAdminGetDepartmentUsers200Response.from_dict(block_iomad_company_admin_get_department_users200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


