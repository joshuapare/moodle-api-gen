# LocalIomadLearningpathGetusersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyid** | **int** | ID of Iomad Company | 
**pathid** | **int** | ID learning path | 

## Example

```python
from openapi_client.models.local_iomad_learningpath_getusers_request import LocalIomadLearningpathGetusersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of LocalIomadLearningpathGetusersRequest from a JSON string
local_iomad_learningpath_getusers_request_instance = LocalIomadLearningpathGetusersRequest.from_json(json)
# print the JSON string representation of the object
print(LocalIomadLearningpathGetusersRequest.to_json())

# convert the object into a dict
local_iomad_learningpath_getusers_request_dict = local_iomad_learningpath_getusers_request_instance.to_dict()
# create an instance of LocalIomadLearningpathGetusersRequest from a dict
local_iomad_learningpath_getusers_request_from_dict = LocalIomadLearningpathGetusersRequest.from_dict(local_iomad_learningpath_getusers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


