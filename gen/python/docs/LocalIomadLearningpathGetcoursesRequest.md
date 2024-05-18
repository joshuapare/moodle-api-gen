# LocalIomadLearningpathGetcoursesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupid** | **int** | ID of Iomad Learning Path group (0 &#x3D; return all) | [optional] [default to 0]
**pathid** | **int** | ID of Iomad Learning Path | 

## Example

```python
from openapi_client.models.local_iomad_learningpath_getcourses_request import LocalIomadLearningpathGetcoursesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of LocalIomadLearningpathGetcoursesRequest from a JSON string
local_iomad_learningpath_getcourses_request_instance = LocalIomadLearningpathGetcoursesRequest.from_json(json)
# print the JSON string representation of the object
print(LocalIomadLearningpathGetcoursesRequest.to_json())

# convert the object into a dict
local_iomad_learningpath_getcourses_request_dict = local_iomad_learningpath_getcourses_request_instance.to_dict()
# create an instance of LocalIomadLearningpathGetcoursesRequest from a dict
local_iomad_learningpath_getcourses_request_from_dict = LocalIomadLearningpathGetcoursesRequest.from_dict(local_iomad_learningpath_getcourses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


