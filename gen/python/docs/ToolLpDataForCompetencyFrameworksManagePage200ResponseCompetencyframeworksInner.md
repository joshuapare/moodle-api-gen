# ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmanage** | **bool** | canmanage | [optional] 
**competenciescount** | **int** | competenciescount | [optional] 
**contextid** | **int** | contextid | [optional] 
**contextname** | **str** | contextname | [optional] 
**contextnamenoprefix** | **str** | contextnamenoprefix | [optional] 
**description** | **str** | description | [optional] [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**id** | **int** | id | [optional] [default to 0]
**idnumber** | **str** | idnumber | [optional] 
**scaleconfiguration** | **str** | scaleconfiguration | [optional] 
**scaleid** | **int** | scaleid | [optional] 
**shortname** | **str** | shortname | [optional] 
**taxonomies** | **str** | taxonomies | [optional] [default to '']
**timecreated** | **int** | timecreated | [optional] [default to 0]
**timemodified** | **int** | timemodified | [optional] [default to 0]
**usermodified** | **int** | usermodified | [optional] [default to 0]
**visible** | **bool** | visible | [optional] [default to False]

## Example

```python
from openapi_client.models.tool_lp_data_for_competency_frameworks_manage_page200_response_competencyframeworks_inner import ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner from a JSON string
tool_lp_data_for_competency_frameworks_manage_page200_response_competencyframeworks_inner_instance = ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.to_json())

# convert the object into a dict
tool_lp_data_for_competency_frameworks_manage_page200_response_competencyframeworks_inner_dict = tool_lp_data_for_competency_frameworks_manage_page200_response_competencyframeworks_inner_instance.to_dict()
# create an instance of ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner from a dict
tool_lp_data_for_competency_frameworks_manage_page200_response_competencyframeworks_inner_from_dict = ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.from_dict(tool_lp_data_for_competency_frameworks_manage_page200_response_competencyframeworks_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


