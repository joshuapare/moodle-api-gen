# CoreSearchGetResults200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List[CoreSearchGetResults200ResponseResultsInner]**](CoreSearchGetResults200ResponseResultsInner.md) |  | 
**totalcount** | **int** | Total number of results | [default to null]

## Example

```python
from openapi_client.models.core_search_get_results200_response import CoreSearchGetResults200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreSearchGetResults200Response from a JSON string
core_search_get_results200_response_instance = CoreSearchGetResults200Response.from_json(json)
# print the JSON string representation of the object
print(CoreSearchGetResults200Response.to_json())

# convert the object into a dict
core_search_get_results200_response_dict = core_search_get_results200_response_instance.to_dict()
# create an instance of CoreSearchGetResults200Response from a dict
core_search_get_results200_response_from_dict = CoreSearchGetResults200Response.from_dict(core_search_get_results200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


