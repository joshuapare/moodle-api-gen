# CoreCompetencyListUserPlansRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userid** | **int** | The user ID | [default to null]

## Example

```python
from openapi_client.models.core_competency_list_user_plans_request import CoreCompetencyListUserPlansRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyListUserPlansRequest from a JSON string
core_competency_list_user_plans_request_instance = CoreCompetencyListUserPlansRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyListUserPlansRequest.to_json())

# convert the object into a dict
core_competency_list_user_plans_request_dict = core_competency_list_user_plans_request_instance.to_dict()
# create an instance of CoreCompetencyListUserPlansRequest from a dict
core_competency_list_user_plans_request_from_dict = CoreCompetencyListUserPlansRequest.from_dict(core_competency_list_user_plans_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


