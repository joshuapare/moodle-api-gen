# ModDataGetEntry200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entry** | [**ModDataGetEntry200ResponseEntry**](ModDataGetEntry200ResponseEntry.md) |  | 
**entryviewcontents** | **str** | The entry as is rendered in the site. | [optional] [default to 'null']
**ratinginfo** | [**ModDataGetEntry200ResponseRatinginfo**](ModDataGetEntry200ResponseRatinginfo.md) |  | [optional] 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_data_get_entry200_response import ModDataGetEntry200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetEntry200Response from a JSON string
mod_data_get_entry200_response_instance = ModDataGetEntry200Response.from_json(json)
# print the JSON string representation of the object
print(ModDataGetEntry200Response.to_json())

# convert the object into a dict
mod_data_get_entry200_response_dict = mod_data_get_entry200_response_instance.to_dict()
# create an instance of ModDataGetEntry200Response from a dict
mod_data_get_entry200_response_from_dict = ModDataGetEntry200Response.from_dict(mod_data_get_entry200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


