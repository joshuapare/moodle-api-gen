# BlockIomadCompanyAdminGetCompanyCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companies** | [**List[BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner]**](BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner.md) |  | 
**warnings** | [**List[BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner]**](BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.block_iomad_company_admin_get_company_courses200_response import BlockIomadCompanyAdminGetCompanyCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminGetCompanyCourses200Response from a JSON string
block_iomad_company_admin_get_company_courses200_response_instance = BlockIomadCompanyAdminGetCompanyCourses200Response.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminGetCompanyCourses200Response.to_json())

# convert the object into a dict
block_iomad_company_admin_get_company_courses200_response_dict = block_iomad_company_admin_get_company_courses200_response_instance.to_dict()
# create an instance of BlockIomadCompanyAdminGetCompanyCourses200Response from a dict
block_iomad_company_admin_get_company_courses200_response_from_dict = BlockIomadCompanyAdminGetCompanyCourses200Response.from_dict(block_iomad_company_admin_get_company_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

