# LocalIomadLearningpathRemovecoursesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseids** | **List[object]** |  | 
**pathid** | **int** | ID of Iomad Learning Path | 

## Example

```python
from openapi_client.models.local_iomad_learningpath_removecourses_request import LocalIomadLearningpathRemovecoursesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of LocalIomadLearningpathRemovecoursesRequest from a JSON string
local_iomad_learningpath_removecourses_request_instance = LocalIomadLearningpathRemovecoursesRequest.from_json(json)
# print the JSON string representation of the object
print(LocalIomadLearningpathRemovecoursesRequest.to_json())

# convert the object into a dict
local_iomad_learningpath_removecourses_request_dict = local_iomad_learningpath_removecourses_request_instance.to_dict()
# create an instance of LocalIomadLearningpathRemovecoursesRequest from a dict
local_iomad_learningpath_removecourses_request_from_dict = LocalIomadLearningpathRemovecoursesRequest.from_dict(local_iomad_learningpath_removecourses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


