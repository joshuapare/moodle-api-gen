# CoreMoodlenetGetSharedCourseInfo200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**issuerid** | **int** | MoodleNet issuer id | 
**name** | **str** | Course short name | [default to 'null']
**server** | **str** | MoodleNet server | 
**status** | **bool** | status: true if success | 
**supportpageurl** | **str** | Support page URL | 
**type** | **str** | Course type | [default to 'null']
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_moodlenet_get_shared_course_info200_response import CoreMoodlenetGetSharedCourseInfo200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMoodlenetGetSharedCourseInfo200Response from a JSON string
core_moodlenet_get_shared_course_info200_response_instance = CoreMoodlenetGetSharedCourseInfo200Response.from_json(json)
# print the JSON string representation of the object
print(CoreMoodlenetGetSharedCourseInfo200Response.to_json())

# convert the object into a dict
core_moodlenet_get_shared_course_info200_response_dict = core_moodlenet_get_shared_course_info200_response_instance.to_dict()
# create an instance of CoreMoodlenetGetSharedCourseInfo200Response from a dict
core_moodlenet_get_shared_course_info200_response_from_dict = CoreMoodlenetGetSharedCourseInfo200Response.from_dict(core_moodlenet_get_shared_course_info200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


