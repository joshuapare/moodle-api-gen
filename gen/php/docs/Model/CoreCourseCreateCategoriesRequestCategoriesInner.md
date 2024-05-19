# # CoreCourseCreateCategoriesRequestCategoriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **string** | the new category description | [optional] [default to 'null']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**idnumber** | **string** | the new category idnumber | [optional] [default to 'null']
**name** | **string** | new category name | [optional] [default to 'null']
**parent** | **int** | the parent category id inside which the new category will be created                                          - set to 0 for a root category | [optional] [default to 0]
**theme** | **string** | the new category theme. This option must be enabled on moodle | [optional] [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
