# BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** | Company address | [optional] [default to 'null']
**city** | **str** | Company city | [optional] [default to 'null']
**code** | **str** | Company code | [optional] [default to 'null']
**country** | **str** | Company country | [optional] [default to 'null']
**courses** | [**List[BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner]**](BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner.md) |  | [optional] 
**custom1** | **str** | Company custom1 | [optional] [default to 'null']
**custom2** | **str** | Company custom2 | [optional] [default to 'null']
**custom3** | **str** | Company custom3 | [optional] [default to 'null']
**id** | **int** | Company ID | [optional] 
**name** | **str** | Company name | [optional] [default to 'null']
**postcode** | **str** | Company postcode | [optional] [default to 'null']
**region** | **str** | Company region | [optional] [default to 'null']
**shortname** | **str** | Company shortname | [optional] [default to 'null']

## Example

```python
from openapi_client.models.block_iomad_company_admin_get_company_courses200_response_companies_inner import BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner from a JSON string
block_iomad_company_admin_get_company_courses200_response_companies_inner_instance = BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner.to_json())

# convert the object into a dict
block_iomad_company_admin_get_company_courses200_response_companies_inner_dict = block_iomad_company_admin_get_company_courses200_response_companies_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner from a dict
block_iomad_company_admin_get_company_courses200_response_companies_inner_from_dict = BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner.from_dict(block_iomad_company_admin_get_company_courses200_response_companies_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


