# CoreBackupGetAsyncBackupLinksRestoreRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupid** | **str** | Backup id | 
**contextid** | **int** | Context id | 

## Example

```python
from openapi_client.models.core_backup_get_async_backup_links_restore_request import CoreBackupGetAsyncBackupLinksRestoreRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBackupGetAsyncBackupLinksRestoreRequest from a JSON string
core_backup_get_async_backup_links_restore_request_instance = CoreBackupGetAsyncBackupLinksRestoreRequest.from_json(json)
# print the JSON string representation of the object
print(CoreBackupGetAsyncBackupLinksRestoreRequest.to_json())

# convert the object into a dict
core_backup_get_async_backup_links_restore_request_dict = core_backup_get_async_backup_links_restore_request_instance.to_dict()
# create an instance of CoreBackupGetAsyncBackupLinksRestoreRequest from a dict
core_backup_get_async_backup_links_restore_request_from_dict = CoreBackupGetAsyncBackupLinksRestoreRequest.from_dict(core_backup_get_async_backup_links_restore_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


