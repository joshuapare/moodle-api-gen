# EnrolManualUnenrolUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enrolments** | [**List[EnrolManualUnenrolUsersRequestEnrolmentsInner]**](EnrolManualUnenrolUsersRequestEnrolmentsInner.md) |  | 

## Example

```python
from openapi_client.models.enrol_manual_unenrol_users_request import EnrolManualUnenrolUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolManualUnenrolUsersRequest from a JSON string
enrol_manual_unenrol_users_request_instance = EnrolManualUnenrolUsersRequest.from_json(json)
# print the JSON string representation of the object
print(EnrolManualUnenrolUsersRequest.to_json())

# convert the object into a dict
enrol_manual_unenrol_users_request_dict = enrol_manual_unenrol_users_request_instance.to_dict()
# create an instance of EnrolManualUnenrolUsersRequest from a dict
enrol_manual_unenrol_users_request_from_dict = EnrolManualUnenrolUsersRequest.from_dict(enrol_manual_unenrol_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


