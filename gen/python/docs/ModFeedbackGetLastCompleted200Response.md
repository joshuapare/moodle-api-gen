# ModFeedbackGetLastCompleted200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completed** | [**ModFeedbackGetLastCompleted200ResponseCompleted**](ModFeedbackGetLastCompleted200ResponseCompleted.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_feedback_get_last_completed200_response import ModFeedbackGetLastCompleted200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetLastCompleted200Response from a JSON string
mod_feedback_get_last_completed200_response_instance = ModFeedbackGetLastCompleted200Response.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetLastCompleted200Response.to_json())

# convert the object into a dict
mod_feedback_get_last_completed200_response_dict = mod_feedback_get_last_completed200_response_instance.to_dict()
# create an instance of ModFeedbackGetLastCompleted200Response from a dict
mod_feedback_get_last_completed200_response_from_dict = ModFeedbackGetLastCompleted200Response.from_dict(mod_feedback_get_last_completed200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


