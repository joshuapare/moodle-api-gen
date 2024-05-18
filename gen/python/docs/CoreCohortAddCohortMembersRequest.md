# CoreCohortAddCohortMembersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**members** | [**List[CoreCohortAddCohortMembersRequestMembersInner]**](CoreCohortAddCohortMembersRequestMembersInner.md) |  | 

## Example

```python
from openapi_client.models.core_cohort_add_cohort_members_request import CoreCohortAddCohortMembersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCohortAddCohortMembersRequest from a JSON string
core_cohort_add_cohort_members_request_instance = CoreCohortAddCohortMembersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCohortAddCohortMembersRequest.to_json())

# convert the object into a dict
core_cohort_add_cohort_members_request_dict = core_cohort_add_cohort_members_request_instance.to_dict()
# create an instance of CoreCohortAddCohortMembersRequest from a dict
core_cohort_add_cohort_members_request_from_dict = CoreCohortAddCohortMembersRequest.from_dict(core_cohort_add_cohort_members_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


