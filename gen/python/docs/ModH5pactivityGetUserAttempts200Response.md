# ModH5pactivityGetUserAttempts200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activityid** | **int** | Activity course module ID | 
**usersattempts** | [**List[ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner]**](ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_h5pactivity_get_user_attempts200_response import ModH5pactivityGetUserAttempts200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModH5pactivityGetUserAttempts200Response from a JSON string
mod_h5pactivity_get_user_attempts200_response_instance = ModH5pactivityGetUserAttempts200Response.from_json(json)
# print the JSON string representation of the object
print(ModH5pactivityGetUserAttempts200Response.to_json())

# convert the object into a dict
mod_h5pactivity_get_user_attempts200_response_dict = mod_h5pactivity_get_user_attempts200_response_instance.to_dict()
# create an instance of ModH5pactivityGetUserAttempts200Response from a dict
mod_h5pactivity_get_user_attempts200_response_from_dict = ModH5pactivityGetUserAttempts200Response.from_dict(mod_h5pactivity_get_user_attempts200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


