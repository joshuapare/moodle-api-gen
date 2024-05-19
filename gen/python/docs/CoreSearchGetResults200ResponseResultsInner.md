# CoreSearchGetResults200ResponseResultsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**areaname** | **str** | search area name | [optional] [default to 'null']
**componentname** | **str** | component name | [optional] [default to 'null']
**content** | **str** | result contents | [optional] [default to '']
**contextid** | **int** | result context id | [optional] [default to null]
**contexturl** | **str** | result context url | [optional] [default to 'null']
**coursefullname** | **str** | result course fullname | [optional] [default to 'null']
**courseurl** | **str** | result course url | [optional] [default to 'null']
**description1** | **str** | extra result contents, depends on the search area | [optional] [default to '']
**description2** | **str** | extra result contents, depends on the search area | [optional] [default to '']
**docurl** | **str** | result url | [optional] [default to 'null']
**filename** | **str** | result file name if present | [optional] [default to 'null']
**filenames** | **str** | result file names if present | [optional] [default to 'null']
**iconurl** | **str** | icon url | [optional] [default to '']
**itemid** | **int** | unique id in the search area scope | [optional] [default to null]
**multiplefiles** | **int** | whether multiple files are returned or not | [optional] [default to null]
**textformat** | **int** | text fields format, it is the same for all of them | [optional] [default to null]
**timemodified** | **int** | result modified time | [optional] [default to null]
**title** | **str** | result title | [optional] [default to 'null']
**userfullname** | **str** | user fullname | [optional] [default to 'null']
**userid** | **int** | user id | [optional] [default to null]
**userurl** | **str** | user url | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_search_get_results200_response_results_inner import CoreSearchGetResults200ResponseResultsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreSearchGetResults200ResponseResultsInner from a JSON string
core_search_get_results200_response_results_inner_instance = CoreSearchGetResults200ResponseResultsInner.from_json(json)
# print the JSON string representation of the object
print(CoreSearchGetResults200ResponseResultsInner.to_json())

# convert the object into a dict
core_search_get_results200_response_results_inner_dict = core_search_get_results200_response_results_inner_instance.to_dict()
# create an instance of CoreSearchGetResults200ResponseResultsInner from a dict
core_search_get_results200_response_results_inner_from_dict = CoreSearchGetResults200ResponseResultsInner.from_dict(core_search_get_results200_response_results_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


