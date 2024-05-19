# ToolLpDataForRelatedCompetenciesSection200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**relatedcompetencies** | [**List[CoreCompetencyReadUserEvidence200ResponseCompetenciesInner]**](CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.md) |  | 
**showdeleterelatedaction** | **bool** | Whether to show the delete relation link or not | [default to False]

## Example

```python
from openapi_client.models.tool_lp_data_for_related_competencies_section200_response import ToolLpDataForRelatedCompetenciesSection200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForRelatedCompetenciesSection200Response from a JSON string
tool_lp_data_for_related_competencies_section200_response_instance = ToolLpDataForRelatedCompetenciesSection200Response.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForRelatedCompetenciesSection200Response.to_json())

# convert the object into a dict
tool_lp_data_for_related_competencies_section200_response_dict = tool_lp_data_for_related_competencies_section200_response_instance.to_dict()
# create an instance of ToolLpDataForRelatedCompetenciesSection200Response from a dict
tool_lp_data_for_related_competencies_section200_response_from_dict = ToolLpDataForRelatedCompetenciesSection200Response.from_dict(tool_lp_data_for_related_competencies_section200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


