# CoreCompetencyRemoveRelatedCompetencyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | The competency id | 
**relatedcompetencyid** | **int** | The related competency id | 

## Example

```python
from openapi_client.models.core_competency_remove_related_competency_request import CoreCompetencyRemoveRelatedCompetencyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyRemoveRelatedCompetencyRequest from a JSON string
core_competency_remove_related_competency_request_instance = CoreCompetencyRemoveRelatedCompetencyRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyRemoveRelatedCompetencyRequest.to_json())

# convert the object into a dict
core_competency_remove_related_competency_request_dict = core_competency_remove_related_competency_request_instance.to_dict()
# create an instance of CoreCompetencyRemoveRelatedCompetencyRequest from a dict
core_competency_remove_related_competency_request_from_dict = CoreCompetencyRemoveRelatedCompetencyRequest.from_dict(core_competency_remove_related_competency_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


