# CoreChangeEditmodeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | **int** | Page context id | [default to null]
**setmode** | **bool** | Set edit mode to | [default to False]

## Example

```python
from openapi_client.models.core_change_editmode_request import CoreChangeEditmodeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreChangeEditmodeRequest from a JSON string
core_change_editmode_request_instance = CoreChangeEditmodeRequest.from_json(json)
# print the JSON string representation of the object
print(CoreChangeEditmodeRequest.to_json())

# convert the object into a dict
core_change_editmode_request_dict = core_change_editmode_request_instance.to_dict()
# create an instance of CoreChangeEditmodeRequest from a dict
core_change_editmode_request_from_dict = CoreChangeEditmodeRequest.from_dict(core_change_editmode_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


