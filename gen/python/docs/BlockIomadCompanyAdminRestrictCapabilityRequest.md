# BlockIomadCompanyAdminRestrictCapabilityRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow** | **bool** | Set capability? | [default to False]
**capability** | **str** | The capability | [default to 'null']
**companyid** | **int** | Company ID. Ignored if templateid is non-zero | [default to null]
**roleid** | **int** | Role ID | [default to null]
**templateid** | **int** | Template ID. Set to 0 if company restriction | [optional] [default to 0]

## Example

```python
from openapi_client.models.block_iomad_company_admin_restrict_capability_request import BlockIomadCompanyAdminRestrictCapabilityRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminRestrictCapabilityRequest from a JSON string
block_iomad_company_admin_restrict_capability_request_instance = BlockIomadCompanyAdminRestrictCapabilityRequest.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminRestrictCapabilityRequest.to_json())

# convert the object into a dict
block_iomad_company_admin_restrict_capability_request_dict = block_iomad_company_admin_restrict_capability_request_instance.to_dict()
# create an instance of BlockIomadCompanyAdminRestrictCapabilityRequest from a dict
block_iomad_company_admin_restrict_capability_request_from_dict = BlockIomadCompanyAdminRestrictCapabilityRequest.from_dict(block_iomad_company_admin_restrict_capability_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


