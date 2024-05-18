# EnrolLicenseEnrolUserRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Id of the course | [default to null]
**instanceid** | **int** | Instance id oflicenseenrolment plugin. | [optional] [default to 0]
**password** | **str** | Enrolment key | [optional] [default to '']

## Example

```python
from openapi_client.models.enrol_license_enrol_user_request import EnrolLicenseEnrolUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolLicenseEnrolUserRequest from a JSON string
enrol_license_enrol_user_request_instance = EnrolLicenseEnrolUserRequest.from_json(json)
# print the JSON string representation of the object
print(EnrolLicenseEnrolUserRequest.to_json())

# convert the object into a dict
enrol_license_enrol_user_request_dict = enrol_license_enrol_user_request_instance.to_dict()
# create an instance of EnrolLicenseEnrolUserRequest from a dict
enrol_license_enrol_user_request_from_dict = EnrolLicenseEnrolUserRequest.from_dict(enrol_license_enrol_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


