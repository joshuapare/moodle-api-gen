# CoreCompetencyCreateTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**template** | [**CoreCompetencyCreateTemplateRequestTemplate**](CoreCompetencyCreateTemplateRequestTemplate.md) |  | 

## Example

```python
from openapi_client.models.core_competency_create_template_request import CoreCompetencyCreateTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCreateTemplateRequest from a JSON string
core_competency_create_template_request_instance = CoreCompetencyCreateTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCreateTemplateRequest.to_json())

# convert the object into a dict
core_competency_create_template_request_dict = core_competency_create_template_request_instance.to_dict()
# create an instance of CoreCompetencyCreateTemplateRequest from a dict
core_competency_create_template_request_from_dict = CoreCompetencyCreateTemplateRequest.from_dict(core_competency_create_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


