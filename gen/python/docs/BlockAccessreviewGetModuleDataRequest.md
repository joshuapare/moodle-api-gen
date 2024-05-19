# BlockAccessreviewGetModuleDataRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | The course id to obtain results for. | [default to null]

## Example

```python
from openapi_client.models.block_accessreview_get_module_data_request import BlockAccessreviewGetModuleDataRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BlockAccessreviewGetModuleDataRequest from a JSON string
block_accessreview_get_module_data_request_instance = BlockAccessreviewGetModuleDataRequest.from_json(json)
# print the JSON string representation of the object
print(BlockAccessreviewGetModuleDataRequest.to_json())

# convert the object into a dict
block_accessreview_get_module_data_request_dict = block_accessreview_get_module_data_request_instance.to_dict()
# create an instance of BlockAccessreviewGetModuleDataRequest from a dict
block_accessreview_get_module_data_request_from_dict = BlockAccessreviewGetModuleDataRequest.from_dict(block_accessreview_get_module_data_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


