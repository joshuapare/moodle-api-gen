# CoreCourseformatUpdateCourseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** | action: cm_hide, cm_show, section_hide, section_show, cm_moveleft... | [default to 'null']
**courseid** | **int** | course id | 
**ids** | **List[object]** |  | [optional] 
**targetcmid** | **int** | Optional target cm id | [optional] [default to null]
**targetsectionid** | **int** | Optional target section id | [optional] [default to null]

## Example

```python
from openapi_client.models.core_courseformat_update_course_request import CoreCourseformatUpdateCourseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseformatUpdateCourseRequest from a JSON string
core_courseformat_update_course_request_instance = CoreCourseformatUpdateCourseRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseformatUpdateCourseRequest.to_json())

# convert the object into a dict
core_courseformat_update_course_request_dict = core_courseformat_update_course_request_instance.to_dict()
# create an instance of CoreCourseformatUpdateCourseRequest from a dict
core_courseformat_update_course_request_from_dict = CoreCourseformatUpdateCourseRequest.from_dict(core_courseformat_update_course_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


