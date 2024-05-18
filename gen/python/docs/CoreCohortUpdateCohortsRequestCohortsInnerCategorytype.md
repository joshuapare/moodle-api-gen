# CoreCohortUpdateCohortsRequestCohortsInnerCategorytype


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | the name of the field: id (numeric value                                         of course category id) or idnumber (alphanumeric value of idnumber course category)                                         or system (value ignored) | 
**value** | **str** | the value of the categorytype | 

## Example

```python
from openapi_client.models.core_cohort_update_cohorts_request_cohorts_inner_categorytype import CoreCohortUpdateCohortsRequestCohortsInnerCategorytype

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCohortUpdateCohortsRequestCohortsInnerCategorytype from a JSON string
core_cohort_update_cohorts_request_cohorts_inner_categorytype_instance = CoreCohortUpdateCohortsRequestCohortsInnerCategorytype.from_json(json)
# print the JSON string representation of the object
print(CoreCohortUpdateCohortsRequestCohortsInnerCategorytype.to_json())

# convert the object into a dict
core_cohort_update_cohorts_request_cohorts_inner_categorytype_dict = core_cohort_update_cohorts_request_cohorts_inner_categorytype_instance.to_dict()
# create an instance of CoreCohortUpdateCohortsRequestCohortsInnerCategorytype from a dict
core_cohort_update_cohorts_request_cohorts_inner_categorytype_from_dict = CoreCohortUpdateCohortsRequestCohortsInnerCategorytype.from_dict(core_cohort_update_cohorts_request_cohorts_inner_categorytype_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


