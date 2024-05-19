# CoreCourseGetEnrolledUsersByCmid200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users** | [**List[CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner]**](CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_course_get_enrolled_users_by_cmid200_response import CoreCourseGetEnrolledUsersByCmid200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetEnrolledUsersByCmid200Response from a JSON string
core_course_get_enrolled_users_by_cmid200_response_instance = CoreCourseGetEnrolledUsersByCmid200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetEnrolledUsersByCmid200Response.to_json())

# convert the object into a dict
core_course_get_enrolled_users_by_cmid200_response_dict = core_course_get_enrolled_users_by_cmid200_response_instance.to_dict()
# create an instance of CoreCourseGetEnrolledUsersByCmid200Response from a dict
core_course_get_enrolled_users_by_cmid200_response_from_dict = CoreCourseGetEnrolledUsersByCmid200Response.from_dict(core_course_get_enrolled_users_by_cmid200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


