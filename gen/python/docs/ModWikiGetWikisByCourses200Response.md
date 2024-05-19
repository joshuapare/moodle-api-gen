# ModWikiGetWikisByCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 
**wikis** | [**List[ModWikiGetWikisByCourses200ResponseWikisInner]**](ModWikiGetWikisByCourses200ResponseWikisInner.md) |  | 

## Example

```python
from openapi_client.models.mod_wiki_get_wikis_by_courses200_response import ModWikiGetWikisByCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiGetWikisByCourses200Response from a JSON string
mod_wiki_get_wikis_by_courses200_response_instance = ModWikiGetWikisByCourses200Response.from_json(json)
# print the JSON string representation of the object
print(ModWikiGetWikisByCourses200Response.to_json())

# convert the object into a dict
mod_wiki_get_wikis_by_courses200_response_dict = mod_wiki_get_wikis_by_courses200_response_instance.to_dict()
# create an instance of ModWikiGetWikisByCourses200Response from a dict
mod_wiki_get_wikis_by_courses200_response_from_dict = ModWikiGetWikisByCourses200Response.from_dict(mod_wiki_get_wikis_by_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


