# ModForumGetDiscussionPost200ResponsePostTagsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayname** | **str** | The display name of the tag | [optional] 
**flag** | **bool** | Wehther this tag is flagged | [optional] 
**id** | **int** | The ID of the Tag | [optional] 
**isstandard** | **bool** | Whether this is a standard tag | [optional] 
**tagid** | **int** | The tagid | [optional] 
**urls** | [**ModForumGetDiscussionPost200ResponsePostTagsInnerUrls**](ModForumGetDiscussionPost200ResponsePostTagsInnerUrls.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_forum_get_discussion_post200_response_post_tags_inner import ModForumGetDiscussionPost200ResponsePostTagsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPost200ResponsePostTagsInner from a JSON string
mod_forum_get_discussion_post200_response_post_tags_inner_instance = ModForumGetDiscussionPost200ResponsePostTagsInner.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPost200ResponsePostTagsInner.to_json())

# convert the object into a dict
mod_forum_get_discussion_post200_response_post_tags_inner_dict = mod_forum_get_discussion_post200_response_post_tags_inner_instance.to_dict()
# create an instance of ModForumGetDiscussionPost200ResponsePostTagsInner from a dict
mod_forum_get_discussion_post200_response_post_tags_inner_from_dict = ModForumGetDiscussionPost200ResponsePostTagsInner.from_dict(mod_forum_get_discussion_post200_response_post_tags_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


