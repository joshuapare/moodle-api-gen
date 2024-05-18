# ModIomadcertificateIssueIomadcertificate200ResponseIssue


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | Certificate code | 
**filename** | **str** | Time created | 
**fileurl** | **str** | Time created | 
**grade** | **str** | Certificate grade | [optional] 
**id** | **int** | Issue id | 
**iomadcertificateid** | **int** | Certificate id | 
**mimetype** | **str** | mime type | 
**timecreated** | **int** | Time created | 
**userid** | **int** | User id | 

## Example

```python
from openapi_client.models.mod_iomadcertificate_issue_iomadcertificate200_response_issue import ModIomadcertificateIssueIomadcertificate200ResponseIssue

# TODO update the JSON string below
json = "{}"
# create an instance of ModIomadcertificateIssueIomadcertificate200ResponseIssue from a JSON string
mod_iomadcertificate_issue_iomadcertificate200_response_issue_instance = ModIomadcertificateIssueIomadcertificate200ResponseIssue.from_json(json)
# print the JSON string representation of the object
print(ModIomadcertificateIssueIomadcertificate200ResponseIssue.to_json())

# convert the object into a dict
mod_iomadcertificate_issue_iomadcertificate200_response_issue_dict = mod_iomadcertificate_issue_iomadcertificate200_response_issue_instance.to_dict()
# create an instance of ModIomadcertificateIssueIomadcertificate200ResponseIssue from a dict
mod_iomadcertificate_issue_iomadcertificate200_response_issue_from_dict = ModIomadcertificateIssueIomadcertificate200ResponseIssue.from_dict(mod_iomadcertificate_issue_iomadcertificate200_response_issue_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


