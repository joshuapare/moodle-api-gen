# # CoreCourseGetCategoriesRequestCriteriaInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **string** | The category column to search, expected keys (value format) are:\&quot;id\&quot; (int) the category id,\&quot;ids\&quot; (string) category ids separated by commas,\&quot;name\&quot; (string) the category name,\&quot;parent\&quot; (int) the parent category id,\&quot;idnumber\&quot; (string) category idnumber - user must have &#39;moodle/category:manage&#39; to search on idnumber,\&quot;visible\&quot; (int) whether the returned categories must be visible or hidden. If the key is not passed,                                              then the function return all categories that the user can see. - user must have &#39;moodle/category:manage&#39; or &#39;moodle/category:viewhiddencategories&#39; to search on visible,\&quot;theme\&quot; (string) only return the categories having this theme - user must have &#39;moodle/category:manage&#39; to search on theme | [optional] [default to 'null']
**value** | **string** | the value to match | [optional] [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
