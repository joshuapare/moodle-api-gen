# CoreSearchGetResultsRequestFilters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**areaids** | Option<[**Vec<serde_json::Value>**](serde_json::Value.md)> |  | [optional]
**cat** | Option<**String**> | category to filter areas | [optional][default to ]
**contextids** | Option<[**Vec<serde_json::Value>**](serde_json::Value.md)> |  | [optional]
**courseids** | Option<[**Vec<serde_json::Value>**](serde_json::Value.md)> |  | [optional]
**groupids** | Option<[**Vec<serde_json::Value>**](serde_json::Value.md)> |  | [optional]
**mycoursesonly** | Option<**bool**> | only results from my courses | [optional][default to false]
**order** | Option<**String**> | how to order | [optional][default to ]
**timeend** | Option<**i32**> | docs modified before this date | [optional][default to 0]
**timestart** | Option<**i32**> | docs modified after this date | [optional][default to 0]
**title** | Option<**String**> | result title | [optional][default to null]
**userids** | Option<[**Vec<serde_json::Value>**](serde_json::Value.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


