# CoreReportbuilderConditionsDeleteRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditionid** | **int** | Condition ID | [default to null]
**reportid** | **int** | Report ID | 

## Example

```python
from openapi_client.models.core_reportbuilder_conditions_delete_request import CoreReportbuilderConditionsDeleteRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderConditionsDeleteRequest from a JSON string
core_reportbuilder_conditions_delete_request_instance = CoreReportbuilderConditionsDeleteRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderConditionsDeleteRequest.to_json())

# convert the object into a dict
core_reportbuilder_conditions_delete_request_dict = core_reportbuilder_conditions_delete_request_instance.to_dict()
# create an instance of CoreReportbuilderConditionsDeleteRequest from a dict
core_reportbuilder_conditions_delete_request_from_dict = CoreReportbuilderConditionsDeleteRequest.from_dict(core_reportbuilder_conditions_delete_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


