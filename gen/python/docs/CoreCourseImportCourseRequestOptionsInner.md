# CoreCourseImportCourseRequestOptionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The backup option name:                                             \&quot;activities\&quot; (int) Include course activites (default to 1 that is equal to yes),                                             \&quot;blocks\&quot; (int) Include course blocks (default to 1 that is equal to yes),                                             \&quot;filters\&quot; (int) Include course filters  (default to 1 that is equal to yes) | [optional] [default to 'null']
**value** | **str** | the value for the option 1 (yes) or 0 (no) | [optional] 

## Example

```python
from openapi_client.models.core_course_import_course_request_options_inner import CoreCourseImportCourseRequestOptionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseImportCourseRequestOptionsInner from a JSON string
core_course_import_course_request_options_inner_instance = CoreCourseImportCourseRequestOptionsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseImportCourseRequestOptionsInner.to_json())

# convert the object into a dict
core_course_import_course_request_options_inner_dict = core_course_import_course_request_options_inner_instance.to_dict()
# create an instance of CoreCourseImportCourseRequestOptionsInner from a dict
core_course_import_course_request_options_inner_from_dict = CoreCourseImportCourseRequestOptionsInner.from_dict(core_course_import_course_request_options_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


