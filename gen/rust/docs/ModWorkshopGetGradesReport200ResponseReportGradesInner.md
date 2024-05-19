# ModWorkshopGetGradesReport200ResponseReportGradesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gradinggrade** | Option<**f64**> | Computed grade for the assessment. | [optional][default to null]
**reviewedby** | Option<[**Vec<models::ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner>**](mod_workshop_get_grades_report_200_response_report_grades_inner_reviewedby_inner.md)> |  | [optional]
**reviewerof** | Option<[**Vec<models::ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner>**](mod_workshop_get_grades_report_200_response_report_grades_inner_reviewerof_inner.md)> |  | [optional]
**submissiongrade** | Option<**f64**> | Aggregated grade for the submission. | [optional][default to null]
**submissiongradeover** | Option<**f64**> | Grade for the assessment overrided                                         by the teacher. | [optional][default to null]
**submissiongradeoverby** | Option<**i32**> | The id of the user who overrided                                         the grade. | [optional][default to null]
**submissionid** | Option<**i32**> | Submission id. | [optional][default to null]
**submissionmodified** | Option<**i32**> | Timestamp submission was updated. | [optional][default to null]
**submissionpublished** | Option<**i32**> | Whether is a submission published. | [optional][default to null]
**submissiontitle** | Option<**String**> | Submission title. | [optional][default to null]
**userid** | Option<**i32**> | The id of the user being displayed in the report. | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


