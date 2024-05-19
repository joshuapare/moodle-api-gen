# CoreReportbuilderRetrieveReport200ResponseDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area** | **str** | area | [default to '']
**component** | **str** | component | [default to '']
**conditiondata** | **str** | conditiondata | 
**contextid** | **int** | contextid | [default to {}]
**id** | **int** | id | [default to 0]
**itemid** | **int** | itemid | [default to 0]
**modifiedby** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | 
**name** | **str** | name | 
**settingsdata** | **str** | settingsdata | 
**source** | **str** | source | 
**sourcename** | **str** | sourcename | 
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**type** | **int** | type | 
**uniquerows** | **bool** | uniquerows | [default to False]
**usercreated** | **int** | usercreated | [default to {}]
**usermodified** | **int** | usermodified | [default to 0]

## Example

```python
from openapi_client.models.core_reportbuilder_retrieve_report200_response_details import CoreReportbuilderRetrieveReport200ResponseDetails

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderRetrieveReport200ResponseDetails from a JSON string
core_reportbuilder_retrieve_report200_response_details_instance = CoreReportbuilderRetrieveReport200ResponseDetails.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderRetrieveReport200ResponseDetails.to_json())

# convert the object into a dict
core_reportbuilder_retrieve_report200_response_details_dict = core_reportbuilder_retrieve_report200_response_details_instance.to_dict()
# create an instance of CoreReportbuilderRetrieveReport200ResponseDetails from a dict
core_reportbuilder_retrieve_report200_response_details_from_dict = CoreReportbuilderRetrieveReport200ResponseDetails.from_dict(core_reportbuilder_retrieve_report200_response_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


