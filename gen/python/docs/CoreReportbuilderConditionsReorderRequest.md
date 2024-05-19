# CoreReportbuilderConditionsReorderRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditionid** | **int** | Condition ID | 
**position** | **int** | New condition position | [default to null]
**reportid** | **int** | Report ID | 

## Example

```python
from openapi_client.models.core_reportbuilder_conditions_reorder_request import CoreReportbuilderConditionsReorderRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderConditionsReorderRequest from a JSON string
core_reportbuilder_conditions_reorder_request_instance = CoreReportbuilderConditionsReorderRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderConditionsReorderRequest.to_json())

# convert the object into a dict
core_reportbuilder_conditions_reorder_request_dict = core_reportbuilder_conditions_reorder_request_instance.to_dict()
# create an instance of CoreReportbuilderConditionsReorderRequest from a dict
core_reportbuilder_conditions_reorder_request_from_dict = CoreReportbuilderConditionsReorderRequest.from_dict(core_reportbuilder_conditions_reorder_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


