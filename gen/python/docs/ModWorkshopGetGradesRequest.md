# ModWorkshopGetGradesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userid** | **int** | User id (empty or 0 for current user). | [optional] [default to 0]
**workshopid** | **int** | Workshop instance id. | [default to null]

## Example

```python
from openapi_client.models.mod_workshop_get_grades_request import ModWorkshopGetGradesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetGradesRequest from a JSON string
mod_workshop_get_grades_request_instance = ModWorkshopGetGradesRequest.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetGradesRequest.to_json())

# convert the object into a dict
mod_workshop_get_grades_request_dict = mod_workshop_get_grades_request_instance.to_dict()
# create an instance of ModWorkshopGetGradesRequest from a dict
mod_workshop_get_grades_request_from_dict = ModWorkshopGetGradesRequest.from_dict(mod_workshop_get_grades_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


