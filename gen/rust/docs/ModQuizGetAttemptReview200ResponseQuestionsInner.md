# ModQuizGetAttemptReview200ResponseQuestionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockedbyprevious** | Option<**bool**> | whether the question is blocked by the previous question | [optional]
**flagged** | Option<**bool**> | whether the question is flagged or not | [optional]
**hasautosavedstep** | Option<**bool**> | whether this question attempt has autosaved data | [optional]
**html** | Option<**String**> | the question rendered | [optional]
**lastactiontime** | Option<**i32**> | the timestamp of the most recent step in this question attempt | [optional]
**mark** | Option<**String**> | the mark awarded.                     It will be returned only if the user is allowed to see it. | [optional]
**maxmark** | Option<**f64**> | the maximum mark possible for this question attempt.                     It will be returned only if the user is allowed to see it. | [optional]
**number** | Option<**i32**> | DO NOT USE. Use questionnumber. Only retained for backwards compatibility. | [optional]
**page** | Option<**i32**> | page of the quiz this question appears on | [optional]
**questionnumber** | Option<**String**> | The question number to display for this question, e.g. \"7\", \"i\" or \"Custom-B)\". | [optional]
**responsefileareas** | Option<[**Vec<models::ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner>**](mod_quiz_get_attempt_review_200_response_questions_inner_responsefileareas_inner.md)> |  | [optional]
**sequencecheck** | Option<**i32**> | the number of real steps in this attempt | [optional]
**settings** | Option<**String**> | Question settings (JSON encoded). | [optional]
**slot** | Option<**i32**> | slot number | [optional]
**state** | Option<**String**> | the state where the question is in.                     It will not be returned if the user cannot see it due to the quiz display correctness settings. | [optional]
**status** | Option<**String**> | current formatted state of the question | [optional]
**r#type** | Option<**String**> | question type, i.e: multichoice | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


