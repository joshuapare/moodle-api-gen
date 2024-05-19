# CoreSearchViewResultsRequestFilters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**areaids** | **List[object]** |  | [optional] 
**courseids** | **List[object]** |  | [optional] 
**timeend** | **int** | docs modified before this date | [optional] [default to 0]
**timestart** | **int** | docs modified after this date | [optional] [default to 0]
**title** | **str** | result title | [optional] 

## Example

```python
from openapi_client.models.core_search_view_results_request_filters import CoreSearchViewResultsRequestFilters

# TODO update the JSON string below
json = "{}"
# create an instance of CoreSearchViewResultsRequestFilters from a JSON string
core_search_view_results_request_filters_instance = CoreSearchViewResultsRequestFilters.from_json(json)
# print the JSON string representation of the object
print(CoreSearchViewResultsRequestFilters.to_json())

# convert the object into a dict
core_search_view_results_request_filters_dict = core_search_view_results_request_filters_instance.to_dict()
# create an instance of CoreSearchViewResultsRequestFilters from a dict
core_search_view_results_request_filters_from_dict = CoreSearchViewResultsRequestFilters.from_dict(core_search_view_results_request_filters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


