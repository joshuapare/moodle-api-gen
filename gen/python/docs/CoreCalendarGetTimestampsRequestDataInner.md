# CoreCalendarGetTimestampsRequestDataInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**day** | **int** | day | [optional] [default to null]
**hour** | **int** | hour | [optional] [default to null]
**key** | **str** | key | [optional] [default to 'null']
**minute** | **int** | minute | [optional] [default to null]
**month** | **int** | month | [optional] [default to null]
**year** | **int** | year | [optional] [default to null]

## Example

```python
from openapi_client.models.core_calendar_get_timestamps_request_data_inner import CoreCalendarGetTimestampsRequestDataInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetTimestampsRequestDataInner from a JSON string
core_calendar_get_timestamps_request_data_inner_instance = CoreCalendarGetTimestampsRequestDataInner.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetTimestampsRequestDataInner.to_json())

# convert the object into a dict
core_calendar_get_timestamps_request_data_inner_dict = core_calendar_get_timestamps_request_data_inner_instance.to_dict()
# create an instance of CoreCalendarGetTimestampsRequestDataInner from a dict
core_calendar_get_timestamps_request_data_inner_from_dict = CoreCalendarGetTimestampsRequestDataInner.from_dict(core_calendar_get_timestamps_request_data_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


