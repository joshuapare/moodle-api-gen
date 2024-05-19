# ModPageGetPagesByCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pages** | [**List[ModPageGetPagesByCourses200ResponsePagesInner]**](ModPageGetPagesByCourses200ResponsePagesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_page_get_pages_by_courses200_response import ModPageGetPagesByCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModPageGetPagesByCourses200Response from a JSON string
mod_page_get_pages_by_courses200_response_instance = ModPageGetPagesByCourses200Response.from_json(json)
# print the JSON string representation of the object
print(ModPageGetPagesByCourses200Response.to_json())

# convert the object into a dict
mod_page_get_pages_by_courses200_response_dict = mod_page_get_pages_by_courses200_response_instance.to_dict()
# create an instance of ModPageGetPagesByCourses200Response from a dict
mod_page_get_pages_by_courses200_response_from_dict = ModPageGetPagesByCourses200Response.from_dict(mod_page_get_pages_by_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


