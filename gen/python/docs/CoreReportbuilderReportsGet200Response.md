# CoreReportbuilderReportsGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area** | **str** | area | [default to '']
**attributes** | [**List[CoreReportbuilderReportsGet200ResponseAttributesInner]**](CoreReportbuilderReportsGet200ResponseAttributesInner.md) |  | 
**cardview** | [**CoreReportbuilderReportsGet200ResponseCardview**](CoreReportbuilderReportsGet200ResponseCardview.md) |  | [optional] 
**classes** | **str** | classes | [default to 'null']
**component** | **str** | component | [default to '']
**conditiondata** | **str** | conditiondata | 
**conditions** | [**CoreReportbuilderConditionsDelete200Response**](CoreReportbuilderConditionsDelete200Response.md) |  | [optional] 
**contextid** | **int** | contextid | [default to {}]
**editmode** | **bool** | editmode | [default to False]
**filters** | [**CoreReportbuilderFiltersDelete200Response**](CoreReportbuilderFiltersDelete200Response.md) |  | [optional] 
**filtersapplied** | **int** | filtersapplied | [default to null]
**filtersform** | **str** | filtersform | [default to 'null']
**filterspresent** | **bool** | filterspresent | [default to False]
**id** | **int** | id | [default to 0]
**itemid** | **int** | itemid | [default to 0]
**javascript** | **str** | javascript | 
**name** | **str** | name | 
**settingsdata** | **str** | settingsdata | 
**sidebarmenucards** | [**CoreReportbuilderReportsGet200ResponseSidebarmenucards**](CoreReportbuilderReportsGet200ResponseSidebarmenucards.md) |  | [optional] 
**sorting** | [**CoreReportbuilderColumnsDelete200Response**](CoreReportbuilderColumnsDelete200Response.md) |  | [optional] 
**source** | **str** | source | 
**table** | **str** | table | [default to 'null']
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**type** | **int** | type | 
**uniquerows** | **bool** | uniquerows | [default to False]
**usercreated** | **int** | usercreated | [default to {}]
**usermodified** | **int** | usermodified | [default to 0]

## Example

```python
from openapi_client.models.core_reportbuilder_reports_get200_response import CoreReportbuilderReportsGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderReportsGet200Response from a JSON string
core_reportbuilder_reports_get200_response_instance = CoreReportbuilderReportsGet200Response.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderReportsGet200Response.to_json())

# convert the object into a dict
core_reportbuilder_reports_get200_response_dict = core_reportbuilder_reports_get200_response_instance.to_dict()
# create an instance of CoreReportbuilderReportsGet200Response from a dict
core_reportbuilder_reports_get200_response_from_dict = CoreReportbuilderReportsGet200Response.from_dict(core_reportbuilder_reports_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


