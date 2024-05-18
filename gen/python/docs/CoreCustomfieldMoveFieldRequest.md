# CoreCustomfieldMoveFieldRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**beforeid** | **int** | Id of the field before which it needs to be moved | [optional] [default to 0]
**categoryid** | **int** | New parent category id | [default to null]
**id** | **int** | Id of the field to move | [default to null]

## Example

```python
from openapi_client.models.core_customfield_move_field_request import CoreCustomfieldMoveFieldRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCustomfieldMoveFieldRequest from a JSON string
core_customfield_move_field_request_instance = CoreCustomfieldMoveFieldRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCustomfieldMoveFieldRequest.to_json())

# convert the object into a dict
core_customfield_move_field_request_dict = core_customfield_move_field_request_instance.to_dict()
# create an instance of CoreCustomfieldMoveFieldRequest from a dict
core_customfield_move_field_request_from_dict = CoreCustomfieldMoveFieldRequest.from_dict(core_customfield_move_field_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


