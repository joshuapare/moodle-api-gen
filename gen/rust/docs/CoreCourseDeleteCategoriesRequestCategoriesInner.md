# CoreCourseDeleteCategoriesRequestCategoriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**i32**> | category id to delete | [optional][default to null]
**newparent** | Option<**i32**> | the parent category to move the contents to, if specified | [optional][default to null]
**recursive** | Option<**bool**> | 1: recursively delete all contents inside this                                 category, 0 (default): move contents to newparent or current parent category (except if parent is root) | [optional][default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


