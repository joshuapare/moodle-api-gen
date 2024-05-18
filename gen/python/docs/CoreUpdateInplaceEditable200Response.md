# CoreUpdateInplaceEditable200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | component responsible for the update | [optional] 
**displayvalue** | **str** | display value (may contain link or other html tags) | [default to 'null']
**edithint** | **str** | hint for editing element | [optional] [default to 'null']
**editicon** | [**CoreUpdateInplaceEditable200ResponseEditicon**](CoreUpdateInplaceEditable200ResponseEditicon.md) |  | [optional] 
**editlabel** | **str** | label for editing element | [optional] [default to 'null']
**itemid** | **str** | identifier of the updated item | [optional] 
**itemtype** | **str** | itemtype | [optional] 
**linkeverything** | **int** | Should everything be wrapped in the edit link or link displayed separately | [optional] [default to null]
**options** | **str** | options of the element, format depends on type | [optional] [default to 'null']
**type** | **str** | type of the element (text, toggle, select) | [optional] [default to 'null']
**value** | **str** | value of the item as it is stored | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_update_inplace_editable200_response import CoreUpdateInplaceEditable200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUpdateInplaceEditable200Response from a JSON string
core_update_inplace_editable200_response_instance = CoreUpdateInplaceEditable200Response.from_json(json)
# print the JSON string representation of the object
print(CoreUpdateInplaceEditable200Response.to_json())

# convert the object into a dict
core_update_inplace_editable200_response_dict = core_update_inplace_editable200_response_instance.to_dict()
# create an instance of CoreUpdateInplaceEditable200Response from a dict
core_update_inplace_editable200_response_from_dict = CoreUpdateInplaceEditable200Response.from_dict(core_update_inplace_editable200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


