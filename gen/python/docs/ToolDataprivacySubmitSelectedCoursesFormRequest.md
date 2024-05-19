# ToolDataprivacySubmitSelectedCoursesFormRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jsonformdata** | **str** | The data of selected courses form, encoded as a json array | [default to 'null']
**requestid** | **int** | The id of data request | [default to null]

## Example

```python
from openapi_client.models.tool_dataprivacy_submit_selected_courses_form_request import ToolDataprivacySubmitSelectedCoursesFormRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolDataprivacySubmitSelectedCoursesFormRequest from a JSON string
tool_dataprivacy_submit_selected_courses_form_request_instance = ToolDataprivacySubmitSelectedCoursesFormRequest.from_json(json)
# print the JSON string representation of the object
print(ToolDataprivacySubmitSelectedCoursesFormRequest.to_json())

# convert the object into a dict
tool_dataprivacy_submit_selected_courses_form_request_dict = tool_dataprivacy_submit_selected_courses_form_request_instance.to_dict()
# create an instance of ToolDataprivacySubmitSelectedCoursesFormRequest from a dict
tool_dataprivacy_submit_selected_courses_form_request_from_dict = ToolDataprivacySubmitSelectedCoursesFormRequest.from_dict(tool_dataprivacy_submit_selected_courses_form_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


