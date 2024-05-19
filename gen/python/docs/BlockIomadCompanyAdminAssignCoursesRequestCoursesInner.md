# BlockIomadCompanyAdminAssignCoursesRequestCoursesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyid** | **int** | Course company ID | [optional] [default to 0]
**courseid** | **int** | Course ID | [optional] [default to 0]
**departmentid** | **int** | Course department ID | [optional] [default to 0]
**licensed** | **bool** | Is the course licensed | [optional] [default to False]
**owned** | **bool** | Does the company own the course | [optional] [default to False]

## Example

```python
from openapi_client.models.block_iomad_company_admin_assign_courses_request_courses_inner import BlockIomadCompanyAdminAssignCoursesRequestCoursesInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminAssignCoursesRequestCoursesInner from a JSON string
block_iomad_company_admin_assign_courses_request_courses_inner_instance = BlockIomadCompanyAdminAssignCoursesRequestCoursesInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminAssignCoursesRequestCoursesInner.to_json())

# convert the object into a dict
block_iomad_company_admin_assign_courses_request_courses_inner_dict = block_iomad_company_admin_assign_courses_request_courses_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminAssignCoursesRequestCoursesInner from a dict
block_iomad_company_admin_assign_courses_request_courses_inner_from_dict = BlockIomadCompanyAdminAssignCoursesRequestCoursesInner.from_dict(block_iomad_company_admin_assign_courses_request_courses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


