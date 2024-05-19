# ModDataGetEntry200ResponseRatinginfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canviewall** | **bool** | Whether the user can view all the individual ratings. | [optional] [default to False]
**canviewany** | **bool** | Whether the user can view aggregate of ratings of others. | [optional] [default to False]
**component** | **str** | Context name. | [default to 'null']
**contextid** | **int** | Context id. | [default to null]
**ratingarea** | **str** | Rating area name. | [default to 'null']
**ratings** | [**List[ModDataGetEntry200ResponseRatinginfoRatingsInner]**](ModDataGetEntry200ResponseRatinginfoRatingsInner.md) |  | [optional] 
**scales** | [**List[ModDataGetEntry200ResponseRatinginfoScalesInner]**](ModDataGetEntry200ResponseRatinginfoScalesInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_data_get_entry200_response_ratinginfo import ModDataGetEntry200ResponseRatinginfo

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetEntry200ResponseRatinginfo from a JSON string
mod_data_get_entry200_response_ratinginfo_instance = ModDataGetEntry200ResponseRatinginfo.from_json(json)
# print the JSON string representation of the object
print(ModDataGetEntry200ResponseRatinginfo.to_json())

# convert the object into a dict
mod_data_get_entry200_response_ratinginfo_dict = mod_data_get_entry200_response_ratinginfo_instance.to_dict()
# create an instance of ModDataGetEntry200ResponseRatinginfo from a dict
mod_data_get_entry200_response_ratinginfo_from_dict = ModDataGetEntry200ResponseRatinginfo.from_dict(mod_data_get_entry200_response_ratinginfo_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


