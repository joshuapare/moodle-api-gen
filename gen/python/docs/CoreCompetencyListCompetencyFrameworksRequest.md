# CoreCompetencyListCompetencyFrameworksRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  | 
**includes** | **str** | What other contextes to fetch the frameworks from. (children, parents, self) | [optional] [default to 'children']
**limit** | **int** | Return this number of records at most. | [optional] [default to 0]
**onlyvisible** | **bool** | Only visible frameworks will be returned if visible true | [optional] [default to False]
**order** | **str** | Sort direction. Should be either ASC or DESC | [optional] [default to '']
**query** | **str** | A query string to filter the results | [optional] [default to '']
**skip** | **int** | Skip this number of records before returning results | [optional] [default to 0]
**sort** | **str** | Column to sort by. | [optional] [default to 'shortname']

## Example

```python
from openapi_client.models.core_competency_list_competency_frameworks_request import CoreCompetencyListCompetencyFrameworksRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyListCompetencyFrameworksRequest from a JSON string
core_competency_list_competency_frameworks_request_instance = CoreCompetencyListCompetencyFrameworksRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyListCompetencyFrameworksRequest.to_json())

# convert the object into a dict
core_competency_list_competency_frameworks_request_dict = core_competency_list_competency_frameworks_request_instance.to_dict()
# create an instance of CoreCompetencyListCompetencyFrameworksRequest from a dict
core_competency_list_competency_frameworks_request_from_dict = CoreCompetencyListCompetencyFrameworksRequest.from_dict(core_competency_list_competency_frameworks_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


