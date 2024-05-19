# BlockIomadCompanyAdminUnassignUsersRequestUsersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyid** | **int** | User company ID | [optional] [default to 0]
**userid** | **int** | User ID | [optional] [default to 0]
**usertype** | **int** | Old user manager type | [optional] [default to 0]

## Example

```python
from openapi_client.models.block_iomad_company_admin_unassign_users_request_users_inner import BlockIomadCompanyAdminUnassignUsersRequestUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminUnassignUsersRequestUsersInner from a JSON string
block_iomad_company_admin_unassign_users_request_users_inner_instance = BlockIomadCompanyAdminUnassignUsersRequestUsersInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminUnassignUsersRequestUsersInner.to_json())

# convert the object into a dict
block_iomad_company_admin_unassign_users_request_users_inner_dict = block_iomad_company_admin_unassign_users_request_users_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminUnassignUsersRequestUsersInner from a dict
block_iomad_company_admin_unassign_users_request_users_inner_from_dict = BlockIomadCompanyAdminUnassignUsersRequestUsersInner.from_dict(block_iomad_company_admin_unassign_users_request_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


