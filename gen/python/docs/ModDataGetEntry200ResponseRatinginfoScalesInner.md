# ModDataGetEntry200ResponseRatinginfoScalesInner

Scale information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course id. | [optional] [default to null]
**id** | **int** | Scale id. | [optional] 
**isnumeric** | **bool** | Whether is a numeric scale. | [optional] [default to False]
**items** | [**List[ModDataGetEntry200ResponseRatinginfoScalesInnerItemsInner]**](ModDataGetEntry200ResponseRatinginfoScalesInnerItemsInner.md) |  | [optional] 
**max** | **int** | Max value for the scale. | [optional] [default to null]
**name** | **str** | Scale name (when a real scale is used). | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_data_get_entry200_response_ratinginfo_scales_inner import ModDataGetEntry200ResponseRatinginfoScalesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetEntry200ResponseRatinginfoScalesInner from a JSON string
mod_data_get_entry200_response_ratinginfo_scales_inner_instance = ModDataGetEntry200ResponseRatinginfoScalesInner.from_json(json)
# print the JSON string representation of the object
print(ModDataGetEntry200ResponseRatinginfoScalesInner.to_json())

# convert the object into a dict
mod_data_get_entry200_response_ratinginfo_scales_inner_dict = mod_data_get_entry200_response_ratinginfo_scales_inner_instance.to_dict()
# create an instance of ModDataGetEntry200ResponseRatinginfoScalesInner from a dict
mod_data_get_entry200_response_ratinginfo_scales_inner_from_dict = ModDataGetEntry200ResponseRatinginfoScalesInner.from_dict(mod_data_get_entry200_response_ratinginfo_scales_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


