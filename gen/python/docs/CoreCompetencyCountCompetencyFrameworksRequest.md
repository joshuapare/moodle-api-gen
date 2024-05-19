# CoreCompetencyCountCompetencyFrameworksRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  | 
**includes** | **str** | What other contextes to fetch the frameworks from. (children, parents, self) | [optional] [default to 'children']

## Example

```python
from openapi_client.models.core_competency_count_competency_frameworks_request import CoreCompetencyCountCompetencyFrameworksRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCountCompetencyFrameworksRequest from a JSON string
core_competency_count_competency_frameworks_request_instance = CoreCompetencyCountCompetencyFrameworksRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCountCompetencyFrameworksRequest.to_json())

# convert the object into a dict
core_competency_count_competency_frameworks_request_dict = core_competency_count_competency_frameworks_request_instance.to_dict()
# create an instance of CoreCompetencyCountCompetencyFrameworksRequest from a dict
core_competency_count_competency_frameworks_request_from_dict = CoreCompetencyCountCompetencyFrameworksRequest.from_dict(core_competency_count_competency_frameworks_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


