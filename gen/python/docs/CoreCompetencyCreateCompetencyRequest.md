# CoreCompetencyCreateCompetencyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competency** | [**CoreCompetencyCreateCompetencyRequestCompetency**](CoreCompetencyCreateCompetencyRequestCompetency.md) |  | 

## Example

```python
from openapi_client.models.core_competency_create_competency_request import CoreCompetencyCreateCompetencyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCreateCompetencyRequest from a JSON string
core_competency_create_competency_request_instance = CoreCompetencyCreateCompetencyRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCreateCompetencyRequest.to_json())

# convert the object into a dict
core_competency_create_competency_request_dict = core_competency_create_competency_request_instance.to_dict()
# create an instance of CoreCompetencyCreateCompetencyRequest from a dict
core_competency_create_competency_request_from_dict = CoreCompetencyCreateCompetencyRequest.from_dict(core_competency_create_competency_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


