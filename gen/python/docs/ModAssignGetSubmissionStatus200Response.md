# ModAssignGetSubmissionStatus200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignmentdata** | [**ModAssignGetSubmissionStatus200ResponseAssignmentdata**](ModAssignGetSubmissionStatus200ResponseAssignmentdata.md) |  | [optional] 
**feedback** | [**ModAssignGetSubmissionStatus200ResponseFeedback**](ModAssignGetSubmissionStatus200ResponseFeedback.md) |  | [optional] 
**gradingsummary** | [**ModAssignGetSubmissionStatus200ResponseGradingsummary**](ModAssignGetSubmissionStatus200ResponseGradingsummary.md) |  | [optional] 
**lastattempt** | [**ModAssignGetSubmissionStatus200ResponseLastattempt**](ModAssignGetSubmissionStatus200ResponseLastattempt.md) |  | [optional] 
**previousattempts** | [**List[ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner]**](ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner.md) |  | [optional] 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_assign_get_submission_status200_response import ModAssignGetSubmissionStatus200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetSubmissionStatus200Response from a JSON string
mod_assign_get_submission_status200_response_instance = ModAssignGetSubmissionStatus200Response.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetSubmissionStatus200Response.to_json())

# convert the object into a dict
mod_assign_get_submission_status200_response_dict = mod_assign_get_submission_status200_response_instance.to_dict()
# create an instance of ModAssignGetSubmissionStatus200Response from a dict
mod_assign_get_submission_status200_response_from_dict = ModAssignGetSubmissionStatus200Response.from_dict(mod_assign_get_submission_status200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


