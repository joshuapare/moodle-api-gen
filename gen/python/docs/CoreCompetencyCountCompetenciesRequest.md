# CoreCompetencyCountCompetenciesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**List[CoreCompetencyCountCompetenciesRequestFiltersInner]**](CoreCompetencyCountCompetenciesRequestFiltersInner.md) |  | 

## Example

```python
from openapi_client.models.core_competency_count_competencies_request import CoreCompetencyCountCompetenciesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCountCompetenciesRequest from a JSON string
core_competency_count_competencies_request_instance = CoreCompetencyCountCompetenciesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCountCompetenciesRequest.to_json())

# convert the object into a dict
core_competency_count_competencies_request_dict = core_competency_count_competencies_request_instance.to_dict()
# create an instance of CoreCompetencyCountCompetenciesRequest from a dict
core_competency_count_competencies_request_from_dict = CoreCompetencyCountCompetenciesRequest.from_dict(core_competency_count_competencies_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


