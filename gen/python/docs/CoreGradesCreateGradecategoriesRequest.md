# CoreGradesCreateGradecategoriesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categories** | [**List[CoreGradesCreateGradecategoriesRequestCategoriesInner]**](CoreGradesCreateGradecategoriesRequestCategoriesInner.md) |  | 
**courseid** | **int** | id of course | [default to null]

## Example

```python
from openapi_client.models.core_grades_create_gradecategories_request import CoreGradesCreateGradecategoriesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesCreateGradecategoriesRequest from a JSON string
core_grades_create_gradecategories_request_instance = CoreGradesCreateGradecategoriesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGradesCreateGradecategoriesRequest.to_json())

# convert the object into a dict
core_grades_create_gradecategories_request_dict = core_grades_create_gradecategories_request_instance.to_dict()
# create an instance of CoreGradesCreateGradecategoriesRequest from a dict
core_grades_create_gradecategories_request_from_dict = CoreGradesCreateGradecategoriesRequest.from_dict(core_grades_create_gradecategories_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


