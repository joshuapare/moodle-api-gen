# CoreCohortUpdateCohortsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cohorts** | [**List[CoreCohortUpdateCohortsRequestCohortsInner]**](CoreCohortUpdateCohortsRequestCohortsInner.md) |  | 

## Example

```python
from openapi_client.models.core_cohort_update_cohorts_request import CoreCohortUpdateCohortsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCohortUpdateCohortsRequest from a JSON string
core_cohort_update_cohorts_request_instance = CoreCohortUpdateCohortsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCohortUpdateCohortsRequest.to_json())

# convert the object into a dict
core_cohort_update_cohorts_request_dict = core_cohort_update_cohorts_request_instance.to_dict()
# create an instance of CoreCohortUpdateCohortsRequest from a dict
core_cohort_update_cohorts_request_from_dict = CoreCohortUpdateCohortsRequest.from_dict(core_cohort_update_cohorts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


