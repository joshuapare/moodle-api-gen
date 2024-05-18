# LocalIomadLearningpathAddcoursesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseids** | **List[object]** |  | 
**groupid** | **int** | ID of group. If 0 just add to lowest numbered group | [optional] [default to 0]
**pathid** | **int** | ID of Iomad Learning Path | [default to null]

## Example

```python
from openapi_client.models.local_iomad_learningpath_addcourses_request import LocalIomadLearningpathAddcoursesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of LocalIomadLearningpathAddcoursesRequest from a JSON string
local_iomad_learningpath_addcourses_request_instance = LocalIomadLearningpathAddcoursesRequest.from_json(json)
# print the JSON string representation of the object
print(LocalIomadLearningpathAddcoursesRequest.to_json())

# convert the object into a dict
local_iomad_learningpath_addcourses_request_dict = local_iomad_learningpath_addcourses_request_instance.to_dict()
# create an instance of LocalIomadLearningpathAddcoursesRequest from a dict
local_iomad_learningpath_addcourses_request_from_dict = LocalIomadLearningpathAddcoursesRequest.from_dict(local_iomad_learningpath_addcourses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


