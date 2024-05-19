# CoreCompetencySetParentCompetencyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | The competency id | 
**parentid** | **int** | The new competency parent id | [default to null]

## Example

```python
from openapi_client.models.core_competency_set_parent_competency_request import CoreCompetencySetParentCompetencyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencySetParentCompetencyRequest from a JSON string
core_competency_set_parent_competency_request_instance = CoreCompetencySetParentCompetencyRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencySetParentCompetencyRequest.to_json())

# convert the object into a dict
core_competency_set_parent_competency_request_dict = core_competency_set_parent_competency_request_instance.to_dict()
# create an instance of CoreCompetencySetParentCompetencyRequest from a dict
core_competency_set_parent_competency_request_from_dict = CoreCompetencySetParentCompetencyRequest.from_dict(core_competency_set_parent_competency_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


