# ModDataGetEntry200ResponseRatinginfoRatingsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregate** | **float** | Aggregated ratings grade. | [optional] [default to null]
**aggregatelabel** | **str** | The aggregation label. | [optional] [default to 'null']
**aggregatestr** | **str** | Aggregated ratings as string. | [optional] [default to 'null']
**canrate** | **bool** | Whether the user can rate the item. | [optional] [default to False]
**canviewaggregate** | **bool** | Whether the user can view the aggregated grade. | [optional] [default to False]
**count** | **int** | Ratings count (used when aggregating). | [optional] [default to null]
**itemid** | **int** | Item id. | [optional] [default to null]
**rating** | **int** | The rating the user gave. | [optional] [default to null]
**scaleid** | **int** | Scale id. | [optional] [default to null]
**userid** | **int** | User who rated id. | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_data_get_entry200_response_ratinginfo_ratings_inner import ModDataGetEntry200ResponseRatinginfoRatingsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetEntry200ResponseRatinginfoRatingsInner from a JSON string
mod_data_get_entry200_response_ratinginfo_ratings_inner_instance = ModDataGetEntry200ResponseRatinginfoRatingsInner.from_json(json)
# print the JSON string representation of the object
print(ModDataGetEntry200ResponseRatinginfoRatingsInner.to_json())

# convert the object into a dict
mod_data_get_entry200_response_ratinginfo_ratings_inner_dict = mod_data_get_entry200_response_ratinginfo_ratings_inner_instance.to_dict()
# create an instance of ModDataGetEntry200ResponseRatinginfoRatingsInner from a dict
mod_data_get_entry200_response_ratinginfo_ratings_inner_from_dict = ModDataGetEntry200ResponseRatinginfoRatingsInner.from_dict(mod_data_get_entry200_response_ratinginfo_ratings_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


