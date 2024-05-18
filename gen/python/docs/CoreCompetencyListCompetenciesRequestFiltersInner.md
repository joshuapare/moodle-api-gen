# CoreCompetencyListCompetenciesRequestFiltersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**column** | **str** | Column name to filter by | [optional] 
**value** | **str** | Value to filter by. Must be exact match | [optional] 

## Example

```python
from openapi_client.models.core_competency_list_competencies_request_filters_inner import CoreCompetencyListCompetenciesRequestFiltersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyListCompetenciesRequestFiltersInner from a JSON string
core_competency_list_competencies_request_filters_inner_instance = CoreCompetencyListCompetenciesRequestFiltersInner.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyListCompetenciesRequestFiltersInner.to_json())

# convert the object into a dict
core_competency_list_competencies_request_filters_inner_dict = core_competency_list_competencies_request_filters_inner_instance.to_dict()
# create an instance of CoreCompetencyListCompetenciesRequestFiltersInner from a dict
core_competency_list_competencies_request_filters_inner_from_dict = CoreCompetencyListCompetenciesRequestFiltersInner.from_dict(core_competency_list_competencies_request_filters_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


