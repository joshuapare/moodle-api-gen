# CoreCourseGetActivityChooserFooterRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | ID of the course | [default to null]
**sectionid** | **int** | ID of the section | [default to null]

## Example

```python
from openapi_client.models.core_course_get_activity_chooser_footer_request import CoreCourseGetActivityChooserFooterRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetActivityChooserFooterRequest from a JSON string
core_course_get_activity_chooser_footer_request_instance = CoreCourseGetActivityChooserFooterRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetActivityChooserFooterRequest.to_json())

# convert the object into a dict
core_course_get_activity_chooser_footer_request_dict = core_course_get_activity_chooser_footer_request_instance.to_dict()
# create an instance of CoreCourseGetActivityChooserFooterRequest from a dict
core_course_get_activity_chooser_footer_request_from_dict = CoreCourseGetActivityChooserFooterRequest.from_dict(core_course_get_activity_chooser_footer_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


