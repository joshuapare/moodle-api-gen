# EnrolLicenseGetInstanceInfo200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | id of course | 
**enrolpassword** | **str** | password required for enrolment | [optional] [default to 'null']
**id** | **int** | id of course enrolment instance | [default to null]
**name** | **str** | name of enrolment plugin | [default to 'null']
**status** | **str** | status of enrolment plugin | [default to 'null']
**type** | **str** | type of enrolment plugin | [default to 'null']

## Example

```python
from openapi_client.models.enrol_license_get_instance_info200_response import EnrolLicenseGetInstanceInfo200Response

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolLicenseGetInstanceInfo200Response from a JSON string
enrol_license_get_instance_info200_response_instance = EnrolLicenseGetInstanceInfo200Response.from_json(json)
# print the JSON string representation of the object
print(EnrolLicenseGetInstanceInfo200Response.to_json())

# convert the object into a dict
enrol_license_get_instance_info200_response_dict = enrol_license_get_instance_info200_response_instance.to_dict()
# create an instance of EnrolLicenseGetInstanceInfo200Response from a dict
enrol_license_get_instance_info200_response_from_dict = EnrolLicenseGetInstanceInfo200Response.from_dict(enrol_license_get_instance_info200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


