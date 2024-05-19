# BlockIomadCompanyAdminAssignUsers200ResponseWarningsInner

warning

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **str** | always set to &#39;key&#39; | [optional] [default to 'null']
**itemid** | **int** | faulty key name | [optional] [default to null]
**message** | **str** | untranslated english message to explain the warning | [optional] 
**warningcode** | **str** | the warning code can be used by the client app to implement specific behaviour | [optional] 

## Example

```python
from openapi_client.models.block_iomad_company_admin_assign_users200_response_warnings_inner import BlockIomadCompanyAdminAssignUsers200ResponseWarningsInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminAssignUsers200ResponseWarningsInner from a JSON string
block_iomad_company_admin_assign_users200_response_warnings_inner_instance = BlockIomadCompanyAdminAssignUsers200ResponseWarningsInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminAssignUsers200ResponseWarningsInner.to_json())

# convert the object into a dict
block_iomad_company_admin_assign_users200_response_warnings_inner_dict = block_iomad_company_admin_assign_users200_response_warnings_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminAssignUsers200ResponseWarningsInner from a dict
block_iomad_company_admin_assign_users200_response_warnings_inner_from_dict = BlockIomadCompanyAdminAssignUsers200ResponseWarningsInner.from_dict(block_iomad_company_admin_assign_users200_response_warnings_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


