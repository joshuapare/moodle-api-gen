# CoreCompletionGetCourseCompletionStatus200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionstatus** | [**CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus**](CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_completion_get_course_completion_status200_response import CoreCompletionGetCourseCompletionStatus200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompletionGetCourseCompletionStatus200Response from a JSON string
core_completion_get_course_completion_status200_response_instance = CoreCompletionGetCourseCompletionStatus200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCompletionGetCourseCompletionStatus200Response.to_json())

# convert the object into a dict
core_completion_get_course_completion_status200_response_dict = core_completion_get_course_completion_status200_response_instance.to_dict()
# create an instance of CoreCompletionGetCourseCompletionStatus200Response from a dict
core_completion_get_course_completion_status200_response_from_dict = CoreCompletionGetCourseCompletionStatus200Response.from_dict(core_completion_get_course_completion_status200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


