# MoodleClient.Model.ModLessonGetPageData200ResponseAnswersInner
The page answers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Answer** | **string** | Possible answer text | [optional] [default to "null"]
**Answerfiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Answerformat** | **int** | answer format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Flags** | **int** | Used to store options for the answer | [optional] [default to null]
**Grade** | **int** | The grade this answer is worth | [optional] [default to null]
**Id** | **int** | The ID of this answer in the database | [optional] [default to null]
**Jumpto** | **int** | Identifies where the user goes upon completing a page with this answer | [optional] [default to null]
**Response** | **string** | Response text for the answer | [optional] [default to "null"]
**Responsefiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Responseformat** | **int** | response format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Score** | **int** | The score this answer will give | [optional] [default to null]
**Timecreated** | **int** | A timestamp of when the answer was created | [optional] [default to null]
**Timemodified** | **int** | A timestamp of when the answer was modified | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

