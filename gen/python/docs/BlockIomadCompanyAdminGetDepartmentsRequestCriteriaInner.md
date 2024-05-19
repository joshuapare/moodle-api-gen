# BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** | the user column to search, expected keys (value format) are:                                 \&quot;id\&quot; (int) matching department id,                                 \&quot;name\&quot; (string) department name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;shortname\&quot; (string) department short name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;company\&quot; (int) matching company id,                                 \&quot;parent\&quot; (int) matching department parent id | [optional] [default to 'null']
**value** | **str** | the value to search | [optional] 

## Example

```python
from openapi_client.models.block_iomad_company_admin_get_departments_request_criteria_inner import BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner from a JSON string
block_iomad_company_admin_get_departments_request_criteria_inner_instance = BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner.to_json())

# convert the object into a dict
block_iomad_company_admin_get_departments_request_criteria_inner_dict = block_iomad_company_admin_get_departments_request_criteria_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner from a dict
block_iomad_company_admin_get_departments_request_criteria_inner_from_dict = BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner.from_dict(block_iomad_company_admin_get_departments_request_criteria_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


