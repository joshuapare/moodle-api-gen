# CoreCustomfieldDeleteCategoryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | category ID to delete | [default to null]

## Example

```python
from openapi_client.models.core_customfield_delete_category_request import CoreCustomfieldDeleteCategoryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCustomfieldDeleteCategoryRequest from a JSON string
core_customfield_delete_category_request_instance = CoreCustomfieldDeleteCategoryRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCustomfieldDeleteCategoryRequest.to_json())

# convert the object into a dict
core_customfield_delete_category_request_dict = core_customfield_delete_category_request_instance.to_dict()
# create an instance of CoreCustomfieldDeleteCategoryRequest from a dict
core_customfield_delete_category_request_from_dict = CoreCustomfieldDeleteCategoryRequest.from_dict(core_customfield_delete_category_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


