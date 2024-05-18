# CoreCohortAddCohortMembersRequestMembersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cohorttype** | [**CoreCohortAddCohortMembersRequestMembersInnerCohorttype**](CoreCohortAddCohortMembersRequestMembersInnerCohorttype.md) |  | [optional] 
**usertype** | [**CoreCohortAddCohortMembersRequestMembersInnerUsertype**](CoreCohortAddCohortMembersRequestMembersInnerUsertype.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_cohort_add_cohort_members_request_members_inner import CoreCohortAddCohortMembersRequestMembersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCohortAddCohortMembersRequestMembersInner from a JSON string
core_cohort_add_cohort_members_request_members_inner_instance = CoreCohortAddCohortMembersRequestMembersInner.from_json(json)
# print the JSON string representation of the object
print(CoreCohortAddCohortMembersRequestMembersInner.to_json())

# convert the object into a dict
core_cohort_add_cohort_members_request_members_inner_dict = core_cohort_add_cohort_members_request_members_inner_instance.to_dict()
# create an instance of CoreCohortAddCohortMembersRequestMembersInner from a dict
core_cohort_add_cohort_members_request_members_inner_from_dict = CoreCohortAddCohortMembersRequestMembersInner.from_dict(core_cohort_add_cohort_members_request_members_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


