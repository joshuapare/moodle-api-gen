# CoreReportbuilderListReports200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reports** | [**List[CoreReportbuilderListReports200ResponseReportsInner]**](CoreReportbuilderListReports200ResponseReportsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_reportbuilder_list_reports200_response import CoreReportbuilderListReports200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderListReports200Response from a JSON string
core_reportbuilder_list_reports200_response_instance = CoreReportbuilderListReports200Response.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderListReports200Response.to_json())

# convert the object into a dict
core_reportbuilder_list_reports200_response_dict = core_reportbuilder_list_reports200_response_instance.to_dict()
# create an instance of CoreReportbuilderListReports200Response from a dict
core_reportbuilder_list_reports200_response_from_dict = CoreReportbuilderListReports200Response.from_dict(core_reportbuilder_list_reports200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

