# CoreRatingGetItemRatings200ResponseRatingsInner

Rating

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | rating id | [optional] [default to null]
**rating** | **str** | rating on scale | [optional] [default to 'null']
**timemodified** | **int** | time modified (timestamp) | [optional] [default to null]
**userfullname** | **str** | user fullname | [optional] [default to 'null']
**userid** | **int** | user id | [optional] 
**userpictureurl** | **str** | URL user picture | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_rating_get_item_ratings200_response_ratings_inner import CoreRatingGetItemRatings200ResponseRatingsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreRatingGetItemRatings200ResponseRatingsInner from a JSON string
core_rating_get_item_ratings200_response_ratings_inner_instance = CoreRatingGetItemRatings200ResponseRatingsInner.from_json(json)
# print the JSON string representation of the object
print(CoreRatingGetItemRatings200ResponseRatingsInner.to_json())

# convert the object into a dict
core_rating_get_item_ratings200_response_ratings_inner_dict = core_rating_get_item_ratings200_response_ratings_inner_instance.to_dict()
# create an instance of CoreRatingGetItemRatings200ResponseRatingsInner from a dict
core_rating_get_item_ratings200_response_ratings_inner_from_dict = CoreRatingGetItemRatings200ResponseRatingsInner.from_dict(core_rating_get_item_ratings200_response_ratings_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


