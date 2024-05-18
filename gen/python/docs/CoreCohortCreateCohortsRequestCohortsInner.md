# CoreCohortCreateCohortsRequestCohortsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categorytype** | [**CoreCohortCreateCohortsRequestCohortsInnerCategorytype**](CoreCohortCreateCohortsRequestCohortsInnerCategorytype.md) |  | [optional] 
**customfields** | [**List[CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner]**](CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**description** | **str** | cohort description | [optional] [default to 'null']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**idnumber** | **str** | cohort idnumber | [optional] [default to 'null']
**name** | **str** | cohort name | [optional] [default to 'null']
**theme** | **str** | the cohort theme. The allowcohortthemes setting must be enabled on Moodle | [optional] [default to 'null']
**visible** | **bool** | cohort visible | [optional] [default to True]

## Example

```python
from openapi_client.models.core_cohort_create_cohorts_request_cohorts_inner import CoreCohortCreateCohortsRequestCohortsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCohortCreateCohortsRequestCohortsInner from a JSON string
core_cohort_create_cohorts_request_cohorts_inner_instance = CoreCohortCreateCohortsRequestCohortsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCohortCreateCohortsRequestCohortsInner.to_json())

# convert the object into a dict
core_cohort_create_cohorts_request_cohorts_inner_dict = core_cohort_create_cohorts_request_cohorts_inner_instance.to_dict()
# create an instance of CoreCohortCreateCohortsRequestCohortsInner from a dict
core_cohort_create_cohorts_request_cohorts_inner_from_dict = CoreCohortCreateCohortsRequestCohortsInner.from_dict(core_cohort_create_cohorts_request_cohorts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


