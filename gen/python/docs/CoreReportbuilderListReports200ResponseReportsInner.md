# CoreReportbuilderListReports200ResponseReportsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area** | **str** | area | [optional] [default to '']
**component** | **str** | component | [optional] [default to '']
**conditiondata** | **str** | conditiondata | [optional] [default to 'null']
**contextid** | **int** | contextid | [optional] [default to {}]
**id** | **int** | id | [optional] [default to 0]
**itemid** | **int** | itemid | [optional] [default to 0]
**modifiedby** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | [optional] 
**name** | **str** | name | [optional] 
**settingsdata** | **str** | settingsdata | [optional] [default to 'null']
**source** | **str** | source | [optional] [default to 'null']
**sourcename** | **str** | sourcename | [optional] [default to 'null']
**timecreated** | **int** | timecreated | [optional] [default to 0]
**timemodified** | **int** | timemodified | [optional] [default to 0]
**type** | **int** | type | [optional] [default to null]
**uniquerows** | **bool** | uniquerows | [optional] [default to False]
**usercreated** | **int** | usercreated | [optional] [default to {}]
**usermodified** | **int** | usermodified | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_reportbuilder_list_reports200_response_reports_inner import CoreReportbuilderListReports200ResponseReportsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderListReports200ResponseReportsInner from a JSON string
core_reportbuilder_list_reports200_response_reports_inner_instance = CoreReportbuilderListReports200ResponseReportsInner.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderListReports200ResponseReportsInner.to_json())

# convert the object into a dict
core_reportbuilder_list_reports200_response_reports_inner_dict = core_reportbuilder_list_reports200_response_reports_inner_instance.to_dict()
# create an instance of CoreReportbuilderListReports200ResponseReportsInner from a dict
core_reportbuilder_list_reports200_response_reports_inner_from_dict = CoreReportbuilderListReports200ResponseReportsInner.from_dict(core_reportbuilder_list_reports200_response_reports_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


