# CoreReportbuilderRetrieveReport200ResponseData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headers** | **List[object]** |  | 
**rows** | [**List[CoreReportbuilderRetrieveReport200ResponseDataRowsInner]**](CoreReportbuilderRetrieveReport200ResponseDataRowsInner.md) |  | 
**totalrowcount** | **int** | totalrowcount | [default to null]

## Example

```python
from openapi_client.models.core_reportbuilder_retrieve_report200_response_data import CoreReportbuilderRetrieveReport200ResponseData

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderRetrieveReport200ResponseData from a JSON string
core_reportbuilder_retrieve_report200_response_data_instance = CoreReportbuilderRetrieveReport200ResponseData.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderRetrieveReport200ResponseData.to_json())

# convert the object into a dict
core_reportbuilder_retrieve_report200_response_data_dict = core_reportbuilder_retrieve_report200_response_data_instance.to_dict()
# create an instance of CoreReportbuilderRetrieveReport200ResponseData from a dict
core_reportbuilder_retrieve_report200_response_data_from_dict = CoreReportbuilderRetrieveReport200ResponseData.from_dict(core_reportbuilder_retrieve_report200_response_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


