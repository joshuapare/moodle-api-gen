# BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | The course to enrol the user role in | [optional] [default to null]
**quantity** | **int** | Number of items purchased. | [optional] [default to null]
**roleid** | **int** | Role to assign to the user | [optional] [default to null]
**suspend** | **int** | set to 1 to suspend the enrolment | [optional] [default to null]
**timeend** | **int** | Timestamp when the enrolment end | [optional] [default to null]
**timestart** | **int** | Timestamp when the enrolment start | [optional] [default to null]
**userid** | **int** | The user that is going to be enrolled | [optional] [default to null]

## Example

```python
from openapi_client.models.block_iomad_company_admin_enrol_users_request_enrolments_inner import BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner from a JSON string
block_iomad_company_admin_enrol_users_request_enrolments_inner_instance = BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner.to_json())

# convert the object into a dict
block_iomad_company_admin_enrol_users_request_enrolments_inner_dict = block_iomad_company_admin_enrol_users_request_enrolments_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner from a dict
block_iomad_company_admin_enrol_users_request_enrolments_inner_from_dict = BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner.from_dict(block_iomad_company_admin_enrol_users_request_enrolments_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


