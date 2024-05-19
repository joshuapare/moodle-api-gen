# ModAssignRevertSubmissionsToDraftRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignmentid** | **int** | The assignment id to operate on | 
**userids** | **List[object]** |  | 

## Example

```python
from openapi_client.models.mod_assign_revert_submissions_to_draft_request import ModAssignRevertSubmissionsToDraftRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignRevertSubmissionsToDraftRequest from a JSON string
mod_assign_revert_submissions_to_draft_request_instance = ModAssignRevertSubmissionsToDraftRequest.from_json(json)
# print the JSON string representation of the object
print(ModAssignRevertSubmissionsToDraftRequest.to_json())

# convert the object into a dict
mod_assign_revert_submissions_to_draft_request_dict = mod_assign_revert_submissions_to_draft_request_instance.to_dict()
# create an instance of ModAssignRevertSubmissionsToDraftRequest from a dict
mod_assign_revert_submissions_to_draft_request_from_dict = ModAssignRevertSubmissionsToDraftRequest.from_dict(mod_assign_revert_submissions_to_draft_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


