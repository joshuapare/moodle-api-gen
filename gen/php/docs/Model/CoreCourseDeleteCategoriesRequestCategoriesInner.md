# # CoreCourseDeleteCategoriesRequestCategoriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | category id to delete | [optional] [default to null]
**newparent** | **int** | the parent category to move the contents to, if specified | [optional] [default to null]
**recursive** | **bool** | 1: recursively delete all contents inside this                                 category, 0 (default): move contents to newparent or current parent category (except if parent is root) | [optional] [default to 0]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
