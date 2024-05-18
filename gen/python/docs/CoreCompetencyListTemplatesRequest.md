# CoreCompetencyListTemplatesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  | 
**includes** | **str** | What other contexts to fetch the templates from. (children, parents, self) | [optional] [default to 'children']
**limit** | **int** | Return this number of records at most. | [optional] [default to 0]
**onlyvisible** | **bool** | If should list only visible templates | [optional] [default to False]
**order** | **str** | Sort direction. Should be either ASC or DESC | [optional] [default to '']
**skip** | **int** | Skip this number of records before returning results | [optional] [default to 0]
**sort** | **str** | Column to sort by. | [optional] [default to '']

## Example

```python
from openapi_client.models.core_competency_list_templates_request import CoreCompetencyListTemplatesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyListTemplatesRequest from a JSON string
core_competency_list_templates_request_instance = CoreCompetencyListTemplatesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyListTemplatesRequest.to_json())

# convert the object into a dict
core_competency_list_templates_request_dict = core_competency_list_templates_request_instance.to_dict()
# create an instance of CoreCompetencyListTemplatesRequest from a dict
core_competency_list_templates_request_from_dict = CoreCompetencyListTemplatesRequest.from_dict(core_competency_list_templates_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


