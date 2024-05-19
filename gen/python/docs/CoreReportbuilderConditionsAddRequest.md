# CoreReportbuilderConditionsAddRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportid** | **int** | Report ID | 
**uniqueidentifier** | **str** | Unique identifier of the condition | [default to 'null']

## Example

```python
from openapi_client.models.core_reportbuilder_conditions_add_request import CoreReportbuilderConditionsAddRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderConditionsAddRequest from a JSON string
core_reportbuilder_conditions_add_request_instance = CoreReportbuilderConditionsAddRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderConditionsAddRequest.to_json())

# convert the object into a dict
core_reportbuilder_conditions_add_request_dict = core_reportbuilder_conditions_add_request_instance.to_dict()
# create an instance of CoreReportbuilderConditionsAddRequest from a dict
core_reportbuilder_conditions_add_request_from_dict = CoreReportbuilderConditionsAddRequest.from_dict(core_reportbuilder_conditions_add_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


