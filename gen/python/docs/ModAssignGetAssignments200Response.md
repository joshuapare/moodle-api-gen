# ModAssignGetAssignments200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courses** | [**List[ModAssignGetAssignments200ResponseCoursesInner]**](ModAssignGetAssignments200ResponseCoursesInner.md) |  | 
**warnings** | [**List[ModAssignGetAssignments200ResponseWarningsInner]**](ModAssignGetAssignments200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_assign_get_assignments200_response import ModAssignGetAssignments200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetAssignments200Response from a JSON string
mod_assign_get_assignments200_response_instance = ModAssignGetAssignments200Response.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetAssignments200Response.to_json())

# convert the object into a dict
mod_assign_get_assignments200_response_dict = mod_assign_get_assignments200_response_instance.to_dict()
# create an instance of ModAssignGetAssignments200Response from a dict
mod_assign_get_assignments200_response_from_dict = ModAssignGetAssignments200Response.from_dict(mod_assign_get_assignments200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


