# ModFeedbackProcessPage200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completed** | **bool** | If the user completed the feedback. | [default to False]
**completionpagecontents** | **str** | The completion page contents. | [default to 'null']
**jumpto** | **int** | The page to jump to. | [default to null]
**siteaftersubmit** | **str** | The link (could be relative) to show after submit. | [default to 'null']
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_feedback_process_page200_response import ModFeedbackProcessPage200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackProcessPage200Response from a JSON string
mod_feedback_process_page200_response_instance = ModFeedbackProcessPage200Response.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackProcessPage200Response.to_json())

# convert the object into a dict
mod_feedback_process_page200_response_dict = mod_feedback_process_page200_response_instance.to_dict()
# create an instance of ModFeedbackProcessPage200Response from a dict
mod_feedback_process_page200_response_from_dict = ModFeedbackProcessPage200Response.from_dict(mod_feedback_process_page200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


