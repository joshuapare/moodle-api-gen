# CoreBlockGetDashboardBlocks200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blocks** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_block_get_dashboard_blocks200_response import CoreBlockGetDashboardBlocks200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlockGetDashboardBlocks200Response from a JSON string
core_block_get_dashboard_blocks200_response_instance = CoreBlockGetDashboardBlocks200Response.from_json(json)
# print the JSON string representation of the object
print(CoreBlockGetDashboardBlocks200Response.to_json())

# convert the object into a dict
core_block_get_dashboard_blocks200_response_dict = core_block_get_dashboard_blocks200_response_instance.to_dict()
# create an instance of CoreBlockGetDashboardBlocks200Response from a dict
core_block_get_dashboard_blocks200_response_from_dict = CoreBlockGetDashboardBlocks200Response.from_dict(core_block_get_dashboard_blocks200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


