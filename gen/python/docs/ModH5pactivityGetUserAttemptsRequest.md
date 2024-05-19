# ModH5pactivityGetUserAttemptsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstinitial** | **str** | Users whose first name starts with $firstinitial | [optional] [default to '']
**h5pactivityid** | **int** | h5p activity instance id | 
**lastinitial** | **str** | Users whose last name starts with $lastinitial | [optional] [default to '']
**page** | **int** | current page | [optional] [default to -1]
**perpage** | **int** | items per page | [optional] [default to 0]
**sortorder** | **str** | sort by either user id, firstname or lastname (with optional asc/desc) | [optional] [default to 'id ASC']

## Example

```python
from openapi_client.models.mod_h5pactivity_get_user_attempts_request import ModH5pactivityGetUserAttemptsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModH5pactivityGetUserAttemptsRequest from a JSON string
mod_h5pactivity_get_user_attempts_request_instance = ModH5pactivityGetUserAttemptsRequest.from_json(json)
# print the JSON string representation of the object
print(ModH5pactivityGetUserAttemptsRequest.to_json())

# convert the object into a dict
mod_h5pactivity_get_user_attempts_request_dict = mod_h5pactivity_get_user_attempts_request_instance.to_dict()
# create an instance of ModH5pactivityGetUserAttemptsRequest from a dict
mod_h5pactivity_get_user_attempts_request_from_dict = ModH5pactivityGetUserAttemptsRequest.from_dict(mod_h5pactivity_get_user_attempts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


