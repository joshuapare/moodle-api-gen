# ToolLpDataForCompetenciesManagePageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyframeworkid** | **int** | The competency framework id | 
**search** | **str** | A search string | [optional] [default to '']

## Example

```python
from openapi_client.models.tool_lp_data_for_competencies_manage_page_request import ToolLpDataForCompetenciesManagePageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForCompetenciesManagePageRequest from a JSON string
tool_lp_data_for_competencies_manage_page_request_instance = ToolLpDataForCompetenciesManagePageRequest.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForCompetenciesManagePageRequest.to_json())

# convert the object into a dict
tool_lp_data_for_competencies_manage_page_request_dict = tool_lp_data_for_competencies_manage_page_request_instance.to_dict()
# create an instance of ToolLpDataForCompetenciesManagePageRequest from a dict
tool_lp_data_for_competencies_manage_page_request_from_dict = ToolLpDataForCompetenciesManagePageRequest.from_dict(tool_lp_data_for_competencies_manage_page_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


