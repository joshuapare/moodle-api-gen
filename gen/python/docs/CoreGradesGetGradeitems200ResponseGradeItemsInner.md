# CoreGradesGetGradeitems200ResponseGradeItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **str** | The grade category of the grade item | [optional] [default to 'null']
**id** | **str** | An ID for the grade item | [optional] [default to 'null']
**itemname** | **str** | The full name of the grade item | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_grades_get_gradeitems200_response_grade_items_inner import CoreGradesGetGradeitems200ResponseGradeItemsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGetGradeitems200ResponseGradeItemsInner from a JSON string
core_grades_get_gradeitems200_response_grade_items_inner_instance = CoreGradesGetGradeitems200ResponseGradeItemsInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGetGradeitems200ResponseGradeItemsInner.to_json())

# convert the object into a dict
core_grades_get_gradeitems200_response_grade_items_inner_dict = core_grades_get_gradeitems200_response_grade_items_inner_instance.to_dict()
# create an instance of CoreGradesGetGradeitems200ResponseGradeItemsInner from a dict
core_grades_get_gradeitems200_response_grade_items_inner_from_dict = CoreGradesGetGradeitems200ResponseGradeItemsInner.from_dict(core_grades_get_gradeitems200_response_grade_items_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


