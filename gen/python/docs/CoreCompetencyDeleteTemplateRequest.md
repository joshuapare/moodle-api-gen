# CoreCompetencyDeleteTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleteplans** | **bool** | Boolean to indicate if plans must be deleted | [default to False]
**id** | **int** | Data base record id for the template | [default to null]

## Example

```python
from openapi_client.models.core_competency_delete_template_request import CoreCompetencyDeleteTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyDeleteTemplateRequest from a JSON string
core_competency_delete_template_request_instance = CoreCompetencyDeleteTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyDeleteTemplateRequest.to_json())

# convert the object into a dict
core_competency_delete_template_request_dict = core_competency_delete_template_request_instance.to_dict()
# create an instance of CoreCompetencyDeleteTemplateRequest from a dict
core_competency_delete_template_request_from_dict = CoreCompetencyDeleteTemplateRequest.from_dict(core_competency_delete_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

