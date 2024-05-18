# EnrolManualUnenrolUsersRequestEnrolmentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | The course to unenrol the user from | [optional] [default to null]
**roleid** | **int** | The user role | [optional] [default to null]
**userid** | **int** | The user that is going to be unenrolled | [optional] [default to null]

## Example

```python
from openapi_client.models.enrol_manual_unenrol_users_request_enrolments_inner import EnrolManualUnenrolUsersRequestEnrolmentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolManualUnenrolUsersRequestEnrolmentsInner from a JSON string
enrol_manual_unenrol_users_request_enrolments_inner_instance = EnrolManualUnenrolUsersRequestEnrolmentsInner.from_json(json)
# print the JSON string representation of the object
print(EnrolManualUnenrolUsersRequestEnrolmentsInner.to_json())

# convert the object into a dict
enrol_manual_unenrol_users_request_enrolments_inner_dict = enrol_manual_unenrol_users_request_enrolments_inner_instance.to_dict()
# create an instance of EnrolManualUnenrolUsersRequestEnrolmentsInner from a dict
enrol_manual_unenrol_users_request_enrolments_inner_from_dict = EnrolManualUnenrolUsersRequestEnrolmentsInner.from_dict(enrol_manual_unenrol_users_request_enrolments_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


