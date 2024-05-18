# CoreFormDynamicForm200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **str** | JSON-encoded return data from form processing method | [optional] [default to 'null']
**html** | **str** | HTML fragment of the form | [optional] [default to 'null']
**javascript** | **str** | JavaScript fragment of the form | [optional] [default to 'null']
**submitted** | **bool** | If form was submitted and validated | [default to False]

## Example

```python
from openapi_client.models.core_form_dynamic_form200_response import CoreFormDynamicForm200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreFormDynamicForm200Response from a JSON string
core_form_dynamic_form200_response_instance = CoreFormDynamicForm200Response.from_json(json)
# print the JSON string representation of the object
print(CoreFormDynamicForm200Response.to_json())

# convert the object into a dict
core_form_dynamic_form200_response_dict = core_form_dynamic_form200_response_instance.to_dict()
# create an instance of CoreFormDynamicForm200Response from a dict
core_form_dynamic_form200_response_from_dict = CoreFormDynamicForm200Response.from_dict(core_form_dynamic_form200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


