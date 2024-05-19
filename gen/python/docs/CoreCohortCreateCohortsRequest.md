# CoreCohortCreateCohortsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cohorts** | [**List[CoreCohortCreateCohortsRequestCohortsInner]**](CoreCohortCreateCohortsRequestCohortsInner.md) |  | 

## Example

```python
from openapi_client.models.core_cohort_create_cohorts_request import CoreCohortCreateCohortsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCohortCreateCohortsRequest from a JSON string
core_cohort_create_cohorts_request_instance = CoreCohortCreateCohortsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCohortCreateCohortsRequest.to_json())

# convert the object into a dict
core_cohort_create_cohorts_request_dict = core_cohort_create_cohorts_request_instance.to_dict()
# create an instance of CoreCohortCreateCohortsRequest from a dict
core_cohort_create_cohorts_request_from_dict = CoreCohortCreateCohortsRequest.from_dict(core_cohort_create_cohorts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


