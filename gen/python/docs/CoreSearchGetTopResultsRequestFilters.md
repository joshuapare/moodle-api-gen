# CoreSearchGetTopResultsRequestFilters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**areaids** | **List[object]** |  | [optional] 
**cat** | **str** | category to filter areas | [optional] [default to '']
**contextids** | **List[object]** |  | [optional] 
**courseids** | **List[object]** |  | [optional] 
**groupids** | **List[object]** |  | [optional] 
**mycoursesonly** | **bool** | only results from my courses | [optional] [default to False]
**order** | **str** | how to order | [optional] [default to '']
**timeend** | **int** | docs modified before this date | [optional] [default to 0]
**timestart** | **int** | docs modified after this date | [optional] [default to 0]
**title** | **str** | result title | [optional] 
**userids** | **List[object]** |  | [optional] 

## Example

```python
from openapi_client.models.core_search_get_top_results_request_filters import CoreSearchGetTopResultsRequestFilters

# TODO update the JSON string below
json = "{}"
# create an instance of CoreSearchGetTopResultsRequestFilters from a JSON string
core_search_get_top_results_request_filters_instance = CoreSearchGetTopResultsRequestFilters.from_json(json)
# print the JSON string representation of the object
print(CoreSearchGetTopResultsRequestFilters.to_json())

# convert the object into a dict
core_search_get_top_results_request_filters_dict = core_search_get_top_results_request_filters_instance.to_dict()
# create an instance of CoreSearchGetTopResultsRequestFilters from a dict
core_search_get_top_results_request_filters_from_dict = CoreSearchGetTopResultsRequestFilters.from_dict(core_search_get_top_results_request_filters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


