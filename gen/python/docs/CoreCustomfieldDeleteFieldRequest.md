# CoreCustomfieldDeleteFieldRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Custom field ID to delete | [default to null]

## Example

```python
from openapi_client.models.core_customfield_delete_field_request import CoreCustomfieldDeleteFieldRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCustomfieldDeleteFieldRequest from a JSON string
core_customfield_delete_field_request_instance = CoreCustomfieldDeleteFieldRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCustomfieldDeleteFieldRequest.to_json())

# convert the object into a dict
core_customfield_delete_field_request_dict = core_customfield_delete_field_request_instance.to_dict()
# create an instance of CoreCustomfieldDeleteFieldRequest from a dict
core_customfield_delete_field_request_from_dict = CoreCustomfieldDeleteFieldRequest.from_dict(core_customfield_delete_field_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


