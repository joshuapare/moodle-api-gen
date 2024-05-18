# ModH5pactivityGetAttempts200ResponseUsersattemptsInnerAttemptsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempt** | **int** | Attempt number | [optional] [default to null]
**completion** | **int** | Attempt completion | [optional] [default to null]
**duration** | **int** | Attempt duration in seconds | [optional] [default to null]
**h5pactivityid** | **int** | ID of the H5P activity | [optional] [default to null]
**id** | **int** | ID of the context | [optional] [default to null]
**maxscore** | **int** | Attempt max score | [optional] [default to null]
**rawscore** | **int** | Attempt score value | [optional] [default to null]
**scaled** | **float** | Attempt scaled | [optional] [default to null]
**success** | **int** | Attempt success | [optional] [default to null]
**timecreated** | **int** | Attempt creation | [optional] [default to null]
**timemodified** | **int** | Attempt modified | [optional] [default to null]
**userid** | **int** | ID of the user | [optional] 

## Example

```python
from openapi_client.models.mod_h5pactivity_get_attempts200_response_usersattempts_inner_attempts_inner import ModH5pactivityGetAttempts200ResponseUsersattemptsInnerAttemptsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModH5pactivityGetAttempts200ResponseUsersattemptsInnerAttemptsInner from a JSON string
mod_h5pactivity_get_attempts200_response_usersattempts_inner_attempts_inner_instance = ModH5pactivityGetAttempts200ResponseUsersattemptsInnerAttemptsInner.from_json(json)
# print the JSON string representation of the object
print(ModH5pactivityGetAttempts200ResponseUsersattemptsInnerAttemptsInner.to_json())

# convert the object into a dict
mod_h5pactivity_get_attempts200_response_usersattempts_inner_attempts_inner_dict = mod_h5pactivity_get_attempts200_response_usersattempts_inner_attempts_inner_instance.to_dict()
# create an instance of ModH5pactivityGetAttempts200ResponseUsersattemptsInnerAttemptsInner from a dict
mod_h5pactivity_get_attempts200_response_usersattempts_inner_attempts_inner_from_dict = ModH5pactivityGetAttempts200ResponseUsersattemptsInnerAttemptsInner.from_dict(mod_h5pactivity_get_attempts200_response_usersattempts_inner_attempts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


