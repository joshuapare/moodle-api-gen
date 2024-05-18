# ModLessonGetPageData200ResponseAnswersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answer** | Option<**String**> | Possible answer text | [optional][default to null]
**answerfiles** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**answerformat** | Option<**i32**> | answer format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to null]
**flags** | Option<**i32**> | Used to store options for the answer | [optional][default to null]
**grade** | Option<**i32**> | The grade this answer is worth | [optional][default to null]
**id** | Option<**i32**> | The ID of this answer in the database | [optional][default to null]
**jumpto** | Option<**i32**> | Identifies where the user goes upon completing a page with this answer | [optional][default to null]
**response** | Option<**String**> | Response text for the answer | [optional][default to null]
**responsefiles** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**responseformat** | Option<**i32**> | response format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to null]
**score** | Option<**i32**> | The score this answer will give | [optional][default to null]
**timecreated** | Option<**i32**> | A timestamp of when the answer was created | [optional][default to null]
**timemodified** | Option<**i32**> | A timestamp of when the answer was modified | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


