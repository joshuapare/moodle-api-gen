# EnrolLicenseGetInstanceInfoRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceid** | **int** | instance id of license enrolment plugin. | [default to null]

## Example

```python
from openapi_client.models.enrol_license_get_instance_info_request import EnrolLicenseGetInstanceInfoRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolLicenseGetInstanceInfoRequest from a JSON string
enrol_license_get_instance_info_request_instance = EnrolLicenseGetInstanceInfoRequest.from_json(json)
# print the JSON string representation of the object
print(EnrolLicenseGetInstanceInfoRequest.to_json())

# convert the object into a dict
enrol_license_get_instance_info_request_dict = enrol_license_get_instance_info_request_instance.to_dict()
# create an instance of EnrolLicenseGetInstanceInfoRequest from a dict
enrol_license_get_instance_info_request_from_dict = EnrolLicenseGetInstanceInfoRequest.from_dict(enrol_license_get_instance_info_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


