# ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmanage** | **bool** | canmanage | [optional] 
**competencycount** | **int** | competencycount | [optional] 
**description** | **str** | description | [optional] [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**filecount** | **int** | filecount | [optional] 
**files** | [**List[ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner]**](ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md) |  | [optional] 
**hasurlorfiles** | **bool** | hasurlorfiles | [optional] 
**id** | **int** | id | [optional] [default to 0]
**name** | **str** | name | [optional] 
**timecreated** | **int** | timecreated | [optional] [default to 0]
**timemodified** | **int** | timemodified | [optional] [default to 0]
**url** | **str** | url | [optional] [default to '']
**urlshort** | **str** | urlshort | [optional] 
**usercompetencies** | [**List[ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner]**](ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner.md) |  | [optional] 
**userhasplan** | **bool** | userhasplan | [optional] [default to False]
**userid** | **int** | userid | [optional] 
**usermodified** | **int** | usermodified | [optional] [default to 0]

## Example

```python
from openapi_client.models.tool_lp_data_for_user_evidence_list_page200_response_evidence_inner import ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner from a JSON string
tool_lp_data_for_user_evidence_list_page200_response_evidence_inner_instance = ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner.to_json())

# convert the object into a dict
tool_lp_data_for_user_evidence_list_page200_response_evidence_inner_dict = tool_lp_data_for_user_evidence_list_page200_response_evidence_inner_instance.to_dict()
# create an instance of ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner from a dict
tool_lp_data_for_user_evidence_list_page200_response_evidence_inner_from_dict = ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner.from_dict(tool_lp_data_for_user_evidence_list_page200_response_evidence_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


