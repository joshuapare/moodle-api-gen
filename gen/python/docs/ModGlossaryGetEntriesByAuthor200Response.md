# ModGlossaryGetEntriesByAuthor200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** | The total number of records matching the request. | [default to null]
**entries** | [**List[ModGlossaryGetEntriesByAuthor200ResponseEntriesInner]**](ModGlossaryGetEntriesByAuthor200ResponseEntriesInner.md) |  | 
**ratinginfo** | [**ModForumGetDiscussionPosts200ResponseRatinginfo**](ModForumGetDiscussionPosts200ResponseRatinginfo.md) |  | [optional] 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_glossary_get_entries_by_author200_response import ModGlossaryGetEntriesByAuthor200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetEntriesByAuthor200Response from a JSON string
mod_glossary_get_entries_by_author200_response_instance = ModGlossaryGetEntriesByAuthor200Response.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetEntriesByAuthor200Response.to_json())

# convert the object into a dict
mod_glossary_get_entries_by_author200_response_dict = mod_glossary_get_entries_by_author200_response_instance.to_dict()
# create an instance of ModGlossaryGetEntriesByAuthor200Response from a dict
mod_glossary_get_entries_by_author200_response_from_dict = ModGlossaryGetEntriesByAuthor200Response.from_dict(mod_glossary_get_entries_by_author200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


