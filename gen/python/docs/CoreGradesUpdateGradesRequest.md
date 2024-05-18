# CoreGradesUpdateGradesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activityid** | **int** | The activity ID | [default to null]
**component** | **str** | A component, for example mod_forum or mod_quiz | [default to 'null']
**courseid** | **int** | id of course | 
**grades** | [**List[CoreGradesUpdateGradesRequestGradesInner]**](CoreGradesUpdateGradesRequestGradesInner.md) |  | [optional] 
**itemdetails** | [**CoreGradesUpdateGradesRequestItemdetails**](CoreGradesUpdateGradesRequestItemdetails.md) |  | [optional] 
**itemnumber** | **int** | grade item ID number for modules that have multiple grades. Typically this is 0. | [default to null]
**source** | **str** | The source of the grade update | [default to 'null']

## Example

```python
from openapi_client.models.core_grades_update_grades_request import CoreGradesUpdateGradesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesUpdateGradesRequest from a JSON string
core_grades_update_grades_request_instance = CoreGradesUpdateGradesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGradesUpdateGradesRequest.to_json())

# convert the object into a dict
core_grades_update_grades_request_dict = core_grades_update_grades_request_instance.to_dict()
# create an instance of CoreGradesUpdateGradesRequest from a dict
core_grades_update_grades_request_from_dict = CoreGradesUpdateGradesRequest.from_dict(core_grades_update_grades_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


