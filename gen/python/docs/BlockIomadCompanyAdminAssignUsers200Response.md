# BlockIomadCompanyAdminAssignUsers200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users** | [**List[BlockIomadCompanyAdminAssignUsers200ResponseUsersInner]**](BlockIomadCompanyAdminAssignUsers200ResponseUsersInner.md) |  | 
**warnings** | [**List[BlockIomadCompanyAdminAssignUsers200ResponseWarningsInner]**](BlockIomadCompanyAdminAssignUsers200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.block_iomad_company_admin_assign_users200_response import BlockIomadCompanyAdminAssignUsers200Response

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminAssignUsers200Response from a JSON string
block_iomad_company_admin_assign_users200_response_instance = BlockIomadCompanyAdminAssignUsers200Response.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminAssignUsers200Response.to_json())

# convert the object into a dict
block_iomad_company_admin_assign_users200_response_dict = block_iomad_company_admin_assign_users200_response_instance.to_dict()
# create an instance of BlockIomadCompanyAdminAssignUsers200Response from a dict
block_iomad_company_admin_assign_users200_response_from_dict = BlockIomadCompanyAdminAssignUsers200Response.from_dict(block_iomad_company_admin_assign_users200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


