# CoreCustomfieldCreateCategoryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area** | **str** | area | [default to 'null']
**component** | **str** | component | 
**itemid** | **int** | itemid | [default to null]

## Example

```python
from openapi_client.models.core_customfield_create_category_request import CoreCustomfieldCreateCategoryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCustomfieldCreateCategoryRequest from a JSON string
core_customfield_create_category_request_instance = CoreCustomfieldCreateCategoryRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCustomfieldCreateCategoryRequest.to_json())

# convert the object into a dict
core_customfield_create_category_request_dict = core_customfield_create_category_request_instance.to_dict()
# create an instance of CoreCustomfieldCreateCategoryRequest from a dict
core_customfield_create_category_request_from_dict = CoreCustomfieldCreateCategoryRequest.from_dict(core_customfield_create_category_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


