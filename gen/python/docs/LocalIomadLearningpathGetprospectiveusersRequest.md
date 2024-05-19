# LocalIomadLearningpathGetprospectiveusersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyid** | **int** | ID of Iomad Company | [default to null]
**filter** | **str** | Filter user list returned | [optional] [default to '']
**pathid** | **int** | ID learning path | [default to null]
**profilefieldid** | **int** | Filter by user profilefield | [optional] [default to 0]

## Example

```python
from openapi_client.models.local_iomad_learningpath_getprospectiveusers_request import LocalIomadLearningpathGetprospectiveusersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of LocalIomadLearningpathGetprospectiveusersRequest from a JSON string
local_iomad_learningpath_getprospectiveusers_request_instance = LocalIomadLearningpathGetprospectiveusersRequest.from_json(json)
# print the JSON string representation of the object
print(LocalIomadLearningpathGetprospectiveusersRequest.to_json())

# convert the object into a dict
local_iomad_learningpath_getprospectiveusers_request_dict = local_iomad_learningpath_getprospectiveusers_request_instance.to_dict()
# create an instance of LocalIomadLearningpathGetprospectiveusersRequest from a dict
local_iomad_learningpath_getprospectiveusers_request_from_dict = LocalIomadLearningpathGetprospectiveusersRequest.from_dict(local_iomad_learningpath_getprospectiveusers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


