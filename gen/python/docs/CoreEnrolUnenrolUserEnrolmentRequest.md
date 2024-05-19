# CoreEnrolUnenrolUserEnrolmentRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ueid** | **int** | User enrolment ID | [default to null]

## Example

```python
from openapi_client.models.core_enrol_unenrol_user_enrolment_request import CoreEnrolUnenrolUserEnrolmentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreEnrolUnenrolUserEnrolmentRequest from a JSON string
core_enrol_unenrol_user_enrolment_request_instance = CoreEnrolUnenrolUserEnrolmentRequest.from_json(json)
# print the JSON string representation of the object
print(CoreEnrolUnenrolUserEnrolmentRequest.to_json())

# convert the object into a dict
core_enrol_unenrol_user_enrolment_request_dict = core_enrol_unenrol_user_enrolment_request_instance.to_dict()
# create an instance of CoreEnrolUnenrolUserEnrolmentRequest from a dict
core_enrol_unenrol_user_enrolment_request_from_dict = CoreEnrolUnenrolUserEnrolmentRequest.from_dict(core_enrol_unenrol_user_enrolment_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


