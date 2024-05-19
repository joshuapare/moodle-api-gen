# ModQuizProcessAttempt200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | **str** | state: the new attempt state:                                                                     inprogress, finished, overdue, abandoned | [default to 'null']
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_quiz_process_attempt200_response import ModQuizProcessAttempt200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizProcessAttempt200Response from a JSON string
mod_quiz_process_attempt200_response_instance = ModQuizProcessAttempt200Response.from_json(json)
# print the JSON string representation of the object
print(ModQuizProcessAttempt200Response.to_json())

# convert the object into a dict
mod_quiz_process_attempt200_response_dict = mod_quiz_process_attempt200_response_instance.to_dict()
# create an instance of ModQuizProcessAttempt200Response from a dict
mod_quiz_process_attempt200_response_from_dict = ModQuizProcessAttempt200Response.from_dict(mod_quiz_process_attempt200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


