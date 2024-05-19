# BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyid** | **int** | Course company ID | [optional] [default to 0]
**courseid** | **int** | Course ID | [optional] [default to 0]

## Example

```python
from openapi_client.models.block_iomad_company_admin_unassign_courses_request_courses_inner import BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner from a JSON string
block_iomad_company_admin_unassign_courses_request_courses_inner_instance = BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner.to_json())

# convert the object into a dict
block_iomad_company_admin_unassign_courses_request_courses_inner_dict = block_iomad_company_admin_unassign_courses_request_courses_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner from a dict
block_iomad_company_admin_unassign_courses_request_courses_inner_from_dict = BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner.from_dict(block_iomad_company_admin_unassign_courses_request_courses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


