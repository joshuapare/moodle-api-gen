# CoreCohortDeleteCohortMembersRequestMembersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cohortid** | **int** | cohort record id | [optional] [default to null]
**userid** | **int** | user id | [optional] 

## Example

```python
from openapi_client.models.core_cohort_delete_cohort_members_request_members_inner import CoreCohortDeleteCohortMembersRequestMembersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCohortDeleteCohortMembersRequestMembersInner from a JSON string
core_cohort_delete_cohort_members_request_members_inner_instance = CoreCohortDeleteCohortMembersRequestMembersInner.from_json(json)
# print the JSON string representation of the object
print(CoreCohortDeleteCohortMembersRequestMembersInner.to_json())

# convert the object into a dict
core_cohort_delete_cohort_members_request_members_inner_dict = core_cohort_delete_cohort_members_request_members_inner_instance.to_dict()
# create an instance of CoreCohortDeleteCohortMembersRequestMembersInner from a dict
core_cohort_delete_cohort_members_request_members_inner_from_dict = CoreCohortDeleteCohortMembersRequestMembersInner.from_dict(core_cohort_delete_cohort_members_request_members_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


