# ModForumGetDiscussionPost200ResponsePostAttachmentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | **str** | author | [optional] 
**component** | **str** | component | [optional] 
**contextid** | **int** | contextid | [optional] 
**filearea** | **str** | filearea | [optional] 
**filename** | **str** | filename | [optional] 
**filenameshort** | **str** | filenameshort | [optional] 
**filepath** | **str** | filepath | [optional] 
**filesize** | **int** | filesize | [optional] 
**filesizeformatted** | **str** | filesizeformatted | [optional] 
**html** | [**ModForumGetDiscussionPost200ResponsePostAttachmentsInnerHtml**](ModForumGetDiscussionPost200ResponsePostAttachmentsInnerHtml.md) |  | [optional] 
**icon** | **str** | icon | [optional] 
**isdir** | **bool** | isdir | [optional] 
**isimage** | **bool** | isimage | [optional] 
**itemid** | **int** | itemid | [optional] 
**license** | **str** | license | [optional] 
**timecreated** | **int** | timecreated | [optional] 
**timecreatedformatted** | **str** | timecreatedformatted | [optional] 
**timemodified** | **int** | timemodified | [optional] 
**timemodifiedformatted** | **str** | timemodifiedformatted | [optional] 
**url** | **str** | url | [optional] 
**urls** | [**ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls**](ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_forum_get_discussion_post200_response_post_attachments_inner import ModForumGetDiscussionPost200ResponsePostAttachmentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPost200ResponsePostAttachmentsInner from a JSON string
mod_forum_get_discussion_post200_response_post_attachments_inner_instance = ModForumGetDiscussionPost200ResponsePostAttachmentsInner.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPost200ResponsePostAttachmentsInner.to_json())

# convert the object into a dict
mod_forum_get_discussion_post200_response_post_attachments_inner_dict = mod_forum_get_discussion_post200_response_post_attachments_inner_instance.to_dict()
# create an instance of ModForumGetDiscussionPost200ResponsePostAttachmentsInner from a dict
mod_forum_get_discussion_post200_response_post_attachments_inner_from_dict = ModForumGetDiscussionPost200ResponsePostAttachmentsInner.from_dict(mod_forum_get_discussion_post200_response_post_attachments_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


