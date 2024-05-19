# CoreGroupGetGroupingsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupingids** | **List[object]** |  | 
**returngroups** | **bool** | return associated groups | [optional] [default to False]

## Example

```python
from openapi_client.models.core_group_get_groupings_request import CoreGroupGetGroupingsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupGetGroupingsRequest from a JSON string
core_group_get_groupings_request_instance = CoreGroupGetGroupingsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGroupGetGroupingsRequest.to_json())

# convert the object into a dict
core_group_get_groupings_request_dict = core_group_get_groupings_request_instance.to_dict()
# create an instance of CoreGroupGetGroupingsRequest from a dict
core_group_get_groupings_request_from_dict = CoreGroupGetGroupingsRequest.from_dict(core_group_get_groupings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


