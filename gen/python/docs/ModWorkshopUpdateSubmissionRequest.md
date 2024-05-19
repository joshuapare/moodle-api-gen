# ModWorkshopUpdateSubmissionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachmentsid** | **int** | The draft file area id for attachments | [optional] [default to 0]
**content** | **str** | Submission text content | [optional] [default to '']
**contentformat** | **int** | The format used for the content | [optional] [default to 0]
**inlineattachmentsid** | **int** | The draft file area id for inline attachments in the content | [optional] [default to 0]
**submissionid** | **int** | Submission id | 
**title** | **str** | Submission title | 

## Example

```python
from openapi_client.models.mod_workshop_update_submission_request import ModWorkshopUpdateSubmissionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopUpdateSubmissionRequest from a JSON string
mod_workshop_update_submission_request_instance = ModWorkshopUpdateSubmissionRequest.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopUpdateSubmissionRequest.to_json())

# convert the object into a dict
mod_workshop_update_submission_request_dict = mod_workshop_update_submission_request_instance.to_dict()
# create an instance of ModWorkshopUpdateSubmissionRequest from a dict
mod_workshop_update_submission_request_from_dict = ModWorkshopUpdateSubmissionRequest.from_dict(mod_workshop_update_submission_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


