# BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyid** | **int** | the company id | [optional] [default to 0]
**shared** | **int** | Show all of the shared courses availabe to the company | [optional] [default to 0]

## Example

```python
from openapi_client.models.block_iomad_company_admin_get_company_courses_request_criteria_inner import BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner from a JSON string
block_iomad_company_admin_get_company_courses_request_criteria_inner_instance = BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner.to_json())

# convert the object into a dict
block_iomad_company_admin_get_company_courses_request_criteria_inner_dict = block_iomad_company_admin_get_company_courses_request_criteria_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner from a dict
block_iomad_company_admin_get_company_courses_request_criteria_inner_from_dict = BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner.from_dict(block_iomad_company_admin_get_company_courses_request_criteria_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


