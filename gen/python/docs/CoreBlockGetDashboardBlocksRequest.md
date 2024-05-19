# CoreBlockGetDashboardBlocksRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mypage** | **str** | What my page to return blocks of | [optional] [default to '__default']
**returncontents** | **bool** | Whether to return the block contents. | [optional] [default to False]
**userid** | **int** | User id (optional), default is current user. | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_block_get_dashboard_blocks_request import CoreBlockGetDashboardBlocksRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlockGetDashboardBlocksRequest from a JSON string
core_block_get_dashboard_blocks_request_instance = CoreBlockGetDashboardBlocksRequest.from_json(json)
# print the JSON string representation of the object
print(CoreBlockGetDashboardBlocksRequest.to_json())

# convert the object into a dict
core_block_get_dashboard_blocks_request_dict = core_block_get_dashboard_blocks_request_instance.to_dict()
# create an instance of CoreBlockGetDashboardBlocksRequest from a dict
core_block_get_dashboard_blocks_request_from_dict = CoreBlockGetDashboardBlocksRequest.from_dict(core_block_get_dashboard_blocks_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


