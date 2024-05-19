# ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | Certificate code | [optional] [default to 'null']
**filename** | **str** | Time created | [optional] [default to 'null']
**fileurl** | **str** | Time created | [optional] 
**grade** | **str** | Certificate grade | [optional] [default to 'null']
**id** | **int** | Issue id | [optional] [default to null]
**iomadcertificateid** | **int** | Certificate id | [optional] 
**mimetype** | **str** | mime type | [optional] [default to 'null']
**timecreated** | **int** | Time created | [optional] 
**userid** | **int** | User id | [optional] 

## Example

```python
from openapi_client.models.mod_iomadcertificate_get_issued_iomadcertificates200_response_issues_inner import ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner from a JSON string
mod_iomadcertificate_get_issued_iomadcertificates200_response_issues_inner_instance = ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner.from_json(json)
# print the JSON string representation of the object
print(ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner.to_json())

# convert the object into a dict
mod_iomadcertificate_get_issued_iomadcertificates200_response_issues_inner_dict = mod_iomadcertificate_get_issued_iomadcertificates200_response_issues_inner_instance.to_dict()
# create an instance of ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner from a dict
mod_iomadcertificate_get_issued_iomadcertificates200_response_issues_inner_from_dict = ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner.from_dict(mod_iomadcertificate_get_issued_iomadcertificates200_response_issues_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


