# ModForumAddDiscussionPost200ResponseMessagesInner

Messages

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | untranslated english message to explain the warning | [optional] 
**type** | **str** | The classification to be used in the client side | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_forum_add_discussion_post200_response_messages_inner import ModForumAddDiscussionPost200ResponseMessagesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumAddDiscussionPost200ResponseMessagesInner from a JSON string
mod_forum_add_discussion_post200_response_messages_inner_instance = ModForumAddDiscussionPost200ResponseMessagesInner.from_json(json)
# print the JSON string representation of the object
print(ModForumAddDiscussionPost200ResponseMessagesInner.to_json())

# convert the object into a dict
mod_forum_add_discussion_post200_response_messages_inner_dict = mod_forum_add_discussion_post200_response_messages_inner_instance.to_dict()
# create an instance of ModForumAddDiscussionPost200ResponseMessagesInner from a dict
mod_forum_add_discussion_post200_response_messages_inner_from_dict = ModForumAddDiscussionPost200ResponseMessagesInner.from_dict(mod_forum_add_discussion_post200_response_messages_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


