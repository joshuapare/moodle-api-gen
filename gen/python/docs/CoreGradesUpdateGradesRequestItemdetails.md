# CoreGradesUpdateGradesRequestItemdetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleted** | **bool** | True if the grade item should be deleted | [optional] [default to False]
**grademax** | **float** | Maximum grade allowed | [optional] [default to null]
**grademin** | **float** | Minimum grade allowed | [optional] [default to null]
**gradetype** | **int** | The type of grade (0 &#x3D; none, 1 &#x3D; value, 2 &#x3D; scale, 3 &#x3D; text) | [optional] [default to null]
**hidden** | **bool** | True if the grade item is hidden | [optional] [default to False]
**idnumber** | **int** | Arbitrary ID provided by the module responsible for the grade item | [optional] [default to null]
**itemname** | **str** | The grade item name | [optional] [default to 'null']
**multfactor** | **float** | Multiply all grades by this number | [optional] [default to null]
**plusfactor** | **float** | Add this to all grades | [optional] [default to null]
**scaleid** | **int** | The ID of the custom scale being is used | [optional] [default to null]

## Example

```python
from openapi_client.models.core_grades_update_grades_request_itemdetails import CoreGradesUpdateGradesRequestItemdetails

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesUpdateGradesRequestItemdetails from a JSON string
core_grades_update_grades_request_itemdetails_instance = CoreGradesUpdateGradesRequestItemdetails.from_json(json)
# print the JSON string representation of the object
print(CoreGradesUpdateGradesRequestItemdetails.to_json())

# convert the object into a dict
core_grades_update_grades_request_itemdetails_dict = core_grades_update_grades_request_itemdetails_instance.to_dict()
# create an instance of CoreGradesUpdateGradesRequestItemdetails from a dict
core_grades_update_grades_request_itemdetails_from_dict = CoreGradesUpdateGradesRequestItemdetails.from_dict(core_grades_update_grades_request_itemdetails_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


