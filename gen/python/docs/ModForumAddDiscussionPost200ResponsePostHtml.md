# ModForumAddDiscussionPost200ResponsePostHtml


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorsubheading** | **str** | The HTML source to view the author details | [optional] [default to 'null']
**rating** | **str** | The HTML source to rate the post | [optional] [default to 'null']
**taglist** | **str** | The HTML source to view the list of tags | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_forum_add_discussion_post200_response_post_html import ModForumAddDiscussionPost200ResponsePostHtml

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumAddDiscussionPost200ResponsePostHtml from a JSON string
mod_forum_add_discussion_post200_response_post_html_instance = ModForumAddDiscussionPost200ResponsePostHtml.from_json(json)
# print the JSON string representation of the object
print(ModForumAddDiscussionPost200ResponsePostHtml.to_json())

# convert the object into a dict
mod_forum_add_discussion_post200_response_post_html_dict = mod_forum_add_discussion_post200_response_post_html_instance.to_dict()
# create an instance of ModForumAddDiscussionPost200ResponsePostHtml from a dict
mod_forum_add_discussion_post200_response_post_html_from_dict = ModForumAddDiscussionPost200ResponsePostHtml.from_dict(mod_forum_add_discussion_post200_response_post_html_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


