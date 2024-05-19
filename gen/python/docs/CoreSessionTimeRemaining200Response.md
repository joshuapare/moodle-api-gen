# CoreSessionTimeRemaining200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeremaining** | **int** | The number of seconds remaining in this session. | [default to null]
**userid** | **int** | The current user id. | [default to null]

## Example

```python
from openapi_client.models.core_session_time_remaining200_response import CoreSessionTimeRemaining200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreSessionTimeRemaining200Response from a JSON string
core_session_time_remaining200_response_instance = CoreSessionTimeRemaining200Response.from_json(json)
# print the JSON string representation of the object
print(CoreSessionTimeRemaining200Response.to_json())

# convert the object into a dict
core_session_time_remaining200_response_dict = core_session_time_remaining200_response_instance.to_dict()
# create an instance of CoreSessionTimeRemaining200Response from a dict
core_session_time_remaining200_response_from_dict = CoreSessionTimeRemaining200Response.from_dict(core_session_time_remaining200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


