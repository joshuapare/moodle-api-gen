# CoreGroupUpdateGroupingsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupings** | [**List[CoreGroupUpdateGroupingsRequestGroupingsInner]**](CoreGroupUpdateGroupingsRequestGroupingsInner.md) |  | 

## Example

```python
from openapi_client.models.core_group_update_groupings_request import CoreGroupUpdateGroupingsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupUpdateGroupingsRequest from a JSON string
core_group_update_groupings_request_instance = CoreGroupUpdateGroupingsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGroupUpdateGroupingsRequest.to_json())

# convert the object into a dict
core_group_update_groupings_request_dict = core_group_update_groupings_request_instance.to_dict()
# create an instance of CoreGroupUpdateGroupingsRequest from a dict
core_group_update_groupings_request_from_dict = CoreGroupUpdateGroupingsRequest.from_dict(core_group_update_groupings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


