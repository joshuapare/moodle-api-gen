# CoreTableGetDynamicTableContent200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**html** | **str** | The raw html of the requested table. | [default to 'null']
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_table_get_dynamic_table_content200_response import CoreTableGetDynamicTableContent200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTableGetDynamicTableContent200Response from a JSON string
core_table_get_dynamic_table_content200_response_instance = CoreTableGetDynamicTableContent200Response.from_json(json)
# print the JSON string representation of the object
print(CoreTableGetDynamicTableContent200Response.to_json())

# convert the object into a dict
core_table_get_dynamic_table_content200_response_dict = core_table_get_dynamic_table_content200_response_instance.to_dict()
# create an instance of CoreTableGetDynamicTableContent200Response from a dict
core_table_get_dynamic_table_content200_response_from_dict = CoreTableGetDynamicTableContent200Response.from_dict(core_table_get_dynamic_table_content200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


