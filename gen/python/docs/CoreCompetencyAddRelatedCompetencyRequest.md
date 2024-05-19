# CoreCompetencyAddRelatedCompetencyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | The competency id | 
**relatedcompetencyid** | **int** | The related competency id | [default to null]

## Example

```python
from openapi_client.models.core_competency_add_related_competency_request import CoreCompetencyAddRelatedCompetencyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyAddRelatedCompetencyRequest from a JSON string
core_competency_add_related_competency_request_instance = CoreCompetencyAddRelatedCompetencyRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyAddRelatedCompetencyRequest.to_json())

# convert the object into a dict
core_competency_add_related_competency_request_dict = core_competency_add_related_competency_request_instance.to_dict()
# create an instance of CoreCompetencyAddRelatedCompetencyRequest from a dict
core_competency_add_related_competency_request_from_dict = CoreCompetencyAddRelatedCompetencyRequest.from_dict(core_competency_add_related_competency_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


