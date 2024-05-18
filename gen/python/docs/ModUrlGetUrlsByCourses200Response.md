# ModUrlGetUrlsByCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**urls** | [**List[ModUrlGetUrlsByCourses200ResponseUrlsInner]**](ModUrlGetUrlsByCourses200ResponseUrlsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_url_get_urls_by_courses200_response import ModUrlGetUrlsByCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModUrlGetUrlsByCourses200Response from a JSON string
mod_url_get_urls_by_courses200_response_instance = ModUrlGetUrlsByCourses200Response.from_json(json)
# print the JSON string representation of the object
print(ModUrlGetUrlsByCourses200Response.to_json())

# convert the object into a dict
mod_url_get_urls_by_courses200_response_dict = mod_url_get_urls_by_courses200_response_instance.to_dict()
# create an instance of ModUrlGetUrlsByCourses200Response from a dict
mod_url_get_urls_by_courses200_response_from_dict = ModUrlGetUrlsByCourses200Response.from_dict(mod_url_get_urls_by_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


