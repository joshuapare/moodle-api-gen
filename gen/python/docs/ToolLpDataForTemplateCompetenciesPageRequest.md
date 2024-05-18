# ToolLpDataForTemplateCompetenciesPageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pagecontext** | [**CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  | 
**templateid** | **int** | The template id | 

## Example

```python
from openapi_client.models.tool_lp_data_for_template_competencies_page_request import ToolLpDataForTemplateCompetenciesPageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForTemplateCompetenciesPageRequest from a JSON string
tool_lp_data_for_template_competencies_page_request_instance = ToolLpDataForTemplateCompetenciesPageRequest.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForTemplateCompetenciesPageRequest.to_json())

# convert the object into a dict
tool_lp_data_for_template_competencies_page_request_dict = tool_lp_data_for_template_competencies_page_request_instance.to_dict()
# create an instance of ToolLpDataForTemplateCompetenciesPageRequest from a dict
tool_lp_data_for_template_competencies_page_request_from_dict = ToolLpDataForTemplateCompetenciesPageRequest.from_dict(tool_lp_data_for_template_competencies_page_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


