# ModWorkshopGetUserPlan200ResponseUserplanExamplesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assessmentid** | **int** | Example submission assessment id. | [optional] [default to null]
**grade** | **float** | The submission grade. | [optional] [default to null]
**gradinggrade** | **float** | The assessment grade. | [optional] [default to null]
**id** | **int** | Example submission id. | [optional] [default to null]
**title** | **str** | Example submission title. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_workshop_get_user_plan200_response_userplan_examples_inner import ModWorkshopGetUserPlan200ResponseUserplanExamplesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetUserPlan200ResponseUserplanExamplesInner from a JSON string
mod_workshop_get_user_plan200_response_userplan_examples_inner_instance = ModWorkshopGetUserPlan200ResponseUserplanExamplesInner.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetUserPlan200ResponseUserplanExamplesInner.to_json())

# convert the object into a dict
mod_workshop_get_user_plan200_response_userplan_examples_inner_dict = mod_workshop_get_user_plan200_response_userplan_examples_inner_instance.to_dict()
# create an instance of ModWorkshopGetUserPlan200ResponseUserplanExamplesInner from a dict
mod_workshop_get_user_plan200_response_userplan_examples_inner_from_dict = ModWorkshopGetUserPlan200ResponseUserplanExamplesInner.from_dict(mod_workshop_get_user_plan200_response_userplan_examples_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


