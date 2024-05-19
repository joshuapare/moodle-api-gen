# EnrolGuestGetInstanceInfo200ResponseInstanceinfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Id of course | [default to null]
**id** | **int** | Id of course enrolment instance | [default to null]
**name** | **str** | Name of enrolment plugin | [default to 'null']
**passwordrequired** | **bool** | Is a password required? | [default to False]
**status** | **bool** | Is the enrolment enabled? | [default to False]
**type** | **str** | Type of enrolment plugin | [default to 'null']

## Example

```python
from openapi_client.models.enrol_guest_get_instance_info200_response_instanceinfo import EnrolGuestGetInstanceInfo200ResponseInstanceinfo

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolGuestGetInstanceInfo200ResponseInstanceinfo from a JSON string
enrol_guest_get_instance_info200_response_instanceinfo_instance = EnrolGuestGetInstanceInfo200ResponseInstanceinfo.from_json(json)
# print the JSON string representation of the object
print(EnrolGuestGetInstanceInfo200ResponseInstanceinfo.to_json())

# convert the object into a dict
enrol_guest_get_instance_info200_response_instanceinfo_dict = enrol_guest_get_instance_info200_response_instanceinfo_instance.to_dict()
# create an instance of EnrolGuestGetInstanceInfo200ResponseInstanceinfo from a dict
enrol_guest_get_instance_info200_response_instanceinfo_from_dict = EnrolGuestGetInstanceInfo200ResponseInstanceinfo.from_dict(enrol_guest_get_instance_info200_response_instanceinfo_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


