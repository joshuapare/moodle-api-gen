# ModAssignGetSubmissionStatus200ResponseAssignmentdata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activity** | **str** | Text of activity | [optional] [default to 'null']
**activityformat** | **int** | activity format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**attachments** | [**ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments**](ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_assign_get_submission_status200_response_assignmentdata import ModAssignGetSubmissionStatus200ResponseAssignmentdata

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetSubmissionStatus200ResponseAssignmentdata from a JSON string
mod_assign_get_submission_status200_response_assignmentdata_instance = ModAssignGetSubmissionStatus200ResponseAssignmentdata.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetSubmissionStatus200ResponseAssignmentdata.to_json())

# convert the object into a dict
mod_assign_get_submission_status200_response_assignmentdata_dict = mod_assign_get_submission_status200_response_assignmentdata_instance.to_dict()
# create an instance of ModAssignGetSubmissionStatus200ResponseAssignmentdata from a dict
mod_assign_get_submission_status200_response_assignmentdata_from_dict = ModAssignGetSubmissionStatus200ResponseAssignmentdata.from_dict(mod_assign_get_submission_status200_response_assignmentdata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


