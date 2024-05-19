# ModAssignListParticipantsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignid** | **int** | assign instance id | 
**filter** | **str** | search string to filter the results | [default to 'null']
**groupid** | **int** | group id | 
**includeenrolments** | **bool** | Do return courses where the user is enrolled | [optional] [default to True]
**limit** | **int** | maximum number of records to return | [optional] [default to 0]
**onlyids** | **bool** | Do not return all user fields | [optional] [default to False]
**skip** | **int** | number of records to skip | [optional] [default to 0]
**tablesort** | **bool** | Apply current user table sorting preferences. | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_assign_list_participants_request import ModAssignListParticipantsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignListParticipantsRequest from a JSON string
mod_assign_list_participants_request_instance = ModAssignListParticipantsRequest.from_json(json)
# print the JSON string representation of the object
print(ModAssignListParticipantsRequest.to_json())

# convert the object into a dict
mod_assign_list_participants_request_dict = mod_assign_list_participants_request_instance.to_dict()
# create an instance of ModAssignListParticipantsRequest from a dict
mod_assign_list_participants_request_from_dict = ModAssignListParticipantsRequest.from_dict(mod_assign_list_participants_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


