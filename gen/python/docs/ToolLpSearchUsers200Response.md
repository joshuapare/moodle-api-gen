# ToolLpSearchUsers200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** | Total number of results. | [default to null]
**users** | [**List[ToolLpSearchUsers200ResponseUsersInner]**](ToolLpSearchUsers200ResponseUsersInner.md) |  | 

## Example

```python
from openapi_client.models.tool_lp_search_users200_response import ToolLpSearchUsers200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpSearchUsers200Response from a JSON string
tool_lp_search_users200_response_instance = ToolLpSearchUsers200Response.from_json(json)
# print the JSON string representation of the object
print(ToolLpSearchUsers200Response.to_json())

# convert the object into a dict
tool_lp_search_users200_response_dict = tool_lp_search_users200_response_instance.to_dict()
# create an instance of ToolLpSearchUsers200Response from a dict
tool_lp_search_users200_response_from_dict = ToolLpSearchUsers200Response.from_dict(tool_lp_search_users200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


