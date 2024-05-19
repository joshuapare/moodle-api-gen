# CoreMessageMessageSearchUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limitfrom** | **int** | Limit from | [optional] [default to 0]
**limitnum** | **int** | Limit number | [optional] [default to 0]
**search** | **str** | The string being searched | 
**userid** | **int** | The id of the user who is performing the search | 

## Example

```python
from openapi_client.models.core_message_message_search_users_request import CoreMessageMessageSearchUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageMessageSearchUsersRequest from a JSON string
core_message_message_search_users_request_instance = CoreMessageMessageSearchUsersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageMessageSearchUsersRequest.to_json())

# convert the object into a dict
core_message_message_search_users_request_dict = core_message_message_search_users_request_instance.to_dict()
# create an instance of CoreMessageMessageSearchUsersRequest from a dict
core_message_message_search_users_request_from_dict = CoreMessageMessageSearchUsersRequest.from_dict(core_message_message_search_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


