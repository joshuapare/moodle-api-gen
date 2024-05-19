# ModBigbluebuttonbnMeetingInfoRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bigbluebuttonbnid** | **int** | bigbluebuttonbn instance id | 
**groupid** | **int** | bigbluebuttonbn group id | [optional] [default to 0]
**updatecache** | **bool** | update cache ? | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_bigbluebuttonbn_meeting_info_request import ModBigbluebuttonbnMeetingInfoRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModBigbluebuttonbnMeetingInfoRequest from a JSON string
mod_bigbluebuttonbn_meeting_info_request_instance = ModBigbluebuttonbnMeetingInfoRequest.from_json(json)
# print the JSON string representation of the object
print(ModBigbluebuttonbnMeetingInfoRequest.to_json())

# convert the object into a dict
mod_bigbluebuttonbn_meeting_info_request_dict = mod_bigbluebuttonbn_meeting_info_request_instance.to_dict()
# create an instance of ModBigbluebuttonbnMeetingInfoRequest from a dict
mod_bigbluebuttonbn_meeting_info_request_from_dict = ModBigbluebuttonbnMeetingInfoRequest.from_dict(mod_bigbluebuttonbn_meeting_info_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


