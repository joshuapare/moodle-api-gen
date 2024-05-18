# CoreCourseDuplicateCourseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **int** | duplicated course category parent | [default to null]
**courseid** | **int** | course to duplicate id | [default to null]
**fullname** | **str** | duplicated course full name | [default to 'null']
**options** | [**List[CoreCourseDuplicateCourseRequestOptionsInner]**](CoreCourseDuplicateCourseRequestOptionsInner.md) |  | [optional] 
**shortname** | **str** | duplicated course short name | [default to 'null']
**visible** | **int** | duplicated course visible, default to yes | [optional] [default to 1]

## Example

```python
from openapi_client.models.core_course_duplicate_course_request import CoreCourseDuplicateCourseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseDuplicateCourseRequest from a JSON string
core_course_duplicate_course_request_instance = CoreCourseDuplicateCourseRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseDuplicateCourseRequest.to_json())

# convert the object into a dict
core_course_duplicate_course_request_dict = core_course_duplicate_course_request_instance.to_dict()
# create an instance of CoreCourseDuplicateCourseRequest from a dict
core_course_duplicate_course_request_from_dict = CoreCourseDuplicateCourseRequest.from_dict(core_course_duplicate_course_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


