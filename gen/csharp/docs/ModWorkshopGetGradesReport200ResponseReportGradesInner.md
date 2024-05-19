# MoodleClient.Model.ModWorkshopGetGradesReport200ResponseReportGradesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Gradinggrade** | **decimal** | Computed grade for the assessment. | [optional] [default to nullM]
**Reviewedby** | [**List&lt;ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner&gt;**](ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner.md) |  | [optional] 
**Reviewerof** | [**List&lt;ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner&gt;**](ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner.md) |  | [optional] 
**Submissiongrade** | **decimal** | Aggregated grade for the submission. | [optional] [default to nullM]
**Submissiongradeover** | **decimal** | Grade for the assessment overrided                                         by the teacher. | [optional] [default to nullM]
**Submissiongradeoverby** | **int** | The id of the user who overrided                                         the grade. | [optional] [default to null]
**Submissionid** | **int** | Submission id. | [optional] [default to null]
**Submissionmodified** | **int** | Timestamp submission was updated. | [optional] [default to null]
**Submissionpublished** | **int** | Whether is a submission published. | [optional] [default to null]
**Submissiontitle** | **string** | Submission title. | [optional] [default to "null"]
**Userid** | **int** | The id of the user being displayed in the report. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

