# CoreCourseGetContentsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | course id | 
**options** | [**List[CoreCourseGetContentsRequestOptionsInner]**](CoreCourseGetContentsRequestOptionsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_course_get_contents_request import CoreCourseGetContentsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetContentsRequest from a JSON string
core_course_get_contents_request_instance = CoreCourseGetContentsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetContentsRequest.to_json())

# convert the object into a dict
core_course_get_contents_request_dict = core_course_get_contents_request_instance.to_dict()
# create an instance of CoreCourseGetContentsRequest from a dict
core_course_get_contents_request_from_dict = CoreCourseGetContentsRequest.from_dict(core_course_get_contents_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


