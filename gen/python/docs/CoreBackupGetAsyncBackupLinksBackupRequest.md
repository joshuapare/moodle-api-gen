# CoreBackupGetAsyncBackupLinksBackupRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupid** | **str** | Backup id | [default to 'null']
**contextid** | **int** | Context id | [default to null]
**filename** | **str** | Backup filename | [default to 'null']

## Example

```python
from openapi_client.models.core_backup_get_async_backup_links_backup_request import CoreBackupGetAsyncBackupLinksBackupRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBackupGetAsyncBackupLinksBackupRequest from a JSON string
core_backup_get_async_backup_links_backup_request_instance = CoreBackupGetAsyncBackupLinksBackupRequest.from_json(json)
# print the JSON string representation of the object
print(CoreBackupGetAsyncBackupLinksBackupRequest.to_json())

# convert the object into a dict
core_backup_get_async_backup_links_backup_request_dict = core_backup_get_async_backup_links_backup_request_instance.to_dict()
# create an instance of CoreBackupGetAsyncBackupLinksBackupRequest from a dict
core_backup_get_async_backup_links_backup_request_from_dict = CoreBackupGetAsyncBackupLinksBackupRequest.from_dict(core_backup_get_async_backup_links_backup_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


