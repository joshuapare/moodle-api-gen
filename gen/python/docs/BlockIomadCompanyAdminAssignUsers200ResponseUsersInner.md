# BlockIomadCompanyAdminAssignUsers200ResponseUsersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyid** | **int** | Company ID | [optional] [default to null]
**message** | **str** | Failure message | [optional] [default to 'null']
**result** | **bool** | Success or failure | [optional] [default to False]
**userid** | **int** | Department ID | [optional] [default to null]

## Example

```python
from openapi_client.models.block_iomad_company_admin_assign_users200_response_users_inner import BlockIomadCompanyAdminAssignUsers200ResponseUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminAssignUsers200ResponseUsersInner from a JSON string
block_iomad_company_admin_assign_users200_response_users_inner_instance = BlockIomadCompanyAdminAssignUsers200ResponseUsersInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminAssignUsers200ResponseUsersInner.to_json())

# convert the object into a dict
block_iomad_company_admin_assign_users200_response_users_inner_dict = block_iomad_company_admin_assign_users200_response_users_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminAssignUsers200ResponseUsersInner from a dict
block_iomad_company_admin_assign_users200_response_users_inner_from_dict = BlockIomadCompanyAdminAssignUsers200ResponseUsersInner.from_dict(block_iomad_company_admin_assign_users200_response_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


