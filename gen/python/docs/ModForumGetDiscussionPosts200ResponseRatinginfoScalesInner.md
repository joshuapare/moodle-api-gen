# ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner

Scale information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course id. | [optional] 
**id** | **int** | Scale id. | [optional] 
**isnumeric** | **bool** | Whether is a numeric scale. | [optional] 
**items** | [**List[ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInner]**](ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInner.md) |  | [optional] 
**max** | **int** | Max value for the scale. | [optional] 
**name** | **str** | Scale name (when a real scale is used). | [optional] 

## Example

```python
from openapi_client.models.mod_forum_get_discussion_posts200_response_ratinginfo_scales_inner import ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner from a JSON string
mod_forum_get_discussion_posts200_response_ratinginfo_scales_inner_instance = ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner.to_json())

# convert the object into a dict
mod_forum_get_discussion_posts200_response_ratinginfo_scales_inner_dict = mod_forum_get_discussion_posts200_response_ratinginfo_scales_inner_instance.to_dict()
# create an instance of ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner from a dict
mod_forum_get_discussion_posts200_response_ratinginfo_scales_inner_from_dict = ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner.from_dict(mod_forum_get_discussion_posts200_response_ratinginfo_scales_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


