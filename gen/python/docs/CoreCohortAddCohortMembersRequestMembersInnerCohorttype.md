# CoreCohortAddCohortMembersRequestMembersInnerCohorttype


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The name of the field: id                                         (numeric value of cohortid) or idnumber (alphanumeric value of idnumber)  | [default to 'null']
**value** | **str** | The value of the cohort | [default to 'null']

## Example

```python
from openapi_client.models.core_cohort_add_cohort_members_request_members_inner_cohorttype import CoreCohortAddCohortMembersRequestMembersInnerCohorttype

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCohortAddCohortMembersRequestMembersInnerCohorttype from a JSON string
core_cohort_add_cohort_members_request_members_inner_cohorttype_instance = CoreCohortAddCohortMembersRequestMembersInnerCohorttype.from_json(json)
# print the JSON string representation of the object
print(CoreCohortAddCohortMembersRequestMembersInnerCohorttype.to_json())

# convert the object into a dict
core_cohort_add_cohort_members_request_members_inner_cohorttype_dict = core_cohort_add_cohort_members_request_members_inner_cohorttype_instance.to_dict()
# create an instance of CoreCohortAddCohortMembersRequestMembersInnerCohorttype from a dict
core_cohort_add_cohort_members_request_members_inner_cohorttype_from_dict = CoreCohortAddCohortMembersRequestMembersInnerCohorttype.from_dict(core_cohort_add_cohort_members_request_members_inner_cohorttype_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


