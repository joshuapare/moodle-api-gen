# ModForumGetDiscussionPost200ResponsePostAuthor


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fullname** | **str** | fullname | [optional] 
**groups** | [**List[ModForumGetDiscussionPost200ResponsePostAuthorGroupsInner]**](ModForumGetDiscussionPost200ResponsePostAuthorGroupsInner.md) |  | [optional] 
**id** | **int** | id | [optional] 
**isdeleted** | **bool** | isdeleted | [optional] 
**urls** | [**ModForumGetDiscussionPost200ResponsePostAuthorUrls**](ModForumGetDiscussionPost200ResponsePostAuthorUrls.md) |  | 

## Example

```python
from openapi_client.models.mod_forum_get_discussion_post200_response_post_author import ModForumGetDiscussionPost200ResponsePostAuthor

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPost200ResponsePostAuthor from a JSON string
mod_forum_get_discussion_post200_response_post_author_instance = ModForumGetDiscussionPost200ResponsePostAuthor.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPost200ResponsePostAuthor.to_json())

# convert the object into a dict
mod_forum_get_discussion_post200_response_post_author_dict = mod_forum_get_discussion_post200_response_post_author_instance.to_dict()
# create an instance of ModForumGetDiscussionPost200ResponsePostAuthor from a dict
mod_forum_get_discussion_post200_response_post_author_from_dict = ModForumGetDiscussionPost200ResponsePostAuthor.from_dict(mod_forum_get_discussion_post200_response_post_author_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


