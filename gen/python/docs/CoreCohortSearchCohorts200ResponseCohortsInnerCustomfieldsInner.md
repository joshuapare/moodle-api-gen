# CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the custom field | [optional] 
**shortname** | **str** | The shortname of the custom field - to be able to build the field class in the code | [optional] [default to 'null']
**type** | **str** | The type of the custom field - text field, checkbox... | [optional] [default to 'null']
**value** | **str** | The value of the custom field | [optional] 
**valueraw** | **str** | The raw value of the custom field | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_cohort_search_cohorts200_response_cohorts_inner_customfields_inner import CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner from a JSON string
core_cohort_search_cohorts200_response_cohorts_inner_customfields_inner_instance = CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner.to_json())

# convert the object into a dict
core_cohort_search_cohorts200_response_cohorts_inner_customfields_inner_dict = core_cohort_search_cohorts200_response_cohorts_inner_customfields_inner_instance.to_dict()
# create an instance of CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner from a dict
core_cohort_search_cohorts200_response_cohorts_inner_customfields_inner_from_dict = CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner.from_dict(core_cohort_search_cohorts200_response_cohorts_inner_customfields_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


