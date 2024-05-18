# ModFeedbackGetAnalysis200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completedcount** | **int** | Number of completed submissions. | [default to null]
**itemscount** | **int** | Number of items (questions). | [default to null]
**itemsdata** | [**List[ModFeedbackGetAnalysis200ResponseItemsdataInner]**](ModFeedbackGetAnalysis200ResponseItemsdataInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_feedback_get_analysis200_response import ModFeedbackGetAnalysis200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetAnalysis200Response from a JSON string
mod_feedback_get_analysis200_response_instance = ModFeedbackGetAnalysis200Response.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetAnalysis200Response.to_json())

# convert the object into a dict
mod_feedback_get_analysis200_response_dict = mod_feedback_get_analysis200_response_instance.to_dict()
# create an instance of ModFeedbackGetAnalysis200Response from a dict
mod_feedback_get_analysis200_response_from_dict = ModFeedbackGetAnalysis200Response.from_dict(mod_feedback_get_analysis200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


