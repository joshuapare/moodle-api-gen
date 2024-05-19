# LocalIomadLearningpathRemoveusersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pathid** | **int** | ID of Iomad Learning Path | 
**userids** | **List[object]** |  | 

## Example

```python
from openapi_client.models.local_iomad_learningpath_removeusers_request import LocalIomadLearningpathRemoveusersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of LocalIomadLearningpathRemoveusersRequest from a JSON string
local_iomad_learningpath_removeusers_request_instance = LocalIomadLearningpathRemoveusersRequest.from_json(json)
# print the JSON string representation of the object
print(LocalIomadLearningpathRemoveusersRequest.to_json())

# convert the object into a dict
local_iomad_learningpath_removeusers_request_dict = local_iomad_learningpath_removeusers_request_instance.to_dict()
# create an instance of LocalIomadLearningpathRemoveusersRequest from a dict
local_iomad_learningpath_removeusers_request_from_dict = LocalIomadLearningpathRemoveusersRequest.from_dict(local_iomad_learningpath_removeusers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


