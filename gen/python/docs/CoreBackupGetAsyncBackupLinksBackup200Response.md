# CoreBackupGetAsyncBackupLinksBackup200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filesize** | **str** | Backup file size | [default to 'null']
**fileurl** | **str** | Backup file URL | [default to 'null']
**restoreurl** | **str** | Backup restore URL | [default to 'null']

## Example

```python
from openapi_client.models.core_backup_get_async_backup_links_backup200_response import CoreBackupGetAsyncBackupLinksBackup200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBackupGetAsyncBackupLinksBackup200Response from a JSON string
core_backup_get_async_backup_links_backup200_response_instance = CoreBackupGetAsyncBackupLinksBackup200Response.from_json(json)
# print the JSON string representation of the object
print(CoreBackupGetAsyncBackupLinksBackup200Response.to_json())

# convert the object into a dict
core_backup_get_async_backup_links_backup200_response_dict = core_backup_get_async_backup_links_backup200_response_instance.to_dict()
# create an instance of CoreBackupGetAsyncBackupLinksBackup200Response from a dict
core_backup_get_async_backup_links_backup200_response_from_dict = CoreBackupGetAsyncBackupLinksBackup200Response.from_dict(core_backup_get_async_backup_links_backup200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


