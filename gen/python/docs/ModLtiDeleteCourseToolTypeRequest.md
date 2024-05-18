# ModLtiDeleteCourseToolTypeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tooltypeid** | **int** | Tool type ID | [default to null]

## Example

```python
from openapi_client.models.mod_lti_delete_course_tool_type_request import ModLtiDeleteCourseToolTypeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiDeleteCourseToolTypeRequest from a JSON string
mod_lti_delete_course_tool_type_request_instance = ModLtiDeleteCourseToolTypeRequest.from_json(json)
# print the JSON string representation of the object
print(ModLtiDeleteCourseToolTypeRequest.to_json())

# convert the object into a dict
mod_lti_delete_course_tool_type_request_dict = mod_lti_delete_course_tool_type_request_instance.to_dict()
# create an instance of ModLtiDeleteCourseToolTypeRequest from a dict
mod_lti_delete_course_tool_type_request_from_dict = ModLtiDeleteCourseToolTypeRequest.from_dict(mod_lti_delete_course_tool_type_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


