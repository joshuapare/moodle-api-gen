# CoreCourseGetCategoriesRequestCriteriaInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | Option<**String**> | The category column to search, expected keys (value format) are:\"id\" (int) the category id,\"ids\" (string) category ids separated by commas,\"name\" (string) the category name,\"parent\" (int) the parent category id,\"idnumber\" (string) category idnumber - user must have 'moodle/category:manage' to search on idnumber,\"visible\" (int) whether the returned categories must be visible or hidden. If the key is not passed,                                              then the function return all categories that the user can see. - user must have 'moodle/category:manage' or 'moodle/category:viewhiddencategories' to search on visible,\"theme\" (string) only return the categories having this theme - user must have 'moodle/category:manage' to search on theme | [optional][default to null]
**value** | Option<**String**> | the value to match | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


