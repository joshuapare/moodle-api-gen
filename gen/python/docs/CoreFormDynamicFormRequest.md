# CoreFormDynamicFormRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**form** | **str** | Form class | [default to 'null']
**formdata** | **str** | url-encoded form data | [default to 'null']

## Example

```python
from openapi_client.models.core_form_dynamic_form_request import CoreFormDynamicFormRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreFormDynamicFormRequest from a JSON string
core_form_dynamic_form_request_instance = CoreFormDynamicFormRequest.from_json(json)
# print the JSON string representation of the object
print(CoreFormDynamicFormRequest.to_json())

# convert the object into a dict
core_form_dynamic_form_request_dict = core_form_dynamic_form_request_instance.to_dict()
# create an instance of CoreFormDynamicFormRequest from a dict
core_form_dynamic_form_request_from_dict = CoreFormDynamicFormRequest.from_dict(core_form_dynamic_form_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


