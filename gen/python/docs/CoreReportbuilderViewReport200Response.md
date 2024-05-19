# CoreReportbuilderViewReport200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | Success | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_reportbuilder_view_report200_response import CoreReportbuilderViewReport200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderViewReport200Response from a JSON string
core_reportbuilder_view_report200_response_instance = CoreReportbuilderViewReport200Response.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderViewReport200Response.to_json())

# convert the object into a dict
core_reportbuilder_view_report200_response_dict = core_reportbuilder_view_report200_response_instance.to_dict()
# create an instance of CoreReportbuilderViewReport200Response from a dict
core_reportbuilder_view_report200_response_from_dict = CoreReportbuilderViewReport200Response.from_dict(core_reportbuilder_view_report200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


