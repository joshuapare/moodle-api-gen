# CoreCohortUpdateCohortsRequestCohortsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categorytype** | [**CoreCohortUpdateCohortsRequestCohortsInnerCategorytype**](CoreCohortUpdateCohortsRequestCohortsInnerCategorytype.md) |  | [optional] 
**customfields** | [**List[CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner]**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**description** | **str** | cohort description | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**id** | **int** | ID of the cohort | [optional] 
**idnumber** | **str** | cohort idnumber | [optional] 
**name** | **str** | cohort name | [optional] 
**theme** | **str** | the cohort theme. The allowcohortthemes setting must be enabled on Moodle | [optional] 
**visible** | **bool** | cohort visible | [optional] 

## Example

```python
from openapi_client.models.core_cohort_update_cohorts_request_cohorts_inner import CoreCohortUpdateCohortsRequestCohortsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCohortUpdateCohortsRequestCohortsInner from a JSON string
core_cohort_update_cohorts_request_cohorts_inner_instance = CoreCohortUpdateCohortsRequestCohortsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCohortUpdateCohortsRequestCohortsInner.to_json())

# convert the object into a dict
core_cohort_update_cohorts_request_cohorts_inner_dict = core_cohort_update_cohorts_request_cohorts_inner_instance.to_dict()
# create an instance of CoreCohortUpdateCohortsRequestCohortsInner from a dict
core_cohort_update_cohorts_request_cohorts_inner_from_dict = CoreCohortUpdateCohortsRequestCohortsInner.from_dict(core_cohort_update_cohorts_request_cohorts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


