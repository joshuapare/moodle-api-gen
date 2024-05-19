# BlockIomadCompanyAdminAssignUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users** | [**List[BlockIomadCompanyAdminAssignUsersRequestUsersInner]**](BlockIomadCompanyAdminAssignUsersRequestUsersInner.md) |  | 

## Example

```python
from openapi_client.models.block_iomad_company_admin_assign_users_request import BlockIomadCompanyAdminAssignUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminAssignUsersRequest from a JSON string
block_iomad_company_admin_assign_users_request_instance = BlockIomadCompanyAdminAssignUsersRequest.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminAssignUsersRequest.to_json())

# convert the object into a dict
block_iomad_company_admin_assign_users_request_dict = block_iomad_company_admin_assign_users_request_instance.to_dict()
# create an instance of BlockIomadCompanyAdminAssignUsersRequest from a dict
block_iomad_company_admin_assign_users_request_from_dict = BlockIomadCompanyAdminAssignUsersRequest.from_dict(block_iomad_company_admin_assign_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


