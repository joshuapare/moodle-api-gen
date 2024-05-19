# # CoreCompetencyListTemplatesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**\OpenAPI\Client\Model\CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  |
**includes** | **string** | What other contexts to fetch the templates from. (children, parents, self) | [optional] [default to 'children']
**limit** | **int** | Return this number of records at most. | [optional] [default to 0]
**onlyvisible** | **bool** | If should list only visible templates | [optional] [default to false]
**order** | **string** | Sort direction. Should be either ASC or DESC | [optional] [default to '']
**skip** | **int** | Skip this number of records before returning results | [optional] [default to 0]
**sort** | **string** | Column to sort by. | [optional] [default to '']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
