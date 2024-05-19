# ToolLpDataForCompetenciesManagePage200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmanage** | **bool** | True if this user has permission to manage competency frameworks | [default to False]
**framework** | [**CoreCompetencyDuplicateCompetencyFramework200Response**](CoreCompetencyDuplicateCompetencyFramework200Response.md) |  | 
**pagecontextid** | **int** | Context id for the framework | [default to null]
**pluginbaseurl** | **str** | Plugin base url | [default to 'null']
**rulesmodules** | **str** | JSON encoded data for rules | [default to 'null']
**search** | **str** | Current search string | [default to 'null']

## Example

```python
from openapi_client.models.tool_lp_data_for_competencies_manage_page200_response import ToolLpDataForCompetenciesManagePage200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForCompetenciesManagePage200Response from a JSON string
tool_lp_data_for_competencies_manage_page200_response_instance = ToolLpDataForCompetenciesManagePage200Response.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForCompetenciesManagePage200Response.to_json())

# convert the object into a dict
tool_lp_data_for_competencies_manage_page200_response_dict = tool_lp_data_for_competencies_manage_page200_response_instance.to_dict()
# create an instance of ToolLpDataForCompetenciesManagePage200Response from a dict
tool_lp_data_for_competencies_manage_page200_response_from_dict = ToolLpDataForCompetenciesManagePage200Response.from_dict(tool_lp_data_for_competencies_manage_page200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


