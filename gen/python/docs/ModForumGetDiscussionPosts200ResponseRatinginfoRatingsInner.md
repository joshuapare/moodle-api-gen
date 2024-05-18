# ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregate** | **float** | Aggregated ratings grade. | [optional] 
**aggregatelabel** | **str** | The aggregation label. | [optional] 
**aggregatestr** | **str** | Aggregated ratings as string. | [optional] 
**canrate** | **bool** | Whether the user can rate the item. | [optional] 
**canviewaggregate** | **bool** | Whether the user can view the aggregated grade. | [optional] 
**count** | **int** | Ratings count (used when aggregating). | [optional] 
**itemid** | **int** | Item id. | [optional] 
**rating** | **int** | The rating the user gave. | [optional] 
**scaleid** | **int** | Scale id. | [optional] 
**userid** | **int** | User who rated id. | [optional] 

## Example

```python
from openapi_client.models.mod_forum_get_discussion_posts200_response_ratinginfo_ratings_inner import ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner from a JSON string
mod_forum_get_discussion_posts200_response_ratinginfo_ratings_inner_instance = ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner.to_json())

# convert the object into a dict
mod_forum_get_discussion_posts200_response_ratinginfo_ratings_inner_dict = mod_forum_get_discussion_posts200_response_ratinginfo_ratings_inner_instance.to_dict()
# create an instance of ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner from a dict
mod_forum_get_discussion_posts200_response_ratinginfo_ratings_inner_from_dict = ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner.from_dict(mod_forum_get_discussion_posts200_response_ratinginfo_ratings_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


