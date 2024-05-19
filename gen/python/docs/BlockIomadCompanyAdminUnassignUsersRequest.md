# BlockIomadCompanyAdminUnassignUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users** | [**List[BlockIomadCompanyAdminUnassignUsersRequestUsersInner]**](BlockIomadCompanyAdminUnassignUsersRequestUsersInner.md) |  | 

## Example

```python
from openapi_client.models.block_iomad_company_admin_unassign_users_request import BlockIomadCompanyAdminUnassignUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminUnassignUsersRequest from a JSON string
block_iomad_company_admin_unassign_users_request_instance = BlockIomadCompanyAdminUnassignUsersRequest.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminUnassignUsersRequest.to_json())

# convert the object into a dict
block_iomad_company_admin_unassign_users_request_dict = block_iomad_company_admin_unassign_users_request_instance.to_dict()
# create an instance of BlockIomadCompanyAdminUnassignUsersRequest from a dict
block_iomad_company_admin_unassign_users_request_from_dict = BlockIomadCompanyAdminUnassignUsersRequest.from_dict(block_iomad_company_admin_unassign_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


