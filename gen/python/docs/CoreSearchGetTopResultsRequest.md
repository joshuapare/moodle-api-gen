# CoreSearchGetTopResultsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**CoreSearchGetTopResultsRequestFilters**](CoreSearchGetTopResultsRequestFilters.md) |  | [optional] 
**query** | **str** | the search query | 

## Example

```python
from openapi_client.models.core_search_get_top_results_request import CoreSearchGetTopResultsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreSearchGetTopResultsRequest from a JSON string
core_search_get_top_results_request_instance = CoreSearchGetTopResultsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreSearchGetTopResultsRequest.to_json())

# convert the object into a dict
core_search_get_top_results_request_dict = core_search_get_top_results_request_instance.to_dict()
# create an instance of CoreSearchGetTopResultsRequest from a dict
core_search_get_top_results_request_from_dict = CoreSearchGetTopResultsRequest.from_dict(core_search_get_top_results_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


