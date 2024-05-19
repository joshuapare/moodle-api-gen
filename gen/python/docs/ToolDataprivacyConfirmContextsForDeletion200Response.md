# ToolDataprivacyConfirmContextsForDeletion200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **bool** | Whether the record was properly marked for deletion or not | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.tool_dataprivacy_confirm_contexts_for_deletion200_response import ToolDataprivacyConfirmContextsForDeletion200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolDataprivacyConfirmContextsForDeletion200Response from a JSON string
tool_dataprivacy_confirm_contexts_for_deletion200_response_instance = ToolDataprivacyConfirmContextsForDeletion200Response.from_json(json)
# print the JSON string representation of the object
print(ToolDataprivacyConfirmContextsForDeletion200Response.to_json())

# convert the object into a dict
tool_dataprivacy_confirm_contexts_for_deletion200_response_dict = tool_dataprivacy_confirm_contexts_for_deletion200_response_instance.to_dict()
# create an instance of ToolDataprivacyConfirmContextsForDeletion200Response from a dict
tool_dataprivacy_confirm_contexts_for_deletion200_response_from_dict = ToolDataprivacyConfirmContextsForDeletion200Response.from_dict(tool_dataprivacy_confirm_contexts_for_deletion200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


