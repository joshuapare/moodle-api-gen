# ToolDataprivacyTreeExtraBranches200ResponseBranchesInner

Node structure

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branches** | [**List[ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner]**](ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner.md) |  | [optional] 
**contextid** | **int** | The node contextid | [optional] 
**contextlevel** | **int** | The node contextlevel | [optional] 
**expandcontextid** | **int** | The contextid this node expands | [optional] 
**expanded** | **int** | Is it expanded | [optional] 
**expandelement** | **str** | What element is this node expanded to | [optional] 
**text** | **str** | The node text | [optional] 

## Example

```python
from openapi_client.models.tool_dataprivacy_tree_extra_branches200_response_branches_inner import ToolDataprivacyTreeExtraBranches200ResponseBranchesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolDataprivacyTreeExtraBranches200ResponseBranchesInner from a JSON string
tool_dataprivacy_tree_extra_branches200_response_branches_inner_instance = ToolDataprivacyTreeExtraBranches200ResponseBranchesInner.from_json(json)
# print the JSON string representation of the object
print(ToolDataprivacyTreeExtraBranches200ResponseBranchesInner.to_json())

# convert the object into a dict
tool_dataprivacy_tree_extra_branches200_response_branches_inner_dict = tool_dataprivacy_tree_extra_branches200_response_branches_inner_instance.to_dict()
# create an instance of ToolDataprivacyTreeExtraBranches200ResponseBranchesInner from a dict
tool_dataprivacy_tree_extra_branches200_response_branches_inner_from_dict = ToolDataprivacyTreeExtraBranches200ResponseBranchesInner.from_dict(tool_dataprivacy_tree_extra_branches200_response_branches_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


