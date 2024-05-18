# ModGlossaryGetEntriesByAuthorId200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** | The total number of records matching the request. | 
**entries** | [**List[ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner]**](ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner.md) |  | 
**ratinginfo** | [**ModForumGetDiscussionPosts200ResponseRatinginfo**](ModForumGetDiscussionPosts200ResponseRatinginfo.md) |  | [optional] 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_glossary_get_entries_by_author_id200_response import ModGlossaryGetEntriesByAuthorId200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetEntriesByAuthorId200Response from a JSON string
mod_glossary_get_entries_by_author_id200_response_instance = ModGlossaryGetEntriesByAuthorId200Response.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetEntriesByAuthorId200Response.to_json())

# convert the object into a dict
mod_glossary_get_entries_by_author_id200_response_dict = mod_glossary_get_entries_by_author_id200_response_instance.to_dict()
# create an instance of ModGlossaryGetEntriesByAuthorId200Response from a dict
mod_glossary_get_entries_by_author_id200_response_from_dict = ModGlossaryGetEntriesByAuthorId200Response.from_dict(mod_glossary_get_entries_by_author_id200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


