# CoreGroupGetCourseUserGroups200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | [**List[CoreGroupGetCourseUserGroups200ResponseGroupsInner]**](CoreGroupGetCourseUserGroups200ResponseGroupsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_group_get_course_user_groups200_response import CoreGroupGetCourseUserGroups200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupGetCourseUserGroups200Response from a JSON string
core_group_get_course_user_groups200_response_instance = CoreGroupGetCourseUserGroups200Response.from_json(json)
# print the JSON string representation of the object
print(CoreGroupGetCourseUserGroups200Response.to_json())

# convert the object into a dict
core_group_get_course_user_groups200_response_dict = core_group_get_course_user_groups200_response_instance.to_dict()
# create an instance of CoreGroupGetCourseUserGroups200Response from a dict
core_group_get_course_user_groups200_response_from_dict = CoreGroupGetCourseUserGroups200Response.from_dict(core_group_get_course_user_groups200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


