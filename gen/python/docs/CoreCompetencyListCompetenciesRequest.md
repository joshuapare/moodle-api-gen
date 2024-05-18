# CoreCompetencyListCompetenciesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**List[CoreCompetencyListCompetenciesRequestFiltersInner]**](CoreCompetencyListCompetenciesRequestFiltersInner.md) |  | 
**limit** | **int** | Return this number of records at most. | [optional] [default to 0]
**order** | **str** | Sort direction. Should be either ASC or DESC | [optional] [default to '']
**skip** | **int** | Skip this number of records before returning results | [optional] [default to 0]
**sort** | **str** | Column to sort by. | [optional] [default to '']

## Example

```python
from openapi_client.models.core_competency_list_competencies_request import CoreCompetencyListCompetenciesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyListCompetenciesRequest from a JSON string
core_competency_list_competencies_request_instance = CoreCompetencyListCompetenciesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyListCompetenciesRequest.to_json())

# convert the object into a dict
core_competency_list_competencies_request_dict = core_competency_list_competencies_request_instance.to_dict()
# create an instance of CoreCompetencyListCompetenciesRequest from a dict
core_competency_list_competencies_request_from_dict = CoreCompetencyListCompetenciesRequest.from_dict(core_competency_list_competencies_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


