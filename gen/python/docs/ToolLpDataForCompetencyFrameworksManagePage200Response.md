# ToolLpDataForCompetencyFrameworksManagePage200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyframeworks** | [**List[ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner]**](ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.md) |  | 
**navigation** | **List[object]** |  | 
**pagecontextid** | **int** | The page context id | [default to null]
**pluginbaseurl** | **str** | Url to the tool_lp plugin folder on this Moodle site | [default to 'null']

## Example

```python
from openapi_client.models.tool_lp_data_for_competency_frameworks_manage_page200_response import ToolLpDataForCompetencyFrameworksManagePage200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForCompetencyFrameworksManagePage200Response from a JSON string
tool_lp_data_for_competency_frameworks_manage_page200_response_instance = ToolLpDataForCompetencyFrameworksManagePage200Response.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForCompetencyFrameworksManagePage200Response.to_json())

# convert the object into a dict
tool_lp_data_for_competency_frameworks_manage_page200_response_dict = tool_lp_data_for_competency_frameworks_manage_page200_response_instance.to_dict()
# create an instance of ToolLpDataForCompetencyFrameworksManagePage200Response from a dict
tool_lp_data_for_competency_frameworks_manage_page200_response_from_dict = ToolLpDataForCompetencyFrameworksManagePage200Response.from_dict(tool_lp_data_for_competency_frameworks_manage_page200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


