# CoreQuestionGetRandomQuestionSummariesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **i32** | Category id to find random questions | [default to null]
**contextid** | **i32** | Context id that the questions will be rendered in (used for exporting) | [default to null]
**includesubcategories** | **bool** | Include the subcategories in the search | [default to null]
**limit** | Option<**i32**> | Maximum number of results to return | [optional][default to 0]
**offset** | Option<**i32**> | Number of items to skip from the begging of the result set | [optional][default to 0]
**tagids** | [**Vec<serde_json::Value>**](serde_json::Value.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


