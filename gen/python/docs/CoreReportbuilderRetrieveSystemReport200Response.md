# CoreReportbuilderRetrieveSystemReport200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**CoreReportbuilderRetrieveSystemReport200ResponseData**](CoreReportbuilderRetrieveSystemReport200ResponseData.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_reportbuilder_retrieve_system_report200_response import CoreReportbuilderRetrieveSystemReport200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderRetrieveSystemReport200Response from a JSON string
core_reportbuilder_retrieve_system_report200_response_instance = CoreReportbuilderRetrieveSystemReport200Response.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderRetrieveSystemReport200Response.to_json())

# convert the object into a dict
core_reportbuilder_retrieve_system_report200_response_dict = core_reportbuilder_retrieve_system_report200_response_instance.to_dict()
# create an instance of CoreReportbuilderRetrieveSystemReport200Response from a dict
core_reportbuilder_retrieve_system_report200_response_from_dict = CoreReportbuilderRetrieveSystemReport200Response.from_dict(core_reportbuilder_retrieve_system_report200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


