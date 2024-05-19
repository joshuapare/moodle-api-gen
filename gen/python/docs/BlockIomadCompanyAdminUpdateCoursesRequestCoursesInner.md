# BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course ID | [optional] [default to 0]
**licensed** | **bool** | Course licensed | [optional] [default to False]
**notifyperiod** | **int** | Course warning email notify period | [optional] [default to 0]
**shared** | **int** | Course shared value | [optional] [default to 0]
**validlength** | **int** | Course training valid for in days | [optional] [default to 0]
**warncompletion** | **int** | Course days to warn if not completed in | [optional] [default to 0]
**warnexpire** | **int** | Course days to warn before training expires | [optional] [default to 0]

## Example

```python
from openapi_client.models.block_iomad_company_admin_update_courses_request_courses_inner import BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner from a JSON string
block_iomad_company_admin_update_courses_request_courses_inner_instance = BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner.to_json())

# convert the object into a dict
block_iomad_company_admin_update_courses_request_courses_inner_dict = block_iomad_company_admin_update_courses_request_courses_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner from a dict
block_iomad_company_admin_update_courses_request_courses_inner_from_dict = BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner.from_dict(block_iomad_company_admin_update_courses_request_courses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


