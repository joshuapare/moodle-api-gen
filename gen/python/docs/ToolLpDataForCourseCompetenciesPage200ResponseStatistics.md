# ToolLpDataForCourseCompetenciesPage200ResponseStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canbegradedincourse** | **bool** | canbegradedincourse | [default to False]
**canmanagecoursecompetencies** | **bool** | canmanagecoursecompetencies | [default to False]
**competencycount** | **int** | competencycount | 
**leastproficient** | [**List[CoreCompetencyReadUserEvidence200ResponseCompetenciesInner]**](CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.md) |  | 
**leastproficientcount** | **int** | leastproficientcount | [default to null]
**proficientcompetencycount** | **int** | proficientcompetencycount | [default to null]
**proficientcompetencypercentage** | **float** | proficientcompetencypercentage | [default to null]
**proficientcompetencypercentageformatted** | **str** | proficientcompetencypercentageformatted | [default to 'null']

## Example

```python
from openapi_client.models.tool_lp_data_for_course_competencies_page200_response_statistics import ToolLpDataForCourseCompetenciesPage200ResponseStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForCourseCompetenciesPage200ResponseStatistics from a JSON string
tool_lp_data_for_course_competencies_page200_response_statistics_instance = ToolLpDataForCourseCompetenciesPage200ResponseStatistics.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForCourseCompetenciesPage200ResponseStatistics.to_json())

# convert the object into a dict
tool_lp_data_for_course_competencies_page200_response_statistics_dict = tool_lp_data_for_course_competencies_page200_response_statistics_instance.to_dict()
# create an instance of ToolLpDataForCourseCompetenciesPage200ResponseStatistics from a dict
tool_lp_data_for_course_competencies_page200_response_statistics_from_dict = ToolLpDataForCourseCompetenciesPage200ResponseStatistics.from_dict(tool_lp_data_for_course_competencies_page200_response_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


