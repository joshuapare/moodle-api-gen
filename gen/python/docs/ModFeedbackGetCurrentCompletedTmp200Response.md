# ModFeedbackGetCurrentCompletedTmp200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedback** | [**ModFeedbackGetCurrentCompletedTmp200ResponseFeedback**](ModFeedbackGetCurrentCompletedTmp200ResponseFeedback.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_feedback_get_current_completed_tmp200_response import ModFeedbackGetCurrentCompletedTmp200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetCurrentCompletedTmp200Response from a JSON string
mod_feedback_get_current_completed_tmp200_response_instance = ModFeedbackGetCurrentCompletedTmp200Response.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetCurrentCompletedTmp200Response.to_json())

# convert the object into a dict
mod_feedback_get_current_completed_tmp200_response_dict = mod_feedback_get_current_completed_tmp200_response_instance.to_dict()
# create an instance of ModFeedbackGetCurrentCompletedTmp200Response from a dict
mod_feedback_get_current_completed_tmp200_response_from_dict = ModFeedbackGetCurrentCompletedTmp200Response.from_dict(mod_feedback_get_current_completed_tmp200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


