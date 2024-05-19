# CoreSearchGetRelevantUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course id (0 if none) | [default to null]
**query** | **str** | Query string (full or partial user full name or other details) | [default to 'null']

## Example

```python
from openapi_client.models.core_search_get_relevant_users_request import CoreSearchGetRelevantUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreSearchGetRelevantUsersRequest from a JSON string
core_search_get_relevant_users_request_instance = CoreSearchGetRelevantUsersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreSearchGetRelevantUsersRequest.to_json())

# convert the object into a dict
core_search_get_relevant_users_request_dict = core_search_get_relevant_users_request_instance.to_dict()
# create an instance of CoreSearchGetRelevantUsersRequest from a dict
core_search_get_relevant_users_request_from_dict = CoreSearchGetRelevantUsersRequest.from_dict(core_search_get_relevant_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


