# CoreMoodlenetSendCourseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmids** | **List[object]** |  | [optional] 
**courseid** | **int** | Course ID | 
**issuerid** | **int** | OAuth 2 issuer ID | 
**shareformat** | **int** | Share format | 

## Example

```python
from openapi_client.models.core_moodlenet_send_course_request import CoreMoodlenetSendCourseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMoodlenetSendCourseRequest from a JSON string
core_moodlenet_send_course_request_instance = CoreMoodlenetSendCourseRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMoodlenetSendCourseRequest.to_json())

# convert the object into a dict
core_moodlenet_send_course_request_dict = core_moodlenet_send_course_request_instance.to_dict()
# create an instance of CoreMoodlenetSendCourseRequest from a dict
core_moodlenet_send_course_request_from_dict = CoreMoodlenetSendCourseRequest.from_dict(core_moodlenet_send_course_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


