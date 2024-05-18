# ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempts** | [**List[ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner]**](ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.md) |  | [optional] 
**scored** | [**ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScored**](ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScored.md) |  | [optional] 
**userid** | **int** | The user id | [optional] 

## Example

```python
from openapi_client.models.mod_h5pactivity_get_user_attempts200_response_usersattempts_inner import ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner from a JSON string
mod_h5pactivity_get_user_attempts200_response_usersattempts_inner_instance = ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner.from_json(json)
# print the JSON string representation of the object
print(ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner.to_json())

# convert the object into a dict
mod_h5pactivity_get_user_attempts200_response_usersattempts_inner_dict = mod_h5pactivity_get_user_attempts200_response_usersattempts_inner_instance.to_dict()
# create an instance of ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner from a dict
mod_h5pactivity_get_user_attempts200_response_usersattempts_inner_from_dict = ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner.from_dict(mod_h5pactivity_get_user_attempts200_response_usersattempts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


