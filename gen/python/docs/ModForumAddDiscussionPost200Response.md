# ModForumAddDiscussionPost200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**List[ModForumAddDiscussionPost200ResponseMessagesInner]**](ModForumAddDiscussionPost200ResponseMessagesInner.md) |  | [optional] 
**post** | [**ModForumAddDiscussionPost200ResponsePost**](ModForumAddDiscussionPost200ResponsePost.md) |  | 
**postid** | **int** | new post id | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_forum_add_discussion_post200_response import ModForumAddDiscussionPost200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumAddDiscussionPost200Response from a JSON string
mod_forum_add_discussion_post200_response_instance = ModForumAddDiscussionPost200Response.from_json(json)
# print the JSON string representation of the object
print(ModForumAddDiscussionPost200Response.to_json())

# convert the object into a dict
mod_forum_add_discussion_post200_response_dict = mod_forum_add_discussion_post200_response_instance.to_dict()
# create an instance of ModForumAddDiscussionPost200Response from a dict
mod_forum_add_discussion_post200_response_from_dict = ModForumAddDiscussionPost200Response.from_dict(mod_forum_add_discussion_post200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


