# LocalIomadLearningpathOrdercoursesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courses** | [**List[LocalIomadLearningpathOrdercoursesRequestCoursesInner]**](LocalIomadLearningpathOrdercoursesRequestCoursesInner.md) |  | 
**pathid** | **int** | ID of Iomad Learning Path | 

## Example

```python
from openapi_client.models.local_iomad_learningpath_ordercourses_request import LocalIomadLearningpathOrdercoursesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of LocalIomadLearningpathOrdercoursesRequest from a JSON string
local_iomad_learningpath_ordercourses_request_instance = LocalIomadLearningpathOrdercoursesRequest.from_json(json)
# print the JSON string representation of the object
print(LocalIomadLearningpathOrdercoursesRequest.to_json())

# convert the object into a dict
local_iomad_learningpath_ordercourses_request_dict = local_iomad_learningpath_ordercourses_request_instance.to_dict()
# create an instance of LocalIomadLearningpathOrdercoursesRequest from a dict
local_iomad_learningpath_ordercourses_request_from_dict = LocalIomadLearningpathOrdercoursesRequest.from_dict(local_iomad_learningpath_ordercourses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


