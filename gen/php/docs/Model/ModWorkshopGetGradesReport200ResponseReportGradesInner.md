# # ModWorkshopGetGradesReport200ResponseReportGradesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gradinggrade** | **float** | Computed grade for the assessment. | [optional] [default to null]
**reviewedby** | [**\OpenAPI\Client\Model\ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner[]**](ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner.md) |  | [optional]
**reviewerof** | [**\OpenAPI\Client\Model\ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner[]**](ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner.md) |  | [optional]
**submissiongrade** | **float** | Aggregated grade for the submission. | [optional] [default to null]
**submissiongradeover** | **float** | Grade for the assessment overrided                                         by the teacher. | [optional] [default to null]
**submissiongradeoverby** | **int** | The id of the user who overrided                                         the grade. | [optional] [default to null]
**submissionid** | **int** | Submission id. | [optional] [default to null]
**submissionmodified** | **int** | Timestamp submission was updated. | [optional] [default to null]
**submissionpublished** | **int** | Whether is a submission published. | [optional] [default to null]
**submissiontitle** | **string** | Submission title. | [optional] [default to 'null']
**userid** | **int** | The id of the user being displayed in the report. | [optional] [default to null]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
