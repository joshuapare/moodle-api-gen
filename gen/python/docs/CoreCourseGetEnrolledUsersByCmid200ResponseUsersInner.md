# CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstname** | **str** | The first name(s) of the user | [optional] 
**fullname** | **str** | The full name of the user | [optional] [default to 'null']
**id** | **int** | ID of the user | [optional] [default to null]
**lastname** | **str** | The family name of the user | [optional] 
**profileimage** | **str** | The location of the users larger image | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_course_get_enrolled_users_by_cmid200_response_users_inner import CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner from a JSON string
core_course_get_enrolled_users_by_cmid200_response_users_inner_instance = CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner.to_json())

# convert the object into a dict
core_course_get_enrolled_users_by_cmid200_response_users_inner_dict = core_course_get_enrolled_users_by_cmid200_response_users_inner_instance.to_dict()
# create an instance of CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner from a dict
core_course_get_enrolled_users_by_cmid200_response_users_inner_from_dict = CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner.from_dict(core_course_get_enrolled_users_by_cmid200_response_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


