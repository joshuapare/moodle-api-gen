# ToolLpSearchUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capability** | **str** | Required capability | [default to 'null']
**limitfrom** | **int** | Number of records to skip | [optional] [default to 0]
**limitnum** | **str** | Number of records to fetch | [optional] [default to '100']
**query** | **str** | Query string | 

## Example

```python
from openapi_client.models.tool_lp_search_users_request import ToolLpSearchUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpSearchUsersRequest from a JSON string
tool_lp_search_users_request_instance = ToolLpSearchUsersRequest.from_json(json)
# print the JSON string representation of the object
print(ToolLpSearchUsersRequest.to_json())

# convert the object into a dict
tool_lp_search_users_request_dict = tool_lp_search_users_request_instance.to_dict()
# create an instance of ToolLpSearchUsersRequest from a dict
tool_lp_search_users_request_from_dict = ToolLpSearchUsersRequest.from_dict(tool_lp_search_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


