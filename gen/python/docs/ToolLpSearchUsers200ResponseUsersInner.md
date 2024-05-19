# ToolLpSearchUsers200ResponseUsersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**department** | **str** | department | [optional] [default to '']
**email** | **str** | email | [optional] [default to '']
**fullname** | **str** | fullname | [optional] 
**id** | **int** | id | [optional] 
**identity** | **str** | identity | [optional] 
**idnumber** | **str** | idnumber | [optional] [default to '']
**institution** | **str** | institution | [optional] [default to '']
**phone1** | **str** | phone1 | [optional] [default to '']
**phone2** | **str** | phone2 | [optional] [default to '']
**profileimageurl** | **str** | profileimageurl | [optional] 
**profileimageurlsmall** | **str** | profileimageurlsmall | [optional] 
**profileurl** | **str** | profileurl | [optional] 

## Example

```python
from openapi_client.models.tool_lp_search_users200_response_users_inner import ToolLpSearchUsers200ResponseUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpSearchUsers200ResponseUsersInner from a JSON string
tool_lp_search_users200_response_users_inner_instance = ToolLpSearchUsers200ResponseUsersInner.from_json(json)
# print the JSON string representation of the object
print(ToolLpSearchUsers200ResponseUsersInner.to_json())

# convert the object into a dict
tool_lp_search_users200_response_users_inner_dict = tool_lp_search_users200_response_users_inner_instance.to_dict()
# create an instance of ToolLpSearchUsers200ResponseUsersInner from a dict
tool_lp_search_users200_response_users_inner_from_dict = ToolLpSearchUsers200ResponseUsersInner.from_dict(tool_lp_search_users200_response_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


