# ModForumAddDiscussionPostRequestOptionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The allowed keys (value format) are:                                         discussionsubscribe (bool); subscribe to the discussion?, default to true                                         private (bool); make this reply private to the author of the parent post, default to false.                                         inlineattachmentsid              (int); the draft file area id for inline attachments                                         attachmentsid       (int); the draft file area id for attachments                                         topreferredformat (bool); convert the message &amp; messageformat to FORMAT_HTML, defaults to false                              | [optional] [default to 'null']
**value** | **str** | the value of the option,                                                             this param is validated in the external function. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_forum_add_discussion_post_request_options_inner import ModForumAddDiscussionPostRequestOptionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumAddDiscussionPostRequestOptionsInner from a JSON string
mod_forum_add_discussion_post_request_options_inner_instance = ModForumAddDiscussionPostRequestOptionsInner.from_json(json)
# print the JSON string representation of the object
print(ModForumAddDiscussionPostRequestOptionsInner.to_json())

# convert the object into a dict
mod_forum_add_discussion_post_request_options_inner_dict = mod_forum_add_discussion_post_request_options_inner_instance.to_dict()
# create an instance of ModForumAddDiscussionPostRequestOptionsInner from a dict
mod_forum_add_discussion_post_request_options_inner_from_dict = ModForumAddDiscussionPostRequestOptionsInner.from_dict(mod_forum_add_discussion_post_request_options_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


