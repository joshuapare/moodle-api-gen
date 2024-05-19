# ModAssignGetParticipant200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowsubmissionsfromdate** | **int** | allowsubmissionsfromdate for the user | [default to null]
**blindmarking** | **bool** | is blind marking enabled for this assignment | [default to False]
**cutoffdate** | **int** | cutoffdate for the user | [default to null]
**duedate** | **int** | duedate for the user | [default to null]
**duedatestr** | **str** | duedate for the user | [default to 'null']
**fullname** | **str** | The fullname of the user | 
**grantedextension** | **bool** | have they been granted an extension | [default to False]
**groupid** | **int** | for group assignments this is the group id | [optional] [default to null]
**groupname** | **str** | for group assignments this is the group name | [optional] [default to 'null']
**id** | **int** | ID of the user | 
**requiregrading** | **bool** | is their submission waiting for grading | [default to False]
**submissionstatus** | **str** | The submission status (new, draft, reopened or submitted).                 Empty when not submitted. | [optional] [default to 'null']
**submitted** | **bool** | have they submitted their assignment | [default to False]
**user** | [**ModAssignGetParticipant200ResponseUser**](ModAssignGetParticipant200ResponseUser.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_assign_get_participant200_response import ModAssignGetParticipant200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetParticipant200Response from a JSON string
mod_assign_get_participant200_response_instance = ModAssignGetParticipant200Response.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetParticipant200Response.to_json())

# convert the object into a dict
mod_assign_get_participant200_response_dict = mod_assign_get_participant200_response_instance.to_dict()
# create an instance of ModAssignGetParticipant200Response from a dict
mod_assign_get_participant200_response_from_dict = ModAssignGetParticipant200Response.from_dict(mod_assign_get_participant200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


