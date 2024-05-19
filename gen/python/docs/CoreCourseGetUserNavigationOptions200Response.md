# CoreCourseGetUserNavigationOptions200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courses** | [**List[CoreCourseGetUserNavigationOptions200ResponseCoursesInner]**](CoreCourseGetUserNavigationOptions200ResponseCoursesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_course_get_user_navigation_options200_response import CoreCourseGetUserNavigationOptions200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetUserNavigationOptions200Response from a JSON string
core_course_get_user_navigation_options200_response_instance = CoreCourseGetUserNavigationOptions200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetUserNavigationOptions200Response.to_json())

# convert the object into a dict
core_course_get_user_navigation_options200_response_dict = core_course_get_user_navigation_options200_response_instance.to_dict()
# create an instance of CoreCourseGetUserNavigationOptions200Response from a dict
core_course_get_user_navigation_options200_response_from_dict = CoreCourseGetUserNavigationOptions200Response.from_dict(core_course_get_user_navigation_options200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


