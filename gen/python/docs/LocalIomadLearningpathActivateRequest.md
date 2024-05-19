# LocalIomadLearningpathActivateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pathid** | **int** | ID of Learning Path | [default to null]
**state** | **int** | Active (1) / deactivate (0) | [default to null]

## Example

```python
from openapi_client.models.local_iomad_learningpath_activate_request import LocalIomadLearningpathActivateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of LocalIomadLearningpathActivateRequest from a JSON string
local_iomad_learningpath_activate_request_instance = LocalIomadLearningpathActivateRequest.from_json(json)
# print the JSON string representation of the object
print(LocalIomadLearningpathActivateRequest.to_json())

# convert the object into a dict
local_iomad_learningpath_activate_request_dict = local_iomad_learningpath_activate_request_instance.to_dict()
# create an instance of LocalIomadLearningpathActivateRequest from a dict
local_iomad_learningpath_activate_request_from_dict = LocalIomadLearningpathActivateRequest.from_dict(local_iomad_learningpath_activate_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


