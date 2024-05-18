# CoreBlockGetDashboardBlocks200ResponseBlocksInner

Block information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collapsible** | **bool** | Whether the block is collapsible. | [optional] 
**configs** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerConfigsInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerConfigsInner.md) |  | [optional] 
**contents** | [**CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents.md) |  | [optional] 
**dockable** | **bool** | Whether the block is dockable. | [optional] 
**instanceid** | **int** | Block instance id. | [optional] 
**name** | **str** | Block name. | [optional] 
**positionid** | **int** | Position id. | [optional] 
**region** | **str** | Block region. | [optional] 
**visible** | **bool** | Whether the block is visible. | [optional] 
**weight** | **int** | Used to order blocks within a region. | [optional] 

## Example

```python
from openapi_client.models.core_block_get_dashboard_blocks200_response_blocks_inner import CoreBlockGetDashboardBlocks200ResponseBlocksInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlockGetDashboardBlocks200ResponseBlocksInner from a JSON string
core_block_get_dashboard_blocks200_response_blocks_inner_instance = CoreBlockGetDashboardBlocks200ResponseBlocksInner.from_json(json)
# print the JSON string representation of the object
print(CoreBlockGetDashboardBlocks200ResponseBlocksInner.to_json())

# convert the object into a dict
core_block_get_dashboard_blocks200_response_blocks_inner_dict = core_block_get_dashboard_blocks200_response_blocks_inner_instance.to_dict()
# create an instance of CoreBlockGetDashboardBlocks200ResponseBlocksInner from a dict
core_block_get_dashboard_blocks200_response_blocks_inner_from_dict = CoreBlockGetDashboardBlocks200ResponseBlocksInner.from_dict(core_block_get_dashboard_blocks200_response_blocks_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


