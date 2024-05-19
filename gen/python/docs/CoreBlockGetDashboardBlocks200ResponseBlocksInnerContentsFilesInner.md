# CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner

File.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | **str** | File name. | [optional] 
**filepath** | **str** | File path. | [optional] 
**filesize** | **int** | File size. | [optional] 
**fileurl** | **str** | Downloadable file url. | [optional] 
**isexternalfile** | **bool** | Whether is an external file. | [optional] 
**mimetype** | **str** | File mime type. | [optional] 
**repositorytype** | **str** | The repository type for external files. | [optional] 
**timemodified** | **int** | Time modified. | [optional] 

## Example

```python
from openapi_client.models.core_block_get_dashboard_blocks200_response_blocks_inner_contents_files_inner import CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner from a JSON string
core_block_get_dashboard_blocks200_response_blocks_inner_contents_files_inner_instance = CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.from_json(json)
# print the JSON string representation of the object
print(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.to_json())

# convert the object into a dict
core_block_get_dashboard_blocks200_response_blocks_inner_contents_files_inner_dict = core_block_get_dashboard_blocks200_response_blocks_inner_contents_files_inner_instance.to_dict()
# create an instance of CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner from a dict
core_block_get_dashboard_blocks200_response_blocks_inner_contents_files_inner_from_dict = CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.from_dict(core_block_get_dashboard_blocks200_response_blocks_inner_contents_files_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


