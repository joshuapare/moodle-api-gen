# ModGlossaryGetEntryById200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entry** | [**ModGlossaryGetEntryById200ResponseEntry**](ModGlossaryGetEntryById200ResponseEntry.md) |  | 
**permissions** | [**ModGlossaryGetEntryById200ResponsePermissions**](ModGlossaryGetEntryById200ResponsePermissions.md) |  | [optional] 
**ratinginfo** | [**ModForumGetDiscussionPosts200ResponseRatinginfo**](ModForumGetDiscussionPosts200ResponseRatinginfo.md) |  | [optional] 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_glossary_get_entry_by_id200_response import ModGlossaryGetEntryById200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetEntryById200Response from a JSON string
mod_glossary_get_entry_by_id200_response_instance = ModGlossaryGetEntryById200Response.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetEntryById200Response.to_json())

# convert the object into a dict
mod_glossary_get_entry_by_id200_response_dict = mod_glossary_get_entry_by_id200_response_instance.to_dict()
# create an instance of ModGlossaryGetEntryById200Response from a dict
mod_glossary_get_entry_by_id200_response_from_dict = ModGlossaryGetEntryById200Response.from_dict(mod_glossary_get_entry_by_id200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


