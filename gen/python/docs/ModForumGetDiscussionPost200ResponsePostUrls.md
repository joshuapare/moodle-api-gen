# ModForumGetDiscussionPost200ResponsePostUrls


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delete** | **str** | The URL used to delete the post | [optional] 
**discuss** | **str** | discuss | [optional] 
**edit** | **str** | The URL used to edit the post | [optional] 
**export** | **str** | The URL used to export the post | [optional] 
**markasread** | **str** | The URL used to mark the post as read | [optional] 
**markasunread** | **str** | The URL used to mark the post as unread | [optional] 
**reply** | **str** | The URL used to reply to the post | [optional] 
**split** | **str** | The URL used to split the discussion with the selected post being the first post in the new discussion | [optional] 
**view** | **str** | The URL used to view the post | [optional] 
**viewisolated** | **str** | The URL used to view the post in isolation | [optional] 
**viewparent** | **str** | The URL used to view the parent of the post | [optional] 

## Example

```python
from openapi_client.models.mod_forum_get_discussion_post200_response_post_urls import ModForumGetDiscussionPost200ResponsePostUrls

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPost200ResponsePostUrls from a JSON string
mod_forum_get_discussion_post200_response_post_urls_instance = ModForumGetDiscussionPost200ResponsePostUrls.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPost200ResponsePostUrls.to_json())

# convert the object into a dict
mod_forum_get_discussion_post200_response_post_urls_dict = mod_forum_get_discussion_post200_response_post_urls_instance.to_dict()
# create an instance of ModForumGetDiscussionPost200ResponsePostUrls from a dict
mod_forum_get_discussion_post200_response_post_urls_from_dict = ModForumGetDiscussionPost200ResponsePostUrls.from_dict(mod_forum_get_discussion_post200_response_post_urls_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


