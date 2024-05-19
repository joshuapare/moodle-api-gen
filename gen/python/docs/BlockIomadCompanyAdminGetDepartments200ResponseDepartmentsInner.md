# BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**company** | **int** | Company ID | [optional] 
**id** | **int** | Department ID | [optional] 
**name** | **str** | Department name | [optional] [default to 'null']
**parent** | **int** | Department parent id | [optional] [default to null]
**shortname** | **str** | Department short name | [optional] [default to 'null']

## Example

```python
from openapi_client.models.block_iomad_company_admin_get_departments200_response_departments_inner import BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner from a JSON string
block_iomad_company_admin_get_departments200_response_departments_inner_instance = BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner.to_json())

# convert the object into a dict
block_iomad_company_admin_get_departments200_response_departments_inner_dict = block_iomad_company_admin_get_departments200_response_departments_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner from a dict
block_iomad_company_admin_get_departments200_response_departments_inner_from_dict = BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner.from_dict(block_iomad_company_admin_get_departments200_response_departments_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


