# CoreGroupGetActivityGroupmode200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupmode** | **int** | group mode:                                                     0 for no groups, 1 for separate groups, 2 for visible groups | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_group_get_activity_groupmode200_response import CoreGroupGetActivityGroupmode200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupGetActivityGroupmode200Response from a JSON string
core_group_get_activity_groupmode200_response_instance = CoreGroupGetActivityGroupmode200Response.from_json(json)
# print the JSON string representation of the object
print(CoreGroupGetActivityGroupmode200Response.to_json())

# convert the object into a dict
core_group_get_activity_groupmode200_response_dict = core_group_get_activity_groupmode200_response_instance.to_dict()
# create an instance of CoreGroupGetActivityGroupmode200Response from a dict
core_group_get_activity_groupmode200_response_from_dict = CoreGroupGetActivityGroupmode200Response.from_dict(core_group_get_activity_groupmode200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


