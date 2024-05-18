# CoreCompetencyAddCompetencyToTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | The competency id | 
**templateid** | **int** | The template id | [default to null]

## Example

```python
from openapi_client.models.core_competency_add_competency_to_template_request import CoreCompetencyAddCompetencyToTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyAddCompetencyToTemplateRequest from a JSON string
core_competency_add_competency_to_template_request_instance = CoreCompetencyAddCompetencyToTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyAddCompetencyToTemplateRequest.to_json())

# convert the object into a dict
core_competency_add_competency_to_template_request_dict = core_competency_add_competency_to_template_request_instance.to_dict()
# create an instance of CoreCompetencyAddCompetencyToTemplateRequest from a dict
core_competency_add_competency_to_template_request_from_dict = CoreCompetencyAddCompetencyToTemplateRequest.from_dict(core_competency_add_competency_to_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


