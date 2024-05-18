# BlockIomadCompanyAdminEnrolUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enrolments** | [**List[BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner]**](BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner.md) |  | 

## Example

```python
from openapi_client.models.block_iomad_company_admin_enrol_users_request import BlockIomadCompanyAdminEnrolUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminEnrolUsersRequest from a JSON string
block_iomad_company_admin_enrol_users_request_instance = BlockIomadCompanyAdminEnrolUsersRequest.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminEnrolUsersRequest.to_json())

# convert the object into a dict
block_iomad_company_admin_enrol_users_request_dict = block_iomad_company_admin_enrol_users_request_instance.to_dict()
# create an instance of BlockIomadCompanyAdminEnrolUsersRequest from a dict
block_iomad_company_admin_enrol_users_request_from_dict = BlockIomadCompanyAdminEnrolUsersRequest.from_dict(block_iomad_company_admin_enrol_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


