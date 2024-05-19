# ToolLpDataForCompetencySummary200ResponseComppath


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ancestors** | [**List[ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner]**](ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner.md) |  | 
**framework** | [**ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework**](ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.md) |  | 
**pagecontextid** | **int** | pagecontextid | 
**pluginbaseurl** | **str** | pluginbaseurl | 
**showlinks** | **bool** | showlinks | 

## Example

```python
from openapi_client.models.tool_lp_data_for_competency_summary200_response_comppath import ToolLpDataForCompetencySummary200ResponseComppath

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForCompetencySummary200ResponseComppath from a JSON string
tool_lp_data_for_competency_summary200_response_comppath_instance = ToolLpDataForCompetencySummary200ResponseComppath.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForCompetencySummary200ResponseComppath.to_json())

# convert the object into a dict
tool_lp_data_for_competency_summary200_response_comppath_dict = tool_lp_data_for_competency_summary200_response_comppath_instance.to_dict()
# create an instance of ToolLpDataForCompetencySummary200ResponseComppath from a dict
tool_lp_data_for_competency_summary200_response_comppath_from_dict = ToolLpDataForCompetencySummary200ResponseComppath.from_dict(tool_lp_data_for_competency_summary200_response_comppath_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


