# CoreEnrolGetUsersCoursesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**returnusercount** | **bool** | Include count of enrolled users for each course? This can add several seconds to the response time if a user is on several large courses, so set this to false if the value will not be used to improve performance. | [optional] [default to True]
**userid** | **int** | user id | 

## Example

```python
from openapi_client.models.core_enrol_get_users_courses_request import CoreEnrolGetUsersCoursesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreEnrolGetUsersCoursesRequest from a JSON string
core_enrol_get_users_courses_request_instance = CoreEnrolGetUsersCoursesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreEnrolGetUsersCoursesRequest.to_json())

# convert the object into a dict
core_enrol_get_users_courses_request_dict = core_enrol_get_users_courses_request_instance.to_dict()
# create an instance of CoreEnrolGetUsersCoursesRequest from a dict
core_enrol_get_users_courses_request_from_dict = CoreEnrolGetUsersCoursesRequest.from_dict(core_enrol_get_users_courses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


