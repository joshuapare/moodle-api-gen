# ModBigbluebuttonbnGetRecordingsToImportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationinstanceid** | **int** | Id of the other BBB we target for importing recordings into.                 The idea here is to remove already imported recordings. | [default to null]
**groupid** | **int** | Group ID | [optional] 
**sourcebigbluebuttonbnid** | **int** | bigbluebuttonbn instance id | [optional] [default to 0]
**sourcecourseid** | **int** | source courseid to filter by | [optional] [default to 0]
**tools** | **str** | a set of enabled tools | [optional] [default to 'protect,unprotect,publish,unpublish,delete']

## Example

```python
from openapi_client.models.mod_bigbluebuttonbn_get_recordings_to_import_request import ModBigbluebuttonbnGetRecordingsToImportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModBigbluebuttonbnGetRecordingsToImportRequest from a JSON string
mod_bigbluebuttonbn_get_recordings_to_import_request_instance = ModBigbluebuttonbnGetRecordingsToImportRequest.from_json(json)
# print the JSON string representation of the object
print(ModBigbluebuttonbnGetRecordingsToImportRequest.to_json())

# convert the object into a dict
mod_bigbluebuttonbn_get_recordings_to_import_request_dict = mod_bigbluebuttonbn_get_recordings_to_import_request_instance.to_dict()
# create an instance of ModBigbluebuttonbnGetRecordingsToImportRequest from a dict
mod_bigbluebuttonbn_get_recordings_to_import_request_from_dict = ModBigbluebuttonbnGetRecordingsToImportRequest.from_dict(mod_bigbluebuttonbn_get_recordings_to_import_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


