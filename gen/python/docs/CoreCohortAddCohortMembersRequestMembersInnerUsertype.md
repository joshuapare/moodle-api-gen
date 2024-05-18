# CoreCohortAddCohortMembersRequestMembersInnerUsertype


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The name of the field: id                                         (numeric value of id) or username (alphanumeric value of username)  | [default to 'null']
**value** | **str** | The value of the cohort | 

## Example

```python
from openapi_client.models.core_cohort_add_cohort_members_request_members_inner_usertype import CoreCohortAddCohortMembersRequestMembersInnerUsertype

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCohortAddCohortMembersRequestMembersInnerUsertype from a JSON string
core_cohort_add_cohort_members_request_members_inner_usertype_instance = CoreCohortAddCohortMembersRequestMembersInnerUsertype.from_json(json)
# print the JSON string representation of the object
print(CoreCohortAddCohortMembersRequestMembersInnerUsertype.to_json())

# convert the object into a dict
core_cohort_add_cohort_members_request_members_inner_usertype_dict = core_cohort_add_cohort_members_request_members_inner_usertype_instance.to_dict()
# create an instance of CoreCohortAddCohortMembersRequestMembersInnerUsertype from a dict
core_cohort_add_cohort_members_request_members_inner_usertype_from_dict = CoreCohortAddCohortMembersRequestMembersInnerUsertype.from_dict(core_cohort_add_cohort_members_request_members_inner_usertype_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


