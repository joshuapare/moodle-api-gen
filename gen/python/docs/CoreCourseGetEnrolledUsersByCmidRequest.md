# CoreCourseGetEnrolledUsersByCmidRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmid** | **int** | id of the course module | [default to null]
**groupid** | **int** | id of the group | [optional] [default to 0]
**onlyactive** | **bool** | whether to return only active users or all. | [optional] [default to False]

## Example

```python
from openapi_client.models.core_course_get_enrolled_users_by_cmid_request import CoreCourseGetEnrolledUsersByCmidRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetEnrolledUsersByCmidRequest from a JSON string
core_course_get_enrolled_users_by_cmid_request_instance = CoreCourseGetEnrolledUsersByCmidRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetEnrolledUsersByCmidRequest.to_json())

# convert the object into a dict
core_course_get_enrolled_users_by_cmid_request_dict = core_course_get_enrolled_users_by_cmid_request_instance.to_dict()
# create an instance of CoreCourseGetEnrolledUsersByCmidRequest from a dict
core_course_get_enrolled_users_by_cmid_request_from_dict = CoreCourseGetEnrolledUsersByCmidRequest.from_dict(core_course_get_enrolled_users_by_cmid_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


