# CoreCompetencyUpdateCompetencyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competency** | [**CoreCompetencyUpdateCompetencyRequestCompetency**](CoreCompetencyUpdateCompetencyRequestCompetency.md) |  | 

## Example

```python
from openapi_client.models.core_competency_update_competency_request import CoreCompetencyUpdateCompetencyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyUpdateCompetencyRequest from a JSON string
core_competency_update_competency_request_instance = CoreCompetencyUpdateCompetencyRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyUpdateCompetencyRequest.to_json())

# convert the object into a dict
core_competency_update_competency_request_dict = core_competency_update_competency_request_instance.to_dict()
# create an instance of CoreCompetencyUpdateCompetencyRequest from a dict
core_competency_update_competency_request_from_dict = CoreCompetencyUpdateCompetencyRequest.from_dict(core_competency_update_competency_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


