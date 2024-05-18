# ToolLpDataForUserEvidencePage200ResponseUserevidence


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmanage** | **bool** | canmanage | 
**competencycount** | **int** | competencycount | 
**description** | **str** | description | [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**filecount** | **int** | filecount | 
**files** | [**List[ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner]**](ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md) |  | 
**hasurlorfiles** | **bool** | hasurlorfiles | 
**id** | **int** | id | [default to 0]
**name** | **str** | name | 
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**url** | **str** | url | [default to '']
**urlshort** | **str** | urlshort | 
**usercompetencies** | [**List[ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner]**](ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner.md) |  | [optional] 
**userhasplan** | **bool** | userhasplan | 
**userid** | **int** | userid | 
**usermodified** | **int** | usermodified | [default to 0]

## Example

```python
from openapi_client.models.tool_lp_data_for_user_evidence_page200_response_userevidence import ToolLpDataForUserEvidencePage200ResponseUserevidence

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForUserEvidencePage200ResponseUserevidence from a JSON string
tool_lp_data_for_user_evidence_page200_response_userevidence_instance = ToolLpDataForUserEvidencePage200ResponseUserevidence.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForUserEvidencePage200ResponseUserevidence.to_json())

# convert the object into a dict
tool_lp_data_for_user_evidence_page200_response_userevidence_dict = tool_lp_data_for_user_evidence_page200_response_userevidence_instance.to_dict()
# create an instance of ToolLpDataForUserEvidencePage200ResponseUserevidence from a dict
tool_lp_data_for_user_evidence_page200_response_userevidence_from_dict = ToolLpDataForUserEvidencePage200ResponseUserevidence.from_dict(tool_lp_data_for_user_evidence_page200_response_userevidence_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


