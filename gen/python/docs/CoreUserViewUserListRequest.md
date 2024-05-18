# CoreUserViewUserListRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | id of the course, 0 for site | [default to null]

## Example

```python
from openapi_client.models.core_user_view_user_list_request import CoreUserViewUserListRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserViewUserListRequest from a JSON string
core_user_view_user_list_request_instance = CoreUserViewUserListRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserViewUserListRequest.to_json())

# convert the object into a dict
core_user_view_user_list_request_dict = core_user_view_user_list_request_instance.to_dict()
# create an instance of CoreUserViewUserListRequest from a dict
core_user_view_user_list_request_from_dict = CoreUserViewUserListRequest.from_dict(core_user_view_user_list_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


