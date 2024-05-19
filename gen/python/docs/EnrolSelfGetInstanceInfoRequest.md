# EnrolSelfGetInstanceInfoRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceid** | **int** | instance id of self enrolment plugin. | [default to null]

## Example

```python
from openapi_client.models.enrol_self_get_instance_info_request import EnrolSelfGetInstanceInfoRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolSelfGetInstanceInfoRequest from a JSON string
enrol_self_get_instance_info_request_instance = EnrolSelfGetInstanceInfoRequest.from_json(json)
# print the JSON string representation of the object
print(EnrolSelfGetInstanceInfoRequest.to_json())

# convert the object into a dict
enrol_self_get_instance_info_request_dict = enrol_self_get_instance_info_request_instance.to_dict()
# create an instance of EnrolSelfGetInstanceInfoRequest from a dict
enrol_self_get_instance_info_request_from_dict = EnrolSelfGetInstanceInfoRequest.from_dict(enrol_self_get_instance_info_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


