# MoodleClient.Model.CoreCompetencyListCompetencyFrameworksRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Context** | [**CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  | 
**Includes** | **string** | What other contextes to fetch the frameworks from. (children, parents, self) | [optional] [default to "children"]
**Limit** | **int** | Return this number of records at most. | [optional] [default to 0]
**Onlyvisible** | **bool** | Only visible frameworks will be returned if visible true | [optional] [default to false]
**Order** | **string** | Sort direction. Should be either ASC or DESC | [optional] [default to ""]
**Query** | **string** | A query string to filter the results | [optional] [default to ""]
**Skip** | **int** | Skip this number of records before returning results | [optional] [default to 0]
**Sort** | **string** | Column to sort by. | [optional] [default to "shortname"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

