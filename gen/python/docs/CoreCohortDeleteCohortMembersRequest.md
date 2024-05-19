# CoreCohortDeleteCohortMembersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**members** | [**List[CoreCohortDeleteCohortMembersRequestMembersInner]**](CoreCohortDeleteCohortMembersRequestMembersInner.md) |  | 

## Example

```python
from openapi_client.models.core_cohort_delete_cohort_members_request import CoreCohortDeleteCohortMembersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCohortDeleteCohortMembersRequest from a JSON string
core_cohort_delete_cohort_members_request_instance = CoreCohortDeleteCohortMembersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCohortDeleteCohortMembersRequest.to_json())

# convert the object into a dict
core_cohort_delete_cohort_members_request_dict = core_cohort_delete_cohort_members_request_instance.to_dict()
# create an instance of CoreCohortDeleteCohortMembersRequest from a dict
core_cohort_delete_cohort_members_request_from_dict = CoreCohortDeleteCohortMembersRequest.from_dict(core_cohort_delete_cohort_members_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


