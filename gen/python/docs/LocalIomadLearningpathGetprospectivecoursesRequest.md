# LocalIomadLearningpathGetprospectivecoursesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **int** | Show only courses in this category (and children) | [optional] [default to 0]
**filter** | **str** | Filter course list returned | [optional] [default to '']
**pathid** | **int** | ID of (target) learning path | [default to null]
**program** | **int** | Show only courses assigned to this program license | [optional] [default to 0]

## Example

```python
from openapi_client.models.local_iomad_learningpath_getprospectivecourses_request import LocalIomadLearningpathGetprospectivecoursesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of LocalIomadLearningpathGetprospectivecoursesRequest from a JSON string
local_iomad_learningpath_getprospectivecourses_request_instance = LocalIomadLearningpathGetprospectivecoursesRequest.from_json(json)
# print the JSON string representation of the object
print(LocalIomadLearningpathGetprospectivecoursesRequest.to_json())

# convert the object into a dict
local_iomad_learningpath_getprospectivecourses_request_dict = local_iomad_learningpath_getprospectivecourses_request_instance.to_dict()
# create an instance of LocalIomadLearningpathGetprospectivecoursesRequest from a dict
local_iomad_learningpath_getprospectivecourses_request_from_dict = LocalIomadLearningpathGetprospectivecoursesRequest.from_dict(local_iomad_learningpath_getprospectivecourses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


