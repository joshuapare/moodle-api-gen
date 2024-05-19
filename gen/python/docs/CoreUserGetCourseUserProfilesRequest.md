# CoreUserGetCourseUserProfilesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userlist** | [**List[CoreUserGetCourseUserProfilesRequestUserlistInner]**](CoreUserGetCourseUserProfilesRequestUserlistInner.md) |  | 

## Example

```python
from openapi_client.models.core_user_get_course_user_profiles_request import CoreUserGetCourseUserProfilesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserGetCourseUserProfilesRequest from a JSON string
core_user_get_course_user_profiles_request_instance = CoreUserGetCourseUserProfilesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserGetCourseUserProfilesRequest.to_json())

# convert the object into a dict
core_user_get_course_user_profiles_request_dict = core_user_get_course_user_profiles_request_instance.to_dict()
# create an instance of CoreUserGetCourseUserProfilesRequest from a dict
core_user_get_course_user_profiles_request_from_dict = CoreUserGetCourseUserProfilesRequest.from_dict(core_user_get_course_user_profiles_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


