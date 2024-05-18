# ModWorkshopDeleteSubmissionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**submissionid** | **int** | Submission id | [default to null]

## Example

```python
from openapi_client.models.mod_workshop_delete_submission_request import ModWorkshopDeleteSubmissionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopDeleteSubmissionRequest from a JSON string
mod_workshop_delete_submission_request_instance = ModWorkshopDeleteSubmissionRequest.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopDeleteSubmissionRequest.to_json())

# convert the object into a dict
mod_workshop_delete_submission_request_dict = mod_workshop_delete_submission_request_instance.to_dict()
# create an instance of ModWorkshopDeleteSubmissionRequest from a dict
mod_workshop_delete_submission_request_from_dict = ModWorkshopDeleteSubmissionRequest.from_dict(mod_workshop_delete_submission_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


