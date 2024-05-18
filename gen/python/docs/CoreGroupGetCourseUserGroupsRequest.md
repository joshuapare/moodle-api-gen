# CoreGroupGetCourseUserGroupsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Id of course (empty or 0 for all the courses where the user is enrolled). | [optional] [default to 0]
**groupingid** | **int** | returns only groups in the specified grouping | [optional] [default to 0]
**userid** | **int** | Id of user (empty or 0 for current user). | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_group_get_course_user_groups_request import CoreGroupGetCourseUserGroupsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupGetCourseUserGroupsRequest from a JSON string
core_group_get_course_user_groups_request_instance = CoreGroupGetCourseUserGroupsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGroupGetCourseUserGroupsRequest.to_json())

# convert the object into a dict
core_group_get_course_user_groups_request_dict = core_group_get_course_user_groups_request_instance.to_dict()
# create an instance of CoreGroupGetCourseUserGroupsRequest from a dict
core_group_get_course_user_groups_request_from_dict = CoreGroupGetCourseUserGroupsRequest.from_dict(core_group_get_course_user_groups_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


