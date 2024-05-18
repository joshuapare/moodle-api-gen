# CoreCourseSearchCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courses** | [**List[CoreCourseSearchCourses200ResponseCoursesInner]**](CoreCourseSearchCourses200ResponseCoursesInner.md) |  | 
**total** | **int** | total course count | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_course_search_courses200_response import CoreCourseSearchCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseSearchCourses200Response from a JSON string
core_course_search_courses200_response_instance = CoreCourseSearchCourses200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCourseSearchCourses200Response.to_json())

# convert the object into a dict
core_course_search_courses200_response_dict = core_course_search_courses200_response_instance.to_dict()
# create an instance of CoreCourseSearchCourses200Response from a dict
core_course_search_courses200_response_from_dict = CoreCourseSearchCourses200Response.from_dict(core_course_search_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


