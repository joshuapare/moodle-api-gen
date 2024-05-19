# ModQuizGetAttemptAccessInformation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endtime** | **int** | When the attempt must be submitted (determined by rules). | [optional] [default to null]
**isfinished** | **bool** | Whether there is no way the user will ever be allowed to attempt. | [default to False]
**ispreflightcheckrequired** | **bool** | whether a check is required before the user                                                                     starts/continues his attempt. | [optional] [default to False]
**preventnewattemptreasons** | **List[object]** |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_quiz_get_attempt_access_information200_response import ModQuizGetAttemptAccessInformation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetAttemptAccessInformation200Response from a JSON string
mod_quiz_get_attempt_access_information200_response_instance = ModQuizGetAttemptAccessInformation200Response.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetAttemptAccessInformation200Response.to_json())

# convert the object into a dict
mod_quiz_get_attempt_access_information200_response_dict = mod_quiz_get_attempt_access_information200_response_instance.to_dict()
# create an instance of ModQuizGetAttemptAccessInformation200Response from a dict
mod_quiz_get_attempt_access_information200_response_from_dict = ModQuizGetAttemptAccessInformation200Response.from_dict(mod_quiz_get_attempt_access_information200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


