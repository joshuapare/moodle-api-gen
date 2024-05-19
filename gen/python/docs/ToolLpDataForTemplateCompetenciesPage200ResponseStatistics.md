# ToolLpDataForTemplateCompetenciesPage200ResponseStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencycount** | **int** | competencycount | 
**completedplancount** | **int** | completedplancount | [default to null]
**completedplanpercentage** | **float** | completedplanpercentage | [default to null]
**completedplanpercentageformatted** | **str** | completedplanpercentageformatted | [default to 'null']
**leastproficient** | [**List[CoreCompetencyReadUserEvidence200ResponseCompetenciesInner]**](CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.md) |  | 
**leastproficientcount** | **int** | leastproficientcount | 
**linkedcompetencycount** | **int** | linkedcompetencycount | [default to null]
**linkedcompetencypercentage** | **float** | linkedcompetencypercentage | [default to null]
**linkedcompetencypercentageformatted** | **str** | linkedcompetencypercentageformatted | [default to 'null']
**plancount** | **int** | plancount | [default to null]
**proficientusercompetencyplancount** | **int** | proficientusercompetencyplancount | [default to null]
**proficientusercompetencyplanpercentage** | **float** | proficientusercompetencyplanpercentage | [default to null]
**proficientusercompetencyplanpercentageformatted** | **str** | proficientusercompetencyplanpercentageformatted | [default to 'null']
**unlinkedcompetencycount** | **int** | unlinkedcompetencycount | [default to null]
**usercompetencyplancount** | **int** | usercompetencyplancount | [default to null]

## Example

```python
from openapi_client.models.tool_lp_data_for_template_competencies_page200_response_statistics import ToolLpDataForTemplateCompetenciesPage200ResponseStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForTemplateCompetenciesPage200ResponseStatistics from a JSON string
tool_lp_data_for_template_competencies_page200_response_statistics_instance = ToolLpDataForTemplateCompetenciesPage200ResponseStatistics.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForTemplateCompetenciesPage200ResponseStatistics.to_json())

# convert the object into a dict
tool_lp_data_for_template_competencies_page200_response_statistics_dict = tool_lp_data_for_template_competencies_page200_response_statistics_instance.to_dict()
# create an instance of ToolLpDataForTemplateCompetenciesPage200ResponseStatistics from a dict
tool_lp_data_for_template_competencies_page200_response_statistics_from_dict = ToolLpDataForTemplateCompetenciesPage200ResponseStatistics.from_dict(tool_lp_data_for_template_competencies_page200_response_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


