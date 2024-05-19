# ToolDataprivacyTreeExtraBranchesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | The context id to expand | [default to null]
**element** | **str** | The element we are interested on | [default to 'null']

## Example

```python
from openapi_client.models.tool_dataprivacy_tree_extra_branches_request import ToolDataprivacyTreeExtraBranchesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolDataprivacyTreeExtraBranchesRequest from a JSON string
tool_dataprivacy_tree_extra_branches_request_instance = ToolDataprivacyTreeExtraBranchesRequest.from_json(json)
# print the JSON string representation of the object
print(ToolDataprivacyTreeExtraBranchesRequest.to_json())

# convert the object into a dict
tool_dataprivacy_tree_extra_branches_request_dict = tool_dataprivacy_tree_extra_branches_request_instance.to_dict()
# create an instance of ToolDataprivacyTreeExtraBranchesRequest from a dict
tool_dataprivacy_tree_extra_branches_request_from_dict = ToolDataprivacyTreeExtraBranchesRequest.from_dict(tool_dataprivacy_tree_extra_branches_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


