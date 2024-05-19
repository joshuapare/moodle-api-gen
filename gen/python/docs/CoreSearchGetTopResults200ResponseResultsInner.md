# CoreSearchGetTopResults200ResponseResultsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**areaname** | **str** | search area name | [optional] 
**componentname** | **str** | component name | [optional] 
**content** | **str** | result contents | [optional] [default to '']
**contextid** | **int** | result context id | [optional] 
**contexturl** | **str** | result context url | [optional] 
**coursefullname** | **str** | result course fullname | [optional] 
**courseurl** | **str** | result course url | [optional] 
**description1** | **str** | extra result contents, depends on the search area | [optional] [default to '']
**description2** | **str** | extra result contents, depends on the search area | [optional] [default to '']
**docurl** | **str** | result url | [optional] 
**filename** | **str** | result file name if present | [optional] 
**filenames** | **str** | result file names if present | [optional] 
**iconurl** | **str** | icon url | [optional] [default to '']
**itemid** | **int** | unique id in the search area scope | [optional] 
**multiplefiles** | **int** | whether multiple files are returned or not | [optional] 
**textformat** | **int** | text fields format, it is the same for all of them | [optional] 
**timemodified** | **int** | result modified time | [optional] 
**title** | **str** | result title | [optional] 
**userfullname** | **str** | user fullname | [optional] 
**userid** | **int** | user id | [optional] 
**userurl** | **str** | user url | [optional] 

## Example

```python
from openapi_client.models.core_search_get_top_results200_response_results_inner import CoreSearchGetTopResults200ResponseResultsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreSearchGetTopResults200ResponseResultsInner from a JSON string
core_search_get_top_results200_response_results_inner_instance = CoreSearchGetTopResults200ResponseResultsInner.from_json(json)
# print the JSON string representation of the object
print(CoreSearchGetTopResults200ResponseResultsInner.to_json())

# convert the object into a dict
core_search_get_top_results200_response_results_inner_dict = core_search_get_top_results200_response_results_inner_instance.to_dict()
# create an instance of CoreSearchGetTopResults200ResponseResultsInner from a dict
core_search_get_top_results200_response_results_inner_from_dict = CoreSearchGetTopResults200ResponseResultsInner.from_dict(core_search_get_top_results200_response_results_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


