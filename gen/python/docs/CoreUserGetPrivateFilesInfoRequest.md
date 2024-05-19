# CoreUserGetPrivateFilesInfoRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userid** | **int** | Id of the user, default to current user. | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_user_get_private_files_info_request import CoreUserGetPrivateFilesInfoRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserGetPrivateFilesInfoRequest from a JSON string
core_user_get_private_files_info_request_instance = CoreUserGetPrivateFilesInfoRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserGetPrivateFilesInfoRequest.to_json())

# convert the object into a dict
core_user_get_private_files_info_request_dict = core_user_get_private_files_info_request_instance.to_dict()
# create an instance of CoreUserGetPrivateFilesInfoRequest from a dict
core_user_get_private_files_info_request_from_dict = CoreUserGetPrivateFilesInfoRequest.from_dict(core_user_get_private_files_info_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


