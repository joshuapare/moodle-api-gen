# ModFeedbackGetNonRespondents200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **int** | Total number of non respondents | [default to null]
**users** | [**List[ModFeedbackGetNonRespondents200ResponseUsersInner]**](ModFeedbackGetNonRespondents200ResponseUsersInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_feedback_get_non_respondents200_response import ModFeedbackGetNonRespondents200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetNonRespondents200Response from a JSON string
mod_feedback_get_non_respondents200_response_instance = ModFeedbackGetNonRespondents200Response.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetNonRespondents200Response.to_json())

# convert the object into a dict
mod_feedback_get_non_respondents200_response_dict = mod_feedback_get_non_respondents200_response_instance.to_dict()
# create an instance of ModFeedbackGetNonRespondents200Response from a dict
mod_feedback_get_non_respondents200_response_from_dict = ModFeedbackGetNonRespondents200Response.from_dict(mod_feedback_get_non_respondents200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


