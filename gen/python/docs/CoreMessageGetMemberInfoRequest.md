# CoreMessageGetMemberInfoRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**includecontactrequests** | **bool** | include contact requests in response | [optional] [default to False]
**includeprivacyinfo** | **bool** | include privacy info in response | [optional] [default to False]
**referenceuserid** | **int** | id of the user | [default to null]
**userids** | **List[object]** |  | 

## Example

```python
from openapi_client.models.core_message_get_member_info_request import CoreMessageGetMemberInfoRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetMemberInfoRequest from a JSON string
core_message_get_member_info_request_instance = CoreMessageGetMemberInfoRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetMemberInfoRequest.to_json())

# convert the object into a dict
core_message_get_member_info_request_dict = core_message_get_member_info_request_instance.to_dict()
# create an instance of CoreMessageGetMemberInfoRequest from a dict
core_message_get_member_info_request_from_dict = CoreMessageGetMemberInfoRequest.from_dict(core_message_get_member_info_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


