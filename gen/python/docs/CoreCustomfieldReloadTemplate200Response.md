# CoreCustomfieldReloadTemplate200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area** | **str** | area | 
**categories** | [**List[CoreCustomfieldReloadTemplate200ResponseCategoriesInner]**](CoreCustomfieldReloadTemplate200ResponseCategoriesInner.md) |  | 
**component** | **str** | component | 
**itemid** | **int** | itemid | 
**usescategories** | **bool** | view has categories | [default to False]

## Example

```python
from openapi_client.models.core_customfield_reload_template200_response import CoreCustomfieldReloadTemplate200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCustomfieldReloadTemplate200Response from a JSON string
core_customfield_reload_template200_response_instance = CoreCustomfieldReloadTemplate200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCustomfieldReloadTemplate200Response.to_json())

# convert the object into a dict
core_customfield_reload_template200_response_dict = core_customfield_reload_template200_response_instance.to_dict()
# create an instance of CoreCustomfieldReloadTemplate200Response from a dict
core_customfield_reload_template200_response_from_dict = CoreCustomfieldReloadTemplate200Response.from_dict(core_customfield_reload_template200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


