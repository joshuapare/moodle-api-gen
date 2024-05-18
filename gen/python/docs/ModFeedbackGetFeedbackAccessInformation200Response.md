# ModFeedbackGetFeedbackAccessInformation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancomplete** | **bool** | Whether the user can complete the feedback or not. | [default to False]
**candeletesubmissions** | **bool** | Whether the user can delete submissions or not. | [default to False]
**canedititems** | **bool** | Whether the user can edit feedback items or not. | [default to False]
**cansubmit** | **bool** | Whether the user can submit the feedback or not. | [default to False]
**canviewanalysis** | **bool** | Whether the user can view the analysis or not. | [default to False]
**canviewreports** | **bool** | Whether the user can view the feedback reports or not. | [default to False]
**isalreadysubmitted** | **bool** | Whether the feedback is already submitted or not. | [default to False]
**isanonymous** | **bool** | Whether the feedback is anonymous or not. | [default to False]
**isempty** | **bool** | Whether the feedback has questions or not. | [default to False]
**isopen** | **bool** | Whether the feedback has active access time restrictions or not. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_feedback_get_feedback_access_information200_response import ModFeedbackGetFeedbackAccessInformation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetFeedbackAccessInformation200Response from a JSON string
mod_feedback_get_feedback_access_information200_response_instance = ModFeedbackGetFeedbackAccessInformation200Response.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetFeedbackAccessInformation200Response.to_json())

# convert the object into a dict
mod_feedback_get_feedback_access_information200_response_dict = mod_feedback_get_feedback_access_information200_response_instance.to_dict()
# create an instance of ModFeedbackGetFeedbackAccessInformation200Response from a dict
mod_feedback_get_feedback_access_information200_response_from_dict = ModFeedbackGetFeedbackAccessInformation200Response.from_dict(mod_feedback_get_feedback_access_information200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


