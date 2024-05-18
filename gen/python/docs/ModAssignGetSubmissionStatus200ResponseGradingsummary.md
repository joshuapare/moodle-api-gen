# ModAssignGetSubmissionStatus200ResponseGradingsummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**participantcount** | **int** | Number of users who can submit. | [default to null]
**submissiondraftscount** | **int** | Number of submissions in draft status. | [default to null]
**submissionsenabled** | **bool** | Whether submissions are enabled or not. | [default to False]
**submissionsneedgradingcount** | **int** | Number of submissions that need grading. | [default to null]
**submissionssubmittedcount** | **int** | Number of submissions in submitted status. | [default to null]
**warnofungroupedusers** | **str** | Whether we need to warn people that there                                                                         are users without groups (&#39;warningrequired&#39;), warn                                                                         people there are users who will submit in the default                                                                         group (&#39;warningoptional&#39;) or no warning (&#39;&#39;). | [default to 'null']

## Example

```python
from openapi_client.models.mod_assign_get_submission_status200_response_gradingsummary import ModAssignGetSubmissionStatus200ResponseGradingsummary

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetSubmissionStatus200ResponseGradingsummary from a JSON string
mod_assign_get_submission_status200_response_gradingsummary_instance = ModAssignGetSubmissionStatus200ResponseGradingsummary.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetSubmissionStatus200ResponseGradingsummary.to_json())

# convert the object into a dict
mod_assign_get_submission_status200_response_gradingsummary_dict = mod_assign_get_submission_status200_response_gradingsummary_instance.to_dict()
# create an instance of ModAssignGetSubmissionStatus200ResponseGradingsummary from a dict
mod_assign_get_submission_status200_response_gradingsummary_from_dict = ModAssignGetSubmissionStatus200ResponseGradingsummary.from_dict(mod_assign_get_submission_status200_response_gradingsummary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


