# ModScormGetScormAttemptCountRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ignoremissingcompletion** | **bool** | Ignores attempts that haven&#39;t reported a grade/completion | [optional] [default to False]
**scormid** | **int** | SCORM instance id | [default to null]
**userid** | **int** | User id | 

## Example

```python
from openapi_client.models.mod_scorm_get_scorm_attempt_count_request import ModScormGetScormAttemptCountRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModScormGetScormAttemptCountRequest from a JSON string
mod_scorm_get_scorm_attempt_count_request_instance = ModScormGetScormAttemptCountRequest.from_json(json)
# print the JSON string representation of the object
print(ModScormGetScormAttemptCountRequest.to_json())

# convert the object into a dict
mod_scorm_get_scorm_attempt_count_request_dict = mod_scorm_get_scorm_attempt_count_request_instance.to_dict()
# create an instance of ModScormGetScormAttemptCountRequest from a dict
mod_scorm_get_scorm_attempt_count_request_from_dict = ModScormGetScormAttemptCountRequest.from_dict(mod_scorm_get_scorm_attempt_count_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


