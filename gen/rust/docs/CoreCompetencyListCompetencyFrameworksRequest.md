# CoreCompetencyListCompetencyFrameworksRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**models::CoreCohortSearchCohortsRequestContext**](core_cohort_search_cohorts_request_context.md) |  | 
**includes** | Option<**String**> | What other contextes to fetch the frameworks from. (children, parents, self) | [optional][default to children]
**limit** | Option<**i32**> | Return this number of records at most. | [optional][default to 0]
**onlyvisible** | Option<**bool**> | Only visible frameworks will be returned if visible true | [optional][default to false]
**order** | Option<**String**> | Sort direction. Should be either ASC or DESC | [optional][default to ]
**query** | Option<**String**> | A query string to filter the results | [optional][default to ]
**skip** | Option<**i32**> | Skip this number of records before returning results | [optional][default to 0]
**sort** | Option<**String**> | Column to sort by. | [optional][default to shortname]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


