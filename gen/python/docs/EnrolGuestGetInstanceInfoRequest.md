# EnrolGuestGetInstanceInfoRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceid** | **int** | Instance id of guest enrolment plugin. | [default to null]

## Example

```python
from openapi_client.models.enrol_guest_get_instance_info_request import EnrolGuestGetInstanceInfoRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolGuestGetInstanceInfoRequest from a JSON string
enrol_guest_get_instance_info_request_instance = EnrolGuestGetInstanceInfoRequest.from_json(json)
# print the JSON string representation of the object
print(EnrolGuestGetInstanceInfoRequest.to_json())

# convert the object into a dict
enrol_guest_get_instance_info_request_dict = enrol_guest_get_instance_info_request_instance.to_dict()
# create an instance of EnrolGuestGetInstanceInfoRequest from a dict
enrol_guest_get_instance_info_request_from_dict = EnrolGuestGetInstanceInfoRequest.from_dict(enrol_guest_get_instance_info_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


