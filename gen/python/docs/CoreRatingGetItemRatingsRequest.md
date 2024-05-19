# CoreRatingGetItemRatingsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | component | 
**contextlevel** | **str** | context level: course, module, user, etc... | 
**instanceid** | **int** | the instance id of item associated with the context level | 
**itemid** | **int** | associated id | 
**ratingarea** | **str** | rating area | 
**scaleid** | **int** | scale id | 
**sort** | **str** | sort order (firstname, rating or timemodified) | [default to 'null']

## Example

```python
from openapi_client.models.core_rating_get_item_ratings_request import CoreRatingGetItemRatingsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreRatingGetItemRatingsRequest from a JSON string
core_rating_get_item_ratings_request_instance = CoreRatingGetItemRatingsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreRatingGetItemRatingsRequest.to_json())

# convert the object into a dict
core_rating_get_item_ratings_request_dict = core_rating_get_item_ratings_request_instance.to_dict()
# create an instance of CoreRatingGetItemRatingsRequest from a dict
core_rating_get_item_ratings_request_from_dict = CoreRatingGetItemRatingsRequest.from_dict(core_rating_get_item_ratings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


