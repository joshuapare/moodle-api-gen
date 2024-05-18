# CoreCompetencyUpdateTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**template** | [**CoreCompetencyUpdateTemplateRequestTemplate**](CoreCompetencyUpdateTemplateRequestTemplate.md) |  | 

## Example

```python
from openapi_client.models.core_competency_update_template_request import CoreCompetencyUpdateTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyUpdateTemplateRequest from a JSON string
core_competency_update_template_request_instance = CoreCompetencyUpdateTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyUpdateTemplateRequest.to_json())

# convert the object into a dict
core_competency_update_template_request_dict = core_competency_update_template_request_instance.to_dict()
# create an instance of CoreCompetencyUpdateTemplateRequest from a dict
core_competency_update_template_request_from_dict = CoreCompetencyUpdateTemplateRequest.from_dict(core_competency_update_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


