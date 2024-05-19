# ToolLpDataForUserEvidenceListPage200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmanage** | **bool** | Can the current user manage the user&#39;s evidence | [default to False]
**evidence** | [**List[ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner]**](ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner.md) |  | 
**navigation** | **List[object]** |  | 
**pluginbaseurl** | **str** | Url to the tool_lp plugin folder on this Moodle site | 
**userid** | **int** | The user ID | 

## Example

```python
from openapi_client.models.tool_lp_data_for_user_evidence_list_page200_response import ToolLpDataForUserEvidenceListPage200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForUserEvidenceListPage200Response from a JSON string
tool_lp_data_for_user_evidence_list_page200_response_instance = ToolLpDataForUserEvidenceListPage200Response.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForUserEvidenceListPage200Response.to_json())

# convert the object into a dict
tool_lp_data_for_user_evidence_list_page200_response_dict = tool_lp_data_for_user_evidence_list_page200_response_instance.to_dict()
# create an instance of ToolLpDataForUserEvidenceListPage200Response from a dict
tool_lp_data_for_user_evidence_list_page200_response_from_dict = ToolLpDataForUserEvidenceListPage200Response.from_dict(tool_lp_data_for_user_evidence_list_page200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


