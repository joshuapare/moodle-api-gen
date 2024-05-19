# BlockIomadCompanyAdminSyncUsers200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | Status: true only if token is valid | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.block_iomad_company_admin_sync_users200_response import BlockIomadCompanyAdminSyncUsers200Response

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminSyncUsers200Response from a JSON string
block_iomad_company_admin_sync_users200_response_instance = BlockIomadCompanyAdminSyncUsers200Response.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminSyncUsers200Response.to_json())

# convert the object into a dict
block_iomad_company_admin_sync_users200_response_dict = block_iomad_company_admin_sync_users200_response_instance.to_dict()
# create an instance of BlockIomadCompanyAdminSyncUsers200Response from a dict
block_iomad_company_admin_sync_users200_response_from_dict = BlockIomadCompanyAdminSyncUsers200Response.from_dict(block_iomad_company_admin_sync_users200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


