# ModWorkshopAddSubmissionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachmentsid** | **int** | The draft file area id for attachments | [optional] [default to 0]
**content** | **str** | Submission text content | [optional] [default to '']
**contentformat** | **int** | The format used for the content | [optional] [default to 0]
**inlineattachmentsid** | **int** | The draft file area id for inline attachments in the content | [optional] [default to 0]
**title** | **str** | Submission title | [default to 'null']
**workshopid** | **int** | Workshop id | [default to null]

## Example

```python
from openapi_client.models.mod_workshop_add_submission_request import ModWorkshopAddSubmissionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopAddSubmissionRequest from a JSON string
mod_workshop_add_submission_request_instance = ModWorkshopAddSubmissionRequest.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopAddSubmissionRequest.to_json())

# convert the object into a dict
mod_workshop_add_submission_request_dict = mod_workshop_add_submission_request_instance.to_dict()
# create an instance of ModWorkshopAddSubmissionRequest from a dict
mod_workshop_add_submission_request_from_dict = ModWorkshopAddSubmissionRequest.from_dict(mod_workshop_add_submission_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


