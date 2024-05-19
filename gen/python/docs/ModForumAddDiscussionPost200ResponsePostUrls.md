# ModForumAddDiscussionPost200ResponsePostUrls


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delete** | **str** | The URL used to delete the post | [optional] [default to 'null']
**discuss** | **str** | discuss | [optional] [default to 'null']
**edit** | **str** | The URL used to edit the post | [optional] [default to 'null']
**export** | **str** | The URL used to export the post | [optional] [default to 'null']
**markasread** | **str** | The URL used to mark the post as read | [optional] [default to 'null']
**markasunread** | **str** | The URL used to mark the post as unread | [optional] [default to 'null']
**reply** | **str** | The URL used to reply to the post | [optional] [default to 'null']
**split** | **str** | The URL used to split the discussion with the selected post being the first post in the new discussion | [optional] [default to 'null']
**view** | **str** | The URL used to view the post | [optional] [default to 'null']
**viewisolated** | **str** | The URL used to view the post in isolation | [optional] [default to 'null']
**viewparent** | **str** | The URL used to view the parent of the post | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_forum_add_discussion_post200_response_post_urls import ModForumAddDiscussionPost200ResponsePostUrls

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumAddDiscussionPost200ResponsePostUrls from a JSON string
mod_forum_add_discussion_post200_response_post_urls_instance = ModForumAddDiscussionPost200ResponsePostUrls.from_json(json)
# print the JSON string representation of the object
print(ModForumAddDiscussionPost200ResponsePostUrls.to_json())

# convert the object into a dict
mod_forum_add_discussion_post200_response_post_urls_dict = mod_forum_add_discussion_post200_response_post_urls_instance.to_dict()
# create an instance of ModForumAddDiscussionPost200ResponsePostUrls from a dict
mod_forum_add_discussion_post200_response_post_urls_from_dict = ModForumAddDiscussionPost200ResponsePostUrls.from_dict(mod_forum_add_discussion_post200_response_post_urls_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


