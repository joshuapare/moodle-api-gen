# CoreBlockFetchAddableBlocksRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pagecontextid** | **int** | The context ID of the page. | [default to null]
**pagehash** | **str** | Page hash | [optional] [default to '']
**pagelayout** | **str** | The layout of the page. | [default to 'null']
**pagetype** | **str** | The type of the page. | [default to 'null']
**subpage** | **str** | The subpage identifier | [optional] [default to '']

## Example

```python
from openapi_client.models.core_block_fetch_addable_blocks_request import CoreBlockFetchAddableBlocksRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlockFetchAddableBlocksRequest from a JSON string
core_block_fetch_addable_blocks_request_instance = CoreBlockFetchAddableBlocksRequest.from_json(json)
# print the JSON string representation of the object
print(CoreBlockFetchAddableBlocksRequest.to_json())

# convert the object into a dict
core_block_fetch_addable_blocks_request_dict = core_block_fetch_addable_blocks_request_instance.to_dict()
# create an instance of CoreBlockFetchAddableBlocksRequest from a dict
core_block_fetch_addable_blocks_request_from_dict = CoreBlockFetchAddableBlocksRequest.from_dict(core_block_fetch_addable_blocks_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


