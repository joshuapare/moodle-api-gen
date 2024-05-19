# ToolDataprivacyCreatePurposeFormRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jsonformdata** | **str** | The data to create the purpose, encoded as a json array | [default to 'null']

## Example

```python
from openapi_client.models.tool_dataprivacy_create_purpose_form_request import ToolDataprivacyCreatePurposeFormRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolDataprivacyCreatePurposeFormRequest from a JSON string
tool_dataprivacy_create_purpose_form_request_instance = ToolDataprivacyCreatePurposeFormRequest.from_json(json)
# print the JSON string representation of the object
print(ToolDataprivacyCreatePurposeFormRequest.to_json())

# convert the object into a dict
tool_dataprivacy_create_purpose_form_request_dict = tool_dataprivacy_create_purpose_form_request_instance.to_dict()
# create an instance of ToolDataprivacyCreatePurposeFormRequest from a dict
tool_dataprivacy_create_purpose_form_request_from_dict = ToolDataprivacyCreatePurposeFormRequest.from_dict(tool_dataprivacy_create_purpose_form_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


