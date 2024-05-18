# CoreUpdateInplaceEditableRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | component responsible for the update | [default to 'null']
**itemid** | **str** | identifier of the updated item | [default to 'null']
**itemtype** | **str** | type of the updated item inside the component | [default to 'null']
**value** | **str** | new value | [default to 'null']

## Example

```python
from openapi_client.models.core_update_inplace_editable_request import CoreUpdateInplaceEditableRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUpdateInplaceEditableRequest from a JSON string
core_update_inplace_editable_request_instance = CoreUpdateInplaceEditableRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUpdateInplaceEditableRequest.to_json())

# convert the object into a dict
core_update_inplace_editable_request_dict = core_update_inplace_editable_request_instance.to_dict()
# create an instance of CoreUpdateInplaceEditableRequest from a dict
core_update_inplace_editable_request_from_dict = CoreUpdateInplaceEditableRequest.from_dict(core_update_inplace_editable_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


