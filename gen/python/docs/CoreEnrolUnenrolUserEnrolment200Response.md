# CoreEnrolUnenrolUserEnrolment200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner]**](CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner.md) |  | 
**result** | **bool** | True if the user&#39;s enrolment was successfully updated | 

## Example

```python
from openapi_client.models.core_enrol_unenrol_user_enrolment200_response import CoreEnrolUnenrolUserEnrolment200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreEnrolUnenrolUserEnrolment200Response from a JSON string
core_enrol_unenrol_user_enrolment200_response_instance = CoreEnrolUnenrolUserEnrolment200Response.from_json(json)
# print the JSON string representation of the object
print(CoreEnrolUnenrolUserEnrolment200Response.to_json())

# convert the object into a dict
core_enrol_unenrol_user_enrolment200_response_dict = core_enrol_unenrol_user_enrolment200_response_instance.to_dict()
# create an instance of CoreEnrolUnenrolUserEnrolment200Response from a dict
core_enrol_unenrol_user_enrolment200_response_from_dict = CoreEnrolUnenrolUserEnrolment200Response.from_dict(core_enrol_unenrol_user_enrolment200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


