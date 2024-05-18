# ToolLpDataForPlansPage200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmanageuserplans** | **bool** | Can the current user manage the user&#39;s plans | [default to False]
**canreaduserevidence** | **bool** | Can the current user view the user&#39;s evidence | [default to False]
**navigation** | **List[object]** |  | 
**plans** | [**List[ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner]**](ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner.md) |  | 
**pluginbaseurl** | **str** | Url to the tool_lp plugin folder on this Moodle site | 
**userid** | **int** | The learning plan user id | [default to null]

## Example

```python
from openapi_client.models.tool_lp_data_for_plans_page200_response import ToolLpDataForPlansPage200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForPlansPage200Response from a JSON string
tool_lp_data_for_plans_page200_response_instance = ToolLpDataForPlansPage200Response.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForPlansPage200Response.to_json())

# convert the object into a dict
tool_lp_data_for_plans_page200_response_dict = tool_lp_data_for_plans_page200_response_instance.to_dict()
# create an instance of ToolLpDataForPlansPage200Response from a dict
tool_lp_data_for_plans_page200_response_from_dict = ToolLpDataForPlansPage200Response.from_dict(tool_lp_data_for_plans_page200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


