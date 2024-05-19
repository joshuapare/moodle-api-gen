# CoreCompetencySearchCompetenciesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyframeworkid** | **int** | Competency framework id | [default to null]
**searchtext** | **str** | Text to search for | [default to 'null']

## Example

```python
from openapi_client.models.core_competency_search_competencies_request import CoreCompetencySearchCompetenciesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencySearchCompetenciesRequest from a JSON string
core_competency_search_competencies_request_instance = CoreCompetencySearchCompetenciesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencySearchCompetenciesRequest.to_json())

# convert the object into a dict
core_competency_search_competencies_request_dict = core_competency_search_competencies_request_instance.to_dict()
# create an instance of CoreCompetencySearchCompetenciesRequest from a dict
core_competency_search_competencies_request_from_dict = CoreCompetencySearchCompetenciesRequest.from_dict(core_competency_search_competencies_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


