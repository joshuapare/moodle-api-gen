# # ModLessonGetPageData200ResponseAnswersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answer** | **string** | Possible answer text | [optional] [default to 'null']
**answerfiles** | [**\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional]
**answerformat** | **int** | answer format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**flags** | **int** | Used to store options for the answer | [optional] [default to null]
**grade** | **int** | The grade this answer is worth | [optional] [default to null]
**id** | **int** | The ID of this answer in the database | [optional] [default to null]
**jumpto** | **int** | Identifies where the user goes upon completing a page with this answer | [optional] [default to null]
**response** | **string** | Response text for the answer | [optional] [default to 'null']
**responsefiles** | [**\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional]
**responseformat** | **int** | response format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**score** | **int** | The score this answer will give | [optional] [default to null]
**timecreated** | **int** | A timestamp of when the answer was created | [optional] [default to null]
**timemodified** | **int** | A timestamp of when the answer was modified | [optional] [default to null]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
