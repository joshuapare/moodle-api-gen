# ModGlossaryGetEntriesToApproveRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | Option<**i32**> | Start returning records from here | [optional][default to 0]
**id** | **i32** | Glossary entry ID | 
**letter** | **String** | A letter, or either keywords: 'ALL' or 'SPECIAL'. | 
**limit** | Option<**i32**> | Number of records to return | [optional][default to 20]
**options** | Option<[**serde_json::Value**](.md)> |  | [optional]
**order** | Option<**String**> | Order by: 'CONCEPT', 'CREATION' or 'UPDATE' | [optional][default to CONCEPT]
**sort** | Option<**String**> | The direction of the order: 'ASC' or 'DESC' | [optional][default to ASC]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


