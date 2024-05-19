# BlockIomadCompanyAdminMoveUsersRequestUsersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyid** | **int** | User company ID | [optional] [default to 0]
**departmentid** | **int** | User company department ID | [optional] [default to 0]
**managertype** | **int** | User manager type 0 &#x3D;&gt; User, 1 &#x3D;&gt; company manager 2 &#x3D;&gt; department manager | [optional] [default to 0]
**userid** | **int** | User ID | [optional] [default to 0]

## Example

```python
from openapi_client.models.block_iomad_company_admin_move_users_request_users_inner import BlockIomadCompanyAdminMoveUsersRequestUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminMoveUsersRequestUsersInner from a JSON string
block_iomad_company_admin_move_users_request_users_inner_instance = BlockIomadCompanyAdminMoveUsersRequestUsersInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminMoveUsersRequestUsersInner.to_json())

# convert the object into a dict
block_iomad_company_admin_move_users_request_users_inner_dict = block_iomad_company_admin_move_users_request_users_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminMoveUsersRequestUsersInner from a dict
block_iomad_company_admin_move_users_request_users_inner_from_dict = BlockIomadCompanyAdminMoveUsersRequestUsersInner.from_dict(block_iomad_company_admin_move_users_request_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


