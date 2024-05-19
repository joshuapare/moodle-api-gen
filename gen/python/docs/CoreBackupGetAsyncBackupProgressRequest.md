# CoreBackupGetAsyncBackupProgressRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupids** | **List[object]** |  | 
**contextid** | **int** | Context id | 

## Example

```python
from openapi_client.models.core_backup_get_async_backup_progress_request import CoreBackupGetAsyncBackupProgressRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBackupGetAsyncBackupProgressRequest from a JSON string
core_backup_get_async_backup_progress_request_instance = CoreBackupGetAsyncBackupProgressRequest.from_json(json)
# print the JSON string representation of the object
print(CoreBackupGetAsyncBackupProgressRequest.to_json())

# convert the object into a dict
core_backup_get_async_backup_progress_request_dict = core_backup_get_async_backup_progress_request_instance.to_dict()
# create an instance of CoreBackupGetAsyncBackupProgressRequest from a dict
core_backup_get_async_backup_progress_request_from_dict = CoreBackupGetAsyncBackupProgressRequest.from_dict(core_backup_get_async_backup_progress_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


