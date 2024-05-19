# ToolLpDataForTemplatesManagePage200ResponseTemplatesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmanage** | **bool** | canmanage | [optional] 
**canread** | **bool** | canread | [optional] 
**cohortscount** | **int** | cohortscount | [optional] 
**contextid** | **int** | contextid | [optional] 
**contextname** | **str** | contextname | [optional] 
**contextnamenoprefix** | **str** | contextnamenoprefix | [optional] 
**description** | **str** | description | [optional] [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**duedate** | **int** | duedate | [optional] [default to 0]
**duedateformatted** | **str** | duedateformatted | [optional] 
**id** | **int** | id | [optional] [default to 0]
**planscount** | **int** | planscount | [optional] 
**shortname** | **str** | shortname | [optional] 
**timecreated** | **int** | timecreated | [optional] [default to 0]
**timemodified** | **int** | timemodified | [optional] [default to 0]
**usermodified** | **int** | usermodified | [optional] [default to 0]
**visible** | **bool** | visible | [optional] [default to False]

## Example

```python
from openapi_client.models.tool_lp_data_for_templates_manage_page200_response_templates_inner import ToolLpDataForTemplatesManagePage200ResponseTemplatesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForTemplatesManagePage200ResponseTemplatesInner from a JSON string
tool_lp_data_for_templates_manage_page200_response_templates_inner_instance = ToolLpDataForTemplatesManagePage200ResponseTemplatesInner.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForTemplatesManagePage200ResponseTemplatesInner.to_json())

# convert the object into a dict
tool_lp_data_for_templates_manage_page200_response_templates_inner_dict = tool_lp_data_for_templates_manage_page200_response_templates_inner_instance.to_dict()
# create an instance of ToolLpDataForTemplatesManagePage200ResponseTemplatesInner from a dict
tool_lp_data_for_templates_manage_page200_response_templates_inner_from_dict = ToolLpDataForTemplatesManagePage200ResponseTemplatesInner.from_dict(tool_lp_data_for_templates_manage_page200_response_templates_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


