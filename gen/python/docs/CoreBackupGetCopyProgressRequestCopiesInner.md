# CoreBackupGetCopyProgressRequestCopiesInner

Copy data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupid** | **str** | Backup id | [optional] [default to 'null']
**operation** | **str** | Operation type | [optional] [default to 'null']
**restoreid** | **str** | Restore id | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_backup_get_copy_progress_request_copies_inner import CoreBackupGetCopyProgressRequestCopiesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBackupGetCopyProgressRequestCopiesInner from a JSON string
core_backup_get_copy_progress_request_copies_inner_instance = CoreBackupGetCopyProgressRequestCopiesInner.from_json(json)
# print the JSON string representation of the object
print(CoreBackupGetCopyProgressRequestCopiesInner.to_json())

# convert the object into a dict
core_backup_get_copy_progress_request_copies_inner_dict = core_backup_get_copy_progress_request_copies_inner_instance.to_dict()
# create an instance of CoreBackupGetCopyProgressRequestCopiesInner from a dict
core_backup_get_copy_progress_request_copies_inner_from_dict = CoreBackupGetCopyProgressRequestCopiesInner.from_dict(core_backup_get_copy_progress_request_copies_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


