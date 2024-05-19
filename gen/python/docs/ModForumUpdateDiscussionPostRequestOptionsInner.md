# ModForumUpdateDiscussionPostRequestOptionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The allowed keys (value format) are:                                 pinned (bool); (only for discussions) whether to pin this discussion or not                                 discussionsubscribe (bool); whether to subscribe to the post or not                                 inlineattachmentsid (int); the draft file area id for inline attachments in the text                                 attachmentsid (int); the draft file area id for attachments | [optional] [default to 'null']
**value** | **str** | The value of the option. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_forum_update_discussion_post_request_options_inner import ModForumUpdateDiscussionPostRequestOptionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumUpdateDiscussionPostRequestOptionsInner from a JSON string
mod_forum_update_discussion_post_request_options_inner_instance = ModForumUpdateDiscussionPostRequestOptionsInner.from_json(json)
# print the JSON string representation of the object
print(ModForumUpdateDiscussionPostRequestOptionsInner.to_json())

# convert the object into a dict
mod_forum_update_discussion_post_request_options_inner_dict = mod_forum_update_discussion_post_request_options_inner_instance.to_dict()
# create an instance of ModForumUpdateDiscussionPostRequestOptionsInner from a dict
mod_forum_update_discussion_post_request_options_inner_from_dict = ModForumUpdateDiscussionPostRequestOptionsInner.from_dict(mod_forum_update_discussion_post_request_options_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


