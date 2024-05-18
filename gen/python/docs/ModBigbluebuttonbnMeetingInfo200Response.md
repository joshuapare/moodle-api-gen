# ModBigbluebuttonbnMeetingInfo200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bigbluebuttonbnid** | **str** | bigbluebuttonbn instance id | [default to 'null']
**canjoin** | **bool** | Can join | [default to False]
**closingtime** | **int** | Closing time | [optional] [default to null]
**cmid** | **int** | CM id | [default to null]
**features** | [**List[ModBigbluebuttonbnMeetingInfo200ResponseFeaturesInner]**](ModBigbluebuttonbnMeetingInfo200ResponseFeaturesInner.md) |  | [optional] 
**groupid** | **int** | bigbluebuttonbn group id | [optional] [default to 0]
**guestaccessenabled** | **bool** | Guest access enabled | [optional] [default to False]
**guestjoinurl** | **str** | Guest URL | [optional] [default to 'null']
**guestpassword** | **str** | Guest join password | [optional] [default to 'null']
**ismoderator** | **bool** | Is moderator | [default to False]
**joinurl** | **str** | Join URL | [default to 'null']
**meetingid** | **str** | Meeting id | 
**moderatorcount** | **int** | Moderator count | [optional] [default to null]
**moderatorplural** | **bool** | Several moderators ? | [optional] [default to False]
**openingtime** | **int** | Opening time | [optional] [default to null]
**participantcount** | **int** | Participant count | [optional] [default to null]
**participantplural** | **bool** | Several participants ? | [optional] [default to False]
**presentations** | [**List[ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner]**](ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner.md) |  | 
**startedat** | **int** | Started at | [optional] [default to null]
**statusclosed** | **bool** | Status closed | [optional] [default to False]
**statusmessage** | **str** | Status message | [optional] [default to 'null']
**statusopen** | **bool** | Status open | [optional] [default to False]
**statusrunning** | **bool** | Status running | [optional] [default to False]
**userlimit** | **int** | User limit | [default to null]

## Example

```python
from openapi_client.models.mod_bigbluebuttonbn_meeting_info200_response import ModBigbluebuttonbnMeetingInfo200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModBigbluebuttonbnMeetingInfo200Response from a JSON string
mod_bigbluebuttonbn_meeting_info200_response_instance = ModBigbluebuttonbnMeetingInfo200Response.from_json(json)
# print the JSON string representation of the object
print(ModBigbluebuttonbnMeetingInfo200Response.to_json())

# convert the object into a dict
mod_bigbluebuttonbn_meeting_info200_response_dict = mod_bigbluebuttonbn_meeting_info200_response_instance.to_dict()
# create an instance of ModBigbluebuttonbnMeetingInfo200Response from a dict
mod_bigbluebuttonbn_meeting_info200_response_from_dict = ModBigbluebuttonbnMeetingInfo200Response.from_dict(mod_bigbluebuttonbn_meeting_info200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


