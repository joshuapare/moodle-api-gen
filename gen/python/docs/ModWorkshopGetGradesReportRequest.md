# ModWorkshopGetGradesReportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupid** | **int** | Group id, 0 means that the function will determine the user group. | [optional] [default to 0]
**page** | **int** | The page of records to return. | [optional] [default to 0]
**perpage** | **int** | The number of records to return per page. | [optional] [default to 0]
**sortby** | **str** | sort by this element: lastname, firstname, submissiontitle,                     submissionmodified, submissiongrade, gradinggrade. | [optional] [default to 'lastname']
**sortdirection** | **str** | sort direction: ASC or DESC | [optional] [default to 'ASC']
**workshopid** | **int** | Workshop instance id. | 

## Example

```python
from openapi_client.models.mod_workshop_get_grades_report_request import ModWorkshopGetGradesReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetGradesReportRequest from a JSON string
mod_workshop_get_grades_report_request_instance = ModWorkshopGetGradesReportRequest.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetGradesReportRequest.to_json())

# convert the object into a dict
mod_workshop_get_grades_report_request_dict = mod_workshop_get_grades_report_request_instance.to_dict()
# create an instance of ModWorkshopGetGradesReportRequest from a dict
mod_workshop_get_grades_report_request_from_dict = ModWorkshopGetGradesReportRequest.from_dict(mod_workshop_get_grades_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


