# CoreUserAddUserPrivateFilesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**draftid** | **int** | draft area id | [default to null]

## Example

```python
from openapi_client.models.core_user_add_user_private_files_request import CoreUserAddUserPrivateFilesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserAddUserPrivateFilesRequest from a JSON string
core_user_add_user_private_files_request_instance = CoreUserAddUserPrivateFilesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserAddUserPrivateFilesRequest.to_json())

# convert the object into a dict
core_user_add_user_private_files_request_dict = core_user_add_user_private_files_request_instance.to_dict()
# create an instance of CoreUserAddUserPrivateFilesRequest from a dict
core_user_add_user_private_files_request_from_dict = CoreUserAddUserPrivateFilesRequest.from_dict(core_user_add_user_private_files_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


