# CoreBackupSubmitCopyFormRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jsonformdata** | **str** | The data from the create copy form, encoded as a json array | [default to 'null']

## Example

```python
from openapi_client.models.core_backup_submit_copy_form_request import CoreBackupSubmitCopyFormRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBackupSubmitCopyFormRequest from a JSON string
core_backup_submit_copy_form_request_instance = CoreBackupSubmitCopyFormRequest.from_json(json)
# print the JSON string representation of the object
print(CoreBackupSubmitCopyFormRequest.to_json())

# convert the object into a dict
core_backup_submit_copy_form_request_dict = core_backup_submit_copy_form_request_instance.to_dict()
# create an instance of CoreBackupSubmitCopyFormRequest from a dict
core_backup_submit_copy_form_request_from_dict = CoreBackupSubmitCopyFormRequest.from_dict(core_backup_submit_copy_form_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


