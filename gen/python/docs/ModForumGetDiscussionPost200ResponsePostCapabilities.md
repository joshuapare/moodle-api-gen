# ModForumGetDiscussionPost200ResponsePostCapabilities


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canreplyprivately** | **bool** | Whether the user can post a private reply | 
**controlreadstatus** | **bool** | Whether the user can control the read status of the post | 
**delete** | **bool** | Whether the user can delete the post | 
**edit** | **bool** | Whether the user can edit the post | 
**export** | **bool** | Whether the user can export the post | 
**reply** | **bool** | Whether the user can reply to the post | 
**selfenrol** | **bool** | Whether the user can self enrol into the course | 
**split** | **bool** | Whether the user can split the post | 
**view** | **bool** | Whether the user can view the post | 

## Example

```python
from openapi_client.models.mod_forum_get_discussion_post200_response_post_capabilities import ModForumGetDiscussionPost200ResponsePostCapabilities

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPost200ResponsePostCapabilities from a JSON string
mod_forum_get_discussion_post200_response_post_capabilities_instance = ModForumGetDiscussionPost200ResponsePostCapabilities.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPost200ResponsePostCapabilities.to_json())

# convert the object into a dict
mod_forum_get_discussion_post200_response_post_capabilities_dict = mod_forum_get_discussion_post200_response_post_capabilities_instance.to_dict()
# create an instance of ModForumGetDiscussionPost200ResponsePostCapabilities from a dict
mod_forum_get_discussion_post200_response_post_capabilities_from_dict = ModForumGetDiscussionPost200ResponsePostCapabilities.from_dict(mod_forum_get_discussion_post200_response_post_capabilities_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


