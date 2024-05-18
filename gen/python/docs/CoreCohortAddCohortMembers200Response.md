# CoreCohortAddCohortMembers200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_cohort_add_cohort_members200_response import CoreCohortAddCohortMembers200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCohortAddCohortMembers200Response from a JSON string
core_cohort_add_cohort_members200_response_instance = CoreCohortAddCohortMembers200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCohortAddCohortMembers200Response.to_json())

# convert the object into a dict
core_cohort_add_cohort_members200_response_dict = core_cohort_add_cohort_members200_response_instance.to_dict()
# create an instance of CoreCohortAddCohortMembers200Response from a dict
core_cohort_add_cohort_members200_response_from_dict = CoreCohortAddCohortMembers200Response.from_dict(core_cohort_add_cohort_members200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


