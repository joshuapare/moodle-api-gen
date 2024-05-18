# CoreCohortSearchCohorts200ResponseCohortsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customfields** | [**List[CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner]**](CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner.md) |  | [optional] 
**description** | **str** | cohort description | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**id** | **int** | ID of the cohort | [optional] [default to null]
**idnumber** | **str** | cohort idnumber | [optional] 
**name** | **str** | cohort name | [optional] 
**theme** | **str** | cohort theme | [optional] [default to 'null']
**visible** | **bool** | cohort visible | [optional] [default to False]

## Example

```python
from openapi_client.models.core_cohort_search_cohorts200_response_cohorts_inner import CoreCohortSearchCohorts200ResponseCohortsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCohortSearchCohorts200ResponseCohortsInner from a JSON string
core_cohort_search_cohorts200_response_cohorts_inner_instance = CoreCohortSearchCohorts200ResponseCohortsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCohortSearchCohorts200ResponseCohortsInner.to_json())

# convert the object into a dict
core_cohort_search_cohorts200_response_cohorts_inner_dict = core_cohort_search_cohorts200_response_cohorts_inner_instance.to_dict()
# create an instance of CoreCohortSearchCohorts200ResponseCohortsInner from a dict
core_cohort_search_cohorts200_response_cohorts_inner_from_dict = CoreCohortSearchCohorts200ResponseCohortsInner.from_dict(core_cohort_search_cohorts200_response_cohorts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


