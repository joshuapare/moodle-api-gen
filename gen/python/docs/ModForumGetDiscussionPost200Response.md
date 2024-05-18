# ModForumGetDiscussionPost200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**post** | [**ModForumGetDiscussionPost200ResponsePost**](ModForumGetDiscussionPost200ResponsePost.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_forum_get_discussion_post200_response import ModForumGetDiscussionPost200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPost200Response from a JSON string
mod_forum_get_discussion_post200_response_instance = ModForumGetDiscussionPost200Response.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPost200Response.to_json())

# convert the object into a dict
mod_forum_get_discussion_post200_response_dict = mod_forum_get_discussion_post200_response_instance.to_dict()
# create an instance of ModForumGetDiscussionPost200Response from a dict
mod_forum_get_discussion_post200_response_from_dict = ModForumGetDiscussionPost200Response.from_dict(mod_forum_get_discussion_post200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


