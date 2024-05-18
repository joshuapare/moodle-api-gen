# CoreReportbuilderRetrieveSystemReport200ResponseData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headers** | **List[object]** |  | 
**rows** | [**List[CoreReportbuilderRetrieveSystemReport200ResponseDataRowsInner]**](CoreReportbuilderRetrieveSystemReport200ResponseDataRowsInner.md) |  | 
**totalrowcount** | **int** | totalrowcount | 

## Example

```python
from openapi_client.models.core_reportbuilder_retrieve_system_report200_response_data import CoreReportbuilderRetrieveSystemReport200ResponseData

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderRetrieveSystemReport200ResponseData from a JSON string
core_reportbuilder_retrieve_system_report200_response_data_instance = CoreReportbuilderRetrieveSystemReport200ResponseData.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderRetrieveSystemReport200ResponseData.to_json())

# convert the object into a dict
core_reportbuilder_retrieve_system_report200_response_data_dict = core_reportbuilder_retrieve_system_report200_response_data_instance.to_dict()
# create an instance of CoreReportbuilderRetrieveSystemReport200ResponseData from a dict
core_reportbuilder_retrieve_system_report200_response_data_from_dict = CoreReportbuilderRetrieveSystemReport200ResponseData.from_dict(core_reportbuilder_retrieve_system_report200_response_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


