# CoreBackupGetCopyProgressRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**copies** | [**List[CoreBackupGetCopyProgressRequestCopiesInner]**](CoreBackupGetCopyProgressRequestCopiesInner.md) |  | 

## Example

```python
from openapi_client.models.core_backup_get_copy_progress_request import CoreBackupGetCopyProgressRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBackupGetCopyProgressRequest from a JSON string
core_backup_get_copy_progress_request_instance = CoreBackupGetCopyProgressRequest.from_json(json)
# print the JSON string representation of the object
print(CoreBackupGetCopyProgressRequest.to_json())

# convert the object into a dict
core_backup_get_copy_progress_request_dict = core_backup_get_copy_progress_request_instance.to_dict()
# create an instance of CoreBackupGetCopyProgressRequest from a dict
core_backup_get_copy_progress_request_from_dict = CoreBackupGetCopyProgressRequest.from_dict(core_backup_get_copy_progress_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


