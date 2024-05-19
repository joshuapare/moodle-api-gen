# ModResourceGetResourcesByCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resources** | [**List[ModResourceGetResourcesByCourses200ResponseResourcesInner]**](ModResourceGetResourcesByCourses200ResponseResourcesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_resource_get_resources_by_courses200_response import ModResourceGetResourcesByCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModResourceGetResourcesByCourses200Response from a JSON string
mod_resource_get_resources_by_courses200_response_instance = ModResourceGetResourcesByCourses200Response.from_json(json)
# print the JSON string representation of the object
print(ModResourceGetResourcesByCourses200Response.to_json())

# convert the object into a dict
mod_resource_get_resources_by_courses200_response_dict = mod_resource_get_resources_by_courses200_response_instance.to_dict()
# create an instance of ModResourceGetResourcesByCourses200Response from a dict
mod_resource_get_resources_by_courses200_response_from_dict = ModResourceGetResourcesByCourses200Response.from_dict(mod_resource_get_resources_by_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


