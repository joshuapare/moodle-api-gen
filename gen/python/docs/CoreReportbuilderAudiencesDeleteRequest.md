# CoreReportbuilderAudiencesDeleteRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceid** | **int** | Audience instance id | [default to null]
**reportid** | **int** | Report id | [default to null]

## Example

```python
from openapi_client.models.core_reportbuilder_audiences_delete_request import CoreReportbuilderAudiencesDeleteRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderAudiencesDeleteRequest from a JSON string
core_reportbuilder_audiences_delete_request_instance = CoreReportbuilderAudiencesDeleteRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderAudiencesDeleteRequest.to_json())

# convert the object into a dict
core_reportbuilder_audiences_delete_request_dict = core_reportbuilder_audiences_delete_request_instance.to_dict()
# create an instance of CoreReportbuilderAudiencesDeleteRequest from a dict
core_reportbuilder_audiences_delete_request_from_dict = CoreReportbuilderAudiencesDeleteRequest.from_dict(core_reportbuilder_audiences_delete_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


