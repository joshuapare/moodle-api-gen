# CoreMoodlenetSendCourse200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resourceurl** | **str** | Resource URL from MoodleNet | 
**status** | **bool** | Status: true if success | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_moodlenet_send_course200_response import CoreMoodlenetSendCourse200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMoodlenetSendCourse200Response from a JSON string
core_moodlenet_send_course200_response_instance = CoreMoodlenetSendCourse200Response.from_json(json)
# print the JSON string representation of the object
print(CoreMoodlenetSendCourse200Response.to_json())

# convert the object into a dict
core_moodlenet_send_course200_response_dict = core_moodlenet_send_course200_response_instance.to_dict()
# create an instance of CoreMoodlenetSendCourse200Response from a dict
core_moodlenet_send_course200_response_from_dict = CoreMoodlenetSendCourse200Response.from_dict(core_moodlenet_send_course200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


