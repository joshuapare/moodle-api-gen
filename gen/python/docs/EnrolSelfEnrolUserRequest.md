# EnrolSelfEnrolUserRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Id of the course | 
**instanceid** | **int** | Instance id of self enrolment plugin. | [optional] [default to 0]
**password** | **str** | Enrolment key | [optional] [default to '']

## Example

```python
from openapi_client.models.enrol_self_enrol_user_request import EnrolSelfEnrolUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolSelfEnrolUserRequest from a JSON string
enrol_self_enrol_user_request_instance = EnrolSelfEnrolUserRequest.from_json(json)
# print the JSON string representation of the object
print(EnrolSelfEnrolUserRequest.to_json())

# convert the object into a dict
enrol_self_enrol_user_request_dict = enrol_self_enrol_user_request_instance.to_dict()
# create an instance of EnrolSelfEnrolUserRequest from a dict
enrol_self_enrol_user_request_from_dict = EnrolSelfEnrolUserRequest.from_dict(enrol_self_enrol_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


