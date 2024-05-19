# ModForumAddDiscussionPost200ResponsePostAuthor


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fullname** | **str** | fullname | [optional] 
**groups** | [**List[ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner]**](ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner.md) |  | [optional] 
**id** | **int** | id | [optional] 
**isdeleted** | **bool** | isdeleted | [optional] [default to False]
**urls** | [**ModForumAddDiscussionPost200ResponsePostAuthorUrls**](ModForumAddDiscussionPost200ResponsePostAuthorUrls.md) |  | 

## Example

```python
from openapi_client.models.mod_forum_add_discussion_post200_response_post_author import ModForumAddDiscussionPost200ResponsePostAuthor

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumAddDiscussionPost200ResponsePostAuthor from a JSON string
mod_forum_add_discussion_post200_response_post_author_instance = ModForumAddDiscussionPost200ResponsePostAuthor.from_json(json)
# print the JSON string representation of the object
print(ModForumAddDiscussionPost200ResponsePostAuthor.to_json())

# convert the object into a dict
mod_forum_add_discussion_post200_response_post_author_dict = mod_forum_add_discussion_post200_response_post_author_instance.to_dict()
# create an instance of ModForumAddDiscussionPost200ResponsePostAuthor from a dict
mod_forum_add_discussion_post200_response_post_author_from_dict = ModForumAddDiscussionPost200ResponsePostAuthor.from_dict(mod_forum_add_discussion_post200_response_post_author_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


