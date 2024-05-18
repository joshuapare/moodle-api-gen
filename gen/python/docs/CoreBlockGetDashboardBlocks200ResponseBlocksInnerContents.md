# CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | Block contents. | 
**contentformat** | **int** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | 
**files** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | 
**footer** | **str** | Block footer. | 
**title** | **str** | Block title. | 

## Example

```python
from openapi_client.models.core_block_get_dashboard_blocks200_response_blocks_inner_contents import CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents from a JSON string
core_block_get_dashboard_blocks200_response_blocks_inner_contents_instance = CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents.from_json(json)
# print the JSON string representation of the object
print(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents.to_json())

# convert the object into a dict
core_block_get_dashboard_blocks200_response_blocks_inner_contents_dict = core_block_get_dashboard_blocks200_response_blocks_inner_contents_instance.to_dict()
# create an instance of CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents from a dict
core_block_get_dashboard_blocks200_response_blocks_inner_contents_from_dict = CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents.from_dict(core_block_get_dashboard_blocks200_response_blocks_inner_contents_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


