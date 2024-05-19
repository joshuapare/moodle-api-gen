# CoreCompetencyListTemplatesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**models::CoreCohortSearchCohortsRequestContext**](core_cohort_search_cohorts_request_context.md) |  | 
**includes** | Option<**String**> | What other contexts to fetch the templates from. (children, parents, self) | [optional][default to children]
**limit** | Option<**i32**> | Return this number of records at most. | [optional][default to 0]
**onlyvisible** | Option<**bool**> | If should list only visible templates | [optional][default to false]
**order** | Option<**String**> | Sort direction. Should be either ASC or DESC | [optional][default to ]
**skip** | Option<**i32**> | Skip this number of records before returning results | [optional][default to 0]
**sort** | Option<**String**> | Column to sort by. | [optional][default to ]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


