# ModBigbluebuttonbnUpdateRecordingRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** | The action to perform | [default to 'null']
**additionaloptions** | **str** | Additional options | [default to 'null']
**bigbluebuttonbnid** | **int** | bigbluebuttonbn instance id, this might be a different one from the one set in recordingid in case of importing | [default to null]
**recordingid** | **int** | The moodle internal recording ID | [default to null]

## Example

```python
from openapi_client.models.mod_bigbluebuttonbn_update_recording_request import ModBigbluebuttonbnUpdateRecordingRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModBigbluebuttonbnUpdateRecordingRequest from a JSON string
mod_bigbluebuttonbn_update_recording_request_instance = ModBigbluebuttonbnUpdateRecordingRequest.from_json(json)
# print the JSON string representation of the object
print(ModBigbluebuttonbnUpdateRecordingRequest.to_json())

# convert the object into a dict
mod_bigbluebuttonbn_update_recording_request_dict = mod_bigbluebuttonbn_update_recording_request_instance.to_dict()
# create an instance of ModBigbluebuttonbnUpdateRecordingRequest from a dict
mod_bigbluebuttonbn_update_recording_request_from_dict = ModBigbluebuttonbnUpdateRecordingRequest.from_dict(mod_bigbluebuttonbn_update_recording_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


