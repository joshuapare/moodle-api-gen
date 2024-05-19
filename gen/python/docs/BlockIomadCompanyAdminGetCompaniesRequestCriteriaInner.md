# BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** | the company column to search, expected keys (value format) are:                                 \&quot;id\&quot; (int) matching company id,                                 \&quot;name\&quot; (string) company name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;shortname\&quot; (string) company short name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;code\&quot; (string) company code (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;suspended\&quot; (bool) company is suspended or not,                                 \&quot;city\&quot; (string) matching company city,                                 \&quot;country\&quot; (string) matching company country,                                 \&quot;timezone\&quot; (int) company timezone,                                 \&quot;lang\&quot; (string) matching company language setting | [optional] [default to 'null']
**value** | **str** | the value to search | [optional] [default to 'null']

## Example

```python
from openapi_client.models.block_iomad_company_admin_get_companies_request_criteria_inner import BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner from a JSON string
block_iomad_company_admin_get_companies_request_criteria_inner_instance = BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner.to_json())

# convert the object into a dict
block_iomad_company_admin_get_companies_request_criteria_inner_dict = block_iomad_company_admin_get_companies_request_criteria_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner from a dict
block_iomad_company_admin_get_companies_request_criteria_inner_from_dict = BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner.from_dict(block_iomad_company_admin_get_companies_request_criteria_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


