# CoreCourseImportCourseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deletecontent** | **int** | whether to delete the course content where we are importing to (default to 0 &#x3D; No) | [optional] [default to 0]
**importfrom** | **int** | the id of the course we are importing from | [default to null]
**importto** | **int** | the id of the course we are importing to | [default to null]
**options** | [**List[CoreCourseImportCourseRequestOptionsInner]**](CoreCourseImportCourseRequestOptionsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_course_import_course_request import CoreCourseImportCourseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseImportCourseRequest from a JSON string
core_course_import_course_request_instance = CoreCourseImportCourseRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseImportCourseRequest.to_json())

# convert the object into a dict
core_course_import_course_request_dict = core_course_import_course_request_instance.to_dict()
# create an instance of CoreCourseImportCourseRequest from a dict
core_course_import_course_request_from_dict = CoreCourseImportCourseRequest.from_dict(core_course_import_course_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


