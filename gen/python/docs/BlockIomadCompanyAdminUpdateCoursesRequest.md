# BlockIomadCompanyAdminUpdateCoursesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courses** | [**List[BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner]**](BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner.md) |  | 

## Example

```python
from openapi_client.models.block_iomad_company_admin_update_courses_request import BlockIomadCompanyAdminUpdateCoursesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminUpdateCoursesRequest from a JSON string
block_iomad_company_admin_update_courses_request_instance = BlockIomadCompanyAdminUpdateCoursesRequest.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminUpdateCoursesRequest.to_json())

# convert the object into a dict
block_iomad_company_admin_update_courses_request_dict = block_iomad_company_admin_update_courses_request_instance.to_dict()
# create an instance of BlockIomadCompanyAdminUpdateCoursesRequest from a dict
block_iomad_company_admin_update_courses_request_from_dict = BlockIomadCompanyAdminUpdateCoursesRequest.from_dict(block_iomad_company_admin_update_courses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


