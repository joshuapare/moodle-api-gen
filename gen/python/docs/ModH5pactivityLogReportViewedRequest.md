# ModH5pactivityLogReportViewedRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptid** | **int** | The attempt id | [optional] [default to null]
**h5pactivityid** | **int** | h5p activity instance id | 
**userid** | **int** | The user id to log attempt (null means only current user) | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_h5pactivity_log_report_viewed_request import ModH5pactivityLogReportViewedRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModH5pactivityLogReportViewedRequest from a JSON string
mod_h5pactivity_log_report_viewed_request_instance = ModH5pactivityLogReportViewedRequest.from_json(json)
# print the JSON string representation of the object
print(ModH5pactivityLogReportViewedRequest.to_json())

# convert the object into a dict
mod_h5pactivity_log_report_viewed_request_dict = mod_h5pactivity_log_report_viewed_request_instance.to_dict()
# create an instance of ModH5pactivityLogReportViewedRequest from a dict
mod_h5pactivity_log_report_viewed_request_from_dict = ModH5pactivityLogReportViewedRequest.from_dict(mod_h5pactivity_log_report_viewed_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


