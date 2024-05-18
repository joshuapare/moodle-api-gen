# ModAssignGetParticipantRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignid** | **int** | assign instance id | [default to null]
**embeduser** | **bool** | user id | [optional] [default to False]
**userid** | **int** | user id | 

## Example

```python
from openapi_client.models.mod_assign_get_participant_request import ModAssignGetParticipantRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetParticipantRequest from a JSON string
mod_assign_get_participant_request_instance = ModAssignGetParticipantRequest.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetParticipantRequest.to_json())

# convert the object into a dict
mod_assign_get_participant_request_dict = mod_assign_get_participant_request_instance.to_dict()
# create an instance of ModAssignGetParticipantRequest from a dict
mod_assign_get_participant_request_from_dict = ModAssignGetParticipantRequest.from_dict(mod_assign_get_participant_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


