# CoreCohortSearchCohortsRequestContext


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | Context ID. Either use this value, or level and instanceid. | [optional] [default to 0]
**contextlevel** | **str** | Context level. To be used with instanceid. | [optional] [default to '']
**instanceid** | **int** | Context instance ID. To be used with level | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_cohort_search_cohorts_request_context import CoreCohortSearchCohortsRequestContext

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCohortSearchCohortsRequestContext from a JSON string
core_cohort_search_cohorts_request_context_instance = CoreCohortSearchCohortsRequestContext.from_json(json)
# print the JSON string representation of the object
print(CoreCohortSearchCohortsRequestContext.to_json())

# convert the object into a dict
core_cohort_search_cohorts_request_context_dict = core_cohort_search_cohorts_request_context_instance.to_dict()
# create an instance of CoreCohortSearchCohortsRequestContext from a dict
core_cohort_search_cohorts_request_context_from_dict = CoreCohortSearchCohortsRequestContext.from_dict(core_cohort_search_cohorts_request_context_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


