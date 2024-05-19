# ToolDataprivacySetContextFormRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jsonformdata** | **str** | The context level data, encoded as a json array | [default to 'null']

## Example

```python
from openapi_client.models.tool_dataprivacy_set_context_form_request import ToolDataprivacySetContextFormRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolDataprivacySetContextFormRequest from a JSON string
tool_dataprivacy_set_context_form_request_instance = ToolDataprivacySetContextFormRequest.from_json(json)
# print the JSON string representation of the object
print(ToolDataprivacySetContextFormRequest.to_json())

# convert the object into a dict
tool_dataprivacy_set_context_form_request_dict = tool_dataprivacy_set_context_form_request_instance.to_dict()
# create an instance of ToolDataprivacySetContextFormRequest from a dict
tool_dataprivacy_set_context_form_request_from_dict = ToolDataprivacySetContextFormRequest.from_dict(tool_dataprivacy_set_context_form_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


