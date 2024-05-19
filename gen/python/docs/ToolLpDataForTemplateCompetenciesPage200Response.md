# ToolLpDataForTemplateCompetenciesPage200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmanagecompetencyframeworks** | **bool** | User can manage competency frameworks | 
**canmanagetemplatecompetencies** | **bool** | User can manage learning plan templates | [default to False]
**competencies** | [**List[ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner]**](ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner.md) |  | 
**manageurl** | **str** | Url to the manage competencies page. | 
**pagecontextid** | **int** | Context ID | 
**pluginbaseurl** | **str** | Base URL of the plugin. | [default to 'null']
**statistics** | [**ToolLpDataForTemplateCompetenciesPage200ResponseStatistics**](ToolLpDataForTemplateCompetenciesPage200ResponseStatistics.md) |  | 
**template** | [**CoreCompetencyCreateTemplate200Response**](CoreCompetencyCreateTemplate200Response.md) |  | 

## Example

```python
from openapi_client.models.tool_lp_data_for_template_competencies_page200_response import ToolLpDataForTemplateCompetenciesPage200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForTemplateCompetenciesPage200Response from a JSON string
tool_lp_data_for_template_competencies_page200_response_instance = ToolLpDataForTemplateCompetenciesPage200Response.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForTemplateCompetenciesPage200Response.to_json())

# convert the object into a dict
tool_lp_data_for_template_competencies_page200_response_dict = tool_lp_data_for_template_competencies_page200_response_instance.to_dict()
# create an instance of ToolLpDataForTemplateCompetenciesPage200Response from a dict
tool_lp_data_for_template_competencies_page200_response_from_dict = ToolLpDataForTemplateCompetenciesPage200Response.from_dict(tool_lp_data_for_template_competencies_page200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


