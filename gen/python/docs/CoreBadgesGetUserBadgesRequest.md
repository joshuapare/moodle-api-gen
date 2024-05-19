# CoreBadgesGetUserBadgesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Filter badges by course id, empty all the courses | [optional] [default to 0]
**onlypublic** | **bool** | Whether to return only public badges | [optional] [default to False]
**page** | **int** | The page of records to return. | [optional] [default to 0]
**perpage** | **int** | The number of records to return per page | [optional] [default to 0]
**search** | **str** | A simple string to search for | [optional] [default to '']
**userid** | **int** | Badges only for this user id, empty for current user | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_badges_get_user_badges_request import CoreBadgesGetUserBadgesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBadgesGetUserBadgesRequest from a JSON string
core_badges_get_user_badges_request_instance = CoreBadgesGetUserBadgesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreBadgesGetUserBadgesRequest.to_json())

# convert the object into a dict
core_badges_get_user_badges_request_dict = core_badges_get_user_badges_request_instance.to_dict()
# create an instance of CoreBadgesGetUserBadgesRequest from a dict
core_badges_get_user_badges_request_from_dict = CoreBadgesGetUserBadgesRequest.from_dict(core_badges_get_user_badges_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


