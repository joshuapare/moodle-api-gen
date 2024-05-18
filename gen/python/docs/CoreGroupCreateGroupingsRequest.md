# CoreGroupCreateGroupingsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupings** | [**List[CoreGroupCreateGroupingsRequestGroupingsInner]**](CoreGroupCreateGroupingsRequestGroupingsInner.md) |  | 

## Example

```python
from openapi_client.models.core_group_create_groupings_request import CoreGroupCreateGroupingsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupCreateGroupingsRequest from a JSON string
core_group_create_groupings_request_instance = CoreGroupCreateGroupingsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGroupCreateGroupingsRequest.to_json())

# convert the object into a dict
core_group_create_groupings_request_dict = core_group_create_groupings_request_instance.to_dict()
# create an instance of CoreGroupCreateGroupingsRequest from a dict
core_group_create_groupings_request_from_dict = CoreGroupCreateGroupingsRequest.from_dict(core_group_create_groupings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


