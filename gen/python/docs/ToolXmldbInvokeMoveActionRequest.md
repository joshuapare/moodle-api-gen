# ToolXmldbInvokeMoveActionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** | Action | [default to 'null']
**dir** | **str** | Plugin that is being edited | [default to 'null']
**var_field** | **str** | Field name | [optional] [default to '']
**index** | **str** | Index name | [optional] [default to '']
**key** | **str** | Key name | [optional] [default to '']
**position** | **int** | How many positions to move by (negative - up, positive - down) | [default to null]
**table** | **str** | Table name | [default to 'null']

## Example

```python
from openapi_client.models.tool_xmldb_invoke_move_action_request import ToolXmldbInvokeMoveActionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolXmldbInvokeMoveActionRequest from a JSON string
tool_xmldb_invoke_move_action_request_instance = ToolXmldbInvokeMoveActionRequest.from_json(json)
# print the JSON string representation of the object
print(ToolXmldbInvokeMoveActionRequest.to_json())

# convert the object into a dict
tool_xmldb_invoke_move_action_request_dict = tool_xmldb_invoke_move_action_request_instance.to_dict()
# create an instance of ToolXmldbInvokeMoveActionRequest from a dict
tool_xmldb_invoke_move_action_request_from_dict = ToolXmldbInvokeMoveActionRequest.from_dict(tool_xmldb_invoke_move_action_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


