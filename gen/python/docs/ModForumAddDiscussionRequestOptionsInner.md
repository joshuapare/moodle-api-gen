# ModForumAddDiscussionRequestOptionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The allowed keys (value format) are:                                         discussionsubscribe (bool); subscribe to the discussion?, default to true                                         discussionpinned    (bool); is the discussion pinned, default to false                                         inlineattachmentsid              (int); the draft file area id for inline attachments                                         attachmentsid       (int); the draft file area id for attachments                              | [optional] [default to 'null']
**value** | **str** | The value of the option,                                                             This param is validated in the external function. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_forum_add_discussion_request_options_inner import ModForumAddDiscussionRequestOptionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumAddDiscussionRequestOptionsInner from a JSON string
mod_forum_add_discussion_request_options_inner_instance = ModForumAddDiscussionRequestOptionsInner.from_json(json)
# print the JSON string representation of the object
print(ModForumAddDiscussionRequestOptionsInner.to_json())

# convert the object into a dict
mod_forum_add_discussion_request_options_inner_dict = mod_forum_add_discussion_request_options_inner_instance.to_dict()
# create an instance of ModForumAddDiscussionRequestOptionsInner from a dict
mod_forum_add_discussion_request_options_inner_from_dict = ModForumAddDiscussionRequestOptionsInner.from_dict(mod_forum_add_discussion_request_options_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


