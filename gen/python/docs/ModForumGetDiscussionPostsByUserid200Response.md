# ModForumGetDiscussionPostsByUserid200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discussions** | [**List[ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner]**](ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_forum_get_discussion_posts_by_userid200_response import ModForumGetDiscussionPostsByUserid200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPostsByUserid200Response from a JSON string
mod_forum_get_discussion_posts_by_userid200_response_instance = ModForumGetDiscussionPostsByUserid200Response.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPostsByUserid200Response.to_json())

# convert the object into a dict
mod_forum_get_discussion_posts_by_userid200_response_dict = mod_forum_get_discussion_posts_by_userid200_response_instance.to_dict()
# create an instance of ModForumGetDiscussionPostsByUserid200Response from a dict
mod_forum_get_discussion_posts_by_userid200_response_from_dict = ModForumGetDiscussionPostsByUserid200Response.from_dict(mod_forum_get_discussion_posts_by_userid200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


