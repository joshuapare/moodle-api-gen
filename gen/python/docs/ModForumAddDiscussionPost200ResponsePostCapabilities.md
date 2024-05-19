# ModForumAddDiscussionPost200ResponsePostCapabilities


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canreplyprivately** | **bool** | Whether the user can post a private reply | [default to False]
**controlreadstatus** | **bool** | Whether the user can control the read status of the post | [default to False]
**delete** | **bool** | Whether the user can delete the post | [default to False]
**edit** | **bool** | Whether the user can edit the post | [default to False]
**export** | **bool** | Whether the user can export the post | [default to False]
**reply** | **bool** | Whether the user can reply to the post | [default to False]
**selfenrol** | **bool** | Whether the user can self enrol into the course | [default to False]
**split** | **bool** | Whether the user can split the post | [default to False]
**view** | **bool** | Whether the user can view the post | [default to False]

## Example

```python
from openapi_client.models.mod_forum_add_discussion_post200_response_post_capabilities import ModForumAddDiscussionPost200ResponsePostCapabilities

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumAddDiscussionPost200ResponsePostCapabilities from a JSON string
mod_forum_add_discussion_post200_response_post_capabilities_instance = ModForumAddDiscussionPost200ResponsePostCapabilities.from_json(json)
# print the JSON string representation of the object
print(ModForumAddDiscussionPost200ResponsePostCapabilities.to_json())

# convert the object into a dict
mod_forum_add_discussion_post200_response_post_capabilities_dict = mod_forum_add_discussion_post200_response_post_capabilities_instance.to_dict()
# create an instance of ModForumAddDiscussionPost200ResponsePostCapabilities from a dict
mod_forum_add_discussion_post200_response_post_capabilities_from_dict = ModForumAddDiscussionPost200ResponsePostCapabilities.from_dict(mod_forum_add_discussion_post200_response_post_capabilities_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


