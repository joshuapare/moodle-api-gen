# ModWorkshopGetGradesReport200ResponseReport


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grades** | [**List[ModWorkshopGetGradesReport200ResponseReportGradesInner]**](ModWorkshopGetGradesReport200ResponseReportGradesInner.md) |  | 
**totalcount** | **int** | Number of total submissions. | [default to null]

## Example

```python
from openapi_client.models.mod_workshop_get_grades_report200_response_report import ModWorkshopGetGradesReport200ResponseReport

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetGradesReport200ResponseReport from a JSON string
mod_workshop_get_grades_report200_response_report_instance = ModWorkshopGetGradesReport200ResponseReport.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetGradesReport200ResponseReport.to_json())

# convert the object into a dict
mod_workshop_get_grades_report200_response_report_dict = mod_workshop_get_grades_report200_response_report_instance.to_dict()
# create an instance of ModWorkshopGetGradesReport200ResponseReport from a dict
mod_workshop_get_grades_report200_response_report_from_dict = ModWorkshopGetGradesReport200ResponseReport.from_dict(mod_workshop_get_grades_report200_response_report_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


