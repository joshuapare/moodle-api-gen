# CoreRatingAddRatingRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregation** | **int** | agreggation method | [optional] [default to 0]
**component** | **str** | component | 
**contextlevel** | **str** | context level: course, module, user, etc... | [default to 'null']
**instanceid** | **int** | the instance id of item associated with the context level | [default to null]
**itemid** | **int** | associated id | 
**rateduserid** | **int** | rated user id | [default to null]
**rating** | **int** | user rating | [default to null]
**ratingarea** | **str** | rating area | [default to 'null']
**scaleid** | **int** | scale id | [default to null]

## Example

```python
from openapi_client.models.core_rating_add_rating_request import CoreRatingAddRatingRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreRatingAddRatingRequest from a JSON string
core_rating_add_rating_request_instance = CoreRatingAddRatingRequest.from_json(json)
# print the JSON string representation of the object
print(CoreRatingAddRatingRequest.to_json())

# convert the object into a dict
core_rating_add_rating_request_dict = core_rating_add_rating_request_instance.to_dict()
# create an instance of CoreRatingAddRatingRequest from a dict
core_rating_add_rating_request_from_dict = CoreRatingAddRatingRequest.from_dict(core_rating_add_rating_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


