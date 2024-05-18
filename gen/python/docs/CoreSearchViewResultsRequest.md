# CoreSearchViewResultsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**CoreSearchViewResultsRequestFilters**](CoreSearchViewResultsRequestFilters.md) |  | [optional] 
**page** | **int** | results page number starting from 0, defaults to the first page | [optional] [default to 0]
**query** | **str** | the search query | 

## Example

```python
from openapi_client.models.core_search_view_results_request import CoreSearchViewResultsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreSearchViewResultsRequest from a JSON string
core_search_view_results_request_instance = CoreSearchViewResultsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreSearchViewResultsRequest.to_json())

# convert the object into a dict
core_search_view_results_request_dict = core_search_view_results_request_instance.to_dict()
# create an instance of CoreSearchViewResultsRequest from a dict
core_search_view_results_request_from_dict = CoreSearchViewResultsRequest.from_dict(core_search_view_results_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


