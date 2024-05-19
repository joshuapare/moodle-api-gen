# CoreCustomfieldMoveCategoryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**beforeid** | **int** | Id of the category before which it needs to be moved | [optional] [default to 0]
**id** | **int** | Category ID to move | [default to null]

## Example

```python
from openapi_client.models.core_customfield_move_category_request import CoreCustomfieldMoveCategoryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCustomfieldMoveCategoryRequest from a JSON string
core_customfield_move_category_request_instance = CoreCustomfieldMoveCategoryRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCustomfieldMoveCategoryRequest.to_json())

# convert the object into a dict
core_customfield_move_category_request_dict = core_customfield_move_category_request_instance.to_dict()
# create an instance of CoreCustomfieldMoveCategoryRequest from a dict
core_customfield_move_category_request_from_dict = CoreCustomfieldMoveCategoryRequest.from_dict(core_customfield_move_category_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


