# CoreSearchGetResultsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**CoreSearchGetResultsRequestFilters**](CoreSearchGetResultsRequestFilters.md) |  | [optional] 
**page** | **int** | results page number starting from 0, defaults to the first page | [optional] [default to 0]
**query** | **str** | the search query | [default to 'null']

## Example

```python
from openapi_client.models.core_search_get_results_request import CoreSearchGetResultsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreSearchGetResultsRequest from a JSON string
core_search_get_results_request_instance = CoreSearchGetResultsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreSearchGetResultsRequest.to_json())

# convert the object into a dict
core_search_get_results_request_dict = core_search_get_results_request_instance.to_dict()
# create an instance of CoreSearchGetResultsRequest from a dict
core_search_get_results_request_from_dict = CoreSearchGetResultsRequest.from_dict(core_search_get_results_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


