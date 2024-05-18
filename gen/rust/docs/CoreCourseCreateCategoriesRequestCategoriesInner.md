# CoreCourseCreateCategoriesRequestCategoriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | Option<**String**> | the new category description | [optional][default to null]
**descriptionformat** | Option<**i32**> | description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 1]
**idnumber** | Option<**String**> | the new category idnumber | [optional][default to null]
**name** | Option<**String**> | new category name | [optional][default to null]
**parent** | Option<**i32**> | the parent category id inside which the new category will be created                                          - set to 0 for a root category | [optional][default to 0]
**theme** | Option<**String**> | the new category theme. This option must be enabled on moodle | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


