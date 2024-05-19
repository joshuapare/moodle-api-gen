# CoreCourseGetCategoriesRequestCriteriaInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** | The category column to search, expected keys (value format) are:\&quot;id\&quot; (int) the category id,\&quot;ids\&quot; (string) category ids separated by commas,\&quot;name\&quot; (string) the category name,\&quot;parent\&quot; (int) the parent category id,\&quot;idnumber\&quot; (string) category idnumber - user must have &#39;moodle/category:manage&#39; to search on idnumber,\&quot;visible\&quot; (int) whether the returned categories must be visible or hidden. If the key is not passed,                                              then the function return all categories that the user can see. - user must have &#39;moodle/category:manage&#39; or &#39;moodle/category:viewhiddencategories&#39; to search on visible,\&quot;theme\&quot; (string) only return the categories having this theme - user must have &#39;moodle/category:manage&#39; to search on theme | [optional] [default to 'null']
**value** | **str** | the value to match | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_course_get_categories_request_criteria_inner import CoreCourseGetCategoriesRequestCriteriaInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetCategoriesRequestCriteriaInner from a JSON string
core_course_get_categories_request_criteria_inner_instance = CoreCourseGetCategoriesRequestCriteriaInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetCategoriesRequestCriteriaInner.to_json())

# convert the object into a dict
core_course_get_categories_request_criteria_inner_dict = core_course_get_categories_request_criteria_inner_instance.to_dict()
# create an instance of CoreCourseGetCategoriesRequestCriteriaInner from a dict
core_course_get_categories_request_criteria_inner_from_dict = CoreCourseGetCategoriesRequestCriteriaInner.from_dict(core_course_get_categories_request_criteria_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


