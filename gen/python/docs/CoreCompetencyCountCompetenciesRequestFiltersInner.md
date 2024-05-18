# CoreCompetencyCountCompetenciesRequestFiltersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**column** | **str** | Column name to filter by | [optional] [default to 'null']
**value** | **str** | Value to filter by. Must be exact match | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_competency_count_competencies_request_filters_inner import CoreCompetencyCountCompetenciesRequestFiltersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCountCompetenciesRequestFiltersInner from a JSON string
core_competency_count_competencies_request_filters_inner_instance = CoreCompetencyCountCompetenciesRequestFiltersInner.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCountCompetenciesRequestFiltersInner.to_json())

# convert the object into a dict
core_competency_count_competencies_request_filters_inner_dict = core_competency_count_competencies_request_filters_inner_instance.to_dict()
# create an instance of CoreCompetencyCountCompetenciesRequestFiltersInner from a dict
core_competency_count_competencies_request_filters_inner_from_dict = CoreCompetencyCountCompetenciesRequestFiltersInner.from_dict(core_competency_count_competencies_request_filters_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


