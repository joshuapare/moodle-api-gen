# CoreGetUserDatesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | Context ID. Either use this value, or level and instanceid. | [optional] [default to 0]
**contextlevel** | **str** | Context level. To be used with instanceid. | [optional] [default to '']
**instanceid** | **int** | Context instance ID. To be used with level | [optional] [default to 0]
**timestamps** | [**List[CoreGetUserDatesRequestTimestampsInner]**](CoreGetUserDatesRequestTimestampsInner.md) |  | 

## Example

```python
from openapi_client.models.core_get_user_dates_request import CoreGetUserDatesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGetUserDatesRequest from a JSON string
core_get_user_dates_request_instance = CoreGetUserDatesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGetUserDatesRequest.to_json())

# convert the object into a dict
core_get_user_dates_request_dict = core_get_user_dates_request_instance.to_dict()
# create an instance of CoreGetUserDatesRequest from a dict
core_get_user_dates_request_from_dict = CoreGetUserDatesRequest.from_dict(core_get_user_dates_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


