# CoreGetUserDatesRequestTimestampsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fixday** | **int** | Remove leading zero for day | [optional] [default to 1]
**fixhour** | **int** | Remove leading zero for hour | [optional] [default to 1]
**format** | **str** | format string | [optional] [default to 'null']
**timestamp** | **int** | unix timestamp | [optional] [default to null]
**type** | **str** | The calendar type | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_get_user_dates_request_timestamps_inner import CoreGetUserDatesRequestTimestampsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGetUserDatesRequestTimestampsInner from a JSON string
core_get_user_dates_request_timestamps_inner_instance = CoreGetUserDatesRequestTimestampsInner.from_json(json)
# print the JSON string representation of the object
print(CoreGetUserDatesRequestTimestampsInner.to_json())

# convert the object into a dict
core_get_user_dates_request_timestamps_inner_dict = core_get_user_dates_request_timestamps_inner_instance.to_dict()
# create an instance of CoreGetUserDatesRequestTimestampsInner from a dict
core_get_user_dates_request_timestamps_inner_from_dict = CoreGetUserDatesRequestTimestampsInner.from_dict(core_get_user_dates_request_timestamps_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


