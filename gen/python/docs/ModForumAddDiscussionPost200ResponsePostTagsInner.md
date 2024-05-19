# ModForumAddDiscussionPost200ResponsePostTagsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayname** | **str** | The display name of the tag | [optional] [default to 'null']
**flag** | **bool** | Wehther this tag is flagged | [optional] [default to False]
**id** | **int** | The ID of the Tag | [optional] [default to null]
**isstandard** | **bool** | Whether this is a standard tag | [optional] [default to False]
**tagid** | **int** | The tagid | [optional] [default to null]
**urls** | [**ModForumAddDiscussionPost200ResponsePostTagsInnerUrls**](ModForumAddDiscussionPost200ResponsePostTagsInnerUrls.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_forum_add_discussion_post200_response_post_tags_inner import ModForumAddDiscussionPost200ResponsePostTagsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumAddDiscussionPost200ResponsePostTagsInner from a JSON string
mod_forum_add_discussion_post200_response_post_tags_inner_instance = ModForumAddDiscussionPost200ResponsePostTagsInner.from_json(json)
# print the JSON string representation of the object
print(ModForumAddDiscussionPost200ResponsePostTagsInner.to_json())

# convert the object into a dict
mod_forum_add_discussion_post200_response_post_tags_inner_dict = mod_forum_add_discussion_post200_response_post_tags_inner_instance.to_dict()
# create an instance of ModForumAddDiscussionPost200ResponsePostTagsInner from a dict
mod_forum_add_discussion_post200_response_post_tags_inner_from_dict = ModForumAddDiscussionPost200ResponsePostTagsInner.from_dict(mod_forum_add_discussion_post200_response_post_tags_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


