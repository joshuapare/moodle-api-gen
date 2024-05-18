# ModWorkshopGetSubmissionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupid** | **int** | Group id, 0 means that the function will determine the user group.                                                    It will return submissions done by users in the given group. | [optional] [default to 0]
**page** | **int** | The page of records to return. | [optional] [default to 0]
**perpage** | **int** | The number of records to return per page. | [optional] [default to 0]
**userid** | **int** | Get submissions done by this user. Use 0 or empty for the current user | [optional] [default to 0]
**workshopid** | **int** | Workshop instance id. | 

## Example

```python
from openapi_client.models.mod_workshop_get_submissions_request import ModWorkshopGetSubmissionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetSubmissionsRequest from a JSON string
mod_workshop_get_submissions_request_instance = ModWorkshopGetSubmissionsRequest.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetSubmissionsRequest.to_json())

# convert the object into a dict
mod_workshop_get_submissions_request_dict = mod_workshop_get_submissions_request_instance.to_dict()
# create an instance of ModWorkshopGetSubmissionsRequest from a dict
mod_workshop_get_submissions_request_from_dict = ModWorkshopGetSubmissionsRequest.from_dict(mod_workshop_get_submissions_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


