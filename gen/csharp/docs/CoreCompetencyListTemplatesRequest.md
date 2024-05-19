# MoodleClient.Model.CoreCompetencyListTemplatesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Context** | [**CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  | 
**Includes** | **string** | What other contexts to fetch the templates from. (children, parents, self) | [optional] [default to "children"]
**Limit** | **int** | Return this number of records at most. | [optional] [default to 0]
**Onlyvisible** | **bool** | If should list only visible templates | [optional] [default to false]
**Order** | **string** | Sort direction. Should be either ASC or DESC | [optional] [default to ""]
**Skip** | **int** | Skip this number of records before returning results | [optional] [default to 0]
**Sort** | **string** | Column to sort by. | [optional] [default to ""]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

