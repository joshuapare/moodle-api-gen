# CoreRatingAddRating200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregate** | **str** | New aggregate | [optional] [default to 'null']
**count** | **int** | Ratings count | [optional] [default to null]
**itemid** | **int** | Rating item id | [optional] [default to null]
**success** | **bool** | Whether the rate was successfully created | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_rating_add_rating200_response import CoreRatingAddRating200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreRatingAddRating200Response from a JSON string
core_rating_add_rating200_response_instance = CoreRatingAddRating200Response.from_json(json)
# print the JSON string representation of the object
print(CoreRatingAddRating200Response.to_json())

# convert the object into a dict
core_rating_add_rating200_response_dict = core_rating_add_rating200_response_instance.to_dict()
# create an instance of CoreRatingAddRating200Response from a dict
core_rating_add_rating200_response_from_dict = CoreRatingAddRating200Response.from_dict(core_rating_add_rating200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


