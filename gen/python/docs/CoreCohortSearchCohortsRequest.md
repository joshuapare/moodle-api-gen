# CoreCohortSearchCohortsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  | 
**includes** | **str** | What other contexts to fetch the frameworks from. (all, parents, self) | [optional] [default to 'parents']
**limitfrom** | **int** | limitfrom we are fetching the records from | [optional] [default to 0]
**limitnum** | **int** | Number of records to fetch | [optional] [default to 25]
**query** | **str** | Query string | [default to 'null']

## Example

```python
from openapi_client.models.core_cohort_search_cohorts_request import CoreCohortSearchCohortsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCohortSearchCohortsRequest from a JSON string
core_cohort_search_cohorts_request_instance = CoreCohortSearchCohortsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCohortSearchCohortsRequest.to_json())

# convert the object into a dict
core_cohort_search_cohorts_request_dict = core_cohort_search_cohorts_request_instance.to_dict()
# create an instance of CoreCohortSearchCohortsRequest from a dict
core_cohort_search_cohorts_request_from_dict = CoreCohortSearchCohortsRequest.from_dict(core_cohort_search_cohorts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


