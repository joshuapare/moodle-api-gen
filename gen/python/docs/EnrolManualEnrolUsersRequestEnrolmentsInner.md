# EnrolManualEnrolUsersRequestEnrolmentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | The course to enrol the user role in | [optional] 
**roleid** | **int** | Role to assign to the user | [optional] 
**suspend** | **int** | set to 1 to suspend the enrolment | [optional] 
**timeend** | **int** | Timestamp when the enrolment end | [optional] 
**timestart** | **int** | Timestamp when the enrolment start | [optional] 
**userid** | **int** | The user that is going to be enrolled | [optional] 

## Example

```python
from openapi_client.models.enrol_manual_enrol_users_request_enrolments_inner import EnrolManualEnrolUsersRequestEnrolmentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolManualEnrolUsersRequestEnrolmentsInner from a JSON string
enrol_manual_enrol_users_request_enrolments_inner_instance = EnrolManualEnrolUsersRequestEnrolmentsInner.from_json(json)
# print the JSON string representation of the object
print(EnrolManualEnrolUsersRequestEnrolmentsInner.to_json())

# convert the object into a dict
enrol_manual_enrol_users_request_enrolments_inner_dict = enrol_manual_enrol_users_request_enrolments_inner_instance.to_dict()
# create an instance of EnrolManualEnrolUsersRequestEnrolmentsInner from a dict
enrol_manual_enrol_users_request_enrolments_inner_from_dict = EnrolManualEnrolUsersRequestEnrolmentsInner.from_dict(enrol_manual_enrol_users_request_enrolments_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


