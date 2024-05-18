# BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyid** | **int** | Company ID | [optional] 
**departmentid** | **int** | Department ID | [optional] 
**email** | **str** | User email address | [optional] [default to 'null']
**firstname** | **str** | User firstname | [optional] [default to 'null']
**id** | **int** | User ID | [optional] 
**lastname** | **str** | User lastname | [optional] [default to 'null']

## Example

```python
from openapi_client.models.block_iomad_company_admin_get_department_users200_response_users_inner import BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner from a JSON string
block_iomad_company_admin_get_department_users200_response_users_inner_instance = BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner.to_json())

# convert the object into a dict
block_iomad_company_admin_get_department_users200_response_users_inner_dict = block_iomad_company_admin_get_department_users200_response_users_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner from a dict
block_iomad_company_admin_get_department_users200_response_users_inner_from_dict = BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner.from_dict(block_iomad_company_admin_get_department_users200_response_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


