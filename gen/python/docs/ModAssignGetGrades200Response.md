# ModAssignGetGrades200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignments** | [**List[ModAssignGetGrades200ResponseAssignmentsInner]**](ModAssignGetGrades200ResponseAssignmentsInner.md) |  | 
**warnings** | [**List[ModAssignGetGrades200ResponseWarningsInner]**](ModAssignGetGrades200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_assign_get_grades200_response import ModAssignGetGrades200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetGrades200Response from a JSON string
mod_assign_get_grades200_response_instance = ModAssignGetGrades200Response.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetGrades200Response.to_json())

# convert the object into a dict
mod_assign_get_grades200_response_dict = mod_assign_get_grades200_response_instance.to_dict()
# create an instance of ModAssignGetGrades200Response from a dict
mod_assign_get_grades200_response_from_dict = ModAssignGetGrades200Response.from_dict(mod_assign_get_grades200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


