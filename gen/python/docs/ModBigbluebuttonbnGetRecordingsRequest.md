# ModBigbluebuttonbnGetRecordingsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bigbluebuttonbnid** | **int** | bigbluebuttonbn instance id | 
**groupid** | **int** | Group ID | [optional] [default to null]
**tools** | **str** | a set of enabled tools | [optional] [default to 'protect,unprotect,publish,unpublish,delete']

## Example

```python
from openapi_client.models.mod_bigbluebuttonbn_get_recordings_request import ModBigbluebuttonbnGetRecordingsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModBigbluebuttonbnGetRecordingsRequest from a JSON string
mod_bigbluebuttonbn_get_recordings_request_instance = ModBigbluebuttonbnGetRecordingsRequest.from_json(json)
# print the JSON string representation of the object
print(ModBigbluebuttonbnGetRecordingsRequest.to_json())

# convert the object into a dict
mod_bigbluebuttonbn_get_recordings_request_dict = mod_bigbluebuttonbn_get_recordings_request_instance.to_dict()
# create an instance of ModBigbluebuttonbnGetRecordingsRequest from a dict
mod_bigbluebuttonbn_get_recordings_request_from_dict = ModBigbluebuttonbnGetRecordingsRequest.from_dict(mod_bigbluebuttonbn_get_recordings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


