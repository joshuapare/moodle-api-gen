# CoreRatingGetItemRatings200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ratings** | [**List[CoreRatingGetItemRatings200ResponseRatingsInner]**](CoreRatingGetItemRatings200ResponseRatingsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_rating_get_item_ratings200_response import CoreRatingGetItemRatings200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreRatingGetItemRatings200Response from a JSON string
core_rating_get_item_ratings200_response_instance = CoreRatingGetItemRatings200Response.from_json(json)
# print the JSON string representation of the object
print(CoreRatingGetItemRatings200Response.to_json())

# convert the object into a dict
core_rating_get_item_ratings200_response_dict = core_rating_get_item_ratings200_response_instance.to_dict()
# create an instance of CoreRatingGetItemRatings200Response from a dict
core_rating_get_item_ratings200_response_from_dict = CoreRatingGetItemRatings200Response.from_dict(core_rating_get_item_ratings200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


