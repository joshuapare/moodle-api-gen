# CoreSearchGetTopResults200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List[CoreSearchGetTopResults200ResponseResultsInner]**](CoreSearchGetTopResults200ResponseResultsInner.md) |  | 

## Example

```python
from openapi_client.models.core_search_get_top_results200_response import CoreSearchGetTopResults200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreSearchGetTopResults200Response from a JSON string
core_search_get_top_results200_response_instance = CoreSearchGetTopResults200Response.from_json(json)
# print the JSON string representation of the object
print(CoreSearchGetTopResults200Response.to_json())

# convert the object into a dict
core_search_get_top_results200_response_dict = core_search_get_top_results200_response_instance.to_dict()
# create an instance of CoreSearchGetTopResults200Response from a dict
core_search_get_top_results200_response_from_dict = CoreSearchGetTopResults200Response.from_dict(core_search_get_top_results200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


