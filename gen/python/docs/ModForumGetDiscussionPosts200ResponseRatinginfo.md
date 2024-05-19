# ModForumGetDiscussionPosts200ResponseRatinginfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canviewall** | **bool** | Whether the user can view all the individual ratings. | [optional] 
**canviewany** | **bool** | Whether the user can view aggregate of ratings of others. | [optional] 
**component** | **str** | Context name. | 
**contextid** | **int** | Context id. | 
**ratingarea** | **str** | Rating area name. | 
**ratings** | [**List[ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner]**](ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner.md) |  | [optional] 
**scales** | [**List[ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner]**](ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_forum_get_discussion_posts200_response_ratinginfo import ModForumGetDiscussionPosts200ResponseRatinginfo

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPosts200ResponseRatinginfo from a JSON string
mod_forum_get_discussion_posts200_response_ratinginfo_instance = ModForumGetDiscussionPosts200ResponseRatinginfo.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPosts200ResponseRatinginfo.to_json())

# convert the object into a dict
mod_forum_get_discussion_posts200_response_ratinginfo_dict = mod_forum_get_discussion_posts200_response_ratinginfo_instance.to_dict()
# create an instance of ModForumGetDiscussionPosts200ResponseRatinginfo from a dict
mod_forum_get_discussion_posts200_response_ratinginfo_from_dict = ModForumGetDiscussionPosts200ResponseRatinginfo.from_dict(mod_forum_get_discussion_posts200_response_ratinginfo_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


