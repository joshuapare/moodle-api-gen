# # CoreCompetencyListCompetencyFrameworksRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**\OpenAPI\Client\Model\CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  |
**includes** | **string** | What other contextes to fetch the frameworks from. (children, parents, self) | [optional] [default to 'children']
**limit** | **int** | Return this number of records at most. | [optional] [default to 0]
**onlyvisible** | **bool** | Only visible frameworks will be returned if visible true | [optional] [default to false]
**order** | **string** | Sort direction. Should be either ASC or DESC | [optional] [default to '']
**query** | **string** | A query string to filter the results | [optional] [default to '']
**skip** | **int** | Skip this number of records before returning results | [optional] [default to 0]
**sort** | **string** | Column to sort by. | [optional] [default to 'shortname']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
